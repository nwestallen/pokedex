(ns app.components.monitor
  (:require [helix.core :refer [defnc $]]
            [helix.hooks :as hooks]
            [helix.dom :as d]))

(defnc monitor [{:keys [sprite open?]}]
  (if open?
  (d/div {:class-name "relative h-full"}
   (d/img {:src "Open Pokedex.svg" :class-name "absolute max-w-full max-h-full"})
    (d/div {:class-name "absolute bg-opacity-0 bg-lime-500 w-[27%] h-[32%] mt-[250px] ml-[10%] rounded-xl"}
      (d/img {:src sprite :class-name "max-w-full max-h-full"})))
  (d/img {:src "Closed Pokedex.svg"})))
