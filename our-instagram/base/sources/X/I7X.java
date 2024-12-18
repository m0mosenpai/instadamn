package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I7X {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.IFb, java.lang.Object] */
    public static C41032IFb parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("currency".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, "offset");
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (str != null) {
                obj.A01 = str;
            }
            if (num != null) {
                obj.A00 = num.intValue();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
