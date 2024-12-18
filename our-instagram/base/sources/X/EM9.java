package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes6.dex */
public final class EM9 extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "UserListFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_thread_one_one_one_user_list";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public EM9() {
        C37060GUu A01 = C37060GUu.A01(this, 18);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C37060GUu.A01(C37060GUu.A01(this, 15), 16));
        this.A01 = AbstractC25225BEi.A0a(C37060GUu.A01(A00, 17), A01, new C37018GSz(25, A00, null), AbstractC25225BEi.A1D(C25825Bbg.class));
        this.A00 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31175DnJ.A1I(interfaceC56362iU, AbstractC31176DnK.A05(this, interfaceC56362iU).getString(2131959091));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-876505493);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30190DRv(this, 38), 1459313678);
        C0f9.A09(-1544063575, A02);
        return A00;
    }
}
