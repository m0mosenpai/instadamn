package X;

import com.facebook.common.dextricks.Constants;
import java.io.OutputStream;

/* renamed from: X.ReN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61051ReN extends OutputStream {
    public int A00;
    public C63361SiK A01;
    public byte[] A02;
    public final OutputStream A03;

    public C61051ReN(C63361SiK c63361SiK, OutputStream outputStream) {
        this.A03 = outputStream;
        this.A01 = c63361SiK;
        this.A02 = (byte[]) c63361SiK.A04(Constants.LOAD_RESULT_PGO_ATTEMPTED, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int i = this.A00;
        if (i > 0) {
            this.A03.write(this.A02, 0, i);
            this.A00 = 0;
        }
        this.A03.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte[] bArr = this.A02;
        int i2 = this.A00;
        int i3 = i2 + 1;
        this.A00 = i3;
        bArr[i2] = (byte) i;
        if (i3 == bArr.length && i3 > 0) {
            this.A03.write(bArr, 0, i3);
            this.A00 = 0;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            flush();
            this.A03.close();
            byte[] bArr = this.A02;
            if (bArr != null) {
                this.A01.A05(bArr);
                this.A02 = null;
            }
        } catch (Throwable th) {
            this.A03.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.A00;
            if (i6 == 0 && i4 >= this.A02.length) {
                this.A03.write(bArr, i5, i4);
                return;
            }
            byte[] bArr2 = this.A02;
            int min = Math.min(i4, bArr2.length - i6);
            System.arraycopy(bArr, i5, bArr2, i6, min);
            int i7 = this.A00 + min;
            this.A00 = i7;
            i3 += min;
            byte[] bArr3 = this.A02;
            if (i7 == bArr3.length && i7 > 0) {
                this.A03.write(bArr3, 0, i7);
                this.A00 = 0;
            }
        } while (i3 < i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
