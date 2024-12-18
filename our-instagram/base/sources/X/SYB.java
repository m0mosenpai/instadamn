package X;

/* loaded from: classes10.dex */
public final class SYB {
    public static final SYB A01 = new SYB("SHA1");
    public static final SYB A02 = new SYB("SHA224");
    public static final SYB A03 = new SYB("SHA256");
    public static final SYB A04 = new SYB("SHA384");
    public static final SYB A05 = new SYB("SHA512");
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    public SYB(String name) {
        this.A00 = name;
    }
}
