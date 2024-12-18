package X;

import android.graphics.Bitmap;

/* loaded from: classes11.dex */
public final class UOR extends UOS {
    public final void finalize() {
        if (!isClosed()) {
            C0I2.A09("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", AbstractC25228BEl.A1Z(AbstractC31173DnH.A0q(this), System.identityHashCode(this)));
            close();
        }
    }

    public UOR(Bitmap bitmap, C1VS c1vs, C3QQ c3qq) {
        super(bitmap, c1vs, c3qq);
    }

    public UOR(C1VO c1vo, C3QQ c3qq) {
        super(c1vo, c3qq);
    }
}
