package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Br2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26721Br2 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "PotatoAudienceSelectorFragment";
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);
    public final String A02 = "potato_audience_selector_fragment";

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57160PZe(viewLifecycleOwner, c07s, this, (InterfaceC23621Ds) null, 7), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public C26721Br2() {
        B8S b8s = new B8S(this, 11);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new B8S(new B8S(this, 8), 9));
        this.A01 = AbstractC25225BEi.A0a(new B8S(A00, 10), b8s, new B61(38, null, A00), AbstractC25225BEi.A1D(C210779Tz.class));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A02;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(48883082);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30192DRx(this, 26), 1804596131);
        C0f9.A09(1939042477, A02);
        return A00;
    }
}
