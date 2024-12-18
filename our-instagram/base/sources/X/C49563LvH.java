package X;

import com.instagram.realtimeclient.RealtimeClientManager;

/* renamed from: X.LvH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49563LvH implements RealtimeClientManager.Observer {
    public final /* synthetic */ C46104Kb4 A00;

    @Override // com.instagram.realtimeclient.RealtimeClientManager.Observer
    public final void onMessage(C5EZ c5ez) {
    }

    @Override // com.instagram.realtimeclient.RealtimeClientManager.Observer
    public final void onSendMessage(String str, String str2, String str3, boolean z, Long l) {
    }

    @Override // com.instagram.realtimeclient.RealtimeClientManager.Observer
    public final void onSendPayload(String str, byte[] bArr, String str2, Long l) {
    }

    public C49563LvH(C46104Kb4 c46104Kb4) {
        this.A00 = c46104Kb4;
    }

    @Override // com.instagram.realtimeclient.RealtimeClientManager.Observer
    public final void onConnectionChanged(C95094Pu c95094Pu) {
        Integer num;
        String str;
        C46104Kb4 c46104Kb4 = this.A00;
        c46104Kb4.updateExtras(c46104Kb4.A04);
        if (c95094Pu != null) {
            Integer num2 = c95094Pu.A00;
            int intValue = num2.intValue();
            if (intValue != 1) {
                if (intValue != 0 && intValue != 2) {
                    return;
                }
                if (num2 == C05F.A00) {
                    num = C05F.A15;
                } else {
                    num = C05F.A0u;
                }
                if (6 - num.intValue() != 0) {
                    str = "mqtt_connecting";
                } else {
                    str = "mqtt_disconnected";
                }
                c46104Kb4.A0G(c46104Kb4.A0A, str, null);
                c46104Kb4.A09.A03(false);
                return;
            }
            c46104Kb4.A0G(c46104Kb4.A0A, "mqtt_connected", null);
            c46104Kb4.A09.A03(true);
            c46104Kb4.maybeEndFlowSuccess("mqtt_connection");
        }
    }
}
