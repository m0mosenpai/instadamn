package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jiw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44357Jiw extends Drawable {
    public float A00;
    public ColorStateList A01;
    public String A02;
    public String A03;
    public int A04 = 255;
    public Bitmap A05;
    public boolean A06;
    public final Paint A07;
    public final String A08;
    public final int A09;
    public final Paint A0A;
    public final Rect A0B;
    public final RectF A0C;

    private void A00() {
        this.A06 = true;
        Paint paint = this.A07;
        String str = this.A02;
        int length = str.length();
        Rect rect = this.A0B;
        paint.getTextBounds(str, 0, length, rect);
        rect.offsetTo(0, 0);
        setBounds(0, 0, rect.width(), rect.height());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.A06) {
            Bitmap bitmap = this.A05;
            if (bitmap != null) {
                if (bitmap.getWidth() == AbstractC166997dE.A0H(this) && this.A05.getHeight() == AbstractC166997dE.A0G(this)) {
                    this.A05.eraseColor(0);
                    Canvas A06 = AbstractC43592JPx.A06(this.A05);
                    RectF rectF = this.A0C;
                    rectF.set(getBounds());
                    float f = this.A09;
                    rectF.inset(f, f);
                    Paint paint = this.A0A;
                    paint.setColor(this.A01.getColorForState(getState(), 0));
                    paint.setAlpha(this.A04);
                    float f2 = this.A00;
                    A06.drawRoundRect(rectF, f2, f2, paint);
                    A06.drawText(this.A03, AbstractC166997dE.A0F(this), getBounds().centerY() + (this.A0B.height() / 2.0f), this.A07);
                } else {
                    this.A05.recycle();
                }
            }
            this.A05 = Bitmap.createBitmap(AbstractC166997dE.A0H(this), AbstractC166997dE.A0G(this), Bitmap.Config.ARGB_8888);
            Canvas A062 = AbstractC43592JPx.A06(this.A05);
            RectF rectF2 = this.A0C;
            rectF2.set(getBounds());
            float f3 = this.A09;
            rectF2.inset(f3, f3);
            Paint paint2 = this.A0A;
            paint2.setColor(this.A01.getColorForState(getState(), 0));
            paint2.setAlpha(this.A04);
            float f22 = this.A00;
            A062.drawRoundRect(rectF2, f22, f22, paint2);
            A062.drawText(this.A03, AbstractC166997dE.A0F(this), getBounds().centerY() + (this.A0B.height() / 2.0f), this.A07);
        }
        Bitmap bitmap2 = this.A05;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            canvas.drawBitmap(this.A05, 0.0f, 0.0f, (Paint) null);
        } else {
            C0w9.A03("CounterPillDrawable", "cachebitmap null or recycled");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A04 = i;
        this.A0A.setAlpha(i);
        this.A07.setAlpha(i);
    }

    public C44357Jiw(Context context, ColorStateList colorStateList, String str, float f, float f2, int i, int i2, int i3, boolean z) {
        String str2;
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A0A = A0S;
        AbstractC166987dD.A1R(A0S);
        this.A08 = str;
        this.A09 = i3;
        Paint A0R = AbstractC166987dD.A0R();
        this.A07 = A0R;
        A0R.setFilterBitmap(true);
        A0R.setAntiAlias(true);
        if (i2 == 0) {
            AbstractC166997dE.A1D(A0R, PorterDuff.Mode.DST_OUT);
        } else {
            A0R.setColor(i2);
        }
        A0R.setTypeface(AbstractC167017dG.A0R(context));
        A0R.setTextAlign(Paint.Align.CENTER);
        this.A0B = AbstractC166987dD.A0U();
        this.A0C = AbstractC166987dD.A0X();
        if (i < 100) {
            str2 = String.valueOf(i);
        } else if (z) {
            str2 = AbstractC43744JWe.A00(context.getResources(), Integer.valueOf(i), 1000, true);
        } else {
            str2 = "99+";
        }
        this.A03 = str2;
        String str3 = this.A08;
        if (str3 != null) {
            str2 = AnonymousClass001.A0R(str3, str2);
            this.A03 = str2;
        }
        this.A02 = str2.replaceAll("\\d", "8");
        A00();
        this.A00 = f;
        A00();
        this.A01 = colorStateList;
        A00();
        A00();
        this.A07.setTextSize(f2);
        A00();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AbstractC166997dE.A0G(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AbstractC166997dE.A0H(this);
    }
}
