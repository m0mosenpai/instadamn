package X;

import android.util.LruCache;

/* renamed from: X.Ovm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56126Ovm implements InterfaceC13000lm {
    public final LruCache A00 = new LruCache(1024);

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.evictAll();
    }
}
