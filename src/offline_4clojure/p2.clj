;; Simple Math - Elementary
;; <p>If you are not familiar with 
;; <a href='http://en.wikipedia.org/wiki/Polish_notation'>polish notation</a>, 
;; simple arithmetic might seem confusing.</p><p><strong>Note:</strong> 
;; Enter only enough to fill in the blank (in this case, a single number) - 
;; do not retype the whole problem.</p>
;; tags - 
;; restricted - 
(ns offline-4clojure.p2
  (:use clojure.test))

(def mathExpResult 4
;; your solution here
)

(testing "Elementary math expretion"
  (is (= (- 10 (* 2 3)) mathExpResult)))
