package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.9f3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214659f3 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ClipsAudioBrowserBackgroundFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return MSV.A00(1417);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1710537085);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_audio_browser_background_fragment, viewGroup, false);
        C0f9.A09(1996729737, A02);
        return inflate;
    }
}
