package com.instagram.direct.aiagent.navigation;

import X.AbstractC001800i;
import X.AbstractC09440dt;
import X.AbstractC140956Yx;
import X.AbstractC162267Oo;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC23021Ah;
import X.AbstractC25225BEi;
import X.AbstractC25233BEq;
import X.AbstractC31171DnF;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31179DnN;
import X.AbstractC31268Doq;
import X.AbstractC31271Dot;
import X.AbstractC68470VSb;
import X.C06090Tz;
import X.C0fJ;
import X.C122145g6;
import X.C14360o3;
import X.C18U;
import X.C1GJ;
import X.C1ON;
import X.C2DS;
import X.C2DU;
import X.C2EE;
import X.C32021E4z;
import X.C32531EUh;
import X.C35137Fee;
import X.C36327G0w;
import X.C36881nl;
import X.C37050GUg;
import X.C6WQ;
import X.C7F6;
import X.C81663kb;
import X.FR2;
import X.GXY;
import X.InterfaceC09390do;
import X.InterfaceC1119153d;
import X.InterfaceC11380iw;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.launcher.AutoSendMessageData;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.List;

/* loaded from: classes6.dex */
public final class AiAgentThreadLauncher {
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    public AiAgentThreadLauncher(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A03 = AbstractC09440dt.A01(new C37050GUg(this, 37));
        this.A02 = AbstractC09440dt.A01(new C37050GUg(this, 36));
        this.A04 = AbstractC09440dt.A01(new C37050GUg(this, 35));
        this.A01 = C37050GUg.A00(this, 34);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r1 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0065, code lost:
    
        if (r42 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0033, code lost:
    
        if (r46 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01(androidx.fragment.app.FragmentActivity r38, X.C32021E4z r39, X.InterfaceC11380iw r40, X.GXY r41, X.C2ED r42, X.InterfaceC83713oG r43, X.InterfaceC1119153d r44, java.lang.String r45, java.lang.String r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher.A01(androidx.fragment.app.FragmentActivity, X.E4z, X.0iw, X.GXY, X.2ED, X.3oG, X.53d, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public final void A04(Activity activity, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, String str, String str2, String str3) {
        AbstractC167007dF.A1F(str2, 3, str3);
        UserSession userSession = this.A00;
        if (AbstractC31171DnF.A1V(userSession, str2)) {
            C6WQ c6wq = new C6WQ(activity, true);
            C0fJ.A00(c6wq);
            new FR2(activity, userSession).A00(interfaceC11380iw, new C36327G0w(c6wq, 2), str2);
            return;
        }
        C122145g6 A00 = A00(imageUrl, str2, str3, false, false, true);
        C81663kb B3U = ((C2DS) this.A03.getValue()).B3U(AbstractC140956Yx.A01(A00));
        if (B3U == null || (B3U.C7I() == null && C18U.A06(C06090Tz.A05, userSession, 36329345945518369L))) {
            A09(activity, str3, str2);
        }
        if (str == null) {
            str = "direct_thread";
        }
        C36881nl A01 = C36881nl.A01(activity, interfaceC11380iw, userSession, str);
        A01.A0B = A00;
        A01.A0H = 1003;
        A01.A0s = true;
        A01.A06();
    }

    public final void A05(Activity activity, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, String str, String str2, String str3, String str4) {
        C14360o3.A0B(activity, 0);
        AbstractC167027dH.A13(interfaceC11380iw, str, imageUrl);
        C14360o3.A0B(str3, 5);
        A06(activity, interfaceC11380iw, imageUrl, str, str2, str3, null, str4, null);
    }

    public final void A09(Activity activity, String str, String str2) {
        C14360o3.A0B(str2, 1);
        UserSession userSession = this.A00;
        AbstractC23021Ah.A00(userSession).A13("has_initiated_chat_with_agent", true);
        C7F6 c7f6 = (C7F6) this.A02.getValue();
        c7f6.A06.markerPoint(C7F6.A00(c7f6), "create_server_thread_start");
        String str3 = c7f6.A01;
        C1ON A0C = DirectThreadApi.A0C(userSession, AbstractC68470VSb.A00(), str, AbstractC166987dD.A1J(str2));
        A0C.A00 = new C32531EUh(activity, this, str3, 2);
        C1GJ.A06(A0C, 315964894, 2, true, false);
    }

    public final boolean A0A(FragmentActivity fragmentActivity, C32021E4z c32021E4z, InterfaceC11380iw interfaceC11380iw, GXY gxy, DirectShareTarget directShareTarget, InterfaceC1119153d interfaceC1119153d, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str3;
        PendingRecipient pendingRecipient;
        boolean z6;
        boolean A1b = AbstractC25233BEq.A1b(fragmentActivity, directShareTarget, str);
        UserSession userSession = this.A00;
        if (!AbstractC31268Doq.A08(userSession) || (str3 = ((PendingRecipient) AbstractC001800i.A0I(AbstractC31175DnJ.A0f(directShareTarget))).A0B) == null) {
            return false;
        }
        String str4 = ((PendingRecipient) AbstractC001800i.A0I(AbstractC31175DnJ.A0f(directShareTarget))).A0A;
        C2DS c2ds = (C2DS) this.A03.getValue();
        DirectThreadKey A00 = directShareTarget.A00();
        C14360o3.A0B(A00, 0);
        C81663kb A03 = C2DU.A03((C2DU) c2ds, A00);
        if (A03 == null || (((A03 instanceof C2EE) && !A03.BBy()) || (A03.C7I() == null && C18U.A06(C06090Tz.A05, userSession, 36329345945518369L)))) {
            if (A02() && (pendingRecipient = (PendingRecipient) AbstractC001800i.A0J(AbstractC31175DnJ.A0f(directShareTarget))) != null && pendingRecipient.A0X == A1b) {
                z6 = false;
                A01(fragmentActivity, c32021E4z, interfaceC11380iw, gxy, A03, AbstractC31171DnF.A0O(directShareTarget), interfaceC1119153d, str, str2, z2, z, z3, z4, z6, z5);
                return A1b;
            }
            A09(null, str4, str3);
        }
        z6 = true;
        A01(fragmentActivity, c32021E4z, interfaceC11380iw, gxy, A03, AbstractC31171DnF.A0O(directShareTarget), interfaceC1119153d, str, str2, z2, z, z3, z4, z6, z5);
        return A1b;
    }

    public final boolean A0B(FragmentActivity fragmentActivity, C32021E4z c32021E4z, InterfaceC11380iw interfaceC11380iw, GXY gxy, DirectShareTarget directShareTarget, InterfaceC1119153d interfaceC1119153d, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        PendingRecipient pendingRecipient;
        boolean z6;
        C14360o3.A0B(fragmentActivity, 0);
        UserSession userSession = this.A00;
        String A00 = AbstractC31271Dot.A00(userSession);
        if (directShareTarget != null) {
            return A0A(fragmentActivity, c32021E4z, interfaceC11380iw, gxy, directShareTarget, interfaceC1119153d, str, str2, z, z2, z3, z4, z5);
        }
        if (!AbstractC31268Doq.A08(userSession)) {
            return false;
        }
        C122145g6 A002 = A00(AbstractC25225BEi.A0t(""), A00, "", false, false, false);
        List list = A002.A00;
        C81663kb A03 = C2DU.A03((C2DU) ((C2DS) this.A03.getValue()), new DirectThreadKey(list));
        if (A03 == null || (A03.C7I() == null && C18U.A06(C06090Tz.A05, userSession, 36329345945518369L))) {
            if (A02() && (pendingRecipient = (PendingRecipient) AbstractC001800i.A0J(list)) != null && pendingRecipient.A0X) {
                z6 = false;
                A01(fragmentActivity, c32021E4z, interfaceC11380iw, gxy, A03, A002, interfaceC1119153d, str, str2, z2, z, z3, z4, z6, z5);
                return true;
            }
            A09(fragmentActivity, null, A00);
        }
        z6 = true;
        A01(fragmentActivity, c32021E4z, interfaceC11380iw, gxy, A03, A002, interfaceC1119153d, str, str2, z2, z, z3, z4, z6, z5);
        return true;
    }

    public static final C122145g6 A00(ImageUrl imageUrl, String str, String str2, boolean z, boolean z2, boolean z3) {
        PendingRecipient pendingRecipient = new PendingRecipient(imageUrl, str, str2);
        pendingRecipient.A0H = !z3;
        pendingRecipient.A0b = z2;
        pendingRecipient.A0F = z;
        pendingRecipient.A0M = z3;
        return new C122145g6(AbstractC166987dD.A1J(pendingRecipient));
    }

    private final boolean A02() {
        UserSession userSession = this.A00;
        if (!AbstractC162267Oo.A03(userSession) && C18U.A06(C06090Tz.A05, userSession, 36320403825893848L)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(android.app.Activity r25, X.InterfaceC11380iw r26, java.lang.String r27, java.lang.String r28, X.InterfaceC23621Ds r29) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher.A03(android.app.Activity, X.0iw, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        if (r22 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(android.app.Activity r18, X.InterfaceC11380iw r19, com.instagram.common.typedurl.ImageUrl r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26) {
        /*
            r17 = this;
            r11 = r25
            r10 = 0
            r0 = 2
            r13 = r21
            r12 = r23
            X.AbstractC167007dF.A1G(r13, r0, r12)
            com.instagram.common.typedurl.SimpleImageUrl r1 = new com.instagram.common.typedurl.SimpleImageUrl
            r0 = r20
            r1.<init>(r0)
            r9 = 0
            r5 = r10
            r6 = r10
            r4 = r10
            r3 = r13
            r2 = r12
            X.5g6 r8 = A00(r1, r2, r3, r4, r5, r6)
            r14 = r17
            X.0do r0 = r14.A03
            java.lang.Object r1 = r0.getValue()
            X.2DS r1 = (X.C2DS) r1
            com.instagram.model.direct.DirectThreadKey r0 = X.AbstractC140956Yx.A01(r8)
            X.3kb r0 = r1.B3U(r0)
            r7 = 0
            if (r0 == 0) goto Lcf
            com.instagram.model.direct.DirectThreadKey r0 = r0.BKb()
        L35:
            r6 = 1
            boolean r16 = X.AbstractC25229BEm.A1Z(r0)
            X.0do r15 = r14.A02
            java.lang.Object r5 = r15.getValue()
            X.7F6 r5 = (X.C7F6) r5
            if (r25 != 0) goto Lcc
            java.lang.String r4 = ""
        L46:
            if (r16 == 0) goto L4b
            r3 = 1
            if (r22 == 0) goto L4c
        L4b:
            r3 = 0
        L4c:
            java.lang.String r0 = r5.A01
            if (r0 != 0) goto L56
            java.lang.String r0 = X.AbstractC166997dE.A0o()
            r5.A01 = r0
        L56:
            r2 = 895690478(0x356326ee, float:8.462074E-7)
            if (r3 == 0) goto L5e
            r2 = 895691428(0x35632aa4, float:8.462614E-7)
        L5e:
            X.02i r1 = r5.A06
            r1.markerStart(r2)
            java.lang.String r0 = "entry_point"
            r1.markerAnnotate(r2, r0, r4)
            r5.A05 = r3
            r5.A04 = r10
            r0 = r26
            r5.A02 = r0
            if (r16 == 0) goto L75
            r14.A09(r9, r13, r12)
        L75:
            if (r22 == 0) goto L7b
            X.3oE r8 = X.AbstractC31171DnF.A0N(r22)
        L7b:
            java.lang.Object r0 = r15.getValue()
            X.7F6 r0 = (X.C7F6) r0
            int r2 = X.C7F6.A00(r0)
            java.lang.String r1 = "navigation_to_thread_start"
            X.02i r0 = r0.A06
            r0.markerPoint(r2, r1)
            com.instagram.common.session.UserSession r4 = r14.A00
            if (r25 != 0) goto L92
            java.lang.String r11 = "direct_thread"
        L92:
            r1 = r18
            r0 = r19
            X.1nl r3 = X.C36881nl.A01(r1, r0, r4, r11)
            r3.A0B = r8
            r0 = 1014(0x3f6, float:1.421E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0H = r0
            r1 = r24
            if (r24 == 0) goto Lb3
            int r0 = r1.length()
            if (r0 == 0) goto Lb3
            com.instagram.direct.model.launcher.AutoSendMessageData r7 = new com.instagram.direct.model.launcher.AutoSendMessageData
            r7.<init>(r1, r9, r9)
        Lb3:
            r3.A07 = r7
            if (r16 == 0) goto Lca
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36325081043972801(0x810d78001032c1, double:3.035465749344812E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto Lca
        Lc4:
            r3.A0v = r6
            X.AbstractC31174DnI.A1P(r3)
            return
        Lca:
            r6 = 0
            goto Lc4
        Lcc:
            r4 = r11
            goto L46
        Lcf:
            r0 = r9
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher.A06(android.app.Activity, X.0iw, com.instagram.common.typedurl.ImageUrl, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void A07(Activity activity, InterfaceC11380iw interfaceC11380iw, String str, String str2, String str3, int i, boolean z) {
        UserSession userSession = this.A00;
        if (!AbstractC31268Doq.A08(userSession)) {
            C35137Fee.A00(activity, null);
            return;
        }
        if (str2 == null) {
            str2 = "direct_thread";
        }
        C36881nl A01 = C36881nl.A01(activity, interfaceC11380iw, userSession, str2);
        AbstractC31179DnN.A1R(A01, str);
        A01.A0H = Integer.valueOf(i);
        if (z) {
            A01.A0k = true;
        }
        if (str3 != null) {
            A01.A0g = str3;
        }
        AbstractC31174DnI.A1P(A01);
    }

    public final void A08(Activity activity, InterfaceC11380iw interfaceC11380iw, String str, String str2, String str3, String str4, boolean z) {
        PendingRecipient pendingRecipient;
        String str5 = str2;
        boolean A1b = AbstractC25233BEq.A1b(activity, interfaceC11380iw, str);
        UserSession userSession = this.A00;
        AutoSendMessageData autoSendMessageData = null;
        if (!AbstractC31268Doq.A08(userSession)) {
            C35137Fee.A00(activity, null);
            return;
        }
        C122145g6 A00 = A00(AbstractC25225BEi.A0t(""), str, "", false, z, false);
        List list = A00.A00;
        C81663kb A03 = C2DU.A03((C2DU) ((C2DS) this.A03.getValue()), new DirectThreadKey(list));
        if ((A03 == null || (((A03 instanceof C2EE) && !A03.BBy()) || (A03.C7I() == null && C18U.A06(C06090Tz.A05, userSession, 36329345945518369L)))) && (!A02() || (pendingRecipient = (PendingRecipient) AbstractC001800i.A0J(list)) == null || pendingRecipient.A0X != A1b)) {
            A09(null, null, str);
        }
        if (str2 == null) {
            str5 = "direct_thread";
        }
        C36881nl A01 = C36881nl.A01(activity, interfaceC11380iw, userSession, str5);
        A01.A0B = A00;
        A01.A0H = 1012;
        A01.A0g = str3;
        if (str4 != null && str4.length() != 0) {
            autoSendMessageData = new AutoSendMessageData(str4, null, null);
        }
        A01.A07 = autoSendMessageData;
        A01.A0k = A1b;
        A01.A0s = A1b;
        A01.A06();
    }
}
