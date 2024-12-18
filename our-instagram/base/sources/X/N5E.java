package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.userpay.api.UserPayApi;

/* loaded from: classes9.dex */
public final class N5E extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "UserPayEarningsFragment";
    public C51154Mix A00;
    public UserPayApi A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131976484);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A06 = R.drawable.instagram_info_pano_outline_24;
        A0B.A05 = 2131976484;
        AbstractC31176DnK.A1B(new ViewOnClickListenerC35682FpH(this, 47), A0B, interfaceC56362iU);
        interfaceC56362iU.EkS(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0B = AbstractC43592JPx.A0B(view, R.id.user_pay_earnings_recycler_view);
        AbstractC31174DnI.A15(getContext(), A0B);
        C51154Mix c51154Mix = this.A00;
        if (c51154Mix == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        A0B.setAdapter(c51154Mix);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1238558283);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A02;
        this.A01 = new UserPayApi(AbstractC166987dD.A0r(interfaceC09390do));
        this.A00 = new C51154Mix(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), AbstractC166987dD.A1E());
        PZE.A02(this, AbstractC25229BEm.A0a(this), 25);
        C0f9.A09(-594011748, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-630487420);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.user_pay_earnings, viewGroup, false);
        C0f9.A09(711200133, A02);
        return inflate;
    }
}
