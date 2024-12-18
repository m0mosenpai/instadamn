package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.facebook.R;

/* renamed from: X.3Xx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74833Xx {
    public int A00;
    public int A01;
    public float A02;
    public final Paint A03;
    public final Paint A04;
    public final Path A05;
    public final Path A06;
    public final RectF A07;
    public final RectF A08;
    public final C74843Xy A09;

    public static C74833Xx A00(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return new C74833Xx(context);
        }
        return new C74833Xx(context, attributeSet);
    }

    private void A01() {
        PorterDuffXfermode porterDuffXfermode;
        Paint paint = this.A04;
        paint.setColor(this.A00);
        if (this.A00 == 0) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        } else {
            porterDuffXfermode = null;
        }
        paint.setXfermode(porterDuffXfermode);
        Paint paint2 = this.A03;
        paint2.setColor(this.A01);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(this.A02);
        this.A06.setFillType(Path.FillType.EVEN_ODD);
    }

    private void A02() {
        Path path = this.A06;
        path.reset();
        RectF rectF = this.A08;
        Path.Direction direction = Path.Direction.CW;
        path.addRect(rectF, direction);
        RectF rectF2 = this.A07;
        float[] fArr = this.A09.A01;
        path.addRoundRect(rectF2, fArr, direction);
        Path path2 = this.A05;
        path2.reset();
        path2.addRoundRect(rectF2, fArr, direction);
    }

    public final void A03(int i, int i2) {
        float f = i;
        float f2 = i2;
        this.A08.set(0.0f, 0.0f, f, f2);
        float f3 = this.A02 / 2.0f;
        this.A07.set(f3, f3, f - f3, f2 - f3);
        A02();
    }

    public final void A04(Canvas canvas) {
        canvas.drawPath(this.A06, this.A04);
        if (this.A02 > 0.0f) {
            canvas.drawPath(this.A05, this.A03);
        }
    }

    public final boolean A05(float f) {
        C74843Xy c74843Xy = this.A09;
        if (c74843Xy.A00 == C05F.A00 && c74843Xy.A01[0] == f) {
            return false;
        }
        c74843Xy.A06(f);
        A02();
        return true;
    }

    public final boolean A06(float f) {
        if (this.A02 != f) {
            this.A02 = f;
            this.A03.setStrokeWidth(f);
            return true;
        }
        return false;
    }

    public final boolean A07(float f, float f2, float f3, float f4) {
        C74843Xy c74843Xy = this.A09;
        float[] fArr = c74843Xy.A01;
        if (c74843Xy.A00 != C05F.A0j && fArr[0] == f && fArr[2] == f2 && fArr[4] == f3 && fArr[6] == f4) {
            return false;
        }
        c74843Xy.A07(f, f2, f4, f3);
        A02();
        return true;
    }

    public final boolean A08(int i) {
        PorterDuffXfermode porterDuffXfermode;
        if (this.A00 != i) {
            this.A00 = i;
            Paint paint = this.A04;
            paint.setColor(i);
            if (this.A00 == 0) {
                porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            } else {
                porterDuffXfermode = null;
            }
            paint.setXfermode(porterDuffXfermode);
            return true;
        }
        return false;
    }

    public C74833Xx(Context context) {
        this.A04 = new Paint(1);
        this.A03 = new Paint(1);
        this.A06 = new Path();
        this.A05 = new Path();
        this.A08 = new RectF();
        this.A07 = new RectF();
        this.A09 = new C74843Xy();
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_left);
        this.A01 = context.getColor(R.color.black_6_transparent);
        this.A00 = context.getColor(R.color.design_dark_default_color_on_background);
        A01();
    }

    public C74833Xx(Context context, AttributeSet attributeSet) {
        this.A04 = new Paint(1);
        this.A03 = new Paint(1);
        this.A06 = new Path();
        this.A05 = new Path();
        this.A08 = new RectF();
        this.A07 = new RectF();
        C74843Xy c74843Xy = new C74843Xy();
        this.A09 = c74843Xy;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A23);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        dimensionPixelSize = obtainStyledAttributes != null ? obtainStyledAttributes.getDimensionPixelOffset(1, dimensionPixelSize) : dimensionPixelSize;
        c74843Xy.A07(obtainStyledAttributes.getDimensionPixelOffset(4, dimensionPixelSize), obtainStyledAttributes.getDimensionPixelOffset(5, dimensionPixelSize), obtainStyledAttributes.getDimensionPixelOffset(2, dimensionPixelSize), obtainStyledAttributes.getDimensionPixelOffset(3, dimensionPixelSize));
        this.A02 = obtainStyledAttributes.getDimensionPixelOffset(7, context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_left));
        this.A01 = obtainStyledAttributes.getColor(6, context.getColor(R.color.black_6_transparent));
        this.A00 = obtainStyledAttributes.getColor(0, context.getColor(R.color.fds_transparent));
        obtainStyledAttributes.recycle();
        A01();
    }
}
