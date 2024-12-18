package X;

import android.graphics.Bitmap;

/* renamed from: X.SKn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62654SKn {
    public final Q4Q A00;

    public final void A00() {
        Bitmap bitmap;
        if (this instanceof C60933Rbn) {
            bitmap = ((C60933Rbn) this).A01;
        } else if (!(this instanceof C60932Rbm)) {
            return;
        } else {
            bitmap = ((C60932Rbm) this).A00;
        }
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    public AbstractC62654SKn(Q4Q q4q) {
        this.A00 = q4q;
    }
}
