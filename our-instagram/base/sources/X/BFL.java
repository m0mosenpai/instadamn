package X;

import com.instagram.api.schemas.OnboardingEntryActionType;
import com.instagram.api.schemas.OnboardingEntryPointPriority;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class BFL {
    public static Map A00(C4CP c4cp) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c4cp.AYh() != null) {
            OnboardingEntryActionType AYh = c4cp.AYh();
            C14360o3.A0B(AYh, 0);
            A1I.put("action_type", AYh.A00);
        }
        if (c4cp.BgW() != null) {
            OnboardingEntryPointPriority BgW = c4cp.BgW();
            C14360o3.A0B(BgW, 0);
            A1I.put("priority", BgW.A00);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
