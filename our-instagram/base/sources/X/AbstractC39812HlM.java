package X;

import com.instagram.api.schemas.AssetRecommendationType;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* renamed from: X.HlM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39812HlM {
    public static C38693H2e parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            AssetRecommendationType assetRecommendationType = null;
            SimpleImageUrl simpleImageUrl = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("asset_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("asset_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("asset_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    assetRecommendationType = (AssetRecommendationType) AssetRecommendationType.A01.get(A1P);
                    if (assetRecommendationType == null) {
                        assetRecommendationType = AssetRecommendationType.A06;
                    }
                } else if ("cover_artwork_thumbnail_uri".equals(A0s)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                } else if ("extra".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("asset_id", c16l, "ClipsAssetRecommendationMetadataImpl");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (assetRecommendationType == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("asset_type", c16l, "ClipsAssetRecommendationMetadataImpl");
                } else {
                    return new C38693H2e(assetRecommendationType, simpleImageUrl, str, str2, str3);
                }
            } else {
                AbstractC166997dE.A1V("asset_name", c16l, "ClipsAssetRecommendationMetadataImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
