package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IAX {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.IHV] */
    public static IHV parseFromJson(C16L c16l) {
        String A1P;
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
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    obj.A02 = A1P;
                } else if (AbstractC37300Gc1.A1L(A0q)) {
                    obj.A00 = AbstractC40571Hyr.parseFromJson(c16l);
                } else if ("icon_url".equals(A0q)) {
                    obj.A01 = AbstractC222616c.A00(c16l);
                } else if ("timestamp".equals(A0q)) {
                    c16l.A0y();
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
