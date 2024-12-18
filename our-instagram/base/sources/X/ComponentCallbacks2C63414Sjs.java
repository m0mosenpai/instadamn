package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Sjs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ComponentCallbacks2C63414Sjs implements ComponentCallbacks2 {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC65354Tii) it.next()).handleMemoryPressure(i);
        }
    }

    public ComponentCallbacks2C63414Sjs(Context context) {
        context.getApplicationContext().registerComponentCallbacks(this);
    }
}
