package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.8JI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8JI implements InterfaceC60602pj {
    public C55U A00;
    public InterfaceC25209BDh A01;
    public BD0 A02;
    public BD0 A03;
    public BD0 A04;
    public boolean A05;
    public boolean A06;
    public final Context A07;
    public final AbstractC59962oe A08;
    public final UserSession A09;
    public final C1810981l A0A;
    public final C8HI A0B;
    public final C8FG A0C;
    public final C1813982r A0D;
    public final C8JL A0E;
    public final C8JL A0F;
    public final C8JL A0G;

    public C8JI(AbstractC59962oe abstractC59962oe, UserSession userSession, C1810981l c1810981l, C8HI c8hi, AnonymousClass880 anonymousClass880, C8FG c8fg, C1813982r c1813982r) {
        C14360o3.A0B(abstractC59962oe, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c1810981l, 3);
        Context requireContext = abstractC59962oe.requireContext();
        this.A08 = abstractC59962oe;
        this.A09 = userSession;
        this.A0A = c1810981l;
        this.A0D = c1813982r;
        this.A0B = c8hi;
        this.A0C = c8fg;
        this.A07 = requireContext;
        this.A0E = new C8JJ(requireContext, userSession, c8hi, anonymousClass880, c8fg, c1813982r);
        this.A0F = new C8JM(requireContext, userSession, c8hi, anonymousClass880, c8fg, c1813982r);
        this.A0G = new C8JN(requireContext, userSession, c8hi, anonymousClass880, c8fg, c1813982r);
        c1810981l.A0H(new C8JO(this));
        c1810981l.A0G(new C8JP(this));
    }

    public final void A09(boolean z) {
        this.A00 = null;
        A03(null, this);
        MXK mxk = MXK.A0C;
        if (mxk.A0B() && z) {
            synchronized (mxk) {
                MXK.A05 = Long.valueOf(System.currentTimeMillis());
                MXK.A03 = false;
            }
        }
        UserSession userSession = this.A09;
        Context context = this.A07;
        if (AbstractC195888lY.A01(context.getApplicationContext(), userSession)) {
            C37101o8.A00(AbstractC195888lY.A00()).A00(context, userSession, AmA.A00, "sup:SupDelegate_VIEW_WITHOUT_SUP_CALLBACK");
        }
        A07();
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
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
    public final /* synthetic */ void onDestroyView() {
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

    public static final AbstractC55106ObM A00(C8JI c8ji) {
        C190298bn A01 = C190298bn.A03.A01(c8ji.A09);
        if (A01 != null) {
            return A01.A00();
        }
        return null;
    }

    public static final void A02(C55U c55u, C8JI c8ji) {
        C9BE c9be;
        InterfaceC25209BDh interfaceC25209BDh;
        C8JL c8jl;
        C8JL BNn;
        InterfaceC25209BDh interfaceC25209BDh2;
        C8JL BNn2;
        C8JL BNn3;
        C8JL BNn4;
        C8JL BNn5;
        AbstractC195978lm.A02.A01("sup:SupDelegate", AnonymousClass001.A0R("onCameraDestinationChanged: Switch to ", c55u.A02));
        if (c55u instanceof C81S) {
            InterfaceC25209BDh interfaceC25209BDh3 = c8ji.A01;
            if (interfaceC25209BDh3 != null && (BNn5 = interfaceC25209BDh3.BNn()) != null) {
                BNn5.ARa();
            }
            C55U c55u2 = c8ji.A00;
            if (c55u2 != null && !c55u2.equals(c55u)) {
                c8ji.A01();
            }
            InterfaceC25209BDh interfaceC25209BDh4 = c8ji.A01;
            if (interfaceC25209BDh4 != null) {
                interfaceC25209BDh4.EYK(c8ji.A0E);
            }
            A03(c55u, c8ji);
            InterfaceC25209BDh interfaceC25209BDh5 = c8ji.A01;
            if (interfaceC25209BDh5 != null && (BNn4 = interfaceC25209BDh5.BNn()) != null) {
                BNn4.DtV();
            }
            UserSession userSession = c8ji.A09;
            Context context = c8ji.A07;
            AbstractC195888lY.A01(context.getApplicationContext(), userSession);
            if (AbstractC195888lY.A01(context.getApplicationContext(), userSession)) {
                C37101o8.A00(AbstractC195888lY.A00()).A00(context, userSession, C24068Am9.A00, "sup:SupDelegate_SET_IS_FIRST_CONNECTION_CALLBACK");
                return;
            }
            return;
        }
        if (c55u instanceof C81V) {
            if (C18U.A06(C06090Tz.A05, c8ji.A09, 36319750988570270L)) {
                InterfaceC25209BDh interfaceC25209BDh6 = c8ji.A01;
                if (interfaceC25209BDh6 != null && (BNn3 = interfaceC25209BDh6.BNn()) != null) {
                    BNn3.ARa();
                }
                C55U c55u3 = c8ji.A00;
                if (c55u3 != null && !c55u3.equals(c55u)) {
                    c8ji.A01();
                }
                interfaceC25209BDh = c8ji.A01;
                if (interfaceC25209BDh != null) {
                    c8jl = c8ji.A0F;
                    interfaceC25209BDh.EYK(c8jl);
                }
                A03(c55u, c8ji);
                interfaceC25209BDh2 = c8ji.A01;
                if (interfaceC25209BDh2 != null || (BNn2 = interfaceC25209BDh2.BNn()) == null) {
                    return;
                }
                BNn2.DtV();
                return;
            }
        }
        if ((c55u instanceof C208509Kk) && !AbstractC190348bs.A00(c55u, (java.util.Set) c8ji.A0A.A09.A00)) {
            UserSession userSession2 = c8ji.A09;
            if (AbstractC195898lZ.A00(c8ji.A07, userSession2) && (!c8ji.A06 || C18U.A06(C06090Tz.A05, userSession2, 36319750988635807L))) {
                InterfaceC25209BDh interfaceC25209BDh7 = c8ji.A01;
                if (interfaceC25209BDh7 != null && (BNn = interfaceC25209BDh7.BNn()) != null) {
                    BNn.ARa();
                }
                c8ji.A05 = false;
                C55U c55u4 = c8ji.A00;
                if (c55u4 != null && !c55u4.equals(c55u)) {
                    c8ji.A01();
                }
                interfaceC25209BDh = c8ji.A01;
                if (interfaceC25209BDh != null) {
                    c8jl = c8ji.A0G;
                    interfaceC25209BDh.EYK(c8jl);
                }
                A03(c55u, c8ji);
                interfaceC25209BDh2 = c8ji.A01;
                if (interfaceC25209BDh2 != null) {
                    return;
                } else {
                    return;
                }
            }
        }
        c8ji.A01();
        AbstractC55106ObM A00 = A00(c8ji);
        if (A00 == null || (c9be = (C9BE) A00.A04.getValue()) == null || !c9be.A03) {
            return;
        }
        c8ji.A09(false);
    }

    public static final void A03(C55U c55u, C8JI c8ji) {
        C8JL BNn;
        AbstractC55106ObM A00;
        C9BE c9be;
        if (c55u != null) {
            C55U c55u2 = c8ji.A00;
            c8ji.A00 = c55u;
            if (c55u2 == null) {
                AbstractC55106ObM A002 = A00(c8ji);
                if (A002 != null) {
                    AbstractC55106ObM.A01(A002, 29, false, !AbstractC23021Ah.A00(c8ji.A09).A1z(), false, false, false);
                }
                if (A00(c8ji) == null || (A00 = A00(c8ji)) == null || (c9be = (C9BE) A00.A04.getValue()) == null || !c9be.A03) {
                    AbstractC59962oe abstractC59962oe = c8ji.A08;
                    if (!abstractC59962oe.mDetached && abstractC59962oe.mView != null) {
                        InterfaceC25209BDh interfaceC25209BDh = c8ji.A01;
                        if (interfaceC25209BDh != null) {
                            interfaceC25209BDh.bind();
                        }
                        BD0 bd0 = c8ji.A03;
                        if (bd0 != null) {
                            bd0.bind();
                        }
                        BD0 bd02 = c8ji.A02;
                        if (bd02 != null) {
                            bd02.bind();
                        }
                        BD0 bd03 = c8ji.A04;
                        if (bd03 != null) {
                            bd03.bind();
                        }
                    }
                    UserSession userSession = c8ji.A09;
                    Context context = c8ji.A07;
                    if (AbstractC195888lY.A01(context.getApplicationContext(), userSession)) {
                        C37101o8.A00(AbstractC195888lY.A00()).A00(context, userSession, new C56756PGy(c8ji), "sup:SupDelegate|SupLiveDelegate_ADD_CB");
                    }
                    if (!MXK.A0C.A0B()) {
                        A04(c8ji);
                    }
                }
                AbstractC55106ObM A003 = A00(c8ji);
                if (A003 != null && c8ji.A01 != null && !A003.A0L()) {
                    InterfaceC25209BDh interfaceC25209BDh2 = c8ji.A01;
                    if (interfaceC25209BDh2 != null && (BNn = interfaceC25209BDh2.BNn()) != null) {
                        BNn.DtV();
                    }
                    if (!A003.A0K() && !A003.A0I() && A05(c8ji)) {
                        C55054Oa5.A00(false);
                        AbstractC55106ObM A004 = A00(c8ji);
                        if (A004 != null) {
                            A004.A0E(true);
                        }
                    }
                }
            }
        }
        AbstractC55106ObM A005 = A00(c8ji);
        if (A005 != null) {
            A005.A0D(false);
        }
        UserSession userSession2 = c8ji.A09;
        Context context2 = c8ji.A07;
        if (AbstractC195888lY.A01(context2.getApplicationContext(), userSession2)) {
            C37101o8.A00(AbstractC195888lY.A00()).A00(context2, userSession2, new C24063Alz(c8ji), "sup:SupDelegate_DESTINATION_WITH_SUP_CALLBACK");
        }
    }

    public static final void A04(C8JI c8ji) {
        InterfaceC58127Ppq interfaceC58127Ppq;
        if (AbstractC195888lY.A01(c8ji.A07.getApplicationContext(), c8ji.A09) && (interfaceC58127Ppq = AbstractC195888lY.A00().A01) != null) {
            MXK.A0C.A09();
            interfaceC58127Ppq.Bpv().EDG(false);
        }
    }

    public final void A06() {
        UserSession userSession = this.A09;
        Context context = this.A07;
        if (AbstractC195888lY.A01(context.getApplicationContext(), userSession)) {
            C37101o8.A00(AbstractC195888lY.A00()).A00(context, userSession, new C24064Am0(this), "sup:SupDelegate_SEND_STREAM_STARTING_LIFECYCLE_EVENT_ON_LIVE_BUTTON_TAP_CALLBACK");
        }
    }

    public final void A07() {
        AbstractC59962oe abstractC59962oe = this.A08;
        if (!abstractC59962oe.mDetached && abstractC59962oe.mView != null) {
            InterfaceC25209BDh interfaceC25209BDh = this.A01;
            if (interfaceC25209BDh != null) {
                interfaceC25209BDh.unbind();
            }
            BD0 bd0 = this.A03;
            if (bd0 != null) {
                bd0.unbind();
            }
            BD0 bd02 = this.A02;
            if (bd02 != null) {
                bd02.unbind();
            }
            BD0 bd03 = this.A04;
            if (bd03 != null) {
                bd03.unbind();
            }
        }
    }

    public final void A08(boolean z) {
        C8JL c8jl;
        C8JN c8jn;
        InterfaceC25209BDh interfaceC25209BDh = this.A01;
        C8JL c8jl2 = null;
        if (interfaceC25209BDh != null) {
            c8jl = interfaceC25209BDh.BNn();
        } else {
            c8jl = null;
        }
        if (c8jl instanceof C8JN) {
            if (interfaceC25209BDh != null) {
                c8jl2 = interfaceC25209BDh.BNn();
            }
            if ((c8jl2 instanceof C8JN) && (c8jn = (C8JN) c8jl2) != null) {
                UserSession userSession = c8jn.A08;
                Context context = c8jn.A07;
                if (AbstractC195888lY.A01(context.getApplicationContext(), userSession)) {
                    C37101o8.A00(AbstractC195888lY.A00()).A00(context, userSession, new Am8(c8jn, z), "GlassesStoryViewListener_SEND_STREAM_ENDING_LIFECYCLE_EVENT_ON_VIDEO_END_CALLBACK");
                }
            }
        }
    }

    private final void A01() {
        C8JL BNn;
        AbstractC55106ObM A00 = A00(this);
        if (A00 != null && A00.A0J()) {
            AbstractC55106ObM A002 = A00(this);
            if (A002 != null) {
                A002.A02();
            }
            InterfaceC25209BDh interfaceC25209BDh = this.A01;
            if (interfaceC25209BDh != null && (BNn = interfaceC25209BDh.BNn()) != null) {
                BNn.DYJ();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r1 != true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A05(X.C8JI r5) {
        /*
            X.ObM r0 = A00(r5)
            r4 = 1
            r3 = 0
            if (r0 == 0) goto Lf
            boolean r1 = r0.A0N()
            r0 = 1
            if (r1 == r4) goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.String r2 = "sup:SupDelegate"
            if (r0 == 0) goto L1c
            X.8ln r1 = X.AbstractC195978lm.A02
            java.lang.String r0 = "Don't autoconnect user - seeing NUX tooltip"
        L18:
            r1.A01(r2, r0)
        L1b:
            return r3
        L1c:
            X.ObM r0 = A00(r5)
            if (r0 == 0) goto L2d
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L2d
            X.8ln r1 = X.AbstractC195978lm.A02
            java.lang.String r0 = "Don't autoconnect user - permissions aren't granted"
            goto L18
        L2d:
            com.instagram.common.session.UserSession r0 = r5.A09
            X.1Ai r0 = X.AbstractC23021Ah.A00(r0)
            boolean r0 = r0.A1r()
            if (r0 != 0) goto L3e
            X.8ln r1 = X.AbstractC195978lm.A02
            java.lang.String r0 = "Don't autoconnect user - has not seen privacy bottom sheet"
            goto L18
        L3e:
            X.55U r0 = r5.A00
            if (r0 == 0) goto L1b
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8JI.A05(X.8JI):boolean");
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        C8JL BNn;
        AbstractC55106ObM A00 = A00(this);
        if (A00 != null) {
            if (A00.A0J()) {
                AbstractC195978lm.A02.A01("sup:SupDelegate", "onPause: Switch to phone camera");
                A00.A02();
                InterfaceC25209BDh interfaceC25209BDh = this.A01;
                if (interfaceC25209BDh != null && (BNn = interfaceC25209BDh.BNn()) != null) {
                    BNn.DYJ();
                }
            }
            AbstractC55106ObM A002 = A00(this);
            if (A002 != null) {
                A002.A0D(true);
            }
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        AbstractC55106ObM A00 = A00(this);
        if (A00 != null) {
            A00.A0D(false);
        }
    }
}
