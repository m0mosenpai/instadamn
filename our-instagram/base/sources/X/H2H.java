package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.OnboardingEntryActionType;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class H2H extends C0T6 implements InterfaceC116715Qa {
    public final OnboardingEntryActionType A00;

    public H2H(OnboardingEntryActionType onboardingEntryActionType) {
        C14360o3.A0B(onboardingEntryActionType, 1);
        this.A00 = onboardingEntryActionType;
    }

    @Override // X.InterfaceC116715Qa
    public final H2H Eqt() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof H2H) && this.A00 == ((H2H) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC116715Qa
    public final OnboardingEntryActionType AYh() {
        return this.A00;
    }

    @Override // X.InterfaceC116715Qa
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (AYh() != null) {
            OnboardingEntryActionType AYh = AYh();
            C14360o3.A0B(AYh, 0);
            A0X.put("action_type", AYh.A00);
        }
        return AbstractC37300Gc1.A05("XDTAppreciationOverFlowEntryObject", AbstractC06930Yk.A0B(A0X));
    }
}
