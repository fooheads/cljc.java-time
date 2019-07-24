(ns cljc.java-time.offset-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [OffsetTime]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time OffsetTime])))
(def min (. java.time.OffsetTime -MIN))
(def max (. java.time.OffsetTime -MAX))
(clojure.core/defn minus-minutes {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2296 ^long long2297] (.minusMinutes this2296 long2297)))
(clojure.core/defn truncated-to {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalUnit"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2298 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit2299] (.truncatedTo this2298 java-time-temporal-TemporalUnit2299)))
(clojure.core/defn range {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.OffsetTime this2300 ^java.time.temporal.TemporalField java-time-temporal-TemporalField2301] (.range this2300 java-time-temporal-TemporalField2301)))
(clojure.core/defn get-hour {:arglists (quote (["java.time.OffsetTime"]))} (^java.lang.Integer [^java.time.OffsetTime this2302] (jti/getter hour this2302)))
(clojure.core/defn minus-hours {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2303 ^long long2304] (.minusHours this2303 long2304)))
(clojure.core/defn of {:arglists (quote (["java.time.LocalTime" "java.time.ZoneOffset"] ["int" "int" "int" "int" "java.time.ZoneOffset"]))} (^java.time.OffsetTime [^java.time.LocalTime java-time-LocalTime2305 ^java.time.ZoneOffset java-time-ZoneOffset2306] (. java.time.OffsetTime of java-time-LocalTime2305 java-time-ZoneOffset2306)) (^java.time.OffsetTime [^java.lang.Integer int2307 ^java.lang.Integer int2308 ^java.lang.Integer int2309 ^java.lang.Integer int2310 ^java.time.ZoneOffset java-time-ZoneOffset2311] (. java.time.OffsetTime of int2307 int2308 int2309 int2310 java-time-ZoneOffset2311)))
(clojure.core/defn is-equal {:arglists (quote (["java.time.OffsetTime" "java.time.OffsetTime"]))} (^java.lang.Boolean [^java.time.OffsetTime this2312 ^java.time.OffsetTime java-time-OffsetTime2313] (.isEqual this2312 java-time-OffsetTime2313)))
(clojure.core/defn get-nano {:arglists (quote (["java.time.OffsetTime"]))} (^java.lang.Integer [^java.time.OffsetTime this2314] (jti/getter nano this2314)))
(clojure.core/defn minus-seconds {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2315 ^long long2316] (.minusSeconds this2315 long2316)))
(clojure.core/defn get-second {:arglists (quote (["java.time.OffsetTime"]))} (^java.lang.Integer [^java.time.OffsetTime this2317] (jti/getter second this2317)))
(clojure.core/defn plus-nanos {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2318 ^long long2319] (.plusNanos this2318 long2319)))
(clojure.core/defn plus {:arglists (quote (["java.time.OffsetTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.OffsetTime" "java.time.temporal.TemporalAmount"] ["java.time.OffsetTime" "java.time.temporal.TemporalAmount"] ["java.time.OffsetTime" "long" "java.time.temporal.TemporalUnit"]))} (^java.lang.Object [this2320 G__2321 G__2322] #? (:cljs (.plus ^java.time.OffsetTime this2320 G__2321 G__2322) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2321) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__2322)) (clojure.core/let [G__2321 (clojure.core/long G__2321) G__2322 ^"java.time.temporal.TemporalUnit" G__2322] (.plus ^java.time.OffsetTime this2320 G__2321 G__2322)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2321) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__2322)) (clojure.core/let [G__2321 (clojure.core/long G__2321) G__2322 ^"java.time.temporal.TemporalUnit" G__2322] (.plus ^java.time.OffsetTime this2320 G__2321 G__2322)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this2323 G__2324] #? (:cljs (.plus ^java.time.OffsetTime this2323 G__2324) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__2324)) (clojure.core/let [G__2324 ^"java.time.temporal.TemporalAmount" G__2324] (.plus ^java.time.OffsetTime this2323 G__2324)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__2324)) (clojure.core/let [G__2324 ^"java.time.temporal.TemporalAmount" G__2324] (.plus ^java.time.OffsetTime this2323 G__2324)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn with-hour {:arglists (quote (["java.time.OffsetTime" "int"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2325 ^java.lang.Integer int2326] (.withHour this2325 int2326)))
(clojure.core/defn with-minute {:arglists (quote (["java.time.OffsetTime" "int"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2327 ^java.lang.Integer int2328] (.withMinute this2327 int2328)))
(clojure.core/defn plus-minutes {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2329 ^long long2330] (.plusMinutes this2329 long2330)))
(clojure.core/defn query {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.OffsetTime this2331 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery2332] (.query this2331 java-time-temporal-TemporalQuery2332)))
(clojure.core/defn at-date {:arglists (quote (["java.time.OffsetTime" "java.time.LocalDate"]))} (^java.time.OffsetDateTime [^java.time.OffsetTime this2333 ^java.time.LocalDate java-time-LocalDate2334] (.atDate this2333 java-time-LocalDate2334)))
(clojure.core/defn with-offset-same-instant {:arglists (quote (["java.time.OffsetTime" "java.time.ZoneOffset"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2335 ^java.time.ZoneOffset java-time-ZoneOffset2336] (.withOffsetSameInstant this2335 java-time-ZoneOffset2336)))
(clojure.core/defn to-string {:arglists (quote (["java.time.OffsetTime"]))} (^java.lang.String [^java.time.OffsetTime this2337] (.toString this2337)))
(clojure.core/defn is-before {:arglists (quote (["java.time.OffsetTime" "java.time.OffsetTime"]))} (^java.lang.Boolean [^java.time.OffsetTime this2338 ^java.time.OffsetTime java-time-OffsetTime2339] (.isBefore this2338 java-time-OffsetTime2339)))
(clojure.core/defn minus {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalAmount"] ["java.time.OffsetTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.OffsetTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.OffsetTime" "java.time.temporal.TemporalAmount"]))} (^java.lang.Object [this2340 G__2341] #? (:cljs (.minus ^java.time.OffsetTime this2340 G__2341) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__2341)) (clojure.core/let [G__2341 ^"java.time.temporal.TemporalAmount" G__2341] (.minus ^java.time.OffsetTime this2340 G__2341)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__2341)) (clojure.core/let [G__2341 ^"java.time.temporal.TemporalAmount" G__2341] (.minus ^java.time.OffsetTime this2340 G__2341)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this2342 G__2343 G__2344] #? (:cljs (.minus ^java.time.OffsetTime this2342 G__2343 G__2344) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2343) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__2344)) (clojure.core/let [G__2343 (clojure.core/long G__2343) G__2344 ^"java.time.temporal.TemporalUnit" G__2344] (.minus ^java.time.OffsetTime this2342 G__2343 G__2344)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2343) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__2344)) (clojure.core/let [G__2343 (clojure.core/long G__2343) G__2344 ^"java.time.temporal.TemporalUnit" G__2344] (.minus ^java.time.OffsetTime this2342 G__2343 G__2344)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn plus-hours {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2345 ^long long2346] (.plusHours this2345 long2346)))
(clojure.core/defn to-local-time {:arglists (quote (["java.time.OffsetTime"]))} (^java.time.LocalTime [^java.time.OffsetTime this2347] (.toLocalTime this2347)))
(clojure.core/defn get-long {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalField"]))} (^long [^java.time.OffsetTime this2348 ^java.time.temporal.TemporalField java-time-temporal-TemporalField2349] (.getLong this2348 java-time-temporal-TemporalField2349)))
(clojure.core/defn get-offset {:arglists (quote (["java.time.OffsetTime"]))} (^java.time.ZoneOffset [^java.time.OffsetTime this2350] (jti/getter offset this2350)))
(clojure.core/defn with-nano {:arglists (quote (["java.time.OffsetTime" "int"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2351 ^java.lang.Integer int2352] (.withNano this2351 int2352)))
(clojure.core/defn until {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.OffsetTime this2353 ^java.time.temporal.Temporal java-time-temporal-Temporal2354 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit2355] (.until this2353 java-time-temporal-Temporal2354 java-time-temporal-TemporalUnit2355)))
(clojure.core/defn with-offset-same-local {:arglists (quote (["java.time.OffsetTime" "java.time.ZoneOffset"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2356 ^java.time.ZoneOffset java-time-ZoneOffset2357] (.withOffsetSameLocal this2356 java-time-ZoneOffset2357)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.OffsetTime [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor2358] (. java.time.OffsetTime from java-time-temporal-TemporalAccessor2358)))
(clojure.core/defn is-after {:arglists (quote (["java.time.OffsetTime" "java.time.OffsetTime"]))} (^java.lang.Boolean [^java.time.OffsetTime this2359 ^java.time.OffsetTime java-time-OffsetTime2360] (.isAfter this2359 java-time-OffsetTime2360)))
(clojure.core/defn minus-nanos {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2361 ^long long2362] (.minusNanos this2361 long2362)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalField"] ["java.time.OffsetTime" "java.time.temporal.TemporalUnit"]))} (^java.lang.Boolean [this2363 G__2364] #? (:cljs (.isSupported ^java.time.OffsetTime this2363 G__2364) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__2364)) (clojure.core/let [G__2364 ^"java.time.temporal.TemporalField" G__2364] (.isSupported ^java.time.OffsetTime this2363 G__2364)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__2364)) (clojure.core/let [G__2364 ^"java.time.temporal.TemporalUnit" G__2364] (.isSupported ^java.time.OffsetTime this2363 G__2364)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence" "java.time.format.DateTimeFormatter"] ["java.lang.CharSequence"]))} (^java.time.OffsetTime [^java.lang.CharSequence java-lang-CharSequence2365 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter2366] (. java.time.OffsetTime parse java-lang-CharSequence2365 java-time-format-DateTimeFormatter2366)) (^java.time.OffsetTime [^java.lang.CharSequence java-lang-CharSequence2367] (. java.time.OffsetTime parse java-lang-CharSequence2367)))
(clojure.core/defn with-second {:arglists (quote (["java.time.OffsetTime" "int"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2368 ^java.lang.Integer int2369] (.withSecond this2368 int2369)))
(clojure.core/defn get-minute {:arglists (quote (["java.time.OffsetTime"]))} (^java.lang.Integer [^java.time.OffsetTime this2370] (jti/getter minute this2370)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.OffsetTime"]))} (^java.lang.Integer [^java.time.OffsetTime this2371] (.hashCode this2371)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.OffsetTime this2372 ^java.time.temporal.Temporal java-time-temporal-Temporal2373] (.adjustInto this2372 java-time-temporal-Temporal2373)))
(clojure.core/defn with {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalAdjuster"] ["java.time.OffsetTime" "java.time.temporal.TemporalField" "long"] ["java.time.OffsetTime" "java.time.temporal.TemporalAdjuster"] ["java.time.OffsetTime" "java.time.temporal.TemporalField" "long"]))} (^java.lang.Object [this2374 G__2375] #? (:cljs (.with ^java.time.OffsetTime this2374 G__2375) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__2375)) (clojure.core/let [G__2375 ^"java.time.temporal.TemporalAdjuster" G__2375] (.with ^java.time.OffsetTime this2374 G__2375)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__2375)) (clojure.core/let [G__2375 ^"java.time.temporal.TemporalAdjuster" G__2375] (.with ^java.time.OffsetTime this2374 G__2375)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this2376 G__2377 G__2378] #? (:cljs (.with ^java.time.OffsetTime this2376 G__2377 G__2378) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__2377) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2378)) (clojure.core/let [G__2377 ^"java.time.temporal.TemporalField" G__2377 G__2378 (clojure.core/long G__2378)] (.with ^java.time.OffsetTime this2376 G__2377 G__2378)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__2377) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2378)) (clojure.core/let [G__2377 ^"java.time.temporal.TemporalField" G__2377 G__2378 (clojure.core/long G__2378)] (.with ^java.time.OffsetTime this2376 G__2377 G__2378)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn now {:arglists (quote ([] ["java.time.ZoneId"] ["java.time.Clock"]))} (^java.time.OffsetTime [] (. java.time.OffsetTime now)) (^java.time.OffsetTime [G__2380] #? (:cljs (. java.time.OffsetTime now G__2380) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__2380)) (clojure.core/let [G__2380 ^"java.time.ZoneId" G__2380] (. java.time.OffsetTime now G__2380)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.Clock") G__2380)) (clojure.core/let [G__2380 ^"java.time.Clock" G__2380] (. java.time.OffsetTime now G__2380)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn compare-to {:arglists (quote (["java.time.OffsetTime" "java.time.OffsetTime"] ["java.time.OffsetTime" "java.lang.Object"]))} (^java.lang.Integer [this2381 G__2382] #? (:cljs (.compareTo ^java.time.OffsetTime this2381 G__2382) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.OffsetTime") G__2382)) (clojure.core/let [G__2382 ^"java.time.OffsetTime" G__2382] (.compareTo ^java.time.OffsetTime this2381 G__2382)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__2382)) (clojure.core/let [G__2382 ^"java.lang.Object" G__2382] (.compareTo ^java.time.OffsetTime this2381 G__2382)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn of-instant {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))} (^java.time.OffsetTime [^java.time.Instant java-time-Instant2383 ^java.time.ZoneId java-time-ZoneId2384] (. java.time.OffsetTime ofInstant java-time-Instant2383 java-time-ZoneId2384)))
(clojure.core/defn plus-seconds {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this2385 ^long long2386] (.plusSeconds this2385 long2386)))
(clojure.core/defn get {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.OffsetTime this2387 ^java.time.temporal.TemporalField java-time-temporal-TemporalField2388] (.get this2387 java-time-temporal-TemporalField2388)))
(clojure.core/defn equals {:arglists (quote (["java.time.OffsetTime" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.OffsetTime this2389 ^java.lang.Object java-lang-Object2390] (.equals this2389 java-lang-Object2390)))
(clojure.core/defn format {:arglists (quote (["java.time.OffsetTime" "java.time.format.DateTimeFormatter"]))} (^java.lang.String [^java.time.OffsetTime this2391 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter2392] (.format this2391 java-time-format-DateTimeFormatter2392)))
