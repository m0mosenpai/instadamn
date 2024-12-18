package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BsH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26793BsH extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "EditVisibilityFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Ehk(requireContext().getString(2131961567));
        interfaceC56362iU.Ect(requireContext().getString(2131972699), ViewOnClickListenerC28666ClE.A00(this, 28));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "school_settings_edit_visibility";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public C26793BsH() {
        X30 x30 = new X30(this, 1);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C29886DGa(new C29886DGa(this, 48), 49));
        this.A01 = AbstractC25225BEi.A0a(new X30(A00, 0), x30, new C57252Pba(2, null, A00), AbstractC25225BEi.A1D(C25829Bbk.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-472066734);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30482DbR.A00(this, 5), 1020276171);
        C0f9.A09(1258139133, A02);
        return A00;
    }
}
