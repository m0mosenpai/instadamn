package X;

import java.io.IOException;

/* renamed from: X.KpE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46933KpE {
    public static C31271eW parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C31271eW c31271eW = new C31271eW();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("pending_media_key".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c31271eW.A02 = A1P;
                } else if ("thread_key".equals(A0s)) {
                    c31271eW.A01 = AbstractC31172DnG.A0o(c16l);
                } else if ("file_media".equals(A0s)) {
                    C7Q4 parseFromJson = AbstractC47865LCl.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c31271eW.A00 = parseFromJson;
                } else {
                    AbstractC47856LCb.A01(c16l, c31271eW, A0s);
                }
                c16l.A0z();
            }
            return c31271eW;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
