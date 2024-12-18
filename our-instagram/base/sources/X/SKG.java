package X;

import android.webkit.JavascriptInterface;

/* loaded from: classes10.dex */
public final class SKG {
    public final InterfaceC65334TiF A00;

    @JavascriptInterface
    public void log(String str) {
        try {
            this.A00.onLog(str);
        } catch (Exception e) {
            C0K8.A05(SKG.class, "Log message failed", e);
        }
    }

    public SKG(InterfaceC65334TiF interfaceC65334TiF) {
        this.A00 = interfaceC65334TiF;
    }
}
