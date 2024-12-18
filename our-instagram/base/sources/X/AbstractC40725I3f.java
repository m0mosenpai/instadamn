package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.payments.CurrencyAmountInfo;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;
import com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadataIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.I3f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40725I3f {
    public static Map A00(ProductCheckoutPropertiesIntf productCheckoutPropertiesIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (productCheckoutPropertiesIntf.AkE() != null) {
            A1I.put("can_add_to_bag", productCheckoutPropertiesIntf.AkE());
        }
        if (productCheckoutPropertiesIntf.AkQ() != null) {
            A1I.put("can_enable_restock_reminder", productCheckoutPropertiesIntf.AkQ());
        }
        if (productCheckoutPropertiesIntf.Al0() != null) {
            A1I.put("can_show_inventory_quantity", productCheckoutPropertiesIntf.Al0());
        }
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (productCheckoutPropertiesIntf.Au6() != null) {
            CurrencyAmountInfo Au6 = productCheckoutPropertiesIntf.Au6();
            if (Au6 != null) {
                treeUpdaterJNI = Au6.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("currency_amount", treeUpdaterJNI);
        }
        if (productCheckoutPropertiesIntf.B8u() != null) {
            A1I.put("full_inventory_quantity", productCheckoutPropertiesIntf.B8u());
        }
        if (productCheckoutPropertiesIntf.BBk() != null) {
            A1I.put("has_free_shipping", productCheckoutPropertiesIntf.BBk());
        }
        if (productCheckoutPropertiesIntf.BBl() != null) {
            A1I.put("has_free_two_day_shipping", productCheckoutPropertiesIntf.BBl());
        }
        if (productCheckoutPropertiesIntf.getIgReferrerFbid() != null) {
            A1I.put("ig_referrer_fbid", productCheckoutPropertiesIntf.getIgReferrerFbid());
        }
        if (productCheckoutPropertiesIntf.BJM() != null) {
            A1I.put("inventory_quantity", productCheckoutPropertiesIntf.BJM());
        }
        if (productCheckoutPropertiesIntf.CX5() != null) {
            A1I.put("is_item_in_cart", productCheckoutPropertiesIntf.CX5());
        }
        if (productCheckoutPropertiesIntf.CbM() != null) {
            A1I.put("is_purchase_protected", productCheckoutPropertiesIntf.CbM());
        }
        if (productCheckoutPropertiesIntf.Cd7() != null) {
            A1I.put("is_shopify_merchant", productCheckoutPropertiesIntf.Cd7());
        }
        if (productCheckoutPropertiesIntf.BfH() != null) {
            A1I.put("pre_order_estimate_fulfill_date", productCheckoutPropertiesIntf.BfH());
        }
        if (productCheckoutPropertiesIntf.Bh1() != null) {
            A1I.put("product_group_has_inventory", productCheckoutPropertiesIntf.Bh1());
        }
        if (productCheckoutPropertiesIntf.getReceiverId() != null) {
            A1I.put("receiver_id", productCheckoutPropertiesIntf.getReceiverId());
        }
        if (productCheckoutPropertiesIntf.Bub() != null) {
            ShippingAndReturnsMetadataIntf Bub = productCheckoutPropertiesIntf.Bub();
            if (Bub != null) {
                treeUpdaterJNI2 = Bub.F7o();
            }
            A1I.put("shipping_and_return", treeUpdaterJNI2);
        }
        if (productCheckoutPropertiesIntf.CBH() != null) {
            A1I.put(AbstractC111324zv.A00(547), productCheckoutPropertiesIntf.CBH());
        }
        if (productCheckoutPropertiesIntf.CGE() != null) {
            A1I.put("viewer_purchase_limit", productCheckoutPropertiesIntf.CGE());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
