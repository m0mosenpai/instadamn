package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.litho.BaseMountingView;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.widget.LithoScrollView;
import java.util.Arrays;

/* renamed from: X.2Yl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51632Yl extends AbstractC50792Va {

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.DIMEN_SIZE)
    public int A00;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public int A01;

    @Comparable(type = 10)
    @Prop(optional = false, resType = EnumC27347C5c.NONE)
    public AbstractC50812Vc A02;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public X9B A03;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A04;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A05;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A06;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A07;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A08;

    @Override // X.AbstractC50812Vc
    public final boolean A0S() {
        return true;
    }

    @Override // X.AbstractC50812Vc
    public final boolean A0T() {
        return true;
    }

    @Override // X.AbstractC50812Vc
    public final boolean A0U() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final boolean A11() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final boolean A12() {
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
            if (r4 == r5) goto L5b
            r2 = 0
            if (r5 == 0) goto L1e
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L1e
            X.2Yl r5 = (X.C51632Yl) r5
            X.2Vc r1 = r4.A02
            X.2Vc r0 = r5.A02
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
            int r1 = r4.A01
            int r0 = r5.A01
            if (r1 != r0) goto L1e
            boolean r1 = r4.A04
            boolean r0 = r5.A04
            if (r1 != r0) goto L1e
            X.X9B r1 = r4.A03
            X.X9B r0 = r5.A03
            if (r1 == 0) goto L41
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L44
            return r2
        L41:
            if (r0 == 0) goto L44
            return r2
        L44:
            boolean r1 = r4.A05
            boolean r0 = r5.A05
            if (r1 != r0) goto L1e
            boolean r1 = r4.A06
            boolean r0 = r5.A06
            if (r1 != r0) goto L1e
            boolean r0 = r5.A07
            if (r6 != r0) goto L1e
            boolean r1 = r4.A08
            boolean r0 = r5.A08
            if (r1 == r0) goto L5b
            return r2
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51632Yl.A19(X.2Vc, boolean):boolean");
    }

    public C51632Yl() {
        super("VerticalScroll");
        this.A06 = true;
    }

    @Override // X.AbstractC50812Vc
    public final Integer A0Q() {
        return C05F.A0C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0046, code lost:
    
        if (r4.booleanValue() == false) goto L36;
     */
    @Override // X.AbstractC50812Vc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0V(X.AbstractC50812Vc r17, X.AbstractC50812Vc r18, X.AbstractC50922Vo r19, X.AbstractC50922Vo r20) {
        /*
            r16 = this;
            r5 = r18
            r6 = r17
            X.2Yl r6 = (X.C51632Yl) r6
            X.2Yl r5 = (X.C51632Yl) r5
            r4 = 0
            if (r6 != 0) goto Lc0
            r3 = r4
        Lc:
            if (r5 != 0) goto Lbc
            r2 = r4
        Lf:
            if (r6 != 0) goto Lb4
            r1 = r4
        L12:
            if (r5 != 0) goto Lac
            r7 = r4
        L15:
            if (r6 != 0) goto La4
            r8 = r4
        L18:
            if (r5 != 0) goto L9c
            r9 = r4
        L1b:
            if (r6 != 0) goto L96
            r10 = r4
        L1e:
            if (r5 != 0) goto L90
            r11 = r4
        L21:
            if (r6 != 0) goto L89
            r12 = r4
        L24:
            if (r5 != 0) goto L82
            r13 = r4
        L27:
            if (r6 != 0) goto L7c
            r14 = r4
        L2a:
            if (r5 != 0) goto L76
            r15 = r4
        L2d:
            if (r6 != 0) goto L6f
            r6 = r4
        L30:
            if (r5 == 0) goto L38
            boolean r0 = r5.A07
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L38:
            boolean r0 = r6.equals(r4)
            r5 = 1
            if (r0 == 0) goto L6e
            if (r4 == 0) goto L48
            boolean r4 = r4.booleanValue()
            r0 = 1
            if (r4 != 0) goto L49
        L48:
            r0 = 0
        L49:
            boolean r0 = X.C51372Xk.A04(r3, r2, r0)
            if (r0 == 0) goto L6e
            boolean r0 = r1.equals(r7)
            if (r0 == 0) goto L6e
            boolean r0 = r8.equals(r9)
            if (r0 == 0) goto L6e
            boolean r0 = r10.equals(r11)
            if (r0 == 0) goto L6e
            boolean r0 = r12.equals(r13)
            if (r0 == 0) goto L6e
            boolean r0 = r14.equals(r15)
            if (r0 == 0) goto L6e
            r5 = 0
        L6e:
            return r5
        L6f:
            boolean r0 = r6.A07
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            goto L30
        L76:
            r0 = 0
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r0)
            goto L2d
        L7c:
            r0 = 0
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r0)
            goto L2a
        L82:
            boolean r0 = r5.A04
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            goto L27
        L89:
            boolean r0 = r6.A04
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
            goto L24
        L90:
            r0 = 0
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
            goto L21
        L96:
            r0 = 0
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            goto L1e
        L9c:
            boolean r0 = r5.A06
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            goto L1b
        La4:
            boolean r0 = r6.A06
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            goto L18
        Lac:
            boolean r0 = r5.A05
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            goto L15
        Lb4:
            boolean r0 = r6.A05
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            goto L12
        Lbc:
            X.2Vc r2 = r5.A02
            goto Lf
        Lc0:
            X.2Vc r3 = r6.A02
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51632Yl.A0V(X.2Vc, X.2Vc, X.2Vo, X.2Vo):boolean");
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

    /* JADX WARN: Code restructure failed: missing block: B:3:0x001b, code lost:
    
        if (r9 != null) goto L5;
     */
    @Override // X.AbstractC50792Va
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0r(X.C2XE r7, X.C2WI r8, X.C2Vj r9, X.C2W6 r10, int r11, int r12) {
        /*
            r6 = this;
            X.2Vc r5 = r6.A02
            com.facebook.litho.ComponentTree r4 = r6.A03(r7)
            int r2 = r10.A02()
            int r0 = r10.A03()
            int r2 = r2 + r0
            r0 = -1
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r11, r2, r0)
            boolean r0 = r4.Cbm()
            r3 = 0
            if (r0 == 0) goto L41
            if (r9 == 0) goto L2d
        L1d:
            int r0 = r9.A01
            int r0 = java.lang.Math.max(r3, r0)
            r9.A01 = r0
            int r0 = r9.A00
            int r0 = java.lang.Math.max(r3, r0)
            r9.A00 = r0
        L2d:
            int r0 = r9.A01
            int r0 = r0 + r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r9.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.Cpj r8 = (X.C28935Cpj) r8
            r8.A01 = r1
            r8.A00 = r0
            return
        L41:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            r4.A0P(r5, r9, r1, r0)
            if (r9 == 0) goto L2d
            int r1 = android.view.View.MeasureSpec.getMode(r12)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L5d
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 != r0) goto L1d
            int r0 = android.view.View.MeasureSpec.getSize(r12)
        L5a:
            r9.A00 = r0
            goto L1d
        L5d:
            int r1 = android.view.View.MeasureSpec.getSize(r12)
            int r0 = r9.A00
            int r0 = java.lang.Math.min(r1, r0)
            int r0 = java.lang.Math.max(r3, r0)
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51632Yl.A0r(X.2XE, X.2WI, X.2Vj, X.2W6, int, int):void");
    }

    @Override // X.AbstractC50792Va
    public final void A0s(C2XE c2xe, C2WI c2wi, C2W6 c2w6) {
        AbstractC50812Vc abstractC50812Vc = this.A02;
        ComponentTree A03 = A03(c2xe);
        Integer num = ((C28935Cpj) c2wi).A01;
        int A05 = (c2w6.A05() - c2w6.A02()) - c2w6.A03();
        int A00 = (c2w6.A00() - c2w6.A04()) - c2w6.A01();
        if (num != null && num.intValue() == A05) {
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(A05, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        View.MeasureSpec.makeMeasureSpec(A00, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        if (A03.Cbm()) {
            return;
        }
        A03.A0P(abstractC50812Vc, null, makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // X.AbstractC50792Va
    public final void A0u(C2XE c2xe, C2WI c2wi, Object obj) {
        AbstractC50922Vo abstractC50922Vo;
        String str;
        ViewTreeObserver.OnPreDrawListener viewTreeObserverOnPreDrawListenerC65854TvF;
        C2Y5 c2y5 = c2xe.A05;
        c2y5.getClass();
        C77083cu c77083cu = c2y5.A02;
        if (c77083cu != null) {
            abstractC50922Vo = c77083cu.A01;
        } else {
            abstractC50922Vo = null;
        }
        final LithoScrollView lithoScrollView = (LithoScrollView) obj;
        boolean z = this.A05;
        boolean z2 = this.A06;
        boolean z3 = this.A04;
        boolean z4 = this.A08;
        int i = this.A00;
        X9B x9b = this.A03;
        ComponentTree A03 = A03(c2xe);
        final C65853TvE c65853TvE = ((C26662Bpx) abstractC50922Vo).A00;
        BaseMountingView baseMountingView = lithoScrollView.A06;
        if (baseMountingView instanceof LithoView) {
            AbstractC50812Vc A0F = A03.A0F();
            if (A0F != null) {
                str = A0F.A0H();
            } else {
                str = "null";
            }
            lithoScrollView.A05 = str;
            lithoScrollView.A04 = A03.A0W.A02.A01.A07;
            ((LithoView) baseMountingView).A0l(A03, true);
            lithoScrollView.A02 = c65853TvE;
            if (C2V3.useOneShotPreDrawListener) {
                viewTreeObserverOnPreDrawListenerC65854TvF = C03O.A00(lithoScrollView, new Runnable() { // from class: X.Wtb
                    @Override // java.lang.Runnable
                    public final void run() {
                        lithoScrollView.setScrollY(c65853TvE.A00);
                    }
                });
            } else {
                viewTreeObserverOnPreDrawListenerC65854TvF = new ViewTreeObserverOnPreDrawListenerC65854TvF(c65853TvE, lithoScrollView);
                lithoScrollView.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC65854TvF);
            }
            lithoScrollView.A00 = viewTreeObserverOnPreDrawListenerC65854TvF;
            lithoScrollView.setScrollbarFadingEnabled(z2);
            lithoScrollView.setNestedScrollingEnabled(z3);
            lithoScrollView.setVerticalFadingEdgeEnabled(z4);
            lithoScrollView.setFadingEdgeLength(i);
            lithoScrollView.setVerticalScrollBarEnabled(z);
            lithoScrollView.A0B = null;
            lithoScrollView.A01 = x9b;
            lithoScrollView.setOverScrollMode(1);
            return;
        }
        throw new UnsupportedOperationException("API can only be invoked from Vertical Scroll Spec");
    }

    @Override // X.AbstractC50792Va
    public final void A0w(C2XE c2xe, C2WI c2wi, Object obj) {
        LithoScrollView lithoScrollView = (LithoScrollView) obj;
        lithoScrollView.A0B = null;
        lithoScrollView.A01 = null;
        BaseMountingView baseMountingView = lithoScrollView.A06;
        if (baseMountingView instanceof LithoView) {
            ((LithoView) baseMountingView).A0l(null, false);
            lithoScrollView.A02 = null;
            lithoScrollView.getViewTreeObserver().removeOnPreDrawListener(lithoScrollView.A00);
            lithoScrollView.A00 = null;
            C69324VlW c69324VlW = lithoScrollView.A03;
            if (c69324VlW != null) {
                c69324VlW.A00 = null;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("API can only be invoked from Vertical Scroll Spec");
    }

    @Override // X.AbstractC50792Va
    public final void A0x(C2XE c2xe, AbstractC50922Vo abstractC50922Vo) {
        int i = this.A01;
        C65853TvE c65853TvE = new C65853TvE();
        c65853TvE.A00 = i;
        ((C26662Bpx) abstractC50922Vo).A00 = c65853TvE;
    }

    @Override // X.AbstractC50792Va
    public final void A0y(C2WI c2wi, C2WI c2wi2) {
        C28935Cpj c28935Cpj = (C28935Cpj) c2wi;
        C28935Cpj c28935Cpj2 = (C28935Cpj) c2wi2;
        c28935Cpj.A00 = c28935Cpj2.A00;
        c28935Cpj.A01 = c28935Cpj2.A01;
    }

    private ComponentTree A03(C2XE c2xe) {
        final String A08 = c2xe.A08();
        Object obj = new Object(A08) { // from class: X.9IH
            public final String A00;

            public final boolean equals(Object obj2) {
                return this == obj2 || (obj2 != null && (obj2 instanceof C9IH) && C14360o3.A0K(this.A00, ((C9IH) obj2).A00));
            }

            public final int hashCode() {
                return Arrays.hashCode(new Object[]{this.A00, false, getClass()});
            }

            {
                this.A00 = A08;
            }
        };
        ComponentTree componentTree = (ComponentTree) c2xe.A07(obj, A08, 0);
        if (componentTree == null) {
            C75713ac A01 = ComponentTree.A01(null, c2xe);
            A01.A07 = false;
            ComponentTree A00 = A01.A00();
            c2xe.A0D(obj, A00, A08, 0);
            return A00;
        }
        return componentTree;
    }

    @Override // X.AbstractC50812Vc
    public final /* bridge */ /* synthetic */ AbstractC50812Vc A0P() {
        AbstractC50812Vc abstractC50812Vc;
        C51632Yl c51632Yl = (C51632Yl) super.A0P();
        AbstractC50812Vc abstractC50812Vc2 = c51632Yl.A02;
        if (abstractC50812Vc2 != null) {
            abstractC50812Vc = abstractC50812Vc2.A0P();
        } else {
            abstractC50812Vc = null;
        }
        c51632Yl.A02 = abstractC50812Vc;
        return c51632Yl;
    }

    @Override // X.AbstractC50812Vc
    public final Object A0R(Context context) {
        return LayoutInflater.from(context).inflate(R.layout.litho_scroll_view, (ViewGroup) null, false);
    }
}
