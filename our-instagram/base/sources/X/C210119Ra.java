package X;

import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: X.9Ra, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210119Ra extends BitmapDrawable {
    public int A00;

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        getPaint().setAlpha(this.A00);
        super.draw(canvas);
    }
}
