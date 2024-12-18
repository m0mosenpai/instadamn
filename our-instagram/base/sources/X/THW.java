package X;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;

/* loaded from: classes10.dex */
public final class THW implements Closeable {
    public SEV A00;
    public final InputStream A02;
    public final byte[] A03 = new byte[8];
    public final C62926SXi A01 = new C62926SXi();

    private final void A03(byte[] bArr, int i) {
        int i2 = 0;
        while (i2 != i) {
            int read = this.A02.read(bArr, i2, i - i2);
            if (read != -1) {
                i2 += read;
            } else {
                throw new EOFException();
            }
        }
        this.A00 = null;
    }

    public static final long A00(THW thw) {
        long j;
        long j2;
        SEV sev = thw.A00;
        byte b = sev.A01;
        if (b < 24) {
            long j3 = b;
            thw.A00 = null;
            return j3;
        }
        if (b == 24) {
            int read = thw.A02.read();
            if (read != -1) {
                thw.A00 = null;
                return read & 255;
            }
            throw new EOFException();
        }
        if (b == 25) {
            thw.A03(thw.A03, 2);
            return ((r1[0] & 255) << 8) | (255 & r1[1]);
        }
        if (b == 26) {
            byte[] bArr = thw.A03;
            thw.A03(bArr, 4);
            long j4 = bArr[0];
            j = ((bArr[1] & 255) << 16) | ((j4 & 255) << 24) | ((bArr[2] & 255) << 8);
            j2 = bArr[3] & 255;
        } else if (b == 27) {
            byte[] bArr2 = thw.A03;
            thw.A03(bArr2, 8);
            long j5 = bArr2[0];
            long j6 = bArr2[1];
            long j7 = bArr2[2];
            long j8 = bArr2[3];
            long j9 = bArr2[4];
            long j10 = (bArr2[5] & 255) << 16;
            j = j10 | ((j7 & 255) << 40) | ((j5 & 255) << 56) | ((j6 & 255) << 48) | ((j8 & 255) << 32) | ((j9 & 255) << 24) | ((bArr2[6] & 255) << 8);
            j2 = bArr2[7] & 255;
        } else {
            throw MSW.A0y(String.format("invalid additional information %s for major type %s", AbstractC25228BEl.A1Z(Byte.valueOf(b), (sev.A00 >> 5) & 7)));
        }
        return j2 | j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0106, code lost:
    
        if (r8 == (-5)) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.SEV A05() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.THW.A05():X.SEV");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A02.close();
        this.A01.A01();
    }

    public THW(InputStream inputStream) {
        this.A02 = inputStream;
    }

    public static final void A01(THW thw) {
        thw.A05();
        byte b = thw.A00.A01;
        if (b != 31) {
        } else {
            throw AbstractC58319PtB.A0l("expected definite length but found %s", new Object[]{Byte.valueOf(b)});
        }
    }

    public static final void A02(THW thw, byte b) {
        thw.A05();
        byte b2 = thw.A00.A00;
        if (b2 == b) {
        } else {
            throw AbstractC58319PtB.A0l("expected major type %s but found %s", AbstractC25228BEl.A1Z(Integer.valueOf((b >> 5) & 7), (b2 >> 5) & 7));
        }
    }

    public static final byte[] A04(THW thw) {
        A01(thw);
        long A00 = A00(thw);
        if (A00 >= 0 && A00 <= 2147483647L) {
            if (thw.A02.available() >= A00) {
                int i = (int) A00;
                byte[] bArr = new byte[i];
                thw.A03(bArr, i);
                return bArr;
            }
            throw new EOFException();
        }
        throw AbstractC166987dD.A1D(String.format("the maximum supported byte/text string length is %s bytes", AbstractC25228BEl.A1Y(Integer.MAX_VALUE)));
    }
}
