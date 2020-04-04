(defproject hello_world "0.1.0"
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot hello_world.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
