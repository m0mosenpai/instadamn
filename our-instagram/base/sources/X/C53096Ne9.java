package X;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.Ne9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53096Ne9 extends InputStream {
    public ByteBuffer A00;
    public final InterfaceC24751Is A01;

    public C53096Ne9(InterfaceC24751Is interfaceC24751Is) {
        C14360o3.A0B(interfaceC24751Is, 1);
        this.A01 = interfaceC24751Is;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C14360o3.A0B(bArr, 0);
        ByteBuffer A00 = A00();
        if (A00 != null && A00.hasRemaining()) {
            int min = Math.min(Math.min(bArr.length - i, i2), A00.remaining());
            A00.get(bArr, i, min);
            this.A00 = A00;
            return min;
        }
        if (!this.A01.CRQ()) {
            return 0;
        }
        return -1;
    }

    private final ByteBuffer A00() {
        ByteBuffer byteBuffer = this.A00;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            InterfaceC24751Is interfaceC24751Is = this.A01;
            if (!interfaceC24751Is.CRQ()) {
                Object F8q = interfaceC24751Is.F8q();
                if (F8q instanceof C2QW) {
                    F8q = C2ST.A00(AnonymousClass191.A00, new MBT(interfaceC24751Is, null, 26));
                }
                byteBuffer = (ByteBuffer) F8q;
            } else {
                byteBuffer = null;
            }
        }
        this.A00 = byteBuffer;
        return byteBuffer;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A01.AGH(null);
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer A00 = A00();
        if (A00 != null) {
            return A00.get();
        }
        return -1;
    }
}
