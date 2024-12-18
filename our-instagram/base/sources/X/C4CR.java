package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.OnboardingEntryActionType;
import java.util.LinkedHashMap;

/* renamed from: X.4CR, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4CR extends C0T6 implements C4CS {
    public final OnboardingEntryActionType A00;

    public C4CR(OnboardingEntryActionType onboardingEntryActionType) {
        C14360o3.A0B(onboardingEntryActionType, 1);
        this.A00 = onboardingEntryActionType;
    }

    @Override // X.C4CS
    public final C4CR Eqr() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C4CR) && this.A00 == ((C4CR) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.C4CS
    public final OnboardingEntryActionType AYh() {
        return this.A00;
    }

    @Override // X.C4CS
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (AYh() != null) {
            OnboardingEntryActionType AYh = AYh();
            C14360o3.A0B(AYh, 0);
            linkedHashMap.put("action_type", AYh.A00);
        }
        return new TreeUpdaterJNI("XDTAppreciationCommentEntryObject", AbstractC06930Yk.A0B(linkedHashMap));
    }
}
