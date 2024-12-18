package X;

import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.ProductTileBannerMetadataDecoration;
import com.instagram.api.schemas.ProductTileMetadataDecorations;
import com.instagram.api.schemas.ProductTileMetadataImpl;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Iej, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41767Iej {
    public static final C41767Iej A00 = new Object();

    public static final ProductTileBannerMetadataDecoration A01(UserSession userSession, ProductFeedItem productFeedItem) {
        ProductTileMetadataImpl productTileMetadataImpl;
        ProductTileMetadataDecorations productTileMetadataDecorations;
        List<ProductTileBannerMetadataDecoration> AfW;
        Product A02;
        User user;
        String A002;
        Object obj;
        ProductTile productTile = productFeedItem.A02;
        if (productTile != null && (productTileMetadataImpl = productTile.A01) != null && (productTileMetadataDecorations = productTileMetadataImpl.A00) != null && (AfW = productTileMetadataDecorations.AfW()) != null) {
            C70Y A003 = C70Y.A00(userSession);
            C14360o3.A07(A003);
            for (ProductTileBannerMetadataDecoration productTileBannerMetadataDecoration : AfW) {
                if (productTileBannerMetadataDecoration.AfU().ordinal() != 3 || (A02 = productFeedItem.A02()) == null || (user = A02.A0B) == null || (A002 = AbstractC76433bn.A00(user)) == null || (((obj = A003.A07.A0A.get(A002)) != EnumC39539HdB.A03 && obj != EnumC39539HdB.A02) || A003.A08(productFeedItem.A02()))) {
                    return productTileBannerMetadataDecoration;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        if (r0 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C39062HHm A02(com.instagram.model.shopping.productfeed.ProductFeedItem r5, boolean r6, boolean r7) {
        /*
            r4 = 0
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            com.instagram.model.shopping.productfeed.ProductTile r0 = r5.A02
            if (r0 == 0) goto L15
            com.instagram.api.schemas.FBProductItemDetailsDict r0 = X.AbstractC41709Idf.A01(r0)
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.BhE()
            if (r0 != 0) goto L1e
        L15:
            com.instagram.user.model.Product r0 = A04(r5)
            java.lang.String r0 = r0.A0J
            X.C14360o3.A0A(r0)
        L1e:
            X.BQO r0 = X.MVZ.A00(r0)
            r3.add(r0)
            if (r7 != 0) goto Lb9
            java.lang.String r1 = A05(r5)
            com.instagram.model.shopping.productfeed.ProductTile r0 = r5.A02
            if (r0 == 0) goto L3b
            com.instagram.api.schemas.FBProductItemDetailsDict r0 = X.AbstractC41709Idf.A01(r0)
            if (r0 == 0) goto L3b
            java.lang.String r0 = r0.BNs()
            if (r0 != 0) goto L44
        L3b:
            com.instagram.user.model.Product r0 = A04(r5)
            java.lang.String r0 = r0.A0G
            X.C14360o3.A0A(r0)
        L44:
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r0}
            r1 = 2131969972(0x7f1347b4, float:1.9576882E38)
            X.BHS r0 = new X.BHS
            r0.<init>(r2, r1)
            r3.add(r0)
            com.instagram.model.shopping.productfeed.ProductTile r0 = r5.A02
            if (r0 == 0) goto Lc6
            com.instagram.api.schemas.FBProductItemDetailsDict r0 = X.AbstractC41709Idf.A01(r0)
            if (r0 == 0) goto Lc6
            java.lang.String r1 = r0.BNr()
            java.lang.String r0 = r0.C2g()
            boolean r0 = X.AbstractC25225BEi.A1a(r1, r0)
        L69:
            if (r0 == 0) goto La1
            com.instagram.model.shopping.productfeed.ProductTile r0 = r5.A02
            if (r0 == 0) goto L89
            com.instagram.api.schemas.FBProductItemDetailsDict r2 = X.AbstractC41709Idf.A01(r0)
            if (r2 == 0) goto L89
            java.lang.String r1 = r2.BNr()
            java.lang.String r0 = r2.C2g()
            boolean r0 = X.AbstractC25225BEi.A1a(r1, r0)
            if (r0 == 0) goto Lc1
            java.lang.String r0 = r2.C2h()
        L87:
            if (r0 != 0) goto L92
        L89:
            com.instagram.user.model.Product r0 = A04(r5)
            java.lang.String r0 = r0.A0L
            X.C14360o3.A0A(r0)
        L92:
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            r1 = 2131969973(0x7f1347b5, float:1.9576884E38)
            X.BHS r0 = new X.BHS
            r0.<init>(r2, r1)
            r3.add(r0)
        La1:
            if (r6 == 0) goto Lb9
            java.lang.String r0 = " "
            X.BQO r0 = X.MVZ.A00(r0)
            r3.add(r0)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r1 = 2131962820(0x7f132bc4, float:1.9562376E38)
            X.BHS r0 = new X.BHS
            r0.<init>(r2, r1)
            r3.add(r0)
        Lb9:
            java.lang.String r1 = ""
            X.HHm r0 = new X.HHm
            r0.<init>(r1, r3)
            return r0
        Lc1:
            java.lang.String r0 = r2.BNs()
            goto L87
        Lc6:
            com.instagram.user.model.Product r0 = A04(r5)
            boolean r0 = r0.A05()
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41767Iej.A02(com.instagram.model.shopping.productfeed.ProductFeedItem, boolean, boolean):X.HHm");
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0295, code lost:
    
        if (r40 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0088, code lost:
    
        if (r1 == com.instagram.api.schemas.ProductCardSubtitleType.A0A) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c8, code lost:
    
        if (r5 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0142, code lost:
    
        if (r7.intValue() <= 0) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C09530e4 A06(com.instagram.api.schemas.ProductCardSubtitleType r32, com.instagram.common.session.UserSession r33, com.instagram.model.shopping.productfeed.ProductFeedItem r34, X.JII r35, java.lang.Integer r36, java.lang.String r37, boolean r38, boolean r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41767Iej.A06(com.instagram.api.schemas.ProductCardSubtitleType, com.instagram.common.session.UserSession, com.instagram.model.shopping.productfeed.ProductFeedItem, X.JII, java.lang.Integer, java.lang.String, boolean, boolean, boolean):X.0e4");
    }

    public static final ProductCardSubtitleType A00(ProductCardSubtitleType productCardSubtitleType, ProductFeedItem productFeedItem) {
        ProductCardSubtitleType productCardSubtitleType2;
        ProductReviewStatus productReviewStatus;
        if (productCardSubtitleType == null) {
            Product A02 = productFeedItem.A02();
            if (A02 != null && (productReviewStatus = A02.A05) != null) {
                int ordinal = productReviewStatus.ordinal();
                if (ordinal != 5) {
                    if (ordinal == 4) {
                        productCardSubtitleType = ProductCardSubtitleType.A04;
                    }
                } else {
                    productCardSubtitleType = ProductCardSubtitleType.A09;
                }
            }
            productCardSubtitleType = ProductCardSubtitleType.A0E;
        }
        ProductTile productTile = productFeedItem.A02;
        if (productTile != null && (productCardSubtitleType2 = productTile.A00) != null && productCardSubtitleType2 != ProductCardSubtitleType.A04 && productCardSubtitleType2 != ProductCardSubtitleType.A09) {
            return productCardSubtitleType2;
        }
        return productCardSubtitleType;
    }

    public static final String A05(ProductFeedItem productFeedItem) {
        String str;
        FBProductItemDetailsDict A01;
        ProductTile productTile = productFeedItem.A02;
        if (productTile != null && (A01 = AbstractC41709Idf.A01(productTile)) != null) {
            String Bb3 = A01.Bb3();
            if (Bb3 == null) {
                return "";
            }
            return Bb3;
        }
        User user = A04(productFeedItem).A0B;
        if (user != null) {
            str = AbstractC37300Gc1.A0U(user);
        } else {
            str = null;
        }
        C14360o3.A0A(str);
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f3, code lost:
    
        if (r14 == null) goto L52;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x007d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0sl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C09530e4 A07(android.view.View.OnClickListener r24, android.view.View.OnClickListener r25, android.view.View.OnClickListener r26, android.view.View.OnClickListener r27, com.instagram.common.session.UserSession r28, com.instagram.model.shopping.productfeed.ProductFeedItem r29) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41767Iej.A07(android.view.View$OnClickListener, android.view.View$OnClickListener, android.view.View$OnClickListener, android.view.View$OnClickListener, com.instagram.common.session.UserSession, com.instagram.model.shopping.productfeed.ProductFeedItem):X.0e4");
    }

    public static Product A04(ProductFeedItem productFeedItem) {
        Product A02 = productFeedItem.A02();
        C14360o3.A0A(A02);
        return A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        if (com.instagram.api.schemas.ProductCardSubtitleType.A04 == r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
    
        if (r2.Bwk() != true) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cf, code lost:
    
        if (r4.Bwl() != true) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dd, code lost:
    
        if (r2.BwD() != true) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e9, code lost:
    
        if (r63.A05(r60) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0115, code lost:
    
        if (r2.BCY() != true) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e8, code lost:
    
        if (r74 == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C42333Iov A03(com.instagram.api.schemas.ProductCardSubtitleType r56, X.C42914IyS r57, X.InterfaceC11380iw r58, X.C19260xA r59, com.instagram.common.session.UserSession r60, com.instagram.common.typedurl.ImageUrl r61, X.C41219IMi r62, com.instagram.model.shopping.productfeed.ProductFeedItem r63, X.JII r64, X.EnumC39541HdD r65, java.lang.Integer r66, java.lang.Integer r67, java.lang.String r68, java.lang.String r69, int r70, int r71, boolean r72, boolean r73, boolean r74, boolean r75, boolean r76, boolean r77, boolean r78, boolean r79) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41767Iej.A03(com.instagram.api.schemas.ProductCardSubtitleType, X.IyS, X.0iw, X.0xA, com.instagram.common.session.UserSession, com.instagram.common.typedurl.ImageUrl, X.IMi, com.instagram.model.shopping.productfeed.ProductFeedItem, X.JII, X.HdD, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):X.Iov");
    }
}
