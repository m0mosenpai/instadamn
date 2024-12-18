package X;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: X.Pye, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58611Pye extends FilterInputStream {
    public long A00;
    public final long A01;
    public final InterfaceC65613To4 A02;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C14360o3.A0B(bArr, 0);
        int read = super.read(bArr, i, i2);
        if (read >= 0) {
            long j = read + this.A00;
            this.A00 = j;
            this.A02.onBytesTransferred(j, this.A01);
        }
        return read;
    }

    public C58611Pye(InterfaceC65613To4 interfaceC65613To4, InputStream inputStream, long j) {
        super(inputStream);
        this.A01 = j;
        this.A02 = interfaceC65613To4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read != -1) {
            long j = this.A00 + 1;
            this.A00 = j;
            this.A02.onBytesTransferred(j, this.A01);
        }
        return read;
    }
}
