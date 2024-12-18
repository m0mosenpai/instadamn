package X;

import java.io.IOException;

/* renamed from: X.VUq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68537VUq {
    public static C68805VcM parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68805VcM c68805VcM = new C68805VcM();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("__typename".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("selector_value".equals(A0s)) {
                    c68805VcM.A00 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c68805VcM;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
