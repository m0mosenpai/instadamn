package X;

import java.io.IOException;

/* renamed from: X.Eu4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33654Eu4 {
    /* JADX WARN: Type inference failed for: r0v6, types: [X.EtA, java.lang.Object] */
    public static C33598EtA parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Float f = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("key".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("time".equals(A0s)) {
                    f = Float.valueOf((float) c16l.A0U());
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("key", c16l, "SystemMessage");
            } else if (f == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("time", c16l, "SystemMessage");
            } else {
                float floatValue = f.floatValue();
                C14360o3.A0B(str, 1);
                ?? obj = new Object();
                obj.A01 = str;
                obj.A00 = floatValue;
                return obj;
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
