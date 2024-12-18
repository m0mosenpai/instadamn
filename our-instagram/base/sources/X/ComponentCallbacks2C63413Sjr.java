package X;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: X.Sjr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ComponentCallbacks2C63413Sjr implements ComponentCallbacks2 {
    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 60) {
            ((C63592Spz) C62829STb.A00.getValue()).A00();
        }
    }
}
