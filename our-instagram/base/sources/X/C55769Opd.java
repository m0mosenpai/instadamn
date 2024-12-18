package X;

import android.graphics.Bitmap;
import android.graphics.Paint;

/* renamed from: X.Opd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55769Opd implements C8NS {
    public final C8LK A00;

    @Override // X.C8NS
    public final void AWx(C26076Bg5 c26076Bg5) {
        Bitmap A00 = AbstractC226289yl.A00(this.A00);
        if (A00 != null) {
            AbstractC43592JPx.A06((Bitmap) c26076Bg5.A01).drawBitmap(A00, 0.0f, 0.0f, (Paint) null);
            A00.recycle();
        }
    }

    public C55769Opd(C8LK c8lk) {
        this.A00 = c8lk;
    }
}
