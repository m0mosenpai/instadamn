package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;

/* renamed from: X.2nm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C59432nm extends AbstractC59442nn {
    public final int A00;
    public final int A01;
    public final Drawable A02;

    @Override // X.AbstractC59442nn
    public final int A01() {
        return this.A00;
    }

    @Override // X.AbstractC59442nn
    public final int A02() {
        return this.A01;
    }

    @Override // X.AbstractC59442nn
    public final void A05(Drawable.Callback callback) {
        this.A02.setCallback(callback);
    }

    public C59432nm(Drawable drawable) {
        int intrinsicWidth;
        this.A02 = drawable;
        boolean z = drawable instanceof NinePatchDrawable;
        if (z) {
            intrinsicWidth = -1;
        } else {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        this.A01 = intrinsicWidth;
        this.A00 = z ? -1 : drawable.getIntrinsicHeight();
    }
}
