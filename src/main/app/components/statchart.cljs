(ns app.components.statchart
  (:require [helix.core :refer [defnc $]]
            [helix.hooks :as hooks]
            [helix.dom :as d]
            ["react-plotly.js$default" :as Plot]))

(defnc statchart []
  (d/div
    ($ Plot {:data #js[
                       #js{:type "bar" :x #js[2, 5, 3], :y #js["HP", "Att", "Def"] :orientation "h"}]
             :layout #js{:width 640 :height 480 :title "Stats"}})))
