package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import com.instagram.rtc.signaling.notifications.service.RtcCallActionIntentHandlerService;

/* renamed from: X.1WB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1WB extends C1WE implements C1WF {
    public boolean A00;
    public final Context A01;
    public final Handler A02;
    public final C12N A03;
    public final C1W4 A04;
    public final C1W6 A05;
    public final AbstractC27671Vv A06;
    public final C1CM A07;
    public final InterfaceC09390do A08;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r3 != null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.InterfaceC58275PsT r10, com.instagram.common.session.UserSession r11, com.instagram.rtc.signaling.models.RtcConnectionEntity r12, X.C1WB r13) {
        /*
            r8 = r13
            android.content.Context r0 = r13.A01
            android.content.Context r0 = r0.getApplicationContext()
            X.C14360o3.A07(r0)
            java.lang.String r2 = r12.Bl4()
            X.A2H.A00(r11, r2)
            X.Oa2 r0 = X.C55051Oa2.A00
            r6 = r10
            boolean r0 = r0.A01(r10, r12)
            if (r0 == 0) goto L6e
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r1 = X.OPw.A00(r12)
            java.lang.String r0 = "com.instagram.rtc.signaling.processor.entity_id"
            r4.putString(r0, r1)
            boolean r0 = r12 instanceof com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity
            r10 = 0
            if (r0 == 0) goto L6c
            r7 = r12
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r7 = (com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity) r7
            if (r7 == 0) goto L3a
            java.lang.String r3 = r7.A0C
            if (r3 != 0) goto L3c
            java.lang.String r3 = r7.A0A
            if (r3 != 0) goto L3c
        L3a:
            java.lang.String r3 = ""
        L3c:
            r0 = 0
            if (r7 == 0) goto L48
            X.Neq r1 = r7.A01
            if (r1 == 0) goto L69
            X.Neq r0 = X.EnumC53137Neq.A03
            if (r1 == r0) goto L69
            r0 = 1
        L48:
            r9 = r10
            if (r0 == 0) goto L4f
            if (r7 == 0) goto L4f
            java.lang.String r10 = r7.A0E
        L4f:
            X.Pjj r5 = new X.Pjj
            r5.<init>(r6, r7, r8, r9, r10)
            X.AbstractC54159Nwv.A00(r2, r5)
            X.1W6 r2 = r13.A05
            java.lang.String r1 = X.OPw.A00(r12)
            r0 = 1
            X.C14360o3.A0B(r1, r0)
            r0 = 2
            X.C14360o3.A0B(r3, r0)
            X.C1W6.A02(r4, r11, r2, r1)
            return
        L69:
            java.lang.String r9 = r7.A0J
            goto L4f
        L6c:
            r7 = r10
            goto L3a
        L6e:
            java.lang.String r0 = "invalid transition"
            r10.AUk(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1WB.A00(X.PsT, com.instagram.common.session.UserSession, com.instagram.rtc.signaling.models.RtcConnectionEntity, X.1WB):void");
    }

    @Override // X.C1WE
    public final String A0C() {
        return "video_call_incoming";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(X.InterfaceC58275PsT r31, com.instagram.common.session.UserSession r32, X.C55144Od3 r33, int r34) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1WB.A0E(X.PsT, com.instagram.common.session.UserSession, X.Od3, int):void");
    }

    public final void A0G(UserSession userSession, byte[] bArr, int i, boolean z) {
        OXE.A00.A00("RtcCallSignalingProcessor", AnonymousClass001.A0S("receivedMultiwaySignalingMessage(", userSession.userId, ')'));
        this.A06.A00(this.A01, userSession).A0B(bArr, i, 0, z);
    }

    @Override // X.C1WF
    public final void Cwp(Bundle bundle, UserSession userSession, String str) {
        RtcConnectionEntity A00;
        C14360o3.A0B(bundle, 2);
        OXE oxe = OXE.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("onAnswer(");
        sb.append(str);
        sb.append(", ");
        sb.append(bundle);
        sb.append(')');
        oxe.A00("RtcCallSignalingProcessor", sb.toString());
        String string = bundle.getString("com.instagram.rtc.signaling.processor.entity_id");
        if (string != null && (A00 = C55051Oa2.A00(string)) != null) {
            C55051Oa2.A01.put(OPw.A00(A00), A00);
            try {
                PendingIntent A002 = AbstractC54165Nx1.A00(this.A01, userSession, A00);
                if (A002 != null) {
                    A002.send();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            } catch (PendingIntent.CanceledException e) {
                oxe.A02("RtcCallSignalingProcessor", "Error sending pending Intent", e);
            }
        }
    }

    @Override // X.C1WF
    public final void DAZ(Bundle bundle, UserSession userSession, String str) {
        RtcConnectionEntity A00;
        C14360o3.A0B(bundle, 2);
        OXE oxe = OXE.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("onDisconnect(");
        sb.append(str);
        sb.append(", ");
        sb.append(bundle);
        sb.append(')');
        oxe.A00("RtcCallSignalingProcessor", sb.toString());
        String string = bundle.getString("com.instagram.rtc.signaling.processor.entity_id");
        if (string != null && (A00 = C55051Oa2.A00(string)) != null) {
            C55051Oa2.A01.put(OPw.A00(A00), A00);
            Context context = this.A01;
            C14360o3.A0B(context, 0);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("com.instagram.rtc.notifications.service.entity", A00);
            Intent intent = new Intent(context, (Class<?>) RtcCallActionIntentHandlerService.class);
            intent.setAction("DECLINE");
            intent.putExtras(bundle2);
            C12260kU.A01(context, intent);
        }
    }

    @Override // X.C1WF
    public final void DeU(Bundle bundle, UserSession userSession, String str) {
        C14360o3.A0B(bundle, 2);
        OXE oxe = OXE.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("onReject(");
        sb.append(str);
        sb.append(", ");
        sb.append(bundle);
        sb.append(')');
        oxe.A00("RtcCallSignalingProcessor", sb.toString());
        DAZ(bundle, userSession, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006a, code lost:
    
        if (r2 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006c, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
    
        if ((r7 instanceof com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        r0 = (com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        r3 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        if (r3 == X.EnumC53137Neq.A03) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r13.A05(X.C55188Odt.class) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (r13.isStopped() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r1 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        if (r2 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bf, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r13, 36310314945413132L) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
    
        r13.A01(X.C54678ODe.class, new X.C50156MDj(r13, 37));
        r0 = X.C218914p.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
    
        X.AbstractC23641Du.A03(X.C05F.A00, X.AnonymousClass191.A00, new com.instagram.rtc.signaling.processor.RtcCallSignalingProcessor$onShowIncomingUI$1(r5, r13, r7, r11, null, r10), X.AnonymousClass194.A02(r11.A03.AOT(1894003928, 1).plus(new X.AnonymousClass197(null))));
     */
    @Override // X.C1WF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dm0(android.os.Bundle r12, com.instagram.common.session.UserSession r13, java.lang.String r14) {
        /*
            r11 = this;
            r0 = 2
            X.C14360o3.A0B(r12, r0)
            X.OXE r2 = X.OXE.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "onShowIncomingUI("
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = ") | forBGAccount: "
            r1.append(r0)
            r6 = r13
            boolean r0 = r13.isStopped()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "RtcCallSignalingProcessor"
            r9 = 0
            r3 = r9
            r2.A00(r0, r1)
            java.lang.String r0 = "com.instagram.rtc.signaling.processor.entity_id"
            java.lang.String r0 = r12.getString(r0)
            if (r0 == 0) goto Lcf
            com.instagram.rtc.signaling.models.RtcConnectionEntity r7 = X.C55051Oa2.A00(r0)
            if (r7 == 0) goto Lcf
            X.OAl r0 = X.AbstractC54155Nwr.A00(r13)
            java.lang.Long r1 = r7.CA5()
            X.Pqn r0 = r0.A01
            X.PsT r5 = r0.BXS(r1)
            java.util.concurrent.ConcurrentMap r1 = X.C55051Oa2.A01
            java.lang.String r0 = X.OPw.A00(r7)
            r1.put(r0, r7)
            boolean r2 = r7 instanceof com.instagram.rtc.signaling.models.RtcConnectionEntity.LiveInviteConnectionEntity
            X.Nfi r4 = X.EnumC53186Nfi.A08
            java.util.Collection r1 = r1.values()
            if (r1 == 0) goto Ld0
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld0
        L69:
            r10 = 1
            if (r2 == 0) goto L6d
        L6c:
            r10 = 0
        L6d:
            boolean r0 = r7 instanceof com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity
            if (r0 == 0) goto L78
            r0 = r7
            com.instagram.rtc.signaling.models.RtcConnectionEntity$RtcCallConnectionEntity r0 = (com.instagram.rtc.signaling.models.RtcConnectionEntity.RtcCallConnectionEntity) r0
            if (r0 == 0) goto L78
            X.Neq r3 = r0.A01
        L78:
            X.Neq r0 = X.EnumC53137Neq.A03
            r1 = 0
            if (r3 == r0) goto L7e
            r1 = 1
        L7e:
            java.lang.Class<X.Odt> r0 = X.C55188Odt.class
            boolean r0 = r13.A05(r0)
            if (r0 == 0) goto L90
            boolean r0 = r13.isStopped()
            if (r0 == 0) goto L8e
            if (r1 != 0) goto L90
        L8e:
            if (r2 == 0) goto Lb4
        L90:
            r8 = r11
            X.12N r2 = r11.A03
            r1 = 1894003928(0x70e434d8, float:5.6501173E29)
            r0 = 1
            X.0nZ r1 = r2.AOT(r1, r0)
            X.1Iw r0 = new X.1Iw
            r0.<init>(r9)
            X.12W r0 = r1.plus(r0)
            X.19K r2 = X.AnonymousClass194.A02(r0)
            com.instagram.rtc.signaling.processor.RtcCallSignalingProcessor$onShowIncomingUI$1 r4 = new com.instagram.rtc.signaling.processor.RtcCallSignalingProcessor$onShowIncomingUI$1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.191 r1 = X.AnonymousClass191.A00
            java.lang.Integer r0 = X.C05F.A00
            X.AbstractC23641Du.A03(r0, r1, r4, r2)
        Lb4:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36310314945413132(0x81000a0001000c, double:3.026127609157371E-306)
            boolean r0 = X.C18U.A06(r2, r13, r0)
            if (r0 == 0) goto Lcf
            r0 = 37
            X.MDj r1 = new X.MDj
            r1.<init>(r13, r0)
            java.lang.Class<X.ODe> r0 = X.C54678ODe.class
            r13.A01(r0, r1)
            boolean r0 = X.C218914p.A05
        Lcf:
            return
        Ld0:
            java.util.Iterator r1 = r1.iterator()
        Ld4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r1.next()
            com.instagram.rtc.signaling.models.RtcConnectionEntity r0 = (com.instagram.rtc.signaling.models.RtcConnectionEntity) r0
            X.Nfi r0 = r0.C01()
            if (r0 != r4) goto Ld4
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1WB.Dm0(android.os.Bundle, com.instagram.common.session.UserSession, java.lang.String):void");
    }

    public /* synthetic */ C1WB(Context context, C1W4 c1w4, C1W6 c1w6, AbstractC27671Vv abstractC27671Vv) {
        C1CM c1cm = new C1CM(context);
        C14360o3.A0B(c1w4, 2);
        C14360o3.A0B(c1w6, 3);
        this.A06 = abstractC27671Vv;
        this.A04 = c1w4;
        this.A05 = c1w6;
        this.A01 = context;
        this.A07 = c1cm;
        c1w6.A01.add(this);
        this.A03 = C12L.A00;
        this.A02 = new Handler(Looper.getMainLooper());
        this.A08 = AbstractC09440dt.A01(new C9EU(this, 34));
    }

    public static final boolean A02(EnumC53186Nfi enumC53186Nfi, String str) {
        C55051Oa2 c55051Oa2 = C55051Oa2.A00;
        RtcConnectionEntity A00 = C55051Oa2.A00(str);
        if (A00 == null) {
            return false;
        }
        OXE oxe = OXE.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("transitionToState ");
        sb.append(enumC53186Nfi);
        sb.append(" from ");
        sb.append(A00.C01());
        oxe.A01("RtcCallSignalingProcessor", sb.toString());
        return c55051Oa2.A01(null, AES.A00(enumC53186Nfi, A00, A00.BXN()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0234, code lost:
    
        if (r4 == null) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0238  */
    /* JADX WARN: Type inference failed for: r0v37, types: [X.0Jk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.0ps, java.lang.Object] */
    @Override // X.C1WE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0D(X.C116155Nu r25, X.AbstractC12990ll r26, X.L85 r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1WB.A0D(X.5Nu, X.0ll, X.L85, java.lang.String):void");
    }

    public final void A0F(UserSession userSession, byte[] bArr, int i, int i2) {
        String str;
        RtcConnectionEntity.RtcCallConnectionEntity A04;
        EnumC53137Neq enumC53137Neq;
        OXE.A00.A00("RtcCallSignalingProcessor", AnonymousClass001.A0S("handleMultiwaySignalingMessage(", userSession.userId, ')'));
        InterfaceC58275PsT Eng = AbstractC54155Nwr.A00(userSession).A01.Eng();
        Context context = this.A01;
        C55144Od3 c55144Od3 = new C55144Od3(new OX7(context).A03(bArr), null);
        A0E(Eng, userSession, c55144Od3, i);
        Integer A03 = c55144Od3.A03();
        boolean z = false;
        if (A03 != null && A03.intValue() == 4 && (((str = (String) c55144Od3.A02.getValue()) == null || str.length() == 0) && (((enumC53137Neq = (A04 = C55189Odv.A00.A04(context, Eng, userSession, c55144Od3)).A01) != null && enumC53137Neq != EnumC53137Neq.A03) || A04.A02 == EnumC53138Ner.A04))) {
            z = true;
        }
        this.A06.A00(context, userSession).A0B(bArr, i, i2, z);
    }

    public static final void A01(UserSession userSession, EnumC53186Nfi enumC53186Nfi, C1WB c1wb, String str) {
        RtcConnectionEntity A00 = C55051Oa2.A00(str);
        if (A00 != null) {
            C54610OAl A002 = AbstractC54155Nwr.A00(userSession);
            InterfaceC58275PsT BXS = A002.A01.BXS(A00.CA5());
            if (A02(enumC53186Nfi, str)) {
                OXE oxe = OXE.A00;
                StringBuilder sb = new StringBuilder();
                sb.append("dismissCallNotificationAndUpdate ");
                sb.append(A00.C01());
                oxe.A01("RtcCallSignalingProcessor", sb.toString());
                ((C55061OaG) c1wb.A08.getValue()).A02(OPw.A01(A00));
                c1wb.A05.A05(OPw.A00(A00), true, false);
                BXS.AIo("notif_removed");
                return;
            }
            BXS.AUk("invalid transition");
        }
    }
}
