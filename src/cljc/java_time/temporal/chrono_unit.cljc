(ns cljc.java-time.temporal.chrono-unit (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.temporal :refer [ChronoUnit]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time.temporal ChronoUnit])))
(def millis (. java.time.temporal.ChronoUnit -MILLIS))
(def minutes (. java.time.temporal.ChronoUnit -MINUTES))
(def micros (. java.time.temporal.ChronoUnit -MICROS))
(def half-days (. java.time.temporal.ChronoUnit -HALF_DAYS))
(def millennia (. java.time.temporal.ChronoUnit -MILLENNIA))
(def years (. java.time.temporal.ChronoUnit -YEARS))
(def decades (. java.time.temporal.ChronoUnit -DECADES))
(def days (. java.time.temporal.ChronoUnit -DAYS))
(def centuries (. java.time.temporal.ChronoUnit -CENTURIES))
(def weeks (. java.time.temporal.ChronoUnit -WEEKS))
(def hours (. java.time.temporal.ChronoUnit -HOURS))
(def eras (. java.time.temporal.ChronoUnit -ERAS))
(def seconds (. java.time.temporal.ChronoUnit -SECONDS))
(def months (. java.time.temporal.ChronoUnit -MONTHS))
(def nanos (. java.time.temporal.ChronoUnit -NANOS))
(def forever (. java.time.temporal.ChronoUnit -FOREVER))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (. java.time.temporal.ChronoUnit values)))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^java.time.temporal.ChronoUnit [^java.lang.String java-lang-String3106] (. java.time.temporal.ChronoUnit valueOf java-lang-String3106)) (^java.lang.Enum [^java.lang.Class java-lang-Class3107 ^java.lang.String java-lang-String3108] (. java.time.temporal.ChronoUnit valueOf java-lang-Class3107 java-lang-String3108)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^java.lang.Integer [^java.time.temporal.ChronoUnit this3109] (.ordinal this3109)))
(clojure.core/defn is-duration-estimated {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^java.lang.Boolean [^java.time.temporal.ChronoUnit this3110] (.isDurationEstimated this3110)))
(clojure.core/defn to-string {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^java.lang.String [^java.time.temporal.ChronoUnit this3111] (.toString this3111)))
(clojure.core/defn is-date-based {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^java.lang.Boolean [^java.time.temporal.ChronoUnit this3112] (.isDateBased this3112)))
(clojure.core/defn add-to {:arglists (quote (["java.time.temporal.ChronoUnit" "java.time.temporal.Temporal" "long"]))} (^java.time.temporal.Temporal [^java.time.temporal.ChronoUnit this3113 ^java.time.temporal.Temporal java-time-temporal-Temporal3114 ^long long3115] (.addTo this3113 java-time-temporal-Temporal3114 long3115)))
(clojure.core/defn name {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^java.lang.String [^java.time.temporal.ChronoUnit this3116] (.name this3116)))
(clojure.core/defn is-supported-by {:arglists (quote (["java.time.temporal.ChronoUnit" "java.time.temporal.Temporal"]))} (^java.lang.Boolean [^java.time.temporal.ChronoUnit this3117 ^java.time.temporal.Temporal java-time-temporal-Temporal3118] (.isSupportedBy this3117 java-time-temporal-Temporal3118)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^java.lang.Class [^java.time.temporal.ChronoUnit this3119] (jti/getter declaringClass this3119)))
(clojure.core/defn between {:arglists (quote (["java.time.temporal.ChronoUnit" "java.time.temporal.Temporal" "java.time.temporal.Temporal"]))} (^long [^java.time.temporal.ChronoUnit this3120 ^java.time.temporal.Temporal java-time-temporal-Temporal3121 ^java.time.temporal.Temporal java-time-temporal-Temporal3122] (.between this3120 java-time-temporal-Temporal3121 java-time-temporal-Temporal3122)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^java.lang.Integer [^java.time.temporal.ChronoUnit this3123] (.hashCode this3123)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.temporal.ChronoUnit" "java.lang.Object"] ["java.time.temporal.ChronoUnit" "java.lang.Enum"]))} (^java.lang.Integer [this3124 G__3125] #? (:cljs (.compareTo ^java.time.temporal.ChronoUnit this3124 G__3125) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__3125)) (clojure.core/let [G__3125 ^"java.lang.Object" G__3125] (.compareTo ^java.time.temporal.ChronoUnit this3124 G__3125)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Enum") G__3125)) (clojure.core/let [G__3125 ^"java.lang.Enum" G__3125] (.compareTo ^java.time.temporal.ChronoUnit this3124 G__3125)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn get-duration {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^java.time.Duration [^java.time.temporal.ChronoUnit this3126] (jti/getter duration this3126)))
(clojure.core/defn equals {:arglists (quote (["java.time.temporal.ChronoUnit" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.temporal.ChronoUnit this3127 ^java.lang.Object java-lang-Object3128] (.equals this3127 java-lang-Object3128)))
(clojure.core/defn is-time-based {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^java.lang.Boolean [^java.time.temporal.ChronoUnit this3129] (.isTimeBased this3129)))
