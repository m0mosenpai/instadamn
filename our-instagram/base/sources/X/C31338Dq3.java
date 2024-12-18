package X;

import android.content.Context;
import android.os.Handler;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Dq3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31338Dq3 {
    public static final int A0A = AbstractC167027dH.A01(C31349DqE.A0S) + 1000;
    public static final Handler A0B = AbstractC167007dF.A0J();
    public final Fragment A00;
    public final InterfaceC11380iw A01;
    public final C18920wW A02;
    public final UserSession A03;
    public final GZI A04;
    public final C92654Da A05;
    public final GZJ A06;
    public final C31345DqA A07;
    public final List A08 = AbstractC166987dD.A1E();
    public final boolean A09;

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0026. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(android.content.Context r14, X.C9CK r15, X.MUD r16, X.C50674MYs r17, X.C31338Dq3 r18, X.C5HW r19, int r20) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31338Dq3.A01(android.content.Context, X.9CK, X.MUD, X.MYs, X.Dq3, X.5HW, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.GKQ, java.lang.Object, java.lang.Runnable] */
    public static void A02(Context context, MUD mud, final C31338Dq3 c31338Dq3, final C5HW c5hw, int i) {
        UserSession userSession = c31338Dq3.A03;
        JTE A01 = MUK.A01(userSession);
        String str = userSession.userId;
        InterfaceC11380iw interfaceC11380iw = c31338Dq3.A01;
        GZI gzi = c31338Dq3.A04;
        A01.A0G(mud, interfaceC11380iw, c5hw, str, gzi.AbS(), gzi.BdC(), i);
        if (AbstractC31249DoX.A00(c5hw)) {
            C19280xC A00 = C19280xC.A00(AbstractC31171DnF.A0D(AbstractC111324zv.A00(60)), AbstractC111324zv.A00(1965));
            C14360o3.A0A(A00);
            A00.A0C("actor_igid", userSession.userId);
            A00.A0B("tip_id", Long.valueOf(AbstractC25232BEp.A0t(c5hw.A04.A0S)));
            A00.A0B("channel_id", Long.valueOf(AbstractC25232BEp.A0t(c5hw.A04.A0R)));
            AbstractC31173DnH.A1S(A00, userSession);
        }
        Runnable runnable = new Runnable() { // from class: X.GOP
            @Override // java.lang.Runnable
            public final void run() {
                C31338Dq3 c31338Dq32 = C31338Dq3.this;
                C5HW c5hw2 = c5hw;
                if (c5hw2.A07 == C05F.A01) {
                    UserSession userSession2 = c31338Dq32.A03;
                    String str2 = c5hw2.A09;
                    AbstractC167017dG.A1N(userSession2, str2);
                    C107264sX A002 = AbstractC107254sW.A00(userSession2);
                    AbstractC23641Du.A05(AbstractC25231BEo.A0e(C12L.A00), new MCF(A002, str2, null, 33), A002.A04);
                }
            }
        };
        ETJ etj = new ETJ(context, c31338Dq3, c5hw, i);
        String str2 = c5hw.A09;
        String str3 = c5hw.A04.A0s;
        C14360o3.A0B(str2, 2);
        C1ON A002 = AbstractC31425DrV.A00(userSession, "hide", str2, str3, null);
        A002.A00 = etj;
        ?? obj = new Object();
        obj.A00 = A002;
        boolean z = false;
        if (context != null) {
            C146106i8 A0K = AbstractC31171DnF.A0K();
            AbstractC25226BEj.A1N(context, A0K, 2131968508);
            AbstractC31178DnM.A0o(context, A0K);
            A0K.A0A = new C36525G8x(c5hw, c31338Dq3, runnable, obj, i, 1);
            A0K.A0L = true;
            A0K.A06();
            A0K.A02 = 0;
            AbstractC25233BEq.A1F(A0K);
            Handler handler = A0B;
            long j = A0A;
            handler.postDelayed(obj, j);
            handler.postDelayed(runnable, j);
            z = true;
        } else {
            Handler handler2 = A0B;
            handler2.post(obj);
            handler2.post(runnable);
        }
        c31338Dq3.A06.EFq(c5hw, z);
    }

    public static void A04(C31338Dq3 c31338Dq3, C5HW c5hw, String str, int i) {
        UserSession userSession = c31338Dq3.A03;
        InterfaceC11380iw interfaceC11380iw = c31338Dq3.A01;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "newsfeed_story_inline_action");
        if (A0f.isSampled()) {
            ArrayList A0z = AbstractC31174DnI.A0z(str);
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("module_name", interfaceC11380iw.getModuleName());
            A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c5hw.A05.toString());
            A0f.A9K(AbstractC111324zv.A00(3177), AbstractC31171DnF.A0V(c5hw.A00));
            A0f.AAP("story_id", c5hw.A09);
            AbstractC31175DnJ.A0z(A0f, i);
            A0f.AAP("section", c5hw.A0D);
            A0f.AAP("tuuid", c5hw.A04.A0s);
            A0f.AAP("tab", "you");
            A0f.A9M("extra_data", A1G);
            A0f.AAk(OptSvcAnalyticsStore.LOGGING_KEY_STEP, A0z);
            A0f.Cht();
        }
    }

    public static boolean A05(C31338Dq3 c31338Dq3) {
        FragmentActivity activity = c31338Dq3.A00.getActivity();
        if (activity != null && !activity.isFinishing()) {
            return true;
        }
        return false;
    }

    public C31338Dq3(Fragment fragment, InterfaceC11380iw interfaceC11380iw, C18920wW c18920wW, UserSession userSession, GZI gzi, GZJ gzj) {
        this.A00 = fragment;
        this.A03 = userSession;
        this.A01 = interfaceC11380iw;
        this.A02 = c18920wW;
        this.A06 = gzj;
        this.A04 = gzi;
        C14360o3.A0B(userSession, 0);
        this.A07 = (C31345DqA) userSession.A01(C31345DqA.class, C31344Dq9.A00);
        this.A05 = C4DZ.A00(userSession);
        this.A09 = C1C0.A00(userSession);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r4.isRestricted() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r4.CQf() == false) goto L23;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A00(android.content.Context r2, X.C5HW r3, com.instagram.user.model.User r4, java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            switch(r0) {
                case -336545092: goto Le;
                case -250367239: goto L25;
                case 3202370: goto L31;
                case 93832333: goto L3d;
                case 281394031: goto L5c;
                case 499953017: goto L68;
                case 1191002059: goto L74;
                case 1449514870: goto L80;
                default: goto L7;
            }
        L7:
            java.lang.String r0 = "Unknown action type "
            java.lang.IllegalArgumentException r0 = X.AbstractC167007dF.A0c(r0, r5)
            throw r0
        Le:
            java.lang.String r0 = "restrict"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L7
            if (r4 == 0) goto L21
            boolean r0 = r4.isRestricted()
            r1 = 2131968517(0x7f134205, float:1.957393E38)
            if (r0 != 0) goto L53
        L21:
            r1 = 2131968512(0x7f134200, float:1.957392E38)
            goto L53
        L25:
            java.lang.String r0 = "tag_options"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L7
            r0 = 2131968513(0x7f134201, float:1.9573923E38)
            goto L8b
        L31:
            java.lang.String r0 = "hide"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L7
            r0 = 2131968504(0x7f1341f8, float:1.9573904E38)
            goto L8b
        L3d:
            java.lang.String r0 = "block"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L7
            if (r4 == 0) goto L50
            boolean r0 = r4.CQf()
            r1 = 2131968516(0x7f134204, float:1.9573929E38)
            if (r0 != 0) goto L53
        L50:
            r1 = 2131968503(0x7f1341f7, float:1.9573902E38)
        L53:
            X.5HX r0 = r3.A04
            java.lang.String r0 = r0.A0h
            java.lang.String r0 = X.AbstractC167007dF.A0f(r2, r0, r1)
            return r0
        L5c:
            java.lang.String r0 = "turn_off_security_alert"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L7
            r0 = 2131968514(0x7f134202, float:1.9573925E38)
            goto L8b
        L68:
            java.lang.String r0 = "remove_follower"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L7
            r0 = 2131968509(0x7f1341fd, float:1.9573915E38)
            goto L8b
        L74:
            java.lang.String r0 = "delete_comment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L7
            r0 = 2131968505(0x7f1341f9, float:1.9573906E38)
            goto L8b
        L80:
            java.lang.String r0 = "report_a_problem"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L7
            r0 = 2131968511(0x7f1341ff, float:1.9573919E38)
        L8b:
            java.lang.String r0 = r2.getString(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31338Dq3.A00(android.content.Context, X.5HW, com.instagram.user.model.User, java.lang.String):java.lang.String");
    }

    public static void A03(Context context, C31338Dq3 c31338Dq3, C5HW c5hw) {
        if (c5hw.A07() != null) {
            UserSession userSession = c31338Dq3.A03;
            C38321qM A02 = C1DW.A00(userSession).A02(c5hw.A07());
            if (A02 == null) {
                C1ON A04 = AbstractC2044893h.A04(userSession, c5hw.A07());
                C31456Ds0.A00(A04, c31338Dq3, c5hw, 34);
                C1GJ.A00(context, AbstractC018607g.A00(c31338Dq3.A00), A04);
                return;
            }
            c5hw.A02 = A02;
        }
    }
}
