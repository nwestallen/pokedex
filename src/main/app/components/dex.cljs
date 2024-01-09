(ns app.components.dex
  (:require [helix.core :refer [defnc $]]
            [helix.hooks :as hooks]
            [helix.dom :as d]
            [app.components.opendex :refer [opendex]]))

(defnc dex [{:keys [sprite open?]}]
  (if open?
  (d/div {:class-name "relative h-full"} ($ opendex {:sprite sprite}))
  (d/img {:src "ClosedPokedex.svg"})))
