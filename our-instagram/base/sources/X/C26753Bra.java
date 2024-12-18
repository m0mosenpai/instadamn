package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Bra, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26753Bra extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AboutAchievementsFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131951988);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "about_achievements_fragment";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    public C26753Bra() {
        C50161MDo c50161MDo = new C50161MDo(this, 28);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50161MDo(new C50161MDo(this, 30), 31));
        this.A00 = AbstractC25225BEi.A0a(new C50161MDo(A00, 32), c50161MDo, new ME0(42, A00, null), AbstractC25225BEi.A1D(C25821Bbc.class));
        this.A01 = C1XM.A00(new C50161MDo(this, 29));
        this.A02 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1163585818);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30481DbQ.A00(this, 21), 1142879841);
        C0f9.A09(-862147985, A02);
        return A00;
    }
}
