package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EUY extends C1P1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ InterfaceC37219GaU A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public EUY(Context context, UserSession userSession, User user, InterfaceC37219GaU interfaceC37219GaU, String str, String str2, int i, boolean z) {
        this.A02 = userSession;
        this.A03 = user;
        this.A00 = i;
        this.A04 = interfaceC37219GaU;
        this.A07 = z;
        this.A06 = str;
        this.A05 = str2;
        this.A01 = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r4 == 2) goto L6;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFail(X.AbstractC115105If r19) {
        /*
            r18 = this;
            r0 = -891757958(0xffffffffcad8da7a, float:-7105853.0)
            int r3 = X.C0f9.A03(r0)
            r8 = r18
            android.content.Context r7 = r8.A01
            com.instagram.user.model.User r6 = r8.A03
            java.lang.String r5 = r6.getFullName()
            java.lang.String r2 = r6.getUsername()
            int r4 = r8.A00
            if (r4 == 0) goto L1d
            r1 = 2
            r0 = 0
            if (r4 != r1) goto L1e
        L1d:
            r0 = 1
        L1e:
            X.AbstractC35116FeI.A00(r7, r5, r2, r0)
            X.GaU r0 = r8.A04
            if (r0 == 0) goto L28
            r0.DFf()
        L28:
            com.instagram.common.session.UserSession r2 = r8.A02
            java.lang.String r1 = r6.getId()
            java.lang.String r10 = r8.A06
            java.lang.String r11 = r8.A05
            if (r11 != 0) goto L38
            java.lang.String r11 = X.AbstractC34332FCa.A00(r10)
        L38:
            int r17 = r6.BJ8()
            com.instagram.user.model.FollowStatus r0 = r6.B7L()
            r6 = 0
            java.lang.String r12 = r0.name()
            java.lang.String r14 = "DEFAULT"
            java.lang.String r16 = X.AbstractC166997dE.A0n()
            X.Ffr r5 = new X.Ffr
            r7 = r6
            r8 = r6
            r9 = r6
            r13 = r6
            r15 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.C35263Fgx.A02(r2, r5, r1, r4)
            r0 = 1772231386(0x69a21ada, float:2.4496598E25)
            X.C0f9.A0A(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EUY.onFail(X.5If):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r2 == 2) goto L6;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFailInBackground(X.AbstractC115105If r6) {
        /*
            r5 = this;
            r0 = -963906313(0xffffffffc68bf4f7, float:-17914.482)
            int r4 = X.C0f9.A03(r0)
            int r2 = r5.A00
            if (r2 == 0) goto Lf
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L10
        Lf:
            r0 = 1
        L10:
            r0 = r0 ^ 1
            com.instagram.user.model.User r3 = r5.A03
            r3.A0v(r0)
            com.instagram.common.session.UserSession r2 = r5.A02
            X.1My r1 = X.AbstractC25651Mw.A00(r2)
            X.1xI r0 = new X.1xI
            r0.<init>(r3)
            r1.E4s(r0)
            r3.A0c(r2)
            X.5ts r0 = X.AbstractC129875tr.A00(r2)
            r0.A0E(r3)
            r0 = -571461951(0xffffffffddf02ec1, float:-2.1633728E18)
            X.C0f9.A0A(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EUY.onFailInBackground(X.5If):void");
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(116545859);
        int A032 = C0f9.A03(1099778703);
        InterfaceC37219GaU interfaceC37219GaU = this.A04;
        if (interfaceC37219GaU != null) {
            interfaceC37219GaU.onSuccess();
            if (this.A07) {
                interfaceC37219GaU.Czi();
            }
        }
        UserSession userSession = this.A02;
        int i = this.A00;
        User user = this.A03;
        String id = user.getId();
        String str = this.A06;
        String str2 = this.A05;
        if (str2 == null) {
            str2 = AbstractC34332FCa.A00(str);
        }
        C35263Fgx.A03(userSession, new C35199Ffr(null, null, null, null, str, str2, user.B7L().name(), null, "DEFAULT", "DEFAULT", AbstractC166997dE.A0n(), user.BJ8()), id, i);
        C0f9.A0A(1374201934, A032);
        C0f9.A0A(798478769, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-1841330002);
        int A032 = C0f9.A03(1544810066);
        UserSession userSession = this.A02;
        AbstractC129875tr.A00(userSession).A0C((C151516rx) obj, this.A03, null);
        MUK.A02(userSession).A00 = true;
        C0f9.A0A(1016233653, A032);
        C0f9.A0A(1842172503, A03);
    }
}
