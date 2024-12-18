package X;

import android.view.View;
import android.view.ViewGroup;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Ik5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnFocusChangeListenerC42036Ik5 implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public ViewOnFocusChangeListenerC42036Ik5(KF8 kf8, C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE) {
        this.A00 = 0;
        this.A01 = kf8;
        this.A03 = c102884kP;
        this.A04 = interfaceC103384lE;
        this.A02 = c6fg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (java.lang.Boolean.valueOf(r1) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
    
        if (java.lang.Boolean.valueOf(r1) != null) goto L15;
     */
    @Override // android.view.View.OnFocusChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFocusChange(android.view.View r7, boolean r8) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto La0;
                case 1: goto L43;
                default: goto L5;
            }
        L5:
            if (r8 == 0) goto L42
            java.lang.Object r5 = r6.A04
            X.IIj r5 = (X.C41118IIj) r5
            boolean r0 = r5.A01
            if (r0 != 0) goto L42
            java.lang.Object r2 = r6.A03
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r1 = 0
            java.lang.Object r0 = r6.A01
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getTop()
            r2.A0t(r1, r0)
            java.lang.Object r4 = r6.A02
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r4 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r4
            X.1vS r0 = r5.A00
            r3 = 0
            if (r0 == 0) goto L2c
            java.lang.String r3 = r0.A0j
        L2c:
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto Lc6
            if (r0 == 0) goto Lc1
            boolean r1 = r0.A0r()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto Lc1
        L3c:
            r4.A0N(r3, r1)
            r0 = 1
            r5.A01 = r0
        L42:
            return
        L43:
            if (r8 == 0) goto L90
            java.lang.Object r5 = r6.A04
            X.IIj r5 = (X.C41118IIj) r5
            boolean r0 = r5.A01
            if (r0 != 0) goto L90
            java.lang.Object r1 = r6.A01
            android.view.View r1 = (android.view.View) r1
            int r0 = r1.getTop()
            float r0 = (float) r0
            float r3 = java.lang.Math.abs(r0)
            java.lang.Object r2 = r6.A03
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.widget.AbsListView r2 = (android.widget.AbsListView) r2
            int r0 = r2.getHeight()
            float r0 = (float) r0
            float r3 = r3 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 + r0
            r0 = 1133903872(0x43960000, float:300.0)
            float r3 = r3 * r0
            int r1 = r1.getTop()
            int r0 = (int) r3
            r2.smoothScrollBy(r1, r0)
            java.lang.Object r4 = r6.A02
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r4 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r4
            X.1vS r0 = r5.A00
            r3 = 0
            if (r0 == 0) goto L7f
            java.lang.String r3 = r0.A0j
        L7f:
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto Ld0
            if (r0 == 0) goto Lcb
            boolean r1 = r0.A0r()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto Lcb
            goto L3c
        L90:
            java.lang.Object r1 = r6.A04
            X.IIj r1 = (X.C41118IIj) r1
            boolean r0 = r1.A01
            if (r0 == 0) goto L42
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r1.A03
            com.instagram.ui.text.backinterceptedittext.BackInterceptEditText r0 = r0.A0E
            r0.requestFocus()
            return
        La0:
            if (r8 == 0) goto L42
            java.lang.Object r3 = r6.A03
            X.4kP r3 = (X.C102884kP) r3
            java.lang.Object r2 = r6.A04
            X.4lE r2 = (X.InterfaceC103384lE) r2
            X.6FX r0 = new X.6FX
            r0.<init>()
            r0.A01(r3)
            java.lang.Object r1 = r6.A02
            X.6FG r1 = (X.C6FG) r1
            r0.A02(r1)
            X.6FW r0 = r0.A00()
            X.C6FP.A03(r1, r3, r0, r2)
            return
        Lc1:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r2)
            throw r0
        Lc6:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r2)
            throw r0
        Lcb:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r2)
            throw r0
        Ld0:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnFocusChangeListenerC42036Ik5.onFocusChange(android.view.View, boolean):void");
    }

    public ViewOnFocusChangeListenerC42036Ik5(View view, ViewGroup viewGroup, C41118IIj c41118IIj, ReelDashboardFragment reelDashboardFragment, int i) {
        this.A00 = i;
        this.A04 = c41118IIj;
        if (1 - i != 0) {
            this.A03 = viewGroup;
            this.A01 = view;
        } else {
            this.A01 = view;
            this.A03 = viewGroup;
        }
        this.A02 = reelDashboardFragment;
    }
}
