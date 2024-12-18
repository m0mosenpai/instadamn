package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: X.4UK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4UK implements C4UE {
    public long A02;
    public long A03;
    public C4UJ A04;
    public C4UJ A05;
    public C70186WFp A06;
    public boolean A07;
    public C4UJ A08;
    public C4UJ A09;
    public ByteBuffer A0A;
    public ByteBuffer A0B;
    public ShortBuffer A0C;
    public boolean A0D;
    public float A01 = 1.0f;
    public float A00 = 1.0f;

    @Override // X.C4UE
    public final C4UJ AJ5(C4UJ c4uj) {
        if (c4uj.A02 == 2) {
            int i = c4uj.A03;
            this.A08 = c4uj;
            C4UJ c4uj2 = new C4UJ(i, c4uj.A01, 2);
            this.A09 = c4uj2;
            this.A07 = true;
            return c4uj2;
        }
        throw new C4Y9(c4uj);
    }

    @Override // X.C4UE
    public final ByteBuffer BaE() {
        int i;
        C70186WFp c70186WFp = this.A06;
        if (c70186WFp != null && (i = c70186WFp.A05 * c70186WFp.A0G * 2) > 0) {
            if (this.A0A.capacity() < i) {
                ByteBuffer order = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                this.A0A = order;
                this.A0C = order.asShortBuffer();
            } else {
                this.A0A.clear();
                this.A0C.clear();
            }
            ShortBuffer shortBuffer = this.A0C;
            int remaining = shortBuffer.remaining();
            int i2 = c70186WFp.A0G;
            int min = Math.min(remaining / i2, c70186WFp.A05);
            shortBuffer.put(c70186WFp.A0B, 0, i2 * min);
            int i3 = c70186WFp.A05 - min;
            c70186WFp.A05 = i3;
            short[] sArr = c70186WFp.A0B;
            System.arraycopy(sArr, min * i2, sArr, 0, i3 * i2);
            this.A03 += i;
            this.A0A.limit(i);
            this.A0B = this.A0A;
        }
        ByteBuffer byteBuffer = this.A0B;
        this.A0B = C4UE.A00;
        return byteBuffer;
    }

    @Override // X.C4UE
    public final boolean CTt() {
        if (this.A0D) {
            C70186WFp c70186WFp = this.A06;
            if (c70186WFp == null || c70186WFp.A05 * c70186WFp.A0G * 2 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C4UE
    public final void E7Y() {
        C70186WFp c70186WFp = this.A06;
        if (c70186WFp != null) {
            int i = c70186WFp.A00;
            float f = c70186WFp.A0F;
            float f2 = c70186WFp.A0D;
            int i2 = c70186WFp.A05 + ((int) ((((i / (f / f2)) + c70186WFp.A06) / (c70186WFp.A0E * f2)) + 0.5f));
            short[] sArr = c70186WFp.A0A;
            int i3 = c70186WFp.A0J * 2;
            short[] A04 = C70186WFp.A04(c70186WFp, sArr, i, i3 + i);
            c70186WFp.A0A = A04;
            int i4 = 0;
            while (true) {
                int i5 = c70186WFp.A0G;
                if (i4 >= i3 * i5) {
                    break;
                }
                A04[(i5 * i) + i4] = 0;
                i4++;
            }
            c70186WFp.A00 += i3;
            C70186WFp.A01(c70186WFp);
            if (c70186WFp.A05 > i2) {
                c70186WFp.A05 = i2;
            }
            c70186WFp.A00 = 0;
            c70186WFp.A09 = 0;
            c70186WFp.A06 = 0;
        }
        this.A0D = true;
    }

    @Override // X.C4UE
    public final boolean isActive() {
        int i = this.A09.A03;
        if (i != -1) {
            if (Math.abs(this.A01 - 1.0f) >= 1.0E-4f || Math.abs(this.A00 - 1.0f) >= 1.0E-4f || i != this.A08.A03) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C4UE
    public final void reset() {
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        C4UJ c4uj = C4UJ.A04;
        this.A08 = c4uj;
        this.A09 = c4uj;
        this.A04 = c4uj;
        this.A05 = c4uj;
        ByteBuffer byteBuffer = C4UE.A00;
        this.A0A = byteBuffer;
        this.A0C = byteBuffer.asShortBuffer();
        this.A0B = byteBuffer;
        this.A07 = false;
        this.A06 = null;
        this.A02 = 0L;
        this.A03 = 0L;
        this.A0D = false;
    }

    public C4UK() {
        C4UJ c4uj = C4UJ.A04;
        this.A08 = c4uj;
        this.A09 = c4uj;
        this.A04 = c4uj;
        this.A05 = c4uj;
        ByteBuffer byteBuffer = C4UE.A00;
        this.A0A = byteBuffer;
        this.A0C = byteBuffer.asShortBuffer();
        this.A0B = byteBuffer;
    }

    @Override // X.C4UE
    public final void E7Z(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C70186WFp c70186WFp = this.A06;
            c70186WFp.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.A02 += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i = c70186WFp.A0G;
            int i2 = remaining2 / i;
            short[] A04 = C70186WFp.A04(c70186WFp, c70186WFp.A0A, c70186WFp.A00, i2);
            c70186WFp.A0A = A04;
            asShortBuffer.get(A04, c70186WFp.A00 * i, ((i * i2) * 2) / 2);
            c70186WFp.A00 += i2;
            C70186WFp.A01(c70186WFp);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // X.C4UE
    public final void flush() {
        if (isActive()) {
            C4UJ c4uj = this.A08;
            this.A04 = c4uj;
            C4UJ c4uj2 = this.A09;
            this.A05 = c4uj2;
            if (this.A07) {
                this.A06 = new C70186WFp(this.A01, this.A00, c4uj.A03, c4uj.A01, c4uj2.A03);
            } else {
                C70186WFp c70186WFp = this.A06;
                if (c70186WFp != null) {
                    c70186WFp.A00 = 0;
                    c70186WFp.A05 = 0;
                    c70186WFp.A06 = 0;
                    c70186WFp.A04 = 0;
                    c70186WFp.A03 = 0;
                    c70186WFp.A09 = 0;
                    c70186WFp.A08 = 0;
                    c70186WFp.A07 = 0;
                    c70186WFp.A02 = 0;
                    c70186WFp.A01 = 0;
                }
            }
        }
        this.A0B = C4UE.A00;
        this.A02 = 0L;
        this.A03 = 0L;
        this.A0D = false;
    }
}
