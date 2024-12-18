package X;

import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.api.schemas.ProductTileMetadataImpl;
import com.instagram.api.schemas.ProductTileProductImpl;
import com.instagram.api.schemas.ProductTileUCILoggingInfoImpl;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;

/* renamed from: X.I3v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40741I3v {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, com.instagram.model.shopping.productfeed.ProductTile] */
    public static ProductTile parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            ProductTileProductImpl productTileProductImpl = null;
            ProductCardSubtitleType productCardSubtitleType = null;
            ProductTileMetadataImpl productTileMetadataImpl = null;
            C38321qM c38321qM = null;
            RankingInfo rankingInfo = null;
            ProductTileUCILoggingInfoImpl productTileUCILoggingInfoImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("micro_product".equals(A0s)) {
                    productDetailsProductItemDict = AbstractC111134zU.parseFromJson(c16l);
                } else if ("product".equals(A0s)) {
                    productTileProductImpl = AbstractC40187Hrz.parseFromJson(c16l);
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
                } else if ("product_metadata".equals(A0s)) {
                    productTileMetadataImpl = AbstractC40185Hrx.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1F(A0s)) {
                    c38321qM = C38321qM.A00(c16l);
                } else if ("ranking_info".equals(A0s)) {
                    rankingInfo = AbstractC40203HsS.parseFromJson(c16l);
                } else if ("uci_logging_info".equals(A0s)) {
                    productTileUCILoggingInfoImpl = Hs1.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (productDetailsProductItemDict != null) {
                obj.A08 = productDetailsProductItemDict;
            }
            if (productTileProductImpl != null) {
                obj.A02 = productTileProductImpl;
            }
            if (productCardSubtitleType != null) {
                obj.A00 = productCardSubtitleType;
            }
            if (productTileMetadataImpl != null) {
                obj.A01 = productTileMetadataImpl;
            }
            if (c38321qM != null) {
                obj.A05 = c38321qM;
            }
            if (rankingInfo != null) {
                obj.A04 = rankingInfo;
            }
            if (productTileUCILoggingInfoImpl != null) {
                obj.A03 = productTileUCILoggingInfoImpl;
            }
            ProductDetailsProductItemDict productDetailsProductItemDict2 = obj.A08;
            Product product = null;
            if (productDetailsProductItemDict2 != null) {
                product = new Product(null, productDetailsProductItemDict2);
            }
            obj.A07 = product;
            if (obj.A00 == ProductCardSubtitleType.A0F) {
                obj.A00 = ProductCardSubtitleType.A05;
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
