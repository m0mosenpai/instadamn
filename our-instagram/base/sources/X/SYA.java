package X;

/* loaded from: classes10.dex */
public final class SYA {
    public static final SYA A01 = new SYA("SHA1");
    public static final SYA A02 = new SYA("SHA224");
    public static final SYA A03 = new SYA("SHA256");
    public static final SYA A04 = new SYA("SHA384");
    public static final SYA A05 = new SYA("SHA512");
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    public SYA(String name) {
        this.A00 = name;
    }
}
