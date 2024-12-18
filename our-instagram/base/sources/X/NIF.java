package X;

import android.content.res.Resources;
import android.widget.TextView;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NIF extends AbstractC51365MmQ implements InterfaceC58035PoL {
    public C51832Mva A00;
    public final int A01;
    public final int A02;
    public final TextView A03;
    public final Resources A04;
    public final UserSession A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NIF(android.content.Context r20, com.instagram.common.session.UserSession r21, X.InterfaceC58200Pr6 r22, boolean r23, boolean r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NIF.<init>(android.content.Context, com.instagram.common.session.UserSession, X.Pr6, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0075, code lost:
    
        if (r3 == X.C05F.A01) goto L37;
     */
    @Override // X.InterfaceC58035PoL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FD3(X.C51832Mva r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NIF.FD3(X.Mva):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (r0 == null) goto L32;
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
            if (r2 == 0) goto L7b
            X.Nfh r1 = r2.A09
        L9:
            X.Nfh r0 = X.EnumC53185Nfh.A0A
            if (r1 != r0) goto L5c
            r1 = 2131238610(0x7f081ed2, float:1.8093504E38)
        L10:
            android.graphics.drawable.Drawable r3 = r6.getDrawable(r1)
            r4 = 0
            r1 = 0
            if (r3 == 0) goto L32
            int r0 = X.MSX.A01(r6)
            r3.setBounds(r4, r4, r0, r0)
            android.content.res.Resources r2 = r7.A04
            r0 = 2131100180(0x7f060214, float:1.7812734E38)
            int r2 = r2.getColor(r0, r5)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            X.AbstractC25228BEl.A1H(r0, r3, r2)
            android.widget.TextView r0 = r7.A03
            r0.setCompoundDrawables(r3, r5, r5, r5)
        L32:
            android.widget.TextView r3 = r7.A03
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            r0 = 5
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.C14360o3.A0C(r2, r0)
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            X.Mva r0 = r7.A00
            if (r0 == 0) goto L48
            java.lang.Integer r1 = r0.A0A
        L48:
            java.lang.Integer r0 = X.C05F.A0j
            if (r1 != r0) goto L4e
            r4 = 16
        L4e:
            r2.gravity = r4
            r3.setLayoutParams(r2)
            boolean r0 = r7.A08
            if (r0 == 0) goto L5b
            r0 = 3
            r3.setTextDirection(r0)
        L5b:
            return
        L5c:
            if (r2 == 0) goto L68
            java.lang.Integer r1 = r2.A0A
        L60:
            java.lang.Integer r0 = X.C05F.A0j
            if (r1 != r0) goto L6a
            r1 = 2131238634(0x7f081eea, float:1.8093552E38)
            goto L10
        L68:
            r1 = r5
            goto L60
        L6a:
            if (r2 == 0) goto L77
            X.Ms7 r0 = r2.A08
            if (r0 == 0) goto L77
            java.lang.Integer r0 = r0.A07
            r1 = 2131238638(0x7f081eee, float:1.809356E38)
            if (r0 != 0) goto L10
        L77:
            r1 = 2131238642(0x7f081ef2, float:1.8093568E38)
            goto L10
        L7b:
            r1 = r5
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NIF.A01():void");
    }

    @Override // X.InterfaceC58035PoL
    public final void FCe(int i) {
        TextView textView = this.A03;
        AbstractC31177DnL.A0x(textView, AbstractC167017dG.A06(super.A00) + i, textView.getPaddingTop());
    }
}
