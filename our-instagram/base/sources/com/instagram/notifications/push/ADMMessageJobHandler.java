package com.instagram.notifications.push;

import X.AbstractC47078KrZ;
import X.C0w9;
import X.C3J1;
import android.content.Context;
import android.content.Intent;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.instagram.common.notifications.push.intf.PushChannelType;

/* loaded from: classes8.dex */
public class ADMMessageJobHandler extends ADMMessageHandlerJobBase {
    public final void onRegistrationError(Context context, String str) {
        C0w9.A03("ADMMessagehandler onRegistrationError", str);
    }

    public final void onRegistered(Context context, String str) {
        C3J1.A00().A05(context, PushChannelType.A04, str, "unknown", 2, false);
    }

    public final void onMessage(Context context, Intent intent) {
        AbstractC47078KrZ.A00(intent);
    }

    public final void onUnregistered(Context context, String str) {
        C3J1.A00();
    }
}
