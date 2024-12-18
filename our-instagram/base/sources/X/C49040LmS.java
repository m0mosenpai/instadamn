package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.LmS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49040LmS implements InterfaceC165257aE {
    public MessageIdentifier A00;
    public C6WQ A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public InterfaceC1119153d A06;
    public final Activity A07;
    public final UserSession A08;
    public final LEK A09;
    public final InterfaceC08830cm A0A;
    public final InterfaceC08830cm A0B;
    public final InterfaceC60442pS A0C;
    public final InterfaceC16820sZ A0D;

    public C49040LmS(Activity activity, UserSession userSession, LEK lek, InterfaceC60442pS interfaceC60442pS, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC08830cm, 3);
        AbstractC25234BEr.A0k(4, lek, interfaceC60442pS, interfaceC08830cm2, interfaceC16820sZ);
        this.A08 = userSession;
        this.A07 = activity;
        this.A0A = interfaceC08830cm;
        this.A09 = lek;
        this.A0C = interfaceC60442pS;
        this.A0B = interfaceC08830cm2;
        this.A0D = interfaceC16820sZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (X.C14360o3.A0K(r13, "swipe") != false) goto L10;
     */
    @Override // X.InterfaceC165257aE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ekd(com.instagram.model.direct.messageid.MessageIdentifier r7, X.InterfaceC1119153d r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r6 = this;
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            X.0cm r1 = r6.A0A
            X.7Ux r2 = X.AbstractC31176DnK.A0X(r1)
            X.7TT r0 = r2.C7W()
            boolean r0 = r0.A0n
            if (r0 != 0) goto L2a
            com.instagram.common.session.UserSession r2 = r6.A08
            android.app.Activity r1 = r6.A07
            r0 = 0
            java.lang.String r0 = X.MSV.A00(r0)
            X.C14360o3.A0C(r1, r0)
            X.0cm r0 = r6.A0B
            java.lang.Object r0 = r0.get()
            X.3o9 r0 = (X.C3o9) r0
            X.AbstractC34068F1w.A00(r1, r2, r0)
            return
        L2a:
            java.lang.String r0 = "long_press"
            boolean r0 = X.C14360o3.A0K(r13, r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "swipe"
            boolean r0 = X.C14360o3.A0K(r13, r0)
            r3 = 0
            if (r0 == 0) goto L3c
        L3b:
            r3 = 1
        L3c:
            X.3oI r2 = r2.CCa()
            if (r2 == 0) goto Ld3
            X.3oE r2 = (X.C83693oE) r2
            X.0sZ r0 = r6.A0D
            java.lang.Object r0 = r0.invoke()
            X.6WQ r0 = (X.C6WQ) r0
            r6.A01 = r0
            if (r0 == 0) goto L53
            X.C0fJ.A00(r0)
        L53:
            r6.A00 = r7
            r6.A05 = r10
            r6.A04 = r13
            r6.A06 = r8
            r6.A03 = r11
            r6.A02 = r12
            if (r9 != 0) goto L9c
            com.instagram.common.session.UserSession r0 = r6.A08
            java.lang.String r5 = X.AbstractC31171DnF.A0c(r2)
            X.1Ms r4 = X.AbstractC167017dG.A0c(r0)
            java.lang.String r0 = r7.A01
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "direct_v2/items/%s/comments/facade_media/"
            r4.A0L(r0, r1)
            java.lang.String r1 = r7.A00()
            java.lang.String r0 = "original_message_client_context"
            r4.A9s(r0, r1)
            java.lang.String r0 = "thread_id"
            r4.A9s(r0, r5)
            java.lang.Class<X.EBc> r1 = X.C32155EBc.class
            java.lang.Class<X.Dpy> r0 = X.C31333Dpy.class
            X.1ON r4 = X.AbstractC25227BEk.A0e(r4, r1, r0)
            r1 = 3
            X.EUv r0 = new X.EUv
            r0.<init>(r1, r2, r6, r3)
            r4.A00 = r0
            X.1GK r0 = X.C1GJ.A01()
            r0.schedule(r4)
            return
        L9c:
            r4 = 95
            boolean r0 = X.AbstractC001900j.A0U(r9, r4)
            if (r0 != 0) goto Lc0
            X.7Ts r1 = X.AbstractC43593JPy.A0Z(r1)
            com.instagram.model.direct.messageid.MessageIdentifier r0 = r6.A00
            if (r0 != 0) goto Lb6
            java.lang.String r0 = "messageIdentifier"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Lb6:
            java.lang.String r0 = r1.BtL(r0)
            if (r0 == 0) goto Lc0
            java.lang.String r9 = X.AnonymousClass001.A0T(r9, r0, r4)
        Lc0:
            com.instagram.common.session.UserSession r0 = r6.A08
            X.1qM r0 = X.AbstractC25229BEm.A0h(r0, r9)
            if (r0 == 0) goto Lcf
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto Lcf
            r9 = r0
        Lcf:
            A00(r6, r2, r9, r3)
            return
        Ld3:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49040LmS.Ekd(com.instagram.model.direct.messageid.MessageIdentifier, X.53d, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (r15 == X.C2EY.A19) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C49040LmS r17, X.C83693oE r18, java.lang.String r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49040LmS.A00(X.LmS, X.3oE, java.lang.String, boolean):void");
    }
}
