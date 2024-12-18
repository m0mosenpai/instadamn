package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5ju, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124385ju extends Drawable {
    public double A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public final float A07;
    public final Paint A08;
    public final PointF A09;
    public final int A0A;
    public final Path A0B;
    public final PointF A0C;
    public final PointF A0D;
    public final PointF A0E;
    public final PointF A0F;
    public final List A0G;
    public final boolean A0H;

    public C124385ju(Context context, float f, int i, int i2) {
        C14360o3.A0B(context, 1);
        this.A07 = f;
        this.A0A = i2;
        Paint paint = new Paint(1);
        this.A08 = paint;
        this.A0G = new ArrayList();
        this.A0D = new PointF();
        this.A0F = new PointF();
        this.A0E = new PointF();
        this.A0C = new PointF();
        this.A09 = new PointF();
        this.A0B = new Path();
        paint.setColor(context.getColor(i));
        this.A0H = AbstractC13620mo.A02(context);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        float f;
        float f2;
        int i2;
        float f3;
        float f4;
        Paint paint;
        float f5;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C14360o3.A0B(canvas, 0);
        Rect bounds = getBounds();
        C14360o3.A07(bounds);
        int i8 = this.A0A;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 3) {
                    if (i8 != 5) {
                        if (i8 != 16) {
                            if (i8 != 48) {
                                if (i8 == 80) {
                                    int i9 = bounds.left;
                                    boolean z = this.A0H;
                                    if (z) {
                                        i6 = this.A04;
                                    } else {
                                        i6 = this.A05;
                                    }
                                    f = i9 + i6;
                                    float f6 = bounds.bottom - this.A03;
                                    f2 = f6 - this.A07;
                                    int i10 = bounds.right;
                                    if (z) {
                                        i7 = this.A05;
                                    } else {
                                        i7 = this.A04;
                                    }
                                    f3 = i10 - i7;
                                    paint = this.A08;
                                    f5 = f6;
                                } else {
                                    return;
                                }
                            } else {
                                int i11 = bounds.left;
                                boolean z2 = this.A0H;
                                if (z2) {
                                    i4 = this.A04;
                                } else {
                                    i4 = this.A05;
                                }
                                f = i11 + i4;
                                f2 = bounds.top + this.A06;
                                int i12 = bounds.right;
                                if (z2) {
                                    i5 = this.A05;
                                } else {
                                    i5 = this.A04;
                                }
                                f3 = i12 - i5;
                                f4 = f2 + this.A07;
                            }
                        } else {
                            float f7 = (bounds.left + bounds.right) / 2.0f;
                            float f8 = this.A07 / 2.0f;
                            float f9 = this.A01;
                            f = (f7 - f8) - f9;
                            int i13 = bounds.top + this.A06;
                            int i14 = this.A02;
                            f2 = i13 - i14;
                            f3 = (f7 + f8) - f9;
                            i3 = (bounds.bottom - this.A03) - i14;
                        }
                    } else {
                        f3 = bounds.right - this.A04;
                        f = f3 - this.A07;
                        f2 = bounds.top + this.A06;
                        float f10 = bounds.bottom - this.A03;
                        paint = this.A08;
                        f5 = f10;
                    }
                    canvas.drawRect(f, f2, f3, f5, paint);
                    return;
                }
                f = bounds.left + this.A05;
                f2 = bounds.top + this.A06;
                f3 = f + this.A07;
                i3 = bounds.bottom - this.A03;
                f4 = i3;
            } else {
                int i15 = bounds.left;
                boolean z3 = this.A0H;
                if (z3) {
                    i = this.A04;
                } else {
                    i = this.A05;
                }
                int i16 = this.A01;
                f = (i15 + i) - i16;
                float f11 = (bounds.top + bounds.bottom) / 2.0f;
                float f12 = this.A07 / 2.0f;
                float f13 = this.A02;
                f2 = (f11 - f12) - f13;
                int i17 = bounds.right;
                if (z3) {
                    i2 = this.A05;
                } else {
                    i2 = this.A04;
                }
                f3 = (i17 - i2) - i16;
                f4 = (f11 + f12) - f13;
            }
            paint = this.A08;
            f5 = f4;
            canvas.drawRect(f, f2, f3, f5, paint);
            return;
        }
        double d = this.A00;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        if (cos != 0.0f) {
            PointF pointF = this.A09;
            float f14 = pointF.y + (((-pointF.x) / cos) * sin);
            if (f14 >= bounds.top && f14 < bounds.bottom) {
                PointF pointF2 = this.A0D;
                pointF2.x = bounds.left - this.A01;
                pointF2.y = f14;
                this.A0G.add(pointF2);
            }
            float f15 = pointF.y + (((bounds.right - pointF.x) / cos) * sin);
            if (f15 >= bounds.top && f15 < bounds.bottom) {
                PointF pointF3 = this.A0E;
                pointF3.x = r9 - this.A01;
                pointF3.y = f15;
                this.A0G.add(pointF3);
            }
        }
        if (sin != 0.0f) {
            PointF pointF4 = this.A09;
            float f16 = pointF4.x + (((-pointF4.y) / sin) * cos);
            if (f16 >= bounds.left && f16 < bounds.right) {
                PointF pointF5 = this.A0F;
                pointF5.x = f16;
                pointF5.y = bounds.top - this.A02;
                this.A0G.add(pointF5);
            }
            float f17 = pointF4.x + (((bounds.bottom - pointF4.y) / sin) * cos);
            if (f17 >= bounds.left && f17 < bounds.right) {
                PointF pointF6 = this.A0C;
                pointF6.x = f17;
                pointF6.y = r5 - this.A02;
                this.A0G.add(pointF6);
            }
        }
        List list = this.A0G;
        if (list.size() < 2) {
            return;
        }
        PointF pointF7 = (PointF) list.get(0);
        PointF pointF8 = (PointF) list.get(list.size() - 1);
        Path path = this.A0B;
        path.moveTo(pointF7.x, pointF7.y);
        path.lineTo(pointF8.x, pointF8.y);
        canvas.drawPath(path, this.A08);
        list.clear();
        path.reset();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void A00(int i, int i2, int i3, int i4) {
        this.A05 = i;
        this.A06 = i2;
        this.A04 = i3;
        this.A03 = i4;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A08.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A08.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
