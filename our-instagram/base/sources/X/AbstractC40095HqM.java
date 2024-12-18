package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HqM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40095HqM {
    public static H4L parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            Integer num = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("multi_ad_media_items".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C37471Gep parseFromJson = AbstractC37470Geo.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("multi_ads_type".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("multi_ads_unit_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("multi_ad_media_items", c16l, "MultiSubmitLeadAdResponse");
            } else if (num != null || !(c16l instanceof C07950bF)) {
                if (str == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("multi_ads_unit_id", c16l, "MultiSubmitLeadAdResponse");
                } else {
                    return new H4L(arrayList, num.intValue(), str);
                }
            } else {
                AbstractC166997dE.A1V("multi_ads_type", c16l, "MultiSubmitLeadAdResponse");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
