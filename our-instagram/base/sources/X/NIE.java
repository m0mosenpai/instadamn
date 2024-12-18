package X;

import android.graphics.Paint;
import android.widget.TextView;

/* loaded from: classes9.dex */
public final class NIE extends AbstractC51365MmQ implements InterfaceC58035PoL {
    public C51832Mva A00;
    public final int A01;
    public final int A02;
    public final Paint A03;
    public final TextView A04;
    public final OEL A05;
    public final C50634MWv A06;
    public final String A07;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NIE(android.content.Context r22, X.C50634MWv r23, X.InterfaceC58200Pr6 r24) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NIE.<init>(android.content.Context, X.MWv, X.Pr6):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0077, code lost:
    
        if (r3 == X.C05F.A01) goto L37;
     */
    @Override // X.InterfaceC58035PoL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FD3(X.C51832Mva r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NIE.FD3(X.Mva):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r0 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01() {
        /*
            r7 = this;
            android.content.Context r6 = r7.A00
            X.Mva r2 = r7.A00
            r5 = 0
            if (r2 == 0) goto L72
            X.Nfh r1 = r2.A09
        L9:
            X.Nfh r0 = X.EnumC53185Nfh.A0A
            if (r1 != r0) goto L53
            r1 = 2131238610(0x7f081ed2, float:1.8093504E38)
        L10:
            android.graphics.drawable.Drawable r3 = r6.getDrawable(r1)
            r4 = 16
            r2 = 0
            r1 = 0
            if (r3 == 0) goto L32
            int r0 = X.AbstractC166987dD.A0C(r6, r4)
            r3.setBounds(r2, r2, r0, r0)
            r0 = 2130970282(0x7f0406aa, float:1.754927E38)
            int r2 = X.AbstractC167007dF.A09(r6, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            X.AbstractC25228BEl.A1H(r0, r3, r2)
            android.widget.TextView r0 = r7.A04
            r0.setCompoundDrawables(r3, r5, r5, r5)
        L32:
            android.widget.TextView r3 = r7.A04
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            r0 = 5
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.C14360o3.A0C(r2, r0)
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            X.Mva r0 = r7.A00
            if (r0 == 0) goto L48
            java.lang.Integer r1 = r0.A0A
        L48:
            java.lang.Integer r0 = X.C05F.A0Y
            if (r1 != r0) goto L4d
            r4 = 0
        L4d:
            r2.gravity = r4
            r3.setLayoutParams(r2)
            return
        L53:
            if (r2 == 0) goto L5f
            java.lang.Integer r1 = r2.A0A
        L57:
            java.lang.Integer r0 = X.C05F.A0j
            if (r1 != r0) goto L61
            r1 = 2131238634(0x7f081eea, float:1.8093552E38)
            goto L10
        L5f:
            r1 = r5
            goto L57
        L61:
            if (r2 == 0) goto L6e
            X.Ms7 r0 = r2.A08
            if (r0 == 0) goto L6e
            java.lang.Integer r0 = r0.A07
            r1 = 2131238638(0x7f081eee, float:1.809356E38)
            if (r0 != 0) goto L10
        L6e:
            r1 = 2131238642(0x7f081ef2, float:1.8093568E38)
            goto L10
        L72:
            r1 = r5
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NIE.A01():void");
    }

    @Override // X.InterfaceC58035PoL
    public final void FCe(int i) {
        TextView textView = this.A04;
        AbstractC31177DnL.A0x(textView, AbstractC167017dG.A06(super.A00) + i, textView.getPaddingTop());
    }
}
