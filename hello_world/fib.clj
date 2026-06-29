(ns fib.core) ; It's namespace.

(defn fib [n]    ; def fib(n)
  (if (<= n 1)   ;   if n <= 1: n
    a
    (loop [a 0 b 1 count (- n 1)] ; else: a, b := 0, 1
      (if (zero? count) ; if count == 0
        b ; return b
        (recur b (+ a b) (dec count)))))) ; else: call fib

(defn -main []
  (let [n 10]
    (println (str "Fibonacci of " n " is " (fib n)))))