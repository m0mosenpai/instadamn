package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.OnboardingEntryActionType;
import java.util.LinkedHashMap;

/* renamed from: X.HMv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39191HMv extends C17T implements InterfaceC116715Qa {
    @Override // X.InterfaceC116715Qa
    public final OnboardingEntryActionType AYh() {
        return (OnboardingEntryActionType) A0M(1583758243, DKT.A00);
    }

    @Override // X.InterfaceC116715Qa
    public final H2H Eqt() {
        return new H2H(AYh());
    }

    @Override // X.InterfaceC116715Qa
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (AYh() != null) {
            OnboardingEntryActionType AYh = AYh();
            C14360o3.A0B(AYh, 0);
            A0X.put("action_type", AYh.A00);
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }
}
