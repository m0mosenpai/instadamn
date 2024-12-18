package X;

import java.io.InputStream;

/* renamed from: X.ReB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61039ReB extends InputStream {
    public final /* synthetic */ TWX A00;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C61039ReB(TWX twx) {
        this.A00 = twx;
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.A00.A00, 2147483647L);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.A00.A02(bArr, i, i2);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A00);
        return AbstractC166997dE.A0x(".inputStream()", A1C);
    }

    @Override // java.io.InputStream
    public final int read() {
        TWX twx = this.A00;
        if (twx.A00 > 0) {
            return twx.readByte() & 255;
        }
        return -1;
    }
}
