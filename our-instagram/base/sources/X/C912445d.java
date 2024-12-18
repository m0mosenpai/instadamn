package X;

/* renamed from: X.45d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C912445d extends C912245b {
    public static final C912445d A03;
    public static final String A04;
    public final int A00;
    public final String A01;
    public final char[] A02;

    static {
        String str;
        try {
            str = System.getProperty("line.separator");
        } catch (Throwable unused) {
            str = "\n";
        }
        A04 = str;
        A03 = new C912445d(str);
    }

    public C912445d(String str) {
        int length = "  ".length();
        this.A00 = length;
        this.A02 = new char[length * 16];
        int i = 0;
        int i2 = 0;
        do {
            "  ".getChars(0, length, this.A02, i2);
            i2 += length;
            i++;
        } while (i < 16);
        this.A01 = str;
    }

    public C912445d() {
        this(A04);
    }
}
