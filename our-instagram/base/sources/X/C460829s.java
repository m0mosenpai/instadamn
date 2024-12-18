package X;

import java.util.HashSet;

/* renamed from: X.29s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C460829s {
    public static String A00 = "goog.exo.core";
    public static boolean A01 = true;
    public static final HashSet A02 = new HashSet();

    public static synchronized void A00(String str) {
        synchronized (C460829s.class) {
            if (A02.add(str)) {
                A00 = AnonymousClass001.A0g(A00, ", ", str);
            }
        }
    }
}
