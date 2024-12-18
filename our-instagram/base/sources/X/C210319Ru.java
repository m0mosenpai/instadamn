package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.9Ru, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210319Ru extends Drawable {
    public int A00;
    public Path A01;
    public Path A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A07;
    public final int A08;
    public final Paint A09;
    public final float A06 = 9.0f;
    public final Paint A0A = AbstractC166987dD.A0S(1);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Path path;
        int i2;
        Path path2;
        C14360o3.A0B(canvas, 0);
        if (!this.A03 && !this.A05) {
            path = this.A01;
        } else {
            getBounds().exactCenterX();
            getBounds().exactCenterY();
            float f = this.A06;
            if (this.A05) {
                i = this.A00;
            } else {
                i = 0;
            }
            float f2 = f - i;
            RectF A0H = AbstractC167007dF.A0H(this);
            A0H.inset(f2, f2);
            RectF A0H2 = AbstractC167007dF.A0H(this);
            this.A01.reset();
            path = this.A01;
            path.addOval(A0H2, Path.Direction.CW);
            path.addOval(A0H, Path.Direction.CCW);
        }
        this.A01 = path;
        canvas.drawPath(path, this.A09);
        int level = getLevel() / 100;
        if (!this.A04 && !this.A05) {
            path2 = this.A02;
        } else {
            float f3 = (level * 360.0f) / 100.0f;
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            float f4 = this.A06;
            if (this.A05) {
                i2 = this.A00;
            } else {
                i2 = 0;
            }
            float f5 = f4 - i2;
            float f6 = f5 / 2.0f;
            float f7 = exactCenterX - f5;
            RectF A0H3 = AbstractC167007dF.A0H(this);
            A0H3.inset(f5, f5);
            RectF A0H4 = AbstractC167007dF.A0H(this);
            this.A02.reset();
            path2 = this.A02;
            if (f3 < 360.0f && f3 > -360.0f) {
                path2.setFillType(Path.FillType.WINDING);
                float f8 = exactCenterY - f7;
                path2.moveTo(exactCenterX, f8);
                path2.arcTo(new RectF(exactCenterX - f6, exactCenterY - (f7 + f5), exactCenterX + f6, f8), 90.0f, 180.0f, false);
                path2.arcTo(A0H4, 270.0f, f3, false);
                double radians = Math.toRadians((360.0d * (level / 100.0d)) - 90.0d);
                int A0E = getBounds().right - AbstractC166987dD.A0E(this);
                float cos = (float) Math.cos(radians);
                float f9 = A0E;
                float f10 = f4 / 2.0f;
                float f11 = (((cos * f9) + f9) / 2.0f) - (cos * f10);
                float sin = (float) Math.sin(radians);
                PointF pointF = new PointF(f11, (((sin * f9) + f9) / 2.0f) - (sin * f10));
                float f12 = pointF.x;
                float f13 = pointF.y;
                float f14 = f3 - 90.0f;
                path2.arcTo(new RectF(f12 - f6, f13 - f6, f12 + f6, f13 + f6), f14, 180.0f, false);
                path2.arcTo(A0H3, f14, -f3, false);
                path2.close();
            } else {
                path2.addOval(A0H4, Path.Direction.CW);
                path2.addOval(A0H3, Path.Direction.CCW);
            }
            this.A04 = false;
        }
        this.A02 = path2;
        canvas.drawPath(path2, this.A0A);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "parent deprecated too", replaceWith = @ReplaceWith(expression = "PixelFormat", imports = {}))
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        Paint paint = this.A0A;
        float exactCenterX = rect.exactCenterX();
        float exactCenterY = rect.exactCenterY();
        int i = this.A07;
        paint.setShader(new SweepGradient(exactCenterX, exactCenterY, new int[]{i, this.A08, i}, new float[]{0.0f, 0.5f, 1.0f}));
        this.A04 = true;
        this.A03 = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C210319Ru(int i, int i2, int i3) {
        this.A07 = i;
        this.A08 = i2;
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A09 = A0S;
        this.A01 = AbstractC166987dD.A0T();
        this.A02 = AbstractC166987dD.A0T();
        this.A04 = true;
        this.A03 = true;
        A0S.setColor(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        super.onLevelChange(i);
        this.A04 = true;
        invalidateSelf();
        return true;
    }
}
