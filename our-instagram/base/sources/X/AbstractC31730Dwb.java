package X;

import java.io.IOException;

/* renamed from: X.Dwb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31730Dwb {
    /* JADX WARN: Type inference failed for: r1v2, types: [X.ICf, java.lang.Object] */
    public static C40958ICf parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38321qM c38321qM = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("media".equals(A0q)) {
                    c38321qM = C38321qM.A0h.A0C(c16l, true, false);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (c38321qM != null) {
                obj.A00 = c38321qM;
            }
            if (obj.A00 == null) {
                return null;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
