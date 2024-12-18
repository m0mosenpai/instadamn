package X;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: X.RdV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61002RdV extends FilterInputStream {
    public int A00;
    public final long A01;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.A01 - this.A00, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    private void A00(int i) {
        if (i >= 0) {
            this.A00 += i;
            return;
        }
        long j = this.A01;
        int i2 = this.A00;
        if (j - i2 <= 0) {
            return;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Failed to read all expected data, expected: ");
        A1C.append(j);
        throw MSW.A0y(AbstractC58320PtC.A12(", but read: ", A1C, i2));
    }

    public C61002RdV(InputStream inputStream, long j) {
        super(inputStream);
        this.A01 = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int read;
        read = super.read(bArr, i, i2);
        A00(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int read;
        read = super.read();
        int i = -1;
        if (read >= 0) {
            i = 1;
        }
        A00(i);
        return read;
    }
}
