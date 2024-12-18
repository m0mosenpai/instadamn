package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.94G, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C94G implements C94A {
    public final C0JM A00;
    public final InterfaceC73603Rm A01;
    public final C94E A02;
    public final C3RU A03;
    public final C4QF A04;
    public final C94N A05;
    public final InterfaceC09390do A06;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (r11.A00.now() >= (((java.lang.Number) r1.A00).longValue() + (r2.BtZ() * com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS))) goto L10;
     */
    @Override // X.C94A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void COI() {
        /*
            r11 = this;
            X.3RU r2 = r11.A03
            boolean r0 = r2.Car()
            if (r0 != 0) goto Lc
            r11.cleanup()
        Lb:
            return
        Lc:
            X.3Rm r4 = r11.A01
            java.lang.String r3 = "IG_SCROLLING_SPEED"
            X.3SN r1 = r4.EKt(r3)
            boolean r0 = r1.A02
            if (r0 == 0) goto L33
            java.lang.Object r0 = r1.A00
            java.lang.Number r0 = (java.lang.Number) r0
            long r9 = r0.longValue()
            X.0JM r0 = r11.A00
            long r7 = r0.now()
            long r5 = r2.BtZ()
            r0 = 60000(0xea60, double:2.9644E-319)
            long r5 = r5 * r0
            long r9 = r9 + r5
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L5b
        L33:
            X.94E r1 = r11.A02
            X.Jxs r0 = X.AD6.A00(r2)
            X.3SN r1 = r1.A00(r0)
            boolean r0 = r1.A02
            if (r0 == 0) goto L5b
            java.lang.Object r1 = r1.A00
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L5b
            r0 = 0
            java.lang.Object r2 = r1.get(r0)
            com.facebook.odin.model.Example r2 = (com.facebook.odin.model.Example) r2
            X.0JM r0 = r11.A00
            long r0 = r0.now()
            r4.Eot(r2, r3, r0)
        L5b:
            X.0do r0 = r11.A06
            java.lang.Object r2 = r0.getValue()
            X.3SD r2 = (X.C3SD) r2
            r1 = 0
            com.facebook.odin.model.OdinContext r0 = com.facebook.odin.model.OdinContext.A05
            X.3SN r0 = r2.E59(r1, r0)
            java.lang.Object r1 = r0.A00
            java.lang.Number r1 = (java.lang.Number) r1
            r1.doubleValue()
            boolean r0 = r0.A02
            if (r0 == 0) goto Lb
            X.4QF r4 = r11.A04
            double r2 = r1.doubleValue()
            float r1 = (float) r2
            java.lang.String r0 = "Result"
            r4.A04(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94G.COI():void");
    }

    @Override // X.C94A
    public final void cleanup() {
        this.A04.A03("Result");
    }

    public C94G(UserSession userSession, Context context) {
        this.A04 = C94H.A00(userSession).A00;
        this.A03 = new AnonymousClass944(userSession);
        this.A02 = C94J.A00(userSession).A00;
        C14360o3.A0B(userSession, 0);
        this.A01 = ((C94L) userSession.A01(C94L.class, new C57545PgJ(userSession, 30))).A00;
        C03250Di c03250Di = C03250Di.A00;
        C14360o3.A07(c03250Di);
        this.A00 = c03250Di;
        this.A05 = new C94N();
        this.A06 = AbstractC09440dt.A01(new C9FP(5, context, this, userSession));
    }
}
