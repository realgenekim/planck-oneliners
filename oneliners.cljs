; Inspired by Ruby One-Liners, by Dave Thomas
;     http://reference.jumpingmonkey.org/programming_languages/ruby/ruby-one-liners.html
;
; I chose a bunch of examples from the Ruby One Liners page,
; and had fun "porting" them to Clojure to see what they looked like.
;
; on Mac, run "brew install planck"
; then "planck oneliners.cljs"

; this pulls in a minimal set of functions to get going
(ns oneliners.core
  (:require [clojure.string :as string]
            [planck.core :refer [line-seq slurp]]
            [goog.string.format]))

; equivalent to ruby readlines/split
(def lines (string/split-lines (slurp "input.txt")))

; double space
;   ruby -pe 'puts' < file.txt
(println "=== double space")
(doseq [l lines]
  (println l "\n"))

; number each line of a file (left justified)
;   ruby -ne 'printf("-%6s%s", $., $_)' < file.txt
(println "=== number each line (v1)")
; we're zipping two arrayws togetehr using (map)
(doseq [v (map vector (iterate inc 1) lines)]
  (println (goog.string.format "%02d %s" (first v) (second v))))

; or here's simpler version w/o any fancy formatting
(println "=== number each line (v2)")
(doseq [v (map vector (iterate inc 1) lines)]
  (println (first v) (second v)))

; count lines
;    ruby -ne 'END {puts $.}' < file.txt
(println "=== count lines")
(println (count lines))

; reverse lines
;    ruby -ne 'BEGIN{@arr=Array.new}; @arr.push $_; END{puts @arr.reverse}' < file.txt
(println "=== reverse lines")
(doseq [l (reverse lines)]
  (println l))


; reverse each character on the line (emulates 'rev'))
;    ruby -ne 'puts $_.chomp.reverse' < file.txt
(println "=== reverse characters on each line")
(doseq [l lines]
  (println (string/reverse l)))