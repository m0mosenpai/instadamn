package X;

import android.util.LruCache;

/* renamed from: X.71m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1566471m implements InterfaceC13000lm {
    public final LruCache A00 = new LruCache(30);

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.evictAll();
    }
}
