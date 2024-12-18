package X;

/* loaded from: classes10.dex */
public final class SY7 {
    public static final SY7 A01 = new SY7("NIST_P256");
    public static final SY7 A02 = new SY7("NIST_P384");
    public static final SY7 A03 = new SY7("NIST_P521");
    public static final SY7 A04 = new SY7("X25519");
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    public SY7(String name) {
        this.A00 = name;
    }
}
