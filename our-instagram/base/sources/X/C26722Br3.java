package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Br3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26722Br3 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "CommentsInsightsOptInFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "comments_insights_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 32), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public C26722Br3() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A02 = DH5.A01(this, "summary_id", enumC09460dv, 10);
        C29887DGb A00 = C29887DGb.A00(this, 33);
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, C29887DGb.A00(C29887DGb.A00(this, 34), 35));
        this.A00 = AbstractC25225BEi.A0a(C29887DGb.A00(A002, 36), A00, new C50169MDw(12, A002, null), AbstractC25225BEi.A1D(C25836Bbr.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1717358100);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30190DRv(this, 10), -863541888);
        C0f9.A09(641834257, A02);
        return A00;
    }
}
