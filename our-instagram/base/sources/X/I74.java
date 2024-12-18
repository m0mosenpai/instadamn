package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I74 {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.ICv, java.lang.Object] */
    public static C40974ICv parseFromJson(C16L c16l) {
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
