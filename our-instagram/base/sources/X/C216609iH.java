package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.9iH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216609iH extends C8RL {
    @Override // X.C8RL, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect A0Q = AbstractC167017dG.A0Q(this, canvas);
        canvas.drawRoundRect(A0Q.left, A0Q.top, A0Q.right, A0Q.bottom, A0Q.width() / 2, A0Q.width() / 2, this.A03);
        Drawable drawable = this.A00;
        if (drawable != null) {
            canvas.save();
            AbstractC167007dF.A0u(canvas, drawable, A0Q.left + (A0Q.width() / 2), A0Q.top + (A0Q.height() / 2));
        }
    }
}
