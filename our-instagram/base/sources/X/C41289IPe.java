package X;

import java.io.IOException;

/* renamed from: X.IPe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41289IPe {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.9QR, X.HDW, X.1ul] */
    public static HDW parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c9qr = new C9QR();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("payload".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c9qr.A02 = A1P;
                } else if ("layout".equals(A0s)) {
                    c9qr.A01 = C58590PyH.A00(c16l);
                } else {
                    C55702hA.A01(c16l, c9qr, A0s);
                }
                c16l.A0z();
            }
            C58590PyH c58590PyH = c9qr.A01;
            String str = c9qr.A02;
            if (c58590PyH == null) {
                if (str != null) {
                    c58590PyH = (C58590PyH) AbstractC40568Hyo.parseFromJson(C16V.A00(str)).A00;
                    if (c58590PyH == null) {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            C14360o3.A0B(c58590PyH, 0);
            c9qr.A00 = c58590PyH;
            return c9qr;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
