package X;

import com.instagram.api.schemas.IntentAwareAdsInfo;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HlS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39818HlS {
    public static C38697H2i parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            IntentAwareAdsInfo intentAwareAdsInfo = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("intent_aware_ads_info".equals(A0s)) {
                    intentAwareAdsInfo = ION.parseFromJson(c16l);
                } else if ("multi_ads_media_items".equals(A0s)) {
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
                }
                c16l.A0z();
            }
            if (intentAwareAdsInfo == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("intent_aware_ads_info", c16l, "ClipsMultiAdsResponseItem");
            } else if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("multi_ads_media_items", c16l, "ClipsMultiAdsResponseItem");
            } else {
                return new C38697H2i(intentAwareAdsInfo, arrayList);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
