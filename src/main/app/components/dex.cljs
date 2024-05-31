(ns app.components.dex
  (:require [helix.core :refer [defnc $]]
            [helix.hooks :as hooks]
            [helix.dom :as d]
            [app.components.opendex :refer [opendex]]
            [app.components.statchart :refer [statchart]]))

(defnc dex [{:keys [pokemon open?]}]
  (if open?
    (d/div {:class-name "relative h-full"} ($ opendex {:pokemon pokemon}))
  (d/img {:src "ClosedPokedex.svg"})))
