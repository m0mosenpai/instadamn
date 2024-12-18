package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.GIq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36767GIq implements GZW {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ InterfaceC37219GaU A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C36767GIq(Context context, UserSession userSession, User user, InterfaceC37219GaU interfaceC37219GaU, String str, String str2) {
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = str;
        this.A02 = user;
        this.A03 = interfaceC37219GaU;
        this.A05 = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
        if (r15 == 2) goto L9;
     */
    @Override // X.GZW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D6u(int r15, boolean r16) {
        /*
            r14 = this;
            android.content.Context r6 = r14.A00
            com.instagram.common.session.UserSession r7 = r14.A01
            java.lang.String r10 = r14.A04
            com.instagram.user.model.User r8 = r14.A02
            X.GaU r9 = r14.A03
            r11 = 0
            int r0 = r8.BJ8()
            r2 = 1
            boolean r0 = X.AbstractC167007dF.A1P(r0, r2)
            X.C18C.A0E(r0)
            if (r15 == 0) goto L50
            java.lang.String r1 = X.AbstractC34332FCa.A00(r10)
            java.lang.String r0 = "unable to unblock fb user from linked fb account"
            X.C0w9.A03(r1, r0)
        L22:
            java.lang.String r3 = r14.A05
            X.8hC r2 = X.AbstractC31171DnF.A0I(r6)
            if (r15 == 0) goto L30
            r1 = 2
            r0 = 2131958616(0x7f131b58, float:1.955385E38)
            if (r15 != r1) goto L33
        L30:
            r0 = 2131958614(0x7f131b56, float:1.9553845E38)
        L33:
            java.lang.String r0 = X.AbstractC167007dF.A0f(r6, r3, r0)
            X.C14360o3.A0A(r0)
            r2.A05 = r0
            r0 = 2131958584(0x7f131b38, float:1.9553784E38)
            X.AbstractC31177DnL.A0v(r6, r2, r3, r0)
            r0 = 2131960994(0x7f1324a2, float:1.9558672E38)
            r2.A0J(r11, r0)
            r0 = 6
            X.DialogInterfaceOnDismissListenerC35463FkK.A00(r2, r9, r0)
            X.AbstractC166987dD.A1W(r2)
            return
        L50:
            java.lang.String r4 = r8.getId()
            r9.D6t()
            X.AbstractC34337FCf.A00(r7, r8, r2)
            X.8kN r0 = X.C195218kN.A00(r7)
            r0.A06()
            r12 = 0
            X.EUY r5 = new X.EUY
            r13 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            X.1Ms r3 = X.AbstractC167017dG.A0c(r7)
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.lang.String r0 = "friendships/block_fb/%s/"
            r3.A0L(r0, r1)
            X.AbstractC31171DnF.A1J(r3, r4)
            java.lang.String r0 = "surface"
            r3.A9s(r0, r10)
            java.lang.Class<X.6rx> r1 = X.C151516rx.class
            java.lang.Class<X.6ry> r0 = X.C151526ry.class
            r3.A0P(r11, r1, r0, r12)
            X.1ON r1 = X.AbstractC31172DnG.A0U(r3, r2)
            r1.A00 = r5
            X.1GK r0 = X.C1GJ.A01()
            r0.schedule(r1)
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36767GIq.D6u(int, boolean):void");
    }

    @Override // X.GZW
    public final void onCancel() {
        this.A03.onCancel();
    }
}
