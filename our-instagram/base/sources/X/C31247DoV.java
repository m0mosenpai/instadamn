package X;

import com.instagram.common.notifications.push.intf.PushChannelType;
import java.util.Date;

/* renamed from: X.DoV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31247DoV extends C1P1 {
    public final PushChannelType A00;
    public final C31404Dr9 A01;
    public final C31406DrB A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public C31247DoV(PushChannelType pushChannelType, AbstractC12990ll abstractC12990ll, C31404Dr9 c31404Dr9, C31406DrB c31406DrB, String str, String str2, boolean z) {
        this.A03 = str;
        this.A00 = pushChannelType;
        this.A06 = z;
        this.A01 = c31404Dr9;
        this.A05 = abstractC12990ll.getToken();
        this.A02 = c31406DrB;
        this.A04 = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r13 != null) goto L7;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFail(X.AbstractC115105If r13) {
        /*
            r12 = this;
            r0 = -1631467676(0xffffffff9ec1c764, float:-2.0517136E-20)
            int r2 = X.C0f9.A03(r0)
            X.DrB r1 = r12.A02
            java.lang.String r10 = r12.A04
            r0 = 1
            X.C14360o3.A0B(r10, r0)
            r6 = 0
            if (r13 == 0) goto L45
            X.1up r0 = X.AbstractC31172DnG.A0L(r13)
            if (r0 == 0) goto L45
            java.lang.String r5 = r0.getErrorMessage()
        L1c:
            java.lang.Throwable r0 = r13.A01()
            if (r0 == 0) goto L26
            java.lang.String r6 = r0.toString()
        L26:
            java.lang.String r4 = "registration_result_received"
            r11 = 0
            java.lang.String r7 = r1.A01
            java.lang.String r8 = r1.A03
            java.lang.String r9 = r1.A02
            X.0wW r3 = r1.A00
            X.AbstractC31240DoN.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.Dr9 r0 = r12.A01
            if (r0 == 0) goto L3e
            X.0Jm r1 = r0.A01
            r0 = 0
            r1.AIn(r0)
        L3e:
            r0 = -628076546(0xffffffffda904ffe, float:-2.0310174E16)
            X.C0f9.A0A(r0, r2)
            return
        L45:
            r5 = r6
            if (r13 == 0) goto L26
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31247DoV.onFail(X.5If):void");
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(928600001);
        int A032 = C0f9.A03(-2066554949);
        PushChannelType pushChannelType = this.A00;
        C31406DrB c31406DrB = this.A02;
        String str = this.A04;
        C14360o3.A0B(str, 0);
        AbstractC31240DoN.A00(c31406DrB.A00, "registration_result_received", null, null, c31406DrB.A01, c31406DrB.A03, c31406DrB.A02, str, true);
        if (this.A06) {
            C3JG.A01();
            C19740y2 A0Q = AbstractC31171DnF.A0Q();
            long time = new Date().getTime();
            String str2 = pushChannelType.A01;
            C14360o3.A0B(str2, 1);
            InterfaceC19610xo A0P = AbstractC31171DnF.A0P(A0Q);
            A0P.E7G(AnonymousClass001.A0R("push_reg_date", str2), time);
            A0P.apply();
        }
        String str3 = pushChannelType.A01;
        long time2 = new Date().getTime();
        C18720vz c18720vz = AbstractC12960li.A00;
        InterfaceC19610xo A0P2 = AbstractC31171DnF.A0P(AbstractC19730y1.A00(c18720vz));
        A0P2.E7G("last_push_token_successful_refresh", time2);
        A0P2.apply();
        C19740y2 A00 = AbstractC19730y1.A00(c18720vz);
        String str4 = this.A03;
        AbstractC25230BEn.A15(1, str4, str3);
        InterfaceC19610xo A0P3 = AbstractC31171DnF.A0P(A00);
        A0P3.E7K(AnonymousClass001.A0R("push_token_", str3), str4);
        A0P3.apply();
        InterfaceC19610xo A0P4 = AbstractC31171DnF.A0P(AbstractC19730y1.A00(c18720vz));
        A0P4.E7G(AnonymousClass001.A0R("last_push_token_successful_refresh", str3), time2);
        A0P4.apply();
        C31404Dr9 c31404Dr9 = this.A01;
        if (c31404Dr9 != null) {
            c31404Dr9.A01.AIn(null);
        }
        C41451vu.A01.E4s(new C71903Kn(this.A05));
        C0f9.A0A(-2146666383, A032);
        C0f9.A0A(1067706687, A03);
    }
}
