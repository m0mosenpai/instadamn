package X;

import android.graphics.PointF;
import android.view.View;

/* renamed from: X.2rg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C61792rg extends AbstractC61802rh {
    public AbstractC70763Fo A00;
    public AbstractC70763Fo A01;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC61802rh
    public int A02(AbstractC70663Fe abstractC70663Fe, int i, int i2) {
        AbstractC70763Fo abstractC70763Fo;
        PointF AIz;
        int A0U = abstractC70663Fe.A0U();
        if (A0U != 0) {
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
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int A0T = abstractC70663Fe.A0T();
            View view = null;
            View view2 = null;
            for (int i5 = 0; i5 < A0T; i5++) {
                View A0e = abstractC70663Fe.A0e(i5);
                if (A0e != null) {
                    int A0D = (abstractC70763Fo.A0D(A0e) + (abstractC70763Fo.A0B(A0e) / 2)) - (abstractC70763Fo.A06() + (abstractC70763Fo.A07() / 2));
                    if (A0D <= 0) {
                        if (A0D > i3) {
                            view2 = A0e;
                            i3 = A0D;
                        }
                        if (A0D < 0) {
                        }
                    }
                    if (A0D < i4) {
                        view = A0e;
                        i4 = A0D;
                    }
                }
            }
            boolean z = true;
            if (!abstractC70663Fe.A1X() ? i2 <= 0 : i <= 0) {
                z = false;
            }
            if (z) {
                if (view != null) {
                    return AbstractC70663Fe.A0C(view);
                }
                view = view2;
            } else if (view2 != null) {
                return AbstractC70663Fe.A0C(view2);
            }
            if (view != null) {
                int A0C = AbstractC70663Fe.A0C(view);
                int A0U2 = abstractC70663Fe.A0U();
                boolean z2 = false;
                if ((abstractC70663Fe instanceof InterfaceC70673Ff) && (AIz = ((InterfaceC70673Ff) abstractC70663Fe).AIz(A0U2 - 1)) != null && (AIz.x < 0.0f || AIz.y < 0.0f)) {
                    z2 = true;
                }
                int i6 = 1;
                if (z2 == z) {
                    i6 = -1;
                }
                int i7 = A0C + i6;
                if (i7 >= 0 && i7 < A0U) {
                    return i7;
                }
            }
        }
        return -1;
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
