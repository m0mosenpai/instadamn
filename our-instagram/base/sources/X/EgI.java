package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class EgI extends N6G {
    public static final String __redex_internal_original_name = "IncentivePlatformBloksSettingsFragment";
    public InterfaceC52932ba A00 = new Object();
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131964490);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.N6G
    public final AbstractC53500NlR A07() {
        return new NQ5(MSV.A00(1067));
    }

    @Override // X.N6G
    public final void A0A() {
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), ((C31800DyK) this.A01.getValue()).A00, new C57561PgZ(this, 44), 34);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2ba, java.lang.Object] */
    public EgI() {
        C57551PgP c57551PgP = new C57551PgP(this, 44);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57551PgP(new C57551PgP(this, 41), 42));
        this.A01 = AbstractC25225BEi.A0a(new C57551PgP(A00, 43), c57551PgP, new C57251PbZ(42, null, A00), AbstractC25225BEi.A1D(C31800DyK.class));
    }

    @Override // X.N6G
    public final UserMonetizationProductType A05() {
        return UserMonetizationProductType.A0E;
    }

    @Override // X.N6G
    public final void A0B() {
        if (isAdded() && !this.mRemoving) {
            AbstractC167007dF.A0J().post(new RunnableC36828GLb(this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.P5l] */
    @Override // X.N6G
    public final void A0E(boolean z) {
        Object value;
        ArrayList A1E;
        if (isAdded() && !this.mRemoving) {
            C05A c05a = ((C31800DyK) this.A01.getValue()).A01;
            do {
                value = c05a.getValue();
                if (z) {
                    A1E = AbstractC16960so.A1M(new Object());
                } else {
                    A1E = AbstractC166987dD.A1E();
                }
            } while (!c05a.AIi(value, A1E));
        }
    }
}
