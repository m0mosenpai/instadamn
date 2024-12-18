package X;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class A11 {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.AA8] */
    public static AA8 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(212).equals(A0s)) {
                    obj.A00 = AbstractC47864LCk.parseFromJson(c16l);
                } else if ("fixed_height_still".equals(A0s)) {
                    obj.A06 = AbstractC47864LCk.parseFromJson(c16l);
                } else if ("fixed_height_downsampled".equals(A0s)) {
                    obj.A01 = AbstractC47864LCk.parseFromJson(c16l);
                } else if ("downsized".equals(A0s)) {
                    obj.A02 = AbstractC47864LCk.parseFromJson(c16l);
                } else if ("downsized_medium".equals(A0s)) {
                    obj.A04 = AbstractC47864LCk.parseFromJson(c16l);
                } else if ("downsized_large".equals(A0s)) {
                    obj.A03 = AbstractC47864LCk.parseFromJson(c16l);
                } else if ("original".equals(A0s)) {
                    obj.A05 = AbstractC47864LCk.parseFromJson(c16l);
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
