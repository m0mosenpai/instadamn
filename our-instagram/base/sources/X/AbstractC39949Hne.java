package X;

import com.instagram.api.schemas.GrowthFrictionInterventionButton;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hne, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39949Hne {
    public static Map A00(GrowthFrictionInterventionButton growthFrictionInterventionButton) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (growthFrictionInterventionButton.AYR() != null) {
            A1I.put("action", growthFrictionInterventionButton.AYR());
        }
        if (growthFrictionInterventionButton.Cb0() != null) {
            A1I.put("is_primary", growthFrictionInterventionButton.Cb0());
        }
        if (growthFrictionInterventionButton.getText() != null) {
            AbstractC37300Gc1.A15(growthFrictionInterventionButton.getText(), A1I);
        }
        if (growthFrictionInterventionButton.getUrl() != null) {
            AbstractC37300Gc1.A13(growthFrictionInterventionButton.getUrl(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
