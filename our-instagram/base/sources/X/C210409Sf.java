package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.9Sf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210409Sf extends Drawable implements C5RQ, InterfaceC133125ze {
    public float A00;
    public int A01;
    public int A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final C83o A07;
    public final C6RB A08;
    public final String A09;

    @Override // X.C5RQ
    public final /* synthetic */ void Egu() {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A07;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return AnonymousClass001.A0R("story-reels-metadata-sticker-", this.A09);
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return Math.min(this.A06, 15000);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return C1H4.A01(this.A03);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return C1H4.A01(this.A05);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A01 = i;
        this.A08.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter != null) {
            this.A08.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    public /* synthetic */ C210409Sf(Context context, C83o c83o) {
        boolean A1V = AbstractC167007dF.A1V(c83o);
        this.A07 = c83o;
        this.A04 = 0.67f;
        this.A09 = c83o.A0C;
        float f = c83o.A02;
        this.A05 = f;
        this.A03 = c83o.A01;
        this.A01 = 255;
        Resources resources = context.getResources();
        this.A00 = resources.getDimension(R.dimen.action_bar_item_spacing_right);
        int A01 = AbstractC166997dE.A01(context);
        int A02 = AbstractC166997dE.A02(context);
        Typeface A0R = AbstractC167017dG.A0R(context);
        this.A02 = 0;
        this.A06 = c83o.A06;
        C6RB A0z = AbstractC166987dD.A0z(context, (int) f);
        this.A08 = A0z;
        A0z.A0A(resources.getDimension(R.dimen.action_bar_item_spacing_right));
        A0z.A0F(A01);
        A0z.A0I(A0R);
        A0z.A0D(5.0f, 0.0f, 0.0f, A02);
        A0z.A0N = A1V;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect A0Q = AbstractC167017dG.A0Q(this, canvas);
        int save = canvas.save();
        float f = this.A04;
        float f2 = 1.0f / f;
        AbstractC167007dF.A0s(canvas, A0Q);
        canvas.scale(f2, f2);
        float f3 = this.A05 * f;
        canvas.save();
        C6RB c6rb = this.A08;
        c6rb.A0M(C23831Eq.A02(this.A06 - this.A02));
        c6rb.setAlpha(this.A01);
        float f4 = this.A00;
        AbstractC167007dF.A0u(canvas, c6rb, (f3 - c6rb.A0A) - f4, f4);
        canvas.restoreToCount(save);
    }

    @Override // X.C5RQ
    public final void EUp(int i, int i2) {
        this.A02 = i;
    }
}
