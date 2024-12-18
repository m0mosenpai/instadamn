package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.direct.fragment.stickertray.hscroll.tabs.IgdExpressionTrayHscrollLayout;
import java.util.List;

/* loaded from: classes8.dex */
public final class JoP extends C1I4 {
    public boolean A00;
    public final LinearLayoutManager A01;
    public final IgdExpressionTrayHscrollLayout A02;
    public final List A03;

    public JoP(LinearLayoutManager linearLayoutManager, IgdExpressionTrayHscrollLayout igdExpressionTrayHscrollLayout, List list) {
        C14360o3.A0B(linearLayoutManager, 1);
        this.A01 = linearLayoutManager;
        this.A02 = igdExpressionTrayHscrollLayout;
        this.A03 = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r4 != 1) goto L6;
     */
    @Override // X.C1I4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r3, int r4) {
        /*
            r2 = this;
            r0 = 1801831801(0x6b65c579, float:2.7777655E26)
            int r1 = X.C0f9.A03(r0)
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            super.onScrollStateChanged(r3, r4)
            if (r4 == 0) goto L1a
            r0 = 1
            if (r4 == r0) goto L1a
        L13:
            r0 = -1971605664(0xffffffff8a7baf60, float:-1.2118195E-32)
            X.C0f9.A0A(r0, r1)
            return
        L1a:
            r2.A00 = r0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JoP.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A0N = AbstractC167017dG.A0N(recyclerView, 824584562);
        super.onScrolled(recyclerView, i, i2);
        int A1a = this.A01.A1a();
        int i3 = 0;
        int i4 = 0;
        for (Object obj : this.A03) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            if (A1a >= ((C51753Mtc) obj).A01) {
                i4 = i3;
            }
            i3 = i5;
        }
        if (this.A00) {
            this.A02.setSelectedIndex(i4);
        }
        C0f9.A0A(654350060, A0N);
    }
}
