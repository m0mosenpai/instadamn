package X;

/* renamed from: X.TXo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C64863TXo extends RuntimeException {
    public final int A00;
    public final String A01;
    public final String A02;

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("Code: ");
        A0s.append(this.A00);
        A0s.append("Title: ");
        A0s.append(this.A02);
        A0s.append("Description: ");
        String A0x = AbstractC166997dE.A0x(this.A01, A0s);
        C14360o3.A07(A0x);
        return A0x;
    }

    public C64863TXo(int i, String str, String str2) {
        super(str2);
        this.A00 = i;
        this.A02 = str;
        this.A01 = str2;
    }
}
