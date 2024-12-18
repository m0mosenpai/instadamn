package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I22 {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.IL5, java.lang.Object] */
    public static IL5 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("media_or_ad".equals(AbstractC166997dE.A0s(c16l))) {
                    C38321qM A00 = C38321qM.A00(c16l);
                    C14360o3.A0B(A00, 0);
                    obj.A00 = A00;
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
