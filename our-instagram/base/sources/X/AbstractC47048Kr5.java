package X;

import java.io.IOException;

/* renamed from: X.Kr5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47048Kr5 {
    public static C47455Kxk parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C47455Kxk c47455Kxk = new C47455Kxk();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("target_effect_preview".equals(AbstractC166997dE.A0s(c16l))) {
                    c47455Kxk.A00 = AbstractC47047Kr4.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c47455Kxk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
