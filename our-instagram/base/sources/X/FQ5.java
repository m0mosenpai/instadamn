package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FQ5 {
    public final Context A00;
    public final InterfaceC37202GaD A01;
    public final InterfaceC09390do A02;
    public final UserSession A03;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r3 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r3 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (X.AbstractC35273Fh8.A0A(r1, r13, r15) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(android.content.DialogInterface.OnDismissListener r12, X.C38321qM r13, X.C75113Zb r14, int r15, int r16) {
        /*
            r11 = this;
            r0 = 0
            r9 = r13
            X.C14360o3.A0B(r13, r0)
            r8 = r11
            com.instagram.common.session.UserSession r1 = r11.A03
            boolean r4 = X.AbstractC35273Fh8.A08(r1)
            boolean r0 = r13.A53()
            r5 = r15
            if (r0 == 0) goto L1a
            boolean r0 = X.AbstractC35273Fh8.A0A(r1, r13, r15)
            r3 = 1
            if (r0 != 0) goto L1b
        L1a:
            r3 = 0
        L1b:
            X.GaD r2 = r11.A01
            boolean r0 = r2.CNB()
            r10 = r14
            r6 = r16
            if (r0 != 0) goto L76
            if (r4 == 0) goto L65
            if (r3 == 0) goto L65
            r2 = 2131972242(0x7f135092, float:1.9581486E38)
        L2d:
            android.content.Context r0 = r11.A00
            X.8hC r1 = X.AbstractC31171DnF.A0I(r0)
            r1.A0A(r2)
            if (r4 == 0) goto L3d
            r0 = 2131972241(0x7f135091, float:1.9581484E38)
            if (r3 != 0) goto L40
        L3d:
            r0 = 2131972238(0x7f13508e, float:1.9581478E38)
        L40:
            r1.A09(r0)
            if (r4 == 0) goto L4a
            r0 = 2131972244(0x7f135094, float:1.958149E38)
            if (r3 != 0) goto L4d
        L4a:
            r0 = 2131972240(0x7f135090, float:1.9581482E38)
        L4d:
            r7 = 1
            X.Fif r4 = new X.Fif
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r1.A0J(r4, r0)
            X.Fju r0 = X.DialogInterfaceOnClickListenerC35437Fju.A00
            r1.A0D(r0)
            r1.A04()
            r1.A0g(r12)
        L61:
            X.AbstractC166987dD.A1W(r1)
            return
        L65:
            java.util.List r0 = r13.BqL()
            boolean r0 = r0.isEmpty()
            r2 = 2131972243(0x7f135093, float:1.9581488E38)
            if (r0 == 0) goto L2d
            r2 = 2131972237(0x7f13508d, float:1.9581476E38)
            goto L2d
        L76:
            android.content.Context r0 = r11.A00
            X.8hC r1 = X.AbstractC31171DnF.A0I(r0)
            r0 = 2131972239(0x7f13508f, float:1.958148E38)
            r1.A0A(r0)
            X.0do r0 = r11.A02
            java.lang.Object r0 = r0.getValue()
            java.lang.CharSequence[] r0 = (java.lang.CharSequence[]) r0
            r7 = 2
            X.Fif r4 = new X.Fif
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r1.A0f(r4, r0)
            r1.A04()
            X.8hC r1 = r2.AM3(r1)
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FQ5.A00(android.content.DialogInterface$OnDismissListener, X.1qM, X.3Zb, int, int):void");
    }

    public FQ5(Context context, UserSession userSession, InterfaceC37202GaD interfaceC37202GaD) {
        AbstractC167017dG.A1R(interfaceC37202GaD, userSession);
        this.A00 = context;
        this.A01 = interfaceC37202GaD;
        this.A03 = userSession;
        this.A02 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37016GSx(this, 30));
    }
}
