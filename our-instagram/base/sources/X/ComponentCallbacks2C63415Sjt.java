package X;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Sjt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ComponentCallbacks2C63415Sjt implements ComponentCallbacks2 {
    public final Map A00;

    public final synchronized ViewManager A00(String str) {
        ViewManager viewManager;
        Map map = this.A00;
        viewManager = (ViewManager) map.get(str);
        if (viewManager == null && (viewManager = (ViewManager) map.get(AnonymousClass001.A0R("RCT", str))) == null) {
            throw new R3C(AnonymousClass001.A0R("No ViewManager found for class ", str));
        }
        return viewManager;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(0);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        ArrayList A0n;
        synchronized (this) {
            A0n = AbstractC31180DnO.A0n(this.A00);
        }
        RunnableC64636TNs runnableC64636TNs = new RunnableC64636TNs(this, A0n);
        if (C63255SgD.A02()) {
            runnableC64636TNs.run();
        } else {
            C63255SgD.A01(runnableC64636TNs);
        }
    }

    public ComponentCallbacks2C63415Sjt(List list) {
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ViewManager viewManager = (ViewManager) it.next();
            A1G.put(viewManager.getName(), viewManager);
        }
        this.A00 = A1G;
    }
}
