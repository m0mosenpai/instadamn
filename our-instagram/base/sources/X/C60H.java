package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;

/* renamed from: X.60H, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C60H {
    public static final C60I A02 = new Object();
    public final InterfaceC02550Ad A00;
    public final AbstractC12990ll A01;

    public C60H(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        C19270xB c19270xB = new C19270xB("ArmadilloNotificationLogger");
        this.A01 = abstractC12990ll;
        this.A00 = AbstractC12220kQ.A01(c19270xB, abstractC12990ll);
    }

    public static final void A00(C60H c60h, Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        String str9;
        ArrayList arrayList = new ArrayList();
        if (C14360o3.A0K(bool2, true)) {
            arrayList.add(EnumC46302KeY.A04);
        }
        if (C14360o3.A0K(bool3, true)) {
            arrayList.add(EnumC46302KeY.A0G);
        }
        C18920wW c18920wW = (C18920wW) c60h.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "tincan_notifications_sync");
        A00.AAP("event_type", str);
        A00.AAP(TraceFieldType.MsgId, str6);
        A00.AAP("push_notif_id", str2);
        A00.AAP("wa_push_id", str3);
        A00.AAP("error_info", str5);
        A00.AAP("exception_type", null);
        AbstractC12990ll abstractC12990ll = c60h.A01;
        if (abstractC12990ll instanceof UserSession) {
            str8 = ((UserSession) abstractC12990ll).userId;
        } else {
            str8 = null;
        }
        Long l = null;
        A00.A9K(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str8 != null ? AbstractC003100w.A0k(10, str8) : null);
        A00.AAP("extra_info", str4);
        if (num != null) {
            l = Long.valueOf(num.intValue());
        }
        A00.A9K("render_type", l);
        A00.A7v("is_instamadillo", bool);
        A00.AAP("open_thread_id", str7);
        A00.AAk("feature_tags", arrayList);
        if (C0JA.A00().A04()) {
            str9 = "main-app";
        } else {
            str9 = "bg-process";
        }
        A00.AAP("process", str9);
        A00.Cht();
    }

    public static final void A01(C60H c60h, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5) {
        A00(c60h, bool, bool2, null, null, str, str2, str3, str4, null, null, str5);
    }

    public final void A02(C54s c54s, Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, String str3, String str4, String str5, boolean z) {
        C14360o3.A0B(str, 0);
        c54s.A0G("is_bg_account", z);
        A00(this, bool, bool2, bool3, num, str, null, str5, c54s.toString(), str3, str2, str4);
    }

    public final void A03(C54s c54s, Integer num, String str, String str2, String str3, boolean z) {
        A02(c54s, null, null, null, num, str, str2, str3, null, null, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b9, code lost:
    
        if (r20.A1U == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(X.C116155Nu r20, java.lang.String r21, java.lang.String r22, boolean r23) {
        /*
            r19 = this;
            r8 = 0
            r2 = r20
            X.C14360o3.A0B(r2, r8)
            r4 = 1
            java.lang.String r3 = r2.A0g
            if (r3 == 0) goto Lb3
            java.lang.String r0 = "ig_advanced_crypto_transport"
            r7 = 0
            r1 = 0
            boolean r5 = X.AbstractC001900j.A0a(r3, r0, r8)
            boolean r0 = r2.A05()
            java.lang.String r6 = "is_vanish_mode"
            if (r0 != 0) goto L27
            if (r5 != 0) goto L27
            boolean r0 = X.AbstractC001900j.A0a(r3, r6, r8)
            if (r0 != 0) goto L27
            boolean r0 = r2.A1S
            if (r0 == 0) goto Lb3
        L27:
            android.net.Uri r3 = X.AbstractC08820cl.A03(r3)
            X.C14360o3.A07(r3)
            boolean r0 = r2.A1S
            if (r0 == 0) goto Lbc
            X.Jxr r0 = r2.A05
            if (r0 == 0) goto L38
            java.lang.Object r1 = r0.A05
        L38:
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r0) goto Lbc
            java.lang.String r0 = "dx"
        L3e:
            java.lang.String r14 = r3.getQueryParameter(r0)
            if (r14 != 0) goto L46
            java.lang.String r14 = r2.A0s
        L46:
            java.lang.String r0 = r3.getQueryParameter(r6)
            if (r0 == 0) goto Lb6
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 != r4) goto Lb6
        L52:
            r3 = 1
        L53:
            X.45j r0 = X.C913045j.A00
            X.54s r8 = new X.54s
            r8.<init>(r0)
            r8.A0G(r6, r3)
            boolean r0 = r2.A05()
            if (r0 == r5) goto L70
            com.instagram.common.notifications.push.intf.PushChannelType r0 = r2.A0B
            java.lang.String r1 = r0.A01
            r0 = 192(0xc0, float:2.69E-43)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            r8.A0F(r0, r1)
        L70:
            boolean r0 = r2.A1S
            if (r0 == 0) goto Lb4
            java.lang.String r1 = r2.A0i
        L76:
            java.lang.String r0 = "2"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L88
            X.Jxr r0 = r2.A05
            if (r0 == 0) goto L89
            boolean r0 = r0.A00()
            if (r0 != r4) goto L89
        L88:
            r7 = 1
        L89:
            r12 = 0
            java.lang.String r1 = r2.A1G
            if (r1 != 0) goto L90
            java.lang.String r1 = r2.A1F
        L90:
            if (r1 != 0) goto L94
            java.lang.String r1 = ""
        L94:
            boolean r0 = r2.A1S
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r7)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = r2.A0U
            r7 = r19
            r13 = r21
            r15 = r22
            r18 = r23
            r16 = r1
            r17 = r0
            r7.A02(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        Lb3:
            return
        Lb4:
            r1 = 0
            goto L76
        Lb6:
            boolean r0 = r2.A1U
            r3 = 0
            if (r0 == 0) goto L53
            goto L52
        Lbc:
            java.lang.String r0 = "x"
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60H.A04(X.5Nu, java.lang.String, java.lang.String, boolean):void");
    }

    public final void A05(Boolean bool, String str, String str2, String str3, boolean z, boolean z2) {
        boolean z3 = false;
        if (str.length() != 0) {
            if (C14360o3.A0K(bool, true) || AbstractC001900j.A0a(str, "ig_advanced_crypto_transport", false) || AbstractC001900j.A0a(str, "is_vanish_mode", false)) {
                android.net.Uri A03 = AbstractC08820cl.A03(str);
                C14360o3.A07(A03);
                String queryParameter = A03.getQueryParameter("x");
                String queryParameter2 = A03.getQueryParameter("is_vanish_mode");
                if (queryParameter2 != null) {
                    z3 = Boolean.parseBoolean(queryParameter2);
                }
                C54s c54s = new C54s(C913045j.A00);
                c54s.A0G("is_vanish_mode", z3);
                A02(c54s, bool, Boolean.valueOf(z2), Boolean.valueOf(z3), null, str2, queryParameter, null, str3, null, z);
            }
        }
    }
}
