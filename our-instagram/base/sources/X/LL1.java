package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class LL1 {
    public static void A01(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C47373KwO c47373KwO, EnumC65855TvH enumC65855TvH, VG2 vg2, MRA mra, String str, String str2, String str3, String str4, String str5, List list, boolean z, boolean z2, boolean z3) {
        String str6;
        AbstractC13880nE.A0K(activity);
        WEz A01 = AbstractC69993VzD.A01(activity, interfaceC11380iw, userSession, enumC65855TvH, vg2, str3);
        A01.A01 = AbstractC31174DnI.A0k(userSession, str);
        A01.A08(mra);
        A01.A0D = z;
        A01.A0C = z2;
        A01.A06 = str2;
        A01.A04 = str4;
        if (z3) {
            str6 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str6 = null;
        }
        A01.A09(MSV.A00(488), str6);
        A01.A09("messages_to_load", str5);
        A01.A08 = list;
        WEz.A00(null, A01);
        if (c47373KwO != null) {
            c47373KwO.A00.A04.D0E();
        }
    }

    public static void A02(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C47373KwO c47373KwO, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        String str4;
        EnumC65855TvH enumC65855TvH;
        VG2 vg2;
        if (str3 == null) {
            C0w9.A04("Invalid DirectThread", "DirectReportUtil.showReportDirectMessage", 1);
            return;
        }
        String str5 = null;
        if (!z2) {
            str5 = A00(userSession, str3);
            str4 = AnonymousClass001.A0g(str3, "_", str);
            enumC65855TvH = EnumC65855TvH.A0T;
            vg2 = VG2.A0H;
        } else {
            str4 = "DUMMY";
            enumC65855TvH = EnumC65855TvH.A0X;
            vg2 = VG2.A0J;
        }
        A01(activity, interfaceC11380iw, userSession, c47373KwO, enumC65855TvH, vg2, new C46100Kb0(1, activity, c47373KwO), str2, str, str4, str3, str5, null, z, z2, z3);
    }

    public static String A00(UserSession userSession, String str) {
        C2DS A00;
        C81663kb A0h;
        if (C18U.A06(C06090Tz.A05, userSession, 36323247091887202L) && (A0h = AbstractC31172DnG.A0h((A00 = C2JD.A00(userSession)), str)) != null) {
            return AnonymousClass001.A03(A00.Ab7(A0h.BKb(), true).size(), "");
        }
        return null;
    }

    public static void A03(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, DirectPromptTypes directPromptTypes, EnumC65855TvH enumC65855TvH, VG2 vg2, String str, String str2, String str3, String str4) {
        if (str4 == null || str == null || (directPromptTypes != DirectPromptTypes.A05 && str2 == null)) {
            C0w9.A04("Invalid DirectThread", "DirectReportUtil.showReportDirectMessage", 1);
            return;
        }
        AbstractC13880nE.A0K(activity);
        WEz A01 = AbstractC69993VzD.A01(activity, interfaceC11380iw, userSession, enumC65855TvH, vg2, str);
        A01.A0E = true;
        A01.A07(EnumC39619HeT.A06);
        A01.A01 = AbstractC31174DnI.A0k(userSession, str3);
        A01.A08(new C33312Eo7(activity, 1));
        A01.A09("responsible_user_id", str3);
        A01.A09("igd_thread_item_id", str2);
        A01.A09(AbstractC111324zv.A00(2513), str4);
        WEz.A00(null, A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (X.C161857Mv.A02.A03(r29, r24.Aic()) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(final android.app.Activity r27, final X.InterfaceC11380iw r28, final com.instagram.common.session.UserSession r29, final X.MRA r30, final java.lang.String r31, java.lang.String r32, int r33, boolean r34, final boolean r35, boolean r36) {
        /*
            r15 = r32
            if (r32 == 0) goto L66
            X.0Tz r2 = X.C06090Tz.A06
            r7 = r29
            r19 = r35
            if (r35 == 0) goto L67
            r0 = 36316976439694069(0x810619000112f5, double:3.03034036496432E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 != 0) goto L72
        L17:
            r29 = 0
        L19:
            X.3kb r24 = X.AbstractC43594JPz.A0d(r7, r15)
            r5 = r27
            r6 = r28
            r11 = r30
            r12 = r31
            if (r24 == 0) goto L75
            r0 = 4
            r1 = r33
            if (r1 == r0) goto L3a
            if (r36 != 0) goto L3a
            X.3kW r1 = r24.Aic()
            X.7Mw r0 = X.C161857Mv.A02
            boolean r0 = r0.A03(r7, r1)
            if (r0 == 0) goto L75
        L3a:
            java.lang.String r4 = r24.C7I()
            r4.getClass()
            X.M9H r3 = new X.M9H
            r20 = r3
            r21 = r5
            r22 = r6
            r23 = r7
            r25 = r11
            r26 = r12
            r27 = r4
            r28 = r19
            r20.<init>()
            r2 = 0
            X.0nS r1 = X.C14120nc.A00()
            X.C14360o3.A07(r1)
            X.KMM r0 = new X.KMM
            r0.<init>(r7, r4, r2, r3)
            r1.ATO(r0)
        L66:
            return
        L67:
            r0 = 36316976439628532(0x810619000012f4, double:3.030340364922874E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 == 0) goto L17
        L72:
            r29 = 1
            goto L19
        L75:
            r16 = 0
            if (r35 != 0) goto L7d
            java.lang.String r16 = A00(r7, r15)
        L7d:
            r8 = 0
            if (r29 == 0) goto L9c
            java.lang.String r0 = "_"
            java.lang.String r14 = X.AnonymousClass001.A0g(r15, r0, r12)
        L86:
            if (r35 == 0) goto L97
            X.TvH r9 = X.EnumC65855TvH.A0s
            X.VG2 r10 = X.VG2.A0J
        L8c:
            r20 = 0
            r18 = r34
            r13 = r8
            r17 = r8
            A01(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        L97:
            X.TvH r9 = X.EnumC65855TvH.A0U
            X.VG2 r10 = X.VG2.A0I
            goto L8c
        L9c:
            r14 = r15
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LL1.A04(android.app.Activity, X.0iw, com.instagram.common.session.UserSession, X.MRA, java.lang.String, java.lang.String, int, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6, 2342161871153535715L) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6, 36318861935909558L) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A05(com.instagram.common.session.UserSession r6, java.lang.String r7) {
        /*
            X.3kb r5 = X.AbstractC43594JPz.A0d(r6, r7)
            r4 = 0
            if (r5 == 0) goto L51
            X.C161867Mw.A00(r6)
            X.3kW r0 = r5.Aic()
            boolean r0 = X.C161867Mw.A02(r0)
            if (r0 == 0) goto L22
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318861935909558(0x8107d000561ab6, double:3.031532760363279E-306)
            boolean r1 = X.C18U.A06(r2, r6, r0)
            r0 = 1
            if (r1 != 0) goto L23
        L22:
            r0 = 0
        L23:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            X.3kW r0 = r5.Aic()
            boolean r0 = X.C161867Mw.A01(r6, r0)
            if (r0 == 0) goto L3f
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 2342161871153535715(0x208107d000921ae3, double:4.064620901762131E-152)
            boolean r1 = X.C18U.A06(r2, r6, r0)
            r0 = 1
            if (r1 != 0) goto L40
        L3f:
            r0 = 0
        L40:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r3.booleanValue()
            if (r0 != 0) goto L50
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L51
        L50:
            r4 = 1
        L51:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LL1.A05(com.instagram.common.session.UserSession, java.lang.String):boolean");
    }
}
