package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VOU {
    public static UQx parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Float f = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Float f2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("avg_rating".equals(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if ("review_count".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC111324zv.A00(1241).equals(A0s)) {
                    f2 = AbstractC167007dF.A0a(c16l);
                }
                c16l.A0z();
            }
            return new UQx(f, f2, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
