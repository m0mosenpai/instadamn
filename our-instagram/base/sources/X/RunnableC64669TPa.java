package X;

import android.webkit.WebView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TPa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64669TPa implements Runnable {
    public final /* synthetic */ WebView A00;
    public final /* synthetic */ C58717Q4q A01;
    public final /* synthetic */ String A02;

    public RunnableC64669TPa(WebView webView, C58717Q4q c58717Q4q, String str) {
        this.A01 = c58717Q4q;
        this.A00 = webView;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.A01.A03;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC65335TiG) it.next()).DXV((R7U) this.A00, this.A02);
            }
        }
    }
}
