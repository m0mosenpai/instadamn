package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes6.dex */
public final class EJ3 extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "SecurityAlertSettingFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, getString(2131973153));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "security_alert_setting";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCL(viewLifecycleOwner, c07s, this, null, 11), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public EJ3() {
        C50160MDn c50160MDn = new C50160MDn(this, 20);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50160MDn(new C50160MDn(this, 17), 18));
        this.A01 = AbstractC25225BEi.A0a(new C50160MDn(A00, 19), c50160MDn, new MHU(45, null, A00), AbstractC25225BEi.A1D(C44532Jmc.class));
        this.A00 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2028002014);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30495Dbe(this, 10), -320659840);
        C0f9.A09(-319848882, A02);
        return A00;
    }
}
