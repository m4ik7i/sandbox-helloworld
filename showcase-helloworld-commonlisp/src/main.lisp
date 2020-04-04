(defun println (x)
    (progn (princ x) (princ #\newline)))

(println "Hello, world!")
