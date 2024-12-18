package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Brg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26759Brg extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "TemplateDetailsFragment";
    public final InterfaceC09390do A02 = AbstractC25225BEi.A0a(DGX.A00(this, 23), DGX.A00(this, 24), new C29897DGl(9, null, this), AbstractC25235BEs.A0y());
    public final InterfaceC09390do A00 = C1XM.A00(DGX.A00(this, 22));
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "template_details_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C28484Chc A0q = AbstractC25226BEj.A0q(this.A00);
        String A02 = C25879Bce.A02(this.A02);
        C25531Mh A00 = C28484Chc.A00(A0q);
        if (AbstractC25226BEj.A1Z(A00)) {
            AbstractC25230BEn.A1E(A00, "creation_template_details_screen_shown", A02);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131952716);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1624245996);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30480DbP.A00(this, 7), 506924320);
        C0f9.A09(520704081, A02);
        return A00;
    }
}
