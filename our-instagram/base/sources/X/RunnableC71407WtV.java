package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.browser.lite.chrome.container.DefaultBrowserLiteChrome;

/* renamed from: X.WtV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71407WtV implements Runnable {
    public final /* synthetic */ DefaultBrowserLiteChrome A00;
    public final /* synthetic */ String A01;

    public RunnableC71407WtV(DefaultBrowserLiteChrome defaultBrowserLiteChrome, String str) {
        this.A00 = defaultBrowserLiteChrome;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentActivity activity;
        DefaultBrowserLiteChrome defaultBrowserLiteChrome = this.A00;
        InterfaceC172717mh interfaceC172717mh = defaultBrowserLiteChrome.A05;
        if (interfaceC172717mh != null && (activity = interfaceC172717mh.getActivity()) != null) {
            C5SU c5su = new C5SU(activity, new C149686oL(this.A01));
            c5su.A03(defaultBrowserLiteChrome.findViewById(R.id.ig_browser_menu_button));
            c5su.A01();
            c5su.A0B = false;
            c5su.A0A = true;
            c5su.A00().A07(defaultBrowserLiteChrome.A07);
        }
    }
}
