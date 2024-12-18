package X;

import com.instagram.api.schemas.ProductTileBannerMetadataDecorationImpl;
import com.instagram.api.schemas.ProductTileBannerType;
import com.instagram.api.schemas.ProductTileLabelImpl;
import com.instagram.api.schemas.ProductTileLabelType;
import com.instagram.api.schemas.ProductTileLayoutContentImpl;
import com.instagram.api.schemas.ProductTileMetadataDecorationsImpl;
import com.instagram.api.schemas.ProductTileMetadataDestination;
import com.instagram.api.schemas.ProductTileMetadataImpl;
import com.instagram.api.schemas.ProductTilePriceLabelOptionsImpl;
import com.instagram.api.schemas.ProductTileProductNameLabelOptionsImpl;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Id3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41674Id3 {
    public static C42914IyS A00;

    public static C42914IyS A00(C6FG c6fg, C102884kP c102884kP, UserSession userSession, boolean z) {
        C5GU A002;
        C41646Ibe c41646Ibe = null;
        if (!z) {
            String A0L = c102884kP.A0L(50);
            String A0L2 = c102884kP.A0L(45);
            String A0L3 = c102884kP.A0L(57);
            if (A0L3 == null) {
                A002 = null;
            } else {
                A002 = AbstractC40733I3n.A00(A0L3);
            }
            Long valueOf = Long.valueOf(c102884kP.A04(68, 0L));
            Long l = valueOf.equals(0L) ? null : valueOf;
            C41636IbR c41636IbR = new C41636IbR(C6BQ.A00(c6fg), userSession, new C42574Iss(c102884kP.A0L(44)), EnumC39622HeW.A0U, A0L, A0L2, c102884kP.A0L(46));
            c41636IbR.A0J = false;
            c41636IbR.A0H = true;
            c41636IbR.A0D = c102884kP.A0L(56);
            c41636IbR.A02 = A002;
            c41636IbR.A06 = l;
            c41636IbR.A07 = Long.valueOf(c102884kP.A04(67, 0L));
            c41636IbR.A09 = c102884kP.A0L(78);
            c41646Ibe = c41636IbR.A02();
        }
        return new C42914IyS(new C41196ILk(c6fg, c102884kP, c102884kP.A0B(72), c102884kP.A0B(75)), c6fg, c102884kP, userSession, c41646Ibe);
    }

    public static void A01(C42914IyS c42914IyS, C102884kP c102884kP, UserSession userSession, ImageUrl imageUrl, C41219IMi c41219IMi, ProductFeedItem productFeedItem, C66479UJd c66479UJd, Boolean bool) {
        Integer valueOf;
        if (c41219IMi != null) {
            float A02 = c102884kP.A02(81, -1.0f);
            C42574Iss c42574Iss = new C42574Iss(c102884kP.A0L(44));
            String A0L = c102884kP.A0L(51);
            int A03 = c102884kP.A03(62, 0);
            int A032 = c102884kP.A03(55, 0);
            EnumC39541HdD enumC39541HdD = EnumC39541HdD.A02;
            Integer num = C05F.A08;
            boolean booleanValue = bool.booleanValue();
            if (A02 < 0.0f) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf((int) A02);
            }
            AbstractC68577VWe.A00(c66479UJd, C41767Iej.A03(null, c42914IyS, c42574Iss, null, userSession, imageUrl, c41219IMi, productFeedItem, c42914IyS, enumC39541HdD, num, valueOf, A0L, null, A03, A032, false, false, false, false, booleanValue, c102884kP.A0S(80, true), false, false));
        }
    }

    public static void A02(C102884kP c102884kP, ProductFeedItem productFeedItem) {
        String str;
        C102884kP A08 = c102884kP.A08(38);
        String A002 = AbstractC111324zv.A00(158);
        if (A08 != null) {
            List A0O = A08.A0O(36);
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = A0O.iterator();
            while (true) {
                if (it.hasNext()) {
                    C102884kP c102884kP2 = (C102884kP) it.next();
                    String A0L = c102884kP2.A0L(35);
                    C102884kP A082 = c102884kP2.A08(36);
                    if (A082 == null) {
                        str = "getProductTileLabels found a null layoutContent";
                        break;
                    }
                    int A03 = A082.A03(35, 0);
                    boolean A0S = A082.A0S(36, false);
                    boolean A0S2 = A082.A0S(38, false);
                    if (A0L == null) {
                        return;
                    }
                    ProductTileLabelType productTileLabelType = (ProductTileLabelType) ProductTileLabelType.A01.get(A0L.toLowerCase());
                    if (productTileLabelType == null) {
                        productTileLabelType = ProductTileLabelType.A0J;
                    }
                    A1E.add(new ProductTileLabelImpl(productTileLabelType, new ProductTileLayoutContentImpl(null, new ProductTilePriceLabelOptionsImpl(false, false, A0S2), new ProductTileProductNameLabelOptionsImpl(A03, A0S))));
                } else {
                    C102884kP A083 = c102884kP.A08(38);
                    if (A083 != null) {
                        C102884kP A084 = A083.A08(35);
                        if (A084 == null) {
                            str = "getProductTileLabels found a null decoration";
                        } else {
                            boolean A0S3 = A084.A0S(42, false);
                            boolean A0S4 = A084.A0S(38, false);
                            boolean A0S5 = A084.A0S(40, false);
                            boolean A0S6 = A084.A0S(35, false);
                            List<C102884kP> A0O2 = A084.A0O(43);
                            ArrayList A1E2 = AbstractC166987dD.A1E();
                            if (A0O2 != null) {
                                for (C102884kP c102884kP3 : A0O2) {
                                    ProductTileBannerType productTileBannerType = (ProductTileBannerType) ProductTileBannerType.A01.get(c102884kP3.A0L(36));
                                    if (productTileBannerType == null) {
                                        productTileBannerType = ProductTileBannerType.A09;
                                    }
                                    String A0L2 = c102884kP3.A0L(35);
                                    if (A0L2 == null) {
                                        A0L2 = "";
                                    }
                                    A1E2.add(new ProductTileBannerMetadataDecorationImpl(productTileBannerType, A0L2));
                                }
                            }
                            ProductTileMetadataDecorationsImpl productTileMetadataDecorationsImpl = new ProductTileMetadataDecorationsImpl(null, AbstractC37301Gc2.A0S(A084, 44, false), A1E2, A0S6, false, A0S4, false, A0S5, false, A0S3);
                            ProductTile productTile = productFeedItem.A02;
                            if (productTile == null) {
                                return;
                            }
                            productTile.A01 = new ProductTileMetadataImpl(productTileMetadataDecorationsImpl, ProductTileMetadataDestination.A05, A1E);
                            return;
                        }
                    }
                }
            }
        }
        str = "getProductTileLabels found a null metadata";
        AbstractC25241Le.A02(A002, str);
    }
}
