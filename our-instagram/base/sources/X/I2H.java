package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I2H {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.IGZ, java.lang.Object] */
    public static IGZ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("media_or_ad".equals(A0s)) {
                    obj.A01 = C38321qM.A00(c16l);
                } else if (AbstractC111324zv.A00(2391).equals(A0s)) {
                    obj.A02 = I2G.parseFromJson(c16l);
                } else if ("explore_story".equals(A0s)) {
                    obj.A00 = AbstractC88263wb.parseFromJson(c16l);
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
