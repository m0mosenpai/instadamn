package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* renamed from: X.GgD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37557GgD extends C1I4 {
    public int A00;
    public boolean A01;
    public boolean A02;
    public final /* synthetic */ C37556GgC A03;

    public C37557GgD(C37556GgC c37556GgC) {
        this.A03 = c37556GgC;
    }

    private final boolean A00(RecyclerView recyclerView, C120985dq c120985dq) {
        C38321qM c38321qM;
        if ((!AbstractC110854yx.A04(recyclerView) || c120985dq.A01 == EnumC129395t1.A08) && (!C14360o3.A0K(this.A03.A07.A0U, true) || (c38321qM = c120985dq.A02) == null || !c38321qM.A66())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c0, code lost:
    
        if (X.C14360o3.A0K(r1, X.AbstractC111324zv.A00(4480)) == false) goto L56;
     */
    @Override // X.C1I4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r13, int r14) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37557GgD.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = C0f9.A03(-1407845341);
        C14360o3.A0B(recyclerView, 0);
        if (!this.A01) {
            C37556GgC c37556GgC = this.A03;
            C120985dq A09 = c37556GgC.A09(c37556GgC.A03());
            if (A09 != null) {
                if (A00(recyclerView, A09)) {
                    this.A01 = true;
                    C120985dq c120985dq = c37556GgC.A01;
                    C37558GgE c37558GgE = c37556GgC.A04;
                    if (c37558GgE != null) {
                        if (A09.A01 != EnumC129395t1.A04 || c120985dq == null) {
                            c120985dq = A09;
                        }
                        Iterator it = c37558GgE.A03.iterator();
                        while (it.hasNext()) {
                            ((C38Y) it.next()).DrY(c120985dq, c37558GgE.A00);
                        }
                    }
                }
                if (A09.A02 != null) {
                    c37556GgC.A01 = A09;
                }
            }
        }
        if (this.A00 == 1 && i2 != 0) {
            this.A02 = true;
        }
        C0f9.A0A(-1449948773, A03);
    }
}
