package com.instagram.realtimeclient;

import X.C5EZ;
import X.C95094Pu;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.List;

/* loaded from: classes.dex */
public abstract class RealtimeEventHandler {
    public abstract boolean canHandleRealtimeEvent(String str, String str2);

    public abstract List getMqttTopicsToHandle();

    public abstract boolean handleRealtimeEvent(C5EZ c5ez, RealtimePayload realtimePayload);

    public void onMqttChannelStateChanged(C95094Pu c95094Pu) {
    }

    public void onSendRealtimeCommand(String str, RealtimeClientManager.MessageDeliveryCallback messageDeliveryCallback) {
    }

    public boolean shouldNotifyMqttChannelStateChanged() {
        return false;
    }
}
