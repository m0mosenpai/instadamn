package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ScheduledLiveAffiliateInfo;
import com.instagram.api.schemas.ScheduledLiveDiscountInfo;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductWrapperIntf;
import com.instagram.user.model.ScheduledLiveProductsMetadataIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class IAB {
    public static Map A00(ScheduledLiveProductsMetadataIntf scheduledLiveProductsMetadataIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ArrayList arrayList = null;
        if (scheduledLiveProductsMetadataIntf.AaO() != null) {
            ScheduledLiveAffiliateInfo AaO = scheduledLiveProductsMetadataIntf.AaO();
            if (AaO != null) {
                treeUpdaterJNI3 = AaO.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put("affiliate_info", treeUpdaterJNI3);
        }
        if (scheduledLiveProductsMetadataIntf.Ap9() != null) {
            ProductCollection Ap9 = scheduledLiveProductsMetadataIntf.Ap9();
            if (Ap9 != null) {
                treeUpdaterJNI2 = Ap9.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("collection_metadata", treeUpdaterJNI2);
        }
        if (scheduledLiveProductsMetadataIntf.AyI() != null) {
            ScheduledLiveDiscountInfo AyI = scheduledLiveProductsMetadataIntf.AyI();
            if (AyI != null) {
                treeUpdaterJNI = AyI.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("discount_info", treeUpdaterJNI);
        }
        User BSW = scheduledLiveProductsMetadataIntf.BSW();
        if (BSW != null) {
            AbstractC37301Gc2.A1Q(BSW, A1I);
        }
        if (scheduledLiveProductsMetadataIntf.BhR() != null) {
            List<ProductWrapperIntf> BhR = scheduledLiveProductsMetadataIntf.BhR();
            if (BhR != null) {
                arrayList = AbstractC166987dD.A1E();
                for (ProductWrapperIntf productWrapperIntf : BhR) {
                    if (productWrapperIntf != null) {
                        arrayList.add(productWrapperIntf.F7o());
                    }
                }
            }
            A1I.put("products", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
