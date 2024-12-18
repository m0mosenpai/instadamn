package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes8.dex */
public final class KBC extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "UpdatesHubSettingsFragment";
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A00 = C1XM.A00(new C50162MDp(this, 19));
    public final InterfaceC09390do A01 = C1XM.A00(new C50162MDp(this, 20));
    public final C19L A04 = AbstractC167017dG.A0w(C12L.A00, -18);
    public final InterfaceC09390do A02 = C1XM.A00(new C50162MDp(this, 21));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "updates_hub_settings_fragment";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1981959956);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30480DbP(this, 22), 361276834);
        C0f9.A09(-1605328409, A02);
        return A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(909730499);
        super.onPause();
        MBq.A01(this, this.A04, 6);
        C0f9.A09(-1789263102, A02);
    }
}
