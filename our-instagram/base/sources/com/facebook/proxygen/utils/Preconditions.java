package com.facebook.proxygen.utils;

import X.AbstractC166987dD;
import X.AbstractC58318PtA;

/* loaded from: classes10.dex */
public final class Preconditions {
    public static Object checkNotNull(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw AbstractC166987dD.A15(String.valueOf(obj2));
    }

    public static void checkState(boolean z, Object obj) {
        if (z) {
        } else {
            throw AbstractC166987dD.A14(String.valueOf(obj));
        }
    }

    public static Object checkNotNull(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void checkState(boolean z) {
        if (z) {
        } else {
            throw AbstractC58318PtA.A0Z();
        }
    }
}
