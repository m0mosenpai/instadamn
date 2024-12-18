package X;

import android.graphics.PointF;
import android.view.View;

/* renamed from: X.7ht, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC169797ht {
    public static AbstractC61802rh A00(int i, int i2) {
        if (i != -1) {
            if (i != Integer.MAX_VALUE) {
                switch (i) {
                    case 2147483645:
                        return new C80V() { // from class: X.9UF
                            public final int A00 = Integer.MAX_VALUE;

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // X.C80V, X.AbstractC61802rh
                            public final int A02(AbstractC70663Fe abstractC70663Fe, int i3, int i4) {
                                int A0U;
                                View A03;
                                int A0C;
                                int i5;
                                PointF AIz;
                                int i6;
                                int i7;
                                if ((abstractC70663Fe instanceof InterfaceC70673Ff) && (A0U = abstractC70663Fe.A0U()) != 0 && (A03 = A03(abstractC70663Fe)) != null && (A0C = AbstractC70663Fe.A0C(A03)) != -1 && (AIz = ((InterfaceC70673Ff) abstractC70663Fe).AIz(A0U - 1)) != null) {
                                    int i8 = 0;
                                    if (abstractC70663Fe.A1X()) {
                                        i6 = A00(new C70773Fp(abstractC70663Fe), abstractC70663Fe, i3, 0);
                                        int i9 = this.A00;
                                        if (i6 > i9) {
                                            i6 = i9;
                                        }
                                        int i10 = -i9;
                                        if (i6 < i10) {
                                            i6 = i10;
                                        }
                                        if (AIz.x < 0.0f) {
                                            i6 = -i6;
                                        }
                                    } else {
                                        i6 = 0;
                                    }
                                    if (abstractC70663Fe.A1Y()) {
                                        i7 = A00(new C3H6(abstractC70663Fe), abstractC70663Fe, 0, i4);
                                        if (AIz.y < 0.0f) {
                                            i7 = -i7;
                                        }
                                    } else {
                                        i7 = 0;
                                    }
                                    if (abstractC70663Fe.A1Y()) {
                                        i6 = i7;
                                    }
                                    if (i6 != 0) {
                                        int i11 = A0C + i6;
                                        if (i11 >= 0) {
                                            i8 = i11;
                                        }
                                        if (i8 < A0U) {
                                            return i8;
                                        }
                                        return i5;
                                    }
                                }
                                return -1;
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
                                throw new UnsupportedOperationException("Method not decompiled: X.C9UF.A00(X.3Fo, X.3Fe, int, int):int");
                            }
                        };
                    case 2147483646:
                        return new AbstractC61802rh();
                    default:
                        return null;
                }
            }
            return new AbstractC61802rh();
        }
        return new C9V9(i2);
    }
}
