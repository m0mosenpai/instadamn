package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.OnboardingEntryActionType;
import com.instagram.api.schemas.OnboardingEntryPointPriority;

/* loaded from: classes5.dex */
public final class BU9 extends C17T implements C4CP {
    @Override // X.C4CP
    public final OnboardingEntryActionType AYh() {
        return (OnboardingEntryActionType) A0M(1583758243, BU8.A00);
    }

    @Override // X.C4CP
    public final OnboardingEntryPointPriority BgW() {
        return (OnboardingEntryPointPriority) A0M(-1165461084, BUA.A00);
    }

    @Override // X.C4CP
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, BFL.A00(this));
    }

    @Override // X.C4CP
    public final C4CO Equ() {
        return new C4CO(AYh(), BgW());
    }
}
