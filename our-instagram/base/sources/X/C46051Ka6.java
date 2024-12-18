package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.Ka6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46051Ka6 extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "EncryptedBackupsFishfoodingFragment";
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final C35119FeM A00 = new C35119FeM(true);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131962634);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC43593JPy.A1E(getViewLifecycleOwner(), ((C44546Jmq) this.A04.getValue()).A00, new MM0(this, 30), 26);
    }

    @Override // X.AbstractC59972of
    public final void afterOnViewCreated() {
        JQ0.A11(this, new MCE(this, null, 44), ((C44546Jmq) this.A04.getValue()).A09);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public C46051Ka6() {
        MHL mhl = new MHL(this, 36);
        MHL mhl2 = new MHL(this, 38);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = MHL.A00(mhl2, enumC09460dv, 39);
        this.A01 = AbstractC25225BEi.A0a(new MHL(A00, 40), mhl, new C50169MDw(48, A00, null), AbstractC25225BEi.A1D(C25804BbL.class));
        MHL mhl3 = new MHL(this, 44);
        InterfaceC09390do A002 = MHL.A00(new MHL(this, 41), enumC09460dv, 42);
        this.A04 = AbstractC25225BEi.A0a(new MHL(A002, 43), mhl3, new C50169MDw(49, A002, null), AbstractC25225BEi.A1D(C44546Jmq.class));
        this.A02 = AbstractC09440dt.A01(new MHL(this, 37));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(864558626);
        super.onStart();
        C44546Jmq c44546Jmq = (C44546Jmq) this.A04.getValue();
        c44546Jmq.A07.A05(C05F.A0Y);
        c44546Jmq.A04.A02(C43597JQd.A00(c44546Jmq.A02, c44546Jmq, 5), C49731Ly0.A00);
        C0f9.A09(-636705251, A02);
    }
}
