package X;

import com.instagram.api.schemas.AdsRatingAndReviewStarType;
import com.instagram.api.schemas.CommerceReviewStatisticsDictIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hlv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39847Hlv {
    public static Map A00(CommerceReviewStatisticsDictIntf commerceReviewStatisticsDictIntf) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (commerceReviewStatisticsDictIntf.Aen() != null) {
            A1I.put("average_rating", AbstractC166997dE.A0f(commerceReviewStatisticsDictIntf.Aen()));
        }
        if (commerceReviewStatisticsDictIntf.BkS() != null) {
            List<AdsRatingAndReviewStarType> BkS = commerceReviewStatisticsDictIntf.BkS();
            if (BkS != null) {
                arrayList = AbstractC167017dG.A0q(BkS);
                for (AdsRatingAndReviewStarType adsRatingAndReviewStarType : BkS) {
                    C14360o3.A0B(adsRatingAndReviewStarType, 0);
                    arrayList.add(adsRatingAndReviewStarType.A00);
                }
            } else {
                arrayList = null;
            }
            A1I.put(AbstractC111324zv.A00(512), arrayList);
        }
        if (commerceReviewStatisticsDictIntf.BpC() != null) {
            A1I.put("review_count", commerceReviewStatisticsDictIntf.BpC());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
