package X;

import java.util.HashMap;

/* renamed from: X.RgC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC61151RgC {
    BASE(0),
    PSK(1),
    AUTH(2),
    /* JADX INFO: Fake field, exist only in values array */
    AUTH_PSK(3);

    public static final HashMap A01 = AbstractC166987dD.A1G();
    public final byte A00;

    static {
        for (EnumC61151RgC enumC61151RgC : values()) {
            A01.put(Byte.valueOf(enumC61151RgC.A00), enumC61151RgC);
        }
    }

    EnumC61151RgC(int i) {
        this.A00 = r2;
    }
}
