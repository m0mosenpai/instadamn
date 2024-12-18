package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.Brw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26775Brw extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CreatorToolsMonetizationFragment";
    public final InterfaceC09390do A00 = C1XM.A00(new D87(this, 37));
    public final InterfaceC09390do A03 = AbstractC25225BEi.A0a(new D87(this, 39), new D87(this, 40), new C50169MDw(24, this, null), AbstractC25225BEi.A1D(C25845Bc0.class));
    public final InterfaceC09390do A01 = C1XM.A00(new D87(this, 38));
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131957251);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A03;
        C25845Bc0 A0w = AbstractC25225BEi.A0w(interfaceC09390do);
        InterfaceC09390do interfaceC09390do2 = this.A00;
        A0w.A00 = AbstractC25225BEi.A15(interfaceC09390do2);
        if (C14360o3.A0K(interfaceC09390do2.getValue(), "pro_home")) {
            C25845Bc0 A0w2 = AbstractC25225BEi.A0w(interfaceC09390do);
            FragmentActivity requireActivity = requireActivity();
            AbstractC166997dE.A1Y(A0w2.A0D, true);
            C141796aw A00 = AbstractC141776au.A00(A0w2);
            D53 d53 = new D53(requireActivity, A0w2, null, 34);
            AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
            AbstractC23641Du.A05(anonymousClass191, d53, A00);
            A00(view);
            BY8.A00(getViewLifecycleOwner(), AbstractC25225BEi.A0w(interfaceC09390do).A01, new C50370MLx(17, view, this), 7);
            AbstractC23641Du.A05(anonymousClass191, new D4v(this, null, 21), AbstractC25235BEs.A0S(this));
        } else {
            AbstractC166987dD.A0c(view, R.id.megaphone_header_content).setVisibility(0);
            AbstractC166987dD.A0c(view, R.id.headline_bottom_divider).setVisibility(0);
            AbstractC166997dE.A19(requireContext(), (ImageView) view.findViewById(R.id.megaphone_header_icon), R.drawable.ig_illustrations_qp_circle_dollar_refresh);
            AbstractC25227BEk.A12(AbstractC166987dD.A0e(view, R.id.megaphone_header_title), this, 2131957250);
            AbstractC25227BEk.A12(AbstractC166987dD.A0e(view, R.id.megaphone_header_body), this, 2131957249);
            C25845Bc0 A0w3 = AbstractC25225BEi.A0w(interfaceC09390do);
            FragmentActivity requireActivity2 = requireActivity();
            AbstractC166997dE.A1Y(A0w3.A0D, true);
            D53.A03(requireActivity2, A0w3, AbstractC141776au.A00(A0w3), 33);
            A00(view);
        }
        BY8.A00(getViewLifecycleOwner(), AbstractC25225BEi.A0w(interfaceC09390do).A03, new C50370MLx(16, view, this), 7);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    private final void A00(View view) {
        ((RecyclerView) view.findViewById(R.id.monetization_product_list_recycler_view)).setAdapter((C2UU) this.A01.getValue());
        BY8.A00(getViewLifecycleOwner(), AbstractC25225BEi.A0w(this.A03).A04, new C57749Pjc(this, 43), 7);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1194602745);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.creator_tools_monetization_screen, viewGroup, false);
        C0f9.A09(712119988, A02);
        return inflate;
    }
}
