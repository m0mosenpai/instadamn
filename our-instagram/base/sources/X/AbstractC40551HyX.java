package X;

import com.instagram.api.schemas.IntentAwareAdsInfo;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HyX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40551HyX {
    public static IEG parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            IntentAwareAdsInfo intentAwareAdsInfo = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("multi_ads_media_items".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38252Grv parseFromJson = AbstractC38251Gru.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("intent_aware_ads_info".equals(A0s)) {
                    intentAwareAdsInfo = ION.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            IEG ieg = new IEG();
            if (arrayList != null) {
                ieg.A01 = arrayList;
            }
            if (intentAwareAdsInfo != null) {
                ieg.A00 = intentAwareAdsInfo;
            }
            return ieg;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
