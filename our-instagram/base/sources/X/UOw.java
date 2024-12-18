package X;

import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public final class UOw extends AnonymousClass690 implements X98 {
    @Override // X.X98
    public final void ANn(ByteBuffer byteBuffer, int i) {
        byte b = 0;
        int A01 = WGe.A01(byteBuffer, i, 0);
        if (A01 != 0) {
            b = byteBuffer.get(A01);
        }
        this.A00 = b;
        this.A01 = (C3LS) WGe.A03(C66606UOq.class, byteBuffer, i, 1);
        this.A02 = (C3LS) WGe.A03(C66606UOq.class, byteBuffer, i, 2);
    }
}
