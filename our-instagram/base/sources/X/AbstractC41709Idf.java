package X;

import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.ProductTileProductImpl;
import com.instagram.api.schemas.ProductTileUCILoggingInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;

/* renamed from: X.Idf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41709Idf {
    public static final FBProductItemDetailsDict A01(ProductTile productTile) {
        C14360o3.A0B(productTile, 0);
        ProductTileProductImpl productTileProductImpl = productTile.A02;
        if (productTileProductImpl != null) {
            return productTileProductImpl.A00;
        }
        return null;
    }

    public static final ImageInfo A02(ProductTile productTile) {
        FBProductItemDetailsDict fBProductItemDetailsDict;
        ProductImageContainer C85;
        C14360o3.A0B(productTile, 0);
        Product product = productTile.A07;
        if (product != null) {
            return product.A08;
        }
        ProductTileProductImpl productTileProductImpl = productTile.A02;
        if (productTileProductImpl == null || (fBProductItemDetailsDict = productTileProductImpl.A00) == null || (C85 = fBProductItemDetailsDict.C85()) == null) {
            return null;
        }
        return C85.BGx();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Zx, X.GxW] */
    public static final C38570GxW A00(ProductTileUCILoggingInfo productTileUCILoggingInfo) {
        ?? c0Zx = new C0Zx();
        String CC8 = productTileUCILoggingInfo.CC8();
        String str = "";
        if (CC8 == null) {
            CC8 = "";
        }
        c0Zx.A06("uci_request_id", CC8);
        c0Zx.A05("ranking_unit_id", Long.valueOf(productTileUCILoggingInfo.BkI()));
        c0Zx.A05("user_id_for_use_in_shops", Long.valueOf(productTileUCILoggingInfo.CDt()));
        String BkD = productTileUCILoggingInfo.BkD();
        if (BkD == null) {
            BkD = "";
        }
        c0Zx.A06("ranking_extra_data", BkD);
        String BkF = productTileUCILoggingInfo.BkF();
        if (BkF == null) {
            BkF = "";
        }
        c0Zx.A06(AbstractC111324zv.A00(1204), BkF);
        String Bh0 = productTileUCILoggingInfo.Bh0();
        if (Bh0 != null) {
            str = Bh0;
        }
        c0Zx.A06("product_finder_logging_blob", str);
        return c0Zx;
    }

    public static final boolean A03(UserSession userSession, ProductTile productTile) {
        FBProductItemDetailsDict fBProductItemDetailsDict;
        C1563670g A00;
        InterfaceC76653cC c42727IvN;
        AbstractC167017dG.A1N(productTile, userSession);
        ProductDetailsProductItemDict productDetailsProductItemDict = productTile.A08;
        ProductTileProductImpl productTileProductImpl = productTile.A02;
        if (productTileProductImpl != null) {
            fBProductItemDetailsDict = productTileProductImpl.A00;
        } else {
            fBProductItemDetailsDict = null;
        }
        if (productTile.A07 != null && productDetailsProductItemDict != null) {
            A00 = AbstractC1563570f.A00(userSession);
            c42727IvN = AbstractC38048Gob.A01(productDetailsProductItemDict);
        } else if (fBProductItemDetailsDict != null) {
            A00 = AbstractC1563570f.A00(userSession);
            c42727IvN = new C42727IvN(fBProductItemDetailsDict);
        } else {
            return false;
        }
        return A00.A03(c42727IvN);
    }
}
