package X;

import android.graphics.BitmapFactory;
import java.nio.ByteBuffer;

/* renamed from: X.UOi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66598UOi extends C1349268q implements X98 {
    @Override // X.X98
    public final void ANn(ByteBuffer byteBuffer, int i) {
        AbstractC56602it abstractC56602it = (AbstractC56602it) WGe.A03(UOv.class, byteBuffer, i, 0);
        if (abstractC56602it != null) {
            this.A01 = abstractC56602it;
            byte[] A06 = WGe.A06(byteBuffer, i, 1);
            if (A06 != null) {
                this.A00 = BitmapFactory.decodeByteArray(A06, 0, A06.length);
                WGe.A05(byteBuffer, i, 2);
                return;
            }
            throw new IllegalArgumentException(AbstractC111324zv.A00(4010));
        }
        throw new IllegalArgumentException(AbstractC111324zv.A00(4011));
    }
}
