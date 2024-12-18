package X;

import java.nio.ByteBuffer;

/* renamed from: X.UOr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66607UOr extends AnonymousClass692 implements X98 {
    @Override // X.X98
    public final void ANn(ByteBuffer byteBuffer, int i) {
        String A05 = WGe.A05(byteBuffer, i, 0);
        if (A05 != null) {
            this.A02 = A05;
            this.A01 = WGe.A00(byteBuffer, i, 1);
            this.A00 = WGe.A00(byteBuffer, i, 2);
            return;
        }
        throw new IllegalArgumentException(AbstractC111324zv.A00(4947));
    }
}
