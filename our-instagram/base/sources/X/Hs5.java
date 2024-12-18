package X;

import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.api.schemas.ProductTileMetadataImpl;
import com.instagram.api.schemas.ProductTileProductImpl;
import com.instagram.api.schemas.ProductTileUCILoggingInfoImpl;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class Hs5 {
    public static C38746H4m parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C38321qM c38321qM = null;
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            ProductTileProductImpl productTileProductImpl = null;
            ProductTileMetadataImpl productTileMetadataImpl = null;
            RankingInfo rankingInfo = null;
            ProductCardSubtitleType productCardSubtitleType = null;
            ProductTileUCILoggingInfoImpl productTileUCILoggingInfoImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37300Gc1.A1F(A0s)) {
                    c38321qM = C38321qM.A00(c16l);
                } else if ("micro_product".equals(A0s)) {
                    productDetailsProductItemDict = AbstractC111134zU.parseFromJson(c16l);
                } else if ("product".equals(A0s)) {
                    productTileProductImpl = AbstractC40187Hrz.parseFromJson(c16l);
                } else if ("product_metadata".equals(A0s)) {
                    productTileMetadataImpl = AbstractC40185Hrx.parseFromJson(c16l);
                } else if ("ranking_info".equals(A0s)) {
                    rankingInfo = AbstractC40203HsS.parseFromJson(c16l);
                } else if ("subtitle_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    productCardSubtitleType = (ProductCardSubtitleType) ProductCardSubtitleType.A01.get(A1P);
                    if (productCardSubtitleType == null) {
                        productCardSubtitleType = ProductCardSubtitleType.A0F;
                    }
                } else if ("uci_logging_info".equals(A0s)) {
                    productTileUCILoggingInfoImpl = Hs1.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C38746H4m(productCardSubtitleType, productTileMetadataImpl, productTileProductImpl, productTileUCILoggingInfoImpl, rankingInfo, c38321qM, productDetailsProductItemDict);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
