package X;

/* loaded from: classes8.dex */
public final class L7O {
    public final String A00;
    public final String A01;
    public final String A02;

    public L7O(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    public final String A00(String str) {
        StringBuilder A11 = AbstractC166997dE.A11(str);
        A11.append(':');
        A11.append(this.A01);
        A11.append(',');
        A11.append(this.A02);
        A11.append(',');
        return AbstractC166997dE.A0x(this.A00, A11);
    }
}
