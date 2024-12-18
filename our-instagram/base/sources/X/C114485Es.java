package X;

import android.app.Application;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.LinearLayoutManagerCompat;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/* renamed from: X.5Es, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114485Es extends AbstractC114495Et implements InterfaceC11380iw, C1M1, InterfaceC60682pr, AnonymousClass309, InterfaceC60072op, InterfaceC60092or, InterfaceC11480j6, InterfaceC60122ou, InterfaceC60132ov {
    public static final String __redex_internal_original_name = "DiscoveryChainingFeedFragment";
    public int A00;
    public int A01;
    public int A02;
    public MTJ A05;
    public ViewOnTouchListenerC60632pm A06;
    public HLQ A07;
    public C41718Idp A08;
    public DiscoveryChainingItem A09;
    public C61712rY A0A;
    public C37840Gku A0B;
    public C3FQ A0C;
    public C62112sC A0D;
    public C61582rL A0E;
    public C32S A0F;
    public C6WQ A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public long A0U;
    public LinearLayoutManagerCompat A0V;
    public C57112jm A0W;
    public C68752VbV A0X;
    public C38016Go3 A0Y;
    public IEV A0Z;
    public C684636j A0a;
    public ExploreTopicCluster A0b;
    public InterfaceC114705Ga A0c;
    public C30A A0d;
    public C62812tK A0e;
    public C3D3 A0f;
    public JHG A0g;
    public C64992wx A0h;
    public InterfaceC669530m A0i;
    public V8L A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public Queue A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public final InterfaceC09390do A0y;
    public final ILJ A0z;
    public final C40949IBw A10;
    public final C1I2 A11;
    public final C64562wF A12;
    public final C37330GcY A0x = new C37330GcY();
    public int A03 = 1;
    public int A04 = 1;
    public int A0T = 4;
    public final InterfaceC09390do A13 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60132ov
    public final boolean CcV() {
        return true;
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6Q(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C11520jB E6P = E6P();
        E6P.A04(C5I8.A1A, Long.valueOf(A04().A00(c38321qM)));
        return E6P;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String str;
        String str2;
        C2EC c2ec;
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkS(true);
        if (this.A0v) {
            interfaceC56362iU.EgU();
        }
        interfaceC56362iU.Ehq(this);
        String str3 = this.A0K;
        if (str3 == null || this.A01 == 0) {
            str3 = this.A0H;
        }
        C37840Gku c37840Gku = this.A0B;
        if (c37840Gku != null && (c2ec = c37840Gku.A0A) != null) {
            str = c2ec.C7l();
        } else {
            str = null;
        }
        interfaceC56362iU.EaW(str3, str);
        if (this.A0w) {
            interfaceC56362iU.AAF(new ViewOnClickListenerC41863Ih1(this), 2131961124);
        }
        UserSession session = getSession();
        String str4 = this.A0J;
        if (str4 == null) {
            str2 = "discoveryChainingModuleName";
        } else {
            List A00 = FVF.A00(session, str4);
            if (!A00.isEmpty()) {
                ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A06;
                if (viewOnTouchListenerC60632pm == null) {
                    str2 = "scrollableNavigationHelper";
                } else {
                    viewOnTouchListenerC60632pm.A0A = A00;
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        if (this.A0Y != null) {
            A04().A01().notifyDataSetChangedSmart(configuration);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.refreshable_container_stub);
        if (viewStub != null) {
            view = viewStub.inflate();
        }
        List A00 = C71253Hm.A00.A00(view, getSession());
        C3FQ A002 = C3FN.A00((ViewGroup) view.findViewById(android.R.id.list));
        C57112jm c57112jm = this.A0W;
        if (c57112jm == null) {
            str = "viewpointManager";
        } else {
            C71163Hc A003 = C71163Hc.A00(this);
            ViewGroup CFj = A002.CFj();
            InterfaceC57142jp[] interfaceC57142jpArr = (InterfaceC57142jp[]) A00.toArray(new InterfaceC57142jp[0]);
            c57112jm.A08(CFj, A003, (InterfaceC57142jp[]) Arrays.copyOf(interfaceC57142jpArr, interfaceC57142jpArr.length));
            this.A0C = A002;
            view.requireViewById(R.id.refreshable_container).setEnabled(false);
            C3FQ c3fq = this.A0C;
            if (c3fq != null) {
                ViewGroup CFj2 = c3fq.CFj();
                C14360o3.A0C(CFj2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                RecyclerView recyclerView = (RecyclerView) CFj2;
                recyclerView.setLayoutManager(A00(this));
                recyclerView.A0S = true;
                recyclerView.setItemViewCacheSize(10);
                if (C18U.A06(C06090Tz.A05, getSession(), 36322980804307754L)) {
                    recyclerView.setItemAnimator(null);
                } else {
                    C3F1 c3f1 = recyclerView.A0C;
                    if (c3f1 != null && (c3f1 instanceof C3F0)) {
                        ((C3F0) c3f1).A00 = false;
                    }
                }
                C38016Go3 A04 = A04();
                InterfaceC60682pr interfaceC60682pr = (InterfaceC60682pr) A04.A0E;
                C3FQ scrollingViewProxy = interfaceC60682pr.getScrollingViewProxy();
                ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = A04.A0F;
                viewOnTouchListenerC60632pm.A06(A04.A01(), interfaceC60682pr.getScrollingViewProxy(), A04.A08);
                viewOnTouchListenerC60632pm.A02();
                scrollingViewProxy.EPJ(A04.A01());
                scrollingViewProxy.AAJ(A04);
                C66290U7l c66290U7l = A04.A02;
                if (c66290U7l != null && !scrollingViewProxy.CXX()) {
                    C3FP c3fp = (C3FP) scrollingViewProxy;
                    C38018Go6 A01 = A04.A01();
                    C33P c33p = A04.A05;
                    if (c33p != null) {
                        c66290U7l.A05(A01, c33p, c3fp);
                    } else {
                        str = "videoFeedModule";
                    }
                }
                C41718Idp c41718Idp = this.A08;
                if (c41718Idp == null) {
                    str = "chainingLogger";
                } else {
                    c41718Idp.A01 = this.A0C;
                    C71313Hs.A00(getSession()).A05(view, EnumC71343Hv.A0K);
                    InterfaceC114705Ga interfaceC114705Ga = this.A0c;
                    if (interfaceC114705Ga != null) {
                        Application application = requireActivity().getApplication();
                        C14360o3.A07(application);
                        AbstractC35068Fcf.A00(this, (C44451JlJ) new C52942bb(new JnC(application, getSession(), interfaceC114705Ga), this).A00(C44451JlJ.class));
                        return;
                    }
                    return;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final LinearLayoutManagerCompat A00(C114485Es c114485Es) {
        LinearLayoutManagerCompat linearLayoutManagerCompat = c114485Es.A0V;
        if (linearLayoutManagerCompat == null) {
            LinearLayoutManagerCompat linearLayoutManagerCompat2 = new LinearLayoutManagerCompat(c114485Es.requireContext());
            linearLayoutManagerCompat2.A02 = true;
            c114485Es.A0V = linearLayoutManagerCompat2;
            return linearLayoutManagerCompat2;
        }
        return linearLayoutManagerCompat;
    }

    public static final void A01(C114485Es c114485Es) {
        Iterator it;
        Queue queue = c114485Es.A0p;
        if (queue != null && (it = queue.iterator()) != null && it.hasNext()) {
            C38321qM A02 = C1DW.A00(c114485Es.getSession()).A02((String) queue.poll());
            if (A02 != null) {
                C38018Go6 A01 = c114485Es.A04().A01();
                List singletonList = Collections.singletonList(A02);
                C14360o3.A07(singletonList);
                A01.A05(singletonList);
            }
        }
    }

    public static final boolean A02(C114485Es c114485Es) {
        if (c114485Es.A0Q) {
            C37840Gku c37840Gku = c114485Es.A0B;
            if (c37840Gku != null) {
                C38321qM A01 = c37840Gku.A01();
                if (A01 != null) {
                    String id = A01.getId();
                    DiscoveryChainingItem discoveryChainingItem = c114485Es.A09;
                    if (discoveryChainingItem == null) {
                        C14360o3.A0F("discoveryChainingItem");
                        throw C00O.createAndThrow();
                    }
                    if (C14360o3.A0K(id, discoveryChainingItem.A0E)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return true;
    }

    @Override // X.AbstractC59962oe
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final UserSession getSession() {
        return (UserSession) this.A13.getValue();
    }

    public final C38016Go3 A04() {
        C38016Go3 c38016Go3 = this.A0Y;
        if (c38016Go3 != null) {
            return c38016Go3;
        }
        C14360o3.A0F("viewController");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60132ov
    public final ViewOnTouchListenerC60632pm BDY() {
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A06;
        if (viewOnTouchListenerC60632pm == null) {
            C14360o3.A0F("scrollableNavigationHelper");
            throw C00O.createAndThrow();
        }
        return viewOnTouchListenerC60632pm;
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6P() {
        String str;
        C11520jB c11520jB = new C11520jB();
        C11500j9 c11500j9 = C5I8.A1C;
        C41718Idp c41718Idp = this.A08;
        if (c41718Idp == null) {
            str = "chainingLogger";
        } else {
            c11520jB.A04(c11500j9, c41718Idp.A0B);
            C11500j9 c11500j92 = C5I8.A6U;
            DiscoveryChainingItem discoveryChainingItem = this.A09;
            if (discoveryChainingItem == null) {
                str = "discoveryChainingItem";
            } else {
                c11520jB.A04(c11500j92, discoveryChainingItem.A0E);
                c11520jB.A04(C5I8.A1D, this.A0o);
                c11520jB.A06(this.A0x.A00);
                AnonymousClass729.A00(getSession()).A00(c11520jB);
                return c11520jB;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        String str;
        C11520jB c11520jB = new C11520jB();
        C11500j9 c11500j9 = C5I8.A1C;
        C41718Idp c41718Idp = this.A08;
        if (c41718Idp == null) {
            str = "chainingLogger";
        } else {
            c11520jB.A04(c11500j9, c41718Idp.A0B);
            C11500j9 c11500j92 = C5I8.A6U;
            DiscoveryChainingItem discoveryChainingItem = this.A09;
            if (discoveryChainingItem == null) {
                str = "discoveryChainingItem";
            } else {
                c11520jB.A04(c11500j92, discoveryChainingItem.A0E);
                AnonymousClass729.A00(getSession()).A00(c11520jB);
                return c11520jB;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC60092or
    public final void EMT() {
        C69457Vng c69457Vng;
        C66289U7k c66289U7k;
        int intValue;
        if (this.A0Y != null) {
            C38016Go3 A04 = A04();
            AbstractC59962oe abstractC59962oe = A04.A0E;
            C3FQ scrollingViewProxy = ((InterfaceC60682pr) abstractC59962oe).getScrollingViewProxy();
            if (scrollingViewProxy != null) {
                C66290U7l c66290U7l = A04.A02;
                if (c66290U7l != null && (c69457Vng = c66290U7l.A03) != null && (c66289U7k = c66290U7l.A04) != null) {
                    c69457Vng.A01 = true;
                    XDm xDm = c66289U7k.A04;
                    if (xDm.AZY().isEmpty()) {
                        intValue = 0;
                    } else {
                        intValue = ((Number) xDm.AZY().get(0)).intValue();
                    }
                    c66289U7k.A00 = Math.max(0, intValue - 1);
                }
                scrollingViewProxy.EMU(abstractC59962oe);
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A0J;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC60682pr
    public final C3FQ getScrollingViewProxy() {
        return this.A0C;
    }

    @Override // X.C1M1
    public final String getSessionId() {
        String str = this.A0k;
        if (str == null) {
            C14360o3.A0F("_sessionId");
            throw C00O.createAndThrow();
        }
        return str;
    }

    public C114485Es() {
        C9E1 c9e1 = new C9E1(this, 39);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9E1(new C9E1(this, 40), 41));
        this.A0y = new C60842q8(new C9E1(A00, 42), c9e1, new C9FA(32, A00, null), new C0YZ(C61142qc.class));
        this.A10 = new C40949IBw(this);
        this.A0z = new ILJ(this);
        this.A11 = new C39169HLx(this);
        this.A12 = AbstractC64552wE.A00(new C42743Ivh(this), getModuleName());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0466  */
    /* JADX WARN: Type inference failed for: r2v187, types: [X.30m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v47, types: [X.HLQ, X.2pj, X.2rW] */
    /* JADX WARN: Type inference failed for: r2v76, types: [java.lang.Object, X.VbV] */
    /* JADX WARN: Type inference failed for: r3v60, types: [java.lang.Object, X.2pj] */
    /* JADX WARN: Type inference failed for: r40v0, types: [java.lang.Object, X.2y4] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r74) {
        /*
            Method dump skipped, instructions count: 2668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114485Es.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-149560704);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_context_feed_rv, viewGroup, false);
        C14360o3.A07(inflate);
        A04().A00 = A00(this);
        C0f9.A09(1283282232, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C31561Dtm A00;
        Long l;
        int A02 = C0f9.A02(1612998051);
        super.onDestroy();
        C38016Go3 A04 = A04();
        UserSession userSession = A04.A0H;
        FCM.A00(userSession).A00.clear();
        A04.A0L.A01.A00();
        C25671My A002 = AbstractC25651Mw.A00(userSession);
        A002.A02(A04.A0D, C3HW.class);
        A002.A02(A04.A0C, C42245InV.class);
        A002.A02(A04.A0B, C42229InF.class);
        A002.A02(A04.A0A, C3HV.class);
        A002.A02(A04.A0G, C70073Cr.class);
        C42411xV A003 = C42411xV.A00(getSession());
        String str = this.A0J;
        String str2 = "discoveryChainingModuleName";
        if (str != null) {
            A003.A08(str);
            C37840Gku c37840Gku = this.A0B;
            if (c37840Gku != null) {
                unregisterLifecycleListener(c37840Gku);
            }
            C62812tK c62812tK = this.A0e;
            if (c62812tK != null) {
                unregisterLifecycleListener(c62812tK);
            }
            C32S c32s = this.A0F;
            if (c32s != null) {
                c32s.A0B();
            }
            String str3 = this.A0J;
            if (str3 != null) {
                if (str3.equals("feed_contextual_chain") && (l = (A00 = JWq.A00(getSession())).A04) != null) {
                    A00.A00 += A00.A08.now() - l.longValue();
                }
                V8L v8l = this.A0j;
                if (v8l != null) {
                    this.mLifecycleRegistry.A0A(v8l);
                }
                C30A c30a = this.A0d;
                if (c30a != null) {
                    unregisterLifecycleListener(c30a);
                }
                HLQ hlq = this.A07;
                if (hlq == null) {
                    str2 = "feedMediaLoadingTracker";
                } else {
                    unregisterLifecycleListener(hlq);
                    C0f9.A09(-692814202, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        int A02 = C0f9.A02(1959752715);
        C38016Go3 A04 = A04();
        C3FQ scrollingViewProxy = ((InterfaceC60682pr) A04.A0E).getScrollingViewProxy();
        if (scrollingViewProxy != null) {
            C66290U7l c66290U7l = A04.A02;
            if (!scrollingViewProxy.CXX() && c66290U7l != null) {
                C3FP c3fp = (C3FP) scrollingViewProxy;
                C33P c33p = A04.A05;
                if (c33p != null) {
                    c66290U7l.A07(c33p, c3fp);
                } else {
                    str = "videoFeedModule";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
            scrollingViewProxy.EPJ(null);
            scrollingViewProxy.AI0();
        }
        FVF.A01(A04.A0H, A04.A0M.getModuleName(), true);
        super.onDestroyView();
        this.A0C = null;
        C41718Idp c41718Idp = this.A08;
        if (c41718Idp == null) {
            str = "chainingLogger";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        c41718Idp.A01 = null;
        A04().A00 = null;
        this.A0V = null;
        C0f9.A09(-426574799, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C31561Dtm A00;
        Long l;
        int A02 = C0f9.A02(1391858392);
        super.onPause();
        C38016Go3 A04 = A04();
        A04.A0F.A09(((InterfaceC60682pr) A04.A0E).getScrollingViewProxy());
        C66290U7l c66290U7l = A04.A02;
        if (c66290U7l != null) {
            C66290U7l.A00(c66290U7l);
        }
        C3I9 c3i9 = A04.A01;
        if (c3i9 != null) {
            c3i9.EFx(A04.A0K);
        }
        String str = this.A0J;
        if (str == null) {
            C14360o3.A0F("discoveryChainingModuleName");
            throw C00O.createAndThrow();
        }
        if (str.equals("feed_contextual_chain") && (l = (A00 = JWq.A00(getSession())).A04) != null) {
            A00.A00 += A00.A08.now() - l.longValue();
        }
        C42411xV.A00(getSession());
        C11T.A00();
        C11T.A00();
        C0f9.A09(863440980, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC114495Et, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        C32121E9u c32121E9u;
        ViewGroup viewGroup;
        int A02 = C0f9.A02(-1046609977);
        super.onResume();
        C38016Go3 A04 = A04();
        FragmentActivity activity = A04.A0E.getActivity();
        UserSession userSession = A04.A0H;
        InterfaceC60442pS interfaceC60442pS = A04.A0M;
        List A00 = FVF.A00(userSession, interfaceC60442pS.getModuleName());
        C56352iT A03 = C56352iT.A0t.A03(activity);
        C66290U7l c66290U7l = A04.A02;
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = A04.A0F;
        float f = A04.A08;
        if (c66290U7l != null) {
            c32121E9u = new C32121E9u(c66290U7l.A07, c66290U7l.A08);
        } else {
            c32121E9u = new Object();
        }
        if (A04.A0S) {
            viewGroup = A03.A0O;
        } else {
            viewGroup = A03.A0P;
        }
        List singletonList = Collections.singletonList(viewGroup);
        C14360o3.A07(singletonList);
        viewOnTouchListenerC60632pm.A05(c32121E9u, A00, singletonList, f, true);
        if (activity != null) {
            C1OU c1ou = C1OU.$redex_init_class;
            C3M4 A05 = C3M4.A05(activity);
            if (A05 != null && A05.A0a()) {
                A05.A0Y(interfaceC60442pS);
            }
        }
        C3I9 c3i9 = A04.A01;
        if (c3i9 != null) {
            c3i9.A9e(A04.A0K);
        }
        String str = this.A0J;
        if (str == null) {
            C14360o3.A0F("discoveryChainingModuleName");
            throw C00O.createAndThrow();
        }
        if (str.equals("feed_contextual_chain")) {
            C31561Dtm A002 = JWq.A00(getSession());
            A002.A04 = Long.valueOf(A002.A08.now());
        }
        C42411xV.A00(getSession());
        requireContext();
        C11T.A00();
        C11T.A00();
        C0f9.A09(-253986105, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        String str;
        int A02 = C0f9.A02(1552805072);
        super.onStart();
        C38016Go3 A04 = A04();
        FragmentActivity activity = A04.A0E.getActivity();
        C3I9 c3i9 = A04.A01;
        if (c3i9 != null && activity != null) {
            c3i9.Dnr(activity);
        }
        C41718Idp c41718Idp = this.A08;
        if (c41718Idp == null) {
            C14360o3.A0F("chainingLogger");
            throw C00O.createAndThrow();
        }
        c41718Idp.A00 = c41718Idp.A05.now();
        c41718Idp.A02 = false;
        if (c41718Idp.A01 != null) {
            int A00 = C41718Idp.A00(c41718Idp);
            if (A00 >= c41718Idp.A04.getCount() || (str = C41718Idp.A02(c41718Idp, A00)) == null) {
                str = c41718Idp.A0A;
            }
            UserSession userSession = c41718Idp.A08;
            InterfaceC11380iw interfaceC11380iw = c41718Idp.A06;
            String str2 = c41718Idp.A0B;
            String str3 = c41718Idp.A0A;
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
            InterfaceC02590Ai A002 = A01.A00(A01.A00, "chaining_feed_session_start");
            A002.AAP("m_pk", str);
            A002.AAP("parent_m_pk", str3);
            A002.AAP("chaining_session_id", str2);
            A002.Cht();
        }
        C0f9.A09(-728050789, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        String str;
        InterfaceC02590Ai A00;
        int A02 = C0f9.A02(-368454017);
        super.onStop();
        C3I9 c3i9 = A04().A01;
        if (c3i9 != null) {
            c3i9.onStop();
        }
        C41718Idp c41718Idp = this.A08;
        if (c41718Idp == null) {
            C14360o3.A0F("chainingLogger");
            throw C00O.createAndThrow();
        }
        boolean z = this.A0t;
        String str2 = this.A0m;
        long j = this.A0U;
        C3FQ c3fq = c41718Idp.A01;
        if (c3fq != null && c3fq.BM3() >= 0) {
            int A002 = C41718Idp.A00(c41718Idp);
            if (A002 >= c41718Idp.A04.getCount() || (str = C41718Idp.A02(c41718Idp, A002)) == null) {
                str = c41718Idp.A0A;
                A002 = 0;
            }
            UserSession userSession = c41718Idp.A08;
            InterfaceC11380iw interfaceC11380iw = c41718Idp.A06;
            if (z) {
                String str3 = c41718Idp.A0B;
                String str4 = c41718Idp.A0A;
                int A01 = C41718Idp.A01(c41718Idp, A002);
                long now = c41718Idp.A05.now() - c41718Idp.A00;
                C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
                A00 = A012.A00(A012.A00, "chaining_feed_session_summary");
                A00.AAP("chaining_session_id", str3);
                A00.AAP("parent_m_pk", str4);
                A00.A8I("time_spent", Double.valueOf(now));
                A00.A9K("chaining_position", Long.valueOf(A01));
                A00.AAP("m_pk", str);
                A00.AAP("nudge_name", str2);
                A00.A9K("nudge_position", Long.valueOf(j));
            } else {
                String str5 = c41718Idp.A0B;
                String str6 = c41718Idp.A0A;
                int A013 = C41718Idp.A01(c41718Idp, A002);
                long now2 = c41718Idp.A05.now() - c41718Idp.A00;
                C18920wW A014 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
                A00 = A014.A00(A014.A00, "chaining_feed_session_summary");
                A00.AAP("chaining_session_id", str5);
                A00.AAP("parent_m_pk", str6);
                A00.A8I("time_spent", Double.valueOf(now2));
                A00.A9K("chaining_position", Long.valueOf(A013));
                A00.AAP("m_pk", str);
            }
            A00.Cht();
        }
        C0f9.A09(-1479833655, A02);
    }
}
