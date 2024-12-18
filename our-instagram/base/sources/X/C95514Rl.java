package X;

import android.util.LruCache;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4Rl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95514Rl {
    public final C95504Rk A00;
    public final Map A01;
    public final AtomicBoolean A02;
    public final AtomicReference A03;
    public final LruCache A04;
    public final C42351xP A05;

    public C95514Rl(C42351xP c42351xP, C95504Rk c95504Rk) {
        C14360o3.A0B(c42351xP, 1);
        this.A05 = c42351xP;
        this.A00 = c95504Rk;
        this.A01 = new ConcurrentHashMap();
        this.A03 = new AtomicReference("-1");
        this.A02 = new AtomicBoolean(false);
        this.A04 = new LruCache(200);
    }

    public final C95904Sz A00(C95904Sz c95904Sz, String str) {
        if (this.A05.A0H) {
            Map map = this.A01;
            if (map.containsKey(str)) {
                return (C95904Sz) map.get(str);
            }
            return null;
        }
        return c95904Sz;
    }

    public final void A01() {
        Iterator it = this.A01.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((String) entry.getKey()).equals(this.A03.get())) {
                C95904Sz c95904Sz = (C95904Sz) entry.getValue();
                if (c95904Sz != null) {
                    c95904Sz.A00();
                }
                it.remove();
            }
        }
    }

    public final boolean A02(long j, boolean z) {
        boolean z2;
        LruCache lruCache = this.A04;
        synchronized (lruCache) {
            Long valueOf = Long.valueOf(j);
            z2 = false;
            if (lruCache.get(valueOf) == null) {
                z2 = true;
                if (z) {
                    lruCache.put(valueOf, valueOf);
                }
            }
        }
        return z2;
    }
}
