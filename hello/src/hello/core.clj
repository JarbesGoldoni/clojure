(ns hello.core
  (:gen-class))
(defn say-hello [name]
  (println (str "Hello, " name "!")))


(defn -main []
  (say-hello "World"))
