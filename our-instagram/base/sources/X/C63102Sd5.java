package X;

import java.util.HashSet;

/* renamed from: X.Sd5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63102Sd5 {
    public static String A00 = "media3.common";
    public static final HashSet A01 = AbstractC166987dD.A1H();

    public static synchronized void A00(String str) {
        synchronized (C63102Sd5.class) {
            if (A01.add(str)) {
                A00 = AnonymousClass001.A0g(A00, ", ", str);
            }
        }
    }
}
