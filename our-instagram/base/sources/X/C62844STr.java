package X;

import java.util.Comparator;

/* renamed from: X.STr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62844STr {
    public static final Comparator A00;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(String.valueOf(C62844STr.class.getName()).concat("$UnsafeComparator")).getEnumConstants();
            enumConstants.getClass();
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = Rj6.A01;
        }
        A00 = comparator;
    }
}
