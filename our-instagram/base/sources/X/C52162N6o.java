package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.Map;

/* renamed from: X.N6o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52162N6o extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "HighlightsSettingsFragment";
    public final C55826Oqc A00;
    public final Map A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reel_highlights_settings";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    public C52162N6o() {
        C57508Pfi c57508Pfi = new C57508Pfi(this, 30);
        InterfaceC09390do A00 = C57508Pfi.A00(new C57508Pfi(this, 27), EnumC09460dv.A02, 28);
        this.A03 = AbstractC25225BEi.A0a(new C57508Pfi(A00, 29), c57508Pfi, new MHV(0, (Object) null, A00), AbstractC25225BEi.A1D(C44461JlT.class));
        this.A02 = AbstractC60492pY.A02(this);
        this.A01 = AbstractC166987dD.A1I();
        this.A00 = new C55826Oqc(this);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.setTitle(AbstractC31176DnK.A05(this, interfaceC56362iU).getResources().getString(2131961592));
        interfaceC56362iU.ETp(true);
        interfaceC56362iU.EkS(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1772480826);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30480DbP(this, 15), 916323101);
        C0f9.A09(-257445781, A02);
        return A00;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1812475643);
        super.onResume();
        ((C44461JlT) this.A03.getValue()).A0E();
        C0f9.A09(-2145565385, A02);
    }
}
