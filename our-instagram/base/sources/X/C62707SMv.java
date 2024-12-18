package X;

import android.content.Context;
import android.webkit.WebView;
import com.facebook.browser.lite.ipc.PrefetchCacheEntry;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.SMv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62707SMv {
    public static C62707SMv A09;
    public long A00;
    public WebView A01;
    public C63305ShB A02;
    public PrefetchCacheEntry A03;
    public String A04;
    public List A05;
    public final Context A07;
    public final LinkedList A08 = AbstractC58318PtA.A11();
    public boolean A06 = false;

    public final synchronized void A00(PrefetchCacheEntry prefetchCacheEntry) {
        if (this.A06) {
            LinkedList linkedList = this.A08;
            if (linkedList.size() < 10) {
                linkedList.addLast(prefetchCacheEntry);
            } else if (AbstractC63254SgB.A00) {
                android.util.Log.w("BrowserHtmlResourceExtractor", "Too many extract resource requests, dropping current one");
            }
        } else {
            this.A06 = true;
            STG.A00(new TNN(prefetchCacheEntry, this));
        }
    }

    public C62707SMv(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A07 = applicationContext;
        C63305ShB A00 = C63305ShB.A00();
        this.A02 = A00;
        SH1 sh1 = SH1.A03;
        if (sh1 == null) {
            sh1 = new SH1();
            SH1.A03 = sh1;
        }
        A00.A05 = sh1;
        this.A02.A05(applicationContext, false);
        this.A05 = Collections.synchronizedList(AbstractC58318PtA.A11());
    }
}
