package X;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.9V9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9V9 extends AbstractC61802rh {
    public AbstractC70763Fo A00;
    public AbstractC70763Fo A01;
    public AbstractC70663Fe A02;
    public AbstractC70663Fe A03;
    public RecyclerView A04;
    public final int A05 = 1;
    public final int A06;

    public C9V9(int i) {
        this.A06 = i;
    }

    @Override // X.AbstractC61802rh
    public final int[] A09(View view, AbstractC70663Fe abstractC70663Fe) {
        int[] iArr = new int[2];
        if (abstractC70663Fe.A1X()) {
            AbstractC70763Fo abstractC70763Fo = this.A00;
            if (abstractC70763Fo == null || this.A02 != abstractC70663Fe) {
                abstractC70763Fo = new C70773Fp(abstractC70663Fe);
                this.A00 = abstractC70763Fo;
                this.A02 = abstractC70663Fe;
            }
            iArr[0] = (abstractC70763Fo.A0D(view) - abstractC70763Fo.A06()) - this.A06;
        } else {
            iArr[0] = 0;
        }
        if (abstractC70663Fe.A1Y()) {
            AbstractC70763Fo abstractC70763Fo2 = this.A01;
            if (abstractC70763Fo2 == null || this.A03 != abstractC70663Fe) {
                abstractC70763Fo2 = new C3H6(abstractC70663Fe);
                this.A01 = abstractC70763Fo2;
                this.A03 = abstractC70663Fe;
            }
            iArr[1] = (abstractC70763Fo2.A0D(view) - abstractC70763Fo2.A06()) - this.A06;
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // X.AbstractC61802rh
    public final C110814yt A04(AbstractC70663Fe abstractC70663Fe) {
        if (!(abstractC70663Fe instanceof InterfaceC70673Ff)) {
            return null;
        }
        return new C65883Tvn(this.A04.getContext(), this, 0);
    }

    @Override // X.AbstractC61802rh
    public final void A07(RecyclerView recyclerView) {
        this.A04 = recyclerView;
        super.A07(recyclerView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC61802rh
    public final int A02(AbstractC70663Fe abstractC70663Fe, int i, int i2) {
        AbstractC70763Fo abstractC70763Fo;
        int A0C;
        boolean z;
        boolean z2;
        int i3;
        PointF AIz;
        int A0U = abstractC70663Fe.A0U();
        if (A0U != 0) {
            boolean A1X = abstractC70663Fe.A1X();
            if (A1X) {
                abstractC70763Fo = this.A00;
                if (abstractC70763Fo == null || this.A02 != abstractC70663Fe) {
                    abstractC70763Fo = new C70773Fp(abstractC70663Fe);
                    this.A00 = abstractC70763Fo;
                    this.A02 = abstractC70663Fe;
                }
            } else {
                abstractC70763Fo = this.A01;
                if (abstractC70763Fo == null || this.A03 != abstractC70663Fe) {
                    abstractC70763Fo = new C3H6(abstractC70663Fe);
                    this.A01 = abstractC70763Fo;
                    this.A03 = abstractC70663Fe;
                }
            }
            int A0T = abstractC70663Fe.A0T();
            View view = null;
            if (A0T != 0) {
                int A06 = abstractC70763Fo.A06();
                int i4 = Integer.MAX_VALUE;
                for (int i5 = 0; i5 < A0T; i5++) {
                    View A0e = abstractC70663Fe.A0e(i5);
                    int A0D = abstractC70763Fo.A0D(A0e);
                    int abs = Math.abs(A0D - A06);
                    if (A0D < A06 && abs < i4) {
                        view = A0e;
                        i4 = abs;
                    }
                }
                if (view != null && (A0C = AbstractC70663Fe.A0C(view)) != -1) {
                    int i6 = 0;
                    if (!A1X ? i2 > 0 : i > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((abstractC70663Fe instanceof InterfaceC70673Ff) && (AIz = ((InterfaceC70673Ff) abstractC70663Fe).AIz(A0U - 1)) != null && (AIz.x < 0.0f || AIz.y < 0.0f)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        if (abstractC70663Fe instanceof GridLayoutManager) {
                            int i7 = ((GridLayoutManager) abstractC70663Fe).A00;
                            if (z2) {
                                i3 = (A0C - i7) / this.A05;
                            } else {
                                i3 = (A0C + i7) * this.A05;
                            }
                        } else {
                            int i8 = this.A05;
                            i3 = A0C + i8;
                            if (z2) {
                                i3 = A0C - i8;
                            }
                        }
                        A0C = i3;
                    }
                    if (A0C >= 0) {
                        i6 = A0C;
                    }
                    if (i6 >= A0U) {
                        return A0U - 1;
                    }
                    return i6;
                }
            }
        }
        return -1;
    }

    @Override // X.AbstractC61802rh
    public final View A03(AbstractC70663Fe abstractC70663Fe) {
        AbstractC70763Fo abstractC70763Fo;
        if (abstractC70663Fe.A1Y()) {
            abstractC70763Fo = this.A01;
            if (abstractC70763Fo == null || this.A03 != abstractC70663Fe) {
                abstractC70763Fo = new C3H6(abstractC70663Fe);
                this.A01 = abstractC70763Fo;
                this.A03 = abstractC70663Fe;
            }
        } else if (abstractC70663Fe.A1X()) {
            abstractC70763Fo = this.A00;
            if (abstractC70763Fo == null || this.A02 != abstractC70663Fe) {
                abstractC70763Fo = new C70773Fp(abstractC70663Fe);
                this.A00 = abstractC70763Fo;
                this.A02 = abstractC70663Fe;
            }
        } else {
            return null;
        }
        int A0T = abstractC70663Fe.A0T();
        View view = null;
        if (A0T == 0) {
            return null;
        }
        int A06 = abstractC70763Fo.A06();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < A0T; i2++) {
            View A0e = abstractC70663Fe.A0e(i2);
            int abs = Math.abs(abstractC70763Fo.A0D(A0e) - A06);
            if (abs < i) {
                view = A0e;
                i = abs;
            }
        }
        return view;
    }
}
