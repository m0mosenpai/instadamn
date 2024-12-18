package X;

import java.io.IOException;

/* renamed from: X.KoX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46890KoX {
    public static C45122Jxr parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C45122Jxr c45122Jxr = new C45122Jxr();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("expire_ms".equals(A0s)) {
                    c45122Jxr.A01 = AbstractC31173DnH.A0h(c16l);
                } else if ("is_dm".equals(A0s)) {
                    c45122Jxr.A00 = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            return c45122Jxr;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
