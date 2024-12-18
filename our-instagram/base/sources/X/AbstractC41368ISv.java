package X;

import com.instagram.api.schemas.AdsRatingAndReviewStarType;
import com.instagram.sponsored.signals.model.AdsIAWRatingInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ISv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41368ISv {
    public static AdsIAWRatingInfo parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            ArrayList arrayList = null;
            Float f = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("banner_display_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_detail_page_enabled".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("rating_and_review_stars".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
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
                } else if ("rating_score".equals(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, "review_count");
                }
                c16l.A0z();
            }
            return new AdsIAWRatingInfo(bool, f, num, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, AdsIAWRatingInfo adsIAWRatingInfo) {
        anonymousClass182.A0d();
        String str = adsIAWRatingInfo.A03;
        if (str != null) {
            anonymousClass182.A0S("banner_display_text", str);
        }
        Boolean bool = adsIAWRatingInfo.A00;
        if (bool != null) {
            anonymousClass182.A0T("is_detail_page_enabled", bool.booleanValue());
        }
        List list = adsIAWRatingInfo.A04;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "rating_and_review_stars", list);
            while (A0q.hasNext()) {
                AdsRatingAndReviewStarType adsRatingAndReviewStarType = (AdsRatingAndReviewStarType) A0q.next();
                if (adsRatingAndReviewStarType != null) {
                    anonymousClass182.A0u(adsRatingAndReviewStarType.A00);
                }
            }
            anonymousClass182.A0Z();
        }
        Float f = adsIAWRatingInfo.A01;
        if (f != null) {
            anonymousClass182.A0P("rating_score", f.floatValue());
        }
        Integer num = adsIAWRatingInfo.A02;
        if (num != null) {
            anonymousClass182.A0Q("review_count", num.intValue());
        }
        anonymousClass182.A0a();
    }
}
