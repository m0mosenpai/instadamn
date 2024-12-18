package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.OnboardingEntryActionType;
import com.instagram.api.schemas.OnboardingEntryPointPriority;

/* renamed from: X.4CO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4CO extends C0T6 implements C4CP {
    public final OnboardingEntryActionType A00;
    public final OnboardingEntryPointPriority A01;

    public C4CO(OnboardingEntryActionType onboardingEntryActionType, OnboardingEntryPointPriority onboardingEntryPointPriority) {
        C14360o3.A0B(onboardingEntryActionType, 1);
        C14360o3.A0B(onboardingEntryPointPriority, 2);
        this.A00 = onboardingEntryActionType;
        this.A01 = onboardingEntryPointPriority;
    }

    @Override // X.C4CP
    public final C4CO Equ() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4CO) {
                C4CO c4co = (C4CO) obj;
                if (this.A00 != c4co.A00 || this.A01 != c4co.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    @Override // X.C4CP
    public final OnboardingEntryActionType AYh() {
        return this.A00;
    }

    @Override // X.C4CP
    public final OnboardingEntryPointPriority BgW() {
        return this.A01;
    }

    @Override // X.C4CP
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAppreciationPillEntryObject", BFL.A00(this));
    }
}
