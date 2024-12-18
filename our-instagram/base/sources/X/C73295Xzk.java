package X;

import java.nio.ByteBuffer;

/* renamed from: X.Xzk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73295Xzk {
    public ByteBuffer A00;
    public final int A01;

    public C73295Xzk(int i, ByteBuffer byteBuffer) {
        this.A01 = i;
        if (byteBuffer.isDirect()) {
            this.A00 = byteBuffer;
            return;
        }
        throw AbstractC166987dD.A14("Bytes buffer must be direct");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C73295Xzk(int r2, byte... r3) {
        /*
            r1 = this;
            r0 = 2
            X.C14360o3.A0B(r3, r0)
            int r0 = r3.length
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r0.put(r3)
            r0.flip()
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73295Xzk.<init>(int, byte[]):void");
    }
}
