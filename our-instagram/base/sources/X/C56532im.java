package X;

import java.nio.ByteBuffer;

/* renamed from: X.2im, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56532im {
    public final C56542in A00;
    public final C56482ih A01;

    public C56532im(C56522il c56522il, C56472ig c56472ig, ByteBuffer byteBuffer) {
        this.A01 = c56522il.A00[byteBuffer.get() & 255];
        this.A00 = new C56542in(c56472ig, byteBuffer);
    }
}
