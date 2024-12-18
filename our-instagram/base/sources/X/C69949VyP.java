package X;

import java.io.IOException;

/* renamed from: X.VyP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69949VyP {
    public static V40 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            V40 v40 = new V40();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("business_manager".equals(A0q)) {
                    v40.A00 = VUK.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return v40;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
