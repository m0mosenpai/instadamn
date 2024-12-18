package X;

import com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.I3k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40730I3k {
    public static Map A00(ProductCollectionDropsMetadata productCollectionDropsMetadata) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        productCollectionDropsMetadata.ApB();
        A1I.put("collection_reminder_set", Boolean.valueOf(productCollectionDropsMetadata.ApB()));
        productCollectionDropsMetadata.BMI();
        A1I.put("launch_date", Long.valueOf(productCollectionDropsMetadata.BMI()));
        if (productCollectionDropsMetadata.BXw() != null) {
            A1I.put("num_products", productCollectionDropsMetadata.BXw());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
