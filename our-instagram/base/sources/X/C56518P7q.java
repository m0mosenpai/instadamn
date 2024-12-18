package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.P7q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56518P7q implements InterfaceC57974PnK {
    public final int A00;

    @Override // X.InterfaceC57974PnK
    public final Bitmap F8F(Bitmap bitmap) {
        int i = this.A00;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        C14360o3.A07(createBitmap);
        Bitmap A00 = C0fK.A00(bitmap, i, i, false);
        C14360o3.A07(A00);
        Canvas A06 = AbstractC43592JPx.A06(createBitmap);
        A06.clipPath(AMo.A02(i));
        A06.drawBitmap(A00, 0.0f, 0.0f, (Paint) null);
        return createBitmap;
    }

    public C56518P7q(int i) {
        this.A00 = i;
    }
}
