package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.LeA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48573LeA implements InterfaceC43071ya {
    public final RecyclerView A00;
    public final M9u A01;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
        if (A01 != 0) {
            if (A01 != 2) {
                if (interfaceC57162jr.CGk(c59062n7) <= 0.9f) {
                    return;
                }
            } else {
                Object obj = c59062n7.A03;
                C14360o3.A06(obj);
                A00((C45205Jzl) obj, false);
                return;
            }
        }
        Object obj2 = c59062n7.A03;
        C14360o3.A06(obj2);
        A00((C45205Jzl) obj2, A1R);
    }

    private final void A00(C45205Jzl c45205Jzl, boolean z) {
        C66362zD c66362zD;
        int A03;
        View childAt;
        C44764Jrl c44764Jrl;
        C44201Jg4 c44201Jg4;
        M9u m9u;
        int i;
        RecyclerView recyclerView = this.A00;
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if (abstractC70663Fe != null) {
            C2UU c2uu = recyclerView.A0A;
            if ((c2uu instanceof C66362zD) && (c66362zD = (C66362zD) c2uu) != null && (A03 = AbstractC72193Ls.A03(abstractC70663Fe, recyclerView, c66362zD.A02(c45205Jzl.A02.A0B))) != -1 && (childAt = recyclerView.getChildAt(A03)) != null) {
                Object tag = childAt.getTag();
                if ((tag instanceof C44764Jrl) && (c44764Jrl = (C44764Jrl) tag) != null && (c44201Jg4 = c44764Jrl.A00) != null) {
                    if (z && c44201Jg4.AkZ()) {
                        m9u = this.A01;
                        i = 21;
                    } else {
                        if (!c44201Jg4.AkZ()) {
                            return;
                        }
                        m9u = this.A01;
                        i = 22;
                    }
                    M9u.A00(new ME1(i, c44201Jg4, m9u));
                }
            }
        }
    }

    public C48573LeA(RecyclerView recyclerView, M9u m9u) {
        this.A01 = m9u;
        this.A00 = recyclerView;
    }
}
