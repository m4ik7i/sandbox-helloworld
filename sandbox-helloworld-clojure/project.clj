(defproject sandbox-helloworld-clojure "0.1.0"
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot sandbox-helloworld-clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
