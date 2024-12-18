package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VVE {
    /* JADX WARN: Type inference failed for: r4v1, types: [X.VJS, java.lang.Object] */
    public static VJS parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C69134ViP c69134ViP = null;
            String str = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("button".equals(A0s)) {
                    c69134ViP = VVD.parseFromJson(c16l);
                } else if ("state_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("country_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("country_code".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("region_code".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                }
                c16l.A0z();
            }
            if (c69134ViP == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("button", c16l, "StateSelectorInfo");
                throw C00O.createAndThrow();
            }
            ?? obj = new Object();
            obj.A00 = c69134ViP;
            obj.A02 = str;
            obj.A01 = str2;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
