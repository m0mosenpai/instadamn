package X;

import com.instagram.api.schemas.AdsRatingAndReviewStarType;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfoIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.I9c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40878I9c {
    public static Map A00(AdsIAWRatingInfoIntf adsIAWRatingInfoIntf) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (adsIAWRatingInfoIntf.AfN() != null) {
            A1I.put("banner_display_text", adsIAWRatingInfoIntf.AfN());
        }
        if (adsIAWRatingInfoIntf.CSY() != null) {
            A1I.put("is_detail_page_enabled", adsIAWRatingInfoIntf.CSY());
        }
        if (adsIAWRatingInfoIntf.BkM() != null) {
            List<AdsRatingAndReviewStarType> BkM = adsIAWRatingInfoIntf.BkM();
            if (BkM != null) {
                arrayList = AbstractC167017dG.A0q(BkM);
                for (AdsRatingAndReviewStarType adsRatingAndReviewStarType : BkM) {
                    C14360o3.A0B(adsRatingAndReviewStarType, 0);
                    arrayList.add(adsRatingAndReviewStarType.A00);
                }
            } else {
                arrayList = null;
            }
            A1I.put("rating_and_review_stars", arrayList);
        }
        if (adsIAWRatingInfoIntf.BkR() != null) {
            A1I.put("rating_score", AbstractC166997dE.A0f(adsIAWRatingInfoIntf.BkR()));
        }
        if (adsIAWRatingInfoIntf.BpC() != null) {
            A1I.put("review_count", adsIAWRatingInfoIntf.BpC());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
