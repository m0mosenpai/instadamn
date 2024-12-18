package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.9Sg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210419Sg extends Drawable implements BCB {
    public float A00;
    public final C6RB A01;
    public final C6RB A02;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void A00(Canvas canvas, float f, float f2, float f3) {
        this.A00 = f3;
        C6RB c6rb = this.A01;
        AbstractC166997dE.A1G(this, (int) (f3 * f), (int) (f3 * f2), (int) (f3 * (f + c6rb.A0A + this.A02.A0A)), (int) (f3 * (f2 + c6rb.A06)));
        draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A01.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A02.A0A + this.A01.A0A;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
        this.A02.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
    }

    public C210419Sg(Context context, String str, int i) {
        C6RB A0z = AbstractC166987dD.A0z(context, i);
        AbstractC166997dE.A1Q(A0z, str);
        AbstractC167027dH.A0c(context, A0z, 14);
        this.A01 = A0z;
        C6RB A0z2 = AbstractC166987dD.A0z(context, i);
        AbstractC166997dE.A1Q(A0z2, "  •  ");
        AbstractC167027dH.A0c(context, A0z2, 14);
        this.A02 = A0z2;
        this.A00 = 1.0f;
    }

    @Override // X.BCB
    public final Rect BIv() {
        return AbstractC166987dD.A0V(AbstractC166987dD.A0E(this) + this.A02.A0A, getBounds().top, getBounds().right, AbstractC166987dD.A0D(this));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC167007dF.A0r(canvas);
        AbstractC167017dG.A12(canvas, this);
        float f = this.A00;
        canvas.scale(f, f);
        this.A02.draw(canvas);
        canvas.translate(r0.A0A, 0.0f);
        this.A01.draw(canvas);
        canvas.restore();
    }
}
