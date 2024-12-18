package X;

import com.facebook.mqtt.service.XplatServiceDelegate;

/* loaded from: classes10.dex */
public final class TKI implements Runnable {
    public final /* synthetic */ XplatServiceDelegate A00;

    public TKI(XplatServiceDelegate xplatServiceDelegate) {
        this.A00 = xplatServiceDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (XplatServiceDelegate.A04) {
            XplatServiceDelegate.A02.A01();
            XplatServiceDelegate.A03.A00();
        }
    }
}
