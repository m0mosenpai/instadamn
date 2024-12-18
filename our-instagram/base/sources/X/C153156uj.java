package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.6uj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153156uj extends C1I4 {
    public XDO A00;
    public InterfaceC153186um A01;
    public XAr A02;
    public Integer A03;
    public Integer A04;
    public boolean A05;
    public int A06;
    public int A07;
    public boolean A08;
    public final int A09;
    public final AbstractC70663Fe A0A;
    public final InterfaceC62612t0 A0B;
    public final boolean A0C;
    public final Runnable A0D;
    public final boolean A0E;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C153156uj(AbstractC70663Fe abstractC70663Fe, InterfaceC62612t0 interfaceC62612t0, C153146ui c153146ui) {
        this(abstractC70663Fe, interfaceC62612t0, c153146ui, false, false);
        C14360o3.A0B(interfaceC62612t0, 1);
        C14360o3.A0B(c153146ui, 2);
    }

    private final int A00(RecyclerView recyclerView) {
        if (this.A0E && recyclerView.getChildCount() > 0) {
            int[] iArr = new int[2];
            for (int childCount = recyclerView.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = recyclerView.getChildAt(childCount);
                childAt.getLocationOnScreen(iArr);
                int i = iArr[1];
                Context context = childAt.getContext();
                C14360o3.A07(context);
                int i2 = this.A09;
                if (i2 < 0) {
                    i2 = AbstractC13880nE.A09(context);
                }
                if (i < i2) {
                    return RecyclerView.A02(childAt);
                }
            }
            return -1;
        }
        return AbstractC72193Ls.A02(this.A0A);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(androidx.recyclerview.widget.RecyclerView r7, X.C153156uj r8, int r9, boolean r10) {
        /*
            r0 = 1841511242(0x6dc33b4a, float:7.5526566E27)
            int r2 = X.C0f9.A03(r0)
            boolean r0 = r8.A08
            if (r0 != 0) goto L14
            if (r10 != 0) goto L14
            r0 = -677101705(0xffffffffd7a43f77, float:-3.6118497E14)
        L10:
            X.C0f9.A0A(r0, r2)
            return
        L14:
            boolean r0 = r8.A05
            if (r0 == 0) goto L79
            X.3Fe r3 = r8.A0A
            if (r3 == 0) goto L79
            boolean r0 = r3.A0B
            if (r0 == 0) goto L79
            if (r9 != 0) goto L26
            boolean r0 = r8.A0C
            if (r0 != 0) goto L79
        L26:
            java.lang.Integer r1 = r8.A03
            r0 = r1
            if (r9 == 0) goto L2f
            if (r9 <= 0) goto Lc1
            java.lang.Integer r0 = X.C05F.A01
        L2f:
            if (r0 != r1) goto L79
            r4 = 0
            java.lang.Integer r0 = r8.A04
            int r0 = r0.intValue()
            r1 = 1
            if (r0 == r1) goto L7d
            if (r0 != r4) goto Lc5
            int r5 = r3.A0U()
            if (r5 == 0) goto L5b
            int r0 = r8.A00(r7)
            if (r0 <= 0) goto L5b
            int r5 = r5 - r0
            int r5 = r5 - r1
            X.6um r0 = r8.A01
            int r0 = r0.Bkn()
        L51:
            if (r5 > r0) goto L5b
            java.lang.Runnable r0 = r8.A0D
            r7.removeCallbacks(r0)
            r7.post(r0)
        L5b:
            int r1 = r3.A0U()
            if (r1 <= 0) goto L79
            X.XAr r0 = r8.A02
            if (r0 == 0) goto L79
            int r0 = r8.A00(r7)
            int r1 = r1 - r0
            int r1 = r1 + (-1)
            int r0 = r8.A06
            if (r0 == r1) goto L79
            r8.A06 = r1
            X.XAr r0 = r8.A02
            if (r0 == 0) goto L79
            r0.DBA(r1)
        L79:
            r0 = 700863270(0x29c65326, float:8.80739E-14)
            goto L10
        L7d:
            android.content.Context r6 = r7.getContext()
            if (r6 == 0) goto L5b
            boolean r0 = r3 instanceof com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager
            if (r0 == 0) goto Lcb
            r4 = r3
            com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager r4 = (com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager) r4
            X.Tzy r0 = r4.A06
            java.util.List r1 = r0.A07
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb2
            r5 = 0
        L95:
            android.graphics.Rect r0 = r4.A05
            int r4 = r0.bottom
            X.6um r0 = r8.A01
            int r0 = r0.Bkn()
            float r1 = (float) r0
            android.content.res.Resources r0 = r6.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 / r0
            int r0 = (int) r1
            if (r5 <= 0) goto L5b
            if (r4 <= 0) goto L5b
            int r5 = r5 - r4
            goto L51
        Lb2:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r0 = r1.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            int r5 = r0.bottom
            goto L95
        Lc1:
            java.lang.Integer r0 = X.C05F.A00
            goto L2f
        Lc5:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        Lcb:
            java.lang.IllegalArgumentException r0 = X.AbstractC72193Ls.A04(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153156uj.A01(androidx.recyclerview.widget.RecyclerView, X.6uj, int, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r10 == 2) goto L6;
     */
    @Override // X.C1I4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r9, int r10) {
        /*
            r8 = this;
            r0 = 277087555(0x10840543, float:5.2072927E-29)
            int r6 = X.C0f9.A03(r0)
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            r0 = 1
            if (r10 == r0) goto L12
            r0 = 2
            r2 = 0
            if (r10 != r0) goto L13
        L12:
            r2 = 1
        L13:
            X.3Fe r1 = r8.A0A
            if (r1 == 0) goto L2d
            int r0 = r1.A0U()
            if (r0 <= 0) goto L2d
            boolean r0 = r8.A08
            if (r0 != 0) goto L2d
            if (r2 == 0) goto L2d
            X.XAr r0 = r8.A02
            if (r0 == 0) goto L2d
            r1.A0U()
            r8.A00(r9)
        L2d:
            r8.A08 = r2
            if (r10 != 0) goto L64
            int r7 = r8.A00(r9)
            int r0 = r9.getScrollState()
            int r1 = r8.A07
            X.XDO r5 = r8.A00
            if (r5 == 0) goto L64
            if (r0 != 0) goto L64
            boolean r0 = r5.CZL()
            if (r0 == 0) goto L64
            int r0 = r7 - r1
            long r3 = (long) r0
            long r1 = r5.BUA()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L64
            boolean r0 = r5.CPJ()
            r0 = r0 ^ 1
            if (r0 == 0) goto L64
            r8.A07 = r7
            java.lang.Runnable r0 = r8.A0D
            r9.removeCallbacks(r0)
            r9.post(r0)
        L64:
            r0 = -565222125(0xffffffffde4f6513, float:-3.736093E18)
            X.C0f9.A0A(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153156uj.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = C0f9.A03(-1928496376);
        C14360o3.A0B(recyclerView, 0);
        A01(recyclerView, this, i2, false);
        C0f9.A0A(346615467, A03);
    }

    public C153156uj(AbstractC70663Fe abstractC70663Fe, InterfaceC62612t0 interfaceC62612t0, C153146ui c153146ui, boolean z, boolean z2) {
        C14360o3.A0B(interfaceC62612t0, 1);
        C14360o3.A0B(c153146ui, 2);
        this.A0B = interfaceC62612t0;
        this.A0A = abstractC70663Fe;
        this.A0C = z;
        this.A0E = z2;
        this.A0D = new Runnable() { // from class: X.6uk
            @Override // java.lang.Runnable
            public final void run() {
                C153156uj.this.A0B.AD4();
            }
        };
        this.A04 = c153146ui.A02;
        this.A03 = c153146ui.A01;
        this.A01 = new C153176ul(this, c153146ui.A00);
        this.A06 = -1;
        this.A09 = -1;
        this.A05 = true;
    }
}
