package X;

/* renamed from: X.SYj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62941SYj {
    public final int A00;
    public final String A01;
    public final byte[] A02;
    public final SAG[] A03;

    public final String A00() {
        if (0 == this.A00) {
            return this.A01;
        }
        throw AbstractC166987dD.A14(AnonymousClass001.A0u("Wrong data accessor type detected. ", "ArrayBuffer", " expected, but got ", "String"));
    }

    public C62941SYj(byte[] bArr, SAG[] sagArr) {
        bArr.getClass();
        this.A02 = bArr;
        this.A01 = null;
        this.A03 = sagArr;
        this.A00 = 1;
    }

    public C62941SYj(String str, SAG[] sagArr) {
        this.A01 = str;
        this.A02 = null;
        this.A03 = sagArr;
        this.A00 = 0;
    }
}
