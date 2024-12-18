package X;

import java.io.IOException;

/* renamed from: X.4NH, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4NH {
    public static C94524Nf parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C4NJ c4nj = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("quick_promotion".equals(A0q)) {
                    c4nj = C4NI.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (c4nj == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("quick_promotion", "QuickPromotionAdapter");
                throw C00O.createAndThrow();
            }
            return new C94524Nf(c4nj);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
