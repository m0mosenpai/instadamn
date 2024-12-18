package X;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* renamed from: X.Vul, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69751Vul {
    public static final ByteBuffer A02 = AbstractC65702TsY.A0j(0);
    public C70192WFv A00;
    public ByteBuffer A01;

    public final ByteBuffer A00() {
        C70192WFv c70192WFv = this.A00;
        int i = c70192WFv.A06 * c70192WFv.A0G * 2;
        if (i > 0) {
            if (this.A01.capacity() < i) {
                this.A01 = AbstractC65702TsY.A0j(i);
            } else {
                this.A01.clear();
            }
            c70192WFv.A05(this.A01.asShortBuffer());
            this.A01.limit(i);
            return this.A01;
        }
        return A02;
    }

    public final void A01() {
        C70192WFv c70192WFv = this.A00;
        int i = c70192WFv.A01;
        float f = c70192WFv.A0F;
        float f2 = c70192WFv.A00;
        int i2 = c70192WFv.A06 + ((int) ((((i / (f / f2)) + c70192WFv.A07) / (c70192WFv.A0E * f2)) + 0.5f));
        short[] sArr = c70192WFv.A0B;
        int i3 = c70192WFv.A0J * 2;
        short[] A04 = C70192WFv.A04(c70192WFv, sArr, i, i3 + i);
        c70192WFv.A0B = A04;
        int i4 = 0;
        while (true) {
            int i5 = c70192WFv.A0G;
            if (i4 >= i3 * i5) {
                break;
            }
            A04[(i5 * i) + i4] = 0;
            i4++;
        }
        c70192WFv.A01 += i3;
        C70192WFv.A01(c70192WFv);
        if (c70192WFv.A06 > i2) {
            c70192WFv.A06 = i2;
        }
        c70192WFv.A01 = 0;
        c70192WFv.A0A = 0;
        c70192WFv.A07 = 0;
    }

    public final void A02(ByteBuffer byteBuffer) {
        C70192WFv c70192WFv = this.A00;
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = asShortBuffer.remaining();
        int i = c70192WFv.A0G;
        int i2 = remaining / i;
        short[] A04 = C70192WFv.A04(c70192WFv, c70192WFv.A0B, c70192WFv.A01, i2);
        c70192WFv.A0B = A04;
        asShortBuffer.get(A04, c70192WFv.A01 * i, ((i * i2) * 2) / 2);
        c70192WFv.A01 += i2;
        C70192WFv.A01(c70192WFv);
    }
}
