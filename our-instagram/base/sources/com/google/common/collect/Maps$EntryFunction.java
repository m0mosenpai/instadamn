package com.google.common.collect;

import X.C2n2;
import java.util.Map;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes10.dex */
public abstract class Maps$EntryFunction implements C2n2 {
    public static final Maps$EntryFunction A00 = new Maps$EntryFunction() { // from class: com.google.common.collect.Maps$EntryFunction.1
        @Override // X.C2n2
        public final /* bridge */ /* synthetic */ Object apply(Object entry) {
            return ((Map.Entry) entry).getKey();
        }
    };
    public static final Maps$EntryFunction A01 = new Maps$EntryFunction() { // from class: com.google.common.collect.Maps$EntryFunction.2
        @Override // X.C2n2
        public final /* bridge */ /* synthetic */ Object apply(Object entry) {
            return ((Map.Entry) entry).getValue();
        }
    };

    public Maps$EntryFunction(String $enum$name, int $enum$ordinal) {
    }
}
