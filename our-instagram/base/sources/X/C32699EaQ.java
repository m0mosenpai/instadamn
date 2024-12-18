package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import java.util.List;

/* renamed from: X.EaQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32699EaQ extends G1U {
    public boolean A00;
    public final FragmentActivity A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final InterfaceC09390do A06;
    public final boolean A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    @Override // X.InterfaceC37220GaV
    public final /* bridge */ /* synthetic */ CharSequence Ay2() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r0 != null) goto L36;
     */
    @Override // X.InterfaceC37220GaV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence B7n() {
        /*
            r7 = this;
            X.2EE r0 = r7.A02
            if (r0 == 0) goto L98
            java.lang.String r5 = r0.At6()
        L8:
            com.instagram.common.session.UserSession r2 = r7.A01
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36320438183731709(0x81093f000721fd, double:3.032529585833048E-306)
            boolean r0 = X.C18U.A06(r3, r2, r0)
            if (r0 == 0) goto L21
            android.content.Context r1 = r7.A00
            r0 = 2131954287(0x7f130a6f, float:1.9545069E38)
            java.lang.String r0 = X.AbstractC166997dE.A0p(r1, r0)
        L20:
            return r0
        L21:
            int r1 = r7.A00()
            r6 = 0
            r0 = 1
            if (r1 == 0) goto L6a
            if (r1 == r0) goto L7d
            r0 = 2
            if (r1 == r0) goto L62
            android.content.Context r4 = r7.A00
            r0 = 2131954227(0x7f130a33, float:1.9544947E38)
            android.text.SpannableStringBuilder r0 = X.AbstractC31175DnJ.A05(r4, r0)
        L37:
            X.18A r1 = X.AnonymousClass189.A00(r2)
            java.util.concurrent.ConcurrentMap r1 = r1.A02
            java.lang.Object r1 = r1.get(r5)
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            if (r1 == 0) goto L49
            boolean r6 = r1.isVerified()
        L49:
            if (r5 == 0) goto L20
            r3 = 0
            int r2 = X.AbstractC001900j.A08(r0, r5, r3, r3)
            r1 = -1
            if (r2 == r1) goto L20
            if (r6 == 0) goto L20
            int r2 = X.AbstractC001900j.A08(r0, r5, r3, r3)
            int r1 = r5.length()
            int r2 = r2 + r1
            X.C85963sQ.A03(r4, r0, r2)
            return r0
        L62:
            if (r5 == 0) goto L77
            android.content.Context r4 = r7.A00
            r0 = 2131954228(0x7f130a34, float:1.954495E38)
            goto L71
        L6a:
            if (r5 == 0) goto L77
            android.content.Context r4 = r7.A00
            r0 = 2131954255(0x7f130a4f, float:1.9545004E38)
        L71:
            java.lang.String r0 = X.AbstractC167007dF.A0f(r4, r5, r0)
            if (r0 != 0) goto L93
        L77:
            android.content.Context r4 = r7.A00
            r0 = 2131954227(0x7f130a33, float:1.9544947E38)
            goto L8f
        L7d:
            if (r5 == 0) goto L8a
            android.content.Context r4 = r7.A00
            r0 = 2131954255(0x7f130a4f, float:1.9545004E38)
            java.lang.String r0 = X.AbstractC167007dF.A0f(r4, r5, r0)
            if (r0 != 0) goto L93
        L8a:
            android.content.Context r4 = r7.A00
            r0 = 2131954256(0x7f130a50, float:1.9545006E38)
        L8f:
            java.lang.String r0 = X.AbstractC166997dE.A0p(r4, r0)
        L93:
            android.text.SpannableStringBuilder r0 = X.AbstractC25225BEi.A0H(r0)
            goto L37
        L98:
            r5 = 0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32699EaQ.B7n():java.lang.CharSequence");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (r5.equals(r0) == false) goto L15;
     */
    @Override // X.InterfaceC37220GaV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D8n() {
        /*
            r13 = this;
            X.2EE r3 = r13.A02
            if (r3 == 0) goto Lab
            X.0do r4 = r13.A06
            java.lang.Object r0 = r4.getValue()
            X.LEe r0 = (X.C47910LEe) r0
            X.02i r1 = r0.A00
            r2 = 31786177(0x1e504c1, float:8.4128136E-38)
            r1.markerStart(r2)
            java.lang.String r0 = "Join_Channel_Clicked"
            r1.markerPoint(r2, r0)
            com.instagram.user.model.User r0 = r3.At5()
            if (r0 == 0) goto Lb2
            boolean r12 = r0.A26()
            java.lang.Object r0 = r4.getValue()
            X.LEe r0 = (X.C47910LEe) r0
            X.02i r1 = r0.A00
            r0 = 0
            boolean r0 = r1.isMarkerOn(r2, r0)
            if (r0 != 0) goto L35
            r1.markerStart(r2)
        L35:
            java.lang.String r0 = "Join_Channel_Start"
            r1.markerPoint(r2, r0)
            X.EoN r0 = X.EnumC33328EoN.A03
            r13.A03(r0)
            java.lang.String r5 = r13.A04
            r9 = 0
            if (r5 == 0) goto Laf
            int r2 = r3.C7g()
            java.lang.String r0 = r3.Asv()
            r1 = 29
            if (r2 != r1) goto L57
            boolean r0 = r5.equals(r0)
            r9 = 1
            if (r0 != 0) goto L58
        L57:
            r9 = 0
        L58:
            r10 = 0
            int r0 = r3.C7g()
            if (r0 != r1) goto L6c
            java.util.List r0 = r3.BKN()
            if (r0 == 0) goto L6c
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L6c
            r10 = 1
        L6c:
            boolean r11 = X.C160857It.A07(r3, r5)
        L70:
            com.instagram.common.session.UserSession r0 = r13.A01
            X.6ck r1 = X.AbstractC147806l5.A00(r0)
            java.lang.String r2 = r13.A01()
            java.lang.String r3 = r13.A02()
            java.lang.String r4 = r13.A03
            int r7 = r13.A00()
            boolean r8 = r13.A07
            java.lang.String r6 = r13.A02
            r1.A0V(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.Fzy r2 = X.C36303Fzy.A00(r0)
            X.C14360o3.A07(r2)
            int r1 = r13.A00()
            r0 = 2
            if (r1 != r0) goto Lac
            X.Eri r0 = X.EnumC33509Eri.JOIN_SUBSCRIBER_BROADCAST_CHANNEL
        L9b:
            r3 = 0
            r2.A07(r0)
            X.19L r2 = r13.A03
            r1 = 32
            X.D4v r0 = new X.D4v
            r0.<init>(r13, r3, r1)
            X.AbstractC166987dD.A1Z(r0, r2)
        Lab:
            return
        Lac:
            X.Eri r0 = X.EnumC33509Eri.JOIN_BROADCAST_CHANNEL
            goto L9b
        Laf:
            r10 = 0
            r11 = 0
            goto L70
        Lb2:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32699EaQ.D8n():void");
    }

    @Override // X.InterfaceC37220GaV
    public final void DAx() {
        if (!this.A0A && !this.A00) {
            C142846ck A00 = AbstractC147806l5.A00(super.A01);
            String A01 = A01();
            String A02 = A02();
            int A002 = A00();
            C25531Mh A0I = AbstractC31172DnG.A0I(A00);
            if (AbstractC25226BEj.A1Z(A0I)) {
                AbstractC31175DnJ.A1B(A0I, A00);
                AbstractC31174DnI.A1I(A0I, "thread_join_cancel");
                A0I.A0o("back_button");
                A0I.A0h(AbstractC31179DnN.A0a(A0I, "broadcast_chat_preview", A01, A02, A002));
                A0I.Cht();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.1kW, X.1OW] */
    @Override // X.InterfaceC37220GaV
    public final void Djb() {
        String At6;
        C31368DqX A02;
        C2EE c2ee;
        String str = this.A04;
        if (str != null || ((c2ee = super.A02) != null && c2ee.At6() != null)) {
            UserSession userSession = super.A01;
            if (C7HD.A05(this.A03) && C18U.A06(C06090Tz.A05, userSession, 36327331605920252L)) {
                C142846ck A00 = AbstractC147806l5.A00(userSession);
                String A01 = A01();
                String A022 = A02();
                int A002 = A00();
                C25531Mh A0I = AbstractC31172DnG.A0I(A00);
                if (AbstractC25226BEj.A1Z(A0I)) {
                    AbstractC31175DnJ.A1B(A0I, A00);
                    AbstractC31174DnI.A1I(A0I, "profile_rendered");
                    A0I.A0o(AbstractC43591JPw.A00(1399));
                    A0I.A0h(AbstractC31179DnN.A0a(A0I, "broadcast_chat_preview", A01, A022, A002));
                    A0I.Cht();
                }
                if (str != null) {
                    A02 = AbstractC31402Dr6.A01(userSession, str, "direct_thread_channel_preview", "direct_thread_toggle");
                } else {
                    C2EE c2ee2 = super.A02;
                    if (c2ee2 == null || c2ee2.At6() == null || (At6 = c2ee2.At6()) == null) {
                        return;
                    } else {
                        A02 = AbstractC31402Dr6.A02(userSession, At6, "direct_thread_channel_preview", "direct_thread_toggle");
                    }
                }
                UserDetailLaunchConfig A03 = A02.A03();
                C140966Yy A0P = AbstractC31173DnH.A0P(this.A01, userSession);
                A0P.A0D(AbstractC31364DqT.A02().A02(userSession, A03));
                A0P.A04();
                return;
            }
        }
        this.A00 = true;
        UserSession userSession2 = super.A01;
        C142846ck A003 = AbstractC147806l5.A00(userSession2);
        String A012 = A01();
        String A023 = A02();
        int A004 = A00();
        C25531Mh A0I2 = AbstractC31172DnG.A0I(A003);
        if (AbstractC25226BEj.A1Z(A0I2)) {
            AbstractC31175DnJ.A1B(A0I2, A003);
            AbstractC31174DnI.A1I(A0I2, "thread_join_cancel");
            A0I2.A0o("decline_button");
            A0I2.A0h(AbstractC31179DnN.A0a(A0I2, "broadcast_chat_preview", A012, A023, A004));
            A0I2.Cht();
        }
        C2EE c2ee3 = super.A02;
        if (c2ee3 != null) {
            c2ee3.EWN(true);
            DirectThreadKey A013 = JRE.A01(c2ee3.BKb());
            if (A013 != null) {
                ?? c1ow = new C1OW(AbstractC31277Doz.A09(userSession2, C34911kW.class, 1));
                c1ow.A00 = A013;
                AbstractC31173DnH.A1U(userSession2, c1ow);
            }
        }
        A04(C32695EaM.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6, 36327331605920252L) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C32699EaQ(android.content.Context r4, androidx.fragment.app.FragmentActivity r5, com.instagram.common.session.UserSession r6, X.C2EE r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11, boolean r12) {
        /*
            r3 = this;
            r3.<init>(r4, r6, r7)
            r3.A01 = r5
            r3.A03 = r8
            r3.A07 = r11
            r3.A0A = r12
            r3.A04 = r9
            r3.A02 = r10
            r1 = 48
            X.GSy r0 = new X.GSy
            r0.<init>(r6, r1)
            X.0sx r0 = X.AbstractC09440dt.A01(r0)
            r3.A06 = r0
            r0 = 2131954265(0x7f130a59, float:1.9545024E38)
            java.lang.String r0 = X.AbstractC166997dE.A0p(r4, r0)
            r3.A08 = r0
            java.lang.String r0 = "via_push_notification"
            boolean r0 = X.C14360o3.A0K(r8, r0)
            if (r0 != 0) goto L6b
            java.lang.String r0 = "inbox_channel_invitation"
            boolean r0 = X.C14360o3.A0K(r8, r0)
            if (r0 != 0) goto L6b
            boolean r0 = X.C7HD.A05(r8)
            if (r0 == 0) goto L4b
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36327331605920252(0x810f84000239fc, double:3.036889013782666E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            r1 = 2131954289(0x7f130a71, float:1.9545073E38)
            if (r0 != 0) goto L4e
        L4b:
            r1 = 2131954269(0x7f130a5d, float:1.9545032E38)
        L4e:
            java.lang.String r0 = X.AbstractC166997dE.A0p(r4, r1)
            r3.A09 = r0
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320438183731709(0x81093f000721fd, double:3.032529585833048E-306)
            boolean r1 = X.C18U.A06(r2, r6, r0)
            r0 = 0
            if (r1 == 0) goto L68
            if (r7 == 0) goto L68
            java.util.List r0 = r7.ByV()
        L68:
            r3.A05 = r0
            return
        L6b:
            r1 = 2131954249(0x7f130a49, float:1.9544992E38)
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32699EaQ.<init>(android.content.Context, androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, X.2EE, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    @Override // X.InterfaceC37220GaV
    public final String Ata() {
        return this.A08;
    }

    @Override // X.InterfaceC37220GaV
    public final String BrR() {
        return this.A09;
    }
}
