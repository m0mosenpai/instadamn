package X;

import java.io.IOException;

/* renamed from: X.HrI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40149HrI {
    public static H4Y parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Float f = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("count".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("font_size".equals(A0s)) {
                    f = AbstractC167007dF.A0b(c16l);
                } else if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("count", c16l, "PollCreateModeStickerTallyImpl");
            } else if (f != null || !(c16l instanceof C07950bF)) {
                if (str == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("text", c16l, "PollCreateModeStickerTallyImpl");
                } else {
                    return new H4Y(str, num.intValue(), f.floatValue());
                }
            } else {
                AbstractC166997dE.A1V("font_size", c16l, "PollCreateModeStickerTallyImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
