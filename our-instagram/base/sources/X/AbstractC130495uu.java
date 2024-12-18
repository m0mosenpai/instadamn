package X;

import java.io.IOException;

/* renamed from: X.5uu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC130495uu {
    public static C130505uv parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C130505uv c130505uv = new C130505uv();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("channel".equals(A0q)) {
                    c130505uv.A02 = AbstractC40603HzN.parseFromJson(c16l);
                } else if ("media".equals(A0q)) {
                    c130505uv.A0A = C38321qM.A0h.A0B(c16l, true);
                } else if ("account_recs_3up".equals(A0q)) {
                    c130505uv.A0C = I0Z.parseFromJson(c16l);
                } else if ("account_rec".equals(A0q)) {
                    c130505uv.A01 = AbstractC33708Euw.parseFromJson(c16l);
                } else if ("igtv".equals(A0q)) {
                    c130505uv.A05 = AbstractC40606HzQ.parseFromJson(c16l);
                } else if ("shopping".equals(A0q)) {
                    c130505uv.A09 = AbstractC40624Hzi.parseFromJson(c16l);
                } else if ("rec_cover".equals(A0q)) {
                    c130505uv.A04 = F7H.parseFromJson(c16l);
                } else if ("media_location_map".equals(A0q)) {
                    c130505uv.A08 = VT0.parseFromJson(c16l);
                } else if ("clips".equals(A0q)) {
                    c130505uv.A03 = AbstractC130525ux.parseFromJson(c16l);
                } else if ("guide".equals(A0q)) {
                    c130505uv.A0D = I1E.parseFromJson(c16l);
                } else if ("media_or_ad".equals(A0q)) {
                    c130505uv.A0B = C38321qM.A0h.A0B(c16l, true);
                } else if ("interest_keyword_recommendation".equals(A0q)) {
                    c130505uv.A06 = AbstractC40610HzU.parseFromJson(c16l);
                } else if ("interest_keyword_recommendations".equals(A0q)) {
                    c130505uv.A0E = AbstractC54057NvH.parseFromJson(c16l);
                } else if ("topic_tile".equals(A0q)) {
                    c130505uv.A07 = AbstractC40612HzW.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            c130505uv.A01();
            return c130505uv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
