package X;

import android.webkit.URLUtil;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.instagram.common.session.UserSession;
import com.instagram.inappbrowser.helper.BrowserLinkshimUrlCache;

/* renamed from: X.7Y7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7Y7 implements C7Y8 {
    public final InterfaceC08100bW A00 = new C1QF("IgSecureUriParser").A00;
    public final AbstractC59962oe A01;
    public final AbstractC59962oe A02;
    public final UserSession A03;
    public final UserSession A04;
    public final String A05;
    public final String A06;
    public final InterfaceC16820sZ A07;
    public final InterfaceC16820sZ A08;
    public final InterfaceC16820sZ A09;
    public final InterfaceC16820sZ A0A;
    public final InterfaceC16820sZ A0B;
    public final InterfaceC16820sZ A0C;
    public final boolean A0D;

    public final void A02(String str, String str2, String str3, String str4, boolean z) {
        String obj;
        UserSession userSession = this.A03;
        if (C18U.A06(C06090Tz.A05, userSession, 36313566236903542L)) {
            if (!z) {
                A01(str, str2, str3, "system_browser", str4);
            }
            C12260kU.A0G(this.A01.requireContext(), AbstractC08820cl.A03(str));
            return;
        }
        if (!z && !A03(str4)) {
            A01(str, str2, str3, "in_app_browser", str4);
            BrowserLinkshimUrlCache A00 = AbstractC54039Nup.A00(userSession);
            AbstractC59962oe abstractC59962oe = this.A01;
            A00.A02(abstractC59962oe.requireContext(), AbstractC018607g.A00(abstractC59962oe), new TGP(this), str);
            return;
        }
        android.net.Uri A03 = AbstractC08820cl.A03(str);
        C14360o3.A07(A03);
        if (A03.getScheme() == null) {
            obj = URLUtil.guessUrl(str);
            if (obj == null) {
                obj = "";
            }
        } else {
            obj = A03.toString();
            C14360o3.A07(obj);
        }
        C63397SjR c63397SjR = new C63397SjR(this.A01.requireActivity(), userSession, C2Fb.A1W, obj, false);
        c63397SjR.A0E(userSession.userId);
        c63397SjR.A0F((String) this.A08.invoke());
        c63397SjR.A0S = this.A05;
        c63397SjR.A0r = false;
        c63397SjR.A0D = ZonePolicy.A0D;
        c63397SjR.A0A();
    }

    @Override // X.C7Y8
    public final void Cs6(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        A00(str, "inline_link", str2, str3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
    
        if (X.C14360o3.A0K(r2.A0D(r36), true) == false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 1093
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7Y7.A00(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16) {
        /*
            r11 = this;
            r3 = r16
            if (r16 == 0) goto Ldc
            X.0sZ r0 = r11.A07
            java.lang.Object r0 = r0.invoke()
            X.7U0 r0 = (X.C7U0) r0
            X.7Ux r1 = r0.C7r()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.fragment.thread.infra.open.DirectThreadViewDataLoader"
            X.C14360o3.A0C(r1, r0)
            X.7Uw r1 = (X.C163827Uw) r1
            java.lang.Boolean r0 = r1.A0D(r3)
            if (r0 == 0) goto Ldc
            boolean r4 = r0.booleanValue()
        L21:
            com.instagram.common.session.UserSession r6 = r11.A03
            X.2oe r5 = r11.A01
            X.0sZ r2 = r11.A07
            java.lang.Object r0 = r2.invoke()
            X.7U0 r0 = (X.C7U0) r0
            X.7Ux r0 = r0.C7r()
            X.3o9 r7 = r0.B90()
            java.lang.Object r0 = r2.invoke()
            X.7U0 r0 = (X.C7U0) r0
            X.7Ux r0 = r0.C7r()
            X.3o9 r0 = r0.B90()
            boolean r8 = X.JRE.A09(r0)
            android.content.Context r0 = r5.requireContext()
            boolean r9 = X.AbstractC14490oL.A0A(r0)
            boolean r10 = X.AbstractC151386rg.A06(r12)
            X.1Mh r5 = X.C162337Ov.A00(r5, r6, r7, r8, r9, r10)
            java.lang.String r0 = "destination"
            r5.A0R(r0, r15)
            java.lang.String r0 = "web_link_entry_source"
            r5.A0R(r0, r13)
            X.0sZ r0 = r11.A08
            java.lang.Object r1 = r0.invoke()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "viewer_session_id"
            r5.A0R(r0, r1)
            java.lang.String r0 = "message_id"
            r5.A0R(r0, r3)
            if (r14 == 0) goto L82
            if (r4 != 0) goto L82
            r0 = 10
            java.lang.Long r1 = X.AbstractC003100w.A0k(r0, r14)
            java.lang.String r0 = "sender_id"
            r5.A0Q(r0, r1)
        L82:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.lang.String r0 = "agent_search"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto Lac
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.lang.String r1 = "content_type"
            java.lang.String r0 = "ai_bot_search_plugin"
            r6.put(r1, r0)
            java.lang.String r1 = "surface"
            java.lang.String r0 = "thread"
            r6.put(r1, r0)
            java.lang.String r1 = "selected_item"
            java.lang.String r0 = "ai_bot_search_powered_by_bing"
            r6.put(r1, r0)
            r4.putAll(r6)
        Lac:
            java.lang.Object r0 = r2.invoke()
            X.7U0 r0 = (X.C7U0) r0
            X.7Ts r2 = r0.BT6()
            if (r16 != 0) goto Lba
            java.lang.String r3 = ""
        Lba:
            r1 = 0
            com.instagram.model.direct.messageid.MessageIdentifier r0 = new com.instagram.model.direct.messageid.MessageIdentifier
            r0.<init>(r3, r1)
            java.util.Map r0 = r2.BOu(r0)
            if (r0 != 0) goto Lca
            X.0sk r0 = X.AbstractC06930Yk.A0E()
        Lca:
            r4.putAll(r0)
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto Ld8
            r5.A0v(r4)
        Ld8:
            r5.Cht()
            return
        Ldc:
            r4 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7Y7.A01(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final boolean A03(String str) {
        C163827Uw c163827Uw;
        InterfaceC16820sZ interfaceC16820sZ = this.A07;
        InterfaceC163837Ux C7r = ((C7U0) interfaceC16820sZ.invoke()).C7r();
        if (C7r instanceof C163827Uw) {
            c163827Uw = (C163827Uw) C7r;
        } else {
            c163827Uw = null;
        }
        if (c163827Uw == null || str == null) {
            return false;
        }
        C83403nh BSh = c163827Uw.A0O.BSh(c163827Uw.B90(), str);
        if ((BSh == null || !BSh.A1c()) && (!c163827Uw.A0D(str).booleanValue() || !C161867Mw.A02(((C7U0) interfaceC16820sZ.invoke()).C7r().C7W().A0G))) {
            return false;
        }
        return true;
    }

    public C7Y7(AbstractC59962oe abstractC59962oe, UserSession userSession, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, boolean z) {
        this.A01 = abstractC59962oe;
        this.A03 = userSession;
        this.A05 = str;
        this.A07 = interfaceC16820sZ;
        this.A08 = interfaceC16820sZ2;
        this.A02 = abstractC59962oe;
        this.A04 = userSession;
        this.A0D = z;
        this.A06 = str;
        this.A09 = interfaceC16820sZ;
        this.A0A = interfaceC16820sZ2;
        this.A0C = interfaceC16820sZ3;
        this.A0B = interfaceC16820sZ4;
    }
}
