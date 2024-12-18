package X;

import com.instagram.api.schemas.ProductDiscountInformationDict;
import com.instagram.api.schemas.ProductDiscountsDict;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hrh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40169Hrh {
    public static Map A00(ProductDiscountsDict productDiscountsDict) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (productDiscountsDict.AyM() != null) {
            List<ProductDiscountInformationDict> AyM = productDiscountsDict.AyM();
            ArrayList arrayList = null;
            if (AyM != null) {
                arrayList = AbstractC166987dD.A1E();
                for (ProductDiscountInformationDict productDiscountInformationDict : AyM) {
                    if (productDiscountInformationDict != null) {
                        arrayList.add(productDiscountInformationDict.F7o());
                    }
                }
            }
            A1I.put("discounts", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
