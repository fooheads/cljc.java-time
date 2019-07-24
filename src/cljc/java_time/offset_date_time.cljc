(ns cljc.java-time.offset-date-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [OffsetDateTime]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time OffsetDateTime])))
(def min (. java.time.OffsetDateTime -MIN))
(def max (. java.time.OffsetDateTime -MAX))
(clojure.core/defn minus-minutes {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2461 ^long long2462] (.minusMinutes this2461 long2462)))
(clojure.core/defn truncated-to {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalUnit"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2463 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit2464] (.truncatedTo this2463 java-time-temporal-TemporalUnit2464)))
(clojure.core/defn minus-weeks {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2465 ^long long2466] (.minusWeeks this2465 long2466)))
(clojure.core/defn to-instant {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.Instant [^java.time.OffsetDateTime this2467] (.toInstant this2467)))
(clojure.core/defn plus-weeks {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2468 ^long long2469] (.plusWeeks this2468 long2469)))
(clojure.core/defn range {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.OffsetDateTime this2470 ^java.time.temporal.TemporalField java-time-temporal-TemporalField2471] (.range this2470 java-time-temporal-TemporalField2471)))
(clojure.core/defn get-hour {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this2472] (jti/getter hour this2472)))
(clojure.core/defn at-zone-same-instant {:arglists (quote (["java.time.OffsetDateTime" "java.time.ZoneId"]))} (^java.time.ZonedDateTime [^java.time.OffsetDateTime this2473 ^java.time.ZoneId java-time-ZoneId2474] (.atZoneSameInstant this2473 java-time-ZoneId2474)))
(clojure.core/defn minus-hours {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2475 ^long long2476] (.minusHours this2475 long2476)))
(clojure.core/defn of {:arglists (quote (["java.time.LocalDate" "java.time.LocalTime" "java.time.ZoneOffset"] ["int" "int" "int" "int" "int" "int" "int" "java.time.ZoneOffset"] ["java.time.LocalDateTime" "java.time.ZoneOffset"]))} (^java.time.OffsetDateTime [^java.time.LocalDate java-time-LocalDate2477 ^java.time.LocalTime java-time-LocalTime2478 ^java.time.ZoneOffset java-time-ZoneOffset2479] (. java.time.OffsetDateTime of java-time-LocalDate2477 java-time-LocalTime2478 java-time-ZoneOffset2479)) (^java.time.OffsetDateTime [^java.lang.Integer int2480 ^java.lang.Integer int2481 ^java.lang.Integer int2482 ^java.lang.Integer int2483 ^java.lang.Integer int2484 ^java.lang.Integer int2485 ^java.lang.Integer int2486 ^java.time.ZoneOffset java-time-ZoneOffset2487] (. java.time.OffsetDateTime of int2480 int2481 int2482 int2483 int2484 int2485 int2486 java-time-ZoneOffset2487)) (^java.time.OffsetDateTime [^java.time.LocalDateTime java-time-LocalDateTime2488 ^java.time.ZoneOffset java-time-ZoneOffset2489] (. java.time.OffsetDateTime of java-time-LocalDateTime2488 java-time-ZoneOffset2489)))
(clojure.core/defn with-month {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2490 ^java.lang.Integer int2491] (.withMonth this2490 int2491)))
(clojure.core/defn is-equal {:arglists (quote (["java.time.OffsetDateTime" "java.time.OffsetDateTime"]))} (^java.lang.Boolean [^java.time.OffsetDateTime this2492 ^java.time.OffsetDateTime java-time-OffsetDateTime2493] (.isEqual this2492 java-time-OffsetDateTime2493)))
(clojure.core/defn get-nano {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this2494] (jti/getter nano this2494)))
(clojure.core/defn to-offset-time {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.OffsetTime [^java.time.OffsetDateTime this2495] (.toOffsetTime this2495)))
(clojure.core/defn at-zone-similar-local {:arglists (quote (["java.time.OffsetDateTime" "java.time.ZoneId"]))} (^java.time.ZonedDateTime [^java.time.OffsetDateTime this2496 ^java.time.ZoneId java-time-ZoneId2497] (.atZoneSimilarLocal this2496 java-time-ZoneId2497)))
(clojure.core/defn get-year {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this2498] (jti/getter year this2498)))
(clojure.core/defn minus-seconds {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2499 ^long long2500] (.minusSeconds this2499 long2500)))
(clojure.core/defn get-second {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this2501] (jti/getter second this2501)))
(clojure.core/defn plus-nanos {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2502 ^long long2503] (.plusNanos this2502 long2503)))
(clojure.core/defn get-day-of-year {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this2504] (jti/getter dayOfYear this2504)))
(clojure.core/defn plus {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalAmount"] ["java.time.OffsetDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.OffsetDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.OffsetDateTime" "java.time.temporal.TemporalAmount"]))} (^java.lang.Object [this2505 G__2506] #? (:cljs (.plus ^java.time.OffsetDateTime this2505 G__2506) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__2506)) (clojure.core/let [G__2506 ^"java.time.temporal.TemporalAmount" G__2506] (.plus ^java.time.OffsetDateTime this2505 G__2506)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__2506)) (clojure.core/let [G__2506 ^"java.time.temporal.TemporalAmount" G__2506] (.plus ^java.time.OffsetDateTime this2505 G__2506)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this2507 G__2508 G__2509] #? (:cljs (.plus ^java.time.OffsetDateTime this2507 G__2508 G__2509) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2508) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__2509)) (clojure.core/let [G__2508 (clojure.core/long G__2508) G__2509 ^"java.time.temporal.TemporalUnit" G__2509] (.plus ^java.time.OffsetDateTime this2507 G__2508 G__2509)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2508) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__2509)) (clojure.core/let [G__2508 (clojure.core/long G__2508) G__2509 ^"java.time.temporal.TemporalUnit" G__2509] (.plus ^java.time.OffsetDateTime this2507 G__2508 G__2509)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn time-line-order {:arglists (quote ([]))} (^java.util.Comparator [] (. java.time.OffsetDateTime timeLineOrder)))
(clojure.core/defn with-hour {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2510 ^java.lang.Integer int2511] (.withHour this2510 int2511)))
(clojure.core/defn with-minute {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2512 ^java.lang.Integer int2513] (.withMinute this2512 int2513)))
(clojure.core/defn plus-minutes {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2514 ^long long2515] (.plusMinutes this2514 long2515)))
(clojure.core/defn query {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.OffsetDateTime this2516 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery2517] (.query this2516 java-time-temporal-TemporalQuery2517)))
(clojure.core/defn with-offset-same-instant {:arglists (quote (["java.time.OffsetDateTime" "java.time.ZoneOffset"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2518 ^java.time.ZoneOffset java-time-ZoneOffset2519] (.withOffsetSameInstant this2518 java-time-ZoneOffset2519)))
(clojure.core/defn get-day-of-week {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.DayOfWeek [^java.time.OffsetDateTime this2520] (jti/getter dayOfWeek this2520)))
(clojure.core/defn to-string {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.String [^java.time.OffsetDateTime this2521] (.toString this2521)))
(clojure.core/defn plus-months {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2522 ^long long2523] (.plusMonths this2522 long2523)))
(clojure.core/defn is-before {:arglists (quote (["java.time.OffsetDateTime" "java.time.OffsetDateTime"]))} (^java.lang.Boolean [^java.time.OffsetDateTime this2524 ^java.time.OffsetDateTime java-time-OffsetDateTime2525] (.isBefore this2524 java-time-OffsetDateTime2525)))
(clojure.core/defn minus-months {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2526 ^long long2527] (.minusMonths this2526 long2527)))
(clojure.core/defn minus {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalAmount"] ["java.time.OffsetDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.OffsetDateTime" "java.time.temporal.TemporalAmount"] ["java.time.OffsetDateTime" "long" "java.time.temporal.TemporalUnit"]))} (^java.lang.Object [this2528 G__2529] #? (:cljs (.minus ^java.time.OffsetDateTime this2528 G__2529) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__2529)) (clojure.core/let [G__2529 ^"java.time.temporal.TemporalAmount" G__2529] (.minus ^java.time.OffsetDateTime this2528 G__2529)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__2529)) (clojure.core/let [G__2529 ^"java.time.temporal.TemporalAmount" G__2529] (.minus ^java.time.OffsetDateTime this2528 G__2529)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this2530 G__2531 G__2532] #? (:cljs (.minus ^java.time.OffsetDateTime this2530 G__2531 G__2532) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2531) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__2532)) (clojure.core/let [G__2531 (clojure.core/long G__2531) G__2532 ^"java.time.temporal.TemporalUnit" G__2532] (.minus ^java.time.OffsetDateTime this2530 G__2531 G__2532)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2531) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__2532)) (clojure.core/let [G__2531 (clojure.core/long G__2531) G__2532 ^"java.time.temporal.TemporalUnit" G__2532] (.minus ^java.time.OffsetDateTime this2530 G__2531 G__2532)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn plus-hours {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2533 ^long long2534] (.plusHours this2533 long2534)))
(clojure.core/defn plus-days {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2535 ^long long2536] (.plusDays this2535 long2536)))
(clojure.core/defn to-local-time {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.LocalTime [^java.time.OffsetDateTime this2537] (.toLocalTime this2537)))
(clojure.core/defn get-long {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]))} (^long [^java.time.OffsetDateTime this2538 ^java.time.temporal.TemporalField java-time-temporal-TemporalField2539] (.getLong this2538 java-time-temporal-TemporalField2539)))
(clojure.core/defn get-offset {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.ZoneOffset [^java.time.OffsetDateTime this2540] (jti/getter offset this2540)))
(clojure.core/defn to-zoned-date-time {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.ZonedDateTime [^java.time.OffsetDateTime this2541] (.toZonedDateTime this2541)))
(clojure.core/defn with-year {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2542 ^java.lang.Integer int2543] (.withYear this2542 int2543)))
(clojure.core/defn with-nano {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2544 ^java.lang.Integer int2545] (.withNano this2544 int2545)))
(clojure.core/defn to-epoch-second {:arglists (quote (["java.time.OffsetDateTime"]))} (^long [^java.time.OffsetDateTime this2546] (.toEpochSecond this2546)))
(clojure.core/defn until {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.OffsetDateTime this2547 ^java.time.temporal.Temporal java-time-temporal-Temporal2548 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit2549] (.until this2547 java-time-temporal-Temporal2548 java-time-temporal-TemporalUnit2549)))
(clojure.core/defn with-offset-same-local {:arglists (quote (["java.time.OffsetDateTime" "java.time.ZoneOffset"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2550 ^java.time.ZoneOffset java-time-ZoneOffset2551] (.withOffsetSameLocal this2550 java-time-ZoneOffset2551)))
(clojure.core/defn with-day-of-month {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2552 ^java.lang.Integer int2553] (.withDayOfMonth this2552 int2553)))
(clojure.core/defn get-day-of-month {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this2554] (jti/getter dayOfMonth this2554)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.OffsetDateTime [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor2555] (. java.time.OffsetDateTime from java-time-temporal-TemporalAccessor2555)))
(clojure.core/defn is-after {:arglists (quote (["java.time.OffsetDateTime" "java.time.OffsetDateTime"]))} (^java.lang.Boolean [^java.time.OffsetDateTime this2556 ^java.time.OffsetDateTime java-time-OffsetDateTime2557] (.isAfter this2556 java-time-OffsetDateTime2557)))
(clojure.core/defn minus-nanos {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2558 ^long long2559] (.minusNanos this2558 long2559)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalUnit"] ["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [this2560 G__2561] #? (:cljs (.isSupported ^java.time.OffsetDateTime this2560 G__2561) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__2561)) (clojure.core/let [G__2561 ^"java.time.temporal.TemporalUnit" G__2561] (.isSupported ^java.time.OffsetDateTime this2560 G__2561)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__2561)) (clojure.core/let [G__2561 ^"java.time.temporal.TemporalField" G__2561] (.isSupported ^java.time.OffsetDateTime this2560 G__2561)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn minus-years {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2562 ^long long2563] (.minusYears this2562 long2563)))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence" "java.time.format.DateTimeFormatter"] ["java.lang.CharSequence"]))} (^java.time.OffsetDateTime [^java.lang.CharSequence java-lang-CharSequence2564 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter2565] (. java.time.OffsetDateTime parse java-lang-CharSequence2564 java-time-format-DateTimeFormatter2565)) (^java.time.OffsetDateTime [^java.lang.CharSequence java-lang-CharSequence2566] (. java.time.OffsetDateTime parse java-lang-CharSequence2566)))
(clojure.core/defn with-second {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2567 ^java.lang.Integer int2568] (.withSecond this2567 int2568)))
(clojure.core/defn to-local-date {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.LocalDate [^java.time.OffsetDateTime this2569] (.toLocalDate this2569)))
(clojure.core/defn get-minute {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this2570] (jti/getter minute this2570)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this2571] (.hashCode this2571)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.OffsetDateTime this2572 ^java.time.temporal.Temporal java-time-temporal-Temporal2573] (.adjustInto this2572 java-time-temporal-Temporal2573)))
(clojure.core/defn with {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalAdjuster"] ["java.time.OffsetDateTime" "java.time.temporal.TemporalField" "long"] ["java.time.OffsetDateTime" "java.time.temporal.TemporalAdjuster"] ["java.time.OffsetDateTime" "java.time.temporal.TemporalField" "long"]))} (^java.lang.Object [this2574 G__2575] #? (:cljs (.with ^java.time.OffsetDateTime this2574 G__2575) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__2575)) (clojure.core/let [G__2575 ^"java.time.temporal.TemporalAdjuster" G__2575] (.with ^java.time.OffsetDateTime this2574 G__2575)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__2575)) (clojure.core/let [G__2575 ^"java.time.temporal.TemporalAdjuster" G__2575] (.with ^java.time.OffsetDateTime this2574 G__2575)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this2576 G__2577 G__2578] #? (:cljs (.with ^java.time.OffsetDateTime this2576 G__2577 G__2578) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__2577) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2578)) (clojure.core/let [G__2577 ^"java.time.temporal.TemporalField" G__2577 G__2578 (clojure.core/long G__2578)] (.with ^java.time.OffsetDateTime this2576 G__2577 G__2578)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__2577) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2578)) (clojure.core/let [G__2577 ^"java.time.temporal.TemporalField" G__2577 G__2578 (clojure.core/long G__2578)] (.with ^java.time.OffsetDateTime this2576 G__2577 G__2578)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn now {:arglists (quote (["java.time.ZoneId"] [] ["java.time.Clock"]))} (^java.time.OffsetDateTime [G__2580] #? (:cljs (. java.time.OffsetDateTime now G__2580) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__2580)) (clojure.core/let [G__2580 ^"java.time.ZoneId" G__2580] (. java.time.OffsetDateTime now G__2580)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.Clock") G__2580)) (clojure.core/let [G__2580 ^"java.time.Clock" G__2580] (. java.time.OffsetDateTime now G__2580)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.time.OffsetDateTime [] (. java.time.OffsetDateTime now)))
(clojure.core/defn to-local-date-time {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.LocalDateTime [^java.time.OffsetDateTime this2581] (.toLocalDateTime this2581)))
(clojure.core/defn get-month-value {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this2582] (jti/getter monthValue this2582)))
(clojure.core/defn with-day-of-year {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2583 ^java.lang.Integer int2584] (.withDayOfYear this2583 int2584)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.OffsetDateTime" "java.time.OffsetDateTime"] ["java.time.OffsetDateTime" "java.lang.Object"]))} (^java.lang.Integer [this2585 G__2586] #? (:cljs (.compareTo ^java.time.OffsetDateTime this2585 G__2586) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.OffsetDateTime") G__2586)) (clojure.core/let [G__2586 ^"java.time.OffsetDateTime" G__2586] (.compareTo ^java.time.OffsetDateTime this2585 G__2586)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__2586)) (clojure.core/let [G__2586 ^"java.lang.Object" G__2586] (.compareTo ^java.time.OffsetDateTime this2585 G__2586)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn get-month {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.Month [^java.time.OffsetDateTime this2587] (jti/getter month this2587)))
(clojure.core/defn of-instant {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))} (^java.time.OffsetDateTime [^java.time.Instant java-time-Instant2588 ^java.time.ZoneId java-time-ZoneId2589] (. java.time.OffsetDateTime ofInstant java-time-Instant2588 java-time-ZoneId2589)))
(clojure.core/defn plus-seconds {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2590 ^long long2591] (.plusSeconds this2590 long2591)))
(clojure.core/defn get {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.OffsetDateTime this2592 ^java.time.temporal.TemporalField java-time-temporal-TemporalField2593] (.get this2592 java-time-temporal-TemporalField2593)))
(clojure.core/defn equals {:arglists (quote (["java.time.OffsetDateTime" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.OffsetDateTime this2594 ^java.lang.Object java-lang-Object2595] (.equals this2594 java-lang-Object2595)))
(clojure.core/defn format {:arglists (quote (["java.time.OffsetDateTime" "java.time.format.DateTimeFormatter"]))} (^java.lang.String [^java.time.OffsetDateTime this2596 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter2597] (.format this2596 java-time-format-DateTimeFormatter2597)))
(clojure.core/defn plus-years {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2598 ^long long2599] (.plusYears this2598 long2599)))
(clojure.core/defn minus-days {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this2600 ^long long2601] (.minusDays this2600 long2601)))
