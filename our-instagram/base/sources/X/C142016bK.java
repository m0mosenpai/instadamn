package X;

import android.util.LruCache;

/* renamed from: X.6bK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142016bK implements InterfaceC13000lm {
    public final LruCache A00 = new LruCache(4);

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.evictAll();
    }
}
