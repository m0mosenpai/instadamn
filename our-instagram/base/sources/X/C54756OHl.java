package X;

import android.util.LruCache;
import com.android.billingclient.api.SkuDetails;

/* renamed from: X.OHl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54756OHl {
    public final LruCache A00;
    public final C0JM A01;

    public final SkuDetails A00(String str) {
        C14360o3.A0B(str, 0);
        LruCache lruCache = this.A00;
        C26076Bg5 c26076Bg5 = (C26076Bg5) lruCache.get(str);
        if (c26076Bg5 == null) {
            return null;
        }
        if (c26076Bg5.A00 > this.A01.now()) {
            return (SkuDetails) c26076Bg5.A01;
        }
        lruCache.remove(str);
        return null;
    }

    public /* synthetic */ C54756OHl() {
        C03250Di c03250Di = C03250Di.A00;
        C14360o3.A0B(c03250Di, 3);
        this.A01 = c03250Di;
        this.A00 = new LruCache(20);
    }
}
