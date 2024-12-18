package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Brd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26756Brd extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AchievementsHubFragment";
    public boolean A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final String A05;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131952055);
        C3LO c3lo = new C3LO();
        c3lo.A02(C05F.A0Y);
        ViewOnClickListenerC28667ClF.A02(c3lo, interfaceC56362iU, this, 42);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public C26756Brd() {
        C50161MDo c50161MDo = new C50161MDo(this, 40);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50161MDo(new C50161MDo(this, 44), 45));
        this.A01 = AbstractC25225BEi.A0a(new C50161MDo(A00, 46), c50161MDo, new C29894DGi(1, A00, null), AbstractC25225BEi.A1D(C25876Bcb.class));
        this.A02 = C1XM.A00(new C50161MDo(this, 41));
        this.A04 = AbstractC60492pY.A02(this);
        this.A05 = "achievements_v2";
        this.A03 = AbstractC09440dt.A01(new C50161MDo(this, 43));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1878466576);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30481DbQ.A00(this, 24), -161529695);
        C0f9.A09(-1840063908, A02);
        return A00;
    }
}
