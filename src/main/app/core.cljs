(ns app.core
  (:require [helix.core :refer [defnc $]]
            [helix.hooks :as hooks]
            [helix.dom :as d]
            ["react-dom/client" :as rdom]
            [app.components.monitor :refer [monitor]]))

(defnc app []
  {:helix/features {:fast-refresh true}}
  (let [[state set-state] (hooks/use-state {:name "Helix User"})]
    (d/div
     (d/h1 {:class-name "text-4xl font-bold p-5 bg-green-500"} "Pokedex")
      (d/div {:class-name "p-5"}
        ($ monitor {:sprite "dragonite.png"})))))

;; start your app with your favorite React renderer
(defn ^:export init []
(let [root (rdom/createRoot (js/document.getElementById "root"))]
(.render root ($ app))))
