package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Brb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26754Brb extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CreatorAISettingsContentFragment";
    public final InterfaceC09390do A01 = DH6.A01(this, "creator_ai_creator_fbid", EnumC09460dv.A02, 38);
    public final InterfaceC09390do A00 = C29908DGw.A00(this, 17);
    public final String A03 = "creator_ai_settings_content_fragment";
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131957063);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1131538296);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30481DbQ.A00(this, 43), 1889625010);
        C0f9.A09(1062092152, A02);
        return A00;
    }
}
