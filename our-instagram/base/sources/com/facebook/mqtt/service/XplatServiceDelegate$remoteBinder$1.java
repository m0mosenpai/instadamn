package com.facebook.mqtt.service;

import X.C0K8;
import X.C0f9;
import X.InterfaceC16820sZ;
import android.os.Binder;
import android.os.DeadObjectException;
import android.os.IBinder;
import com.facebook.mqtt.service.ipc.IMqttXplatService;

/* loaded from: classes10.dex */
public final class XplatServiceDelegate$remoteBinder$1 extends Binder implements IMqttXplatService {
    public XplatServiceDelegate$remoteBinder$1() {
        int A03 = C0f9.A03(74830910);
        attachInterface(this, "com.facebook.mqtt.service.ipc.IMqttXplatService");
        C0f9.A0A(230065811, A03);
        C0f9.A0A(-157484549, C0f9.A03(1945355825));
    }

    public final void A00(InterfaceC16820sZ interfaceC16820sZ) {
        int A03 = C0f9.A03(1830953771);
        try {
            interfaceC16820sZ.invoke();
        } catch (RuntimeException e) {
            int A032 = C0f9.A03(297603381);
            if (e.getCause() instanceof DeadObjectException) {
                C0K8.A0G("MqttXplatService", "System is dead", e);
                C0f9.A0A(1544414200, A032);
            } else {
                C0f9.A0A(282582318, A032);
                throw e;
            }
        }
        C0f9.A0A(1375900965, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(-1259846668, C0f9.A03(-741844994));
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0120, code lost:
    
        if (r1 != false) goto L28;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, com.facebook.mqtt.service.ipc.IMqttPublishExtListener$Stub$Proxy] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.facebook.mqtt.service.ipc.IMqttSubscribeListener$Stub$Proxy, java.lang.Object] */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTransact(int r16, android.os.Parcel r17, android.os.Parcel r18, int r19) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mqtt.service.XplatServiceDelegate$remoteBinder$1.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
