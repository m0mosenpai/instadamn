package X;

import java.io.IOException;

/* renamed from: X.1r7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC38751r7 {
    public static C37881pR parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("ad_pod_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("index_in_ad_pod".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("num_ads_in_ad_pod".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("ad_pod_id", "AdPodRules");
            } else if (num != null || !(c16l instanceof C07950bF)) {
                if (num2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("num_ads_in_ad_pod", "AdPodRules");
                } else {
                    return new C37881pR(str, num.intValue(), num2.intValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("index_in_ad_pod", "AdPodRules");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C37881pR c37881pR) {
        anonymousClass182.A0d();
        String str = c37881pR.A02;
        if (str != null) {
            anonymousClass182.A0S("ad_pod_id", str);
        }
        anonymousClass182.A0Q("index_in_ad_pod", c37881pR.A00);
        anonymousClass182.A0Q("num_ads_in_ad_pod", c37881pR.A01);
        anonymousClass182.A0a();
    }
}
