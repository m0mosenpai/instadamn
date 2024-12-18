package X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Rij, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC61223Rij implements InterfaceC65497TlL {
    MqttDurationMs(0),
    MqttTotalDurationMs(1),
    NetworkDurationMs(2),
    NetworkTotalDurationMs(3),
    ServiceDurationMs(4),
    MessageSendAttempt(5),
    MessageSendSuccess(6),
    ForegroundPing(7),
    BackgroundPing(8),
    PublishReceived(9),
    FbnsNotificationReceived(10),
    FbnsLiteNotificationReceived(11),
    FbnsNotificationDeliveryRetried(12),
    FbnsLiteNotificationDeliveryRetried(13);

    public final String A00;
    public final Class A01 = AtomicLong.class;

    EnumC61223Rij(int i) {
        this.A00 = r3;
    }

    @Override // X.InterfaceC65497TlL
    public final String BKd() {
        return this.A00;
    }

    @Override // X.InterfaceC65497TlL
    public final Class CEb() {
        return this.A01;
    }
}
