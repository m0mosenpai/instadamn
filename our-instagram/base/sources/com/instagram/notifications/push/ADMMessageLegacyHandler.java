package com.instagram.notifications.push;

import X.AbstractC47078KrZ;
import X.C0w9;
import X.C3J1;
import android.content.Intent;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.instagram.common.notifications.push.intf.PushChannelType;

/* loaded from: classes8.dex */
public class ADMMessageLegacyHandler extends ADMMessageHandlerBase {
    public ADMMessageLegacyHandler() {
        super(ADMMessageLegacyHandler.class.getName());
    }

    public final void onRegistrationError(String str) {
        C0w9.A03("ADMMessagehandler onRegistrationError", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRegistered(String str) {
        C3J1.A00().A05(getApplicationContext(), PushChannelType.A04, str, "unknown", 2, false);
    }

    public final void onMessage(Intent intent) {
        AbstractC47078KrZ.A00(intent);
    }

    public final void onUnregistered(String str) {
        C3J1.A00();
    }
}
