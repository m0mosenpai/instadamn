package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I1A {
    /* JADX WARN: Type inference failed for: r0v5, types: [X.ICL, java.lang.Object] */
    public static ICL parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC37301Gc2.A1V(c16l, c16l.A0q())) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (str != null) {
                obj.A00 = str;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
