package X;

import android.graphics.BitmapFactory;
import java.nio.ByteBuffer;

/* renamed from: X.68p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1349168p extends C1349268q implements C68Y {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C68Y
    public final void ANn(ByteBuffer byteBuffer, int i) {
        AbstractC56602it abstractC56602it;
        int A00 = AbstractC1348468a.A00(byteBuffer, i, 0);
        if (A00 != 0) {
            C68Y c68y = (C68Y) C68Z.class.newInstance();
            c68y.ANn(byteBuffer, A00);
            abstractC56602it = c68y;
        } else {
            abstractC56602it = null;
        }
        AbstractC56602it abstractC56602it2 = abstractC56602it;
        if (abstractC56602it2 != null) {
            this.A01 = abstractC56602it2;
            byte[] A04 = AbstractC1348468a.A04(byteBuffer, i, 1);
            if (A04 != null) {
                this.A00 = BitmapFactory.decodeByteArray(A04, 0, A04.length);
                AbstractC1348468a.A03(byteBuffer, i, 2);
                return;
            }
            throw new IllegalArgumentException("bitmap content cannot be null");
        }
        throw new IllegalArgumentException("bitmap size cannot be null");
    }
}
