package X;

import com.instagram.api.schemas.ProductDiscountInformationDict;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hrf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40167Hrf {
    public static Map A00(ProductDiscountInformationDict productDiscountInformationDict) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (productDiscountInformationDict.getCtaText() != null) {
            A1I.put("cta_text", productDiscountInformationDict.getCtaText());
        }
        if (productDiscountInformationDict.getDescription() != null) {
            A1I.put(DevServerEntity.COLUMN_DESCRIPTION, productDiscountInformationDict.getDescription());
        }
        if (productDiscountInformationDict.getId() != null) {
            AbstractC37300Gc1.A12(productDiscountInformationDict.getId(), A1I);
        }
        if (productDiscountInformationDict.getName() != null) {
            AbstractC37300Gc1.A14(productDiscountInformationDict.getName(), A1I);
        }
        if (productDiscountInformationDict.getSeeDetailsText() != null) {
            A1I.put(AbstractC111324zv.A00(1253), productDiscountInformationDict.getSeeDetailsText());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
