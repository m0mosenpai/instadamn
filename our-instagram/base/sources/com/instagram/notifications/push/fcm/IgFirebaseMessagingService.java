package com.instagram.notifications.push.fcm;

import X.C0f9;
import X.C2Sr;
import X.InterfaceC09390do;
import com.google.firebase.messaging.FirebaseMessagingService;

/* loaded from: classes10.dex */
public final class IgFirebaseMessagingService extends FirebaseMessagingService {
    @Override // android.app.Service
    public final void onCreate() {
        InterfaceC09390do interfaceC09390do;
        int A04 = C0f9.A04(1233290219);
        super.onCreate();
        synchronized (C2Sr.class) {
            C2Sr.A00();
            interfaceC09390do = C2Sr.A02;
        }
        interfaceC09390do.getValue();
        C0f9.A0B(-1762435022, A04);
    }
}
