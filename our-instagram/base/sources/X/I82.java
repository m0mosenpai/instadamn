package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I82 {
    public static C41163IKc parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C41163IKc c41163IKc = new C41163IKc();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("endpoint".equals(A0s)) {
                    c41163IKc.A09 = I3O.parseFromJson(c16l);
                } else if ("merchant".equals(A0s)) {
                    c41163IKc.A0B = AbstractC40846I7w.parseFromJson(c16l);
                } else if ("search".equals(A0s)) {
                    c41163IKc.A00 = AbstractC40239Ht3.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1F(A0s)) {
                    c41163IKc.A05 = AbstractC40845I7v.parseFromJson(c16l);
                } else if ("product".equals(A0s)) {
                    c41163IKc.A02 = I80.parseFromJson(c16l);
                } else if ("igtv".equals(A0s)) {
                    c41163IKc.A01 = AbstractC40843I7t.parseFromJson(c16l);
                } else if ("product_collection".equals(A0s)) {
                    c41163IKc.A08 = AbstractC40849I7z.parseFromJson(c16l);
                } else if ("module".equals(A0s)) {
                    c41163IKc.A07 = AbstractC40847I7x.parseFromJson(c16l);
                } else if ("account_seeded_channel".equals(A0s)) {
                    c41163IKc.A06 = AbstractC40841I7r.parseFromJson(c16l);
                } else if ("unseeded_channel".equals(A0s)) {
                    c41163IKc.A04 = I81.parseFromJson(c16l);
                } else if ("ads_rediscovery".equals(A0s)) {
                    c41163IKc.A0A = AbstractC40842I7s.parseFromJson(c16l);
                } else if ("ig_funded_incentive".equals(A0s)) {
                    c41163IKc.A03 = AbstractC40844I7u.parseFromJson(c16l);
                } else if ("deeplink".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                }
                c16l.A0z();
            }
            return c41163IKc;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
