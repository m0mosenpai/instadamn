package X;

import com.instagram.model.shopping.reels.ProductCollectionLinkIntf;
import com.instagram.model.shopping.reels.ProductCollectionLinkMetadata;
import com.instagram.model.shopping.reels.ProfileShopLinkIntf;
import com.instagram.model.shopping.reels.ReelMultiProductLinkIntf;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.model.shopping.reels.ShoppingDestinationMetadataIntf;
import com.instagram.model.shopping.reels.ShoppingIncentiveMetadataIntf;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.5I9, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5I9 {
    public static final HashMap A00(ProductCollectionLinkIntf productCollectionLinkIntf, ProfileShopLinkIntf profileShopLinkIntf, ReelMultiProductLinkIntf reelMultiProductLinkIntf, ReelProductLink reelProductLink) {
        List BhR;
        ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf;
        User BSW;
        String A00;
        String str;
        String str2;
        User user;
        ShoppingIncentiveMetadataIntf shoppingIncentiveMetadataIntf;
        ProductCollectionLinkMetadata productCollectionLinkMetadata;
        String Bgr;
        String str3;
        if (profileShopLinkIntf == null && productCollectionLinkIntf == null && reelProductLink == null && reelMultiProductLinkIntf == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str4 = "";
        if (profileShopLinkIntf != null) {
            hashMap.put("shopping_swipe_up_destination_type", "profile_shop");
            String Bi6 = profileShopLinkIntf.Bi6();
            String str5 = "";
            if (Bi6 != null) {
                str5 = Bi6;
            }
            hashMap.put("profile_shop_user_id", str5);
        }
        if (productCollectionLinkIntf != null) {
            hashMap.put("shopping_swipe_up_destination_type", "shopping_product_collections");
            hashMap.put("destination_type", productCollectionLinkIntf.Ax6().A00);
            if (productCollectionLinkIntf.Ax3() != null) {
                ShoppingDestinationMetadataIntf Ax3 = productCollectionLinkIntf.Ax3();
                if (Ax3 != null) {
                    shoppingIncentiveMetadataIntf = Ax3.BHL();
                } else {
                    shoppingIncentiveMetadataIntf = null;
                }
                ShoppingDestinationMetadataIntf Ax32 = productCollectionLinkIntf.Ax3();
                if (Ax32 != null) {
                    productCollectionLinkMetadata = Ax32.Bt6();
                } else {
                    productCollectionLinkMetadata = null;
                }
                if (shoppingIncentiveMetadataIntf != null) {
                    hashMap.put("merchant_id", shoppingIncentiveMetadataIntf.BSZ());
                    Bgr = shoppingIncentiveMetadataIntf.BHK();
                    str3 = "incentive_id";
                } else if (productCollectionLinkMetadata != null) {
                    String BSZ = productCollectionLinkMetadata.BSZ();
                    if (BSZ == null) {
                        BSZ = "";
                    }
                    hashMap.put("merchant_id", BSZ);
                    Bgr = productCollectionLinkMetadata.Bgr();
                    str3 = "product_collection_id";
                }
                hashMap.put(str3, Bgr);
            }
        }
        if (reelProductLink != null) {
            ProductDetailsProductItemDict productDetailsProductItemDict = reelProductLink.A00;
            Product product = null;
            if (productDetailsProductItemDict != null) {
                product = new Product(null, productDetailsProductItemDict);
            }
            hashMap.put("shopping_swipe_up_destination_type", "instagram_shopping_pdp");
            if (product == null || (str = product.A0H) == null) {
                str = "";
            }
            hashMap.put("product_id", str);
            if (product == null || (user = product.A0B) == null || (str2 = AbstractC76433bn.A00(user)) == null) {
                str2 = "";
            }
            hashMap.put("merchant_id", str2);
        }
        if (reelMultiProductLinkIntf != null && reelMultiProductLinkIntf.BhR() != null && (BhR = reelMultiProductLinkIntf.BhR()) != null && (!BhR.isEmpty())) {
            List BhR2 = reelMultiProductLinkIntf.BhR();
            ArrayList arrayList = new ArrayList();
            if (BhR2 != null) {
                Iterator it = BhR2.iterator();
                while (it.hasNext()) {
                    String productId = ((ProductDetailsProductItemDictIntf) it.next()).getProductId();
                    if (productId != null) {
                        arrayList.add(productId);
                    }
                }
            }
            hashMap.put("shopping_swipe_up_destination_type", "multi_product_sheet");
            hashMap.put("destination_type", "multi_product");
            if (BhR2 != null && (productDetailsProductItemDictIntf = (ProductDetailsProductItemDictIntf) AbstractC001800i.A0O(BhR2, 0)) != null && (BSW = productDetailsProductItemDictIntf.BSW()) != null && (A00 = AbstractC76433bn.A00(BSW)) != null) {
                str4 = A00;
            }
            hashMap.put("merchant_id", str4);
            hashMap.put("product_ids", new JSONArray((Collection) arrayList).toString());
        }
        return hashMap;
    }
}
