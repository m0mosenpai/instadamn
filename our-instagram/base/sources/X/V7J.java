package X;

import android.content.Context;
import android.graphics.PointF;
import android.text.Spannable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class V7J extends V7K {
    public int A00;
    public int A01;
    public final Integer A02;
    public final EnumC194908jr A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final List A09;
    public final List A0A;
    public final List A0B;
    public final List A0C;
    public final List A0D;
    public final List A0E;
    public final List A0F;

    public static final C69107Vhx A03(V7J v7j, float f) {
        Float f2;
        Float f3;
        float f4;
        float f5;
        if (AbstractC167007dF.A1N((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)))) {
            return new C69107Vhx((v7j.A0b.getTextSize() / 100.0f) * 271.93234f, 0.0f, 0.0f);
        }
        List list = v7j.A0D;
        int size = list.size();
        int i = 0;
        while (true) {
            f2 = null;
            if (i < size) {
                List list2 = v7j.A0F;
                int i2 = i + 1;
                if (f < V7K.A05(list2, i2)) {
                    f3 = Float.valueOf(A00((PointF) list2.get(i), (PointF) list2.get(i2), (Interpolator) list.get(i), C17s.A01(V7K.A04(list2, f, i, i2)), AbstractC167007dF.A1P(i, 1)));
                    break;
                }
                i = i2;
            } else {
                f3 = null;
                break;
            }
        }
        List list3 = v7j.A0C;
        int size2 = list3.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                break;
            }
            List list4 = v7j.A0E;
            int i4 = i3 + 1;
            if (f < V7K.A05(list4, i4)) {
                f2 = Float.valueOf(A00((PointF) list4.get(i3), (PointF) list4.get(i4), (Interpolator) list3.get(i3), C17s.A01(V7K.A04(list4, f, i3, i4)), i3 == 0));
            } else {
                i3 = i4;
            }
        }
        if (f3 != null) {
            f4 = f3.floatValue();
        } else {
            f4 = 0.0f;
        }
        if (f2 != null) {
            f5 = f2.floatValue();
        } else {
            f5 = 0.0f;
        }
        return new C69107Vhx(f4, 0.0f, f5);
    }

    public static final float A00(PointF pointF, PointF pointF2, Interpolator interpolator, float f, boolean z) {
        float f2 = pointF.y;
        float interpolation = interpolator.getInterpolation(f) * Math.abs(pointF.y - pointF2.y);
        int i = 1;
        if (z) {
            i = -1;
        }
        return f2 + (interpolation * i);
    }

    public static final float A01(V7J v7j, int i, int i2, boolean z) {
        float f;
        float f2;
        if (z) {
            f = i - (v7j.A0W() - 500);
            f2 = 500.0f;
        } else {
            int i3 = i - (i2 * v7j.A01);
            if (i3 > 833) {
                i3 = 833;
            }
            f = i3;
            f2 = 833.0f;
        }
        return C17s.A01(f / f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r10 == 4) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C69107Vhx A02(X.V7J r13, float r14) {
        /*
            r6 = 1065353216(0x3f800000, float:1.0)
            r8 = 1
            r9 = 0
            int r0 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            boolean r0 = X.AbstractC167007dF.A1N(r0)
            r5 = 0
            if (r0 == 0) goto L13
            X.Vhx r1 = new X.Vhx
            r1.<init>(r5, r5, r6)
            return r1
        L13:
            java.util.List r4 = r13.A08
            int r3 = r4.size()
            r10 = 0
        L1a:
            r12 = 0
            if (r10 >= r3) goto Led
            java.util.List r2 = r13.A0B
            int r1 = r10 + 1
            float r0 = X.V7K.A05(r2, r1)
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lea
            java.lang.Object r7 = r4.get(r10)
            android.view.animation.Interpolator r7 = (android.view.animation.Interpolator) r7
            float r0 = X.V7K.A04(r2, r14, r10, r1)
            float r4 = X.C17s.A02(r0, r5, r6)
            java.lang.Object r3 = r2.get(r10)
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            java.lang.Object r2 = r2.get(r1)
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            if (r10 == 0) goto L4c
            r0 = 2
            if (r10 == r0) goto L4c
            r1 = 4
            r0 = 0
            if (r10 != r1) goto L4d
        L4c:
            r0 = 1
        L4d:
            float r0 = A00(r3, r2, r7, r4, r0)
            java.lang.Float r11 = java.lang.Float.valueOf(r0)
        L55:
            java.util.List r3 = r13.A07
            int r2 = r3.size()
            r7 = 0
        L5c:
            if (r7 >= r2) goto Le8
            java.util.List r10 = r13.A0A
            int r1 = r7 + 1
            float r0 = X.V7K.A05(r10, r1)
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 >= 0) goto Le5
            java.lang.Object r4 = r3.get(r7)
            android.view.animation.Interpolator r4 = (android.view.animation.Interpolator) r4
            float r0 = X.V7K.A04(r10, r14, r7, r1)
            float r3 = X.C17s.A02(r0, r5, r6)
            java.lang.Object r2 = r10.get(r7)
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            java.lang.Object r1 = r10.get(r1)
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            if (r7 == 0) goto L8a
            r0 = 3
            if (r7 == r0) goto L8a
            r8 = 0
        L8a:
            float r0 = A00(r2, r1, r4, r3, r8)
            java.lang.Float r8 = java.lang.Float.valueOf(r0)
        L92:
            java.util.List r7 = r13.A09
            int r2 = r7.size()
        L98:
            if (r9 >= r2) goto Lc9
            int r1 = r9 + 1
            float r0 = X.V7K.A05(r7, r1)
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 >= 0) goto Le3
            java.util.List r0 = r13.A06
            java.lang.Object r4 = r0.get(r9)
            android.view.animation.Interpolator r4 = (android.view.animation.Interpolator) r4
            float r0 = X.V7K.A04(r7, r14, r9, r1)
            float r3 = X.C17s.A02(r0, r5, r6)
            java.lang.Object r2 = r7.get(r9)
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            java.lang.Object r1 = r7.get(r1)
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            r0 = 0
            float r0 = A00(r2, r1, r4, r3, r0)
            java.lang.Float r12 = java.lang.Float.valueOf(r0)
        Lc9:
            if (r11 == 0) goto Le1
            float r0 = r11.floatValue()
        Lcf:
            if (r8 == 0) goto Ld5
            float r5 = r8.floatValue()
        Ld5:
            if (r12 == 0) goto Ldb
            float r6 = r12.floatValue()
        Ldb:
            X.Vhx r1 = new X.Vhx
            r1.<init>(r0, r5, r6)
            return r1
        Le1:
            r0 = 0
            goto Lcf
        Le3:
            r9 = r1
            goto L98
        Le5:
            r7 = r1
            goto L5c
        Le8:
            r8 = r12
            goto L92
        Lea:
            r10 = r1
            goto L1a
        Led:
            r11 = r12
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V7J.A02(X.V7J, float):X.Vhx");
    }

    @Override // X.AbstractC202988yG
    public final float A0V() {
        return (this.A0b.getTextSize() / 100.0f) * 271.93234f;
    }

    @Override // X.AbstractC202988yG
    public final EnumC194908jr A0X() {
        return this.A03;
    }

    public V7J(Context context, int i) {
        super(context, i);
        this.A04 = AbstractC16960so.A1Q(new PointF(0.0f, 271.93234f), new PointF(0.36f, -68.81766f), new PointF(0.52f, -22.84913f), new PointF(0.68f, -24.24998f), new PointF(0.8f, 0.15086931f), new PointF(0.92f, -4.8491306f), new PointF(1.0f, 0.0f));
        this.A0B = new ArrayList();
        this.A0A = AbstractC16960so.A1Q(new PointF(0.0f, 0.0f), new PointF(0.36f, -15.0f), new PointF(0.52f, -13.0f), new PointF(0.8f, 3.0f), new PointF(0.92f, -1.0f), new PointF(1.0f, 0.0f));
        this.A09 = AbstractC16960so.A1Q(new PointF(0.0f, 0.0f), new PointF(0.08f, 1.0f));
        this.A05 = AbstractC16960so.A1Q(new PointF(0.0f, 0.0f), new PointF(0.25f, 12.0f), new PointF(0.6666667f, -48.305f), new PointF(1.0f, 271.93234f));
        this.A0F = new ArrayList();
        this.A0E = AbstractC16960so.A1Q(new PointF(0.8f, 1.0f), new PointF(0.90000004f, 0.0f));
        this.A08 = AbstractC16960so.A1Q(new PathInterpolator(0.16666667f, 0.16666667f, 0.0f, 1.0f), new PathInterpolator(0.6321822f, 0.0f, 0.8333333f, 0.8333333f), new PathInterpolator(0.16666667f, 0.16666667f, 0.5179956f, 7.044134f), new PathInterpolator(0.5739865f, 0.09556677f, 0.8333333f, 0.8333333f), new PathInterpolator(0.16666667f, 0.16666667f, 0.6882737f, 1.0f), new PathInterpolator(0.33893362f, 0.0f, 0.8333333f, 0.8333333f));
        this.A07 = AbstractC16960so.A1Q(new PathInterpolator(0.16666667f, 0.16666667f, 0.0f, 1.0f), new PathInterpolator(1.0f, 0.0f, 0.8333333f, 0.8333333f), new LinearInterpolator(), new PathInterpolator(0.16666667f, 0.16666667f, 0.8333333f, 1.0f), new PathInterpolator(0.16666667f, 0.0f, 0.8333333f, 0.8333333f));
        this.A06 = AbstractC166987dD.A1J(new LinearInterpolator());
        this.A0D = AbstractC16960so.A1Q(new PathInterpolator(0.33333334f, 0.0f, 0.6666667f, 1.0f), new PathInterpolator(0.33333334f, 0.0f, 0.5207011f, 1.0f), new PathInterpolator(0.6054595f, 0.0f, 0.8333333f, 0.8333333f));
        this.A0C = AbstractC166987dD.A1J(new LinearInterpolator());
        this.A01 = 144;
        this.A02 = C05F.A01;
        this.A03 = EnumC194908jr.A07;
    }

    @Override // X.V7K, X.C6RB
    public final void A0R() {
        super.A0R();
        Spannable spannable = super.A0F;
        if (spannable != null && spannable.length() != 0) {
            float textSize = this.A0b.getTextSize() / 100.0f;
            List list = this.A0B;
            list.clear();
            for (PointF pointF : this.A04) {
                list.add(new PointF(pointF.x, pointF.y * textSize));
            }
            List list2 = this.A0F;
            list2.clear();
            for (PointF pointF2 : this.A05) {
                list2.add(new PointF(pointF2.x, pointF2.y * textSize));
            }
            int i = ((V7K) this).A02 - 10;
            if (i < 1) {
                i = 1;
            }
            this.A01 = (104 / i) + 40;
        }
    }
}
