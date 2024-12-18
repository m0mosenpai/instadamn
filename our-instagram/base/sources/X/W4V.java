package X;

import java.math.BigInteger;
import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public final class W4V {
    public static final int A05 = new BigInteger("2").pow(15).intValue();
    public static final int A06 = new BigInteger("2").pow(16).intValue();
    public ByteBuffer A00;
    public ByteBuffer A01;
    public ByteBuffer A02;
    public final int A03;
    public final int A04;

    public W4V(int i, int i2) {
        ByteBuffer A0j = AbstractC65702TsY.A0j(0);
        this.A00 = A0j;
        this.A01 = A0j;
        this.A02 = A0j;
        this.A03 = i;
        this.A04 = i2;
    }

    public final void A00(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = this.A03;
        int i3 = i2 * 2;
        int i4 = this.A04;
        int i5 = ((limit - position) / i3) * i4 * 2;
        if (this.A01.capacity() < i5) {
            this.A01 = AbstractC65702TsY.A0j(i5);
        } else {
            this.A01.clear();
        }
        this.A02 = this.A01;
        while (position < limit) {
            short s = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                short s2 = byteBuffer.getShort((i6 * 2) + position);
                int i7 = A05;
                int i8 = s + i7;
                int i9 = s2 + i7;
                if (i8 < i7 && i9 < i7) {
                    i = (i8 * i9) / i7;
                } else {
                    i = (((i8 + i9) * 2) - ((i8 * i9) / i7)) - A06;
                }
                int i10 = A06;
                if (i == i10) {
                    i = i10 - 1;
                }
                s = (short) (i - i7);
            }
            for (int i11 = 0; i11 < i4; i11++) {
                this.A02.putShort(s);
            }
            position += i3;
        }
        byteBuffer.position(limit);
        this.A02.flip();
    }
}
