package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes9.dex */
public final class N47 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ComposeAudioTranslationsOptionsFragment";
    public final InterfaceC09390do A02 = C57515Pfp.A00(this, 31);
    public final InterfaceC09390do A04 = C57515Pfp.A00(this, 33);
    public final InterfaceC09390do A03 = C57515Pfp.A00(this, 32);
    public final InterfaceC09390do A05 = C57515Pfp.A00(this, 35);
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);
    public final String A01 = "audio_translations_option_fragment";

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A01;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1002999102);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30506Dbp(this, 28), -1922560794);
        C0f9.A09(146883035, A02);
        return A00;
    }
}
