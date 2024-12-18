package X;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* loaded from: classes4.dex */
public final class AC7 {
    public final A9G A00;
    public final A6W A01;
    public final A9H A02;

    public final void A00() {
        A9H a9h = this.A02;
        a9h.A01 = 0;
        a9h.A04 = 0;
        a9h.A02 = 0;
        a9h.A03 = 0;
        a9h.A00 = 0;
        A9G a9g = this.A00;
        a9g.A04 = (short) 0;
        a9g.A03 = (short) 0;
        a9g.A00 = 0;
        a9g.A02 = 0;
        a9g.A01 = 0;
        A6W a6w = this.A01;
        a6w.A00 = false;
        a6w.A01 = false;
    }

    public final void A01(byte[] bArr, int i) {
        short s;
        if (bArr != null && i != 0) {
            ShortBuffer asShortBuffer = ByteBuffer.wrap(bArr).asShortBuffer();
            int min = Math.min(i, bArr.length) / 2;
            for (int i2 = 0; i2 < min; i2++) {
                short s2 = asShortBuffer.get(i2);
                A6W a6w = this.A01;
                A9G a9g = this.A00;
                short abs = (short) Math.abs((int) s2);
                if (!a6w.A01 && s2 != 0) {
                    a6w.A01 = true;
                }
                if (!a6w.A00 && abs > 184) {
                    a6w.A00 = true;
                }
                short s3 = a9g.A03;
                if (s3 <= 32440 || ((s = a9g.A04) <= 32440 ? s >= -32440 || s2 >= -32440 : s2 <= 32440)) {
                    int i3 = a9g.A00;
                    if (i3 > 0) {
                        a9g.A02 += i3 + 1;
                        a9g.A00 = 0;
                    }
                } else {
                    a9g.A00++;
                }
                if ((a9g.A04 == 0 && abs > 2048) || (s2 == 0 && s3 > 2048)) {
                    a9g.A01++;
                }
                a9g.A04 = s2;
                a9g.A03 = abs;
            }
            A9H a9h = this.A02;
            a9h.A01++;
            A6W a6w2 = this.A01;
            if (!a6w2.A01) {
                a9h.A04++;
            }
            if (!a6w2.A00) {
                a9h.A02++;
            }
            a6w2.A00 = false;
            a6w2.A01 = false;
        }
    }

    public AC7(A9H a9h) {
        this.A02 = a9h;
        A9G a9g = new A9G();
        this.A00 = a9g;
        A6W a6w = new A6W();
        this.A01 = a6w;
        a9g.A04 = (short) 0;
        a9g.A03 = (short) 0;
        a9g.A00 = 0;
        a9g.A02 = 0;
        a9g.A01 = 0;
        a6w.A00 = false;
        a6w.A01 = false;
    }
}
