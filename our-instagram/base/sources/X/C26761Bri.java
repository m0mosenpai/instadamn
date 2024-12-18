package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.Bri, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26761Bri extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CreatorToolsMainScreenFragment";
    public final InterfaceC09390do A02 = AbstractC25225BEi.A0a(new D87(this, 35), new D87(this, 36), new C50169MDw(23, this, null), AbstractC25225BEi.A1D(C25845Bc0.class));
    public final InterfaceC09390do A00 = C1XM.A00(new D87(this, 34));
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131957244);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "CreatorToolsPlaygroundFragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC166997dE.A19(requireContext(), (ImageView) view.findViewById(R.id.megaphone_header_icon), R.drawable.ig_illustrations_qp_user_circle_refresh);
        AbstractC25227BEk.A12(AbstractC166987dD.A0e(view, R.id.megaphone_header_title), this, 2131957246);
        AbstractC25227BEk.A12(AbstractC166987dD.A0e(view, R.id.megaphone_header_body), this, 2131957245);
        ((RecyclerView) view.findViewById(R.id.list_recycler_view)).setAdapter((C2UU) this.A00.getValue());
        InterfaceC09390do interfaceC09390do = this.A02;
        C25845Bc0 A0w = AbstractC25225BEi.A0w(interfaceC09390do);
        FragmentActivity requireActivity = requireActivity();
        AbstractC166997dE.A1Y(A0w.A0D, true);
        D53.A03(requireActivity, A0w, AbstractC141776au.A00(A0w), 32);
        BY8.A00(getViewLifecycleOwner(), AbstractC25225BEi.A0w(interfaceC09390do).A05, new C57749Pjc(this, 42), 6);
        BY8.A00(getViewLifecycleOwner(), AbstractC25225BEi.A0w(interfaceC09390do).A03, new C50370MLx(15, view, this), 6);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-574033138);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.creator_tools_main_screen, viewGroup, false);
        C0f9.A09(121823897, A02);
        return inflate;
    }
}
