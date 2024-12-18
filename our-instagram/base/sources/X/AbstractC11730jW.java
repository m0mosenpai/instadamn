package X;

import java.util.Map;

/* renamed from: X.0jW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11730jW {
    public static void A01(C16L c16l, String str, Map map) {
        c16l.A1P();
        String A1P = c16l.A1P();
        int i = 0;
        if (A1P == null) {
            C0w9.A03("PigeonResponse", "Invalid sample rate null");
        } else {
            try {
                i = Integer.parseInt(A1P);
            } catch (NumberFormatException unused) {
                C0w9.A03("PigeonResponse", AnonymousClass001.A0R("Invalid sample rate format. Expected: int, received: ", A1P));
            }
        }
        map.put(str, Integer.valueOf(i));
    }

    public static void A00(C16L c16l, String str, Map map) {
        while (true) {
            c16l.A12();
            C16R A11 = c16l.A11();
            if (A11 != C16R.A09) {
                String A0q = c16l.A0q();
                if ("*".equals(A0q)) {
                    A01(c16l, str, map);
                } else {
                    String A0g = AnonymousClass001.A0g(str, ":", A0q);
                    if (A11 == C16R.A0D) {
                        A00(c16l, A0g, map);
                    } else {
                        A01(c16l, A0g, map);
                    }
                }
            } else {
                return;
            }
        }
    }
}
