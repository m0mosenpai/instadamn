package X;

import com.facebook.common.dextricks.Constants;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: X.WRi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70328WRi implements XGj {
    public int A00;
    public int A01;
    public long A02;
    public byte[] A03 = new byte[Constants.LOAD_RESULT_PGO_ATTEMPTED];
    public final byte[] A04 = new byte[4096];
    public final long A05;
    public final InterfaceC71873X8g A06;

    public final boolean A03(int i, boolean z) {
        A01(i);
        int i2 = this.A00;
        int i3 = this.A01;
        int i4 = i2 - i3;
        while (i4 < i) {
            i4 = A00(this.A03, i3, i, i4, z);
            if (i4 == -1) {
                return false;
            }
            i3 = this.A01;
            this.A00 = i3 + i4;
        }
        this.A01 = i3 + i;
        return true;
    }

    @Override // X.XGj
    public final void AB0(int i) {
        A03(i, false);
    }

    @Override // X.XGj
    public final int E3p(byte[] bArr, int i, int i2) {
        int min;
        A01(i2);
        int i3 = this.A00;
        int i4 = this.A01;
        int i5 = i3 - i4;
        if (i5 == 0) {
            min = A00(this.A03, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            this.A00 += min;
        } else {
            min = Math.min(i2, i5);
        }
        System.arraycopy(this.A03, this.A01, bArr, i, min);
        this.A01 += min;
        return min;
    }

    @Override // X.XGj
    public final void E3s(byte[] bArr, int i, int i2) {
        E3t(bArr, i, i2, false);
    }

    @Override // X.XGj
    public final boolean E88(byte[] bArr, int i, int i2, boolean z) {
        int min;
        int i3 = this.A00;
        if (i3 == 0) {
            min = 0;
        } else {
            min = Math.min(i3, i2);
            System.arraycopy(this.A03, 0, bArr, i, min);
            A02(min);
        }
        while (min < i2) {
            if (min != -1) {
                min = A00(bArr, i, i2, min, z);
            } else {
                return false;
            }
        }
        if (min != -1) {
            this.A02 += min;
            return true;
        }
        return false;
    }

    @Override // X.XGj
    public final void EJn() {
        this.A01 = 0;
    }

    @Override // X.XGj
    public final int Em5(int i) {
        int min = Math.min(this.A00, 1);
        A02(min);
        if (min == 0) {
            min = A00(this.A04, 0, Math.min(1, 4096), 0, true);
        }
        if (min != -1) {
            this.A02 += min;
        }
        return min;
    }

    @Override // X.XGj
    public final void Em8(int i) {
        int min = Math.min(this.A00, i);
        A02(min);
        while (min < i) {
            if (min != -1) {
                min = A00(this.A04, -min, Math.min(i, 4096 + min), min, false);
            } else {
                return;
            }
        }
        if (min != -1) {
            this.A02 += min;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r1 == 0) goto L6;
     */
    @Override // X.XGj, X.InterfaceC71873X8g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r13, int r14, int r15) {
        /*
            r12 = this;
            r6 = r12
            int r0 = r12.A00
            r10 = 0
            r7 = r13
            r8 = r14
            r9 = r15
            if (r0 == 0) goto L17
            int r1 = java.lang.Math.min(r0, r15)
            byte[] r0 = r12.A03
            java.lang.System.arraycopy(r0, r10, r13, r14, r1)
            r12.A02(r1)
            if (r1 != 0) goto L1c
        L17:
            r11 = 1
            int r1 = r6.A00(r7, r8, r9, r10, r11)
        L1c:
            r0 = -1
            if (r1 == r0) goto L25
            long r4 = r12.A02
            long r2 = (long) r1
            long r4 = r4 + r2
            r12.A02 = r4
        L25:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70328WRi.read(byte[], int, int):int");
    }

    @Override // X.XGj
    public final void readFully(byte[] bArr, int i, int i2) {
        E88(bArr, i, i2, false);
    }

    static {
        C63102Sd5.A00("media3.extractor");
    }

    private void A01(int i) {
        int i2 = this.A01 + i;
        byte[] bArr = this.A03;
        int length = bArr.length;
        if (i2 > length) {
            this.A03 = Arrays.copyOf(bArr, Math.max(Constants.LOAD_RESULT_PGO_ATTEMPTED + i2, Math.min(length * 2, i2 + Constants.LOAD_RESULT_WITH_VDEX_ODEX)));
        }
    }

    private void A02(int i) {
        byte[] bArr;
        int i2 = this.A00 - i;
        this.A00 = i2;
        this.A01 = 0;
        byte[] bArr2 = this.A03;
        if (i2 < bArr2.length - Constants.LOAD_RESULT_WITH_VDEX_ODEX) {
            bArr = new byte[Constants.LOAD_RESULT_PGO_ATTEMPTED + i2];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i, bArr, 0, i2);
        this.A03 = bArr;
    }

    @Override // X.XGj
    public final long Bc8() {
        return this.A02 + this.A01;
    }

    @Override // X.XGj
    public final long BeZ() {
        return this.A02;
    }

    @Override // X.XGj
    public final long getLength() {
        return this.A05;
    }

    public C70328WRi(InterfaceC71873X8g interfaceC71873X8g, long j, long j2) {
        this.A06 = interfaceC71873X8g;
        this.A02 = j;
        this.A05 = j2;
    }

    private int A00(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = this.A06.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i3 + read;
        }
        throw new InterruptedIOException();
    }

    @Override // X.XGj
    public final boolean E3t(byte[] bArr, int i, int i2, boolean z) {
        if (!A03(i2, z)) {
            return false;
        }
        System.arraycopy(this.A03, this.A01 - i2, bArr, i, i2);
        return true;
    }
}
