package X;

import com.facebook.common.dextricks.Constants;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: X.4b6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98274b6 implements InterfaceC98284b7 {
    public int A00;
    public int A01;
    public long A02;
    public final long A04;
    public final InterfaceC92354Bq A05;
    public byte[] A03 = new byte[Constants.LOAD_RESULT_PGO_ATTEMPTED];
    public final byte[] A06 = new byte[4096];

    public final boolean A02(int i, boolean z) {
        int i2 = this.A01 + i;
        byte[] bArr = this.A03;
        int length = bArr.length;
        if (i2 > length) {
            this.A03 = Arrays.copyOf(bArr, Math.max(Constants.LOAD_RESULT_PGO_ATTEMPTED + i2, Math.min(length * 2, i2 + Constants.LOAD_RESULT_WITH_VDEX_ODEX)));
        }
        int i3 = this.A00;
        int i4 = this.A01;
        int i5 = i3 - i4;
        while (i5 < i) {
            i5 = A00(this.A03, i4, i, i5, z);
            if (i5 == -1) {
                return false;
            }
            i4 = this.A01;
            this.A00 = i4 + i5;
        }
        this.A01 = i4 + i;
        return true;
    }

    @Override // X.InterfaceC98284b7
    public final void E3s(byte[] bArr, int i, int i2) {
        if (A02(i2, false)) {
            System.arraycopy(this.A03, this.A01 - i2, bArr, i, i2);
        }
    }

    @Override // X.InterfaceC98284b7
    public final boolean E88(byte[] bArr, int i, int i2, boolean z) {
        int min;
        int i3 = this.A00;
        if (i3 == 0) {
            min = 0;
        } else {
            min = Math.min(i3, i2);
            System.arraycopy(this.A03, 0, bArr, i, min);
            A01(min);
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

    @Override // X.InterfaceC98284b7
    public final void Em8(int i) {
        int min = Math.min(this.A00, i);
        A01(min);
        while (min < i) {
            if (min != -1) {
                min = A00(this.A06, -min, Math.min(i, 4096 + min), min, false);
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
    @Override // X.InterfaceC92364Br
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
            r12.A01(r1)
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
        throw new UnsupportedOperationException("Method not decompiled: X.C98274b6.read(byte[], int, int):int");
    }

    @Override // X.InterfaceC98284b7
    public final void readFully(byte[] bArr, int i, int i2) {
        E88(bArr, i, i2, false);
    }

    private void A01(int i) {
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

    public C98274b6(InterfaceC92354Bq interfaceC92354Bq, long j, long j2) {
        this.A05 = interfaceC92354Bq;
        this.A02 = j;
        this.A04 = j2;
    }

    private int A00(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = this.A05.read(bArr, i + i3, i2 - i3);
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
}
