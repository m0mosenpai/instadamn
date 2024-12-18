package X;

import java.util.HashMap;

/* renamed from: X.Rgf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC61179Rgf {
    DHKEM_P256_SHA256(16, 32),
    DHKEM_P384_SHA384(17, 48),
    DHKEM_P512_SHA512(18, 64),
    DHKEM_X25519_SHA256(32, 32),
    /* JADX INFO: Fake field, exist only in values array */
    DHKEM_X488_SHA512(33, 64);

    public static final HashMap A02 = AbstractC166987dD.A1G();
    public final int A00;
    public final int A01;

    static {
        for (EnumC61179Rgf enumC61179Rgf : values()) {
            AbstractC58319PtB.A1H(enumC61179Rgf, A02, enumC61179Rgf.A01);
        }
    }

    EnumC61179Rgf(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
