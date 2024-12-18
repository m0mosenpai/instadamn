package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.OnboardingEntryActionType;
import java.util.LinkedHashMap;

/* renamed from: X.GoX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38044GoX extends C17T implements C4CS {
    @Override // X.C4CS
    public final OnboardingEntryActionType AYh() {
        return (OnboardingEntryActionType) A0M(1583758243, BU5.A00);
    }

    @Override // X.C4CS
    public final C4CR Eqr() {
        return new C4CR(AYh());
    }

    @Override // X.C4CS
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
