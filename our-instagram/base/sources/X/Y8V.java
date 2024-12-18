package X;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* loaded from: classes12.dex */
public final class Y8V implements YQP {
    public C73310Y1q A00;
    public C73310Y1q A01;
    public C73310Y1q A02;
    public C73310Y1q A03;
    public ByteBuffer A04;
    public ByteBuffer A05;
    public ShortBuffer A06;

    @Override // X.YQP
    public final void reset() {
        C73310Y1q c73310Y1q = C73310Y1q.A04;
        this.A02 = c73310Y1q;
        this.A03 = c73310Y1q;
        this.A00 = c73310Y1q;
        this.A01 = c73310Y1q;
        ByteBuffer byteBuffer = YQP.A00;
        this.A04 = byteBuffer;
        this.A06 = byteBuffer.asShortBuffer();
        this.A05 = byteBuffer;
    }

    public Y8V() {
        C73310Y1q c73310Y1q = C73310Y1q.A04;
        this.A02 = c73310Y1q;
        this.A03 = c73310Y1q;
        this.A00 = c73310Y1q;
        this.A01 = c73310Y1q;
        ByteBuffer byteBuffer = YQP.A00;
        this.A04 = byteBuffer;
        this.A06 = byteBuffer.asShortBuffer();
        this.A05 = byteBuffer;
    }
}
