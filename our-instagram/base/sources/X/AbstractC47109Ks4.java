package X;

import java.io.IOException;

/* renamed from: X.Ks4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47109Ks4 {
    /* JADX WARN: Type inference failed for: r0v6, types: [X.Khy, java.lang.Object] */
    public static C46499Khy parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C46496Khv c46496Khv = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C47105Ks0 c47105Ks0 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("giphy_gifs".equals(A0s)) {
                    c46496Khv = AbstractC47107Ks2.parseFromJson(c16l);
                } else if ("cutout_stickers".equals(A0s)) {
                    c47105Ks0 = AbstractC47106Ks1.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            obj.A01 = c46496Khv;
            obj.A00 = c47105Ks0;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
