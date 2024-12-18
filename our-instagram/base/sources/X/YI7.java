package X;

import com.facebook.mqtt.service.ConnectionConfig;
import com.facebook.mqtt.service.XplatNativeClientWrapper;

/* loaded from: classes12.dex */
public final class YI7 implements Runnable {
    public final /* synthetic */ ConnectionConfig A00;
    public final /* synthetic */ XplatNativeClientWrapper A01;
    public final /* synthetic */ Integer A02;

    public YI7(ConnectionConfig connectionConfig, XplatNativeClientWrapper xplatNativeClientWrapper, Integer num) {
        this.A01 = xplatNativeClientWrapper;
        this.A02 = num;
        this.A00 = connectionConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        XplatNativeClientWrapper xplatNativeClientWrapper = this.A01;
        C20K c20k = XplatNativeClientWrapper.Companion;
        C4P5 c4p5 = xplatNativeClientWrapper.stateCallback;
        if (c4p5 == null) {
            C14360o3.A0F("stateCallback");
            throw C00O.createAndThrow();
        }
        c4p5.D7A(this.A00, this.A02);
    }
}
