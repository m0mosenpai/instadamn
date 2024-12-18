package X;

import java.io.IOException;

/* renamed from: X.F7c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34204F7c {
    /* JADX WARN: Type inference failed for: r3v1, types: [X.Et1, java.lang.Object] */
    public static C33589Et1 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("button_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("social_context".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            obj.A00 = str;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
