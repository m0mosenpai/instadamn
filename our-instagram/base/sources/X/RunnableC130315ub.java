package X;

import android.util.LruCache;

/* renamed from: X.5ub, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC130315ub implements Runnable {
    public final /* synthetic */ C129845to A00;

    public RunnableC130315ub(C129845to c129845to) {
        this.A00 = c129845to;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C129845to c129845to = this.A00;
        C4DW c4dw = c129845to.A03;
        long currentTimeMillis = System.currentTimeMillis();
        LruCache lruCache = c4dw.A00;
        for (Object obj : lruCache.snapshot().keySet()) {
            C129835tn c129835tn = (C129835tn) lruCache.get(obj);
            if (c129835tn != null) {
                long j = c129835tn.A00;
                if (j != -1 && j <= currentTimeMillis) {
                    lruCache.remove(obj);
                }
            }
        }
        if (lruCache.size() > 0) {
            c129845to.A02.postDelayed(new RunnableC130315ub(c129845to), c129845to.A01);
        } else {
            c129845to.A00 = false;
        }
    }
}
