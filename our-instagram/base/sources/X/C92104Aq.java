package X;

import android.util.LruCache;

/* renamed from: X.4Aq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92104Aq {
    public static C92104Aq A01;
    public final LruCache A00;

    public final synchronized void A01() {
        this.A00.evictAll();
    }

    public static synchronized C92104Aq A00() {
        C92104Aq c92104Aq;
        synchronized (C92104Aq.class) {
            c92104Aq = A01;
            if (c92104Aq == null) {
                c92104Aq = null;
            }
        }
        return c92104Aq;
    }

    public C92104Aq(int i) {
        this.A00 = new LruCache(i <= 0 ? 5 : i);
    }
}
