package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdsTrustInfoTypeEnum;
import com.instagram.sponsored.signals.model.AdsBizBadgeInfo;
import com.instagram.sponsored.signals.model.AdsCTATrustInfoIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.I9a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40876I9a {
    public static Map A00(AdsCTATrustInfoIntf adsCTATrustInfoIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ArrayList arrayList = null;
        if (adsCTATrustInfoIntf.BHX() != null) {
            AdsBizBadgeInfo BHX = adsCTATrustInfoIntf.BHX();
            if (BHX != null) {
                treeUpdaterJNI = BHX.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("info_data", treeUpdaterJNI);
        }
        if (adsCTATrustInfoIntf.BHa() != null) {
            List<IGAdsTrustInfoTypeEnum> BHa = adsCTATrustInfoIntf.BHa();
            if (BHa != null) {
                arrayList = AbstractC167017dG.A0q(BHa);
                for (IGAdsTrustInfoTypeEnum iGAdsTrustInfoTypeEnum : BHa) {
                    C14360o3.A0B(iGAdsTrustInfoTypeEnum, 0);
                    arrayList.add(iGAdsTrustInfoTypeEnum.A00);
                }
            }
            A1I.put("info_type_list", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
