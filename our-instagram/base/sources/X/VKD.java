package X;

import android.util.LruCache;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class VKD {
    public int A00;
    public int A01;
    public LruCache A02;
    public HashMap A03;

    public final synchronized InterfaceC92354Bq A00(UMT umt) {
        InterfaceC92354Bq interfaceC92354Bq;
        LruCache lruCache;
        interfaceC92354Bq = (InterfaceC92354Bq) this.A02.get(umt);
        if (interfaceC92354Bq != null && (lruCache = (LruCache) this.A03.get(umt.A00)) != null) {
            lruCache.get(umt);
        }
        return interfaceC92354Bq;
    }

    public final synchronized void A01(UMT umt) {
        LruCache lruCache;
        if (((InterfaceC92354Bq) this.A02.remove(umt)) != null && (lruCache = (LruCache) this.A03.get(umt.A00)) != null) {
            lruCache.remove(umt);
        }
    }

    public final synchronized void A02(UMT umt, InterfaceC92354Bq interfaceC92354Bq) {
        HashMap hashMap = this.A03;
        String str = umt.A00;
        LruCache lruCache = (LruCache) hashMap.get(str);
        if (lruCache == null) {
            lruCache = new C66339U9y(this, this.A00);
            hashMap.put(str, lruCache);
        }
        lruCache.put(umt, interfaceC92354Bq);
        this.A02.put(umt, interfaceC92354Bq);
    }
}
