(ns app.core
  (:require [helix.core :refer [defnc $]]
            [helix.hooks :as hooks]
            [helix.dom :as d]
            ["react-dom/client" :as rdom]
            [app.components.dex :refer [dex]]
            [app.components.statchart :refer [statchart]]))

(def baseurl "https://pokeapi.co/api/v2/pokemon/")

(defnc app []
  {:helix/features {:fast-refresh true}}

  (let [[open? set-open?] (hooks/use-state false)
        [pokemon set-pokemon] (hooks/use-state {:name "none"})
        [query set-query] (hooks/use-state "")]

    (d/div {:class-name "h-screen"}
     (d/h1 {:class-name "text-4xl font-bold p-5 bg-green-600"} "Pokedex")
      (d/div {:class-name "relative p-5 h-3/4 flex"}
        ($ dex {:pokemon pokemon :open? open?})
        ($ statchart))
      (d/div
        (d/button {:class-name "bg-blue-500 rounded-xl p-2 m-3"
                        :on-click #(set-open? (not open?))}"Open/Close")
        )
      (d/form {:on-submit (fn [e] (do
                                   (.preventDefault e)
                                   (-> (js/fetch (str baseurl query))
                                       (.then #(.json %))
                                       (.then #(js->clj % :keywordize-keys true))
                                       (.then #(set-pokemon %))
                                       (.catch #(js/console.log "pokemon not found")))))}
        (d/input {:type "text" :class-name "border-2 border-slate-950 mx-2" :value query :on-change (fn [e] (set-query e.target.value))})
        (d/button {:class-name "bg-purple-600 text-white rounded-xl p-2" :type "submit"} "Search"))
      (d/p (str "Current Pokemon: " (:name pokemon))))))

;; start your app with your favorite React renderer
(defn ^:export init []
(let [root (rdom/createRoot (js/document.getElementById "root"))]
(.render root ($ app))))
