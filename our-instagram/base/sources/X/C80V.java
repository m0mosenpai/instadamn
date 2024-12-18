package X;

import android.graphics.PointF;
import android.view.View;

/* renamed from: X.80V, reason: invalid class name */
/* loaded from: classes4.dex */
public class C80V extends AbstractC61802rh {
    public AbstractC70763Fo A00;
    public AbstractC70763Fo A01;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC61802rh
    public int A02(AbstractC70663Fe abstractC70663Fe, int i, int i2) {
        int A0U;
        View A03;
        int A0C;
        int i3;
        PointF AIz;
        int i4;
        int i5;
        if ((abstractC70663Fe instanceof InterfaceC70673Ff) && (A0U = abstractC70663Fe.A0U()) != 0 && (A03 = A03(abstractC70663Fe)) != null && (A0C = AbstractC70663Fe.A0C(A03)) != -1 && (AIz = ((InterfaceC70673Ff) abstractC70663Fe).AIz(A0U - 1)) != null) {
            int i6 = 0;
            if (abstractC70663Fe.A1X()) {
                AbstractC70763Fo abstractC70763Fo = this.A00;
                if (abstractC70763Fo == null || abstractC70763Fo.A02 != abstractC70663Fe) {
                    abstractC70763Fo = new C70773Fp(abstractC70663Fe);
                    this.A00 = abstractC70763Fo;
                }
                i4 = A00(abstractC70763Fo, abstractC70663Fe, i, 0);
                if (AIz.x < 0.0f) {
                    i4 = -i4;
                }
            } else {
                i4 = 0;
            }
            if (abstractC70663Fe.A1Y()) {
                AbstractC70763Fo abstractC70763Fo2 = this.A01;
                if (abstractC70763Fo2 == null || abstractC70763Fo2.A02 != abstractC70663Fe) {
                    abstractC70763Fo2 = new C3H6(abstractC70663Fe);
                    this.A01 = abstractC70763Fo2;
                }
                i5 = A00(abstractC70763Fo2, abstractC70663Fe, 0, i2);
                if (AIz.y < 0.0f) {
                    i5 = -i5;
                }
            } else {
                i5 = 0;
            }
            if (abstractC70663Fe.A1Y()) {
                i4 = i5;
            }
            if (i4 != 0) {
                int i7 = A0C + i4;
                if (i7 >= 0) {
                    i6 = i7;
                }
                if (i6 < A0U) {
                    return i6;
                }
                return i3;
            }
        }
        return -1;
    }

    @Override // X.AbstractC61802rh
    public final int[] A09(View view, AbstractC70663Fe abstractC70663Fe) {
        if (this instanceof C203038yL) {
            return ((C203038yL) this).A00.A03(view, abstractC70663Fe);
        }
        int[] iArr = new int[2];
        if (abstractC70663Fe.A1X()) {
            AbstractC70763Fo abstractC70763Fo = this.A00;
            if (abstractC70763Fo == null || abstractC70763Fo.A02 != abstractC70663Fe) {
                abstractC70763Fo = new C70773Fp(abstractC70663Fe);
                this.A00 = abstractC70763Fo;
            }
            iArr[0] = (abstractC70763Fo.A0D(view) + (abstractC70763Fo.A0B(view) / 2)) - (abstractC70763Fo.A06() + (abstractC70763Fo.A07() / 2));
        } else {
            iArr[0] = 0;
        }
        if (abstractC70663Fe.A1Y()) {
            AbstractC70763Fo abstractC70763Fo2 = this.A01;
            if (abstractC70763Fo2 == null || abstractC70763Fo2.A02 != abstractC70663Fe) {
                abstractC70763Fo2 = new C3H6(abstractC70663Fe);
                this.A01 = abstractC70763Fo2;
            }
            iArr[1] = (abstractC70763Fo2.A0D(view) + (abstractC70763Fo2.A0B(view) / 2)) - (abstractC70763Fo2.A06() + (abstractC70763Fo2.A07() / 2));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A00(X.AbstractC70763Fo r12, X.AbstractC70663Fe r13, int r14, int r15) {
        /*
            r11 = this;
            int[] r10 = r11.A08(r14, r15)
            int r9 = r13.A0T()
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L2c
            r7 = 0
            r6 = 0
            r4 = r6
            r5 = 2147483647(0x7fffffff, float:NaN)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L14:
            if (r7 >= r9) goto L2f
            android.view.View r2 = r13.A0e(r7)
            int r1 = X.AbstractC70663Fe.A0C(r2)
            r0 = -1
            if (r1 == r0) goto L29
            if (r1 >= r5) goto L25
            r6 = r2
            r5 = r1
        L25:
            if (r1 <= r3) goto L29
            r4 = r2
            r3 = r1
        L29:
            int r7 = r7 + 1
            goto L14
        L2c:
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L55
        L2f:
            if (r6 == 0) goto L2c
            if (r4 == 0) goto L2c
            int r1 = r12.A0D(r6)
            int r0 = r12.A0D(r4)
            int r2 = java.lang.Math.min(r1, r0)
            int r1 = r12.A08(r6)
            int r0 = r12.A08(r4)
            int r0 = java.lang.Math.max(r1, r0)
            int r0 = r0 - r2
            if (r0 == 0) goto L2c
            float r4 = (float) r0
            float r4 = r4 * r8
            int r3 = r3 - r5
            int r0 = r3 + 1
            float r0 = (float) r0
            float r4 = r4 / r0
        L55:
            r1 = 0
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L5c
            return r1
        L5c:
            r3 = r10[r1]
            int r2 = java.lang.Math.abs(r3)
            r0 = 1
            r1 = r10[r0]
            int r0 = java.lang.Math.abs(r1)
            if (r2 <= r0) goto L6c
            r1 = r3
        L6c:
            float r0 = (float) r1
            float r0 = r0 / r4
            int r0 = java.lang.Math.round(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80V.A00(X.3Fo, X.3Fe, int, int):int");
    }

    @Override // X.AbstractC61802rh
    public View A03(AbstractC70663Fe abstractC70663Fe) {
        AbstractC70763Fo abstractC70763Fo;
        if (abstractC70663Fe.A1Y()) {
            abstractC70763Fo = this.A01;
            if (abstractC70763Fo == null || abstractC70763Fo.A02 != abstractC70663Fe) {
                abstractC70763Fo = new C3H6(abstractC70663Fe);
                this.A01 = abstractC70763Fo;
            }
        } else if (abstractC70663Fe.A1X()) {
            abstractC70763Fo = this.A00;
            if (abstractC70763Fo == null || abstractC70763Fo.A02 != abstractC70663Fe) {
                abstractC70763Fo = new C70773Fp(abstractC70663Fe);
                this.A00 = abstractC70763Fo;
            }
        } else {
            return null;
        }
        int A0T = abstractC70663Fe.A0T();
        View view = null;
        if (A0T == 0) {
            return null;
        }
        int A06 = abstractC70763Fo.A06() + (abstractC70763Fo.A07() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < A0T; i2++) {
            View A0e = abstractC70663Fe.A0e(i2);
            int abs = Math.abs((abstractC70763Fo.A0D(A0e) + (abstractC70763Fo.A0B(A0e) / 2)) - A06);
            if (abs < i) {
                view = A0e;
                i = abs;
            }
        }
        return view;
    }
}
