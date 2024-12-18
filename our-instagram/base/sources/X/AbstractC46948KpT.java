package X;

import java.io.IOException;

/* renamed from: X.KpT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46948KpT {
    public static C33851il parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C33851il c33851il = new C33851il();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("note_reply".equals(A0s)) {
                    L4V parseFromJson = AbstractC46771KmS.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c33851il.A01 = parseFromJson;
                } else if ("avatar_sticker".equals(A0s)) {
                    C148286ly parseFromJson2 = AbstractC201088uq.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson2, 0);
                    c33851il.A00 = parseFromJson2;
                } else {
                    AbstractC47856LCb.A01(c16l, c33851il, A0s);
                }
                c16l.A0z();
            }
            return c33851il;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
