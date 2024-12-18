package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Bru, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26773Bru extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AchievementTiersFragment";
    public final InterfaceC09390do A00 = C1XM.A00(new C29656D5y(this));
    public final InterfaceC09390do A02 = C1XM.A00(new C29657D5z(this));
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String str;
        C14360o3.A0B(interfaceC56362iU, 0);
        Context context = getContext();
        if (context != null) {
            str = AbstractC167007dF.A0f(context, requireArguments().getString("achievementTitle"), 2131952128);
        } else {
            str = null;
        }
        interfaceC56362iU.setTitle(str);
        interfaceC56362iU.EkS(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "achievement_tiers_fragment";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1823574870);
        C14360o3.A0B(layoutInflater, 0);
        ComposeView A022 = AbstractC25319BIo.A02(this, C5UA.A03(new DT0(10, this, viewGroup, bundle, layoutInflater), 2027082917), false, false);
        C0f9.A09(1964017997, A02);
        return A022;
    }
}
