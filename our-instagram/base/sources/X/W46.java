package X;

/* loaded from: classes11.dex */
public abstract class W46 {
    public final int A00;

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

    public W46(int i) {
        this.A00 = i;
    }
}
