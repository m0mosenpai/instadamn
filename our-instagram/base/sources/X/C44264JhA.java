package X;

import android.graphics.Bitmap;

/* renamed from: X.JhA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44264JhA {
    public int A00;
    public Bitmap A01;

    public final int A00() {
        boolean A1M = AbstractC167007dF.A1M((this.A00 / 90) % 2);
        Bitmap bitmap = this.A01;
        if (A1M) {
            if (bitmap != null) {
                return bitmap.getWidth();
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public final int A01() {
        boolean A1M = AbstractC167007dF.A1M((this.A00 / 90) % 2);
        Bitmap bitmap = this.A01;
        if (A1M) {
            if (bitmap != null) {
                return bitmap.getHeight();
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public C44264JhA(Bitmap bitmap, int i) {
        this.A01 = bitmap;
        this.A00 = i % 360;
    }
}
