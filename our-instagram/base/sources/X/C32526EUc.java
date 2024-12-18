package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EUc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32526EUc extends C1P1 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AbstractC10360h2 A02;
    public final /* synthetic */ InterfaceC11380iw A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ User A05;
    public final /* synthetic */ Runnable A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ boolean A0E;

    public C32526EUc(Activity activity, View view, AbstractC10360h2 abstractC10360h2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, Runnable runnable, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        this.A0D = str;
        this.A00 = activity;
        this.A01 = view;
        this.A0C = str2;
        this.A0B = str3;
        this.A09 = str4;
        this.A0E = z;
        this.A07 = str5;
        this.A05 = user;
        this.A08 = str6;
        this.A03 = interfaceC11380iw;
        this.A04 = userSession;
        this.A0A = str7;
        this.A06 = runnable;
        this.A02 = abstractC10360h2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ac  */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r28) {
        /*
            r27 = this;
            r1 = r28
            r0 = 1105409254(0x41e334e6, float:28.40083)
            int r6 = X.C0f9.A03(r0)
            X.EBy r1 = (X.C32177EBy) r1
            r0 = -2134272939(0xffffffff80c99455, float:-1.8512146E-38)
            int r5 = X.C0f9.A03(r0)
            java.lang.String r4 = r1.A00
            android.os.Bundle r16 = X.AbstractC31180DnO.A03(r4)
            r7 = r27
            java.lang.String r3 = r7.A0D
            int r0 = r3.hashCode()
            java.lang.String r2 = "copy_link"
            java.lang.String r1 = "system_share_sheet"
            r13 = 1
            switch(r0) {
                case -1436108013: goto La4;
                case -916346253: goto La1;
                case -266143003: goto L91;
                case 284397090: goto L8e;
                case 389639919: goto L89;
                case 497130182: goto L86;
                case 1505434244: goto L74;
                case 1539093419: goto L71;
                case 1934780818: goto L6e;
                default: goto L28;
            }
        L28:
            com.instagram.common.session.UserSession r9 = r7.A04
            X.0Tz r8 = X.C06090Tz.A05
            r0 = 36323878452080296(0x810c6000002ea8, double:3.034705225389543E-306)
            java.lang.Boolean r0 = X.AbstractC166997dE.A0c(r8, r9, r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L48
            X.0iw r8 = r7.A03
            java.lang.String r1 = r7.A0A
            java.lang.String r0 = r7.A08
            r10 = r1
            r11 = r0
            r12 = r3
            r13 = r4
            X.AbstractC73317Y7a.A0J(r8, r9, r10, r11, r12, r13)
        L48:
            java.lang.String r10 = r7.A0A
            java.lang.String r1 = r7.A08
            com.instagram.user.model.User r0 = r7.A05
            java.lang.String r13 = r0.getId()
            X.0iw r8 = r7.A03
            r11 = r1
            r12 = r3
            r14 = r4
            X.AbstractC31510Dsu.A0W(r8, r9, r10, r11, r12, r13, r14)
            java.lang.Runnable r0 = r7.A06
            if (r3 == r2) goto L61
            r0.run()
        L61:
            r0 = -855138936(0xffffffffcd079d88, float:-1.42203E8)
            X.C0f9.A0A(r0, r5)
            r0 = -1120601127(0xffffffffbd34fbd9, float:-0.044185493)
            X.C0f9.A0A(r0, r6)
            return
        L6e:
            java.lang.String r0 = "whatsapp"
            goto La6
        L71:
            java.lang.String r0 = "barcelona"
            goto La6
        L74:
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L28
            android.app.Activity r8 = r7.A00
            X.AbstractC13900nG.A00(r8, r4)
            android.view.View r1 = r7.A01
            r0 = 0
            X.AbstractC34301FAv.A00(r8, r1, r0, r13)
            goto L28
        L86:
            java.lang.String r0 = "facebook"
            goto La6
        L89:
            boolean r0 = r3.equals(r1)
            goto Laa
        L8e:
            java.lang.String r0 = "snapchat"
            goto La6
        L91:
            java.lang.String r0 = "user_sms"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L28
            java.lang.String r1 = r7.A0C
            android.app.Activity r0 = r7.A00
            X.AbstractC35101FdC.A02(r0, r1, r4)
            goto L28
        La1:
            java.lang.String r0 = "twitter"
            goto La6
        La4:
            java.lang.String r0 = "messenger"
        La6:
            boolean r0 = r3.equals(r0)
        Laa:
            if (r0 == 0) goto L28
            java.lang.String r14 = r7.A0B
            java.lang.String r12 = r7.A09
            if (r3 == r1) goto Lb3
            r13 = 0
        Lb3:
            boolean r11 = r7.A0E
            android.app.Activity r15 = r7.A00
            java.lang.String r10 = r7.A07
            com.instagram.user.model.User r9 = r7.A05
            java.lang.String r8 = r7.A08
            X.0iw r1 = r7.A03
            com.instagram.common.session.UserSession r0 = r7.A04
            r26 = r11
            r24 = r8
            r25 = r13
            r23 = r10
            r22 = r4
            r21 = r12
            r20 = r14
            r19 = r9
            r18 = r0
            r17 = r1
            X.AbstractC31510Dsu.A02(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32526EUc.onSuccess(java.lang.Object):void");
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1102635288);
        super.onFail(abstractC115105If);
        UserSession userSession = this.A04;
        InterfaceC11380iw interfaceC11380iw = this.A03;
        String str = this.A0A;
        String str2 = this.A08;
        String str3 = this.A0D;
        AbstractC73317Y7a.A0H(interfaceC11380iw, userSession, str, str2, str3, abstractC115105If.A01());
        AbstractC31510Dsu.A0W(interfaceC11380iw, userSession, str, str2, str3, this.A05.getId(), null);
        Runnable runnable = this.A06;
        if (str3 != "copy_link") {
            runnable.run();
        }
        C0f9.A0A(-415410902, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-114551121);
        if (this.A0D != "copy_link") {
            C11T.A03(new GNA(this));
        }
        C0f9.A0A(660144988, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1147912122);
        if (this.A0D != "copy_link") {
            C11T.A03(new GN9(this));
        }
        C0f9.A0A(1583232183, A03);
    }
}
