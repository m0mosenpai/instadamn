package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;

/* renamed from: X.2Me, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48862Me implements InterfaceC13000lm {
    public boolean A00;
    public boolean A01;
    public C1Df A02;
    public final UserSession A03;
    public final Handler A04;
    public final String A05;

    public C48862Me(UserSession userSession, String str) {
        C14360o3.A0B(str, 2);
        this.A03 = userSession;
        this.A05 = str;
        this.A04 = new Handler(Looper.getMainLooper());
    }

    public final void A01() {
        C04060Jx c04060Jx = GraphQlCallInput.A02;
        String str = this.A05;
        C0CA A02 = c04060Jx.A02();
        C0CA.A00(A02, str, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        c2jm.A00.A02().A0E(A02, "input");
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "StoryTrayEventSubscription", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C48892Mh.class, false, PandoRealtimeInfoJNI.forSubscription("xdt_story_tray_event"), 0, null, "xdt_story_tray_event", new ArrayList());
        UserSession userSession = this.A03;
        UserSession userSession2 = AbstractC25351Lp.A00(userSession).A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession2, 36319085268966320L) || (AbstractC23021Ah.A00(userSession).A01.getBoolean("reel_tray_personalization_is_high_me_user", false) && C18U.A06(c06090Tz, AbstractC25351Lp.A00(userSession).A00, 36319085269228468L))) {
            pandoGraphQLRequest.setRealtimeBackgroundPolicy(2);
        }
        this.A02 = AbstractC40691uc.A01(userSession).A01(null, new InterfaceC48192Ji() { // from class: X.2Mp
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
            
                if (X.C18U.A06(r6, X.AbstractC25351Lp.A00(r7).A00, 36319085268835246L) != false) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
            
                if (r2.getRequiredIntField(1, "reverse_bff_score") >= 0) goto L11;
             */
            @Override // X.InterfaceC48192Ji
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke(X.AnonymousClass436 r10) {
                /*
                    r9 = this;
                    if (r10 == 0) goto L78
                    java.lang.Object r4 = r10.Bos()
                    X.2JS r4 = (X.C2JS) r4
                    if (r4 == 0) goto L78
                    java.lang.Class<X.8xu> r2 = X.C202768xu.class
                    r3 = 0
                    java.lang.String r1 = "xdt_story_tray_event(input:$input)"
                    r0 = 2094941404(0x7cde44dc, float:9.232692E36)
                    X.2JS r2 = r4.getRequiredTreeField(r3, r1, r2, r0)
                    if (r2 == 0) goto L78
                    X.2Me r4 = X.C48862Me.this
                    com.instagram.common.session.UserSession r7 = r4.A03
                    X.0Tz r6 = X.C06090Tz.A05
                    r0 = 36319085269031857(0x81080400071bb1, double:3.0316739971291114E-306)
                    boolean r0 = X.C18U.A06(r6, r7, r0)
                    if (r0 == 0) goto L34
                    r1 = 1
                    java.lang.String r0 = "reverse_bff_score"
                    int r0 = r2.getRequiredIntField(r1, r0)
                    if (r0 < 0) goto L35
                L34:
                    r1 = 0
                L35:
                    java.lang.String r0 = "force_refresh"
                    boolean r0 = r2.getRequiredBooleanField(r3, r0)
                    if (r0 == 0) goto L78
                    if (r1 != 0) goto L78
                    X.1Lr r0 = X.AbstractC25351Lp.A00(r7)
                    com.instagram.common.session.UserSession r2 = r0.A00
                    r0 = 36319085268638635(0x81080400011bab, double:3.031673996880436E-306)
                    boolean r8 = X.C18U.A06(r6, r2, r0)
                    X.1Lr r0 = X.AbstractC25351Lp.A00(r7)
                    com.instagram.common.session.UserSession r2 = r0.A00
                    r0 = 36319085268704172(0x81080400021bac, double:3.031673996921882E-306)
                    boolean r5 = X.C18U.A06(r6, r2, r0)
                    X.1Lr r0 = X.AbstractC25351Lp.A00(r7)
                    com.instagram.common.session.UserSession r2 = r0.A00
                    r0 = 36319085268900783(0x81080400051baf, double:3.0316739970462196E-306)
                    boolean r0 = X.C18U.A06(r6, r2, r0)
                    r3 = 1
                    if (r0 == 0) goto L80
                    if (r8 == 0) goto L79
                    boolean r0 = r4.A00
                    if (r0 == 0) goto L79
                L76:
                    r4.A01 = r3
                L78:
                    return
                L79:
                    if (r5 == 0) goto L78
                    boolean r0 = r4.A00
                    if (r0 != 0) goto L78
                    goto L76
                L80:
                    if (r8 == 0) goto L8c
                    boolean r0 = r4.A00
                    if (r0 == 0) goto L8c
                L86:
                    java.lang.Integer r0 = X.C05F.A1I
                    X.C48862Me.A00(r4, r0)
                    return
                L8c:
                    if (r5 == 0) goto L78
                    boolean r0 = r4.A00
                    if (r0 != 0) goto L78
                    X.1Lr r0 = X.AbstractC25351Lp.A00(r7)
                    com.instagram.common.session.UserSession r2 = r0.A00
                    r0 = 36319085268835246(0x81080400041bae, double:3.031673997004774E-306)
                    boolean r0 = X.C18U.A06(r6, r2, r0)
                    if (r0 == 0) goto L86
                    goto L76
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C48962Mp.invoke(X.436):void");
            }
        }, pandoGraphQLRequest);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C1Df c1Df = this.A02;
        if (c1Df != null) {
            c1Df.cancel();
        }
    }

    public static final void A00(C48862Me c48862Me, Integer num) {
        C1GK A00 = AbstractC202778xv.A00();
        UserSession userSession = c48862Me.A03;
        C61252qn A002 = AbstractC61242qm.A00(userSession);
        C14360o3.A07(A002);
        long A01 = C18U.A01(C06090Tz.A05, AbstractC25351Lp.A00(userSession).A00, 36600560246001579L);
        if (num == C05F.A1I && A01 > 0) {
            c48862Me.A01 = true;
            c48862Me.A04.postDelayed(new RunnableC24485At4(c48862Me), A01);
        } else {
            A002.A0J(A00, null, num);
        }
    }
}
