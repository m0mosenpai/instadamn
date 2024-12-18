package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.RgY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC61172RgY {
    CONNECT(1),
    CONNACK(2),
    PUBLISH(3),
    PUBACK(4),
    PUBREC(5),
    PUBREL(6),
    PUBCOMP(7),
    SUBSCRIBE(8),
    SUBACK(9),
    UNSUBSCRIBE(10),
    UNSUBACK(11),
    PINGREQ(12),
    PINGRESP(13),
    /* JADX INFO: Fake field, exist only in values array */
    DISCONNECT(14);

    public static final Map A01 = Collections.unmodifiableMap(new C64907TZh(1));
    public final int A00;

    EnumC61172RgY(int i) {
        this.A00 = i;
    }
}
