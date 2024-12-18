package X;

import java.io.IOException;

/* renamed from: X.INh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41241INh {
    public static C109894xH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                if ("disclosure_tag".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C109894xH(str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C109894xH c109894xH) {
        anonymousClass182.A0d();
        String str = c109894xH.A00;
        if (str != null) {
            anonymousClass182.A0S("disclosure_tag", str);
        }
        anonymousClass182.A0a();
    }
}
