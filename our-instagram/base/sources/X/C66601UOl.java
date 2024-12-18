package X;

import java.nio.ByteBuffer;

/* renamed from: X.UOl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66601UOl extends AbstractC56582ir implements X98 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.X98
    public final void ANn(ByteBuffer byteBuffer, int i) {
        byte[] A06 = WGe.A06(byteBuffer, i, 0);
        if (A06 != null) {
            this.A03 = A06;
            this.A01 = (C141566aZ) WGe.A02(C66596UOg.class, byteBuffer, i, 1);
            AbstractC56652iy[] abstractC56652iyArr = (AbstractC56652iy[]) WGe.A09(UOu.class, byteBuffer, i, 2);
            if (abstractC56652iyArr != null) {
                this.A04 = abstractC56652iyArr;
                int i2 = 0;
                int A01 = WGe.A01(byteBuffer, i, 3);
                if (A01 != 0) {
                    i2 = byteBuffer.getInt(A01);
                }
                this.A00 = i2;
                WGe.A05(byteBuffer, i, 4);
                this.A05 = (WWR[]) WGe.A09(WWR.class, byteBuffer, i, 5);
                A00();
                return;
            }
            throw new IllegalArgumentException("scenes cannot be null");
        }
        throw new IllegalArgumentException("manifest cannot be null");
    }
}
