(define (println x)
    (for-each display `(,x "\n")))

(println "Hello, world!")
