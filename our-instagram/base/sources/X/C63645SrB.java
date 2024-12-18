package X;

import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* renamed from: X.SrB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63645SrB implements InterfaceC65304Thc {
    public final /* synthetic */ QES A00;

    public C63645SrB(QES qes) {
        this.A00 = qes;
    }

    @Override // X.InterfaceC65304Thc
    public final void Da0(android.net.Uri uri, WebView webView, C62941SYj c62941SYj, SAF saf, boolean z) {
        String A00;
        SNG sng;
        String obj;
        AbstractC43594JPz.A1P(uri, saf);
        if (!z) {
            QES qes = this.A00;
            WeakReference weakReference = qes.A00;
            if (weakReference != null) {
                weakReference.clear();
            }
            qes.A00 = AbstractC25225BEi.A16(saf);
            A00 = c62941SYj.A00();
            if (A00 != null) {
                sng = qes.A01;
                obj = null;
            } else {
                return;
            }
        } else {
            C0K8.A0C("FbPaySDKIFrameInjector", "Web message listener is called on the main frame");
            A00 = c62941SYj.A00();
            if (A00 == null) {
                return;
            }
            sng = this.A00.A01;
            obj = uri.toString();
        }
        sng.A01(A00, obj);
    }
}
