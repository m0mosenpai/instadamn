package com.instagram.notifications.push;

import X.C0w9;
import com.amazon.device.messaging.ADMMessageReceiver;

/* loaded from: classes8.dex */
public class ADMMessageHandler$Receiver extends ADMMessageReceiver {
    public static boolean A00;

    static {
        try {
            Class.forName("com.amazon.device.messaging.ADMMessageHandlerJobBase");
            A00 = true;
        } catch (ClassNotFoundException unused) {
            C0w9.A03("ADMMessagehandler ADMMessageHandlerJob", "ADMMessageHandlerJobBase is not available. Need to fall back to legacy implementation");
        }
    }

    public ADMMessageHandler$Receiver() {
        super(ADMMessageLegacyHandler.class);
        if (A00) {
            registerJobServiceClass(ADMMessageJobHandler.class, 8941);
        }
    }
}
