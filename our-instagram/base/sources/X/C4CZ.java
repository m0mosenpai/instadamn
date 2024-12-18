package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.4CZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4CZ implements InterfaceC92434Ca {
    public final Fragment A00;
    public final UserSession A01;
    public final String A02;
    public final InterfaceC09390do A03;
    public final InterfaceC60442pS A04;
    public final C33P A05;
    public final C689438f A06;

    public C4CZ(Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C33P c33p, C689438f c689438f, String str) {
        C14360o3.A0B(c689438f, 4);
        this.A01 = userSession;
        this.A00 = fragment;
        this.A02 = str;
        this.A06 = c689438f;
        this.A04 = interfaceC60442pS;
        this.A05 = c33p;
        this.A03 = AbstractC09440dt.A01(new C9EG(this, 8));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r1 == X.AnonymousClass341.A0H) goto L15;
     */
    @Override // X.InterfaceC92434Ca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cv9(android.view.MotionEvent r12, X.C81373k7 r13, X.C38321qM r14, X.C75113Zb r15, X.C2Fb r16, X.InterfaceC16820sZ r17) {
        /*
            r11 = this;
            X.0do r0 = r11.A03
            java.lang.Object r1 = r0.getValue()
            X.4Cg r1 = (X.C92494Cg) r1
            X.B7C r0 = X.B7C.A00
            r1.A01(r0)
            X.02i r2 = r1.A00
            if (r2 == 0) goto L1d
            r1 = 1056313521(0x3ef610b1, float:0.4805961)
            r0 = 2819(0xb03, float:3.95E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.markerPoint(r1, r0)
        L1d:
            androidx.fragment.app.Fragment r6 = r11.A00
            android.content.Context r2 = r6.getContext()
            r7 = r14
            r8 = r15
            if (r2 == 0) goto L89
            int r1 = r15.A03
            com.instagram.common.session.UserSession r3 = r11.A01
            r0 = 0
            com.instagram.model.androidlink.AndroidLink r5 = X.AbstractC905941u.A02(r2, r3, r14, r1, r0)
            X.341 r1 = r15.A0o
            X.341 r0 = X.AnonymousClass341.A0R
            r4 = 1
            if (r1 == r0) goto L44
            X.341 r0 = X.AnonymousClass341.A05
            if (r1 == r0) goto L44
            X.341 r0 = X.AnonymousClass341.A0U
            if (r1 == r0) goto L44
            X.341 r0 = X.AnonymousClass341.A0H
            r2 = 0
            if (r1 != r0) goto L45
        L44:
            r2 = 1
        L45:
            if (r5 == 0) goto Lc3
            X.41v r1 = X.AbstractC114965Hm.A01(r5)
            X.41v r0 = X.EnumC906041v.AD_DESTINATION_APP_STORE
            if (r1 == r0) goto L57
            X.41v r1 = X.AbstractC114965Hm.A01(r5)
            X.41v r0 = X.EnumC906041v.AD_DESTINATION_DEEPLINK
            if (r1 != r0) goto Lc3
        L57:
            r0 = 1
        L58:
            if (r2 == 0) goto L89
            if (r0 == 0) goto L89
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r0 = X.AbstractC41071vF.A00(r3, r14)
            boolean r0 = X.AbstractC76663cE.A01(r0, r3)
            if (r0 != 0) goto L89
            X.1rF r0 = r14.A0C
            X.46p r0 = r0.Atz()
            if (r0 == 0) goto Lbf
            java.lang.Boolean r1 = r0.BvZ()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto Lbf
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321567759672946(0x810a4600002672, double:3.0332439342067235E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto Lbf
        L89:
            X.38f r3 = r11.A06
            java.lang.String r10 = r11.A02
            if (r13 == 0) goto Lbd
            com.instagram.ui.widget.framelayout.MediaFrameLayout r5 = r13.A0Y
        L91:
            r4 = r12
            r9 = r16
            r3.A00(r4, r5, r6, r7, r8, r9, r10)
            com.instagram.common.session.UserSession r2 = r11.A01
            com.instagram.user.model.UpcomingEvent r4 = r14.A2B(r2)
            r1 = 0
            if (r4 == 0) goto Lbc
            java.util.EnumSet r0 = X.AbstractC75103Za.A00
            boolean r0 = X.C76253bV.A02(r2, r14)
            if (r0 == 0) goto Lbc
            X.6i5 r3 = new X.6i5
            r3.<init>(r1, r2, r10)
            java.lang.String r2 = r14.getId()
            r0 = 5014(0x1396, float:7.026E-42)
            java.lang.String r1 = X.AbstractC111324zv.A00(r0)
            java.lang.String r0 = "cta_bar_ads_cta"
            r3.A04(r4, r2, r1, r0)
        Lbc:
            return
        Lbd:
            r5 = 0
            goto L91
        Lbf:
            r17.invoke()
            goto L89
        Lc3:
            r0 = 0
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4CZ.Cv9(android.view.MotionEvent, X.3k7, X.1qM, X.3Zb, X.2Fb, X.0sZ):void");
    }
}
