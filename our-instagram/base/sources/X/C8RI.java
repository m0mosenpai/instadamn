package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.8RI, reason: invalid class name */
/* loaded from: classes4.dex */
public class C8RI extends Drawable {
    public float A00;
    public int A02;
    public int A03;
    public int A04;
    public C8RK A05;
    public C8RL A06;
    public C8RL A07;
    public boolean A08;
    public Paint A09;
    public Paint A0A;
    public final int A0C;
    public final int A0D;
    public final int A0F;
    public final int A0G = 5;
    public final RectF A0E = new RectF();
    public Integer A0B = C05F.A0N;
    public float A01 = 1.0f;

    public C8RI(int i, int i2, int i3, int i4) {
        this.A0C = i2;
        this.A0D = i3;
        this.A0F = i4;
        Paint paint = new Paint(1);
        this.A0A = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.A0A.setStrokeWidth(i3);
        this.A0A.setColor(i);
        Paint paint2 = new Paint();
        this.A09 = paint2;
        paint2.setColor(Color.argb(155, 0, 0, 0));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Path path;
        float f;
        C14360o3.A0B(canvas, 0);
        C8RK c8rk = this.A05;
        if (c8rk != null) {
            c8rk.draw(canvas);
        }
        int intValue = this.A0B.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        RectF rectF = this.A0E;
                        float f2 = this.A0C;
                        canvas.drawRoundRect(rectF, f2, f2, this.A0A);
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    path = new Path();
                    RectF rectF2 = this.A0E;
                    float f3 = rectF2.bottom;
                    float f4 = f3 - rectF2.top;
                    float f5 = rectF2.right;
                    float f6 = rectF2.left;
                    float f7 = f5 - f6;
                    float f8 = this.A0C;
                    path.moveTo(f6 - this.A0G, f3);
                    path.rLineTo(f7 - f8, 0.0f);
                    float f9 = -f8;
                    path.rQuadTo(f8, 0.0f, f8, f9);
                    path.rLineTo(0.0f, -(f4 - (2.0f * f8)));
                    path.rQuadTo(0.0f, f9, f9, f9);
                    f = -f7;
                }
            } else {
                path = new Path();
                RectF rectF3 = this.A0E;
                float f10 = rectF3.bottom;
                float f11 = rectF3.top;
                float f12 = rectF3.right + this.A0G;
                f = f12 - rectF3.left;
                float f13 = this.A0C;
                path.moveTo(f12 + f13, f11);
                path.rLineTo(-f, 0.0f);
                float f14 = -f13;
                path.rQuadTo(f14, 0.0f, f14, f13);
                path.rLineTo(0.0f, (f10 - f11) - (2.0f * f13));
                path.rQuadTo(0.0f, f13, f13, f13);
            }
            path.rLineTo(f, 0.0f);
            canvas.drawPath(path, this.A0A);
        } else {
            RectF rectF4 = this.A0E;
            float f15 = rectF4.left;
            float f16 = this.A0G;
            float f17 = rectF4.top;
            float f18 = rectF4.right + f16;
            Paint paint = this.A0A;
            canvas.drawLine(f15 - f16, f17, f18, f17, paint);
            float f19 = rectF4.left - f16;
            float f20 = rectF4.bottom;
            canvas.drawLine(f19, f20, rectF4.right + f16, f20, paint);
        }
        if (!this.A08) {
            C8RL c8rl = this.A06;
            if (c8rl != null) {
                c8rl.draw(canvas);
            }
            C8RL c8rl2 = this.A07;
            if (c8rl2 != null) {
                c8rl2.draw(canvas);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        A04();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int A00() {
        int i;
        if (!(this instanceof C8RM) && !(this instanceof C8RJ)) {
            int width = getBounds().width() - (this.A0D * 2);
            C8RL c8rl = this.A06;
            int i2 = 0;
            if (c8rl != null) {
                i = c8rl.A02;
            } else {
                i = 0;
            }
            int i3 = width - i;
            C8RL c8rl2 = this.A07;
            if (c8rl2 != null) {
                i2 = c8rl2.A02;
            }
            return i3 - i2;
        }
        return getBounds().width();
    }

    public final int A01() {
        Rect bounds;
        C8RL c8rl = this.A06;
        if (c8rl != null && (bounds = c8rl.getBounds()) != null) {
            return bounds.right + this.A0F;
        }
        return (int) Math.floor(this.A0E.left + (this.A0D / 2.0f));
    }

    public final int A02() {
        Rect bounds;
        C8RL c8rl = this.A07;
        if (c8rl != null && (bounds = c8rl.getBounds()) != null) {
            return bounds.left + this.A0F;
        }
        return (int) Math.ceil(this.A0E.right - (this.A0D / 2.0f));
    }

    public final void A03() {
        int i;
        if (this instanceof C8RJ) {
            C8RK c8rk = this.A05;
            if (c8rk != null) {
                c8rk.A00 = this.A0C;
                c8rk.setBounds(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
                c8rk.A01 = this.A03;
                C8RK.A00(c8rk);
                c8rk.A02 = this.A02;
                C8RK.A00(c8rk);
                c8rk.invalidateSelf();
                return;
            }
            return;
        }
        if (this.A05 == null) {
            return;
        }
        Rect bounds = getBounds();
        C14360o3.A07(bounds);
        C8RK c8rk2 = this.A05;
        if (c8rk2 != null) {
            c8rk2.setBounds(bounds.left, bounds.top, bounds.right, bounds.bottom);
        }
        C8RL c8rl = this.A06;
        int i2 = 0;
        if (c8rl != null) {
            i = c8rl.A02;
        } else {
            i = 0;
        }
        C8RL c8rl2 = this.A07;
        if (c8rl2 != null) {
            i2 = c8rl2.A02;
        }
        C8RK c8rk3 = this.A05;
        if (c8rk3 != null) {
            c8rk3.A01 = ((int) (A00() * this.A00)) + i;
            C8RK.A00(c8rk3);
        }
        C8RK c8rk4 = this.A05;
        if (c8rk4 != null) {
            c8rk4.A02 = ((int) (A00() * (1.0f - this.A01))) + i2;
            C8RK.A00(c8rk4);
        }
        invalidateSelf();
    }

    public final void A04() {
        if (this instanceof C8RM) {
            A05();
            C8RL c8rl = this.A06;
            if (c8rl != null) {
                Rect bounds = c8rl.getBounds();
                RectF rectF = this.A0E;
                float f = rectF.left;
                float f2 = c8rl.A02 / 2;
                bounds.set((int) (f - f2), (int) (rectF.centerY() - (rectF.height() / 6.0f)), (int) (rectF.left + f2), (int) (rectF.centerY() + (rectF.height() / 6.0f)));
            }
            C8RL c8rl2 = this.A07;
            if (c8rl2 != null) {
                Rect bounds2 = c8rl2.getBounds();
                RectF rectF2 = this.A0E;
                float f3 = rectF2.right;
                float f4 = c8rl2.A02 / 2;
                bounds2.set((int) (f3 - f4), (int) (rectF2.centerY() - (rectF2.height() / 6.0f)), (int) (rectF2.right + f4), (int) (rectF2.centerY() + (rectF2.height() / 6.0f)));
            }
        } else {
            if (this instanceof C8RJ) {
                A05();
                C8RL c8rl3 = this.A06;
                if (c8rl3 != null) {
                    Rect bounds3 = c8rl3.getBounds();
                    RectF rectF3 = this.A0E;
                    float f5 = rectF3.left;
                    bounds3.set((int) f5, (int) rectF3.top, (int) (f5 + c8rl3.A02), (int) rectF3.bottom);
                }
                C8RL c8rl4 = this.A07;
                if (c8rl4 != null) {
                    Rect bounds4 = c8rl4.getBounds();
                    RectF rectF4 = this.A0E;
                    float f6 = rectF4.right;
                    bounds4.set((int) (f6 - c8rl4.A02), (int) rectF4.top, (int) f6, (int) rectF4.bottom);
                }
            } else {
                A05();
                float f7 = this.A0D / 2.0f;
                C8RL c8rl5 = this.A06;
                if (c8rl5 != null) {
                    c8rl5.setBounds((int) Math.floor(this.A0E.left + f7), (int) Math.floor(r3.top + f7), (int) Math.floor(r4 + c8rl5.A02), (int) Math.ceil(r3.bottom - f7));
                }
                C8RL c8rl6 = this.A07;
                if (c8rl6 != null) {
                    c8rl6.setBounds((int) Math.ceil(r3 - c8rl6.A02), (int) Math.floor(r7.top + f7), (int) Math.floor(this.A0E.right - f7), (int) Math.ceil(r7.bottom - f7));
                }
            }
            A03();
        }
        invalidateSelf();
    }

    public final void A06(final int i) {
        C8RK c8rk;
        C8RK c8rk2;
        if (this instanceof C8RJ) {
            C8RJ c8rj = (C8RJ) this;
            if (i == 0) {
                c8rk2 = null;
            } else {
                c8rk2 = c8rj.A05;
                if (c8rk2 == null) {
                    final int i2 = c8rj.A0C;
                    final int i3 = c8rj.A0D;
                    c8rk2 = new C8RK(i, i2, i3) { // from class: X.9iF
                        public final int A00;

                        @Override // X.C8RK, android.graphics.drawable.Drawable
                        public final void draw(Canvas canvas) {
                            C14360o3.A0B(canvas, 0);
                            float A0G = AbstractC166997dE.A0G(this) - (super.A00 * 2.0f);
                            Path A0T = AbstractC166987dD.A0T();
                            A0T.moveTo(super.A00, 0.0f);
                            float f = super.A00;
                            float f2 = -f;
                            A0T.rQuadTo(f2, 0.0f, f2, f);
                            A0T.rLineTo(0.0f, A0G);
                            float f3 = super.A00;
                            A0T.rQuadTo(0.0f, f3, f3, f3);
                            float f4 = this.A00 / 1.5f;
                            A0T.rLineTo(this.A01 + f4, 0.0f);
                            float f5 = -super.A00;
                            A0T.rQuadTo(f5, 0.0f, f5, f5);
                            A0T.rLineTo(0.0f, -A0G);
                            float f6 = super.A00;
                            float f7 = -f6;
                            A0T.rQuadTo(0.0f, f7, f6, f7);
                            A0T.close();
                            Paint paint = this.A03;
                            canvas.drawPath(A0T, paint);
                            float A0G2 = AbstractC166997dE.A0G(this) - (2.0f * super.A00);
                            Path A0T2 = AbstractC166987dD.A0T();
                            A0T2.moveTo(((getBounds().right - super.A00) - this.A02) - f4, 0.0f);
                            float f8 = super.A00;
                            A0T2.rQuadTo(f8, 0.0f, f8, f8);
                            A0T2.rLineTo(0.0f, A0G2);
                            float f9 = super.A00;
                            A0T2.rQuadTo(0.0f, f9, -f9, f9);
                            A0T2.rLineTo(this.A02 + f4, 0.0f);
                            float f10 = super.A00;
                            A0T2.rQuadTo(f10, 0.0f, f10, -f10);
                            A0T2.rLineTo(0.0f, -A0G2);
                            float f11 = -super.A00;
                            A0T2.rQuadTo(0.0f, f11, f11, f11);
                            A0T2.close();
                            canvas.drawPath(A0T2, paint);
                        }

                        {
                            this.A00 = i3;
                        }
                    };
                }
            }
            c8rj.A05 = c8rk2;
            c8rj.A00 = i;
            return;
        }
        if (i == 0) {
            c8rk = null;
        } else {
            c8rk = new C8RK(i, this.A0C);
        }
        this.A05 = c8rk;
        this.A04 = this.A04;
        A03();
    }

    public final void A07(Shader shader) {
        this.A0A.setShader(shader);
        C8RL c8rl = this.A06;
        if (c8rl != null) {
            c8rl.A03.setShader(shader);
            c8rl.invalidateSelf();
        }
        C8RL c8rl2 = this.A07;
        if (c8rl2 != null) {
            c8rl2.A03.setShader(shader);
            c8rl2.invalidateSelf();
        }
        invalidateSelf();
    }

    public final void A08(C8RL c8rl) {
        this.A06 = c8rl;
        A07(this.A0A.getShader());
    }

    public final void A09(C8RL c8rl) {
        this.A07 = c8rl;
        A07(this.A0A.getShader());
    }

    public final boolean A0A(float f, int i) {
        Rect bounds;
        C8RL c8rl = this.A06;
        if (c8rl != null && (bounds = c8rl.getBounds()) != null) {
            int width = bounds.left + (bounds.width() / 2);
            if (Integer.valueOf(width) != null) {
                float abs = Math.abs(f - width);
                int i2 = i + this.A0F;
                int A02 = A02() - A01();
                if (A02 < i2 * 2) {
                    i2 = A02 / 2;
                }
                if (abs <= i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A0B(float f, int i) {
        Rect bounds;
        C8RL c8rl = this.A07;
        if (c8rl != null && (bounds = c8rl.getBounds()) != null) {
            int width = bounds.left + (bounds.width() / 2);
            if (Integer.valueOf(width) != null) {
                float abs = Math.abs(f - width);
                int i2 = i + this.A0F;
                int A02 = A02() - A01();
                if (A02 < i2 * 2) {
                    i2 = A02 / 2;
                }
                if (abs <= i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void A05() {
        int i;
        int i2;
        C14360o3.A07(getBounds());
        float f = this.A0D / 2.0f;
        float A00 = A00();
        float f2 = this.A00 * A00;
        float f3 = (1.0f - this.A01) * A00;
        if (this.A08) {
            i = this.A03;
            i2 = this.A02;
        } else {
            i = 0;
            i2 = this.A0F * 2;
        }
        this.A0E.set(r7.left + f2 + f + i, r7.top + f, ((r7.right - f3) - f) - i2, r7.bottom - f);
    }
}
