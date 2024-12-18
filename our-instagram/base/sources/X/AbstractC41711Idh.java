package X;

import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.ProductTileLabel;
import com.instagram.api.schemas.ProductTileLabelType;
import com.instagram.api.schemas.ProductTileMetadataImpl;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Idh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41711Idh {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (java.lang.Integer.valueOf(r5) == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.INN A01(com.instagram.api.schemas.ProductTileProductNameLabelOptions r5, java.lang.String r6) {
        /*
            r1 = 0
            r0 = 9
            X.DHI r2 = new X.DHI
            r2.<init>(r6, r0)
            r0 = 38
            X.JEc r3 = X.C43361JEc.A01(r5, r0)
            r0 = 23
            X.BIf r4 = new X.BIf
            r4.<init>(r1, r0)
            if (r5 == 0) goto L21
            int r5 = r5.BXi()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            if (r0 != 0) goto L22
        L21:
            r5 = 2
        L22:
            r1 = 0
            X.INN r0 = new X.INN
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41711Idh.A01(com.instagram.api.schemas.ProductTileProductNameLabelOptions, java.lang.String):X.INN");
    }

    public static final String A02(ProductTile productTile) {
        ProductTileMetadataImpl productTileMetadataImpl;
        List list;
        ProductTileLabel productTileLabel;
        ProductTileLabelType BL0;
        if (productTile == null || (productTileMetadataImpl = productTile.A01) == null || (list = productTileMetadataImpl.A01) == null || (productTileLabel = (ProductTileLabel) AbstractC001800i.A0L(list)) == null || (BL0 = productTileLabel.BL0()) == null) {
            return null;
        }
        int ordinal = BL0.ordinal();
        if (ordinal != 1) {
            if (ordinal == 16) {
                return "webclick";
            }
            return null;
        }
        return "add_to_bag";
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r2 = X.C43346JDn.A00;
        r4 = X.C43361JEc.A01(r6, 34);
        r0 = 2131976847;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r3.A08(r8) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.INN A00(android.view.View.OnClickListener r5, android.view.View.OnClickListener r6, com.instagram.common.session.UserSession r7, com.instagram.user.model.Product r8) {
        /*
            X.70Y r3 = X.C70Y.A00(r7)
            if (r8 == 0) goto L5b
            java.lang.String r4 = r8.A0H
            if (r4 == 0) goto L5b
            com.instagram.common.session.UserSession r2 = r3.A06
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            X.J8N r1 = X.J8N.A00
            java.lang.Class<X.Ip5> r0 = X.C42343Ip5.class
            java.lang.Object r0 = r2.A01(r0, r1)
            X.Ip5 r0 = (X.C42343Ip5) r0
            java.util.LinkedHashMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r4)
            com.instagram.model.shopping.ProductGroup r0 = (com.instagram.model.shopping.ProductGroup) r0
            if (r0 == 0) goto L54
            java.util.List r0 = r0.A00()
            java.util.Iterator r1 = r0.iterator()
        L2c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L54
            com.instagram.user.model.Product r0 = X.AbstractC37300Gc1.A0L(r1)
            boolean r0 = r3.A08(r0)
            if (r0 == 0) goto L2c
        L3c:
            X.JDn r2 = X.C43346JDn.A00
            r0 = 34
            X.JEc r4 = X.C43361JEc.A01(r6, r0)
            r0 = 2131976847(0x7f13628f, float:1.9590826E38)
        L47:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.JE0 r3 = X.JE0.A00
            r5 = 1
            X.INN r0 = new X.INN
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L54:
            boolean r0 = r3.A08(r8)
            if (r0 == 0) goto L5b
            goto L3c
        L5b:
            X.JDo r2 = X.C43347JDo.A00
            r0 = 35
            X.JEc r4 = X.C43361JEc.A01(r5, r0)
            r0 = 2131952364(0x7f1302ec, float:1.9541169E38)
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41711Idh.A00(android.view.View$OnClickListener, android.view.View$OnClickListener, com.instagram.common.session.UserSession, com.instagram.user.model.Product):X.INN");
    }

    public static final String A03(ProductTile productTile) {
        User user;
        FBProductItemDetailsDict A01 = AbstractC41709Idf.A01(productTile);
        if (A01 != null) {
            String Bb3 = A01.Bb3();
            if (Bb3 == null) {
                return "";
            }
            return Bb3;
        }
        Product product = productTile.A07;
        if (product != null && (user = product.A0B) != null) {
            return user.getUsername();
        }
        throw AbstractC166987dD.A14("This ProductFeedItem does not contain a product.");
    }
}
