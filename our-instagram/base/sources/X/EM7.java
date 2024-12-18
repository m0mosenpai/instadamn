package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.modal.TransparentModalActivity;

/* loaded from: classes6.dex */
public final class EM7 extends AbstractC59962oe implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "QuickSnapConsumptionNuxFragment";
    public C140356Wo A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final String A03 = AbstractC111324zv.A00(2943);

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewOnClickListenerC31723DwS.A01(view.requireViewById(R.id.consumption_nux_close_button), 54, this);
        ViewOnClickListenerC31723DwS.A01(view.requireViewById(R.id.consumption_nux_bottom_button), 55, this);
        this.A00 = new C140356Wo(ViewOnClickListenerC31723DwS.A00(this, 56), AbstractC166997dE.A0S(view, R.id.consumption_nux_preview_container), this, AbstractC166987dD.A0r(this.A02));
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57165PZj(c07s, this, viewLifecycleOwner, null, 26), C07Y.A00(viewLifecycleOwner));
    }

    public static final void A00(EM7 em7) {
        Integer num;
        Bundle bundle = em7.mArguments;
        if (bundle != null) {
            num = AbstractC31179DnN.A0X(bundle, "quick_snap_viewer_request_code_key");
        } else {
            num = null;
        }
        AbstractC12990ll A0o = AbstractC166987dD.A0o(em7.A02);
        C6XJ A0L = AbstractC31171DnF.A0L(em7.requireActivity(), AbstractC31171DnF.A05(0), A0o, TransparentModalActivity.class, AbstractC111324zv.A00(509));
        A0L.A0H = true;
        A0L.A07();
        if (num != null) {
            A0L.A0A(em7.requireActivity(), num.intValue());
        } else {
            AbstractC31172DnG.A1M(em7, A0L);
        }
        AbstractC25231BEo.A16(em7);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    public EM7() {
        C57519Pft c57519Pft = new C57519Pft(this, 46);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57519Pft(new C57519Pft(this, 47), 48));
        this.A01 = AbstractC25225BEi.A0a(new C57519Pft(A00, 49), c57519Pft, new C57257Pbf(29, null, A00), AbstractC25225BEi.A1D(C3CY.class));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-977883008);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.quick_snap_consumption_nux_layout, false);
        C0f9.A09(1082413188, A02);
        return A0R;
    }
}
