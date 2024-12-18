package X;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager;
import com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.Tug, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65823Tug {
    public Parcelable A00;
    public RecyclerView A01;
    public FlowingGridLayoutManager A02;
    public UHC A03;
    public DiscoveryRecyclerView A04;
    public C153156uj A05;
    public C3FQ A06;
    public InterfaceC70513Em A07;
    public boolean A08;
    public final int A09;
    public final AbstractC59962oe A0A;
    public final InterfaceC65252xN A0B;
    public final UserSession A0C;
    public final JI3 A0D;
    public final C66095TzW A0E;
    public final InterfaceC71925XAj A0F;
    public final C61372qz A0G;
    public final GZF A0H;
    public final C38U A0I;
    public final InterfaceC09390do A0J;
    public final V5X[] A0K;
    public final double A0L;
    public final C57112jm A0M;
    public final C66102Tzd A0N;
    public final C66103Tze A0O;
    public final InterfaceC71927XAl A0P;
    public final C38082GpB A0Q;
    public final XDO A0R;
    public final InterfaceC153186um A0S;
    public final XAr A0T;
    public final Integer A0U;
    public final java.util.Set A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;

    public final void A04(int i, int i2) {
        FlowingGridLayoutManager flowingGridLayoutManager = this.A02;
        if (flowingGridLayoutManager != null) {
            C66120Tzy c66120Tzy = flowingGridLayoutManager.A06;
            int i3 = 0;
            Rect A00 = c66120Tzy.A00(0);
            if (A00 != null) {
                A00.bottom = A00.top + i;
                List list = c66120Tzy.A07;
                list.set(0, A00);
                int i4 = i2 - i;
                while (true) {
                    i3++;
                    if (i3 < list.size()) {
                        Rect A002 = c66120Tzy.A00(i3);
                        if (A002 != null) {
                            A002.top -= i4;
                            A002.bottom -= i4;
                            list.set(i3, A002);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.3Em] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    public final void A05(View view, boolean z) {
        ?? r0;
        C14360o3.A0B(view, 0);
        C66095TzW c66095TzW = this.A0E;
        AbstractC59962oe abstractC59962oe = this.A0A;
        FlowingGridLayoutManager flowingGridLayoutManager = new FlowingGridLayoutManager(c66095TzW, AbstractC166997dE.A0N(abstractC59962oe).getDimensionPixelSize(this.A09));
        Parcelable parcelable = this.A00;
        if (parcelable != null) {
            flowingGridLayoutManager.A1P(parcelable);
        }
        this.A00 = null;
        flowingGridLayoutManager.A13(true);
        this.A02 = flowingGridLayoutManager;
        UserSession userSession = this.A0C;
        Integer num = C05F.A0j;
        DiscoveryRecyclerView discoveryRecyclerView = (DiscoveryRecyclerView) C33L.A00(view, userSession, num).requireViewById(R.id.recycler_view);
        discoveryRecyclerView.setLayoutManager(this.A02);
        discoveryRecyclerView.setAdapter(c66095TzW.A0B.A01);
        discoveryRecyclerView.A00 = this.A0L;
        this.A06 = C3FN.A00(discoveryRecyclerView);
        this.A04 = discoveryRecyclerView;
        if (this.A0X) {
            UHC uhc = new UHC(AbstractC166997dE.A0L(discoveryRecyclerView), userSession, this.A0O, this.A0P, this.A0V, this.A0Z, this.A0Y);
            DiscoveryRecyclerView discoveryRecyclerView2 = this.A04;
            if (discoveryRecyclerView2 != null) {
                discoveryRecyclerView2.A10(uhc);
            }
            DiscoveryRecyclerView discoveryRecyclerView3 = this.A04;
            if (discoveryRecyclerView3 != null) {
                discoveryRecyclerView3.A12(uhc);
            }
            this.A03 = uhc;
        }
        this.A01 = (RecyclerView) view.findViewById(R.id.meta_ai_serp_bottom_prompt_pills);
        if (this.A08) {
            r0 = AbstractC1571573u.A02(view, userSession, new C71092Wno(this, 3), num);
        } else {
            r0 = new Object();
        }
        this.A07 = r0;
        C3FQ c3fq = this.A06;
        if (c3fq instanceof C3FR) {
            C14360o3.A0C(c3fq, "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.RefreshableScrollingViewProxy<*>");
            C3FR c3fr = (C3FR) c3fq;
            if (this.A08) {
                if (C18U.A06(C06090Tz.A05, userSession, 36315297107479695L)) {
                    c3fr.setUpPTRSpinner((C71094Wnq) this.A07);
                } else {
                    c3fr.Ehc(new RunnableC66121Tzz(this));
                }
            } else {
                InterfaceC70513Em interfaceC70513Em = this.A07;
                C14360o3.A0A(interfaceC70513Em);
                interfaceC70513Em.APU();
                c3fr.APU();
            }
        } else if (this.A08) {
            C0w9.A03("DiscoveryRecyclerGrid", "PTR is enabled on a non-refreshable parent");
        }
        A00(this, z, true);
        DiscoveryRecyclerView discoveryRecyclerView4 = this.A04;
        if (discoveryRecyclerView4 != null) {
            discoveryRecyclerView4.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC66124U0h(this, 8));
            if (this.A0W) {
                discoveryRecyclerView4.setItemAnimator(null);
            }
            discoveryRecyclerView4.A14(this.A0G);
            this.A0N.A00 = discoveryRecyclerView4;
            AbstractC37301Gc2.A0v(discoveryRecyclerView4, this.A0M, abstractC59962oe);
        }
    }

    public final void A06(InterfaceC62612t0 interfaceC62612t0) {
        int A01;
        C14360o3.A0B(interfaceC62612t0, 0);
        FlowingGridLayoutManager flowingGridLayoutManager = this.A02;
        if (flowingGridLayoutManager != null) {
            C153156uj c153156uj = new C153156uj(flowingGridLayoutManager, interfaceC62612t0, C153146ui.A07, false, false);
            Integer num = this.A0U;
            if (num != null) {
                A01 = num.intValue();
            } else {
                A01 = AbstractC167027dH.A01(this.A0J);
            }
            c153156uj.A01 = new C153176ul(c153156uj, A01);
            InterfaceC153186um interfaceC153186um = this.A0S;
            if (interfaceC153186um != null) {
                c153156uj.A01 = interfaceC153186um;
            }
            XAr xAr = this.A0T;
            if (xAr != null) {
                c153156uj.A02 = xAr;
            }
            XDO xdo = this.A0R;
            if (xdo != null) {
                c153156uj.A00 = xdo;
            }
            this.A0G.A02(c153156uj);
            this.A05 = c153156uj;
        }
    }

    public final void A09(C1I4... c1i4Arr) {
        for (C1I4 c1i4 : c1i4Arr) {
            this.A0G.A02(c1i4);
        }
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [X.JI3, java.lang.Object] */
    public C65823Tug(C66101Tzc c66101Tzc) {
        Object c66117Tzv;
        JI3 c70369WSx;
        C66115Tzt c66115Tzt;
        InterfaceC71925XAj interfaceC71925XAj = c66101Tzc.A07;
        C14360o3.A0A(interfaceC71925XAj);
        this.A0F = interfaceC71925XAj;
        C66095TzW c66095TzW = c66101Tzc.A06;
        C14360o3.A0A(c66095TzW);
        this.A0E = c66095TzW;
        AbstractC59962oe abstractC59962oe = c66101Tzc.A04;
        C14360o3.A0A(abstractC59962oe);
        this.A0A = abstractC59962oe;
        C38U c38u = c66101Tzc.A0G;
        C14360o3.A0A(c38u);
        this.A0I = c38u;
        C61372qz c61372qz = new C61372qz();
        this.A0G = c61372qz;
        C66102Tzd c66102Tzd = new C66102Tzd(c66095TzW);
        this.A0N = c66102Tzd;
        UserSession userSession = c66101Tzc.A0Q;
        this.A0C = userSession;
        C57112jm c57112jm = c66101Tzc.A05;
        C14360o3.A0A(c57112jm);
        this.A0M = c57112jm;
        this.A09 = c66101Tzc.A01;
        this.A0L = c66101Tzc.A00;
        this.A0W = c66101Tzc.A0I;
        this.A0X = c66101Tzc.A0K;
        this.A0Z = c66101Tzc.A0M;
        this.A0Y = c66101Tzc.A0L;
        this.A08 = c66101Tzc.A0N;
        this.A0K = c66101Tzc.A0P;
        this.A0S = c66101Tzc.A0D;
        this.A0T = c66101Tzc.A0E;
        this.A0R = c66101Tzc.A0C;
        this.A0P = c66101Tzc.A09;
        this.A0H = c66101Tzc.A0F;
        this.A0V = new LinkedHashSet();
        boolean z = c66101Tzc.A0J;
        this.A0U = c66101Tzc.A0H;
        C38082GpB c38082GpB = c66101Tzc.A0B;
        this.A0Q = c38082GpB;
        this.A0J = C1XM.A00(new C50159MDm(this, 39));
        if (C3FU.A02(userSession, "ig_olympus_disable_video_autoplay")) {
            this.A0D = new Object();
        } else {
            JIG jig = c66101Tzc.A0A;
            if (jig instanceof C66115Tzt) {
                C66085TzM c66085TzM = c66101Tzc.A03;
                if (c66085TzM != null) {
                    AbstractC167007dF.A1D(abstractC59962oe, 0, c66095TzW);
                    C65868TvV A00 = c66085TzM.A00(userSession);
                    if (A00 != null && (c66115Tzt = c66085TzM.A01) != null) {
                        c66117Tzv = new C66118Tzw(abstractC59962oe, A00, A00.A01, userSession, c66102Tzd, c66095TzW, c66115Tzt, c38082GpB);
                        AbstractC43594JPz.A1Q(c66117Tzv, ((C66105Tzg) c66085TzM.A03.getValue()).A00);
                        c70369WSx = (JI3) c66117Tzv;
                        this.A0D = c70369WSx;
                    }
                }
                c66117Tzv = new Object();
                c70369WSx = (JI3) c66117Tzv;
                this.A0D = c70369WSx;
            } else if (jig instanceof P2J) {
                P2J p2j = (P2J) jig;
                if (c66101Tzc.A0O) {
                    if (p2j != null) {
                        c70369WSx = new C70370WSy(abstractC59962oe, userSession, c66102Tzd, c66095TzW, p2j, c38082GpB);
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else if (p2j != null) {
                    c70369WSx = new C70369WSx(abstractC59962oe, userSession, c66102Tzd, c66095TzW, p2j, c38082GpB, z);
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
                this.A0D = c70369WSx;
            } else {
                if (jig instanceof MZ4) {
                    MZ4 mz4 = (MZ4) jig;
                    if (mz4 != null) {
                        c66117Tzv = new C66117Tzv(abstractC59962oe, userSession, c66102Tzd, c66095TzW, mz4, c38082GpB);
                        c70369WSx = (JI3) c66117Tzv;
                        this.A0D = c70369WSx;
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                c66117Tzv = new Object();
                c70369WSx = (JI3) c66117Tzv;
                this.A0D = c70369WSx;
            }
        }
        c61372qz.A02(new C44229JgZ(2, this, c66101Tzc));
        this.A0B = new C65882Tvm(this);
        this.A0O = new C66103Tze(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if (r2.CbL() != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C65823Tug r4, boolean r5, boolean r6) {
        /*
            X.2oe r0 = r4.A0A
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L4c
            X.3FQ r2 = r4.A06
            r3 = 0
            if (r2 == 0) goto L29
            boolean r0 = r2 instanceof X.C3FR
            if (r0 == 0) goto L29
            if (r6 == 0) goto L29
            X.3FR r2 = (X.C3FR) r2
            r2.EWc(r5)
            boolean r0 = r4.A08
            if (r5 == 0) goto L5a
            if (r0 != 0) goto L23
            boolean r1 = r2.CbL()
            r0 = 0
            if (r1 == 0) goto L24
        L23:
            r0 = 1
        L24:
            r4.A08 = r0
            r2.APU()
        L29:
            X.TzW r2 = r4.A0E
            X.V5X[] r1 = r4.A0K
            r2.A07 = r1
            boolean r0 = r4.A0A()
            if (r0 == 0) goto L4d
            X.TzV r0 = r2.A0E
            if (r0 == 0) goto L3f
            X.GpK r1 = r0.A01
            java.lang.String r0 = "success"
            r1.A00 = r0
        L3f:
            r0 = 0
            r2.A06 = r0
            X.C66095TzW.A00(r2)
            X.3Em r0 = r4.A07
            if (r0 == 0) goto L4c
            r0.EWY(r5, r6)
        L4c:
            return
        L4d:
            r2.A06 = r1
            X.C66095TzW.A00(r2)
            X.3Em r0 = r4.A07
            if (r0 == 0) goto L4c
            r0.EWY(r3, r6)
            return
        L5a:
            if (r0 == 0) goto L29
            r2.ARj()
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65823Tug.A00(X.Tug, boolean, boolean):void");
    }

    public final void A01() {
        DiscoveryRecyclerView discoveryRecyclerView = this.A04;
        if (discoveryRecyclerView != null) {
            discoveryRecyclerView.setAdapter(null);
        }
        this.A04 = null;
        this.A06 = null;
        this.A0N.A00 = null;
        this.A03 = null;
        FlowingGridLayoutManager flowingGridLayoutManager = this.A02;
        if (flowingGridLayoutManager != null) {
            this.A00 = flowingGridLayoutManager.A1M();
        }
        this.A02 = null;
        C153156uj c153156uj = this.A05;
        if (c153156uj != null) {
            this.A0G.A01.remove(c153156uj);
        }
        this.A05 = null;
        this.A07 = null;
    }

    public final void A02() {
        DiscoveryRecyclerView discoveryRecyclerView = this.A04;
        if (discoveryRecyclerView != null) {
            discoveryRecyclerView.post(new RunnableC71356WsR(this));
        }
    }

    public final void A03() {
        FlowingGridLayoutManager flowingGridLayoutManager;
        DiscoveryRecyclerView discoveryRecyclerView = this.A04;
        if (discoveryRecyclerView != null && discoveryRecyclerView.getHeight() != 0 && (flowingGridLayoutManager = this.A02) != null) {
            if (flowingGridLayoutManager.A1b() >= 24) {
                flowingGridLayoutManager.A1O(0);
            }
            flowingGridLayoutManager.A1e(discoveryRecyclerView, 0);
        }
    }

    public final void A07(User user, boolean z) {
        C38321qM BQN;
        String id;
        int A00;
        C66095TzW c66095TzW = this.A0E;
        Iterator A04 = c66095TzW.A0D.A04();
        C14360o3.A07(A04);
        while (A04.hasNext()) {
            InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) A04.next();
            if ((interfaceC66482zP instanceof InterfaceC127975qQ) && (BQN = ((InterfaceC127975qQ) interfaceC66482zP).BQN()) != null) {
                UserSession userSession = c66095TzW.A0A;
                User A2E = BQN.A2E(userSession);
                String str = null;
                if (A2E != null) {
                    str = A2E.getId();
                }
                if (!AbstractC002300n.A0g(str, user.getId(), false)) {
                    continue;
                } else if (!C3YS.A00(userSession).A05(BQN)) {
                    if (z) {
                        C3YT A002 = C3YS.A00(userSession);
                        if (A002 != null) {
                            A002.A02(BQN, true);
                            A002.A01(BQN, 21);
                        }
                        id = BQN.getId();
                        if (id == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        c66095TzW.A03(id);
                    } else {
                        continue;
                    }
                } else if (!z && ((A00 = C3YS.A00(userSession).A00(BQN)) == -1 || A00 == 22 || A00 == 21)) {
                    C3YT A003 = C3YS.A00(userSession);
                    if (A003 != null) {
                        A003.A02(BQN, false);
                        A003.A01(BQN, 22);
                    }
                    id = BQN.getId();
                    if (id == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    c66095TzW.A03(id);
                }
            }
        }
    }

    public final void A08(String str) {
        this.A0E.A03(str);
    }

    public final boolean A0A() {
        return AbstractC167007dF.A1O(this.A0E.getCount());
    }
}
