package X;

/* renamed from: X.4b9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC98304b9 {
    public final int A00;

    static {
        int length = "xml ".length();
        boolean z = false;
        if (length <= 4) {
            z = true;
        }
        C4B8.A03(z);
        for (int i = 0; i < length; i++) {
            "xml ".charAt(i);
        }
    }

    public static String A00(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public String toString() {
        return A00(this.A00);
    }

    public AbstractC98304b9(int i) {
        this.A00 = i;
    }
}
