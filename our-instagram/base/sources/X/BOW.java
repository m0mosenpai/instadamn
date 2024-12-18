package X;

import android.content.Context;
import android.util.LruCache;

/* loaded from: classes5.dex */
public final class BOW implements InterfaceC13000lm {
    public final LruCache A00 = new LruCache(50);

    public final C6RB A00(Context context, JV1 jv1) {
        LruCache lruCache = this.A00;
        C6RB c6rb = (C6RB) lruCache.get(String.valueOf(jv1.hashCode()));
        if (c6rb == null) {
            C6RB A01 = AbstractC43745JWf.A01(context, jv1, AbstractC43745JWf.A00(context, jv1));
            lruCache.put(String.valueOf(jv1.hashCode()), A01);
            return A01;
        }
        return c6rb;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.evictAll();
    }
}
