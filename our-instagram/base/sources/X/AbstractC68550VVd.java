package X;

import java.io.IOException;

/* renamed from: X.VVd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68550VVd {
    public static C66644URi parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            UQy uQy = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            UQz uQz = null;
            UR0 ur0 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(872).equals(A0s)) {
                    uQy = VOW.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(1206).equals(A0s)) {
                    uQz = VOY.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(1346).equals(A0s)) {
                    ur0 = AbstractC68366VOa.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C66644URi(uQy, uQz, ur0);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
