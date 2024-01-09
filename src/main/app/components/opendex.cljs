(ns app.components.opendex
  (:require [helix.core :refer [defnc $]]
            [helix.hooks :as hooks]
            [helix.dom :as d]))
(defnc opendex [{:keys [sprite]}]
  (d/div {:class-name "relative border-0 border-black h-[707px]"}
(d/svg {:width "964", :height "707", :viewBox "0 0 964 707", :fill "none", :xmlns "http://www.w3.org/2000/svg" :class-name "absolute z-10"}
 (d/rect {:x "1", :y "1", :width "514", :height "705", :rx "17", :fill "#F13030", :stroke "black", :stroke-width "2"})
 (d/path {:d "M54 190.5H399C403.694 190.5 407.5 194.306 407.5 199V530C407.5 534.694 403.694 538.5 399 538.5H226.5H80.6806C77.6863 538.5 74.9129 536.924 73.3796 534.353L46.699 489.598C45.9185 488.289 45.5 486.731 45.5 485.19V484.423V483.657V482.894V482.134V481.375V480.619V479.866V479.114V478.365V477.618V476.874V476.132V475.392V474.654V473.919V473.185V472.454V471.726V470.999V470.275V469.552V468.833V468.115V467.399V466.686V465.974V465.265V464.558V463.853V463.15V462.449V461.751V461.054V460.36V459.667V458.977V458.289V457.602V456.918V456.236V455.556V454.877V454.201V453.527V452.855V452.184V451.516V450.85V450.185V449.523V448.862V448.203V447.546V446.892V446.239V445.587V444.938V444.291V443.645V443.001V442.359V441.719V441.081V440.444V439.81V439.177V438.546V437.916V437.289V436.663V436.039V435.416V434.796V434.177V433.559V432.944V432.33V431.717V431.107V430.498V429.891V429.285V428.681V428.079V427.478V426.879V426.281V425.685V425.091V424.498V423.906V423.317V422.728V422.142V421.557V420.973V420.391V419.81V419.231V418.653V418.077V417.502V416.929V416.357V415.786V415.217V414.65V414.083V413.518V412.955V412.393V411.832V411.273V410.715V410.158V409.602V409.048V408.496V407.944V407.394V406.845V406.297V405.751V405.206V404.662V404.119V403.578V403.038V402.499V401.961V401.425V400.889V400.355V399.822V399.29V398.759V398.23V397.701V397.174V396.647V396.122V395.598V395.075V394.553V394.032V393.513V392.994V392.476V391.959V391.444V390.929V390.415V389.903V389.391V388.88V388.371V387.862V387.354V386.847V386.341V385.836V385.332V384.828V384.326V383.825V383.324V382.824V382.325V381.827V381.33V380.833V380.338V379.843V379.349V378.856V378.364V377.872V377.381V376.891V376.402V375.913V375.425V374.938V374.451V373.965V373.48V372.996V372.512V372.029V371.547V371.065V370.584V370.103V369.623V369.144V368.665V368.187V367.71V367.233V366.756V366.28V365.805V365.33V364.856V364.382V363.909V363.437V362.964V362.493V362.021V361.55V361.08V360.61V360.141V359.672V359.203V358.735V358.267V357.8V357.332V356.866V356.399V355.933V355.468V355.003V354.538V354.073V353.609V353.145V352.681V352.217V351.754V351.291V350.828V350.366V349.904V349.442V348.98V348.519V348.057V347.596V347.135V346.674V346.214V345.753V345.293V344.832V344.372V343.912V343.452V342.993V342.533V342.073V341.614V341.154V340.695V340.236V339.776V339.317V338.858V338.398V337.939V337.48V337.02V336.561V336.102V335.642V335.183V334.723V334.263V333.804V333.344V332.884V332.424V331.964V331.503V331.043V330.582V330.122V329.661V329.2V328.738V328.277V327.815V327.353V326.891V326.429V325.967V325.504V325.041V324.577V324.114V323.65V323.186V322.721V322.256V321.791V321.326V320.86V320.394V319.927V319.461V318.993V318.526V318.058V317.589V317.121V316.651V316.182V315.712V315.241V314.77V314.298V313.827V313.354V312.881V312.408V311.934V311.459V310.984V310.509V310.033V309.556V309.079V308.601V308.123V307.644V307.164V306.684V306.203V305.722V305.24V304.757V304.274V303.789V303.305V302.819V302.333V301.846V301.359V300.871V300.382V299.892V299.402V298.91V298.418V297.926V297.432V296.938V296.443V295.947V295.45V294.952V294.454V293.954V293.454V292.953V292.451V291.949V291.445V290.94V290.435V289.929V289.421V288.913V288.404V287.893V287.382V286.87V286.357V285.843V285.328V284.812V284.295V283.776V283.257V282.737V282.216V281.693V281.17V280.645V280.119V279.593V279.065V278.536V278.006V277.474V276.942V276.408V275.874V275.338V274.801V274.262V273.723V273.182V272.64V272.097V271.553V271.007V270.46V269.912V269.362V268.812V268.26V267.706V267.152V266.596V266.038V265.48V264.92V264.358V263.796V263.231V262.666V262.099V261.531V260.961V260.39V259.817V259.243V258.668V258.091V257.513V256.933V256.351V255.769V255.184V254.598V254.011V253.422V252.832V252.24V251.646V251.051V250.454V249.856V249.256V248.655V248.051V247.447V246.84V246.232V245.623V245.011V244.398V243.784V243.167V242.549V241.93V241.308V240.685V240.06V239.433V238.805V238.175V237.543V236.909V236.274V235.636V234.997V234.356V233.714V233.069V232.423V231.774V231.124V230.472V229.818V229.163V228.505V227.845V227.184V226.521V225.855V225.188V224.519V223.848V223.174V222.499V221.822V221.143V220.462V219.779V219.094V218.407V217.717V217.026V216.333V215.637V214.94V214.24V213.539V212.835V212.129V211.421V210.711V209.998V209.284V208.567V207.849V207.128V206.405V205.679V204.952V204.222V203.49V202.756V202.019V201.281V200.54V199.796V199.051C45.5 194.347 49.3155 190.5 54 190.5Z", :fill "#D9D9D9", :stroke "#393434", :stroke-width "3"})
 (d/circle {:cx "98.5", :cy "508.5", :r "11.5", :fill "#FF0000", :stroke "black", :stroke-width "2"})
 (d/circle {:cx "214.5", :cy "223.5", :r "6.5", :fill "#FF0000", :stroke "black", :stroke-width "2"})
 (d/circle {:cx "254.5", :cy "223.5", :r "6.5", :fill "#FF0000", :stroke "black", :stroke-width "2"})
 (d/rect {:id "screen" :x "82.5562", :y "250.865", :width "288.701", :height "230.894", :rx "10", :class-name "fill-[#393434]" })
 (d/rect {:x "314", :y "489", :width "56", :height "6.20455", :rx "3.10227", :fill "#393434"})
 (d/rect {:x "314", :y "499.636", :width "56", :height "6.20455", :rx "3.10227", :fill "#393434"})
 (d/rect {:x "314", :y "511.159", :width "56", :height "6.20455", :rx "3.10227", :fill "#393434"})
 (d/rect {:x "314", :y "521.795", :width "56", :height "6.20455", :rx "3.10227", :fill "#393434"})
 (d/path {:d "M120 74C120 97.7376 100.535 117 76.5 117C52.4649 117 33 97.7376 33 74C33 50.2624 52.4649 31 76.5 31C100.535 31 120 50.2624 120 74Z", :fill "#D9D9D9", :stroke "#393434", :stroke-width "2"})
 (d/circle {:cx "76", :cy "74", :r "34", :fill "#0D9CEC", :stroke "#393434", :stroke-width "2"})
 (d/circle {:cx "153.5", :cy "37.5", :r "6.5", :fill "#FF0000", :stroke "black", :stroke-width "2"})
 (d/circle {:cx "201.5", :cy "37.5", :r "6.5", :fill "#24922F", :stroke "black", :stroke-width "2"})
 (d/circle {:cx "177.5", :cy "37.5", :r "6.5", :fill "#F6E65B", :stroke "black", :stroke-width "2"})
 (d/rect {:x "114", :y "587", :width "160", :height "70", :rx "6", :fill "#64B876", :stroke "#393434", :stroke-width "2"})
 (d/path {:d "M2 131H198.203C201.671 131 205.065 129.998 207.977 128.115L291.838 73.8851C294.75 72.0018 298.144 71 301.612 71H514", :stroke "black", :stroke-width "2"})
 (d/rect {:x "207.5", :y "557.5", :width "77", :height "6", :rx "3", :fill "#393434", :stroke "black"})
 (d/rect {:x "98.5", :y "557.5", :width "78", :height "6", :rx "3", :fill "#D5002C", :stroke "black"})
 (d/path {:d "M449 93V689C449 698.389 456.611 706 466 706H945.984C955.379 706 962.992 698.38 962.984 688.985L962.516 154.05C962.508 144.667 954.899 137.065 945.516 137.065H768.333C764.659 137.065 761.064 136 757.983 133.998L672.928 78.744C670.171 76.9532 666.954 76 663.667 76H466C456.611 76 449 83.6112 449 93Z", :fill "#F13030", :stroke "black", :stroke-width "2"})
 (d/rect {:x "619.937", :y "327.12", :width "71.981", :height "64.1478", :fill "#0D9CEC", :stroke "#322D2D", :stroke-width "3"})
 (d/rect {:x "691.51", :y "327.12", :width "71.981", :height "64.1478", :fill "#0D9CEC", :stroke "#322D2D", :stroke-width "3"})
 (d/rect {:x "761.946", :y "327.12", :width "71.981", :height "64.1478", :fill "#0D9CEC", :stroke "#322D2D", :stroke-width "3"})
 (d/path {:d "M833.519 327.12H902C903.933 327.12 905.5 328.687 905.5 330.62V391.268H833.519V327.12Z", :fill "#0D9CEC", :stroke "#322D2D", :stroke-width "3"})
 (d/path {:d "M553 327.12H621.481V391.268H549.5V330.62C549.5 328.687 551.067 327.12 553 327.12Z", :fill "#0D9CEC", :stroke "#322D2D", :stroke-width "3"})
 (d/rect {:x "619.937", :y "387.77", :width "71.981", :height "64.1478", :fill "#0D9CEC", :stroke "#322D2D", :stroke-width "3"})
 (d/rect {:x "691.51", :y "387.77", :width "71.981", :height "64.1478", :fill "#0D9CEC", :stroke "#322D2D", :stroke-width "3"})
 (d/rect {:x "761.946", :y "387.77", :width "71.981", :height "64.1478", :fill "#0D9CEC", :stroke "#322D2D", :stroke-width "3"})
 (d/path {:d "M833.519 387.77H905.5V448.418C905.5 450.351 903.933 451.918 902 451.918H833.519V387.77Z", :fill "#0D9CEC", :stroke "#322D2D", :stroke-width "3"})
 (d/path {:d "M549.5 387.77H621.481V451.918H553C551.067 451.918 549.5 450.351 549.5 448.418V387.77Z", :fill "#0D9CEC", :stroke "#322D2D", :stroke-width "3"})
 (d/rect {:x "847.5", :y "487.125", :width "68", :height "6.04396", :rx "3.02198", :fill "#393434", :stroke "black"})
 (d/mask {:id "path-32-inside-1_912_2", :fill "white"}
  (d/path {:d "M516 81C516 75.4772 511.523 71 506 71H458C452.477 71 448 75.4772 448 81V697C448 702.523 452.477 707 458 707H506C511.523 707 516 702.523 516 697V81Z"}))
 (d/path {:d "M516 81C516 75.4772 511.523 71 506 71H458C452.477 71 448 75.4772 448 81V697C448 702.523 452.477 707 458 707H506C511.523 707 516 702.523 516 697V81Z", :fill "#F13030"})
 (d/path {:d "M518 81C518 74.3726 512.627 69 506 69H457.5C450.873 69 445.5 74.3726 445.5 81H450.5C450.5 76.5817 453.858 73 458 73H506C510.418 73 514 76.5817 514 81H518ZM445.5 697C445.5 703.627 450.873 709 457.5 709H506C512.627 709 518 703.627 518 697H514C514 701.418 510.418 705 506 705H458C453.858 705 450.5 701.418 450.5 697H445.5ZM506 709C512.627 709 518 703.627 518 697V81C518 74.3726 512.627 69 506 69V73C510.418 73 514 76.5817 514 81V697C514 701.418 510.418 705 506 705V709ZM457.5 69C450.873 69 445.5 74.3726 445.5 81V697C445.5 703.627 450.873 709 457.5 709L458 705C453.858 705 450.5 701.418 450.5 697V81C450.5 76.5817 453.858 73 458 73L457.5 69Z", :fill "black", :mask "url(#path-32-inside-1_912_2)"})
 (d/path {:d "M516 150.374H449.5", :stroke "black", :stroke-width "3"})
 (d/path {:d "M516 637.673H449.5", :stroke "black", :stroke-width "3"})
 (d/rect {:x "548.5", :y "185.241", :width "358", :height "113.716", :rx "4.5", :fill "#322D2D", :stroke "black"})
 (d/rect {:x "559.5", :y "612.91", :width "167", :height "56.3579", :rx "4.5", :fill "#322D2D", :stroke "black"})
 (d/rect {:x "752.5", :y "612.91", :width "167", :height "56.3579", :rx "4.5", :fill "#322D2D", :stroke "black"})
 (d/rect {:x "767.5", :y "487.125", :width "68", :height "6.04396", :rx "3.02198", :fill "#393434", :stroke "black"})
 (d/path {:d "M909 555.052C909 566.732 899.592 576.19 888 576.19C876.408 576.19 867 566.732 867 555.052C867 543.372 876.408 533.914 888 533.914C899.592 533.914 909 543.372 909 555.052Z", :fill "#F6E65B", :stroke "black", :stroke-width "2"})
 (d/path {:d "M618.5 510.263H678C679.933 510.263 681.5 511.83 681.5 513.763V566.152C681.5 568.085 679.933 569.652 678 569.652H618.5V510.263Z", :fill "#D9D9D9", :stroke "#322D2D", :stroke-width "3"})
 (d/path {:d "M562 510.263H621.5V569.652H562C560.067 569.652 558.5 568.085 558.5 566.152V513.763C558.5 511.83 560.067 510.263 562 510.263Z", :fill "#D9D9D9", :stroke "#322D2D", :stroke-width "3"})
 (d/mask {:id "path-43-outside-2_912_2", :maskUnits "userSpaceOnUse", :x "307", :y "573", :width "99", :height "99", :fill "black"}
  (d/rect {:fill "white", :x "307", :y "573", :width "99", :height "99"})
  (d/path {:fill-rule "evenodd", :clip-rule "evenodd", :d "M351.5 574C346.529 574 342.5 578.029 342.5 583V608.5H317C312.029 608.5 308 612.529 308 617.5V627.5C308 632.471 312.029 636.5 317 636.5H342.5V662C342.5 666.971 346.529 671 351.5 671H361.5C366.471 671 370.5 666.971 370.5 662V636.5H396C400.971 636.5 405 632.471 405 627.5V617.5C405 612.529 400.971 608.5 396 608.5H370.5V583C370.5 578.029 366.471 574 361.5 574H351.5Z"}))
 (d/path {:fill-rule "evenodd", :clip-rule "evenodd", :d "M351.5 574C346.529 574 342.5 578.029 342.5 583V608.5H317C312.029 608.5 308 612.529 308 617.5V627.5C308 632.471 312.029 636.5 317 636.5H342.5V662C342.5 666.971 346.529 671 351.5 671H361.5C366.471 671 370.5 666.971 370.5 662V636.5H396C400.971 636.5 405 632.471 405 627.5V617.5C405 612.529 400.971 608.5 396 608.5H370.5V583C370.5 578.029 366.471 574 361.5 574H351.5Z", :fill "#393434"})
 (d/path {:d "M342.5 608.5V609.5H343.5V608.5H342.5ZM342.5 636.5H343.5V635.5H342.5V636.5ZM370.5 636.5V635.5H369.5V636.5H370.5ZM370.5 608.5H369.5V609.5H370.5V608.5ZM343.5 583C343.5 578.582 347.082 575 351.5 575V573C345.977 573 341.5 577.477 341.5 583H343.5ZM343.5 608.5V583H341.5V608.5H343.5ZM317 609.5H342.5V607.5H317V609.5ZM309 617.5C309 613.082 312.582 609.5 317 609.5V607.5C311.477 607.5 307 611.977 307 617.5H309ZM309 627.5V617.5H307V627.5H309ZM317 635.5C312.582 635.5 309 631.918 309 627.5H307C307 633.023 311.477 637.5 317 637.5V635.5ZM342.5 635.5H317V637.5H342.5V635.5ZM343.5 662V636.5H341.5V662H343.5ZM351.5 670C347.082 670 343.5 666.418 343.5 662H341.5C341.5 667.523 345.977 672 351.5 672V670ZM361.5 670H351.5V672H361.5V670ZM369.5 662C369.5 666.418 365.918 670 361.5 670V672C367.023 672 371.5 667.523 371.5 662H369.5ZM369.5 636.5V662H371.5V636.5H369.5ZM396 635.5H370.5V637.5H396V635.5ZM404 627.5C404 631.918 400.418 635.5 396 635.5V637.5C401.523 637.5 406 633.023 406 627.5H404ZM404 617.5V627.5H406V617.5H404ZM396 609.5C400.418 609.5 404 613.082 404 617.5H406C406 611.977 401.523 607.5 396 607.5V609.5ZM370.5 609.5H396V607.5H370.5V609.5ZM369.5 583V608.5H371.5V583H369.5ZM361.5 575C365.918 575 369.5 578.582 369.5 583H371.5C371.5 577.477 367.023 573 361.5 573V575ZM351.5 575H361.5V573H351.5V575Z", :fill "black", :mask "url(#path-43-outside-2_912_2)"})
 (d/path {:d "M314 624.732C312.667 623.962 312.667 622.038 314 621.268L326 614.34C327.333 613.57 329 614.532 329 616.072V629.928C329 631.468 327.333 632.43 326 631.66L314 624.732Z", :fill "#514B4B"})
 (d/path {:d "M399 624.732C400.333 623.962 400.333 622.038 399 621.268L387 614.34C385.667 613.57 384 614.532 384 616.072V629.928C384 631.468 385.667 632.43 387 631.66L399 624.732Z", :fill "#514B4B"})
 (d/path {:d "M354.268 581C355.038 579.667 356.962 579.667 357.732 581L364.66 593C365.43 594.333 364.468 596 362.928 596H349.072C347.532 596 346.57 594.333 347.34 593L354.268 581Z", :fill "#514B4B"})
  (d/path {:d "M354.268 665C355.038 666.333 356.962 666.333 357.732 665L364.66 653C365.43 651.667 364.468 650 362.928 650H349.072C347.532 650 346.57 651.667 347.34 653L354.268 665Z", :fill "#514B4B"})
   )
    (d/div {:class-name "border-0 border-amber-300 w-[270px] h-[220px] bg-contain bg-no-repeat absolute z-20 mx-[85px] my-[255px]"}
      (d/img {:src sprite :class-name "w-[100%] h-[100%] object-contain"})))
  )
