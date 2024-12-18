package X;

/* renamed from: X.1T7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1T7 {
    public int A00;
    public final int A01;
    public final byte[] A02;

    public C1T7(byte[] bArr, int i) {
        C14360o3.A0B(bArr, 1);
        this.A02 = bArr;
        this.A01 = i;
    }

    public final byte A00() {
        int i = this.A00;
        if (i < this.A01) {
            byte[] bArr = this.A02;
            this.A00 = i + 1;
            return bArr[i];
        }
        throw new IllegalStateException("Check failed.");
    }
}
