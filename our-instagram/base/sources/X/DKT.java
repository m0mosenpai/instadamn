package X;

import com.instagram.api.schemas.OnboardingEntryActionType;

/* loaded from: classes5.dex */
public final class DKT extends C0YY implements InterfaceC16660sJ {
    public static final DKT A00 = new DKT();

    public DKT() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = OnboardingEntryActionType.A01.get(obj);
        if (obj2 == null) {
            return OnboardingEntryActionType.A06;
        }
        return obj2;
    }
}