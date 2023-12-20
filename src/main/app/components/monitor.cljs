(ns app.components.monitor
  (:require [helix.core :refer [defnc $]]
            [helix.hooks :as hooks]
            [helix.dom :as d]))

(defnc monitor [{:keys [sprite]}]
  (d/div {:class-name "relative"}
   (d/img {:src "Pokedex.svg" :class-name "absolute"})
    (d/div {:class-name "absolute bg-opacity-50 bg-lime-500 border border-black w-[290px] mx-[82px] my-[250px] h-[233px] rounded-xl"}
      (d/img {:src sprite :class-name "max-w-full max-h-full"}))))
