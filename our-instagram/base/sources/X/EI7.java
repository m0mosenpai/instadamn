package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class EI7 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "SecurityAlertFeedFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "security_alert_feed";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCL(viewLifecycleOwner, c07s, this, null, 6), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public EI7() {
        C50160MDn c50160MDn = new C50160MDn(this, 10);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50160MDn(new C50160MDn(this, 7), 8));
        this.A01 = AbstractC25225BEi.A0a(new C50160MDn(A00, 9), c50160MDn, new MHU(42, null, A00), AbstractC25225BEi.A1D(C44450JlI.class));
        this.A00 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(901489495);
        super.onCreate(bundle);
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A01);
        AbstractC166987dD.A1Z(new MCO(A0Z, (InterfaceC23621Ds) null, 40), AbstractC141776au.A00(A0Z));
        C0f9.A09(-1323414941, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(535882468);
        View view = new View(requireContext());
        C0f9.A09(2028247823, A02);
        return view;
    }
}
