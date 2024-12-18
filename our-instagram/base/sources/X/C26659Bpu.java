package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;

/* renamed from: X.Bpu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26659Bpu extends AbstractC50792Va {

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public int A00;

    @Comparable(type = 10)
    @Prop(optional = false, resType = EnumC27347C5c.NONE)
    public AbstractC50812Vc A01;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A02;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A03;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.BOOL)
    public boolean A04;

    @Override // X.AbstractC50812Vc
    public final boolean A0S() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final void A0o(C2XE c2xe) {
        Boolean bool = null;
        TypedArray A02 = c2xe.A02(0, COC.A01);
        int indexCount = A02.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = A02.getIndex(i);
            if (index == 0) {
                bool = Boolean.valueOf(AbstractC167007dF.A1M(A02.getInt(index, 0)));
            }
        }
        A02.recycle();
        if (bool != null) {
            this.A04 = bool.booleanValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.2Vj] */
    @Override // X.AbstractC50792Va
    public final void A0r(C2XE c2xe, C2WI c2wi, C2Vj c2Vj, C2W6 c2w6, int i, int i2) {
        int i3;
        Integer num = null;
        Integer num2 = null;
        AbstractC50812Vc abstractC50812Vc = this.A01;
        ComponentTree A03 = A03(c2xe);
        if (A03.Cbm()) {
            if (c2Vj != null) {
                num = 0;
                num2 = 0;
                c2Vj.A01 = Math.max(0, c2Vj.A01);
                i3 = Math.max(0, c2Vj.A00);
            }
            C28938Cpm c28938Cpm = (C28938Cpm) c2wi;
            c28938Cpm.A04 = num;
            c28938Cpm.A03 = num2;
        }
        ?? obj = new Object();
        A03.A0P(abstractC50812Vc, obj, View.MeasureSpec.makeMeasureSpec(0, 0), i2);
        int i4 = obj.A01;
        i3 = obj.A00;
        num = Integer.valueOf(i4);
        num2 = Integer.valueOf(i3);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 0) {
            c2Vj.A01 = i4;
        } else {
            c2Vj.A01 = size;
        }
        c2Vj.A00 = i3;
        C28938Cpm c28938Cpm2 = (C28938Cpm) c2wi;
        c28938Cpm2.A04 = num;
        c28938Cpm2.A03 = num2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, X.2Vj] */
    @Override // X.AbstractC50792Va
    public final void A0s(C2XE c2xe, C2WI c2wi, C2W6 c2w6) {
        EnumC78563fO enumC78563fO = null;
        AbstractC50812Vc abstractC50812Vc = this.A01;
        boolean z = this.A02;
        ComponentTree A03 = A03(c2xe);
        C28938Cpm c28938Cpm = (C28938Cpm) c2wi;
        Integer num = c28938Cpm.A04;
        Integer num2 = c28938Cpm.A03;
        int A05 = (c2w6.A05() - c2w6.A02()) - c2w6.A03();
        int i = 0;
        if (num != null && num2 != null) {
            int intValue = num.intValue();
            if (!z) {
                A05 = 0;
            }
            i = Integer.valueOf(Math.max(intValue, A05));
        } else {
            if (A03.Cbm()) {
                num2 = 0;
                c28938Cpm.A02 = i;
                c28938Cpm.A01 = num2;
                c28938Cpm.A00 = enumC78563fO;
            }
            ?? obj = new Object();
            A03.A0P(abstractC50812Vc, obj, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(c2w6.A00(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
            int i2 = obj.A01;
            if (!z) {
                A05 = 0;
            }
            int max = Math.max(i2, A05);
            int i3 = obj.A00;
            i = Integer.valueOf(max);
            num2 = Integer.valueOf(i3);
        }
        enumC78563fO = c2w6.A06();
        c28938Cpm.A02 = i;
        c28938Cpm.A01 = num2;
        c28938Cpm.A00 = enumC78563fO;
    }

    @Override // X.AbstractC50792Va
    public final boolean A11() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final boolean A12() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final boolean A17() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (X.C51372Xk.A04(r1, r0, r6) == false) goto L12;
     */
    @Override // X.AbstractC50792Va
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A19(X.AbstractC50812Vc r5, boolean r6) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L3b
            r2 = 0
            if (r5 == 0) goto L1e
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L1e
            X.Bpu r5 = (X.C26659Bpu) r5
            X.2Vc r1 = r4.A01
            X.2Vc r0 = r5.A01
            if (r1 == 0) goto L1f
            boolean r0 = X.C51372Xk.A04(r1, r0, r6)
            if (r0 != 0) goto L22
        L1e:
            return r2
        L1f:
            if (r0 == 0) goto L22
            return r2
        L22:
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 != r0) goto L1e
            boolean r1 = r4.A02
            boolean r0 = r5.A02
            if (r1 != r0) goto L1e
            boolean r1 = r4.A03
            boolean r0 = r5.A03
            if (r1 != r0) goto L1e
            boolean r1 = r4.A04
            boolean r0 = r5.A04
            if (r1 == r0) goto L3b
            return r2
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26659Bpu.A19(X.2Vc, boolean):boolean");
    }

    public C26659Bpu() {
        super("HorizontalScroll");
        this.A04 = true;
    }

    @Override // X.AbstractC50812Vc
    public final Object A0R(Context context) {
        return new BZC(context);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2WI, java.lang.Object] */
    @Override // X.AbstractC50792Va
    public final /* bridge */ /* synthetic */ C2WI A0e() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Vo, java.lang.Object] */
    @Override // X.AbstractC50792Va
    public final /* bridge */ /* synthetic */ AbstractC50922Vo A0g() {
        return new Object();
    }

    @Override // X.AbstractC50792Va
    public final void A0w(C2XE c2xe, C2WI c2wi, Object obj) {
        BZC bzc = (BZC) obj;
        bzc.A03.A0l(null, false);
        bzc.A01 = 0;
        bzc.A00 = 0;
        bzc.A02 = null;
        bzc.setScrollX(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.CAK, java.lang.Object] */
    @Override // X.AbstractC50792Va
    public final void A0x(C2XE c2xe, AbstractC50922Vo abstractC50922Vo) {
        ?? obj = new Object();
        obj.A00 = -1;
        ((C26661Bpw) abstractC50922Vo).A00 = obj;
    }

    @Override // X.AbstractC50792Va
    public final void A0y(C2WI c2wi, C2WI c2wi2) {
        C28938Cpm c28938Cpm = (C28938Cpm) c2wi;
        C28938Cpm c28938Cpm2 = (C28938Cpm) c2wi2;
        c28938Cpm.A01 = c28938Cpm2.A01;
        c28938Cpm.A02 = c28938Cpm2.A02;
        c28938Cpm.A00 = c28938Cpm2.A00;
        c28938Cpm.A03 = c28938Cpm2.A03;
        c28938Cpm.A04 = c28938Cpm2.A04;
    }

    private ComponentTree A03(C2XE c2xe) {
        String A08 = c2xe.A08();
        Object cuz = new CUZ(A08);
        ComponentTree componentTree = (ComponentTree) c2xe.A07(cuz, A08, 0);
        if (componentTree == null) {
            C75713ac A01 = ComponentTree.A01(null, c2xe);
            A01.A07 = false;
            ComponentTree A00 = A01.A00();
            c2xe.A0D(cuz, A00, A08, 0);
            return A00;
        }
        return componentTree;
    }

    @Override // X.AbstractC50812Vc
    public final /* bridge */ /* synthetic */ AbstractC50812Vc A0P() {
        AbstractC50812Vc abstractC50812Vc;
        C26659Bpu c26659Bpu = (C26659Bpu) super.A0P();
        AbstractC50812Vc abstractC50812Vc2 = c26659Bpu.A01;
        if (abstractC50812Vc2 != null) {
            abstractC50812Vc = abstractC50812Vc2.A0P();
        } else {
            abstractC50812Vc = null;
        }
        c26659Bpu.A01 = abstractC50812Vc;
        return c26659Bpu;
    }

    @Override // X.AbstractC50812Vc
    public final Integer A0Q() {
        return C05F.A0C;
    }

    @Override // X.AbstractC50792Va
    public final void A0u(C2XE c2xe, C2WI c2wi, Object obj) {
        int i;
        int i2;
        C26661Bpw c26661Bpw = (C26661Bpw) AbstractC25233BEq.A0M(c2xe);
        BZC bzc = (BZC) obj;
        boolean z = this.A04;
        boolean z2 = this.A03;
        int i3 = this.A00;
        CAK cak = c26661Bpw.A00;
        ComponentTree A03 = A03(c2xe);
        C28938Cpm c28938Cpm = (C28938Cpm) c2wi;
        Integer num = c28938Cpm.A02;
        Integer num2 = c28938Cpm.A01;
        EnumC78563fO enumC78563fO = c28938Cpm.A00;
        bzc.setHorizontalScrollBarEnabled(z);
        bzc.setOverScrollMode(1);
        bzc.setHorizontalFadingEdgeEnabled(z2);
        bzc.setFadingEdgeLength(i3);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 0;
        }
        bzc.A03.A0l(A03, true);
        bzc.A02 = cak;
        bzc.A01 = i;
        bzc.A00 = i2;
        D22 d22 = new D22(cak, bzc, enumC78563fO);
        if (C2V3.useOneShotPreDrawListener) {
            C03O.A00(bzc, d22);
        } else {
            bzc.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC25701BXl(0, bzc, d22));
        }
    }
}
