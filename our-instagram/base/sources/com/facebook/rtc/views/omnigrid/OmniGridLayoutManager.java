package com.facebook.rtc.views.omnigrid;

import X.AbstractC001800i;
import X.AbstractC09800fd;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC16880sg;
import X.AbstractC25227BEk;
import X.AbstractC43592JPx;
import X.AbstractC43594JPz;
import X.AbstractC51368MmT;
import X.AbstractC53632Nnd;
import X.AbstractC54955OSf;
import X.AbstractC63123SdR;
import X.AbstractC70663Fe;
import X.AnonymousClass001;
import X.C00O;
import X.C01T;
import X.C05F;
import X.C09530e4;
import X.C0K8;
import X.C14360o3;
import X.C16930sl;
import X.C17s;
import X.C17u;
import X.C3F5;
import X.C3OP;
import X.C50585MUv;
import X.C50627MWo;
import X.C51614Mr7;
import X.C51681MsC;
import X.C51727Mt4;
import X.C51744MtT;
import X.C57221Pb5;
import X.C70593Ew;
import X.InterfaceC16660sJ;
import X.N0H;
import X.N0I;
import X.N0J;
import X.OVT;
import X.QIw;
import X.UQ7;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.rtc.views.omnigridview.OmniGridView;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes9.dex */
public final class OmniGridLayoutManager extends AbstractC70663Fe {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public MotionEvent A04;
    public QIw A05;
    public C50627MWo A06;
    public C51727Mt4 A07;
    public C51727Mt4 A08;
    public ImmutableList A09;
    public Map A0A;
    public Map A0B;
    public C09530e4 A0C;
    public boolean A0D;
    public final Context A0E;
    public final Set A0F;
    public final InterfaceC16660sJ A0G;

    @Override // X.AbstractC70663Fe
    public final C3OP A0g() {
        return new C3OP(-2, -2);
    }

    @Override // X.AbstractC70663Fe
    public final void A0z(C70593Ew c70593Ew, RecyclerView recyclerView) {
        C14360o3.A0B(c70593Ew, 1);
        A11(recyclerView);
        Iterator it = this.A0F.iterator();
        while (it.hasNext()) {
            OmniGridView omniGridView = ((OVT) it.next()).A00;
            omniGridView.A0C = false;
            if (AbstractC54955OSf.A00(omniGridView.A02) != null) {
                if (omniGridView.A05 == null) {
                    C14360o3.A0F("gridSelfItemDefinition");
                    throw C00O.createAndThrow();
                }
                AbstractC51368MmT abstractC51368MmT = omniGridView.A03;
                if (abstractC51368MmT != null) {
                    N0H n0h = (N0H) abstractC51368MmT;
                    C14360o3.A0B(n0h, 0);
                    n0h.A01.A01();
                }
            }
        }
        A0v(c70593Ew);
        c70593Ew.A06();
    }

    @Override // X.AbstractC70663Fe
    public final void A1C(AccessibilityEvent accessibilityEvent) {
        C14360o3.A0B(accessibilityEvent, 0);
        super.A1C(accessibilityEvent);
        if (this.A09.size() > 0) {
            accessibilityEvent.setFromIndex(AbstractC166987dD.A0H(AbstractC001800i.A0I(this.A09)));
            accessibilityEvent.setToIndex(AbstractC166987dD.A0H(AbstractC001800i.A0K(this.A09)));
        }
    }

    @Override // X.AbstractC70663Fe
    public final int A1K(C70593Ew c70593Ew, C3F5 c3f5, int i) {
        int i2;
        int i3;
        C14360o3.A0B(c70593Ew, 1);
        AbstractC09800fd.A01("OmniGridLayoutManager.scrollHorizontallyBy", 1591770204);
        try {
            if (A01()) {
                int i4 = this.A00 + i;
                int i5 = -Bau();
                int A00 = C51727Mt4.A00(this);
                if (i4 < i5) {
                    i4 = i5;
                } else if (i4 > A00) {
                    i4 = A00;
                }
                int i6 = this.A00;
                i2 = i4 - i6;
                if (i2 != 0) {
                    if (i4 != i6) {
                        this.A00 = i4;
                    }
                    A00(c70593Ew);
                    i3 = 437231449;
                    AbstractC09800fd.A00(i3);
                    return i2;
                }
            }
            i2 = 0;
            i3 = 200977065;
            AbstractC09800fd.A00(i3);
            return i2;
        } catch (Throwable th) {
            AbstractC09800fd.A00(-2095536464);
            throw th;
        }
    }

    @Override // X.AbstractC70663Fe
    public final int A1L(C70593Ew c70593Ew, C3F5 c3f5, int i) {
        int i2;
        int i3;
        C14360o3.A0B(c70593Ew, 1);
        AbstractC09800fd.A01("OmniGridLayoutManager.scrollVerticallyBy", 184863535);
        try {
            if (A01()) {
                int i4 = this.A01 + i;
                int i5 = -Bax();
                int A01 = C51727Mt4.A01(this);
                if (i4 < i5) {
                    i4 = i5;
                } else if (i4 > A01) {
                    i4 = A01;
                }
                int i6 = this.A01;
                i2 = i4 - i6;
                if (i2 != 0) {
                    if (i4 != i6) {
                        this.A01 = i4;
                    }
                    A00(c70593Ew);
                    i3 = -130360530;
                    AbstractC09800fd.A00(i3);
                    return i2;
                }
            }
            i2 = 0;
            i3 = 1718081848;
            AbstractC09800fd.A00(i3);
            return i2;
        } catch (Throwable th) {
            AbstractC09800fd.A00(-348967628);
            throw th;
        }
    }

    @Override // X.AbstractC70663Fe
    public final void A1O(int i) {
        if (A02(i, 0, 0)) {
            A0i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd A[Catch: all -> 0x036a, TryCatch #1 {all -> 0x036a, blocks: (B:5:0x001d, B:6:0x002f, B:8:0x0035, B:10:0x0041, B:12:0x0072, B:14:0x0082, B:16:0x0088, B:17:0x00a1, B:19:0x00a5, B:21:0x00ab, B:23:0x00af, B:28:0x00bd, B:29:0x00ee, B:31:0x00f4, B:33:0x0100, B:35:0x0108, B:38:0x0111, B:40:0x0114, B:44:0x011d, B:45:0x0182, B:46:0x0193, B:47:0x0162, B:48:0x013e, B:49:0x014e, B:50:0x01aa, B:52:0x01b1, B:54:0x01b7, B:56:0x01c5, B:57:0x01c9, B:59:0x01cd, B:60:0x01d1, B:61:0x0234, B:62:0x0239, B:63:0x023e, B:65:0x0244, B:67:0x024a, B:69:0x0258, B:70:0x025c, B:72:0x0260, B:73:0x0264, B:74:0x02b8, B:75:0x02bd, B:76:0x00db, B:77:0x00b4, B:78:0x02c2), top: B:4:0x001d, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4 A[Catch: all -> 0x036a, TryCatch #1 {all -> 0x036a, blocks: (B:5:0x001d, B:6:0x002f, B:8:0x0035, B:10:0x0041, B:12:0x0072, B:14:0x0082, B:16:0x0088, B:17:0x00a1, B:19:0x00a5, B:21:0x00ab, B:23:0x00af, B:28:0x00bd, B:29:0x00ee, B:31:0x00f4, B:33:0x0100, B:35:0x0108, B:38:0x0111, B:40:0x0114, B:44:0x011d, B:45:0x0182, B:46:0x0193, B:47:0x0162, B:48:0x013e, B:49:0x014e, B:50:0x01aa, B:52:0x01b1, B:54:0x01b7, B:56:0x01c5, B:57:0x01c9, B:59:0x01cd, B:60:0x01d1, B:61:0x0234, B:62:0x0239, B:63:0x023e, B:65:0x0244, B:67:0x024a, B:69:0x0258, B:70:0x025c, B:72:0x0260, B:73:0x0264, B:74:0x02b8, B:75:0x02bd, B:76:0x00db, B:77:0x00b4, B:78:0x02c2), top: B:4:0x001d, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01aa A[Catch: all -> 0x036a, TryCatch #1 {all -> 0x036a, blocks: (B:5:0x001d, B:6:0x002f, B:8:0x0035, B:10:0x0041, B:12:0x0072, B:14:0x0082, B:16:0x0088, B:17:0x00a1, B:19:0x00a5, B:21:0x00ab, B:23:0x00af, B:28:0x00bd, B:29:0x00ee, B:31:0x00f4, B:33:0x0100, B:35:0x0108, B:38:0x0111, B:40:0x0114, B:44:0x011d, B:45:0x0182, B:46:0x0193, B:47:0x0162, B:48:0x013e, B:49:0x014e, B:50:0x01aa, B:52:0x01b1, B:54:0x01b7, B:56:0x01c5, B:57:0x01c9, B:59:0x01cd, B:60:0x01d1, B:61:0x0234, B:62:0x0239, B:63:0x023e, B:65:0x0244, B:67:0x024a, B:69:0x0258, B:70:0x025c, B:72:0x0260, B:73:0x0264, B:74:0x02b8, B:75:0x02bd, B:76:0x00db, B:77:0x00b4, B:78:0x02c2), top: B:4:0x001d, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db A[Catch: all -> 0x036a, TryCatch #1 {all -> 0x036a, blocks: (B:5:0x001d, B:6:0x002f, B:8:0x0035, B:10:0x0041, B:12:0x0072, B:14:0x0082, B:16:0x0088, B:17:0x00a1, B:19:0x00a5, B:21:0x00ab, B:23:0x00af, B:28:0x00bd, B:29:0x00ee, B:31:0x00f4, B:33:0x0100, B:35:0x0108, B:38:0x0111, B:40:0x0114, B:44:0x011d, B:45:0x0182, B:46:0x0193, B:47:0x0162, B:48:0x013e, B:49:0x014e, B:50:0x01aa, B:52:0x01b1, B:54:0x01b7, B:56:0x01c5, B:57:0x01c9, B:59:0x01cd, B:60:0x01d1, B:61:0x0234, B:62:0x0239, B:63:0x023e, B:65:0x0244, B:67:0x024a, B:69:0x0258, B:70:0x025c, B:72:0x0260, B:73:0x0264, B:74:0x02b8, B:75:0x02bd, B:76:0x00db, B:77:0x00b4, B:78:0x02c2), top: B:4:0x001d, outer: #0 }] */
    @Override // X.AbstractC70663Fe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1R(X.C70593Ew r31, X.C3F5 r32) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.views.omnigrid.OmniGridLayoutManager.A1R(X.3Ew, X.3F5):void");
    }

    @Override // X.AbstractC70663Fe
    public final void A1S(C3F5 c3f5) {
        C14360o3.A0B(c3f5, 0);
        AbstractC09800fd.A01("OmniGridLayoutManager.onLayoutCompleted", -442689273);
        try {
            Iterator it = this.A0F.iterator();
            while (it.hasNext()) {
                it.next();
            }
            AbstractC09800fd.A00(1775906727);
        } catch (Throwable th) {
            AbstractC09800fd.A00(-653964021);
            throw th;
        }
    }

    public OmniGridLayoutManager(Context context, InterfaceC16660sJ interfaceC16660sJ) {
        this.A0E = context;
        this.A0G = interfaceC16660sJ;
        A13(false);
        this.A06 = new C50627MWo(new C51744MtT((GridSelfViewLocation) null, (AbstractC53632Nnd) N0I.A00(20), (AbstractC53632Nnd) N0I.A00(20), (AbstractC53632Nnd) N0I.A00(20), (AbstractC53632Nnd) N0I.A00(20), (AbstractC53632Nnd) N0I.A00(10), (AbstractC53632Nnd) N0I.A00(10), (AbstractC53632Nnd) null, (AbstractC53632Nnd) null, (Object) null, 32704, false, false, false, false), C57221Pb5.A00);
        this.A0F = new CopyOnWriteArraySet();
        C16930sl c16930sl = C16930sl.A00;
        Integer num = C05F.A00;
        GridSelfViewLocation gridSelfViewLocation = GridSelfViewLocation.TOP_RIGHT;
        this.A07 = new C51727Mt4(null, gridSelfViewLocation, num, num, null, c16930sl, null, 0, 0, 0, false);
        this.A08 = new C51727Mt4(null, gridSelfViewLocation, num, num, null, c16930sl, null, 0, 0, 0, false);
        this.A0A = AbstractC166987dD.A1I();
        this.A0B = AbstractC166987dD.A1I();
        this.A00 = -1;
        this.A01 = -1;
        ImmutableList of = ImmutableList.of();
        C14360o3.A07(of);
        this.A09 = of;
    }

    private final void A00(C70593Ew c70593Ew) {
        int i;
        AbstractC09800fd.A01("OmniGridLayoutManager.updateVisibleItems", 1857655630);
        try {
            UQ7 A1a = A1a();
            ImmutableList.Builder builder = new ImmutableList.Builder();
            ArrayList A1E = AbstractC166987dD.A1E();
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            int A0T = A0T();
            for (int i2 = 0; i2 < A0T; i2++) {
                View A0e = A0e(i2);
                if (A0e != null) {
                    AbstractC25227BEk.A1O(Integer.valueOf(i2), A1I, AbstractC70663Fe.A0C(A0e));
                }
            }
            int i3 = 0;
            for (C51614Mr7 c51614Mr7 : this.A07.A09) {
                int i4 = i3 + 1;
                Integer num = (Integer) A1I.get(Integer.valueOf(i3));
                if (c51614Mr7.A02.A00(A1a) <= 0.0f && !c51614Mr7.A05) {
                    if (num != null) {
                        View A0e2 = A0e(num.intValue());
                        A0n(A0e2);
                        if (A0e2 != null) {
                            c70593Ew.A0A(A0e2);
                        }
                    }
                } else {
                    if (num == null) {
                        AbstractC166997dE.A1W(A1E, i3);
                    }
                    builder.add((Object) Integer.valueOf(i3));
                }
                i3 = i4;
            }
            C17u A0C = C17s.A0C(0, A0T());
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator it = A0C.iterator();
            while (it.hasNext()) {
                View A0e3 = A0e(((AbstractC16880sg) it).A00());
                if (A0e3 != null) {
                    A1E2.add(A0e3);
                }
            }
            ArrayList A0U = AbstractC001800i.A0U(A1E2);
            int size = A0U.size() - 1;
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    break;
                }
                C51614Mr7 c51614Mr72 = (C51614Mr7) this.A07.A09.get(AbstractC70663Fe.A0C((View) A0U.get(i5)));
                i5++;
                if (c51614Mr72.A00 > ((C51614Mr7) this.A07.A09.get(AbstractC70663Fe.A0C((View) A0U.get(i5)))).A00) {
                    Iterator it2 = A0U.iterator();
                    while (it2.hasNext()) {
                        int A05 = super.A05.A05(AbstractC43592JPx.A09(it2));
                        if (A05 >= 0) {
                            super.A05.A08(A05);
                        }
                    }
                    if (A0U.size() > 1) {
                        C01T.A1D(A0U, new C50585MUv(this, 5));
                    }
                    Iterator it3 = A0U.iterator();
                    while (it3.hasNext()) {
                        A0p(AbstractC43592JPx.A09(it3), -1);
                    }
                }
            }
            Iterator it4 = A1E.iterator();
            while (it4.hasNext()) {
                int A0B = AbstractC167007dF.A0B(it4);
                View A04 = c70593Ew.A04(A0B);
                C14360o3.A07(A04);
                int i6 = ((C51614Mr7) this.A07.A09.get(A0B)).A00;
                int A0T2 = A0T();
                int i7 = 0;
                while (true) {
                    if (i7 < A0T2) {
                        View A0e4 = A0e(i7);
                        if (A0e4 != null) {
                            if (((C51614Mr7) this.A07.A09.get(AbstractC70663Fe.A0C(A0e4))).A00 >= i6) {
                                break;
                            }
                        }
                        i7++;
                    } else {
                        i7 = A0T();
                        break;
                    }
                }
                A0o(A04, i7);
            }
            int A0T3 = A0T();
            for (int i8 = 0; i8 < A0T3; i8++) {
                View A0e5 = A0e(i8);
                if (A0e5 != null) {
                    int A0C2 = AbstractC70663Fe.A0C(A0e5);
                    int A0C3 = AbstractC70663Fe.A0C(A0e5);
                    boolean z = ((C51614Mr7) this.A07.A09.get(A0C2)).A05;
                    AbstractC09800fd.A01("OmniGridLayoutManager.layoutView", -623856188);
                    try {
                        UQ7 uq7 = ((C51614Mr7) this.A07.A09.get(A0C3)).A02;
                        int i9 = 0;
                        if (z) {
                            i = 0;
                        } else {
                            i = -A1a.A01;
                            i9 = -A1a.A03;
                        }
                        int i10 = uq7.A01;
                        int i11 = i10 + i;
                        int i12 = uq7.A03;
                        int i13 = i12 + i9;
                        if (!A0e5.isLayoutRequested() && uq7.A02 - uq7.A01 == A0e5.getWidth() && uq7.A00 - uq7.A03 == A0e5.getHeight()) {
                            if (A0e5.getLeft() != i11) {
                                Iterator it5 = this.A0F.iterator();
                                while (it5.hasNext()) {
                                    ((OVT) it5.next()).A00(A0C3);
                                }
                                A0e5.offsetLeftAndRight(i11 - A0e5.getLeft());
                            }
                            if (A0e5.getTop() != i13) {
                                Iterator it6 = this.A0F.iterator();
                                while (it6.hasNext()) {
                                    ((OVT) it6.next()).A00(A0C3);
                                }
                                A0e5.offsetTopAndBottom(i13 - A0e5.getTop());
                            }
                        } else {
                            Set set = this.A0F;
                            Iterator it7 = set.iterator();
                            while (it7.hasNext()) {
                                it7.next();
                            }
                            int i14 = uq7.A02;
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - i10, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                            int i15 = uq7.A00;
                            A0e5.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i15 - i12, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
                            Iterator it8 = set.iterator();
                            while (it8.hasNext()) {
                                ((OVT) it8.next()).A00(A0C3);
                            }
                            AbstractC70663Fe.A0E(A0e5, i11, i13, i14 + i, i15 + i9);
                        }
                        AbstractC09800fd.A00(-1162334964);
                    } catch (Throwable th) {
                        AbstractC09800fd.A00(-2004132400);
                        throw th;
                    }
                }
            }
            this.A09 = builder.build();
            Iterator it9 = this.A0F.iterator();
            while (it9.hasNext()) {
                it9.next();
            }
            AbstractC09800fd.A00(-1285855510);
        } catch (Throwable th2) {
            AbstractC09800fd.A00(-414916334);
            throw th2;
        }
    }

    private final boolean A01() {
        MotionEvent motionEvent = this.A04;
        Rect rect = this.A07.A00;
        if (motionEvent != null && rect != null && AbstractC43594JPz.A1V(rect, motionEvent)) {
            return false;
        }
        return true;
    }

    private final boolean A02(int i, int i2, int i3) {
        if (i < this.A07.A09.size()) {
            UQ7 uq7 = ((C51614Mr7) this.A07.A09.get(i)).A02;
            int i4 = uq7.A01 - i2;
            int i5 = -Bau();
            int A00 = C51727Mt4.A00(this);
            if (i4 < i5) {
                i4 = i5;
            } else if (i4 > A00) {
                i4 = A00;
            }
            if (i4 != this.A00) {
                this.A00 = i4;
            }
            int i6 = uq7.A03 - i3;
            int i7 = -Bax();
            int A01 = C51727Mt4.A01(this);
            if (i6 < i7) {
                i6 = i7;
            } else if (i6 > A01) {
                i6 = A01;
            }
            if (i6 != this.A01) {
                this.A01 = i6;
                return true;
            }
            return true;
        }
        C0K8.A0D("OmniGridLayoutManager", AnonymousClass001.A0O("Cannot scroll to ", i));
        return false;
    }

    @Override // X.AbstractC70663Fe
    public final void A1U(RecyclerView recyclerView) {
        Iterator it = this.A0F.iterator();
        while (it.hasNext()) {
            OmniGridView omniGridView = ((OVT) it.next()).A00;
            omniGridView.A0C = true;
            C51681MsC A00 = AbstractC54955OSf.A00(omniGridView.A02);
            if (A00 != null) {
                N0J n0j = omniGridView.A05;
                if (n0j == null) {
                    C14360o3.A0F("gridSelfItemDefinition");
                    throw C00O.createAndThrow();
                }
                n0j.A02(omniGridView, omniGridView, A00);
            }
        }
    }

    @Override // X.AbstractC70663Fe
    public final boolean A1X() {
        if (this.A07.A04 == 1 && A01()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC70663Fe
    public final boolean A1Y() {
        if (this.A07.A04 == 2 && A01()) {
            return true;
        }
        return false;
    }

    public final UQ7 A1a() {
        int Bau = this.A00 + Bau();
        int Bax = this.A01 + Bax();
        return new UQ7(Bau, Bax, ((super.A03 + Bau) - Bau()) - Baw(), ((super.A00 + Bax) - Bax()) - Bat(), 0);
    }
}
