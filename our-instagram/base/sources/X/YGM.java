package X;

import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class YGM implements Runnable {
    public final /* synthetic */ XplatNativeClientWrapper A00;

    public YGM(XplatNativeClientWrapper xplatNativeClientWrapper) {
        this.A00 = xplatNativeClientWrapper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A00;
        C20K c20k = XplatNativeClientWrapper.Companion;
        Iterator it = xplatNativeClientWrapper.observers.iterator();
        if (it.hasNext()) {
            it.next();
            throw AbstractC166987dD.A15(AbstractC111324zv.A00(1155));
        }
        C4P5 c4p5 = xplatNativeClientWrapper.stateCallback;
        if (c4p5 == null) {
            C14360o3.A0F("stateCallback");
            throw C00O.createAndThrow();
        }
        c4p5.D7G(C4P9.A06);
    }
}
