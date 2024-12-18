package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VSU {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.6RO, X.9kG, java.lang.Object] */
    public static C217839kG parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("max_width".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else if (AbstractC111324zv.A00(1047).equals(A0s)) {
                    obj.A01 = c16l.A0d();
                } else if (AbstractC111324zv.A00(1054).equals(A0s)) {
                    obj.A02 = c16l.A0d();
                } else {
                    ADU.A01(c16l, obj, A0s);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
