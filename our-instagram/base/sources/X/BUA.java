package X;

import com.instagram.api.schemas.OnboardingEntryPointPriority;

/* loaded from: classes5.dex */
public final class BUA extends C0YY implements InterfaceC16660sJ {
    public static final BUA A00 = new BUA();

    public BUA() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = OnboardingEntryPointPriority.A01.get(obj);
        if (obj2 == null) {
            return OnboardingEntryPointPriority.A06;
        }
        return obj2;
    }
}
