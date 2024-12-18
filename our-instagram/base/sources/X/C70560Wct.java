package X;

import android.graphics.Bitmap;

/* renamed from: X.Wct, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70560Wct implements InterfaceC200298tY {
    public static final C70560Wct A00 = new C70560Wct();

    @Override // X.InterfaceC200298tY
    public final void Den(C201938wQ c201938wQ) {
        Bitmap bitmap = (Bitmap) c201938wQ.getValue();
        if (bitmap != null) {
            bitmap.recycle();
        }
    }
}
