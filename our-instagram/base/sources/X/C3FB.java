package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: X.3FB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3FB implements C3FC {
    public final /* synthetic */ RecyclerView A00;

    public C3FB(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.C3QV r6) {
        /*
            r5 = this;
            int r1 = r6.A00
            r0 = 1
            if (r1 == r0) goto L83
            r0 = 2
            if (r1 == r0) goto L77
            r4 = 4
            if (r1 == r4) goto L35
            r4 = 8
            if (r1 != r4) goto L28
            androidx.recyclerview.widget.RecyclerView r0 = r5.A00
            X.3Fe r3 = r0.A0D
            int r2 = r6.A02
            int r1 = r6.A01
            boolean r0 = r3 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 != 0) goto L66
            boolean r0 = r3 instanceof com.google.android.flexbox.FlexboxLayoutManager
            if (r0 == 0) goto L29
            com.google.android.flexbox.FlexboxLayoutManager r3 = (com.google.android.flexbox.FlexboxLayoutManager) r3
            int r0 = java.lang.Math.min(r2, r1)
            com.google.android.flexbox.FlexboxLayoutManager.A0R(r3, r0)
        L28:
            return
        L29:
            boolean r0 = r3 instanceof com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager
            if (r0 == 0) goto L5c
            com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager r3 = (com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager) r3
            X.Tzy r1 = r3.A06
            r0 = 0
            r1.A00 = r0
            return
        L35:
            androidx.recyclerview.widget.RecyclerView r0 = r5.A00
            X.3Fe r3 = r0.A0D
            int r2 = r6.A02
            int r1 = r6.A01
            boolean r0 = r3 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 != 0) goto L66
            boolean r0 = r3 instanceof com.google.android.flexbox.FlexboxLayoutManager
            if (r0 == 0) goto L50
            com.google.android.flexbox.FlexboxLayoutManager r3 = (com.google.android.flexbox.FlexboxLayoutManager) r3
            if (r3 == 0) goto L4c
            com.google.android.flexbox.FlexboxLayoutManager.A0R(r3, r2)
        L4c:
            com.google.android.flexbox.FlexboxLayoutManager.A0R(r3, r2)
            return
        L50:
            boolean r0 = r3 instanceof com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager
            if (r0 == 0) goto L5c
            com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager r3 = (com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager) r3
            X.Tzy r0 = r3.A06
            r0.A01(r2)
            return
        L5c:
            boolean r0 = r3 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r0 == 0) goto L28
            androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r3
            androidx.recyclerview.widget.StaggeredGridLayoutManager.A0K(r3, r2, r1, r4)
            return
        L66:
            androidx.recyclerview.widget.GridLayoutManager r3 = (androidx.recyclerview.widget.GridLayoutManager) r3
            X.6wP r0 = r3.A01
            android.util.SparseIntArray r0 = r0.A02
            r0.clear()
            X.6wP r0 = r3.A01
            android.util.SparseIntArray r0 = r0.A01
            r0.clear()
            return
        L77:
            androidx.recyclerview.widget.RecyclerView r3 = r5.A00
            X.3Fe r2 = r3.A0D
            int r1 = r6.A02
            int r0 = r6.A01
            r2.A1W(r3, r1, r0)
            return
        L83:
            androidx.recyclerview.widget.RecyclerView r3 = r5.A00
            X.3Fe r2 = r3.A0D
            int r1 = r6.A02
            int r0 = r6.A01
            r2.A1V(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3FB.A00(X.3QV):void");
    }

    @Override // X.C3FC
    public final void CnM(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.A00;
        C3FI c3fi = recyclerView.A08;
        int A04 = c3fi.A04();
        int i5 = i + i2;
        for (int i6 = 0; i6 < A04; i6++) {
            View A07 = c3fi.A07(i6);
            C3OO A05 = RecyclerView.A05(A07);
            if (A05 != null && !A05.shouldIgnore() && (i4 = A05.mPosition) >= i && i4 < i5) {
                A05.addFlags(2);
                A05.addChangePayload(obj);
                ((C3OP) A07.getLayoutParams()).A00 = true;
            }
        }
        C70593Ew c70593Ew = recyclerView.A0y;
        ArrayList arrayList = c70593Ew.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                C3OO c3oo = (C3OO) arrayList.get(size);
                if (c3oo != null && (i3 = c3oo.mPosition) >= i && i3 < i5) {
                    c3oo.addFlags(2);
                    c70593Ew.A09(size);
                }
            } else {
                recyclerView.A0V = true;
                return;
            }
        }
    }

    @Override // X.C3FC
    public final void Cu5(int i, int i2) {
        RecyclerView recyclerView = this.A00;
        C3FI c3fi = recyclerView.A08;
        int A04 = c3fi.A04();
        for (int i3 = 0; i3 < A04; i3++) {
            C3OO A05 = RecyclerView.A05(c3fi.A07(i3));
            if (A05 != null && !A05.shouldIgnore() && A05.mPosition >= i) {
                A05.offsetPosition(i2, false);
                recyclerView.mState.A0C = true;
            }
        }
        ArrayList arrayList = recyclerView.A0y.A06;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C3OO c3oo = (C3OO) arrayList.get(i4);
            if (c3oo != null && c3oo.mPosition >= i) {
                c3oo.offsetPosition(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.A0U = true;
    }

    @Override // X.C3FC
    public final void Cu6(int i, int i2) {
        int i3;
        RecyclerView recyclerView = this.A00;
        C3FI c3fi = recyclerView.A08;
        int A04 = c3fi.A04();
        int i4 = i;
        int i5 = i2;
        int i6 = 1;
        if (i < i2) {
            i6 = -1;
            i5 = i;
            i4 = i2;
        }
        for (int i7 = 0; i7 < A04; i7++) {
            C3OO A05 = RecyclerView.A05(c3fi.A07(i7));
            if (A05 != null && (i3 = A05.mPosition) >= i5 && i3 <= i4) {
                if (i3 == i) {
                    A05.offsetPosition(i2 - i, false);
                } else {
                    A05.offsetPosition(i6, false);
                }
                recyclerView.mState.A0C = true;
            }
        }
        C70593Ew c70593Ew = recyclerView.A0y;
        int i8 = 1;
        int i9 = i;
        int i10 = i2;
        if (i < i2) {
            i8 = -1;
            i10 = i;
            i9 = i2;
        }
        ArrayList arrayList = c70593Ew.A06;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C3OO c3oo = (C3OO) arrayList.get(i11);
            if (c3oo != null && c3oo.mPosition >= i10 && c3oo.mPosition <= i9) {
                if (c3oo.mPosition == i) {
                    c3oo.offsetPosition(i2 - i, false);
                } else {
                    c3oo.offsetPosition(i8, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.A0U = true;
    }
}
