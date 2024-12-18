package X;

import com.instagram.business.promote.model.InstagramPromoteSuggestionReason;
import com.instagram.business.promote.model.SuggestedPromotion;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* renamed from: X.VRo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68458VRo {
    /* JADX WARN: Type inference failed for: r1v1, types: [com.instagram.business.promote.model.SuggestedPromotion, java.lang.Object] */
    public static SuggestedPromotion parseFromJson(C16L c16l) {
        InstagramPromoteSuggestionReason instagramPromoteSuggestionReason;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("display_title".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    obj.A03 = A0m;
                } else if ("organic_media_igid".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    obj.A05 = A0m2;
                } else if ("organic_media_fbid".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    obj.A04 = A0m3;
                } else if ("thumbnail_url".equals(A0s)) {
                    SimpleImageUrl A00 = AbstractC222616c.A00(c16l);
                    C14360o3.A0B(A00, 0);
                    obj.A01 = A00;
                } else if ("reason".equals(A0s)) {
                    String A1Q = c16l.A1Q();
                    if (A1Q != null && A1Q.length() != 0) {
                        if (A1Q.equalsIgnoreCase("MOST_COMMENTS")) {
                            instagramPromoteSuggestionReason = InstagramPromoteSuggestionReason.A02;
                        } else if (A1Q.equalsIgnoreCase("MOST_ENGAGEMENT")) {
                            instagramPromoteSuggestionReason = InstagramPromoteSuggestionReason.A03;
                        } else if (A1Q.equalsIgnoreCase("MOST_LIKES")) {
                            instagramPromoteSuggestionReason = InstagramPromoteSuggestionReason.A04;
                        } else if (A1Q.equalsIgnoreCase("MOST_LIKES_LAST_28D")) {
                            instagramPromoteSuggestionReason = InstagramPromoteSuggestionReason.A05;
                        } else if (A1Q.equalsIgnoreCase("MOST_REACH")) {
                            instagramPromoteSuggestionReason = InstagramPromoteSuggestionReason.A06;
                        } else if (A1Q.equalsIgnoreCase("MOST_RECENT")) {
                            instagramPromoteSuggestionReason = InstagramPromoteSuggestionReason.A07;
                        }
                        obj.A00 = instagramPromoteSuggestionReason;
                    }
                    instagramPromoteSuggestionReason = InstagramPromoteSuggestionReason.A08;
                    obj.A00 = instagramPromoteSuggestionReason;
                } else if (AbstractC111324zv.A00(2289).equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
