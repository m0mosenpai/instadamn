package X;

import com.facebook.react.uimanager.ViewManager;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TNs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64636TNs implements Runnable {
    public final /* synthetic */ ComponentCallbacks2C63415Sjt A00;
    public final /* synthetic */ List A01;

    public RunnableC64636TNs(ComponentCallbacks2C63415Sjt componentCallbacks2C63415Sjt, List list) {
        this.A00 = componentCallbacks2C63415Sjt;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).trimMemory();
        }
    }
}
