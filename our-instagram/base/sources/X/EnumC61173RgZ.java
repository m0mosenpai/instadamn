package X;

/* renamed from: X.RgZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC61173RgZ {
    ACKNOWLEDGED_DELIVERY(0),
    PROCESSING_LASTACTIVE_PRESENCEINFO(1),
    EXACT_KEEPALIVE(2),
    REQUIRES_JSON_UNICODE_ESCAPES(3),
    DELTA_SENT_MESSAGE_ENABLED(4),
    USE_ENUM_TOPIC(5),
    SUPPRESS_GETDIFF_IN_CONNECT(6),
    USE_THRIFT_FOR_INBOX(7),
    USE_SEND_PINGRESP(8),
    REQUIRE_REPLAY_PROTECTION(9),
    DATA_SAVING_MODE(10),
    TYPING_OFF_WHEN_SENDING_MESSAGE(11),
    PERMISSION_USER_AUTH_CODE(12),
    FBNS_EXPLICIT_DELIVERY_ACK(13),
    IS_LARGE_PAYLOAD_SUPPORTED(14),
    /* JADX INFO: Fake field, exist only in values array */
    IS_MQTT_TOPIC_EXTENSION_SUPPORTED(15);

    public final byte A00;

    EnumC61173RgZ(int i) {
        this.A00 = (byte) i;
    }
}
