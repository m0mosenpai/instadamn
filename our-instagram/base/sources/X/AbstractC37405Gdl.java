package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GrowthFrictionInterventionCategories;
import com.instagram.api.schemas.GrowthFrictionInterventionDetail;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gdl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37405Gdl {
    public static Map A00(GrowthFrictionInterventionCategories growthFrictionInterventionCategories) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (growthFrictionInterventionCategories.B7F() != null) {
            GrowthFrictionInterventionDetail B7F = growthFrictionInterventionCategories.B7F();
            if (B7F != null) {
                treeUpdaterJNI2 = B7F.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("follow", treeUpdaterJNI2);
        }
        if (growthFrictionInterventionCategories.BSJ() != null) {
            GrowthFrictionInterventionDetail BSJ = growthFrictionInterventionCategories.BSJ();
            if (BSJ != null) {
                treeUpdaterJNI = BSJ.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("mention", treeUpdaterJNI);
        }
        if (growthFrictionInterventionCategories.C4w() != null) {
            GrowthFrictionInterventionDetail C4w = growthFrictionInterventionCategories.C4w();
            if (C4w != null) {
                treeUpdaterJNI3 = C4w.F7o();
            }
            A1I.put("tag", treeUpdaterJNI3);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
