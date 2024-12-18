package X;

import com.facebook.browser.lite.webview.SystemWebView;
import java.lang.ref.WeakReference;
import java.util.Collections;

/* loaded from: classes10.dex */
public final class QES extends SPI {
    public WeakReference A00;
    public final SNG A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final boolean A04;

    @Override // X.SPI
    public final void A01(QF6 qf6, String str) {
        WeakReference weakReference;
        if (AbstractC167007dF.A1Z(this.A02) && (weakReference = this.A00) != null) {
            SAF saf = (SAF) weakReference.get();
            if (saf != null) {
                if (SVN.A0a.A01()) {
                    saf.A00.postMessage(str);
                    return;
                }
                throw AbstractC166987dD.A1D("This method is not supported by the current version of the framework and the current WebView APK");
            }
            return;
        }
        super.A01(qf6, str);
    }

    public QES(SNG sng) {
        super(sng);
        this.A01 = sng;
        C17050sx A01 = AbstractC09440dt.A01(C64977Tb2.A00);
        this.A02 = A01;
        this.A04 = AbstractC166987dD.A1a(A01.getValue());
        this.A03 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57243PbR(this, 1));
    }

    @Override // X.SPI
    public final void A00(QF6 qf6) {
        super.A00(qf6);
        if (this.A04) {
            try {
                R7V r7v = ((SystemWebView) qf6).A04;
                C14360o3.A0C(r7v, "null cannot be cast to non-null type android.webkit.WebView");
                java.util.Set singleton = Collections.singleton("*");
                C14360o3.A07(singleton);
                AbstractC022408w.A04(r7v, (InterfaceC65304Thc) this.A03.getValue(), "fbpayIAWIFrameBridge", singleton);
                return;
            } catch (IllegalArgumentException e) {
                C0K8.A0F("FbPaySDKIFrameInjector", "Failed to add web message listener", e);
                return;
            }
        }
        C0K8.A0C("FbPaySDKIFrameInjector", AnonymousClass001.A1D("WEB_MESSAGE_LISTENER feature supported: ", AbstractC167007dF.A1Z(this.A02)));
    }
}
