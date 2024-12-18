package X;

import com.facebook.mqtt.service.XplatNativeClientWrapper;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class YIY implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ XplatNativeClientWrapper A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ byte[] A03;

    public YIY(XplatNativeClientWrapper xplatNativeClientWrapper, String str, byte[] bArr, long j) {
        this.A01 = xplatNativeClientWrapper;
        this.A02 = str;
        this.A03 = bArr;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A01;
        C20K c20k = XplatNativeClientWrapper.Companion;
        Iterator it = xplatNativeClientWrapper.observers.iterator();
        if (it.hasNext()) {
            it.next();
            throw AbstractC166987dD.A15("onData");
        }
        C4P5 c4p5 = xplatNativeClientWrapper.stateCallback;
        if (c4p5 == null) {
            C14360o3.A0F("stateCallback");
            throw C00O.createAndThrow();
        }
        c4p5.onMessageDropped(this.A02, this.A03, this.A00);
    }
}
