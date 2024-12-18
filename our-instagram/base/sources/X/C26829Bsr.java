package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Bsr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26829Bsr extends AbstractC59962oe implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "ComposePivotPageDefaultHeaderFragmentImpl";
    public MOE A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    public final void A00(C0UO c0uo) {
        C14360o3.A0B(c0uo, 0);
        C25857BcC c25857BcC = (C25857BcC) this.A02.getValue();
        InterfaceC23621Ds A0s = AbstractC25230BEn.A0s(c25857BcC.A00);
        c25857BcC.A00 = AbstractC25226BEj.A1L(new C57156PZa(c25857BcC, c0uo, A0s, 35), AbstractC141776au.A00(c25857BcC));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "compose_default_pivot_page_header_fragment";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public C26829Bsr() {
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C29888DGc.A00(C29888DGc.A00(this, 8), 9));
        C0YZ A1D = AbstractC25225BEi.A1D(C25857BcC.class);
        this.A02 = AbstractC25225BEi.A0a(C29888DGc.A00(A00, 10), new D8J(9, A00, this), new D8J(8, null, A00), A1D);
        this.A01 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1942578811);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30506Dbp(this, 23), 1171389889);
        C0f9.A09(1439559400, A02);
        return A00;
    }
}
