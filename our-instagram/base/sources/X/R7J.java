package X;

import android.webkit.WebView;
import com.instagram.neko.playables.activity.PlayableProgressBar;

/* loaded from: classes10.dex */
public final class R7J extends SKX {
    public final /* synthetic */ Rb4 A00;

    @Override // X.SKX
    public final void A00(WebView webView, int i) {
        C14360o3.A0B(webView, 0);
        super.A00(webView, i);
        PlayableProgressBar playableProgressBar = this.A00.A02;
        if (playableProgressBar == null) {
            C14360o3.A0F("playableProgressBar");
            throw C00O.createAndThrow();
        }
        playableProgressBar.A00(i);
    }

    public R7J(Rb4 rb4) {
        this.A00 = rb4;
    }
}
