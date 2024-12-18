package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: X.9qE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221499qE extends C6RB {
    public boolean A00;
    public final Drawable A01;
    public final boolean A02;

    @Override // X.C6RB, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        C14360o3.A0B(canvas, 0);
        super.draw(canvas);
        if (this.A00) {
            if (this.A02 && (drawable = this.A01) != null) {
                drawable.draw(canvas);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public C221499qE(Context context, Drawable drawable, int i, boolean z) {
        super(context, i);
        this.A01 = drawable;
        this.A02 = z;
    }
}
