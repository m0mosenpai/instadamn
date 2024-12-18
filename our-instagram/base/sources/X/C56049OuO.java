package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.OuO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56049OuO implements InterfaceC60602pj, InterfaceC60152ox, InterfaceC171187kA {
    public static final String __redex_internal_original_name = "IgLivePreLiveView";
    public C64842wi A00;
    public AnonymousClass195 A01;
    public AnonymousClass195 A02;
    public final int A03;
    public final Context A04;
    public final ViewGroup A05;
    public final C55982hj A06;
    public final C55982hj A07;
    public final C56034Ou6 A08;
    public final C56034Ou6 A09;
    public final AbstractC59962oe A0A;
    public final C1815283f A0B;
    public final InterfaceC11380iw A0C;
    public final UserSession A0D;
    public final C3I9 A0E;
    public final C1810981l A0F;
    public final C8GH A0G;
    public final InterfaceC25214BDm A0H;
    public final C8JI A0I;
    public final C171237kF A0J;
    public final C64742wY A0K;
    public final String A0L;
    public final InterfaceC09390do A0M;
    public final InterfaceC09390do A0N;
    public final InterfaceC09390do A0O;
    public final InterfaceC09390do A0P;
    public final InterfaceC09390do A0Q;
    public final InterfaceC09390do A0R;
    public final InterfaceC09390do A0S;
    public final InterfaceC09390do A0T;
    public final InterfaceC09390do A0U;
    public final InterfaceC09390do A0V;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC171187kA
    public final void D2N(Intent intent, C22P c22p, int i) {
        String str;
        C14360o3.A0B(c22p, 2);
        this.A0E.onStop();
        C51044Mgw A00 = A00(this);
        if (intent != null) {
            str = intent.getStringExtra("IgLive.error_message");
        } else {
            str = null;
        }
        if (i != -1) {
            if (i != 6001) {
                if (str != null) {
                    PZ1.A01(A00, str, AbstractC141776au.A00(A00), 37);
                }
                A00.A06.A0D("unknown", A00.A07);
            } else {
                A00.A00.A00();
                C57164PZi.A03(A00, AbstractC141776au.A00(A00), 46);
            }
        } else {
            int ordinal = c22p.ordinal();
            if (ordinal == 70) {
                C57164PZi.A03(A00, AbstractC141776au.A00(A00), 47);
            }
            A00.A00.A00();
            C57164PZi.A03(A00, AbstractC141776au.A00(A00), 48);
            if (ordinal != 70) {
                this.A0H.Cqz(NetInfoModule.CONNECTION_TYPE_NONE);
            }
        }
        AnonymousClass195 anonymousClass195 = this.A01;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A01 = null;
        AnonymousClass195 anonymousClass1952 = this.A02;
        if (anonymousClass1952 != null) {
            anonymousClass1952.AGH(null);
        }
        this.A02 = null;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC171187kA
    public final void E1E(C55U c55u) {
        C14360o3.A0B(c55u, 0);
        MSX.A17(this.A0A, this.A0E);
        C51044Mgw A00 = A00(this);
        if (c55u == C81S.A00) {
            C51044Mgw.A02(A00);
        }
        C54805OJz c54805OJz = A00.A00;
        c54805OJz.A08.Egh(A00.A0A.A02);
        A00.A0H.A05(A00.A08, null, new PIV(A00), (String) A00.A00.A0I.getValue());
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public /* synthetic */ C56049OuO(ViewGroup viewGroup, AbstractC59962oe abstractC59962oe, C1815283f c1815283f, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1810981l c1810981l, C8GH c8gh, InterfaceC25214BDm interfaceC25214BDm, C8JI c8ji, int i) {
        C171237kF c171237kF = new C171237kF(viewGroup, abstractC59962oe, userSession, c1810981l);
        Context requireContext = abstractC59962oe.requireContext();
        AbstractC25233BEq.A0y(2, c8gh, c8ji, interfaceC11380iw);
        C14360o3.A0B(c1815283f, 10);
        this.A0A = abstractC59962oe;
        this.A0G = c8gh;
        this.A0F = c1810981l;
        this.A0H = interfaceC25214BDm;
        this.A05 = viewGroup;
        this.A0D = userSession;
        this.A03 = i;
        this.A0I = c8ji;
        this.A0C = interfaceC11380iw;
        this.A0B = c1815283f;
        this.A0J = c171237kF;
        this.A04 = requireContext;
        C57550PgO A01 = C57550PgO.A01(this, 2);
        InterfaceC09390do A00 = C57550PgO.A00(new C57555PgT(abstractC59962oe, 49), EnumC09460dv.A02, 0);
        this.A0V = AbstractC25225BEi.A0a(C57550PgO.A01(A00, 1), A01, C57530Pg4.A00(null, A00, 25), AbstractC25225BEi.A1D(C51044Mgw.class));
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A08(0.0d, true);
        A0R.A0A(new C51978MyM(this, 5));
        this.A07 = A0R;
        C55982hj A0R2 = AbstractC167007dF.A0R();
        A0R2.A08(0.0d, true);
        A0R2.A0A(new C51978MyM(this, 4));
        this.A06 = A0R2;
        this.A0P = C57555PgT.A00(this, 43);
        this.A0Q = C57555PgT.A00(this, 44);
        this.A0M = C57555PgT.A00(this, 40);
        this.A0N = C57555PgT.A00(this, 41);
        this.A0O = C57555PgT.A00(this, 42);
        this.A0R = C57555PgT.A00(this, 45);
        this.A0S = C57555PgT.A00(this, 46);
        this.A0T = C57555PgT.A00(this, 47);
        this.A0U = C57555PgT.A00(this, 48);
        C27961Xa A002 = AbstractC54912fq.A00();
        QPTooltipAnchor qPTooltipAnchor = QPTooltipAnchor.A0j;
        C09530e4 A012 = A01(qPTooltipAnchor);
        QPTooltipAnchor qPTooltipAnchor2 = QPTooltipAnchor.A0h;
        C09530e4 A013 = A01(qPTooltipAnchor2);
        C09530e4 A014 = A01(QPTooltipAnchor.A0i);
        C09530e4 A015 = A01(QPTooltipAnchor.A0k);
        QPTooltipAnchor qPTooltipAnchor3 = QPTooltipAnchor.A0g;
        C09530e4 A016 = A01(qPTooltipAnchor3);
        QPTooltipAnchor qPTooltipAnchor4 = QPTooltipAnchor.A0l;
        C09530e4 A017 = A01(qPTooltipAnchor4);
        QPTooltipAnchor qPTooltipAnchor5 = QPTooltipAnchor.A0m;
        C64742wY A05 = A002.A05(userSession, AbstractC06930Yk.A07(A012, A013, A014, A015, A016, A017, A01(qPTooltipAnchor5)));
        this.A0K = A05;
        C3I8 A018 = C3I7.A01(this, false, false);
        this.A0E = A018;
        this.A09 = C56034Ou6.A00(this, 33);
        this.A08 = C56034Ou6.A00(this, 32);
        abstractC59962oe.registerLifecycleListener(this);
        C27961Xa A003 = AbstractC54912fq.A00();
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0b;
        C54922fr A0S = AbstractC31175DnJ.A0S();
        A0S.A01(new P73(this, 6), A05);
        A0S.A02 = new P70(this, 2);
        C64842wi A0T = AbstractC31175DnJ.A0T(abstractC59962oe, userSession, A0S, A003, quickPromotionSlot);
        this.A00 = A0T;
        c1810981l.A0H(new C57106PUv(this));
        c1815283f.A00().A08(new C57105PUu(this));
        AbstractC59962oe abstractC59962oe2 = this.A0A;
        abstractC59962oe2.registerLifecycleListener(this.A0K);
        abstractC59962oe2.registerLifecycleListener(this.A0I);
        A018.A9e(this);
        Ok4.A00(AbstractC167007dF.A0L(this.A0S), 50, this);
        Ok4.A00(AbstractC167007dF.A0L(this.A0T), 51, this);
        C8GH c8gh2 = this.A0G;
        C81W c81w = C81W.A0d;
        c8gh2.A08(c81w, C57755Pji.A02(this, 29));
        c8gh2.A07(c81w, qPTooltipAnchor, A0T, this.A0K);
        C8GH c8gh3 = this.A0G;
        C81W c81w2 = C81W.A0X;
        c8gh3.A08(c81w2, C57755Pji.A02(this, 25));
        c8gh3.A07(c81w2, qPTooltipAnchor3, A0T, this.A0K);
        C8GH c8gh4 = this.A0G;
        C81W c81w3 = C81W.A0Y;
        c8gh4.A08(c81w3, C57755Pji.A02(this, 26));
        c8gh4.A07(c81w3, qPTooltipAnchor2, A0T, this.A0K);
        C25671My A004 = AbstractC25651Mw.A00(this.A0D);
        A004.A01(this.A09, C171427kY.class);
        A004.A01(this.A08, C171437kZ.class);
        C8GH c8gh5 = this.A0G;
        C81W c81w4 = C81W.A0a;
        c8gh5.A08(c81w4, C57755Pji.A02(this, 27));
        c8gh5.A07(c81w4, AbstractC171517kh.A00(this.A0D).A01.isEmpty() ? qPTooltipAnchor4 : qPTooltipAnchor5, A0T, this.A0K);
        this.A0G.A08(C81W.A0V, C57755Pji.A02(this, 24));
        this.A0G.A08(C81W.A0c, C57755Pji.A02(this, 28));
        A03();
        A02();
        this.A0L = "live_composer";
    }

    public static C51044Mgw A00(C56049OuO c56049OuO) {
        return (C51044Mgw) c56049OuO.A0V.getValue();
    }

    public static C09530e4 A01(Object obj) {
        return new C09530e4(obj, new C171257kH());
    }

    private final void A02() {
        if (this.A01 == null) {
            this.A01 = AbstractC18560vj.A03(AbstractC25235BEs.A0S(this.A0A), C57167PZl.A02(this, A00(this).A0J, 25));
        }
    }

    private final void A03() {
        if (this.A02 == null) {
            this.A02 = AbstractC18560vj.A03(AbstractC25235BEs.A0S(this.A0A), C57167PZl.A02(this, new C15430py(A00(this).A0T), 26));
        }
    }

    public static final void A04(C81W c81w, C56049OuO c56049OuO, boolean z, boolean z2) {
        C1810981l c1810981l = c56049OuO.A0F;
        c1810981l.A0K(C81S.A00, c81w, z);
        if (z2 != c1810981l.A0W(c81w)) {
            c1810981l.A0M(c81w);
        }
    }

    @Override // X.InterfaceC171187kA
    public final void DLG() {
        String str;
        C141796aw A00;
        int i;
        CameraAREffect cameraAREffect = this.A0B.A00().A05.A09;
        C51044Mgw A002 = A00(this);
        boolean A02 = C3ER.A00().A02(this.A04, this.A0D);
        String str2 = null;
        if (cameraAREffect != null) {
            str = cameraAREffect.A0K;
            str2 = cameraAREffect.A0M;
        } else {
            str = null;
        }
        AnonymousClass229.A01(A002.A08).A0y(EnumC114925Hg.LIVE, AnonymousClass249.OTHER, EnumC50631MWs.A0E, str, str2);
        C1810981l c1810981l = A002.A09;
        if (c1810981l.A08.A00 != C81S.A00) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Live button type but current destination is ");
            A1C.append(c1810981l);
            C0w9.A03("ig_live", AbstractC166997dE.A0x(".cameraDestination", A1C));
        } else {
            if (A02) {
                A00 = AbstractC141776au.A00(A002);
                i = 4;
            } else {
                A002.A06.A0C(A002.A07, "button", A002.A05 + 1);
                A002.A00.A0C.getValue();
                A00 = AbstractC141776au.A00(A002);
                i = 5;
            }
            PZD.A02(A002, A00, i);
        }
        AnonymousClass195 anonymousClass195 = this.A01;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A01 = null;
        AnonymousClass195 anonymousClass1952 = this.A02;
        if (anonymousClass1952 != null) {
            anonymousClass1952.AGH(null);
        }
        this.A02 = null;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0L;
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        AnonymousClass195 anonymousClass195 = this.A01;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A01 = null;
        AnonymousClass195 anonymousClass1952 = this.A02;
        if (anonymousClass1952 != null) {
            anonymousClass1952.AGH(null);
        }
        this.A02 = null;
        AbstractC59962oe abstractC59962oe = this.A0A;
        abstractC59962oe.unregisterLifecycleListener(this.A0K);
        abstractC59962oe.unregisterLifecycleListener(this.A0I);
        UserSession userSession = this.A0D;
        AbstractC25651Mw.A00(userSession).A02(this.A09, C171427kY.class);
        AbstractC25651Mw.A00(userSession).A02(this.A08, C171437kZ.class);
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        AnonymousClass195 anonymousClass195 = this.A02;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A02 = null;
        AnonymousClass195 anonymousClass1952 = this.A01;
        if (anonymousClass1952 != null) {
            anonymousClass1952.AGH(null);
        }
        this.A01 = null;
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        C51044Mgw A00 = A00(this);
        MSX.A1S(A00.A0P, i);
        if (i == 0) {
            PZD.A02(A00, AbstractC141776au.A00(A00), 6);
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        A03();
        A02();
    }
}
