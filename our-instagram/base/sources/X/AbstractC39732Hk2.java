package X;

import com.instagram.api.schemas.AdsRatingAndReviewStarType;

/* renamed from: X.Hk2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39732Hk2 {
    public static final AdsRatingAndReviewStarType A00(String str) {
        AdsRatingAndReviewStarType adsRatingAndReviewStarType = (AdsRatingAndReviewStarType) AdsRatingAndReviewStarType.A01.get(str);
        if (adsRatingAndReviewStarType == null) {
            return AdsRatingAndReviewStarType.A07;
        }
        return adsRatingAndReviewStarType;
    }
}
