package X;

import com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl;
import com.instagram.user.model.ProductCollectionImpl;
import com.instagram.user.model.UpcomingDropCampaignEventMetadataImpl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class IAF {
    public static UpcomingDropCampaignEventMetadataImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ProductCollectionImpl productCollectionImpl = null;
            UpcomingEventMediaImpl upcomingEventMediaImpl = null;
            String str = null;
            String str2 = null;
            User user = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("collection_metadata".equals(A0s)) {
                    productCollectionImpl = IT1.parseFromJson(c16l);
                } else if ("cover_media".equals(A0s)) {
                    upcomingEventMediaImpl = IRM.parseFromJson(c16l);
                } else if ("drop_campaign_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("launch_type_subtitle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("merchant".equals(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if ("products".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1L(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("drop_campaign_id", c16l, "UpcomingDropCampaignEventMetadataImpl");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (user == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("merchant", c16l, "UpcomingDropCampaignEventMetadataImpl");
                } else if (arrayList == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("products", c16l, "UpcomingDropCampaignEventMetadataImpl");
                } else {
                    return new UpcomingDropCampaignEventMetadataImpl(upcomingEventMediaImpl, productCollectionImpl, user, str, str2, arrayList);
                }
            } else {
                AbstractC166997dE.A1V("launch_type_subtitle", c16l, "UpcomingDropCampaignEventMetadataImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
