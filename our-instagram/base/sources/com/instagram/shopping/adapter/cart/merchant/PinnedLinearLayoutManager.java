package com.instagram.shopping.adapter.cart.merchant;

import X.AbstractC110824yu;
import X.C3F5;
import X.C51104Mi9;
import X.InterfaceC58076Pp1;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public final class PinnedLinearLayoutManager extends LinearLayoutManager {
    public Class A00;
    public Class A01;
    public String A02;
    public String A03;
    public final float A04;
    public final Context A05;
    public final C51104Mi9 A06;
    public final InterfaceC58076Pp1 A07;

    public PinnedLinearLayoutManager(Context context, InterfaceC58076Pp1 interfaceC58076Pp1) {
        super(context, 1, false);
        this.A05 = context;
        this.A07 = interfaceC58076Pp1;
        this.A04 = 100.0f;
        this.A06 = new C51104Mi9(context, this);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final void A1T(C3F5 c3f5, RecyclerView recyclerView, int i) {
        C51104Mi9 c51104Mi9 = this.A06;
        ((AbstractC110824yu) c51104Mi9).A00 = i;
        A10(c51104Mi9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:
    
        if (r5 == null) goto L41;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1R(X.C70593Ew r14, X.C3F5 r15) {
        /*
            r13 = this;
            r0 = -2036657440(0xffffffff869b12e0, float:-5.8332254E-35)
            int r3 = X.C0f9.A03(r0)
            boolean r10 = X.AbstractC167017dG.A1a(r14, r15)
            super.A1R(r14, r15)
            java.lang.String r2 = r13.A03
            java.lang.Class r1 = r13.A01
            if (r1 == 0) goto L96
            if (r2 == 0) goto L96
            boolean r0 = r15.A08
            if (r0 != 0) goto L96
            X.Pp1 r7 = r13.A07
            int r0 = r7.AZW(r2)
            android.view.View r5 = r13.A0d(r0)
            r4 = 0
            java.lang.String r6 = r13.A02
            if (r6 == 0) goto L35
            java.lang.Class r0 = r13.A00
            if (r0 == 0) goto L35
            int r0 = r7.AZW(r6)
            android.view.View r4 = r13.A0d(r0)
        L35:
            if (r5 != 0) goto La3
            boolean r0 = r15.A0C
            if (r0 == 0) goto L9c
            boolean r0 = r15.A0A
            if (r0 != 0) goto L43
            boolean r0 = r15.A0B
            if (r0 == 0) goto L9c
        L43:
            java.util.List r6 = r14.A07
            X.C14360o3.A07(r6)
            long r11 = r7.BK2(r1, r2)
            java.lang.Class r2 = r13.A00
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L7a
            java.lang.String r0 = r13.A02
            if (r0 == 0) goto L82
            long r8 = r7.BK2(r2, r0)
            java.util.Iterator r7 = r6.iterator()
        L5e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r6 = r7.next()
            X.3OO r6 = (X.C3OO) r6
            long r1 = r6.mItemId
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 != 0) goto L73
            android.view.View r5 = r6.itemView
            goto L5e
        L73:
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L5e
            android.view.View r4 = r6.itemView
            goto L5e
        L7a:
            java.lang.IllegalStateException r1 = X.AbstractC166987dD.A14(r1)
            r0 = -1387122009(0xffffffffad5232a7, float:-1.1948365E-11)
            goto L89
        L82:
            java.lang.IllegalStateException r1 = X.AbstractC166987dD.A14(r1)
            r0 = -1510272159(0xffffffffa5fb1361, float:-4.355469E-16)
        L89:
            X.C0f9.A0A(r0, r3)
            throw r1
        L8d:
            int r1 = r1 - r0
            r5.offsetTopAndBottom(r1)
            if (r4 == 0) goto L96
            r4.offsetTopAndBottom(r1)
        L96:
            r0 = 375808891(0x1666637b, float:1.8610643E-25)
            goto L9f
        L9a:
            if (r5 != 0) goto La3
        L9c:
            r0 = -1525954587(0xffffffffa50bc7e5, float:-1.2124055E-16)
        L9f:
            X.C0f9.A0A(r0, r3)
            return
        La3:
            boolean r0 = r13.A19(r5, r10)
            if (r0 != 0) goto Lad
            r0 = -2129113831(0xffffffff81184d19, float:-2.7973306E-38)
            goto L9f
        Lad:
            if (r4 == 0) goto Lce
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            X.3OP r0 = (X.C3OP) r0
            android.graphics.Rect r1 = r0.A02
            int r2 = r4.getMeasuredHeight()
            int r0 = r1.top
            int r2 = r2 + r0
            int r0 = r1.bottom
            int r2 = r2 + r0
        Lc1:
            int r1 = r13.A00
            int r1 = r1 - r2
            int r0 = r13.A0V(r5)
            if (r0 < r1) goto L8d
            r0 = 2002559826(0x775ca352, float:4.4750697E33)
            goto L9f
        Lce:
            r2 = 0
            goto Lc1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.adapter.cart.merchant.PinnedLinearLayoutManager.A1R(X.3Ew, X.3F5):void");
    }
}
