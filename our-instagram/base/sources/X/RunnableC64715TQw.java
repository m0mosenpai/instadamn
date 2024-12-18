package X;

import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;

/* renamed from: X.TQw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64715TQw implements Runnable {
    public final /* synthetic */ BrowserLiteJSBridgeProxy A00;
    public final /* synthetic */ SMR A01;
    public final /* synthetic */ QF6 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public RunnableC64715TQw(BrowserLiteJSBridgeProxy browserLiteJSBridgeProxy, SMR smr, QF6 qf6, String str, String str2) {
        this.A00 = browserLiteJSBridgeProxy;
        this.A04 = str;
        this.A02 = qf6;
        this.A03 = str2;
        this.A01 = smr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.net.Uri uri;
        String str = this.A04;
        QF6 qf6 = this.A02;
        if (S8U.A00.contains(this.A03)) {
            String A05 = qf6.A05();
            android.net.Uri uri2 = null;
            if (A05 != null) {
                uri = AbstractC58319PtB.A09(A05);
            } else {
                uri = null;
            }
            if (str != null) {
                uri2 = AbstractC58319PtB.A09(str);
            }
            if (uri != null && uri.getAuthority() != null && uri2 != null && uri2.getAuthority() != null && C14360o3.A0K(uri.getAuthority(), uri2.getAuthority())) {
                String A00 = this.A01.A00();
                if (A00 != null) {
                    qf6.A0G(A00);
                    return;
                }
                return;
            }
        }
        AbstractC63254SgB.A01("BrowserLiteJSBridgeProxy", "Could not invoke js callback due to domain change", new Object[0]);
    }
}
