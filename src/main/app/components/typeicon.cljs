(ns app.components.typeicon
  (:require [helix.core :refer [defnc $ <>]]
            [helix.hooks :as hooks]
            [helix.dom :as d]))

(def typecolors {
                 :nomral "#A8A77A",
                 :fire "#EE8130",
                 :water "#6390F0",
                 :electric "#F7D02C",
                 :grass "#7AC74C",
                 :ice "#96D9D6",
                 :fighting "#C22E28",
                 :poison "#A33EA1",
                 :ground "#E2BF65",
                 :flying "#A98FF3",
                 :psychic "#F95587",
                 :bug "#A6B91A",
                 :rock "#B6A136",
                 :ghost "#735797",
                 :dragon "#6F35FC",
                 :dark "#705746",
                 :steel "#B7B7CE",
                 :fairy "#D685AD"
                 })

(defnc typeicon [{:keys [type]}]
  (<>
  (d/button {:class-name (str "text-white font-bold pointer-events-none h-8 w-24 m-2 rounded-xl bg-[" (type typecolors) "]")} (clojure.string/capitalize (name type)))
    (d/button {:class-name "bg-[#A8A77A]"})
    (d/button {:class-name "bg-[#EE8130]"})
    (d/button {:class-name "bg-[#6390F0]"})
    (d/button {:class-name "bg-[#F7D02C]"})
    (d/button {:class-name "bg-[#7AC74C]"})
    (d/button {:class-name "bg-[#96D9D6]"})
    (d/button {:class-name "bg-[#C22E28]"})
    (d/button {:class-name "bg-[#A33EA1]"})
    (d/button {:class-name "bg-[#E2BF65]"})
    (d/button {:class-name "bg-[#A98FF3]"})
    (d/button {:class-name "bg-[#F95587]"})
    (d/button {:class-name "bg-[#A6B91A]"})
    (d/button {:class-name "bg-[#B6A136]"})
    (d/button {:class-name "bg-[#735797]"})
    (d/button {:class-name "bg-[#6F35FC]"})
    (d/button {:class-name "bg-[#705746]"})
    (d/button {:class-name "bg-[#B7B7CE]"})
    (d/button {:class-name "bg-[#D685AD]"})
  ))
