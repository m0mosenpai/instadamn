package X;

import android.graphics.Bitmap;

/* renamed from: X.3QM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3QM extends AbstractC59442nn {
    public final int A00;
    public final int A01;
    public final Bitmap A02;
    public final boolean A03;

    @Override // X.AbstractC59442nn
    public final int A00() {
        return 6;
    }

    public C3QM(Bitmap bitmap, boolean z) {
        this.A02 = bitmap;
        this.A03 = z;
        this.A01 = bitmap.getWidth();
        this.A00 = bitmap.getHeight();
    }
}
