package X;

/* loaded from: classes10.dex */
public final class RVC extends AbstractC58533Px1 implements InterfaceC65280ThD {
    public static final int CURVE_TYPE_FIELD_NUMBER = 1;
    public static final RVC DEFAULT_INSTANCE;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 2;
    public static final int HKDF_SALT_FIELD_NUMBER = 11;
    public static volatile InterfaceC65281ThE PARSER;
    public int curveType_;
    public int hkdfHashType_;
    public AbstractC58536Px4 hkdfSalt_ = AbstractC58536Px4.A01;

    static {
        RVC rvc = new RVC();
        DEFAULT_INSTANCE = rvc;
        AbstractC58533Px1.A0A(rvc, RVC.class);
    }

    public final Rj0 A0G() {
        int i = this.curveType_;
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return Rj0.UNRECOGNIZED;
                        }
                        return Rj0.CURVE25519;
                    }
                    return Rj0.NIST_P521;
                }
                return Rj0.NIST_P384;
            }
            return Rj0.NIST_P256;
        }
        return Rj0.UNKNOWN_CURVE;
    }
}
