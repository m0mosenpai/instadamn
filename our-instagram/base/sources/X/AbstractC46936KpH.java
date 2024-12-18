package X;

import java.io.IOException;

/* renamed from: X.KpH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46936KpH {
    public static C33691iV parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C33691iV c33691iV = new C33691iV();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("note_reply".equals(A0s)) {
                    C47813L9v parseFromJson = AbstractC47852LBv.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c33691iV.A00 = parseFromJson;
                } else {
                    AbstractC47856LCb.A01(c16l, c33691iV, A0s);
                }
                c16l.A0z();
            }
            return c33691iV;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
