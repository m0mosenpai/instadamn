package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.Suh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63849Suh implements InterfaceC65560Tmg {
    public final ByteBuffer A00;

    @Override // X.InterfaceC65560Tmg
    public final short CC5() {
        ByteBuffer byteBuffer = this.A00;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new C61022Rdq();
    }

    @Override // X.InterfaceC65560Tmg
    public final int E7o(byte[] bArr, int i) {
        ByteBuffer byteBuffer = this.A00;
        int min = Math.min(i, byteBuffer.remaining());
        if (min == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, min);
        return min;
    }

    @Override // X.InterfaceC65560Tmg
    public final long skip(long j) {
        ByteBuffer byteBuffer = this.A00;
        int min = (int) Math.min(byteBuffer.remaining(), j);
        AbstractC58319PtB.A1L(byteBuffer, min);
        return min;
    }

    public C63849Suh(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    @Override // X.InterfaceC65560Tmg
    public final int CC4() {
        return (CC5() << 8) | CC5();
    }
}
