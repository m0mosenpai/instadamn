package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F5B {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.FKf, java.lang.Object] */
    public static C34545FKf parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("vc_id".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(4371).equals(A0s)) {
                    obj.A00 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(5484).equals(A0s)) {
                    obj.A02 = c16l.A0d();
                } else if ("thread_has_drop_in".equals(A0s)) {
                    c16l.A0d();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
