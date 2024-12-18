package X;

import java.nio.ByteBuffer;

/* renamed from: X.691, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass691 extends AnonymousClass692 implements C68Y {
    @Override // X.C68Y
    public final void ANn(ByteBuffer byteBuffer, int i) {
        String A03 = AbstractC1348468a.A03(byteBuffer, i, 0);
        if (A03 != null) {
            this.A02 = A03;
            float f = 0.0f;
            int A00 = AbstractC1348468a.A00(byteBuffer, i, 1);
            if (A00 != 0) {
                f = byteBuffer.getFloat(A00);
            }
            this.A01 = f;
            float f2 = 0.0f;
            int A002 = AbstractC1348468a.A00(byteBuffer, i, 2);
            if (A002 != 0) {
                f2 = byteBuffer.getFloat(A002);
            }
            this.A00 = f2;
            return;
        }
        throw new IllegalArgumentException("name cannot be null");
    }
}
