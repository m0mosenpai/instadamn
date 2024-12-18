package X;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: X.7R0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7R0 {
    public int A00 = -1;
    public boolean A04 = false;
    public ColorFilter A03 = null;
    public int A01 = -1;
    public int A02 = -1;

    public final void A00(ColorFilter colorFilter) {
        this.A03 = colorFilter;
        boolean z = false;
        if (colorFilter != null) {
            z = true;
        }
        this.A04 = z;
    }

    public final void A01(Drawable drawable) {
        int i = this.A00;
        if (i != -1) {
            drawable.setAlpha(i);
        }
        if (this.A04) {
            drawable.setColorFilter(this.A03);
        }
        int i2 = this.A01;
        boolean z = true;
        if (i2 != -1) {
            boolean z2 = false;
            if (i2 != 0) {
                z2 = true;
            }
            drawable.setDither(z2);
        }
        int i3 = this.A02;
        if (i3 != -1) {
            if (i3 == 0) {
                z = false;
            }
            drawable.setFilterBitmap(z);
        }
    }
}
