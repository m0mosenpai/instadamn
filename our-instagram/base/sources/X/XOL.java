package X;

import android.media.MediaDataSource;
import android.util.SparseArray;
import java.io.IOException;

/* loaded from: classes12.dex */
public final class XOL extends MediaDataSource {
    public XON A01;
    public final String A03;
    public final C58633Pz1 A02 = new C58633Pz1();
    public int A00 = -1;

    private final void A00() {
        if (this.A01 == null) {
            XON xon = new XON(new XOO(this));
            this.A01 = xon;
            SparseArray sparseArray = xon.A00;
            XOP xop = (XOP) sparseArray.get(0);
            if (xop == null) {
                xop = new XOP();
                sparseArray.put(0, xop);
            }
            int A00 = this.A02.A00(this.A03, 0, xop.A00);
            this.A00 = A00;
            if (A00 <= 0) {
                throw new IOException("could not resolve content length");
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        XON xon = this.A01;
        if (xon != null) {
            xon.A00.clear();
        }
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        if (this.A00 < 0) {
            A00();
        }
        return this.A00;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = i2;
        C14360o3.A0B(bArr, 1);
        A00();
        XON xon = this.A01;
        if (xon != null) {
            long j2 = i5 + j;
            int i6 = this.A00;
            if (j2 > i6) {
                i5 = i6 - ((int) j);
            }
            int i7 = (int) j;
            if (i + i5 <= bArr.length) {
                int i8 = i7 / 162760;
                int i9 = (i5 + i7) - 1;
                int i10 = i9 / 162760;
                if (i8 > i10) {
                    return 0;
                }
                int i11 = i8;
                int i12 = 0;
                while (true) {
                    SparseArray sparseArray = xon.A00;
                    XOP xop = (XOP) sparseArray.get(i11);
                    if (xop == null) {
                        xop = new XOP();
                        XOO xoo = xon.A01;
                        byte[] bArr2 = xop.A00;
                        C14360o3.A0B(bArr2, 0);
                        XOL xol = xoo.A00;
                        xol.A02.A00(xol.A03, i11 * 162760, bArr2);
                        sparseArray.put(i11, xop);
                    }
                    boolean z = false;
                    if (i11 == i8) {
                        z = true;
                    }
                    boolean z2 = false;
                    if (i11 == i10) {
                        z2 = true;
                    }
                    if (z) {
                        i3 = i7 % 162760;
                    } else {
                        i3 = 0;
                    }
                    if (z2) {
                        i4 = i9 % 162760;
                    } else {
                        i4 = 162759;
                    }
                    int i13 = (i4 - i3) + 1;
                    System.arraycopy(xop.A00, i3, bArr, i + i12, i13);
                    i12 += i13;
                    if (i11 != i10) {
                        i11++;
                    } else {
                        return i12;
                    }
                }
            } else {
                throw new IllegalStateException("requested destination is out of range");
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public XOL(String str) {
        this.A03 = str;
    }
}
