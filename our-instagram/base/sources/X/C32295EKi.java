package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.fanclub.gifting.FanClubGiftingViewModel;

/* renamed from: X.EKi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32295EKi extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "FanClubPurchaseProcessingFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131963243);
        interfaceC56362iU.EkT(ViewOnClickListenerC35685FpK.A00(this, 4), true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "FanClubPurchaseProcessFragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String A15;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC31171DnF.A1M(AbstractC31180DnO.A0V(view));
        Object value = this.A00.getValue();
        if (value != null && (A15 = AbstractC25225BEi.A15(this.A04)) != null) {
            C07S c07s = C07S.STARTED;
            C07X viewLifecycleOwner = getViewLifecycleOwner();
            AbstractC166987dD.A1Z(new C57161PZf(viewLifecycleOwner, c07s, this, value, A15, null, 16), C07Y.A00(viewLifecycleOwner));
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public C32295EKi() {
        C37049GUf c37049GUf = new C37049GUf(this, 14);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37049GUf(new C37049GUf(this, 11), 12));
        this.A05 = AbstractC25225BEi.A0a(new C37049GUf(A00, 13), c37049GUf, new C50171MDy(30, null, A00), AbstractC25225BEi.A1D(FanClubGiftingViewModel.class));
        this.A00 = C37049GUf.A00(this, 7);
        this.A02 = C37049GUf.A00(this, 9);
        this.A04 = C37049GUf.A00(this, 10);
        this.A01 = C37049GUf.A00(this, 8);
        this.A03 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C193328hC A0b = AbstractC31176DnK.A0b(this);
        A0b.A0A(2131962217);
        A0b.A09(2131963240);
        A0b.A0J(null, 2131962215);
        A0b.A0P(DialogInterfaceOnClickListenerC35453FkA.A00(this, 27), EnumC193348hE.A05, 2131962214);
        AbstractC166987dD.A1W(A0b);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1446244777);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fan_club_purchase_processing, viewGroup, false);
        C0f9.A09(-276876014, A02);
        return inflate;
    }
}
