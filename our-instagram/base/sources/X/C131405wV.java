package X;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.facebook.R;

/* renamed from: X.5wV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131405wV implements InterfaceC55932he {
    public static final C55942hf A0h = C55942hf.A04(80.0d, 10.0d);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public C55982hj A0A;
    public C55982hj A0B;
    public C55982hj A0C;
    public C57012jc A0D;
    public C57012jc A0E;
    public C57012jc A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final int A0N;
    public final int A0O;
    public final Rect A0P;
    public final RectF A0Q;
    public final C55982hj A0R;
    public final C55952hg A0S;
    public final C124375jt A0T;
    public final C124375jt A0U;
    public final C124375jt A0V;
    public final C124375jt A0W;
    public final C124375jt A0X;
    public final C124375jt A0Y;
    public final C124405jw A0Z;
    public final C124405jw A0a;
    public final C124405jw A0b;
    public final C124405jw A0c;
    public final C124395jv A0d;
    public final C124385ju A0e;
    public final boolean A0f;
    public final int A0g;

    public C131405wV(Context context) {
        C14360o3.A0B(context, 1);
        int i = context.getResources().getDisplayMetrics().widthPixels;
        this.A0O = i;
        C55952hg A00 = AbstractC13560mi.A00();
        this.A0S = A00;
        C55982hj A02 = A00.A02();
        A02.A0A(this);
        A02.A06 = true;
        A02.A09(A0h);
        this.A0R = A02;
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
        float dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.accent_edge_thickness);
        int i2 = (int) (i * 0.06d);
        this.A0N = i2;
        this.A0g = context.getResources().getDimensionPixelSize(R.dimen.alignment_guide_default_vertical_margin);
        this.A0f = AbstractC13620mo.A02(context);
        Integer num = C05F.A00;
        this.A0V = new C124375jt(context, A00, num);
        Integer num2 = C05F.A01;
        this.A0U = new C124375jt(context, A00, num2);
        C124375jt c124375jt = new C124375jt(context, A00, C05F.A0Y);
        c124375jt.A06.A00(i2, 0, 0, 0);
        this.A0W = c124375jt;
        C124375jt c124375jt2 = new C124375jt(context, A00, C05F.A0j);
        c124375jt2.A06.A00(0, 0, i2, 0);
        this.A0X = c124375jt2;
        Integer num3 = C05F.A0C;
        this.A0Y = new C124375jt(context, A00, num3);
        Integer num4 = C05F.A0N;
        this.A0T = new C124375jt(context, A00, num4);
        C124385ju c124385ju = new C124385ju(context, dimensionPixelSize, R.color.netego_su_background_gradient_end_4, 0);
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{dimensionPixelSize2, dimensionPixelSize2 / 2.0f}, 0.0f);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = c124385ju.A08;
        paint.setStyle(style);
        paint.setPathEffect(dashPathEffect);
        paint.setStrokeWidth(c124385ju.A07);
        c124385ju.invalidateSelf();
        this.A0e = c124385ju;
        this.A0d = new C124395jv(context, A00);
        this.A0c = new C124405jw(context, num);
        this.A0Z = new C124405jw(context, num2);
        this.A0a = new C124405jw(context, num3);
        this.A0b = new C124405jw(context, num4);
        this.A0P = new Rect();
        this.A0K = true;
        this.A0H = true;
        this.A0G = true;
        this.A0Q = new RectF();
    }

    public final void A06() {
        this.A0J = false;
        this.A0V.A00();
        this.A0U.A00();
        this.A0W.A00();
        this.A0X.A00();
        this.A0Y.A00();
        this.A0T.A00();
        C124395jv c124395jv = this.A0d;
        c124395jv.A07 = false;
        c124395jv.A0B.A00();
        c124395jv.A0A.A00();
        this.A0R.A05(0.0d);
        C55982hj c55982hj = this.A0B;
        if (c55982hj != null) {
            c55982hj.A05(0.0d);
        }
        C55982hj c55982hj2 = this.A0A;
        if (c55982hj2 != null) {
            c55982hj2.A05(0.0d);
        }
        C55982hj c55982hj3 = this.A0C;
        if (c55982hj3 != null) {
            c55982hj3.A05(0.0d);
        }
        this.A0c.A00 = false;
        this.A0a.A00 = false;
        this.A0Z.A00 = false;
        this.A0b.A00 = false;
    }

    public final void A07(Rect rect) {
        C14360o3.A0B(rect, 0);
        this.A0I = true;
        Rect rect2 = this.A0P;
        if (!C14360o3.A0K(rect2, rect)) {
            rect2.set(rect);
            this.A0V.A03(rect2);
            this.A0U.A03(rect2);
            C124375jt c124375jt = this.A0W;
            c124375jt.A03(rect2);
            C124375jt c124375jt2 = this.A0X;
            c124375jt2.A03(rect2);
            this.A0Y.A03(rect2);
            this.A0T.A03(rect2);
            C124395jv c124395jv = this.A0d;
            c124395jv.A04 = rect2;
            Rect rect3 = c124395jv.A09;
            rect3.left = rect2.left;
            rect3.right = rect2.right;
            c124395jv.A0B.A03(rect2);
            c124395jv.A0A.A03(rect2);
            C124385ju c124385ju = this.A0e;
            c124385ju.setBounds(rect2);
            int i = rect2.left;
            int i2 = rect2.top;
            c124385ju.A01 = i;
            c124385ju.A02 = i2;
            this.A01 = rect2.centerX() - rect2.left;
            this.A02 = rect2.centerY() - rect2.top;
            if (this.A0K) {
                int i3 = this.A0N;
                this.A03 = rect2.left + i3;
                c124375jt.A06.A00(i3, 0, 0, 0);
                this.A0a.A01.setBounds(rect2.left, rect2.top, (int) this.A03, rect2.bottom);
                this.A06 = rect2.right - i3;
                c124375jt2.A06.A00(0, 0, i3, 0);
                this.A0b.A01.setBounds((int) this.A06, rect2.top, rect2.right, rect2.bottom);
            }
            int i4 = this.A08;
            if (i4 > 0 || this.A09 > 0) {
                int centerY = rect2.centerY();
                int i5 = i4 / 2;
                c124395jv.A00(centerY - i5, centerY + i5);
            }
            C57012jc c57012jc = this.A0E;
            if (c57012jc != null) {
                if (this.A0H) {
                    View A01 = c57012jc.A01();
                    C14360o3.A07(A01);
                    A01.addOnLayoutChangeListener(new AT1(A01, this));
                } else {
                    A02(this, this.A0g);
                }
            }
            C57012jc c57012jc2 = this.A0D;
            if (c57012jc2 != null) {
                if (this.A0G) {
                    View A012 = c57012jc2.A01();
                    C14360o3.A07(A012);
                    A012.addOnLayoutChangeListener(new AT2(A012, this));
                    return;
                }
                A01(this, this.A0g);
            }
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        if (c55982hj != this.A0A && c55982hj != this.A0B && c55982hj != this.A0C && c55982hj.A09.A00 == 1.0d) {
            C2UY.A01.A05(5L);
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C57012jc c57012jc;
        View A01;
        C14360o3.A0B(c55982hj, 0);
        C55982hj c55982hj2 = this.A0R;
        double d = c55982hj.A09.A00;
        if (c55982hj == c55982hj2) {
            this.A0e.setAlpha((int) AbstractC70163Da.A04(d, 0.0d, 1.0d, 0.0d, 255.0d));
            return;
        }
        float A04 = (float) AbstractC70163Da.A04(d, 0.0d, 1.0d, 0.0d, 0.5d);
        int i = 0;
        if (c55982hj == this.A0B) {
            c57012jc = this.A0E;
        } else if (c55982hj == this.A0A) {
            c57012jc = this.A0D;
        } else if (c55982hj != this.A0C) {
            return;
        } else {
            c57012jc = this.A0F;
        }
        if (c57012jc == null || (A01 = c57012jc.A01()) == null) {
            return;
        }
        if (A04 <= 0.0f) {
            i = 8;
        }
        A01.setVisibility(i);
        A01.setAlpha(A04);
    }

    public static final void A00(C57012jc c57012jc) {
        View view;
        if (c57012jc != null) {
            if (c57012jc.A00 != null) {
                view = c57012jc.A01();
            } else {
                view = c57012jc.A01;
            }
            if (view != null) {
                AbstractC124845kp.A01(view).removeView(view);
            }
        }
    }

    public static final void A01(C131405wV c131405wV, int i) {
        Rect rect = c131405wV.A0P;
        c131405wV.A00 = rect.bottom - i;
        c131405wV.A0T.A06.A00(0, 0, 0, i);
        c131405wV.A0Z.A01.setBounds(rect.left, (int) c131405wV.A00, rect.right, rect.bottom);
    }

    public static final void A02(C131405wV c131405wV, int i) {
        Rect rect = c131405wV.A0P;
        c131405wV.A07 = rect.top + i;
        c131405wV.A0Y.A06.A00(0, i, 0, 0);
        c131405wV.A0c.A01.setBounds(rect.left, rect.top, rect.right, (int) c131405wV.A07);
    }

    public static final boolean A03(C131405wV c131405wV) {
        if (!c131405wV.A0U.A00 && !c131405wV.A0Y.A00 && !c131405wV.A0T.A00) {
            C124395jv c124395jv = c131405wV.A0d;
            if (!c124395jv.A0B.A00 && !c124395jv.A0A.A00) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A04(C131405wV c131405wV) {
        if (!c131405wV.A0V.A00 && !c131405wV.A0W.A00 && !c131405wV.A0X.A00) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
        if (r14 == r12) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float A05(float r18, float r19, float r20, float r21, float r22) {
        /*
            r17 = this;
            r2 = r21
            double r3 = (double) r2
            double r0 = java.lang.Math.toRadians(r3)
            float r8 = (float) r0
            r9 = r22
            double r0 = (double) r9
            double r0 = java.lang.Math.toRadians(r0)
            float r11 = (float) r0
            r10 = r17
            boolean r7 = r10.A0J
            r0 = 0
            r12 = r11
            if (r7 == 0) goto L19
            r12 = 0
        L19:
            float r12 = r12 + r8
            r16 = 1061752795(0x3f490fdb, float:0.7853982)
            float r6 = r8 % r16
            r5 = 1
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L37
            float r0 = r8 / r16
            double r0 = (double) r0
            double r14 = java.lang.Math.floor(r0)
            float r12 = r12 / r16
            double r0 = (double) r12
            double r12 = java.lang.Math.floor(r0)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            r12 = 1
            if (r0 != 0) goto L38
        L37:
            r12 = 0
        L38:
            float r1 = java.lang.Math.abs(r20)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L9c
            if (r12 != 0) goto L51
            if (r7 == 0) goto L9c
            float r1 = java.lang.Math.abs(r11)
            r0 = 1018345666(0x3cb2b8c2, float:0.021816615)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L9c
        L51:
            r10.A0J = r5
            float r1 = java.lang.Math.abs(r6)
            r0 = 1053364187(0x3ec90fdb, float:0.3926991)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L94
            float r7 = -r6
        L5f:
            X.2hj r6 = r10.A0R
            if (r5 == 0) goto L8e
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r6.A06(r0)
            X.5ju r5 = r10.A0e
            android.graphics.PointF r0 = r5.A09
            r1 = r18
            r0.x = r1
            r1 = r19
            r0.y = r1
            float r8 = r8 + r7
            double r0 = (double) r8
            r5.A00 = r0
        L78:
            boolean r0 = r10.A0J
            r5 = 1135869952(0x43b40000, float:360.0)
            if (r0 == 0) goto L8b
            double r0 = (double) r7
            double r0 = java.lang.Math.toDegrees(r0)
            double r3 = r3 + r0
            long r0 = X.C1H4.A02(r3)
            float r2 = (float) r0
        L89:
            float r2 = r2 % r5
            return r2
        L8b:
            float r2 = r21 + r22
            goto L89
        L8e:
            r0 = 0
            r6.A06(r0)
            goto L78
        L94:
            float r7 = java.lang.Math.signum(r6)
            float r7 = r7 * r16
            float r7 = r7 - r6
            goto L5f
        L9c:
            r5 = 0
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131405wV.A05(float, float, float, float, float):float");
    }
}
