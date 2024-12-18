package X;

import java.io.IOException;

/* renamed from: X.KpV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46950KpV {
    public static C33611iN parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C33611iN c33611iN = new C33611iN();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("note_reply".equals(A0s)) {
                    C47813L9v parseFromJson = AbstractC47852LBv.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c33611iN.A00 = parseFromJson;
                } else {
                    AbstractC47856LCb.A01(c16l, c33611iN, A0s);
                }
                c16l.A0z();
            }
            return c33611iN;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
