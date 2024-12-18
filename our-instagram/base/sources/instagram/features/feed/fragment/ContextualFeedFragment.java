package instagram.features.feed.fragment;

import X.AbstractC09440dt;
import X.AbstractC13670mt;
import X.AbstractC18680vv;
import X.AbstractC23721Ec;
import X.AbstractC25351Lp;
import X.AbstractC25651Mw;
import X.AbstractC37439GeJ;
import X.AbstractC37440GeK;
import X.AbstractC39718Hjo;
import X.AbstractC60492pY;
import X.AbstractC60672pq;
import X.AbstractC61242qm;
import X.AbstractC65202xI;
import X.AbstractC65332xV;
import X.AbstractC75373a4;
import X.AnonymousClass309;
import X.AnonymousClass396;
import X.AnonymousClass566;
import X.AnonymousClass729;
import X.C00O;
import X.C05F;
import X.C06090Tz;
import X.C07510aQ;
import X.C0YZ;
import X.C0f9;
import X.C11520jB;
import X.C11T;
import X.C14360o3;
import X.C18U;
import X.C1FP;
import X.C1I2;
import X.C1M0;
import X.C1M1;
import X.C1M3;
import X.C1OK;
import X.C1OL;
import X.C1OP;
import X.C1OU;
import X.C1XM;
import X.C218914p;
import X.C23831Eq;
import X.C25571Mn;
import X.C25581Mo;
import X.C25621Ms;
import X.C25671My;
import X.C2Fb;
import X.C31R;
import X.C32S;
import X.C36095FwV;
import X.C36Y;
import X.C37330GcY;
import X.C37429Ge9;
import X.C37430GeA;
import X.C37445GeP;
import X.C37840Gku;
import X.C37952Gmu;
import X.C37953Gmv;
import X.C38021GoA;
import X.C38022GoB;
import X.C38023GoC;
import X.C38024GoD;
import X.C38025GoE;
import X.C38026GoF;
import X.C38321qM;
import X.C3CO;
import X.C3D3;
import X.C3F0;
import X.C3F1;
import X.C3FP;
import X.C3FQ;
import X.C3FR;
import X.C3HW;
import X.C3MF;
import X.C3MJ;
import X.C3MT;
import X.C3YV;
import X.C40971v4;
import X.C42239InP;
import X.C42251Inb;
import X.C42254Ine;
import X.C42258Ini;
import X.C42411xV;
import X.C4QW;
import X.C52255NAv;
import X.C53T;
import X.C55876OrQ;
import X.C56352iT;
import X.C57112jm;
import X.C5I8;
import X.C5SE;
import X.C60842q8;
import X.C61252qn;
import X.C61712rY;
import X.C62862tP;
import X.C63352uI;
import X.C64742wY;
import X.C64842wi;
import X.C66290U7l;
import X.C684436h;
import X.C70033Cn;
import X.C70063Cq;
import X.C70073Cr;
import X.C71L;
import X.C72133Lm;
import X.C72163Lp;
import X.C79923hh;
import X.C82G;
import X.C98934cD;
import X.C9EN;
import X.C9F2;
import X.EnumC09460dv;
import X.EnumC23341Bw;
import X.EnumC50628MWp;
import X.HY4;
import X.IC5;
import X.IE4;
import X.InterfaceC09390do;
import X.InterfaceC114465Eq;
import X.InterfaceC114475Er;
import X.InterfaceC114705Ga;
import X.InterfaceC114745Gf;
import X.InterfaceC11480j6;
import X.InterfaceC12870lZ;
import X.InterfaceC38371qR;
import X.InterfaceC41501vz;
import X.InterfaceC53712dA;
import X.InterfaceC60072op;
import X.InterfaceC60092or;
import X.InterfaceC60122ou;
import X.InterfaceC60132ov;
import X.InterfaceC60142ow;
import X.InterfaceC60162oy;
import X.InterfaceC60442pS;
import X.InterfaceC60682pr;
import X.InterfaceC62602sz;
import X.InterfaceC62612t0;
import X.JIJ;
import X.MSV;
import X.OEK;
import X.V8L;
import X.ViewOnKeyListenerC677333n;
import X.ViewOnTouchListenerC60632pm;
import X.ViewTreeObserverOnGlobalLayoutListenerC35715Fpp;
import X.W65;
import X.YE3;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class ContextualFeedFragment extends AbstractC60672pq implements C1M1, InterfaceC62602sz, InterfaceC12870lZ, InterfaceC60682pr, AnonymousClass309, InterfaceC60072op, InterfaceC114465Eq, InterfaceC62612t0, InterfaceC60092or, InterfaceC11480j6, InterfaceC60122ou, InterfaceC60132ov, InterfaceC60142ow, InterfaceC60162oy, C53T, InterfaceC114475Er, C31R {
    public int A00;
    public int A01;
    public int A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public ViewOnTouchListenerC60632pm A06;
    public YE3 A07;
    public W65 A08;
    public C11520jB A09;
    public JIJ A0A;
    public AbstractC37439GeJ A0B;
    public C3CO A0C;
    public IC5 A0D;
    public C61712rY A0E;
    public InterfaceC38371qR A0F;
    public C37445GeP A0G;
    public C71L A0H;
    public UserDetailFragment A0I;
    public C64842wi A0J;
    public C64742wY A0K;
    public C32S A0L;
    public C1M0 A0M;
    public HY4 A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public List A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public int A0Y;
    public int A0Z;
    public int A0a;
    public C72163Lp A0b;
    public C56352iT A0c;
    public C62862tP A0d;
    public EnumC50628MWp A0e;
    public InterfaceC41501vz A0f;
    public InterfaceC41501vz A0g;
    public InterfaceC41501vz A0h;
    public InterfaceC41501vz A0i;
    public InterfaceC41501vz A0j;
    public C3MJ A0k;
    public C3MT A0l;
    public C57112jm A0m;
    public C66290U7l A0n;
    public InterfaceC114705Ga A0o;
    public C36Y A0p;
    public C52255NAv A0q;
    public AnonymousClass396 A0r;
    public C63352uI A0s;
    public ContextualFeedNetworkConfig A0t;
    public C37840Gku A0u;
    public ViewOnKeyListenerC677333n A0v;
    public C3D3 A0w;
    public SearchContext A0x;
    public V8L A0y;
    public IE4 A0z;
    public Long A10;
    public String A11;
    public String A12;
    public String A13;
    public String A14;
    public String A15;
    public String A16;
    public String A17;
    public boolean A18;
    public boolean A19;
    public boolean A1B;
    public boolean A1C;
    public boolean A1D;
    public boolean A1E;
    public boolean A1F;
    public boolean A1G;
    public boolean A1H;
    public final String A1J;
    public final InterfaceC09390do A1L;
    public final InterfaceC41501vz A1M;
    public final InterfaceC41501vz A1N;
    public final InterfaceC41501vz A1O;
    public final InterfaceC41501vz A1P;
    public final InterfaceC114745Gf A1R;
    public final C1I2 A1S;
    public final C38024GoD A1T;
    public View mContextualFeedContainer;
    public final C37430GeA A1I = new C37430GeA();
    public final C37330GcY A1Q = new C37330GcY();
    public final InterfaceC09390do A1U = C1XM.A00(new C9EN(this, 29));
    public boolean A1A = true;
    public final InterfaceC09390do A1V = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A1K = AbstractC09440dt.A01(new C9EN(this, 27));

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        A03(this, false, false);
    }

    @Override // X.C53T
    public final void D3g(IgImageView igImageView, InterfaceC38371qR interfaceC38371qR, int i, int i2, boolean z, boolean z2) {
        C14360o3.A0B(interfaceC38371qR, 0);
        C14360o3.A0B(igImageView, 3);
        C5SE c5se = new C5SE(A00(this), interfaceC38371qR);
        c5se.A00 = i2;
        c5se.A01 = i;
        C38321qM BQN = interfaceC38371qR.BQN();
        C37952Gmu c37952Gmu = new C37952Gmu(this, A00(this), c5se, this, C2Fb.A1q);
        c37952Gmu.A01(BQN);
        c37952Gmu.A09 = i2;
        c37952Gmu.A0B = i;
        c37952Gmu.A00(igImageView, c5se, BQN);
        if (interfaceC38371qR instanceof C40971v4) {
            c37952Gmu.A0O = (C40971v4) interfaceC38371qR;
        }
        new C37953Gmv(c37952Gmu).A04();
    }

    @Override // X.InterfaceC60142ow
    public final void Dlb() {
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6Q(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C11520jB E6P = E6P();
        User A2E = c38321qM.A2E(A00(this));
        if (A2E != null) {
            AbstractC37440GeK.A00(E6P, A2E);
        }
        E6P.A04(C5I8.A1C, this.A1J);
        Long l = this.A10;
        if (l != null) {
            E6P.A04(C5I8.A8P, String.valueOf(l));
        }
        String str = this.A17;
        if (str != null) {
            E6P.A04(C5I8.A8Q, str);
        }
        return E6P;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00eb, code lost:
    
        if ((r2 instanceof com.instagram.modal.ModalActivity) != false) goto L35;
     */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r9) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.feed.fragment.ContextualFeedFragment.configureActionBar(X.2iU):void");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        ViewTreeObserver viewTreeObserver;
        C14360o3.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        View view = this.mView;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC35715Fpp(view, this));
        }
        HY4 hy4 = this.A0N;
        if (hy4 == null) {
            C14360o3.A0F("adapter");
            throw C00O.createAndThrow();
        }
        hy4.notifyDataSetChangedSmart(configuration);
    }

    @Override // X.AbstractC60672pq
    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        UserSession A00 = A00(this);
        C14360o3.A0B(A00, 0);
        if (C18U.A06(C06090Tz.A05, A00, 36322980804373291L)) {
            recyclerView.setItemAnimator(null);
            return;
        }
        C3F1 c3f1 = recyclerView.A0C;
        if (!(c3f1 instanceof C3F0)) {
            return;
        }
        ((C3F0) c3f1).A00 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x0475, code lost:
    
        if ((r3.A03().size() - r5) <= ((java.lang.Number) r23.A1K.getValue()).intValue()) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0299, code lost:
    
        if (r3.A03().size() <= ((java.lang.Number) r23.A1K.getValue()).intValue()) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x029b, code lost:
    
        AD4();
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0201  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 1245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.feed.fragment.ContextualFeedFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final UserSession A00(ContextualFeedFragment contextualFeedFragment) {
        return (UserSession) contextualFeedFragment.A1V.getValue();
    }

    public static final void A02(ContextualFeedFragment contextualFeedFragment) {
        int i;
        String str;
        if (contextualFeedFragment.A1A) {
            String str2 = contextualFeedFragment.A0S;
            int i2 = 0;
            if (str2 != null && str2.length() != 0) {
                contextualFeedFragment.A1A = false;
                ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = contextualFeedFragment.A06;
                if (viewOnTouchListenerC60632pm == null) {
                    str = "_helper";
                } else {
                    viewOnTouchListenerC60632pm.A02();
                    C3FQ scrollingViewProxy = contextualFeedFragment.getScrollingViewProxy();
                    String str3 = contextualFeedFragment.A0S;
                    if (str3 != null) {
                        HY4 hy4 = contextualFeedFragment.A0N;
                        if (hy4 != null) {
                            int count = hy4.getCount();
                            i = 0;
                            while (i < count) {
                                HY4 hy42 = contextualFeedFragment.A0N;
                                if (hy42 != null) {
                                    if (hy42.getItem(i) instanceof C38321qM) {
                                        HY4 hy43 = contextualFeedFragment.A0N;
                                        if (hy43 != null) {
                                            Object item = hy43.getItem(i);
                                            C14360o3.A0C(item, "null cannot be cast to non-null type com.instagram.feed.media.Media");
                                            String id = ((C38321qM) item).getId();
                                            if (id != null) {
                                                if (str3.equals(id) || C14360o3.A0K(C3YV.A02(str3), C3YV.A02(id))) {
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                    i++;
                                }
                            }
                        }
                        C14360o3.A0F("adapter");
                        throw C00O.createAndThrow();
                    }
                    i = 0;
                    if (!contextualFeedFragment.A1B) {
                        AbstractC37439GeJ abstractC37439GeJ = contextualFeedFragment.A0B;
                        if (abstractC37439GeJ == null) {
                            str = "contextualFeedController";
                        } else {
                            i2 = abstractC37439GeJ.A04(contextualFeedFragment.requireActivity());
                        }
                    }
                    scrollingViewProxy.EdZ(i, i2);
                    return;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
    }

    public static final void A03(ContextualFeedFragment contextualFeedFragment, boolean z, boolean z2) {
        AbstractC37439GeJ abstractC37439GeJ = contextualFeedFragment.A0B;
        if (abstractC37439GeJ == null) {
            C14360o3.A0F("contextualFeedController");
            throw C00O.createAndThrow();
        }
        abstractC37439GeJ.A0R(z, z2);
        if (contextualFeedFragment.A0q != null && z) {
            C61252qn A00 = AbstractC61242qm.A00(A00(contextualFeedFragment));
            if (!A00.A0I()) {
                Integer num = C05F.A0Y;
                Integer num2 = C05F.A1F;
                C1OK c1ok = new C1OK();
                UserSession userSession = A00.A07;
                C1OL c1ol = c1ok.A00;
                C1OU c1ou = C1OU.$redex_init_class;
                C25581Mo c25581Mo = new C25581Mo(new C07510aQ(userSession), C25571Mn.class);
                String obj = UUID.randomUUID().toString();
                String obj2 = UUID.randomUUID().toString();
                C25621Ms c25621Ms = new C25621Ms(userSession, 197);
                Integer num3 = C05F.A01;
                c25621Ms.A09(num3);
                c25621Ms.A0B("feed/reels_tray/");
                c25621Ms.A02 = c25581Mo;
                c25621Ms.A0A = "feed/reels_tray/_v1";
                c25621Ms.A08(num);
                c25621Ms.A00 = c1ol;
                c25621Ms.A9s("tray_session_id", obj);
                c25621Ms.A9s(TraceFieldType.RequestID, obj2);
                c25621Ms.A9s("reason", "following_feed");
                c25621Ms.A9s("timezone_offset", Long.toString(C23831Eq.A00()));
                c25621Ms.A9s("is_following_feed", "true");
                ((AbstractC23721Ec) c25621Ms).A06 = EnumC23341Bw.CriticalAPI;
                Pair A002 = AnonymousClass566.A00(userSession);
                c25621Ms.A0H((String) A002.first, (String) A002.second);
                c25621Ms.A0T = true;
                if (C18U.A06(C06090Tz.A05, AbstractC25351Lp.A00(userSession).A00, 36318707311450537L)) {
                    c25621Ms.A0G("X-IG-Reel-Tray-Bandwidth-KBPS", AbstractC13670mt.A06("%.0f", Double.valueOf(C1FP.A00())));
                }
                C98934cD c98934cD = new C98934cD(c25621Ms.A0N(), num, num2, num3, obj2, obj, null);
                ((C1OP) c98934cD).A00 = c1ol;
                A00.A06 = c1ok;
                C61252qn.A04(contextualFeedFragment, null, c98934cD, A00, num, num2);
                A00.A0G = true;
            }
        }
    }

    public final int A04() {
        HY4 hy4 = this.A0N;
        if (hy4 == null) {
            C14360o3.A0F("adapter");
            throw C00O.createAndThrow();
        }
        return hy4.BRE().size();
    }

    @Override // X.InterfaceC114465Eq
    public final Hashtag BD4() {
        Object obj = this.A0B;
        if (obj == null) {
            C14360o3.A0F("contextualFeedController");
            throw C00O.createAndThrow();
        }
        if (!(obj instanceof InterfaceC114465Eq)) {
            return null;
        }
        return ((InterfaceC114465Eq) obj).BD4();
    }

    @Override // X.InterfaceC60132ov
    public final ViewOnTouchListenerC60632pm BDY() {
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A06;
        if (viewOnTouchListenerC60632pm == null) {
            C14360o3.A0F("_helper");
            throw C00O.createAndThrow();
        }
        return viewOnTouchListenerC60632pm;
    }

    @Override // X.InterfaceC60162oy
    public final Integer BRW() {
        return C05F.A00;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        if (this.A0N == null) {
            C14360o3.A0F("adapter");
            throw C00O.createAndThrow();
        }
        return !((AbstractC65332xV) ((AbstractC65202xI) r0).A00).A01.isEmpty();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        AbstractC37439GeJ abstractC37439GeJ = this.A0B;
        if (abstractC37439GeJ == null) {
            C14360o3.A0F("contextualFeedController");
            throw C00O.createAndThrow();
        }
        return abstractC37439GeJ.A0T();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        AbstractC37439GeJ abstractC37439GeJ = this.A0B;
        if (abstractC37439GeJ == null) {
            C14360o3.A0F("contextualFeedController");
            throw C00O.createAndThrow();
        }
        return abstractC37439GeJ.A0V();
    }

    @Override // X.InterfaceC60132ov
    public final boolean CcV() {
        AbstractC37439GeJ abstractC37439GeJ = this.A0B;
        if (abstractC37439GeJ == null) {
            C14360o3.A0F("contextualFeedController");
            throw C00O.createAndThrow();
        }
        return abstractC37439GeJ.A0Y();
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6P() {
        C11520jB c11520jB = new C11520jB();
        c11520jB.A06(this.A1Q.A00);
        C11520jB c11520jB2 = this.A09;
        AbstractC37439GeJ abstractC37439GeJ = this.A0B;
        if (abstractC37439GeJ == null) {
            C14360o3.A0F("contextualFeedController");
            throw C00O.createAndThrow();
        }
        abstractC37439GeJ.A0H(c11520jB);
        if (c11520jB2 != null) {
            c11520jB.A06(c11520jB2);
        }
        AnonymousClass729.A00(A00(this)).A00(c11520jB);
        return c11520jB;
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        return this.A09;
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        if (this.mView != null) {
            getScrollingViewProxy().EMU(this);
        }
    }

    @Override // X.InterfaceC114475Er
    public final boolean EpU() {
        return this.A1G;
    }

    @Override // X.C31R
    public final void F7s(boolean z) {
        AnonymousClass396 anonymousClass396 = this.A0r;
        if (z) {
            if (anonymousClass396 != null) {
                anonymousClass396.onResume();
            }
        } else {
            if (anonymousClass396 == null) {
                return;
            }
            anonymousClass396.onPause();
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return (String) this.A1U.getValue();
    }

    @Override // X.C1M1
    public final String getSessionId() {
        C1M0 c1m0 = this.A0M;
        if (c1m0 == null) {
            C14360o3.A0F("sessionProvider");
            throw C00O.createAndThrow();
        }
        return c1m0.A00;
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        AbstractC37439GeJ abstractC37439GeJ = this.A0B;
        if (abstractC37439GeJ == null) {
            C14360o3.A0F("contextualFeedController");
            throw C00O.createAndThrow();
        }
        return abstractC37439GeJ.A0X();
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        Object obj = this.A0B;
        if (obj == null) {
            C14360o3.A0F("contextualFeedController");
            throw C00O.createAndThrow();
        }
        if ((obj instanceof InterfaceC60442pS) && !((InterfaceC60442pS) obj).isOrganicEligible()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        Object obj = this.A0B;
        if (obj == null) {
            C14360o3.A0F("contextualFeedController");
            throw C00O.createAndThrow();
        }
        if (!(obj instanceof InterfaceC60442pS) || !((InterfaceC60442pS) obj).isSponsoredEligible()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        Integer num;
        YE3 ye3;
        AbstractC37439GeJ abstractC37439GeJ = this.A0B;
        if (abstractC37439GeJ != null) {
            abstractC37439GeJ.A0B();
            if ("BUSINESS_INSPIRATION_HUB".equals(this.A0O) && this.A18 && (ye3 = this.A07) != null) {
                ye3.A03("pro_inspiration_feed");
                this.A18 = false;
            }
            if (this.A0V || this.A0W) {
                AbstractC37439GeJ abstractC37439GeJ2 = this.A0B;
                if (abstractC37439GeJ2 != null) {
                    if (abstractC37439GeJ2.A0X()) {
                        C61712rY c61712rY = this.A0E;
                        if (c61712rY != null) {
                            String moduleName = getModuleName();
                            AbstractC37439GeJ abstractC37439GeJ3 = this.A0B;
                            if (abstractC37439GeJ3 != null) {
                                if (abstractC37439GeJ3.A0W()) {
                                    num = C05F.A00;
                                } else {
                                    num = C05F.A0C;
                                }
                                c61712rY.A05(null, num, moduleName, "BACK");
                                if (AbstractC39718Hjo.A00(A00(this))) {
                                    C61712rY c61712rY2 = this.A0E;
                                    if (c61712rY2 != null) {
                                        c61712rY2.A05(null, C05F.A0C, getModuleName(), "BACK");
                                    }
                                }
                            }
                        }
                        C14360o3.A0F("feedMediaLoadingLogger");
                        throw C00O.createAndThrow();
                    }
                }
            }
            return false;
        }
        C14360o3.A0F("contextualFeedController");
        throw C00O.createAndThrow();
    }

    public ContextualFeedFragment() {
        C9EN c9en = new C9EN(this, 28);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9EN(new C9EN(this, 30), 31));
        this.A1L = new C60842q8(new C9EN(A00, 32), c9en, new C9F2(0, null, A00), new C0YZ(Object.class));
        this.A0a = -1;
        this.A00 = -1;
        this.A1J = C1M3.A00().A00;
        this.A1S = new C37429Ge9(this);
        this.A1P = new C38025GoE(this);
        this.A1O = new C38021GoA(this);
        this.A1M = new C38026GoF(this);
        this.A1T = new C38024GoD(this);
        this.A1R = new C38023GoC(this);
        this.A1N = new C38022GoB(this);
    }

    public static final Object A01(ContextualFeedFragment contextualFeedFragment) {
        if (contextualFeedFragment.isAdded() && !contextualFeedFragment.mDetached && contextualFeedFragment.mView != null) {
            C3FQ scrollingViewProxy = contextualFeedFragment.getScrollingViewProxy();
            HY4 hy4 = contextualFeedFragment.A0N;
            if (hy4 != null) {
                List A04 = hy4.A04();
                int B6q = scrollingViewProxy.B6q();
                int BM3 = scrollingViewProxy.BM3();
                if (B6q >= 0 && BM3 >= 0) {
                    HY4 hy42 = contextualFeedFragment.A0N;
                    if (hy42 != null) {
                        Object item = hy42.getItem(B6q);
                        HY4 hy43 = contextualFeedFragment.A0N;
                        if (hy43 != null) {
                            Object item2 = hy43.getItem(BM3);
                            C14360o3.A0B(A04, 0);
                            int indexOf = A04.indexOf(item);
                            int indexOf2 = A04.indexOf(item2);
                            if (indexOf2 != indexOf) {
                                int i = indexOf2 - indexOf;
                                if (i > 1) {
                                    return A04.get((indexOf2 + indexOf) / 2);
                                }
                                if (i == 1) {
                                    int i2 = B6q;
                                    while (true) {
                                        HY4 hy44 = contextualFeedFragment.A0N;
                                        if (hy44 == null) {
                                            break;
                                        }
                                        if (hy44.getItem(i2) == item) {
                                            i2++;
                                        } else {
                                            View AnU = scrollingViewProxy.AnU(i2 - B6q);
                                            C14360o3.A07(AnU);
                                            View view = contextualFeedFragment.mView;
                                            if (view != null) {
                                                if (AnU.getTop() - view.getTop() >= view.getHeight() / 2) {
                                                    return item;
                                                }
                                                return item2;
                                            }
                                        }
                                    }
                                }
                            } else {
                                return item;
                            }
                        }
                    }
                }
            }
            C14360o3.A0F("adapter");
            throw C00O.createAndThrow();
        }
        return null;
    }

    public final void A05(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C684436h c684436h = new C684436h(activity, A00(this));
            String moduleName = getModuleName();
            C1M0 c1m0 = this.A0M;
            if (c1m0 == null) {
                C14360o3.A0F("sessionProvider");
                throw C00O.createAndThrow();
            }
            c684436h.A04(moduleName, c1m0.A00, str);
        }
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        if (!isLoading() && CLJ()) {
            AbstractC37439GeJ abstractC37439GeJ = this.A0B;
            if (abstractC37439GeJ == null) {
                C14360o3.A0F("contextualFeedController");
                throw C00O.createAndThrow();
            }
            abstractC37439GeJ.A0A();
        }
    }

    @Override // X.InterfaceC60162oy
    public final String BkH() {
        Object A01 = A01(this);
        if (A01 == null || !(A01 instanceof InterfaceC38371qR)) {
            return null;
        }
        return ((InterfaceC38371qR) A01).BQN().A0C.getLoggingInfoToken();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        if (CUG() || !isLoading()) {
            return true;
        }
        if (this.A0N == null) {
            C14360o3.A0F("adapter");
            throw C00O.createAndThrow();
        }
        return !((AbstractC65332xV) ((AbstractC65202xI) r0).A00).A01.isEmpty();
    }

    @Override // X.InterfaceC60142ow
    public final void D2E(C38321qM c38321qM) {
        AnonymousClass396 anonymousClass396;
        if (c38321qM.A5P()) {
            UserSession A00 = A00(this);
            C14360o3.A0B(A00, 0);
            if (C18U.A06(C06090Tz.A05, A00, 36323092473129920L) && (anonymousClass396 = this.A0r) != null) {
                boolean A0B = AbstractC75373a4.A0B(A00(this), c38321qM.CFR());
                C4QW c4qw = anonymousClass396.A05.A0G.A05;
                if (c4qw != null) {
                    c4qw.EQ0(A0B);
                }
            }
        }
    }

    @Override // X.InterfaceC60142ow
    public final void Dlc(C38321qM c38321qM) {
        C79923hh.A05(this, C79923hh.A00(C82G.A0U, new C55876OrQ(), A00(this), c38321qM, C05F.A01), A00(this));
    }

    @Override // X.InterfaceC60162oy
    public final String getMediaId() {
        Object A01 = A01(this);
        if (A01 == null || !(A01 instanceof InterfaceC38371qR)) {
            return null;
        }
        return ((InterfaceC38371qR) A01).BQN().getId();
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return A00(this);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        C38321qM c38321qM;
        String id;
        super.onActivityResult(i, i2, intent);
        if (i == 4921 || i == 4928) {
            if ((i2 == 1 || i2 == 2) && intent != null && (stringExtra = intent.getStringExtra(MSV.A00(677))) != null) {
                HY4 hy4 = this.A0N;
                if (hy4 != null) {
                    int count = hy4.getCount();
                    for (int i3 = 0; i3 < count; i3++) {
                        HY4 hy42 = this.A0N;
                        if (hy42 != null) {
                            Object item = hy42.getItem(i3);
                            if ((item instanceof C38321qM) && (id = (c38321qM = (C38321qM) item).getId()) != null && (stringExtra.equals(id) || C14360o3.A0K(C3YV.A02(stringExtra), C3YV.A02(id)))) {
                                UserSession A00 = A00(this);
                                C55876OrQ c55876OrQ = new C55876OrQ();
                                UserSession A002 = A00(this);
                                Integer num = C05F.A01;
                                OEK A003 = C79923hh.A00(C82G.A0U, c55876OrQ, A002, c38321qM, num);
                                Context requireContext = requireContext();
                                if (i2 == 1) {
                                    num = C05F.A00;
                                }
                                C79923hh.A03(requireContext, A003, A00, num);
                                return;
                            }
                        }
                    }
                    return;
                }
                C14360o3.A0F("adapter");
                throw C00O.createAndThrow();
            }
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        Integer num;
        int A03 = C0f9.A03(-723799872);
        if (this.A0V || this.A0W) {
            AbstractC37439GeJ abstractC37439GeJ = this.A0B;
            if (abstractC37439GeJ != null) {
                if (abstractC37439GeJ.A0X()) {
                    C61712rY c61712rY = this.A0E;
                    if (c61712rY != null) {
                        String moduleName = getModuleName();
                        AbstractC37439GeJ abstractC37439GeJ2 = this.A0B;
                        if (abstractC37439GeJ2 != null) {
                            if (abstractC37439GeJ2.A0W()) {
                                num = C05F.A00;
                            } else {
                                num = C05F.A0C;
                            }
                            c61712rY.A05(null, num, moduleName, "APP_BACKGROUNDED");
                            if (AbstractC39718Hjo.A00(A00(this))) {
                                C61712rY c61712rY2 = this.A0E;
                                if (c61712rY2 != null) {
                                    c61712rY2.A05(null, C05F.A0C, getModuleName(), "APP_BACKGROUNDED");
                                }
                            }
                        }
                    }
                    C14360o3.A0F("feedMediaLoadingLogger");
                    throw C00O.createAndThrow();
                }
            }
            C14360o3.A0F("contextualFeedController");
            throw C00O.createAndThrow();
        }
        C0f9.A0A(1433020157, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-1336547195, C0f9.A03(-936869365));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0861, code lost:
    
        if (X.C18U.A06(r10, r6, 36316980734595830L) == false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0b21, code lost:
    
        if (r7.equals("feed_contextual_self_profile") != false) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0b23, code lost:
    
        r2 = 23599577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0b3c, code lost:
    
        if (r7.equals(r24) == false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0e66, code lost:
    
        if (X.C18U.A06(r10, r2, 36319742398963327L) == false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0e7b, code lost:
    
        if (X.C18U.A06(r10, r2, 36312866157299048L) == false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0e90, code lost:
    
        if (X.C18U.A06(r10, r2, 36312866157299048L) == false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x1180, code lost:
    
        if (X.C18U.A06(r10, r6, 36319742398635642L) == false) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x1195, code lost:
    
        if (X.C18U.A06(r10, r6, 36312866157495659L) == false) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x11aa, code lost:
    
        if (X.C18U.A06(r10, r6, 36312866157495659L) == false) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0630, code lost:
    
        if (r7 != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0272, code lost:
    
        if (X.C18U.A06(r10, r4, 36315808208522811L) == false) goto L34;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:80:0x03ad. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x09ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0ac6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0adf  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x13de  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x14f4  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x1514  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x064b  */
    /* JADX WARN: Type inference failed for: r12v3, types: [X.2sP, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v8, types: [X.2sP, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v109, types: [X.1M1, X.1M0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v121, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v321, types: [X.345] */
    /* JADX WARN: Type inference failed for: r2v349 */
    /* JADX WARN: Type inference failed for: r2v350 */
    /* JADX WARN: Type inference failed for: r2v65, types: [X.3Lp] */
    /* JADX WARN: Type inference failed for: r2v80, types: [X.GeP, X.2pj, X.2rW] */
    /* JADX WARN: Type inference failed for: r3v163, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v164, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v170, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v42, types: [X.2sP, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v44, types: [X.JIJ] */
    /* JADX WARN: Type inference failed for: r4v54, types: [X.2sP, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v27, types: [X.2fr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r96v0, types: [X.0iw, X.2ow, X.2sz, X.2pq, X.2pS, X.2pr, X.31R, X.07X, androidx.fragment.app.Fragment, X.2oh, java.lang.Object, instagram.features.feed.fragment.ContextualFeedFragment, X.2oe] */
    @Override // X.AbstractC60672pq, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r97) {
        /*
            Method dump skipped, instructions count: 5808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.feed.fragment.ContextualFeedFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-387926388);
        C14360o3.A0B(layoutInflater, 0);
        this.A0c = C56352iT.A0t.A03(getActivity());
        View inflate = layoutInflater.inflate(R.layout.layout_context_feed_rv, viewGroup, false);
        this.mContextualFeedContainer = inflate.requireViewById(R.id.layout_listview_parent_container);
        C0f9.A09(-532709863, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        int A02 = C0f9.A02(535297363);
        super.onDestroy();
        C37445GeP c37445GeP = this.A0G;
        if (c37445GeP == null) {
            str = "feedMediaLoadingTracker";
        } else {
            unregisterLifecycleListener(c37445GeP);
            C25671My A00 = AbstractC25651Mw.A00(A00(this));
            InterfaceC41501vz interfaceC41501vz = this.A0j;
            if (interfaceC41501vz == null) {
                str = "repostDeletedEventListener";
            } else {
                A00.A02(interfaceC41501vz, C42239InP.class);
                AbstractC37439GeJ abstractC37439GeJ = this.A0B;
                if (abstractC37439GeJ == null) {
                    str = "contextualFeedController";
                } else {
                    abstractC37439GeJ.A0L(A00);
                    C37840Gku c37840Gku = this.A0u;
                    if (c37840Gku != null) {
                        unregisterLifecycleListener(c37840Gku);
                    }
                    C32S c32s = this.A0L;
                    if (c32s != null) {
                        c32s.A0B();
                    }
                    C71L c71l = this.A0H;
                    if (c71l != null) {
                        unregisterLifecycleListener(c71l);
                    }
                    C52255NAv c52255NAv = this.A0q;
                    if (c52255NAv != null) {
                        unregisterLifecycleListener(c52255NAv);
                    }
                    C0f9.A09(307552266, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        C66290U7l c66290U7l;
        int A02 = C0f9.A02(878555657);
        if (this.A0n != null) {
            C3FQ c3fq = (C3FR) getScrollingViewProxy();
            if ((c3fq instanceof C3FP) && (c66290U7l = this.A0n) != null) {
                c66290U7l.A07(null, (C3FP) c3fq);
            }
        }
        C37430GeA c37430GeA = this.A1I;
        c37430GeA.A01.A00();
        C25671My A00 = AbstractC25651Mw.A00(A00(this));
        InterfaceC41501vz interfaceC41501vz = this.A0f;
        if (interfaceC41501vz == null) {
            str = "mediaHiddenEventListener";
        } else {
            A00.A02(interfaceC41501vz, C42251Inb.class);
            InterfaceC41501vz interfaceC41501vz2 = this.A0g;
            if (interfaceC41501vz2 == null) {
                str = "mediaStatusUpdateEventListener";
            } else {
                A00.A02(interfaceC41501vz2, C36095FwV.class);
                A00.A02(this.A1P, C70063Cq.class);
                A00.A02(this.A1O, C70073Cr.class);
                A00.A02(this.A1M, C70033Cn.class);
                A00.A02(this.A1N, C3HW.class);
                InterfaceC41501vz interfaceC41501vz3 = this.A0h;
                if (interfaceC41501vz3 == null) {
                    str = "openCarouselReviewMediaConfigureFinishEventIgEventListener";
                } else {
                    A00.A02(interfaceC41501vz3, C42258Ini.class);
                    InterfaceC41501vz interfaceC41501vz4 = this.A0i;
                    if (interfaceC41501vz4 == null) {
                        str = "openCarouselReviewMediaConfigureStartEventIgEventListener";
                    } else {
                        A00.A02(interfaceC41501vz4, C42254Ine.class);
                        AbstractC37439GeJ abstractC37439GeJ = this.A0B;
                        str = "contextualFeedController";
                        if (abstractC37439GeJ != null) {
                            abstractC37439GeJ.A0L(A00);
                            V8L v8l = this.A0y;
                            if (v8l != null) {
                                c37430GeA.F9f(v8l);
                                this.mLifecycleRegistry.A0A(v8l);
                            }
                            AbstractC37439GeJ abstractC37439GeJ2 = this.A0B;
                            if (abstractC37439GeJ2 != null) {
                                abstractC37439GeJ2.A0D();
                                setAdapter(null);
                                super.onDestroyView();
                                C42411xV.A00(A00(this)).A08(getModuleName());
                                this.A05 = null;
                                this.A04 = null;
                                this.A03 = null;
                                C218914p.A07(this);
                                C0f9.A09(205156121, A02);
                                return;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        YE3 ye3;
        String str;
        int A02 = C0f9.A02(918496419);
        super.onPause();
        C72133Lm.A03.A02(getActivity(), A00(this));
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A06;
        if (viewOnTouchListenerC60632pm == null) {
            str = "_helper";
        } else {
            C3FQ scrollingViewProxy = getScrollingViewProxy();
            int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            viewOnTouchListenerC60632pm.A09(scrollingViewProxy);
            C3MF.A02 = null;
            C42411xV.A00(A00(this));
            C11T.A00();
            C11T.A00();
            AbstractC37439GeJ abstractC37439GeJ = this.A0B;
            if (abstractC37439GeJ == null) {
                str = "contextualFeedController";
            } else {
                abstractC37439GeJ.A0E();
                C3MJ c3mj = this.A0k;
                if (c3mj != null) {
                    c3mj.A06(this.A0l);
                    c3mj.A04();
                    this.A0l = null;
                }
                if ("BUSINESS_INSPIRATION_HUB".equals(this.A0O)) {
                    W65 w65 = this.A08;
                    if (w65 != null) {
                        w65.A00.setVisibility(8);
                    }
                    if (getRootActivity() instanceof InterfaceC53712dA) {
                        ComponentCallbacks2 rootActivity = getRootActivity();
                        C14360o3.A0C(rootActivity, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
                        ((InterfaceC53712dA) rootActivity).EfL(this.A0Y);
                    }
                    if (this.A18 && (ye3 = this.A07) != null) {
                        ye3.A04("pro_inspiration_feed");
                        this.A18 = false;
                    }
                }
                C0f9.A09(1913938326, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.feed.fragment.ContextualFeedFragment.onResume():void");
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        super.onSetUserVisibleHint(z, z2);
        AnonymousClass396 anonymousClass396 = this.A0r;
        if (!z) {
            if (anonymousClass396 != null) {
                anonymousClass396.onPause();
            }
        } else {
            if (anonymousClass396 == null) {
                return;
            }
            anonymousClass396.onResume();
        }
    }
}
