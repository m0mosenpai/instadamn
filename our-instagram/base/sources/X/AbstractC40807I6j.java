package X;

import java.io.IOException;

/* renamed from: X.I6j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40807I6j {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.IFT] */
    public static IFT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37304Gc5.A1Z(c16l, A0q)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("secondary_link".equals(A0q)) {
                    obj.A00 = I76.parseFromJson(c16l);
                } else if ("shop_info".equals(A0q)) {
                    obj.A01 = I8J.parseFromJson(c16l);
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
