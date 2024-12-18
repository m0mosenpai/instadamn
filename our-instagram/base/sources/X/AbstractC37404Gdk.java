package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GrowthFrictionInfo;
import com.instagram.api.schemas.GrowthFrictionInterventionCategories;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gdk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37404Gdk {
    public static Map A00(GrowthFrictionInfo growthFrictionInfo) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        growthFrictionInfo.BB4();
        A1I.put("has_active_interventions", Boolean.valueOf(growthFrictionInfo.BB4()));
        if (growthFrictionInfo.BJE() != null) {
            GrowthFrictionInterventionCategories BJE = growthFrictionInfo.BJE();
            if (BJE != null) {
                treeUpdaterJNI = BJE.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("interventions", treeUpdaterJNI);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
