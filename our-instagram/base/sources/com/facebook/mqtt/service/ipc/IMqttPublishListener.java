package com.facebook.mqtt.service.ipc;

import X.C0f9;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes9.dex */
public interface IMqttPublishListener extends IInterface {

    /* loaded from: classes9.dex */
    public abstract class Stub extends Binder implements IMqttPublishListener {

        /* loaded from: classes9.dex */
        public final class Proxy implements IMqttPublishListener {
            public IBinder A00;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                int A03 = C0f9.A03(-2045656236);
                IBinder iBinder = this.A00;
                C0f9.A0A(-1136486335, A03);
                return iBinder;
            }
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [com.facebook.mqtt.service.ipc.IMqttPublishListener$Stub$Proxy, java.lang.Object, com.facebook.mqtt.service.ipc.IMqttPublishListener] */
        public static IMqttPublishListener A00(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.mqtt.service.ipc.IMqttPublishListener");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IMqttPublishListener)) {
                return (IMqttPublishListener) queryLocalInterface;
            }
            ?? obj = new Object();
            int A03 = C0f9.A03(1507773689);
            obj.A00 = iBinder;
            C0f9.A0A(128547923, A03);
            return obj;
        }
    }
}
