package X;

import java.io.IOException;

/* renamed from: X.Grz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38256Grz {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.Gs0, X.9QR, X.1ul] */
    public static C38257Gs0 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c9qr = new C9QR();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("payload".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c9qr.A02 = A1P;
                } else if ("layout".equals(A0q)) {
                    c9qr.A01 = AbstractC102744kB.A00(c16l);
                } else {
                    C55702hA.A01(c16l, c9qr, A0q);
                }
                c16l.A0z();
            }
            C103434lJ c103434lJ = new C114665Fw(c9qr.A01, c9qr.A02).A01;
            C14360o3.A0B(c103434lJ, 0);
            c9qr.A00 = c103434lJ;
            return c9qr;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
