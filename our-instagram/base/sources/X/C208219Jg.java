package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.9Jg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208219Jg {
    public C131795xF A00;
    public C131795xF A01;
    public Float A02;
    public Integer A03;

    public final int[] A03(View view, AbstractC70663Fe abstractC70663Fe) {
        int[] iArr = new int[2];
        if (abstractC70663Fe.A1X()) {
            C131795xF c131795xF = this.A00;
            if (c131795xF == null || c131795xF.A01 != abstractC70663Fe) {
                c131795xF = new C131795xF(new C70773Fp(abstractC70663Fe), abstractC70663Fe);
                this.A00 = c131795xF;
            }
            AbstractC70763Fo abstractC70763Fo = c131795xF.A00;
            iArr[0] = A00(view, abstractC70763Fo) - A01(abstractC70763Fo, abstractC70663Fe);
        } else {
            iArr[0] = 0;
        }
        if (abstractC70663Fe.A1Y()) {
            C131795xF c131795xF2 = this.A01;
            if (c131795xF2 == null || c131795xF2.A01 != abstractC70663Fe) {
                c131795xF2 = new C131795xF(new C3H6(abstractC70663Fe), abstractC70663Fe);
                this.A01 = c131795xF2;
            }
            AbstractC70763Fo abstractC70763Fo2 = c131795xF2.A00;
            iArr[1] = A00(view, abstractC70763Fo2) - A01(abstractC70763Fo2, abstractC70663Fe);
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    private int A00(View view, AbstractC70763Fo abstractC70763Fo) {
        Integer num = this.A03;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    return abstractC70763Fo.A08(view);
                }
                throw AbstractC167007dF.A0c("Invalid gravity :", VSJ.A00(num));
            }
            return abstractC70763Fo.A0D(view) + (abstractC70763Fo.A0B(view) / 2);
        }
        return abstractC70763Fo.A0D(view);
    }

    private int A01(AbstractC70763Fo abstractC70763Fo, AbstractC70663Fe abstractC70663Fe) {
        int i;
        Integer num = this.A03;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    RecyclerView recyclerView = abstractC70663Fe.A07;
                    if (recyclerView != null && recyclerView.A0O) {
                        return abstractC70763Fo.A03();
                    }
                    return abstractC70763Fo.A02();
                }
                throw AbstractC167007dF.A0c("Invalid gravity :", VSJ.A00(num));
            }
            RecyclerView recyclerView2 = abstractC70663Fe.A07;
            if (recyclerView2 != null && recyclerView2.A0O) {
                i = abstractC70763Fo.A06();
            } else {
                i = 0;
            }
            return i + (abstractC70763Fo.A07() / 2);
        }
        Float f = this.A02;
        RecyclerView recyclerView3 = abstractC70663Fe.A07;
        if (recyclerView3 != null && recyclerView3.A0O) {
            return abstractC70763Fo.A06() + Math.round(f.floatValue());
        }
        return 0;
    }

    public final View A02(AbstractC70663Fe abstractC70663Fe) {
        C131795xF c131795xF;
        if (abstractC70663Fe.A1X()) {
            c131795xF = this.A00;
            if (c131795xF == null || c131795xF.A01 != abstractC70663Fe) {
                c131795xF = new C131795xF(new C70773Fp(abstractC70663Fe), abstractC70663Fe);
                this.A00 = c131795xF;
            }
        } else {
            c131795xF = this.A01;
            if (c131795xF == null || c131795xF.A01 != abstractC70663Fe) {
                c131795xF = new C131795xF(new C3H6(abstractC70663Fe), abstractC70663Fe);
                this.A01 = c131795xF;
            }
        }
        AbstractC70763Fo abstractC70763Fo = c131795xF.A00;
        int A0T = abstractC70663Fe.A0T();
        View view = null;
        if (A0T == 0) {
            return null;
        }
        int i = 0;
        if (this.A03 == C05F.A01 && (abstractC70663Fe instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC70663Fe;
            if (linearLayoutManager.A1c() != 0) {
                if (linearLayoutManager.A1d() == abstractC70663Fe.A0U() - 1) {
                    i = abstractC70663Fe.A0T() - 1;
                }
            }
            return abstractC70663Fe.A0e(i);
        }
        int i2 = Integer.MAX_VALUE;
        int A01 = A01(abstractC70763Fo, abstractC70663Fe);
        while (i < A0T) {
            View A0e = abstractC70663Fe.A0e(i);
            int abs = Math.abs(A00(A0e, abstractC70763Fo) - A01);
            if (abs < i2) {
                view = A0e;
                i2 = abs;
            }
            i++;
        }
        return view;
    }
}
