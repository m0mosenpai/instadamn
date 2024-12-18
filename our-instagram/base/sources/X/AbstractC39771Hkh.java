package X;

import java.io.IOException;

/* renamed from: X.Hkh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39771Hkh {
    public static H2P parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            C914346k c914346k = null;
            String str2 = null;
            String str3 = null;
            H2Q h2q = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("app_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("bloks_data".equals(A0s)) {
                    c914346k = IQ3.parseFromJson(c16l);
                } else if ("bloks_sticker_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("sticker_data".equals(A0s)) {
                    h2q = AbstractC39774Hkk.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new H2P(h2q, c914346k, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
