package X;

import java.nio.ByteBuffer;

/* renamed from: X.0Zr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07180Zr {
    public final int A00;
    public final int A01;
    public final C0Zo A02;
    public final InterfaceC07170Zq A03;
    public final ByteBuffer A04;

    public C07180Zr(C0Zo c0Zo, InterfaceC07170Zq interfaceC07170Zq, ByteBuffer byteBuffer, int i) {
        int i2 = i + 8;
        int limit = (byteBuffer.limit() / i2) / 3;
        if (limit > 0) {
            int i3 = limit * 3 * i2;
            if (byteBuffer.limit() >= i3) {
                this.A01 = limit;
                this.A00 = i2;
                this.A04 = byteBuffer;
                this.A02 = c0Zo;
                this.A03 = interfaceC07170Zq;
                return;
            }
            throw new IllegalArgumentException(AnonymousClass001.A02(i3, byteBuffer.limit(), "Buffer is too small. MinimumSize=", ", but got "));
        }
        throw new IllegalArgumentException("Buffer should be greater then 0");
    }
}
