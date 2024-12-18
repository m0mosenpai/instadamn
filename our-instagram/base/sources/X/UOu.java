package X;

import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public final class UOu extends AbstractC56652iy implements X98 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.X98
    public final void ANn(ByteBuffer byteBuffer, int i) {
        int A01 = WGe.A01(byteBuffer, i, 0);
        if (A01 != 0) {
            byteBuffer.getInt(A01);
        }
        AbstractC56602it abstractC56602it = (AbstractC56602it) WGe.A03(UOv.class, byteBuffer, i, 1);
        if (abstractC56602it != null) {
            this.A03 = abstractC56602it;
            this.A01 = WGe.A00(byteBuffer, i, 2);
            this.A00 = WGe.A00(byteBuffer, i, 3);
            AbstractC56612iu abstractC56612iu = (AbstractC56612iu) WGe.A02(C66603UOn.class, byteBuffer, i, 4);
            if (abstractC56612iu != null) {
                this.A02 = abstractC56612iu;
                this.A04 = (AnonymousClass692[]) WGe.A09(C66607UOr.class, byteBuffer, i, 5);
                return;
            }
            throw new IllegalArgumentException(AbstractC111324zv.A00(5240));
        }
        throw new IllegalArgumentException(AbstractC111324zv.A00(5379));
    }
}
