package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KZQ extends C4A7 {
    public final Context A00;
    public final C92694De A01;
    public final UserSession A02;
    public final LE1 A03;
    public final C2DS A04;
    public final C05A A05;
    public final C0UO A06;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.KZQ r8, X.C44998Jvo r9) {
        /*
            X.3nh r4 = r9.A04
            int r7 = r9.A02
            r5 = 0
            r6 = 6
            r1 = 1
            if (r7 <= r6) goto L5f
            android.content.Context r0 = r8.A00
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131964403(0x7f1331f3, float:1.9565587E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
        L18:
            r1[r5] = r0
            java.lang.String r0 = r3.getString(r2, r1)
            X.C14360o3.A0A(r0)
        L21:
            r3 = 0
            if (r4 == 0) goto L3f
            com.instagram.common.session.UserSession r1 = r8.A02
            java.lang.String r1 = r1.userId
            boolean r1 = X.AbstractC162597Pw.A01(r4, r1)
            if (r1 != 0) goto L47
            android.content.Context r6 = r8.A00
            long r1 = r4.C8i()
            double r3 = (double) r1
            r1 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            java.lang.String r3 = X.C23831Eq.A04(r6, r3)
        L3f:
            X.C14360o3.A0B(r0, r5)
            r9.A01 = r0
            r9.A00 = r3
            return
        L47:
            X.2EY r2 = r4.A10
            X.2EY r1 = X.C2EY.A1i
            if (r2 != r1) goto L3f
            boolean r1 = r9.A08
            if (r1 != 0) goto L3f
            android.content.Context r0 = r8.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131964404(0x7f1331f4, float:1.9565589E38)
            java.lang.String r0 = r1.getString(r0)
            goto L3f
        L5f:
            if (r7 <= r1) goto L71
            android.content.Context r0 = r8.A00
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131964402(0x7f1331f2, float:1.9565585E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            goto L18
        L71:
            java.lang.String r0 = r9.A06
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KZQ.A00(X.KZQ, X.Jvo):void");
    }

    public KZQ(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        super("Direct", C4A8.A00(1316016357));
        this.A02 = userSession;
        this.A00 = context;
        this.A04 = AbstractC28761aE.A00(userSession);
        this.A03 = new LE1(interfaceC11380iw, userSession);
        C008002u A00 = C10E.A00(KQU.A00);
        this.A05 = A00;
        this.A06 = AbstractC208910l.A02(A00);
        this.A01 = AbstractC166177bl.A00(C92674Dc.A00);
    }
}
