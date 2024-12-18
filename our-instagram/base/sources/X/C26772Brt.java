package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Brt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26772Brt extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ChallengeTiersFragment";
    public final InterfaceC09390do A00 = C29911DGz.A00(this, 5);
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.setTitle(requireArguments().getString("challengeTitle"));
        interfaceC56362iU.EkS(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "challenge_tiers_fragment";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1027989866);
        C14360o3.A0B(layoutInflater, 0);
        ComposeView A022 = AbstractC25319BIo.A02(this, C5UA.A03(new DT0(11, this, viewGroup, bundle, layoutInflater), -1640292251), false, false);
        C0f9.A09(1346099606, A02);
        return A022;
    }

    public static final /* synthetic */ void A00(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup, C26772Brt c26772Brt) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
