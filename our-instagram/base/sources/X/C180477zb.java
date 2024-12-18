package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import java.util.List;

/* renamed from: X.7zb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180477zb extends C5RN implements InterfaceC180487zc {
    public float A00;
    public boolean A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final float A0C;
    public final float A0D;
    public final float A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final Drawable A0I;
    public final ShapeDrawable A0J;
    public final ShapeDrawable A0K;
    public final ShapeDrawable A0L;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        C14360o3.A0B(canvas, 0);
        canvas.save();
        canvas.rotate(this.A02, getBounds().centerX(), getBounds().centerY());
        float f = this.A0F;
        Drawable drawable = this.A0I;
        float intrinsicWidth = f / drawable.getIntrinsicWidth();
        canvas.scale(intrinsicWidth, intrinsicWidth, getBounds().centerX(), getBounds().centerY());
        if (this.A01) {
            i = (int) AbstractC13600mm.A02(this.A00, 0.0f, 1.0f, 0.0f, 255.0f);
        } else {
            i = 255;
        }
        drawable.setAlpha(i);
        drawable.draw(canvas);
        canvas.restore();
        C14360o3.A07(getBounds());
        float f2 = (r4.left + r4.right) / 2.0f;
        float f3 = (r4.top + r4.bottom) / 2.0f;
        A01(canvas, this.A0J, f2 + this.A05, f3 + this.A06, f2 + this.A03, f3 + this.A04);
        A01(canvas, this.A0K, f2 + this.A09, f3 + this.A0A, f2 + this.A07, f3 + this.A08);
        A01(canvas, this.A0L, f2 + this.A0D, f3 + this.A0E, f2 + this.A0B, f3 + this.A0C);
    }

    public static final ShapeDrawable A00(int i, int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setIntrinsicWidth(i);
        shapeDrawable.setIntrinsicHeight(i);
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(i2);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        shapeDrawable.setBounds(new Rect(0, 0, i, i));
        return shapeDrawable;
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1N(this.A0I, this.A0J, this.A0K, this.A0L);
    }

    @Override // X.InterfaceC180487zc
    public final void EPj(float f) {
        this.A00 = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A0G;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0H;
    }

    private final void A01(Canvas canvas, Drawable drawable, float f, float f2, float f3, float f4) {
        canvas.save();
        float f5 = this.A00;
        float f6 = 1.0f - 0.0f;
        float f7 = f3 - f;
        float f8 = 0.0f;
        if (f6 != 0.0f) {
            f8 = (f5 - 0.0f) / f6;
        }
        float f9 = (f8 * f7) + f;
        float f10 = f4 - f2;
        float f11 = 0.0f;
        if (f6 != 0.0f) {
            f11 = (f5 - 0.0f) / f6;
        }
        canvas.translate(f9, (f11 * f10) + f2);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Drawable drawable = this.A0I;
        int i5 = this.A0F;
        int i6 = ((i3 - i) - i5) / 2;
        float intrinsicHeight = ((i4 - i2) - (i5 * (drawable.getIntrinsicHeight() / drawable.getIntrinsicWidth()))) / 2.0f;
        drawable.setBounds(i + i6, (int) (i2 + intrinsicHeight), i3 - i6, (int) (i4 - intrinsicHeight));
    }

    public /* synthetic */ C180477zb(Context context, Drawable drawable, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        float f14 = f5;
        float f15 = f4;
        float f16 = f9;
        float f17 = f8;
        float f18 = f13;
        float f19 = f12;
        int i9 = i3;
        int i10 = i2;
        float f20 = (i6 & 8) != 0 ? 0.0f : f;
        if ((i6 & 16) != 0) {
            i7 = (int) AbstractC13880nE.A04(context, 4);
        } else {
            i7 = 0;
        }
        i10 = (i6 & 32) != 0 ? context.getColor(R.color.activator_card_progress_bad) : i10;
        f15 = (i6 & 256) != 0 ? f2 : f15;
        f14 = (i6 & 512) != 0 ? f3 : f14;
        if ((i6 & 1024) != 0) {
            i8 = context.getColor(R.color.igds_creation_tools_pink);
        } else {
            i8 = 0;
        }
        f17 = (i6 & 8192) != 0 ? f6 : f17;
        f16 = (i6 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? f7 : f16;
        i9 = (32768 & i6) != 0 ? context.getColor(R.color.igds_creation_tools_purple) : i9;
        f19 = (262144 & i6) != 0 ? f10 : f19;
        f18 = (i6 & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0 ? f11 : f18;
        C14360o3.A0B(context, 1);
        this.A0I = drawable;
        this.A0F = i;
        this.A02 = f20;
        this.A03 = f2;
        this.A04 = f3;
        this.A05 = f15;
        this.A06 = f14;
        this.A07 = f6;
        this.A08 = f7;
        this.A09 = f17;
        this.A0A = f16;
        this.A0B = f10;
        this.A0C = f11;
        this.A0D = f19;
        this.A0E = f18;
        this.A0H = i4;
        this.A0G = i5;
        this.A0J = A00(i7, i10);
        this.A0K = A00(i7, i8);
        this.A0L = A00(i7, i9);
    }
}
