package X;

import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.5cB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120125cB implements RealtimeClientManager.Observer {
    public final C120115cA A00;
    public final C18220v9 A01;

    public C120125cB(C18220v9 c18220v9, C120115cA c120115cA) {
        C14360o3.A0B(c120115cA, 1);
        C14360o3.A0B(c18220v9, 2);
        this.A00 = c120115cA;
        this.A01 = c18220v9;
    }

    @Override // com.instagram.realtimeclient.RealtimeClientManager.Observer
    public final void onConnectionChanged(C95094Pu c95094Pu) {
    }

    @Override // com.instagram.realtimeclient.RealtimeClientManager.Observer
    public final void onMessage(C5EZ c5ez) {
    }

    @Override // com.instagram.realtimeclient.RealtimeClientManager.Observer
    public final void onSendPayload(String str, byte[] bArr, String str2, Long l) {
    }

    @Override // com.instagram.realtimeclient.RealtimeClientManager.Observer
    public final void onSendMessage(String str, String str2, String str3, boolean z, Long l) {
        if (C14360o3.A0K(str, RealtimeConstants.MQTT_TOPIC_SEND_MESSAGE)) {
            this.A01.ATO(new C45714KLr(this, str2));
        }
    }
}
