package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.6vA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153406vA extends Drawable {
    public static final int A0B = Color.argb(75, 255, 255, 255);
    public int A00;
    public int A01;
    public int A02;
    public String A03 = "0";
    public boolean A04 = false;
    public float A05;
    public final int A06;
    public final int A07;
    public final Paint A08;
    public final float A09;
    public final Paint A0A;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00 + this.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00 + this.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0A.setAlpha(i);
        this.A08.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0A.setColorFilter(colorFilter);
        this.A08.setColorFilter(colorFilter);
    }

    public C153406vA(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A00 = dimensionPixelSize;
        this.A05 = dimensionPixelSize / 2.0f;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
        this.A06 = dimensionPixelSize2;
        this.A09 = dimensionPixelSize2 / 2.0f;
        this.A07 = resources.getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
        this.A01 = resources.getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap);
        this.A02 = context.getColor(C1QI.A0E() == C1QL.A04 ? R.color.igds_prism_indigo_05 : AbstractC53242c7.A0H(context, R.attr.selectedNumberedCircleColor));
        Paint paint = new Paint();
        this.A0A = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint(1);
        this.A08 = paint2;
        paint2.setColor(-1);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(this.A01);
    }

    public final void A00(int i) {
        this.A03 = String.valueOf(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        canvas.save();
        float f = this.A09;
        canvas.translate(f, f);
        if (this.A04) {
            i = this.A02;
        } else {
            i = A0B;
        }
        Paint paint = this.A0A;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        float f2 = this.A05;
        canvas.drawCircle(f2, f2, f2, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(this.A06);
        canvas.drawCircle(f2, f2, f2, paint);
        if (this.A04) {
            canvas.drawText(this.A03, f2, (this.A01 / 3.0f) + f2, this.A08);
        }
        canvas.restore();
    }
}
