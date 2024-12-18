package X;

import java.io.IOException;

/* renamed from: X.VxD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69886VxD {
    public static C67846UzR parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C67846UzR c67846UzR = new C67846UzR();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("main_text".equals(A0s)) {
                    c67846UzR.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("animation_type".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    VDL vdl = (VDL) VDL.A01.get(A0m);
                    if (vdl != null) {
                        c67846UzR.A02 = vdl;
                    } else {
                        throw AbstractC167007dF.A0c(AbstractC111324zv.A00(95), A0m);
                    }
                } else if (AbstractC111324zv.A00(4330).equals(A0s)) {
                    c67846UzR.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("share_button_text".equals(A0s)) {
                    c67846UzR.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("story_text".equals(A0s)) {
                    c67846UzR.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("promotion_id".equals(A0s)) {
                    c67846UzR.A06 = AbstractC167017dG.A0m(c16l);
                } else {
                    C55702hA.A01(c16l, c67846UzR, A0s);
                }
                c16l.A0z();
            }
            return c67846UzR;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
