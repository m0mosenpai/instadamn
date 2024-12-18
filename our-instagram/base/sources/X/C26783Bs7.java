package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Bs7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26783Bs7 extends AbstractC59962oe implements InterfaceC60112ot, InterfaceC37175GZm {
    public static final String __redex_internal_original_name = "CommentInsightsFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A01 = DH5.A01(this, "summary_id", EnumC09460dv.A02, 30);
    public final String A02 = MSV.A00(1260);
    public final boolean A03 = true;

    @Override // X.InterfaceC60112ot
    public final boolean CPM() {
        return false;
    }

    @Override // X.InterfaceC37175GZm
    public final void DI0() {
    }

    @Override // X.InterfaceC37175GZm
    public final void DI4() {
    }

    @Override // X.InterfaceC37175GZm
    public final void Dqy() {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkF(true);
        interfaceC56362iU.Efu(2131956453);
        if (AbstractC54792fc.A02(AbstractC25230BEn.A0k(this.A00, 0))) {
            interfaceC56362iU.EkS(true);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        MUI A00 = CJR.A00(AbstractC166987dD.A0r(this.A00), null, AbstractC25225BEi.A15(this.A01));
        C14240no c14240no = new C14240no(getChildFragmentManager());
        c14240no.A0A(A00, R.id.newsfeed_you);
        c14240no.A00();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A02;
    }

    @Override // X.AbstractC59962oe
    public final boolean isContainerFragment() {
        return this.A03;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1027162464);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_newsfeed, viewGroup, false);
        C0f9.A09(335950339, A02);
        return inflate;
    }
}
