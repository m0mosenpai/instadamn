package X;

import com.facebook.pushlite.model.PushInfraMetaData;

/* renamed from: X.JeB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44086JeB {
    public static final void A00(PushInfraMetaData pushInfraMetaData, Exception exc, String str, int i) {
        C14360o3.A0B(str, 0);
        C25531Mh A0K = C25531Mh.A0K(new C12210kP(AbstractC12960li.A00).A00());
        String A00 = AbstractC43595JQa.A00(i);
        String str2 = pushInfraMetaData.A06;
        if (str2 == null) {
            str2 = "0";
        }
        long A0t = AbstractC25232BEp.A0t(pushInfraMetaData.A01);
        A0K.A0R("notif_event", A00);
        A0K.A0R("channel", str);
        JQ0.A19(A0K, pushInfraMetaData, str2, A0t);
        A0K.A0R("extra_info", C2Ql.A00(exc));
        A0K.Cht();
    }

    public static final void A01(PushInfraMetaData pushInfraMetaData, String str, int i) {
        C14360o3.A0B(str, 0);
        C25531Mh A0K = C25531Mh.A0K(new C12210kP(AbstractC12960li.A00).A00());
        String A00 = AbstractC43595JQa.A00(i);
        String str2 = pushInfraMetaData.A06;
        if (str2 == null) {
            str2 = "0";
        }
        long A0t = AbstractC25232BEp.A0t(pushInfraMetaData.A01);
        if (C50C.A01(pushInfraMetaData)) {
            A0K.A0R("notif_event", A00);
            A0K.A0R("channel", str);
            JQ0.A19(A0K, pushInfraMetaData, str2, A0t);
            A0K.Cht();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
    
        if (X.C14360o3.A0K(((com.instagram.common.session.UserSession) r14).userId, r13.A0j) == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C116155Nu r13, X.AbstractC12990ll r14, java.lang.String r15, java.lang.String r16, int r17) {
        /*
            r3 = 1
            boolean r2 = r14 instanceof com.instagram.common.session.UserSession
            r6 = r13
            r12 = r15
            r13 = r17
            if (r2 == 0) goto L36
            java.lang.String r0 = r6.A0g
            if (r0 == 0) goto La1
            android.net.Uri r1 = X.AbstractC25227BEk.A0B(r0)
            java.lang.String r0 = "x"
            java.lang.String r9 = r1.getQueryParameter(r0)
        L17:
            r0 = r14
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.60L r7 = X.C60K.A00(r0)
            java.lang.String r10 = r6.A0w
            if (r10 != 0) goto L2f
            java.lang.String r1 = r6.A0X
            if (r1 == 0) goto L9c
            java.lang.String r0 = "direct_v2_delete_item"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9c
        L2e:
            r10 = r1
        L2f:
            java.lang.String r8 = r6.A12
            r11 = r16
            r7.A00(r8, r9, r10, r11, r12, r13)
        L36:
            r5 = 1
            if (r13 == r3) goto La4
            r0 = 3
            r1 = 5
            if (r13 == r0) goto L65
            if (r13 == r1) goto L65
            r0 = 6
            if (r13 == r0) goto L65
            r0 = 7
            if (r13 == r0) goto L65
            java.lang.String r4 = r6.A12
            X.C14360o3.A07(r4)
            boolean r0 = X.C44084Je9.A00(r6)
            if (r0 == 0) goto L64
            java.lang.String r3 = X.AbstractC43595JQa.A00(r13)
            com.facebook.quicklog.reliability.UserFlowLogger r2 = X.C44084Je9.A01
            r1 = 550451290(0x20cf385a, float:3.5104454E-19)
            int r0 = r4.hashCode()
            long r0 = r2.generateFlowId(r1, r0)
            r2.flowMarkPoint(r0, r3)
        L64:
            return
        L65:
            java.lang.String r2 = r6.A12
            X.C14360o3.A07(r2)
            if (r13 == r1) goto L6d
            r5 = 0
        L6d:
            boolean r0 = X.C44084Je9.A00(r6)
            if (r0 == 0) goto L64
            com.facebook.quicklog.reliability.UserFlowLogger r4 = X.C44084Je9.A01
            r1 = 550451290(0x20cf385a, float:3.5104454E-19)
            int r0 = r2.hashCode()
            long r2 = r4.generateFlowId(r1, r0)
            X.UQE r1 = X.C44084Je9.A00
            java.lang.String r0 = r1.A01
            r4.flowMarkPoint(r2, r0)
            java.lang.String r0 = "is_rendered"
            r4.flowAnnotate(r2, r0, r5)
            java.lang.String r0 = "suppress_reason"
            r4.flowAnnotate(r2, r0, r15)
            java.lang.String r1 = r1.A00
            java.lang.String r0 = "c"
            r4.flowAnnotateWithCrucialData(r2, r0, r1)
            r4.flowEndSuccess(r2)
            return
        L9c:
            java.lang.String r10 = r6.A11
            if (r10 == 0) goto L2e
            goto L2f
        La1:
            r9 = 0
            goto L17
        La4:
            X.Je9 r5 = X.C44084Je9.A02
            java.lang.String r7 = r6.A12
            X.C14360o3.A07(r7)
            r8 = 0
            java.lang.Integer r1 = r6.A0H
            java.lang.Integer r0 = r6.A0I
            if (r1 == 0) goto Ld9
            if (r0 == 0) goto Ld9
            int r10 = r1.intValue()
            int r0 = r0.intValue()
            int r10 = r10 - r0
        Lbd:
            if (r2 == 0) goto Lcc
            com.instagram.common.session.UserSession r14 = (com.instagram.common.session.UserSession) r14
            java.lang.String r1 = r14.userId
            java.lang.String r0 = r6.A0j
            boolean r0 = X.C14360o3.A0K(r1, r0)
            r11 = 1
            if (r0 != 0) goto Lcd
        Lcc:
            r11 = 0
        Lcd:
            boolean r12 = X.C218914p.A08()
            boolean r13 = r6.A1U
            java.lang.String r9 = "sync"
            r5.A01(r6, r7, r8, r9, r10, r11, r12, r13)
            return
        Ld9:
            r10 = 0
            goto Lbd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC44086JeB.A02(X.5Nu, X.0ll, java.lang.String, java.lang.String, int):void");
    }
}
