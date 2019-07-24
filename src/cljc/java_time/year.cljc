(ns cljc.java-time.year (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [Year]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time Year])))
(def min-value (. java.time.Year -MIN_VALUE))
(def max-value (. java.time.Year -MAX_VALUE))
(clojure.core/defn range {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.Year this2868 ^java.time.temporal.TemporalField java-time-temporal-TemporalField2869] (.range this2868 java-time-temporal-TemporalField2869)))
(clojure.core/defn of {:arglists (quote (["int"]))} (^java.time.Year [^java.lang.Integer int2870] (. java.time.Year of int2870)))
(clojure.core/defn at-day {:arglists (quote (["java.time.Year" "int"]))} (^java.time.LocalDate [^java.time.Year this2871 ^java.lang.Integer int2872] (.atDay this2871 int2872)))
(clojure.core/defn plus {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalAmount"] ["java.time.Year" "long" "java.time.temporal.TemporalUnit"] ["java.time.Year" "java.time.temporal.TemporalAmount"] ["java.time.Year" "long" "java.time.temporal.TemporalUnit"]))} (^java.lang.Object [this2873 G__2874] #? (:cljs (.plus ^java.time.Year this2873 G__2874) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__2874)) (clojure.core/let [G__2874 ^"java.time.temporal.TemporalAmount" G__2874] (.plus ^java.time.Year this2873 G__2874)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__2874)) (clojure.core/let [G__2874 ^"java.time.temporal.TemporalAmount" G__2874] (.plus ^java.time.Year this2873 G__2874)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this2875 G__2876 G__2877] #? (:cljs (.plus ^java.time.Year this2875 G__2876 G__2877) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2876) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__2877)) (clojure.core/let [G__2876 (clojure.core/long G__2876) G__2877 ^"java.time.temporal.TemporalUnit" G__2877] (.plus ^java.time.Year this2875 G__2876 G__2877)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2876) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__2877)) (clojure.core/let [G__2876 (clojure.core/long G__2876) G__2877 ^"java.time.temporal.TemporalUnit" G__2877] (.plus ^java.time.Year this2875 G__2876 G__2877)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn is-valid-month-day {:arglists (quote (["java.time.Year" "java.time.MonthDay"]))} (^java.lang.Boolean [^java.time.Year this2878 ^java.time.MonthDay java-time-MonthDay2879] (.isValidMonthDay this2878 java-time-MonthDay2879)))
(clojure.core/defn query {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.Year this2880 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery2881] (.query this2880 java-time-temporal-TemporalQuery2881)))
^{:line 65, :column 16} (clojure.core/defn is-leap {:arglists ^{:line 65, :column 54} (quote ^{:line 65, :column 61} (["long"]))} ^{:line 66, :column 18} (^java.lang.Boolean [^long long57050] ^{:line 66, :column 56} (. java.time.Year isLeap long57050)))
(clojure.core/defn to-string {:arglists (quote (["java.time.Year"]))} (^java.lang.String [^java.time.Year this2882] (.toString this2882)))
(clojure.core/defn is-before {:arglists (quote (["java.time.Year" "java.time.Year"]))} (^java.lang.Boolean [^java.time.Year this2883 ^java.time.Year java-time-Year2884] (.isBefore this2883 java-time-Year2884)))
(clojure.core/defn minus {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalAmount"] ["java.time.Year" "long" "java.time.temporal.TemporalUnit"] ["java.time.Year" "java.time.temporal.TemporalAmount"] ["java.time.Year" "long" "java.time.temporal.TemporalUnit"]))} (^java.lang.Object [this2885 G__2886] #? (:cljs (.minus ^java.time.Year this2885 G__2886) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__2886)) (clojure.core/let [G__2886 ^"java.time.temporal.TemporalAmount" G__2886] (.minus ^java.time.Year this2885 G__2886)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__2886)) (clojure.core/let [G__2886 ^"java.time.temporal.TemporalAmount" G__2886] (.minus ^java.time.Year this2885 G__2886)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this2887 G__2888 G__2889] #? (:cljs (.minus ^java.time.Year this2887 G__2888 G__2889) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2888) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__2889)) (clojure.core/let [G__2888 (clojure.core/long G__2888) G__2889 ^"java.time.temporal.TemporalUnit" G__2889] (.minus ^java.time.Year this2887 G__2888 G__2889)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2888) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__2889)) (clojure.core/let [G__2888 (clojure.core/long G__2888) G__2889 ^"java.time.temporal.TemporalUnit" G__2889] (.minus ^java.time.Year this2887 G__2888 G__2889)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn at-month-day {:arglists (quote (["java.time.Year" "java.time.MonthDay"]))} (^java.time.LocalDate [^java.time.Year this2890 ^java.time.MonthDay java-time-MonthDay2891] (.atMonthDay this2890 java-time-MonthDay2891)))
(clojure.core/defn get-value {:arglists (quote (["java.time.Year"]))} (^java.lang.Integer [^java.time.Year this2892] (jti/getter value this2892)))
(clojure.core/defn get-long {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalField"]))} (^long [^java.time.Year this2893 ^java.time.temporal.TemporalField java-time-temporal-TemporalField2894] (.getLong this2893 java-time-temporal-TemporalField2894)))
(clojure.core/defn at-month {:arglists (quote (["java.time.Year" "java.time.Month"] ["java.time.Year" "int"]))} (^java.time.YearMonth [this2895 G__2896] #? (:cljs (.atMonth ^java.time.Year this2895 G__2896) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.Month") G__2896)) (clojure.core/let [G__2896 ^"java.time.Month" G__2896] (.atMonth ^java.time.Year this2895 G__2896)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Integer") G__2896)) (clojure.core/let [G__2896 ^"java.lang.Integer" G__2896] (.atMonth ^java.time.Year this2895 G__2896)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn until {:arglists (quote (["java.time.Year" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.Year this2897 ^java.time.temporal.Temporal java-time-temporal-Temporal2898 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit2899] (.until this2897 java-time-temporal-Temporal2898 java-time-temporal-TemporalUnit2899)))
(clojure.core/defn length {:arglists (quote (["java.time.Year"]))} (^java.lang.Integer [^java.time.Year this2900] (.length this2900)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.Year [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor2901] (. java.time.Year from java-time-temporal-TemporalAccessor2901)))
(clojure.core/defn is-after {:arglists (quote (["java.time.Year" "java.time.Year"]))} (^java.lang.Boolean [^java.time.Year this2902 ^java.time.Year java-time-Year2903] (.isAfter this2902 java-time-Year2903)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalUnit"] ["java.time.Year" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [this2904 G__2905] #? (:cljs (.isSupported ^java.time.Year this2904 G__2905) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__2905)) (clojure.core/let [G__2905 ^"java.time.temporal.TemporalUnit" G__2905] (.isSupported ^java.time.Year this2904 G__2905)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__2905)) (clojure.core/let [G__2905 ^"java.time.temporal.TemporalField" G__2905] (.isSupported ^java.time.Year this2904 G__2905)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn minus-years {:arglists (quote (["java.time.Year" "long"]))} (^java.time.Year [^java.time.Year this2906 ^long long2907] (.minusYears this2906 long2907)))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))} (^java.time.Year [^java.lang.CharSequence java-lang-CharSequence2908] (. java.time.Year parse java-lang-CharSequence2908)) (^java.time.Year [^java.lang.CharSequence java-lang-CharSequence2909 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter2910] (. java.time.Year parse java-lang-CharSequence2909 java-time-format-DateTimeFormatter2910)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Year"]))} (^java.lang.Integer [^java.time.Year this2911] (.hashCode this2911)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.Year" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.Year this2912 ^java.time.temporal.Temporal java-time-temporal-Temporal2913] (.adjustInto this2912 java-time-temporal-Temporal2913)))
(clojure.core/defn with {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalField" "long"] ["java.time.Year" "java.time.temporal.TemporalAdjuster"] ["java.time.Year" "java.time.temporal.TemporalField" "long"] ["java.time.Year" "java.time.temporal.TemporalAdjuster"]))} (^java.lang.Object [this2914 G__2915 G__2916] #? (:cljs (.with ^java.time.Year this2914 G__2915 G__2916) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__2915) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2916)) (clojure.core/let [G__2915 ^"java.time.temporal.TemporalField" G__2915 G__2916 (clojure.core/long G__2916)] (.with ^java.time.Year this2914 G__2915 G__2916)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__2915) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__2916)) (clojure.core/let [G__2915 ^"java.time.temporal.TemporalField" G__2915 G__2916 (clojure.core/long G__2916)] (.with ^java.time.Year this2914 G__2915 G__2916)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this2917 G__2918] #? (:cljs (.with ^java.time.Year this2917 G__2918) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__2918)) (clojure.core/let [G__2918 ^"java.time.temporal.TemporalAdjuster" G__2918] (.with ^java.time.Year this2917 G__2918)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__2918)) (clojure.core/let [G__2918 ^"java.time.temporal.TemporalAdjuster" G__2918] (.with ^java.time.Year this2917 G__2918)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn now {:arglists (quote ([] ["java.time.ZoneId"] ["java.time.Clock"]))} (^java.time.Year [] (. java.time.Year now)) (^java.time.Year [G__2920] #? (:cljs (. java.time.Year now G__2920) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__2920)) (clojure.core/let [G__2920 ^"java.time.ZoneId" G__2920] (. java.time.Year now G__2920)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.Clock") G__2920)) (clojure.core/let [G__2920 ^"java.time.Clock" G__2920] (. java.time.Year now G__2920)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn compare-to {:arglists (quote (["java.time.Year" "java.lang.Object"] ["java.time.Year" "java.time.Year"]))} (^java.lang.Integer [this2921 G__2922] #? (:cljs (.compareTo ^java.time.Year this2921 G__2922) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__2922)) (clojure.core/let [G__2922 ^"java.lang.Object" G__2922] (.compareTo ^java.time.Year this2921 G__2922)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.Year") G__2922)) (clojure.core/let [G__2922 ^"java.time.Year" G__2922] (.compareTo ^java.time.Year this2921 G__2922)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn get {:arglists (quote (["java.time.Year" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.Year this2923 ^java.time.temporal.TemporalField java-time-temporal-TemporalField2924] (.get this2923 java-time-temporal-TemporalField2924)))
(clojure.core/defn equals {:arglists (quote (["java.time.Year" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.Year this2925 ^java.lang.Object java-lang-Object2926] (.equals this2925 java-lang-Object2926)))
(clojure.core/defn format {:arglists (quote (["java.time.Year" "java.time.format.DateTimeFormatter"]))} (^java.lang.String [^java.time.Year this2927 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter2928] (.format this2927 java-time-format-DateTimeFormatter2928)))
(clojure.core/defn plus-years {:arglists (quote (["java.time.Year" "long"]))} (^java.time.Year [^java.time.Year this2929 ^long long2930] (.plusYears this2929 long2930)))
