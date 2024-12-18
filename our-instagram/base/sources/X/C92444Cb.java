package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.4Cb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92444Cb implements InterfaceC92434Ca {
    public final Fragment A00;
    public final UserSession A01;
    public final C65192xH A02;
    public final C684936m A03;
    public final InterfaceC92434Ca A04;
    public final C685136o A05;
    public final C36X A06;
    public final C691338z A07;

    public C92444Cb(Fragment fragment, C684936m c684936m, UserSession userSession, InterfaceC92434Ca interfaceC92434Ca, C65192xH c65192xH, C685136o c685136o, C36X c36x, C691338z c691338z) {
        C14360o3.A0B(interfaceC92434Ca, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(fragment, 3);
        C14360o3.A0B(c65192xH, 4);
        C14360o3.A0B(c691338z, 5);
        C14360o3.A0B(c36x, 6);
        C14360o3.A0B(c684936m, 7);
        C14360o3.A0B(c685136o, 8);
        this.A04 = interfaceC92434Ca;
        this.A01 = userSession;
        this.A00 = fragment;
        this.A02 = c65192xH;
        this.A07 = c691338z;
        this.A06 = c36x;
        this.A03 = c684936m;
        this.A05 = c685136o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (r0.A09(r18, r19, r5, r1) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    @Override // X.InterfaceC92434Ca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cv9(android.view.MotionEvent r16, X.C81373k7 r17, X.C38321qM r18, X.C75113Zb r19, X.C2Fb r20, X.InterfaceC16820sZ r21) {
        /*
            r15 = this;
            X.INI r0 = X.IBO.A00
            com.instagram.common.session.UserSession r5 = r15.A01
            r3 = 1
            r7 = r18
            boolean r0 = r0.A02(r5, r7)
            r8 = r19
            if (r0 == 0) goto L92
            java.lang.String r2 = "cta_bar"
            androidx.fragment.app.Fragment r0 = r15.A00
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L24
            X.C3MG.A00()
            X.Ix6 r0 = new X.Ix6
            r0.<init>(r7, r15)
            X.C3MF.A00(r1, r5, r7, r0, r2)
        L24:
            X.36o r6 = r15.A05
            boolean r0 = X.C685136o.A00(r6)
            if (r0 == 0) goto L74
            X.36p r1 = r6.A05
            boolean r0 = r7.A5T()
            if (r0 == 0) goto L74
            X.0do r0 = r1.A00
            java.lang.Object r0 = r0.getValue()
            X.3BN r0 = (X.C3BN) r0
            com.instagram.common.session.UserSession r5 = r0.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36328555671797381(0x8110a100053e85, double:3.03766311797228E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto L74
            java.lang.String r5 = r7.getId()
            if (r5 == 0) goto L74
            java.util.Map r2 = r6.A06
            java.lang.Object r0 = r2.get(r5)
            X.Mti r0 = (X.C51759Mti) r0
            r13 = 2
            r11 = 0
            if (r0 == 0) goto L88
            java.lang.Integer r1 = X.C05F.A01
            java.lang.Object r0 = r0.A00
            X.0sZ r0 = (X.InterfaceC16820sZ) r0
            X.Mti r9 = new X.Mti
            r9.<init>(r1, r0)
        L68:
            r2.put(r5, r9)
            java.lang.Object r0 = r9.A00
            X.0sZ r0 = (X.InterfaceC16820sZ) r0
            if (r0 == 0) goto L74
            r0.invoke()
        L74:
            X.36m r0 = r15.A03
            r0.A00 = r7
            r0.A02 = r3
            X.4Ca r4 = r15.A04
            r5 = r16
            r6 = r17
            r9 = r20
            r10 = r21
            r4.Cv9(r5, r6, r7, r8, r9, r10)
            return
        L88:
            java.lang.Integer r10 = X.C05F.A01
            r14 = 0
            X.Mti r9 = new X.Mti
            r12 = r11
            r9.<init>(r10, r11, r12, r13, r14)
            goto L68
        L92:
            X.38z r6 = r15.A07
            boolean r0 = r6.A01(r7)
            if (r0 == 0) goto Lbb
            java.lang.Integer r1 = X.C05F.A00
            boolean r0 = r6.A02(r7, r1)
            if (r0 == 0) goto Lbb
            r6.A00(r7, r1)
            X.36X r2 = r15.A06
            X.3Hb r5 = X.EnumC71153Hb.A07
        La9:
            java.lang.Integer r1 = X.C05F.A01
            X.30l r0 = r2.A03
            if (r0 == 0) goto L24
            boolean r0 = r0.A09(r7, r8, r5, r1)
            if (r0 == 0) goto L24
        Lb5:
            r0 = 0
            r2.A01(r7, r8, r5, r0)
            goto L24
        Lbb:
            X.36X r2 = r15.A06
            java.lang.Integer r1 = X.C05F.A00
            X.3Hb r5 = X.EnumC71153Hb.A07
            X.30l r0 = r2.A03
            if (r0 == 0) goto Lcc
            boolean r0 = r0.A09(r7, r8, r5, r1)
            if (r0 == 0) goto Lcc
            goto Lb5
        Lcc:
            boolean r0 = r6.A02(r7, r1)
            if (r0 == 0) goto La9
            r6.A00(r7, r1)
            goto La9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92444Cb.Cv9(android.view.MotionEvent, X.3k7, X.1qM, X.3Zb, X.2Fb, X.0sZ):void");
    }
}
