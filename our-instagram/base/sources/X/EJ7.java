package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes6.dex */
public final class EJ7 extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "KeyAlertDetailFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final String A02;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131952899);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCL(viewLifecycleOwner, c07s, this, null, 10), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public EJ7() {
        C50160MDn c50160MDn = new C50160MDn(this, 14);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50160MDn(new C50160MDn(this, 11), 12));
        this.A01 = AbstractC25225BEi.A0a(new C50160MDn(A00, 13), c50160MDn, new MHU(44, null, A00), AbstractC25225BEi.A1D(Object.class));
        this.A02 = "key_alert_detail";
        this.A00 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A02;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-910248614);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30495Dbe(this, 8), 529767740);
        C0f9.A09(-1411922414, A02);
        return A00;
    }
}
