package X;

import java.io.IOException;

/* renamed from: X.Ibs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41660Ibs {
    public static HB3 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            HB3 hb3 = new HB3();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                A00(c16l, hb3, AbstractC166997dE.A0s(c16l));
                c16l.A0z();
            }
            return hb3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(C16L c16l, HB3 hb3, String str) {
        if ("metadata".equals(str)) {
            hb3.A01 = AbstractC40740I3u.parseFromJson(c16l);
            return;
        }
        if ("product_feed".equals(str)) {
            hb3.A02 = IRD.parseFromJson(c16l);
        } else if ("ig_funded_incentive_content".equals(str)) {
            hb3.A00 = AbstractC40723I3d.parseFromJson(c16l);
        } else {
            C55702hA.A01(c16l, hb3, str);
        }
    }
}
