package X;

import android.graphics.Bitmap;

/* renamed from: X.Stq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C63796Stq implements InterfaceC65571Tn4 {
    @Override // X.InterfaceC65571Tn4
    public final void AHt() {
    }

    @Override // X.InterfaceC65571Tn4
    public final void F8f(int i) {
    }

    @Override // X.InterfaceC65571Tn4
    public final void E6v(Bitmap bitmap) {
        if (!(this instanceof QBG)) {
            bitmap.recycle();
        }
    }

    @Override // X.InterfaceC65571Tn4
    public final Bitmap AXA(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // X.InterfaceC65571Tn4
    public final Bitmap Axk(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }
}
