package X;

import com.instagram.api.schemas.ProductArtsLabelInformationDict;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HrX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40160HrX {
    public static Map A00(ProductArtsLabelInformationDict productArtsLabelInformationDict) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (productArtsLabelInformationDict.getLabelDisplayValue() != null) {
            A1I.put(AbstractC111324zv.A00(1071), productArtsLabelInformationDict.getLabelDisplayValue());
        }
        if (productArtsLabelInformationDict.getLabelType() != null) {
            A1I.put("label_type", productArtsLabelInformationDict.getLabelType());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
