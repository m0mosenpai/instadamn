package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class G4W implements InterfaceC164887Zb, C7Ze {
    public FPG A00;
    public final Context A01;
    public final Fragment A02;
    public final FragmentActivity A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final C163867Va A06;
    public final C49087LnD A07;
    public final C35007Fbe A08;
    public final C7Y7 A09;
    public final InterfaceC165667at A0A;
    public final C7Zf A0B;
    public final InterfaceC165117a0 A0C;
    public final InterfaceC165447aX A0D;
    public final InterfaceC164957Zk A0E;
    public final InterfaceC165047Zt A0F;
    public final InterfaceC165167a5 A0G;
    public final InterfaceC165517ae A0H;
    public final G4N A0I;
    public final List A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0M;
    public final InterfaceC16820sZ A0N;
    public final InterfaceC16820sZ A0O;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.E4Y] */
    public static E4Y A00(EnumC33377EpA enumC33377EpA, String str, String str2, String str3) {
        ?? c0Zx = new C0Zx();
        c0Zx.A06("author_id", str);
        c0Zx.A01(enumC33377EpA.A00, "cta_type");
        c0Zx.A06("payload", null);
        c0Zx.A06("message_id", str2);
        c0Zx.A06(DialogModule.KEY_TITLE, str3);
        c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, null);
        return c0Zx;
    }

    private final void A02(android.net.Uri uri, C7U0 c7u0) {
        String queryParameter;
        if (AbstractC167007dF.A1Z(this.A0L) || (AbstractC167007dF.A1Z(this.A0M) && (queryParameter = uri.getQueryParameter("xma_update")) != null && queryParameter.equals("nav"))) {
            c7u0.Avk().EJv();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        if (X.C7AR.A00.A04(r1) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cf, code lost:
    
        if (r1.A1c() != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A03(android.view.View r55, X.C7U0 r56, X.E6B r57, com.instagram.model.direct.messageid.MessageIdentifier r58, java.lang.Long r59, java.lang.String r60, java.lang.String r61, java.util.List r62, java.util.List r63, java.util.List r64, java.util.List r65, java.util.List r66, int r67, boolean r68) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G4W.A03(android.view.View, X.7U0, X.E6B, com.instagram.model.direct.messageid.MessageIdentifier, java.lang.Long, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, int, boolean):void");
    }

    public static void A04(AbstractC02600Aj abstractC02600Aj, C0Zx c0Zx, String str, String str2, String str3) {
        c0Zx.A06("notification_token", str);
        c0Zx.A06("campaign_id", str2);
        c0Zx.A06("cta_type_unique_id", str3);
        abstractC02600Aj.A0N(c0Zx, "call_to_action");
        abstractC02600Aj.Cht();
    }

    private final void A06(C3o9 c3o9, String str, String str2, String str3) {
        C25531Mh A00 = C162337Ov.A00(this.A04, this.A05, c3o9, JRE.A09(c3o9), AbstractC14490oL.A0A(this.A03), AbstractC151386rg.A06(str));
        A00.A0R("media_id", str2);
        A00.A0Q("sender_id", AbstractC166997dE.A0j(str3));
        A00.Cht();
    }

    private final boolean A08(android.net.Uri uri, C32051E6d c32051E6d) {
        List list = this.A0J;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (!(!((GXW) obj).CoA(uri, c32051E6d))) {
                break;
            }
            A1E.add(obj);
        }
        if (A1E.size() != list.size()) {
            return true;
        }
        return false;
    }

    public static final String A01(String str, String str2) {
        android.net.Uri A0B = AbstractC25227BEk.A0B(str);
        if (C14360o3.A0K(A0B.getHost(), "blend") || (C14360o3.A0K(A0B.getHost(), "www.instagram.com") && A0B.getQueryParameterNames().contains("feed_type"))) {
            String obj = AbstractC31174DnI.A0B(A0B.buildUpon(), PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2).toString();
            C14360o3.A0A(obj);
            return obj;
        }
        return str;
    }

    public static final void A05(EnumC33511Erk enumC33511Erk, FRk fRk, C7U0 c7u0, String str) {
        String C7I = c7u0.C7r().C7I();
        if (C7I != null) {
            C25531Mh A03 = C25531Mh.A03(fRk.A00);
            if (AbstractC25226BEj.A1Z(A03)) {
                A03.A0M(enumC33511Erk, "action");
                AbstractC31179DnN.A13(EnumC33506Erf.STOP_PROMPT_DIALOG, A03, str, C7I);
            }
        }
    }

    private final void A07(String str, String str2) {
        AnonymousClass548.A00().A00().A01(this.A03, EnumC120785dO.DIRECT_RESHARE_COMMENT, this.A05, AbstractC60952qJ.A01(this.A04.getModuleName(), true, false), str, str2, null, false, true, false, true, false, false);
    }

    public /* synthetic */ G4W(Fragment fragment, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C163867Va c163867Va, C49087LnD c49087LnD, C35007Fbe c35007Fbe, C7Y7 c7y7, InterfaceC165397aS interfaceC165397aS, InterfaceC165267aF interfaceC165267aF, InterfaceC165667at interfaceC165667at, C7Zf c7Zf, InterfaceC165117a0 interfaceC165117a0, InterfaceC165447aX interfaceC165447aX, InterfaceC165037Zs interfaceC165037Zs, InterfaceC164957Zk interfaceC164957Zk, InterfaceC165047Zt interfaceC165047Zt, InterfaceC165057Zu interfaceC165057Zu, InterfaceC165167a5 interfaceC165167a5, InterfaceC165517ae interfaceC165517ae, G4N g4n, G4N g4n2, G4N g4n3, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        List A1Q = AbstractC16960so.A1Q(new C36353G2f(interfaceC165047Zt, interfaceC165057Zu), new C36349G2b(c7y7, interfaceC165397aS), new C36350G2c(userSession, interfaceC165267aF), new C36352G2e(userSession, g4n), new C36348G2a(interfaceC165037Zs), new C48260LXj(interfaceC165117a0), new C36351G2d(userSession, g4n2), new C36354G2g(c49087LnD, interfaceC16820sZ));
        C14360o3.A0B(fragment, 3);
        AbstractC25234BEr.A0l(8, interfaceC165057Zu, interfaceC165047Zt, interfaceC165447aX, c7Zf);
        C14360o3.A0B(interfaceC165667at, 12);
        C14360o3.A0B(interfaceC165397aS, 13);
        C14360o3.A0B(interfaceC165267aF, 14);
        AbstractC25233BEq.A0z(15, g4n, g4n2, c7y7);
        C14360o3.A0B(interfaceC164957Zk, 18);
        C14360o3.A0B(interfaceC165117a0, 19);
        C14360o3.A0B(interfaceC165037Zs, 20);
        C14360o3.A0B(interfaceC165517ae, 22);
        C14360o3.A0B(g4n3, 23);
        C14360o3.A0B(c49087LnD, 24);
        C14360o3.A0B(interfaceC165167a5, 25);
        this.A05 = userSession;
        this.A03 = fragmentActivity;
        this.A02 = fragment;
        this.A04 = interfaceC11380iw;
        this.A0N = interfaceC16820sZ;
        this.A08 = c35007Fbe;
        this.A0O = interfaceC16820sZ2;
        this.A0F = interfaceC165047Zt;
        this.A0D = interfaceC165447aX;
        this.A0B = c7Zf;
        this.A0A = interfaceC165667at;
        this.A09 = c7y7;
        this.A0E = interfaceC164957Zk;
        this.A0C = interfaceC165117a0;
        this.A06 = c163867Va;
        this.A0H = interfaceC165517ae;
        this.A0I = g4n3;
        this.A07 = c49087LnD;
        this.A0G = interfaceC165167a5;
        this.A0J = A1Q;
        this.A01 = fragmentActivity;
        this.A0L = AbstractC09440dt.A01(new C50165MDs(this, 13));
        this.A0M = AbstractC09440dt.A01(new C50165MDs(this, 14));
        this.A0K = AbstractC09440dt.A01(C37026GTi.A00);
        this.A00 = new FPG();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x049a, code lost:
    
        if (r1.startsWith(X.AbstractC43591JPw.A00(40)) == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x049c, code lost:
    
        X.AbstractC70160WDy.A03(r2, r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x04a3, code lost:
    
        if (X.C2EY.A0y == r45) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x04a9, code lost:
    
        r7 = X.EnumC33377EpA.A03;
        r5 = X.C25531Mh.A04(r18);
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x04b0, code lost:
    
        if (r53 != null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x04b2, code lost:
    
        r2 = new org.json.JSONObject(r53);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x04bd, code lost:
    
        if (X.AbstractC31173DnH.A1a(r53, "notification_message_token") != false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x04bf, code lost:
    
        r4 = r2.getString("notification_message_token");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x04c3, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x04c4, code lost:
    
        if (r53 != null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x04c6, code lost:
    
        r2 = new org.json.JSONObject(r53);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x04d1, code lost:
    
        if (X.AbstractC31173DnH.A1a(r53, "mbs_mm_campaign_id") != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x04d3, code lost:
    
        r8 = r2.getString("mbs_mm_campaign_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x04d7, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x04d8, code lost:
    
        if (r53 != null) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x04da, code lost:
    
        r2 = new org.json.JSONObject(r53);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x04e5, code lost:
    
        if (X.AbstractC31173DnH.A1a(r53, "mm_cta_unique_id") != false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x04e7, code lost:
    
        r10 = r2.getString("mm_cta_unique_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x04ef, code lost:
    
        if (X.AbstractC25226BEj.A1Z(r5) != false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x04f1, code lost:
    
        A04(r5, A00(r7, r54, r6, r49), r4, r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x04fa, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0501, code lost:
    
        if (r1.startsWith("instagram://run_bloks_action/") == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0503, code lost:
    
        X.AbstractC31171DnF.A1P(r7);
        r5 = X.AbstractC25227BEk.A0B(r1);
        r0 = r5.getQueryParameter("params");
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0510, code lost:
    
        if (r0 == null) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x051f, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0521, code lost:
    
        r14 = r5.getQueryParameter("bloks_app_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0527, code lost:
    
        if (r14 != null) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0529, code lost:
    
        X.AbstractC35275FhA.A0D(r7, new X.C35958FuI(), r2, r14, "direct_thread", r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0512, code lost:
    
        r16 = X.FTf.A01(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0517, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0518, code lost:
    
        X.C0K8.A0F("direct_thread", "IOException while parseParams()", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0541, code lost:
    
        if ("comments".equals(r12.getHost()) == false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0543, code lost:
    
        if (r5 == null) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0545, code lost:
    
        r8 = r12.getQueryParameter("comment_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0557, code lost:
    
        if ("clips".equals(r12.getQueryParameter("media_type")) == false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0559, code lost:
    
        if (r44 == null) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x055b, code lost:
    
        r43.A0B.Cqj(r44, null, null, r46, null, false, false, r5, null, r8, null, null, null, X.AbstractC31171DnF.A1V(r2, r54));
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x057e, code lost:
    
        r2 = r20.B90();
        X.C14360o3.A07(r2);
        A06(r2, r1, r5, r54);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x058a, code lost:
    
        A07(r5, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0592, code lost:
    
        if (A08(r12, r8) != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0598, code lost:
    
        if (X.AbstractC35186Ffe.A03(r12) == false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x059a, code lost:
    
        r43.A09.A00(X.AbstractC35186Ffe.A02(r1, X.AbstractC166987dD.A1J(new android.util.Pair("s", "channel_link_xma"))), "xma_cta", r54, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x05b4, code lost:
    
        r43.A09.A00(A01(r1, r20.C7I()), "xma_cta", r54, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x05c5, code lost:
    
        r34 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x05c9, code lost:
    
        r0 = "Null or empty url on WEB_URL CTA";
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x043b, code lost:
    
        if (r50.equals(r5) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x028d, code lost:
    
        if (r50.equals(r5) != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x043f, code lost:
    
        if (r51 == null) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0445, code lost:
    
        if (r1.length() <= 0) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0447, code lost:
    
        r5 = r12.getQueryParameter("media_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x044b, code lost:
    
        if (r5 != null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x044d, code lost:
    
        r5 = r12.getQueryParameter("reel_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0453, code lost:
    
        r8 = (X.C7U0) r2.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0459, code lost:
    
        if (r8 == null) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x045b, code lost:
    
        r8 = r8.C7r().Co6();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0463, code lost:
    
        if (r8 == null) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0465, code lost:
    
        r34 = X.AbstractC34774FTx.A00(r8).name();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x046d, code lost:
    
        r8 = new X.C32051E6d(r7, r44, r43.A02, r2, null, null, null, r54, r6, r56, r34, null, null);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0138. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x05e8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x05d5  */
    @Override // X.C7Ze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CKa(android.graphics.RectF r44, X.C2EY r45, com.instagram.model.direct.messageid.DirectMessageIdentifier r46, com.instagram.ui.widget.gradientspinner.GradientSpinner r47, java.lang.Integer r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.util.Map r58) {
        /*
            Method dump skipped, instructions count: 2106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G4W.CKa(android.graphics.RectF, X.2EY, com.instagram.model.direct.messageid.DirectMessageIdentifier, com.instagram.ui.widget.gradientspinner.GradientSpinner, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x057c, code lost:
    
        if (X.AbstractC002300n.A0g(r68, X.C2EY.A1x.A00, r2) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x058e, code lost:
    
        if (r3.equalsIgnoreCase("true") != r2) goto L190;
     */
    @Override // X.InterfaceC164887Zb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cs7(android.view.View r56, com.instagram.common.typedurl.ImageUrl r57, X.E6B r58, com.instagram.model.direct.messageid.MessageIdentifier r59, com.instagram.ui.widget.gradientspinner.GradientSpinner r60, java.lang.Long r61, java.lang.Long r62, java.lang.String r63, java.lang.String r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, java.lang.String r68, java.lang.String r69, java.util.List r70, java.util.List r71, java.util.List r72, java.util.List r73, java.util.List r74, java.util.Map r75, int r76, boolean r77) {
        /*
            Method dump skipped, instructions count: 1537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G4W.Cs7(android.view.View, com.instagram.common.typedurl.ImageUrl, X.E6B, com.instagram.model.direct.messageid.MessageIdentifier, com.instagram.ui.widget.gradientspinner.GradientSpinner, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.Map, int, boolean):void");
    }
}
