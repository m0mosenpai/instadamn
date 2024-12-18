package X;

import android.util.LruCache;

/* renamed from: X.Ovn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56127Ovn implements InterfaceC13000lm {
    public final LruCache A00 = new LruCache(30);

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.evictAll();
    }
}
