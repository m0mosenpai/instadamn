package X;

import android.graphics.Bitmap;
import android.graphics.Paint;

/* renamed from: X.P7p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56517P7p implements InterfaceC57974PnK {
    public final int A00;

    public C56517P7p(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC57974PnK
    public final Bitmap F8F(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int i = this.A00;
        int i2 = i * 2;
        Bitmap A0F = AbstractC167007dF.A0F(width + i2, bitmap.getHeight() + i2);
        float f = i;
        AbstractC43592JPx.A06(A0F).drawBitmap(bitmap, f, f, (Paint) null);
        return A0F;
    }
}
