package X;

import com.instagram.api.schemas.GrowthFrictionInterventionButton;
import com.instagram.api.schemas.GrowthFrictionInterventionDetail;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hng, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39951Hng {
    public static Map A00(GrowthFrictionInterventionDetail growthFrictionInterventionDetail) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (growthFrictionInterventionDetail.AYR() != null) {
            A1I.put("action", growthFrictionInterventionDetail.AYR());
        }
        if (growthFrictionInterventionDetail.AjH() != null) {
            List<GrowthFrictionInterventionButton> AjH = growthFrictionInterventionDetail.AjH();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (GrowthFrictionInterventionButton growthFrictionInterventionButton : AjH) {
                if (growthFrictionInterventionButton != null) {
                    A1E.add(growthFrictionInterventionButton.F7o());
                }
            }
            A1I.put("buttons", A1E);
        }
        if (growthFrictionInterventionDetail.getDescription() != null) {
            A1I.put(DevServerEntity.COLUMN_DESCRIPTION, growthFrictionInterventionDetail.getDescription());
        }
        if (growthFrictionInterventionDetail.BJA() != null) {
            A1I.put("intervention_name", growthFrictionInterventionDetail.BJA());
        }
        if (growthFrictionInterventionDetail.getTitle() != null) {
            AbstractC37300Gc1.A17(growthFrictionInterventionDetail.getTitle(), A1I);
        }
        if (growthFrictionInterventionDetail.getUrl() != null) {
            AbstractC37300Gc1.A13(growthFrictionInterventionDetail.getUrl(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
