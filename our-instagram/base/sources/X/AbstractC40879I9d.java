package X;

import com.instagram.api.schemas.AdsRatingAndReviewDisplayFormat;
import com.instagram.api.schemas.AdsRatingAndReviewStarType;
import com.instagram.sponsored.signals.model.AdsRatingInfoIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.I9d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40879I9d {
    public static Map A00(AdsRatingInfoIntf adsRatingInfoIntf) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (adsRatingInfoIntf.Ayb() != null) {
            A1I.put("display_text", adsRatingInfoIntf.Ayb());
        }
        if (adsRatingInfoIntf.CW2() != null) {
            A1I.put(AbstractC111324zv.A00(4748), adsRatingInfoIntf.CW2());
        }
        ArrayList arrayList = null;
        if (adsRatingInfoIntf.BkK() != null) {
            AdsRatingAndReviewDisplayFormat BkK = adsRatingInfoIntf.BkK();
            if (BkK != null) {
                str = BkK.A00;
            } else {
                str = null;
            }
            A1I.put(AbstractC111324zv.A00(2947), str);
        }
        if (adsRatingInfoIntf.BkM() != null) {
            List<AdsRatingAndReviewStarType> BkM = adsRatingInfoIntf.BkM();
            if (BkM != null) {
                arrayList = AbstractC167017dG.A0q(BkM);
                for (AdsRatingAndReviewStarType adsRatingAndReviewStarType : BkM) {
                    C14360o3.A0B(adsRatingAndReviewStarType, 0);
                    arrayList.add(adsRatingAndReviewStarType.A00);
                }
            }
            A1I.put("rating_and_review_stars", arrayList);
        }
        if (adsRatingInfoIntf.BkR() != null) {
            A1I.put("rating_score", AbstractC166997dE.A0f(adsRatingInfoIntf.BkR()));
        }
        if (adsRatingInfoIntf.BpC() != null) {
            A1I.put("review_count", adsRatingInfoIntf.BpC());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
