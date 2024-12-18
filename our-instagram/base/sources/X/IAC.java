package X;

import com.instagram.api.schemas.ScheduledLiveAffiliateInfoImpl;
import com.instagram.api.schemas.ScheduledLiveDiscountInfoImpl;
import com.instagram.user.model.ProductCollectionImpl;
import com.instagram.user.model.ProductWrapper;
import com.instagram.user.model.ScheduledLiveProductsMetadata;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class IAC {
    public static ScheduledLiveProductsMetadata parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ScheduledLiveAffiliateInfoImpl scheduledLiveAffiliateInfoImpl = null;
            ProductCollectionImpl productCollectionImpl = null;
            ScheduledLiveDiscountInfoImpl scheduledLiveDiscountInfoImpl = null;
            User user = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("affiliate_info".equals(A0s)) {
                    scheduledLiveAffiliateInfoImpl = AbstractC40224Hsn.parseFromJson(c16l);
                } else if ("collection_metadata".equals(A0s)) {
                    productCollectionImpl = IT1.parseFromJson(c16l);
                } else if ("discount_info".equals(A0s)) {
                    scheduledLiveDiscountInfoImpl = AbstractC40226Hsp.parseFromJson(c16l);
                } else if ("merchant".equals(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if ("products".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            ProductWrapper parseFromJson = IT2.parseFromJson(c16l);
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
            return new ScheduledLiveProductsMetadata(scheduledLiveAffiliateInfoImpl, scheduledLiveDiscountInfoImpl, productCollectionImpl, user, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
