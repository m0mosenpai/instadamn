package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;
import com.instagram.direct.inbox.clipsinteractionreply.ClipsInteractionReplySheetContent;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class BRG extends AbstractC51572Yf {
    public final long A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final SocialContextBubbleUiState A03;
    public final InterfaceC80043ht A04;
    public final InterfaceC30939Dit A05;
    public final InterfaceC16660sJ A06;
    public final C206209Bd A07;
    public final C51722Yv A08;
    public final C25528BQq A09;
    public final C75113Zb A0A;
    public final WeakReference A0B;
    public final InterfaceC16820sZ A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x014c, code lost:
    
        if (r16.intValue() == r13) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01eb, code lost:
    
        if (X.AbstractC25229BEm.A1W(r55) != false) goto L47;
     */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r58) {
        /*
            Method dump skipped, instructions count: 1428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BRG.A0Y(X.3bS):X.2Vc");
    }

    public static final void A03(FragmentActivity fragmentActivity, BRG brg) {
        SocialContextBubbleUiState socialContextBubbleUiState = brg.A03;
        String B8y = socialContextBubbleUiState.A04.B8y();
        String str = socialContextBubbleUiState.A09;
        String str2 = socialContextBubbleUiState.A06;
        F3U.A00(fragmentActivity, brg.A02, new ClipsInteractionReplySheetContent(socialContextBubbleUiState.A02, socialContextBubbleUiState.A03, B8y, str, str2, (String) AbstractC25226BEj.A1C(socialContextBubbleUiState.A01.A00), brg.A01.getModuleName()), AbstractC25225BEi.A1E(brg, 32), AbstractC25225BEi.A1E(brg, 33));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.CTc, java.lang.Object] */
    public static final void A04(C77123cy c77123cy, C2Z1 c2z1, C51762Yz c51762Yz, BRG brg) {
        long j;
        WeakReference weakReference;
        SocialContextBubbleUiState socialContextBubbleUiState = brg.A03;
        if (!socialContextBubbleUiState.A0C) {
            Object A00 = AbstractC13320mI.A00(AbstractC77363dM.A00(c2z1), FragmentActivity.class);
            if (A00 != null || ((weakReference = brg.A0B) != null && (A00 = weakReference.get()) != null)) {
                UserSession userSession = brg.A02;
                InterfaceC11380iw interfaceC11380iw = brg.A01;
                String moduleName = interfaceC11380iw.getModuleName();
                AbstractC167017dG.A1P(userSession, moduleName);
                if (AbstractC002300n.A0h(moduleName, "clips_viewer", false) || socialContextBubbleUiState.A02 == SocialContextType.A0C) {
                    brg.A0C.invoke();
                    View view = (View) AbstractC25225BEi.A12(c77123cy);
                    if (view != null) {
                        ?? obj = new Object();
                        Context A002 = AbstractC77363dM.A00(c2z1);
                        String moduleName2 = interfaceC11380iw.getModuleName();
                        AbstractC167007dF.A1K(userSession, moduleName2);
                        C01L A1I = C0eM.A1I();
                        boolean A0h = AbstractC002300n.A0h(moduleName2, "clips_viewer", false);
                        C06090Tz c06090Tz = C06090Tz.A05;
                        if (A0h) {
                            j = 36322774647646742L;
                        } else {
                            j = 36325128287957752L;
                        }
                        if (C18U.A06(c06090Tz, userSession, j)) {
                            A1I.add(EnumC27426C8t.A06);
                            A1I.add(EnumC27426C8t.A07);
                        }
                        A1I.add(EnumC27426C8t.A09);
                        A1I.add(EnumC27426C8t.A05);
                        A1I.add(EnumC27426C8t.A08);
                        if (AbstractC27609CGf.A00(A002, view, userSession, C0eM.A1J(A1I), new B61(0, obj, c51762Yz), new BAO(15, A00, brg))) {
                            InterfaceC80043ht interfaceC80043ht = brg.A04;
                            SocialContextType socialContextType = socialContextBubbleUiState.A02;
                            String str = socialContextBubbleUiState.A09;
                            C14360o3.A0B(str, 0);
                            interfaceC80043ht.D0W(socialContextType, socialContextBubbleUiState.A00, AbstractC167027dH.A03(str));
                            obj.A00(view);
                            c51762Yz.A00();
                            return;
                        }
                        AbstractC166987dD.A1T(C18950wb.A01, "Friendly Viewer - Failed to show drop-down menu for longpress", 817892647);
                    }
                }
            }
        }
    }

    public static final void A05(C2Z1 c2z1, SocialContextBubbleUiState socialContextBubbleUiState, BRG brg) {
        WeakReference weakReference;
        long j = 0;
        if (!socialContextBubbleUiState.A0C) {
            FragmentActivity fragmentActivity = (FragmentActivity) AbstractC13320mI.A00(AbstractC77363dM.A00(c2z1), FragmentActivity.class);
            if (fragmentActivity != null || ((weakReference = brg.A0B) != null && (fragmentActivity = (FragmentActivity) weakReference.get()) != null)) {
                brg.A0C.invoke();
                if (socialContextBubbleUiState.A02 == SocialContextType.A05) {
                    String str = socialContextBubbleUiState.A08;
                    if (str != null) {
                        InterfaceC80043ht interfaceC80043ht = brg.A04;
                        Long A0j = AbstractC25231BEo.A0j(0, socialContextBubbleUiState.A09);
                        if (A0j != null) {
                            j = A0j.longValue();
                        }
                        interfaceC80043ht.D6M(j, socialContextBubbleUiState.A00, str);
                        return;
                    }
                    return;
                }
                InterfaceC80043ht interfaceC80043ht2 = brg.A04;
                Long A0j2 = AbstractC25231BEo.A0j(0, socialContextBubbleUiState.A09);
                if (A0j2 != null) {
                    j = A0j2.longValue();
                }
                interfaceC80043ht2.DP3(j, socialContextBubbleUiState.A00, true);
                UserSession userSession = brg.A02;
                C14360o3.A0B(userSession, 0);
                if (AbstractC166987dD.A0x(userSession).getInt("friendly_feed_nux_seen_count", 0) < 1 && C18U.A06(C06090Tz.A05, userSession, 36327580713958085L)) {
                    CQH cqh = new CQH(fragmentActivity, brg);
                    C3DN A00 = C3DN.A00.A00(fragmentActivity);
                    C26716Bqx c26716Bqx = new C26716Bqx();
                    c26716Bqx.A00 = cqh;
                    C189478aR A002 = F86.A00(A00);
                    if (A002 != null && A002.A03.getViewLifecycleOwner().getLifecycle().A07().A00(C07S.CREATED)) {
                        A002.A0G(c26716Bqx, AbstractC25225BEi.A0y(userSession), false, false);
                        if (A00 == null) {
                            return;
                        }
                        C3DP c3dp = (C3DP) A00;
                        c3dp.A0H = new C29389CxM(cqh, 1);
                        c3dp.A0F = new C64506TGu(A00, 0);
                        return;
                    }
                    C189448aO A0y = AbstractC25225BEi.A0y(userSession);
                    A0y.A0V = new C64506TGu(A00, 1);
                    A0y.A0U = new C29385CxI(cqh, 1);
                    A0y.A00().A02(fragmentActivity, c26716Bqx);
                    return;
                }
                A03(fragmentActivity, brg);
                return;
            }
            return;
        }
        InterfaceC80043ht interfaceC80043ht3 = brg.A04;
        Long A0j3 = AbstractC25231BEo.A0j(0, socialContextBubbleUiState.A09);
        if (A0j3 != null) {
            j = A0j3.longValue();
        }
        interfaceC80043ht3.DP3(j, socialContextBubbleUiState.A00, false);
    }

    public BRG(C206209Bd c206209Bd, C51722Yv c51722Yv, InterfaceC11380iw interfaceC11380iw, UserSession userSession, SocialContextBubbleUiState socialContextBubbleUiState, C25528BQq c25528BQq, InterfaceC80043ht interfaceC80043ht, InterfaceC30939Dit interfaceC30939Dit, C75113Zb c75113Zb, WeakReference weakReference, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, long j, boolean z, boolean z2, boolean z3) {
        AbstractC167027dH.A13(socialContextBubbleUiState, userSession, interfaceC11380iw);
        C14360o3.A0B(interfaceC16660sJ, 5);
        AbstractC167017dG.A1U(interfaceC30939Dit, c25528BQq);
        AbstractC25234BEr.A1Q(c206209Bd, interfaceC80043ht, interfaceC16820sZ);
        C14360o3.A0B(c75113Zb, 16);
        this.A03 = socialContextBubbleUiState;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A08 = c51722Yv;
        this.A06 = interfaceC16660sJ;
        this.A05 = interfaceC30939Dit;
        this.A09 = c25528BQq;
        this.A00 = j;
        this.A0F = z;
        this.A0D = z2;
        this.A0E = z3;
        this.A07 = c206209Bd;
        this.A04 = interfaceC80043ht;
        this.A0C = interfaceC16820sZ;
        this.A0B = weakReference;
        this.A0A = c75113Zb;
    }
}
