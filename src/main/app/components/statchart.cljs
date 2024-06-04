(ns app.components.statchart
  (:require [helix.core :refer [defnc $]]
            [helix.hooks :as hooks]
            [helix.dom :as d]
            ["react-plotly.js$default" :as Plot]))

(defnc statchart [{:keys [stats]}]
  (d/div
    ($ Plot {:data #js[
                       #js{:type "bar"
                           :x (into-array stats),
                           :y #js["Speed    ", "Sp. Def    ", "Sp. Attk    ", "Defense    ", "Attack    ", "HP    "]
                           :marker #js{
                           :color #js["SteelBlue", "YellowGreen", "Violet", "Gold", "Tomato", "DarkTurquoise"]}
                           :width "1/2"
                           :orientation "h"}]
             :layout #js{:width 640 :height 480 :title "Base Stats" :barcornerradius "9" :xaxis #js{:range #js[0, 150]}}
             :config #js{:staticPlot true}})))
