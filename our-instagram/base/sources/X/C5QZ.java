package X;

import com.instagram.api.schemas.AdsRatingAndReviewDisplayFormat;
import com.instagram.api.schemas.AdsRatingAndReviewStarType;
import com.instagram.sponsored.signals.model.AdsRatingInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5QZ, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5QZ {
    public static AdsRatingInfo parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            AdsRatingAndReviewDisplayFormat adsRatingAndReviewDisplayFormat = null;
            ArrayList arrayList = null;
            Float f = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("display_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_iaw_banner_enabled".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("rating_and_review_display_format".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    adsRatingAndReviewDisplayFormat = (AdsRatingAndReviewDisplayFormat) AdsRatingAndReviewDisplayFormat.A01.get(A1P2);
                    if (adsRatingAndReviewDisplayFormat == null) {
                        adsRatingAndReviewDisplayFormat = AdsRatingAndReviewDisplayFormat.A0B;
                    }
                } else if ("rating_and_review_stars".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P = null;
                            } else {
                                A1P = c16l.A1P();
                            }
                            arrayList.add(AbstractC39732Hk2.A00(A1P));
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("rating_score".equals(A0q)) {
                    f = new Float(c16l.A0U());
                } else if ("review_count".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return new AdsRatingInfo(adsRatingAndReviewDisplayFormat, bool, f, num, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, AdsRatingInfo adsRatingInfo) {
        anonymousClass182.A0d();
        String str = adsRatingInfo.A04;
        if (str != null) {
            anonymousClass182.A0S("display_text", str);
        }
        Boolean bool = adsRatingInfo.A01;
        if (bool != null) {
            anonymousClass182.A0T("is_iaw_banner_enabled", bool.booleanValue());
        }
        AdsRatingAndReviewDisplayFormat adsRatingAndReviewDisplayFormat = adsRatingInfo.A00;
        if (adsRatingAndReviewDisplayFormat != null) {
            anonymousClass182.A0S("rating_and_review_display_format", adsRatingAndReviewDisplayFormat.A00);
        }
        List<AdsRatingAndReviewStarType> list = adsRatingInfo.A05;
        if (list != null) {
            C16V.A03(anonymousClass182, "rating_and_review_stars");
            for (AdsRatingAndReviewStarType adsRatingAndReviewStarType : list) {
                if (adsRatingAndReviewStarType != null) {
                    anonymousClass182.A0u(adsRatingAndReviewStarType.A00);
                }
            }
            anonymousClass182.A0Z();
        }
        Float f = adsRatingInfo.A02;
        if (f != null) {
            anonymousClass182.A0P("rating_score", f.floatValue());
        }
        Integer num = adsRatingInfo.A03;
        if (num != null) {
            anonymousClass182.A0Q("review_count", num.intValue());
        }
        anonymousClass182.A0a();
    }
}
