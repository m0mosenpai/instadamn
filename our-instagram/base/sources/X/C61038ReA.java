package X;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: X.ReA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61038ReA extends InputStream {
    public int A00;
    public int A01;
    public IOException A02;
    public Queue A03 = AbstractC58318PtA.A11();
    public boolean A04;

    @Override // java.io.InputStream
    public final synchronized int available() {
        return this.A00;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        C14360o3.A0B(bArr, 0);
        if (i2 == 0) {
            return 0;
        }
        synchronized (this) {
            i3 = -1;
            if (!this.A04 || this.A00 != 0) {
                while (!this.A04 && this.A03.isEmpty() && this.A02 == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                IOException iOException = this.A02;
                if (iOException == null) {
                    if (!this.A04 || this.A00 != 0) {
                        int min = (int) Math.min(i2, this.A00);
                        i3 = 0;
                        while (min > 0) {
                            Queue queue = this.A03;
                            byte[] bArr2 = (byte[]) queue.peek();
                            if (bArr2 != null) {
                                int length = bArr2.length;
                                int i4 = this.A01;
                                int min2 = (int) Math.min(min, length - i4);
                                System.arraycopy(bArr2, i4, bArr, i, min2);
                                i3 += min2;
                                int i5 = this.A01 + min2;
                                this.A01 = i5;
                                i += min2;
                                min -= min2;
                                this.A00 -= min2;
                                if (i5 == length) {
                                    queue.remove();
                                    this.A01 = 0;
                                }
                            } else {
                                throw AbstractC166987dD.A18("Response body stream is in an invalid state: available bytes > 0, but no buffers remain");
                            }
                        }
                    }
                } else {
                    throw iOException;
                }
            }
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == 1) {
            return bArr[0];
        }
        return -1;
    }
}
