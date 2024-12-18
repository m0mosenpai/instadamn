package X;

import com.google.protobuf.UnsafeUtil;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class RWL extends AbstractC63036SbB {
    public int A00 = Integer.MAX_VALUE;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public int A05;
    public final long A06;
    public final ByteBuffer A07;

    public static void A00(RWL rwl) {
        long j = rwl.A02 + rwl.A05;
        rwl.A02 = j;
        int i = (int) (j - rwl.A04);
        int i2 = rwl.A00;
        if (i > i2) {
            int i3 = i - i2;
            rwl.A05 = i3;
            rwl.A02 = j - i3;
            return;
        }
        rwl.A05 = 0;
    }

    public final int A0V() {
        long j = this.A03;
        if (this.A02 - j >= 4) {
            this.A03 = 4 + j;
            AbstractC63034Sb9 abstractC63034Sb9 = UnsafeUtil.A02;
            return ((abstractC63034Sb9.A01(j + 3) & 255) << 24) | (abstractC63034Sb9.A01(j) & 255) | ((abstractC63034Sb9.A01(1 + j) & 255) << 8) | ((abstractC63034Sb9.A01(2 + j) & 255) << 16);
        }
        throw C4L5.A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
    
        if (r6.A01(r3) < 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A0W() {
        /*
            r11 = this;
            long r0 = r11.A03
            long r3 = r11.A02
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L4e
            r9 = 1
            long r3 = r0 + r9
            X.Sb9 r6 = com.google.protobuf.UnsafeUtil.A02
            byte r5 = r6.A01(r0)
            if (r5 < 0) goto L73
            r11.A03 = r3
            return r5
        L17:
            long r3 = r1 + r9
            byte r1 = r6.A01(r1)
            int r0 = r1 << 28
            r5 = r5 ^ r0
            r0 = 266354560(0xfe03f80, float:2.2112565E-29)
            r5 = r5 ^ r0
            if (r1 >= 0) goto L61
            long r1 = r3 + r9
            byte r0 = r6.A01(r3)
            if (r0 >= 0) goto L89
            long r3 = r1 + r9
            byte r0 = r6.A01(r1)
            if (r0 >= 0) goto L61
            long r1 = r3 + r9
            byte r0 = r6.A01(r3)
            if (r0 >= 0) goto L89
            long r3 = r1 + r9
            byte r0 = r6.A01(r1)
            if (r0 >= 0) goto L61
            long r1 = r3 + r9
            byte r0 = r6.A01(r3)
            if (r0 >= 0) goto L89
        L4e:
            long r0 = r11.A0Z()
            int r5 = (int) r0
            return r5
        L54:
            long r3 = r1 + r9
            byte r0 = r6.A01(r1)
            int r0 = r0 << 14
            r5 = r5 ^ r0
            if (r5 < 0) goto L63
            r5 = r5 ^ 16256(0x3f80, float:2.278E-41)
        L61:
            r1 = r3
            goto L89
        L63:
            long r1 = r3 + r9
            byte r0 = r6.A01(r3)
            int r0 = r0 << 21
            r5 = r5 ^ r0
            if (r5 >= 0) goto L17
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r5 = r5 ^ r0
            goto L89
        L73:
            long r1 = r11.A02
            long r1 = r1 - r3
            r7 = 9
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L4e
            long r1 = r3 + r9
            byte r0 = r6.A01(r3)
            int r0 = r0 << 7
            r5 = r5 ^ r0
            if (r5 >= 0) goto L54
            r5 = r5 ^ (-128(0xffffffffffffff80, float:NaN))
        L89:
            r11.A03 = r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RWL.A0W():int");
    }

    public final long A0X() {
        long j = this.A03;
        if (this.A02 - j >= 8) {
            this.A03 = 8 + j;
            AbstractC63034Sb9 abstractC63034Sb9 = UnsafeUtil.A02;
            return ((abstractC63034Sb9.A01(j + 7) & 255) << 56) | (abstractC63034Sb9.A01(j) & 255) | ((abstractC63034Sb9.A01(1 + j) & 255) << 8) | ((abstractC63034Sb9.A01(2 + j) & 255) << 16) | ((abstractC63034Sb9.A01(3 + j) & 255) << 24) | ((abstractC63034Sb9.A01(4 + j) & 255) << 32) | ((abstractC63034Sb9.A01(5 + j) & 255) << 40) | ((abstractC63034Sb9.A01(6 + j) & 255) << 48);
        }
        throw C4L5.A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0036, code lost:
    
        if (r7.A01(r1) < 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A0Y() {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RWL.A0Y():long");
    }

    public final long A0Z() {
        long j = 0;
        int i = 0;
        do {
            long j2 = this.A03;
            if (j2 != this.A02) {
                this.A03 = 1 + j2;
                j |= (r2 & Byte.MAX_VALUE) << i;
                if ((UnsafeUtil.A02.A01(j2) & 128) == 0) {
                    return j;
                }
                i += 7;
            } else {
                throw C4L5.A02();
            }
        } while (i < 64);
        throw AbstractC58320PtC.A0e("CodedInputStream encountered a malformed varint.");
    }

    public RWL(ByteBuffer byteBuffer) {
        this.A07 = byteBuffer;
        long A07 = UnsafeUtil.A02.A07(byteBuffer, UnsafeUtil.A00);
        this.A06 = A07;
        this.A02 = byteBuffer.limit() + A07;
        long position = A07 + byteBuffer.position();
        this.A03 = position;
        this.A04 = position;
    }
}
