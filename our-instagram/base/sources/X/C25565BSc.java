package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.BSc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25565BSc extends Drawable {
    public RectF A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Context A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final Path A0E;
    public final InterfaceC09390do A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        C14360o3.A0B(canvas, 0);
        if (this.A0H && this.A0J) {
            ((Drawable) this.A0F.getValue()).draw(canvas);
        }
        boolean z = this.A0I;
        if (z) {
            Paint paint3 = this.A0D;
            if (paint3 != null) {
                canvas.drawPath(this.A0E, paint3);
            }
            if (C1H6.A03() && (paint2 = this.A0C) != null) {
                canvas.drawPath(this.A0E, paint2);
            }
        }
        Path path = this.A0E;
        Paint paint4 = this.A0B;
        canvas.drawPath(path, paint4);
        float A01 = A01();
        if (z && (paint = this.A0D) != null) {
            canvas.drawCircle(A01 + 12.0f, getBounds().bottom - 6.0f, 6.0f, paint);
        }
        canvas.drawCircle(A01 + 12.0f, getBounds().bottom - 6.0f, 6.0f, paint4);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float f;
        Paint paint;
        float f2;
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = new RectF(rect);
        rectF.inset(this.A04, this.A06);
        this.A00 = rectF;
        float A00 = (rectF.bottom - A00()) - 4.0f;
        if (this.A0G) {
            double width = this.A00.width();
            double d = this.A05 * 1.5d;
            float A002 = this.A00.bottom - A00();
            if (width < d) {
                f2 = 10.0f;
            } else {
                f2 = 6.0f;
            }
            f = A002 - f2;
        } else {
            f = A00;
        }
        float A01 = A01();
        float f3 = this.A02;
        float f4 = f3 + A01;
        Float valueOf = Float.valueOf(f);
        float f5 = f3 / 2.0f;
        float f6 = f4 - f5;
        float floatValue = valueOf.floatValue() + A00();
        float f7 = A01 - f5;
        Path path = this.A0E;
        path.reset();
        path.moveTo(f4, valueOf.floatValue());
        path.cubicTo(f6, valueOf.floatValue(), f6 + 4.0f, floatValue, A01, floatValue);
        path.cubicTo(f7 - 4.0f, floatValue, f7, valueOf.floatValue(), A01 - f3, valueOf.floatValue());
        path.close();
        RectF rectF2 = this.A00;
        RectF rectF3 = new RectF(rectF2.left, rectF2.top, rectF2.right, A00);
        float f8 = this.A01;
        path.addRoundRect(rectF3, f8, f8, Path.Direction.CW);
        if (this.A0I) {
            Paint paint2 = this.A0D;
            if (paint2 != null) {
                float centerX = this.A00.centerX();
                RectF rectF4 = this.A00;
                paint2.setShader(new LinearGradient(centerX, rectF4.top, rectF4.right, rectF4.bottom, new int[]{this.A09, 0}, new float[]{0.0f, 0.35f}, Shader.TileMode.CLAMP));
            }
            float centerX2 = this.A00.centerX();
            RectF rectF5 = this.A00;
            float f9 = rectF5.top;
            float centerX3 = rectF5.centerX();
            float f10 = this.A00.bottom;
            int i = this.A03;
            this.A0B.setShader(new LinearGradient(centerX2, f9, centerX3, f10, new int[]{AbstractC56842jH.A06(i, 216), i}, (float[]) null, Shader.TileMode.CLAMP));
            if (C1H6.A03() && (paint = this.A0C) != null) {
                RectF rectF6 = this.A00;
                paint.setShader(new LinearGradient(rectF6.left, rectF6.top, rectF6.right, rectF6.bottom, new int[]{this.A08, 0}, new float[]{0.0f, 0.4f}, Shader.TileMode.CLAMP));
            }
        }
        if (this.A0H && this.A0J) {
            ((Drawable) this.A0F.getValue()).setBounds(new Rect(rect.left, rect.top, rect.right, (rect.bottom - ((int) A00())) - 8));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public /* synthetic */ C25565BSc(Context context, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        float f;
        float f2;
        int i4;
        int i5;
        if ((i3 & 2) != 0) {
            f = context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
        } else {
            f = 0.0f;
        }
        if ((i3 & 16) != 0) {
            f2 = context.getResources().getDimensionPixelSize(R.dimen.iconic_note_entry_point_stroke_width);
        } else {
            f2 = 0.0f;
        }
        if ((i3 & 32) != 0) {
            i4 = context.getColor(R.color.facepile_inner_stroke_color);
        } else {
            i4 = 0;
        }
        if ((i3 & 64) != 0) {
            i5 = context.getColor(R.color.track_background_color);
        } else {
            i5 = 0;
        }
        boolean A1V = AbstractC25226BEj.A1V(i3 & 128, z);
        boolean A1U = AbstractC25226BEj.A1U(i3 & 512, z2);
        boolean A1V2 = AbstractC25226BEj.A1V(i3 & 1024, z3);
        boolean A1U2 = AbstractC25226BEj.A1U(i3 & C3OO.FLAG_MOVED, z4);
        this.A0A = context;
        this.A01 = f;
        this.A03 = i;
        this.A09 = i2;
        this.A07 = i4;
        this.A08 = i5;
        this.A0I = A1V;
        this.A0G = A1U;
        this.A0H = A1V2;
        this.A0J = A1U2;
        this.A04 = AbstractC167017dG.A04(context);
        this.A06 = AbstractC167017dG.A0D(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(A1U ? R.dimen.ab_test_media_thumbnail_preview_item_internal_padding : R.dimen.abc_dialog_padding_top_material);
        this.A05 = dimensionPixelSize;
        this.A00 = AbstractC166987dD.A0X();
        this.A0E = AbstractC166987dD.A0T();
        Paint A0R = AbstractC166987dD.A0R();
        A0R.setStyle(Paint.Style.STROKE);
        A0R.setAntiAlias(true);
        A0R.setStrokeWidth(f2);
        Paint paint = null;
        this.A0D = A1V ? A0R : null;
        Paint A0R2 = AbstractC166987dD.A0R();
        A0R2.setColor(i);
        Paint.Style style = Paint.Style.FILL;
        A0R2.setStyle(style);
        A0R2.setAntiAlias(true);
        if (A1V2 && !A1U2) {
            A0R2.setShadowLayer(15.0f, 2.0f, 2.0f, i4);
        }
        this.A0B = A0R2;
        Paint A0R3 = AbstractC166987dD.A0R();
        A0R3.setStyle(style);
        A0R3.setAntiAlias(true);
        if (A1V && C1H6.A03()) {
            paint = A0R3;
        }
        this.A0C = paint;
        this.A02 = dimensionPixelSize / 2.0f;
        this.A0F = AbstractC09440dt.A01(new C29889DGd(this, 31));
    }

    private final float A01() {
        float f;
        float width;
        float f2;
        float f3;
        boolean z = this.A0G;
        if (z && this.A00.width() > this.A05 * 1.5d) {
            f = this.A00.left;
            f3 = 36.0f;
        } else {
            float width2 = this.A00.width();
            int i = this.A05;
            float f4 = i * 4;
            RectF rectF = this.A00;
            if (width2 > f4) {
                f = rectF.left;
                width = rectF.width();
                f2 = 3.05f;
            } else {
                float width3 = rectF.width();
                float f5 = i * 3;
                RectF rectF2 = this.A00;
                f = rectF2.left;
                width = rectF2.width();
                if (width3 > f5) {
                    f2 = 2.4f;
                } else if (z) {
                    f2 = 2.0f;
                } else {
                    f2 = 2.2f;
                }
            }
            f3 = width / f2;
        }
        return f + f3;
    }

    private final float A00() {
        return AbstractC25227BEk.A00(getBounds().height(), this.A00.height()) * 0.94f;
    }
}
