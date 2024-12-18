package com.instagram.realtimeclient;

import X.AbstractC167007dF;
import X.AbstractC31173DnH;
import X.AbstractC58318PtA;
import X.C05F;
import X.C19280xC;
import X.C5EZ;
import X.C95094Pu;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.Random;

/* loaded from: classes10.dex */
public class AnalyticsLoggingObserver implements RealtimeClientManager.Observer {
    public int mConnectingCount;
    public long mLastConnectionStatusChangeTimestamp;
    public final Random mRandomGenerator = new Random();
    public final int mReceiveMessageSampleRate;
    public final UserSession mUserSession;

    @Override // com.instagram.realtimeclient.RealtimeClientManager.Observer
    public void onMessage(C5EZ c5ez) {
    }

    @Override // com.instagram.realtimeclient.RealtimeClientManager.Observer
    public void onConnectionChanged(C95094Pu c95094Pu) {
        String str;
        RealtimeConstants.CONNECTION_STATUS_EVENT_NAME.getClass();
        C19280xC A01 = C19280xC.A01(RealtimeConstants.CONNECTION_STATUS_EVENT_NAME, null);
        long currentTimeMillis = System.currentTimeMillis();
        Integer num = c95094Pu.A00;
        Integer num2 = C05F.A01;
        if (AbstractC167007dF.A1X(num, num2)) {
            str = RealtimeConstants.MQTT_CONNECTED;
        } else if (num != num2 && num != C05F.A00) {
            str = RealtimeConstants.MQTT_DISCONNECTED;
        } else {
            int i = this.mConnectingCount + 1;
            this.mConnectingCount = i;
            this.mLastConnectionStatusChangeTimestamp = currentTimeMillis;
            if (i != 1) {
                return;
            }
            A01.A0C("event_type", RealtimeConstants.MQTT_CONNECTING);
            AbstractC58318PtA.A1O(A01, "connecting_count", this.mConnectingCount);
            AbstractC31173DnH.A1S(A01, this.mUserSession);
            return;
        }
        A01.A0C("event_type", str);
        AbstractC58318PtA.A1O(A01, "connecting_count", this.mConnectingCount);
        A01.A0B("time_spend", Long.valueOf(currentTimeMillis - this.mLastConnectionStatusChangeTimestamp));
        AbstractC31173DnH.A1S(A01, this.mUserSession);
        this.mConnectingCount = 0;
        this.mLastConnectionStatusChangeTimestamp = currentTimeMillis;
    }

    @Override // com.instagram.realtimeclient.RealtimeClientManager.Observer
    public void onSendMessage(String str, String str2, String str3, boolean z, Long l) {
        String str4;
        if (z) {
            str4 = RealtimeConstants.SUBSCRIPTION_STATUS_EVENT_NAME;
        } else {
            str4 = RealtimeConstants.SEND_MESSAGE_EVENT_NAME;
        }
        C19280xC A01 = C19280xC.A01(str4, null);
        A01.A0C("send_message", str2);
        A01.A0C("event_type", str3);
        A01.A0C("mqtt_topic", str);
        if (l != null) {
            A01.A0B("send_time", l);
        }
        AbstractC31173DnH.A1S(A01, this.mUserSession);
    }

    @Override // com.instagram.realtimeclient.RealtimeClientManager.Observer
    public void onSendPayload(String str, byte[] bArr, String str2, Long l) {
        RealtimeConstants.SEND_PAYLOAD_EVENT_NAME.getClass();
        C19280xC A01 = C19280xC.A01(RealtimeConstants.SEND_PAYLOAD_EVENT_NAME, null);
        A01.A08(Integer.valueOf(bArr.length), "length");
        A01.A0C("event_type", str2);
        A01.A0C("mqtt_topic", str);
        if (l != null) {
            A01.A0B("send_time", l);
        }
        AbstractC31173DnH.A1S(A01, this.mUserSession);
    }

    public AnalyticsLoggingObserver(UserSession userSession, int i) {
        this.mUserSession = userSession;
        this.mReceiveMessageSampleRate = i;
    }
}
