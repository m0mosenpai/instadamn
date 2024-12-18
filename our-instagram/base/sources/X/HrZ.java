package X;

import com.instagram.api.schemas.ProductArtsLabelInformationDict;
import com.instagram.api.schemas.ProductArtsLabelsDictIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class HrZ {
    public static Map A00(ProductArtsLabelsDictIntf productArtsLabelsDictIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (productArtsLabelsDictIntf.BL3() != null) {
            List<ProductArtsLabelInformationDict> BL3 = productArtsLabelsDictIntf.BL3();
            ArrayList arrayList = null;
            if (BL3 != null) {
                arrayList = AbstractC166987dD.A1E();
                for (ProductArtsLabelInformationDict productArtsLabelInformationDict : BL3) {
                    if (productArtsLabelInformationDict != null) {
                        arrayList.add(productArtsLabelInformationDict.F7o());
                    }
                }
            }
            A1I.put("labels", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
