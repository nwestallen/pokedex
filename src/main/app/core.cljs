(ns app.core
  (:require [helix.core :refer [defnc $]]
            [helix.hooks :as hooks]
            [helix.dom :as d]
            ["react-dom/client" :as rdom]
            [app.components.monitor :refer [monitor]]))

(defnc app []
  {:helix/features {:fast-refresh true}}
  (let [[state set-state] (hooks/use-state {:open? false :sprite "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/373.png"})]
    (d/div {:class-name "h-screen"}
     (d/h1 {:class-name "text-4xl font-bold p-5 bg-green-500"} "Pokedex")
      (d/div {:class-name "relative p-5 h-3/4"}
        ($ monitor {:sprite (:sprite state) :open? (:open? state)}))
      (d/div (d/button {:class-name "bg-blue-500 rounded-xl p-2 m-3"
                        :on-click #(set-state assoc :open? (not (:open? state)))}"Open/Close")
        (d/button {:class-name "bg-blue-500 rounded-xl p-2 m-3"
                   :on-click #(set-state assoc :sprite "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/177.png")} "Change Sprite"))
      )))


;; start your app with your favorite React renderer
(defn ^:export init []
(let [root (rdom/createRoot (js/document.getElementById "root"))]
(.render root ($ app))))
