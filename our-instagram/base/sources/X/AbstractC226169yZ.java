package X;

import java.io.IOException;

/* renamed from: X.9yZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226169yZ {
    public static C206169Az parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C206169Az c206169Az = new C206169Az(1);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(3246).equals(A0s)) {
                    c206169Az.A02 = (float) c16l.A0U();
                } else if (AbstractC111324zv.A00(3247).equals(A0s)) {
                    c206169Az.A03 = (float) c16l.A0U();
                } else if (AbstractC111324zv.A00(1999).equals(A0s)) {
                    c206169Az.A01 = (float) c16l.A0U();
                } else if (AbstractC111324zv.A00(1998).equals(A0s)) {
                    c206169Az.A00 = (float) c16l.A0U();
                }
                c16l.A0z();
            }
            return c206169Az;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
