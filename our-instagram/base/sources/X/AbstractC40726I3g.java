package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.payments.CurrencyAmountInfo;
import com.instagram.model.payments.DeliveryWindowInfo;
import com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadataIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.I3g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40726I3g {
    public static Map A00(ShippingAndReturnsMetadataIntf shippingAndReturnsMetadataIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (shippingAndReturnsMetadataIntf.B2c() != null) {
            DeliveryWindowInfo B2c = shippingAndReturnsMetadataIntf.B2c();
            if (B2c != null) {
                treeUpdaterJNI2 = B2c.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("estimated_delivery_window", treeUpdaterJNI2);
        }
        if (shippingAndReturnsMetadataIntf.CUn() != null) {
            A1I.put("is_final_sale", shippingAndReturnsMetadataIntf.CUn());
        }
        if (shippingAndReturnsMetadataIntf.Bp1() != null) {
            CurrencyAmountInfo Bp1 = shippingAndReturnsMetadataIntf.Bp1();
            if (Bp1 != null) {
                treeUpdaterJNI = Bp1.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("return_cost", treeUpdaterJNI);
        }
        if (shippingAndReturnsMetadataIntf.Bp3() != null) {
            A1I.put("return_policy_time", shippingAndReturnsMetadataIntf.Bp3());
        }
        if (shippingAndReturnsMetadataIntf.Buc() != null) {
            CurrencyAmountInfo Buc = shippingAndReturnsMetadataIntf.Buc();
            if (Buc != null) {
                treeUpdaterJNI3 = Buc.F7o();
            }
            A1I.put("shipping_cost", treeUpdaterJNI3);
        }
        if (shippingAndReturnsMetadataIntf.getShippingCostStripped() != null) {
            A1I.put("shipping_cost_stripped", shippingAndReturnsMetadataIntf.getShippingCostStripped());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
