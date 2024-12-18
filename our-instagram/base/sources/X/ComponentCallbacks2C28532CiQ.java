package X;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.util.LruCache;

/* renamed from: X.CiQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ComponentCallbacks2C28532CiQ implements ComponentCallbacks2 {
    public final LruCache A00 = new LruCache(5);

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.A00.evictAll();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 10) {
            onLowMemory();
        }
    }
}
