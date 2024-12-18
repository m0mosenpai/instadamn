package com.instagram.common.ui.widget.recyclerview.flow;

import X.AbstractC110824yu;
import X.AbstractC70663Fe;
import X.AnonymousClass001;
import X.C2UU;
import X.C3F5;
import X.C66120Tzy;
import X.C70593Ew;
import X.InterfaceC153786vn;
import X.LNM;
import X.U1C;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class FlowingGridLayoutManager extends AbstractC70663Fe {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final C66120Tzy A06;
    public final Rect A05 = new Rect();
    public final List A07 = new ArrayList();
    public final Map A09 = new HashMap();
    public final Map A08 = new HashMap();
    public int A04 = 0;

    /* loaded from: classes8.dex */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = LNM.A00(21);
        public int A00;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.A00);
        }
    }

    @Override // X.AbstractC70663Fe
    public final void A1O(int i) {
        A1d(i, 0);
    }

    @Override // X.AbstractC70663Fe
    public final boolean A1Y() {
        return true;
    }

    public static int A00(FlowingGridLayoutManager flowingGridLayoutManager, int i, int i2) {
        int Bat;
        C66120Tzy c66120Tzy = flowingGridLayoutManager.A06;
        Rect A00 = c66120Tzy.A00(i);
        if (A00 != null) {
            int i3 = 0;
            int i4 = 0;
            do {
                i4 = Math.max(i4, c66120Tzy.A03[i3]);
                i3++;
            } while (i3 < 3);
            int Bat2 = (((AbstractC70663Fe) flowingGridLayoutManager).A00 - flowingGridLayoutManager.Bat()) - flowingGridLayoutManager.Bax();
            int i5 = A00.top;
            if (i4 >= Bat2 + i5 + i2) {
                Bat = i5 + i2;
                return Math.max(0, Bat);
            }
        }
        int i6 = 0;
        int i7 = 0;
        do {
            i7 = Math.max(i7, c66120Tzy.A03[i6]);
            i6++;
        } while (i6 < 3);
        Bat = i7 - ((((AbstractC70663Fe) flowingGridLayoutManager).A00 - flowingGridLayoutManager.Bat()) - flowingGridLayoutManager.Bax());
        return Math.max(0, Bat);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r0.A0O == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01() {
        /*
            r7 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r7.A07
            if (r0 == 0) goto L9
            boolean r0 = r0.A0O
            r1 = 1
            if (r0 != 0) goto La
        L9:
            r1 = 0
        La:
            r0 = 0
            if (r1 == 0) goto L5d
            int r6 = r7.Bau()
        L11:
            int r4 = r7.A04
            if (r1 == 0) goto L19
            int r0 = r7.Bax()
        L19:
            int r4 = r4 + r0
            int r3 = r7.A03
            if (r1 == 0) goto L23
            int r0 = r7.Baw()
            int r3 = r3 - r0
        L23:
            int r2 = r7.A04
            if (r1 == 0) goto L5a
            int r1 = r7.A00
            int r0 = r7.Bat()
            int r1 = r1 - r0
        L2e:
            int r2 = r2 + r1
            android.graphics.Rect r5 = r7.A05
            r5.set(r6, r4, r3, r2)
            X.Tzy r4 = r7.A06
            java.util.List r3 = r7.A07
            r3.clear()
            r2 = 0
        L3c:
            java.util.List r1 = r4.A07
            int r0 = r1.size()
            if (r2 >= r0) goto L5f
            java.lang.Object r0 = r1.get(r2)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            boolean r0 = android.graphics.Rect.intersects(r5, r0)
            if (r0 == 0) goto L57
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3.add(r0)
        L57:
            int r2 = r2 + 1
            goto L3c
        L5a:
            int r1 = r7.A00
            goto L2e
        L5d:
            r6 = 0
            goto L11
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager.A01():void");
    }

    private void A02(C70593Ew c70593Ew) {
        Map map = this.A08;
        map.clear();
        for (int i = 0; i < A0T(); i++) {
            View A0e = A0e(i);
            Map map2 = this.A09;
            if (map2.containsKey(A0e)) {
                map.put(map2.get(A0e), A0e);
            } else {
                throw new IllegalStateException(AnonymousClass001.A0O("Cannot find current rect index for View at child position: ", i));
            }
        }
        int A0T = A0T();
        while (true) {
            A0T--;
            if (A0T < 0) {
                break;
            }
            A0e(A0T);
            super.A05.A08(A0T);
        }
        int i2 = 0;
        while (true) {
            List list = this.A07;
            if (i2 >= list.size()) {
                break;
            }
            Number number = (Number) list.get(i2);
            int intValue = number.intValue();
            if (map.containsKey(number)) {
                Integer valueOf = Integer.valueOf(intValue);
                A0p((View) map.get(valueOf), -1);
                map.remove(valueOf);
            } else {
                Rect A00 = this.A06.A00(intValue);
                if (A00 != null) {
                    View A04 = c70593Ew.A04(intValue);
                    A04.getLayoutParams().width = A00.width();
                    A04.getLayoutParams().height = A00.height();
                    this.A09.put(A04, Integer.valueOf(intValue));
                    A0o(A04, -1);
                    A0q(A04, 0, 0);
                    int i3 = A00.left;
                    int i4 = A00.top;
                    int i5 = this.A04;
                    AbstractC70663Fe.A0E(A04, i3, i4 - i5, A00.right, A00.bottom - i5);
                }
            }
            i2++;
        }
        for (View view : map.values()) {
            this.A09.remove(view);
            A0n(view);
            c70593Ew.A0A(view);
        }
    }

    @Override // X.AbstractC70663Fe
    public final void A1I(RecyclerView recyclerView) {
        this.A06.A00 = 0;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager$SavedState, java.lang.Object] */
    @Override // X.AbstractC70663Fe
    public final Parcelable A1M() {
        ?? obj = new Object();
        obj.A00 = this.A04;
        return obj;
    }

    @Override // X.AbstractC70663Fe
    public final void A1P(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.A04 = ((SavedState) parcelable).A00;
        }
    }

    @Override // X.AbstractC70663Fe
    public final void A1Q(C2UU c2uu, C2UU c2uu2) {
        this.A06.A00 = 0;
        A0h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0155, code lost:
    
        if (r3.CN9() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0162, code lost:
    
        if (r9 != (-1.0f)) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0253  */
    @Override // X.AbstractC70663Fe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1R(X.C70593Ew r30, X.C3F5 r31) {
        /*
            Method dump skipped, instructions count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager.A1R(X.3Ew, X.3F5):void");
    }

    @Override // X.AbstractC70663Fe
    public final void A1V(RecyclerView recyclerView, int i, int i2) {
        this.A06.A01(i);
    }

    @Override // X.AbstractC70663Fe
    public final void A1W(RecyclerView recyclerView, int i, int i2) {
        this.A06.A01(i);
    }

    public final int A1c() {
        return (super.A03 - Baw()) - Bau();
    }

    public FlowingGridLayoutManager(InterfaceC153786vn interfaceC153786vn, int i) {
        this.A06 = new C66120Tzy(interfaceC153786vn, this, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r8 == 0) goto L12;
     */
    @Override // X.AbstractC70663Fe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A1L(X.C70593Ew r6, X.C3F5 r7, int r8) {
        /*
            r5 = this;
            int r0 = r7.A00()
            r4 = 0
            if (r0 <= 0) goto L35
            if (r8 == 0) goto L35
            X.Tzy r3 = r5.A06
            r1 = 0
            r2 = 0
        Ld:
            int[] r0 = r3.A03
            r0 = r0[r1]
            int r2 = java.lang.Math.max(r2, r0)
            int r1 = r1 + 1
            r0 = 3
            if (r1 < r0) goto Ld
            int r1 = r5.A00
            int r0 = r5.Bat()
            int r1 = r1 - r0
            int r0 = r5.Bax()
            int r1 = r1 - r0
            int r2 = r2 - r1
            int r2 = java.lang.Math.max(r4, r2)
            int r1 = r5.A04
            int r0 = r1 + r8
            if (r0 <= r2) goto L36
            int r8 = r2 - r1
        L33:
            if (r8 != 0) goto L3a
        L35:
            return r4
        L36:
            if (r0 > 0) goto L3a
            int r8 = -r1
            goto L33
        L3a:
            int r1 = r1 + r8
            r5.A04 = r1
            if (r1 < 0) goto L4a
            int r0 = -r8
            r5.A1B(r0)
            r5.A01()
            r5.A02(r6)
            return r8
        L4a:
            java.lang.String r1 = "Cannot scroll less than 0!"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager.A1L(X.3Ew, X.3F5, int):int");
    }

    public final int A1a() {
        if (A0U() != 0) {
            List list = this.A07;
            if (!list.isEmpty()) {
                for (int i = 0; i < list.size(); i++) {
                    int intValue = ((Number) list.get(i)).intValue();
                    Rect A00 = this.A06.A00(intValue);
                    if (A00 != null && this.A05.contains(A00)) {
                        return intValue;
                    }
                }
            }
        }
        return -1;
    }

    public final int A1b() {
        if (A0U() != 0) {
            List list = this.A07;
            if (!list.isEmpty()) {
                return ((Number) list.get(0)).intValue();
            }
            return -1;
        }
        return -1;
    }

    public final void A1d(int i, int i2) {
        if (A0U() != 0) {
            List list = this.A06.A07;
            if (list.size() != 0) {
                if (i >= list.size()) {
                    i = list.size() - 1;
                }
                if (i < 0) {
                    i = 0;
                }
                int A00 = A00(this, i, i2);
                if (this.A04 != A00) {
                    this.A04 = A00;
                    A0h();
                    A0i();
                }
            }
        }
    }

    public final void A1e(RecyclerView recyclerView, int i) {
        if (A0U() != 0) {
            U1C u1c = new U1C(recyclerView.getContext(), this);
            List list = this.A06.A07;
            if (i >= list.size()) {
                i = list.size() - 1;
            }
            if (i < 0) {
                i = 0;
            }
            ((AbstractC110824yu) u1c).A00 = i;
            A10(u1c);
        }
    }

    @Override // X.AbstractC70663Fe
    public final void A1T(C3F5 c3f5, RecyclerView recyclerView, int i) {
        A1e(recyclerView, i);
    }
}
