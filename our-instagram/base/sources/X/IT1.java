package X;

import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus;
import com.instagram.model.shopping.productcollection.ProductCollectionCover;
import com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl;
import com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata;
import com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadataImpl;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import com.instagram.user.model.ProductCollectionImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IT1 {
    public static ProductCollectionImpl parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ProductCollectionReviewStatus productCollectionReviewStatus = null;
            ProductCollectionV2Type productCollectionV2Type = null;
            ProductCollectionCoverImpl productCollectionCoverImpl = null;
            String str2 = null;
            ProductCollectionDropsMetadataImpl productCollectionDropsMetadataImpl = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("collection_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(189).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    productCollectionReviewStatus = (ProductCollectionReviewStatus) ProductCollectionReviewStatus.A01.get(A1P2);
                    if (productCollectionReviewStatus == null) {
                        productCollectionReviewStatus = ProductCollectionReviewStatus.A08;
                    }
                } else if ("collection_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    productCollectionV2Type = AbstractC40163Hrb.A00(A1P);
                } else if ("cover".equals(A0s)) {
                    productCollectionCoverImpl = AbstractC40729I3j.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1Q(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("drops_collection_metadata".equals(A0s)) {
                    productCollectionDropsMetadataImpl = AbstractC40731I3l.parseFromJson(c16l);
                } else if ("merchant_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1L(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("users".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            return new ProductCollectionImpl(productCollectionV2Type, productCollectionReviewStatus, productCollectionCoverImpl, productCollectionDropsMetadataImpl, str, str2, str3, str4, str5, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, ProductCollectionImpl productCollectionImpl) {
        anonymousClass182.A0d();
        String str = productCollectionImpl.A04;
        if (str != null) {
            anonymousClass182.A0S("collection_id", str);
        }
        ProductCollectionReviewStatus productCollectionReviewStatus = productCollectionImpl.A01;
        if (productCollectionReviewStatus != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(189), productCollectionReviewStatus.A00);
        }
        ProductCollectionV2Type productCollectionV2Type = productCollectionImpl.A00;
        if (productCollectionV2Type != null) {
            anonymousClass182.A0S("collection_type", productCollectionV2Type.A00);
        }
        ProductCollectionCover productCollectionCover = productCollectionImpl.A02;
        if (productCollectionCover != null) {
            anonymousClass182.A0r("cover");
            ProductCollectionCoverImpl F6B = productCollectionCover.F6B();
            anonymousClass182.A0d();
            ProductImageContainer productImageContainer = F6B.A00;
            if (productImageContainer != null) {
                anonymousClass182.A0r("image");
                AbstractC111144zV.A00(anonymousClass182, productImageContainer.F6D());
            }
            IgShowreelNativeAnimation igShowreelNativeAnimation = F6B.A01;
            if (igShowreelNativeAnimation != null) {
                anonymousClass182.A0r("showreel_native_animation");
                C52l.A00(anonymousClass182, igShowreelNativeAnimation);
            }
            anonymousClass182.A0a();
        }
        String str2 = productCollectionImpl.A05;
        if (str2 != null) {
            anonymousClass182.A0S(DevServerEntity.COLUMN_DESCRIPTION, str2);
        }
        ProductCollectionDropsMetadata productCollectionDropsMetadata = productCollectionImpl.A03;
        if (productCollectionDropsMetadata != null) {
            anonymousClass182.A0r("drops_collection_metadata");
            ProductCollectionDropsMetadataImpl F6C = productCollectionDropsMetadata.F6C();
            anonymousClass182.A0d();
            anonymousClass182.A0T("collection_reminder_set", F6C.A02);
            anonymousClass182.A0R("launch_date", F6C.A00);
            Integer num = F6C.A01;
            if (num != null) {
                anonymousClass182.A0Q("num_products", num.intValue());
            }
            anonymousClass182.A0a();
        }
        AbstractC37301Gc2.A1I(anonymousClass182, productCollectionImpl.A06);
        String str3 = productCollectionImpl.A07;
        if (str3 != null) {
            anonymousClass182.A0S("subtitle", str3);
        }
        AbstractC37301Gc2.A1F(anonymousClass182, productCollectionImpl.A08);
        List list = productCollectionImpl.A09;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "users", list);
            while (A0q.hasNext()) {
                AbstractC167017dG.A1G(anonymousClass182, A0q);
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
