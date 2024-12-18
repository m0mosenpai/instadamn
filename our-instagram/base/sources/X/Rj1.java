package X;

/* loaded from: classes10.dex */
public enum Rj1 implements InterfaceC65279ThC {
    KEM_UNKNOWN(0),
    DHKEM_X25519_HKDF_SHA256(1),
    DHKEM_P256_HKDF_SHA256(2),
    DHKEM_P384_HKDF_SHA384(3),
    DHKEM_P521_HKDF_SHA512(4),
    UNRECOGNIZED(-1);

    public final int A00;

    Rj1(int value) {
        this.A00 = value;
    }
}
