package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.explore.intf.ExploreFragmentConfig;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.TvU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65867TvU implements JPU {
    public float A00;
    public float A01;
    public int A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public ViewGroup A07;
    public TextView A08;
    public RecyclerView A09;
    public C67827Uz0 A0A;
    public C38141Gq8 A0B;
    public C8QJ A0C;
    public C8QJ A0D;
    public C5SW A0E;
    public SearchEditText A0F;
    public Runnable A0G;
    public Runnable A0H;
    public boolean A0I;
    public Parcelable A0J;
    public Runnable A0K;
    public final int A0L;
    public final int A0M;
    public final Context A0N;
    public final Fragment A0O;
    public final FragmentActivity A0P;
    public final InterfaceC11380iw A0Q;
    public final UserSession A0R;
    public final C44211JgF A0S;
    public final C38084GpD A0T;
    public final ViewOnClickListenerC66108Tzj A0U;
    public final C69533Vqx A0V;
    public final ExploreFragmentConfig A0W;
    public final C66089TzQ A0X;
    public final C66086TzN A0Y;
    public final C64842wi A0Z;
    public final C64742wY A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final VIU A0d;
    public final InterfaceC41501vz A0e;
    public final C38083GpC A0f;
    public final String A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;

    public C65867TvU(Context context, Fragment fragment, FragmentActivity fragmentActivity, VIU viu, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38084GpD c38084GpD, C38083GpC c38083GpC, ViewOnClickListenerC66108Tzj viewOnClickListenerC66108Tzj, C69533Vqx c69533Vqx, C31683Dvo c31683Dvo, ExploreFragmentConfig exploreFragmentConfig, C66089TzQ c66089TzQ, C66086TzN c66086TzN, C64842wi c64842wi, C64742wY c64742wY, boolean z) {
        AbstractC25229BEm.A1M(userSession, 2, c69533Vqx);
        this.A0N = context;
        this.A0R = userSession;
        this.A0P = fragmentActivity;
        this.A0O = fragment;
        this.A0a = c64742wY;
        this.A0Z = c64842wi;
        this.A0Y = c66086TzN;
        this.A0U = viewOnClickListenerC66108Tzj;
        this.A0f = c38083GpC;
        this.A0T = c38084GpD;
        this.A0d = viu;
        this.A0V = c69533Vqx;
        this.A0Q = interfaceC11380iw;
        this.A0j = z;
        this.A0X = c66089TzQ;
        this.A0W = exploreFragmentConfig;
        this.A0S = new C44211JgF(context, userSession, c31683Dvo);
        this.A0e = new C70723Wfo(this, 15);
        this.A0I = true;
        this.A0L = AbstractC53242c7.A07(context);
        this.A0M = AbstractC53242c7.A09(context);
        this.A0b = AbstractC65702TsY.A1Y(userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0i = C18U.A06(c06090Tz, userSession, 36330621551199162L);
        this.A0c = C18U.A06(c06090Tz, userSession, 36330621551330236L);
        this.A0k = AbstractC65702TsY.A1Y(userSession);
        this.A0h = C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36324767511163335L) && C18U.A06(c06090Tz, userSession, 36327357376182811L);
        this.A0g = AbstractC166997dE.A0p(fragmentActivity, 2131962000);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [X.0pQ, java.lang.Object] */
    @Override // X.JIF
    public final void AJJ(ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, InterfaceC65252xN interfaceC65252xN, C3FQ c3fq) {
        int i;
        float A00;
        boolean A1V = AbstractC167007dF.A1V(interfaceC65252xN);
        ViewGroup viewGroup = this.A07;
        if (viewGroup == null) {
            C14360o3.A0F("headerView");
            throw C00O.createAndThrow();
        }
        if (C18U.A06(C06090Tz.A05, this.A0R, 36330621551199162L)) {
            A00 = 0.0f;
        } else {
            ?? obj = new Object();
            if (this.A0b) {
                Context context = this.A0N;
                i = AbstractC53242c7.A0G(context, R.attr.inlineMetaAISearchBarHeight) - AbstractC53242c7.A0G(context, R.attr.inlineSearchBarHeight);
            } else {
                i = 0;
            }
            obj.A00 = i;
            if (this.A0k) {
                C57992lC c57992lC = C57982lB.A0B;
                if (!C57992lC.A03()) {
                    this.A01 = AbstractC38152GqJ.A00(viewGroup, viewOnTouchListenerC60632pm, interfaceC65252xN, c3fq, i);
                }
                c57992lC.A04(this.A0P, new C66180U2v(viewGroup, viewOnTouchListenerC60632pm, interfaceC65252xN, this, c3fq, obj), A1V);
                return;
            }
            A00 = AbstractC38152GqJ.A00(viewGroup, viewOnTouchListenerC60632pm, interfaceC65252xN, c3fq, i);
        }
        this.A01 = A00;
    }

    @Override // X.JIF
    public final void D8R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        View inflate = layoutInflater.inflate(R.layout.explore_header, viewGroup, false);
        if ((inflate instanceof ViewGroup) && (viewGroup2 = (ViewGroup) inflate) != null) {
            this.A07 = viewGroup2;
            this.A09 = (RecyclerView) viewGroup2.requireViewById(R.id.destination_hscroll);
            ViewGroup viewGroup3 = this.A07;
            if (viewGroup3 != null) {
                this.A08 = (TextView) viewGroup3.requireViewById(R.id.header_text_view);
                ViewGroup viewGroup4 = this.A07;
                if (viewGroup4 != null) {
                    this.A06 = viewGroup4.requireViewById(R.id.nav_bar_divider);
                    RecyclerView recyclerView = this.A09;
                    if (recyclerView != null) {
                        AbstractC38152GqJ.A01(recyclerView);
                        recyclerView.A14(new U00(recyclerView, this.A0S, this.A0f));
                    }
                    AbstractC25651Mw.A00(this.A0R).A01(this.A0e, AbstractC70698WfN.class);
                    C57982lB.A0B.A04(this.A0P, new C65860TvN(this, 4), false);
                    return;
                }
            }
            C14360o3.A0F("headerView");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.JPU
    public final void Dm1() {
        AbstractC153456vF.A00 = true;
        C56342iS c56342iS = C56352iT.A0t;
        FragmentActivity fragmentActivity = this.A0P;
        c56342iS.A03(fragmentActivity).A0T();
        RecyclerView recyclerView = this.A09;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        SearchEditText searchEditText = this.A0F;
        if (searchEditText != null) {
            searchEditText.setVisibility(8);
        }
        View view = this.A03;
        if (view != null) {
            view.setVisibility(8);
        }
        TextView textView = this.A08;
        if (textView != null) {
            textView.setVisibility(0);
        }
        View view2 = this.A06;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View ESm = c56342iS.A03(fragmentActivity).ESm(R.layout.explore_multi_hide_navbar, 24, 0, false);
        this.A05 = ESm;
        if (ESm != null) {
            WNU.A00(AbstractC166997dE.A0S(ESm, R.id.multi_hide_navbar_left), 27, this);
            C0fQ.A00(new ViewOnClickListenerC42032Ik1(this, 16), AbstractC166997dE.A0S(ESm, R.id.multi_hide_navbar_right));
        }
        this.A0V.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0279, code lost:
    
        if (r0 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02ba, code lost:
    
        if (X.AbstractC23021Ah.A00(r6).A01.getBoolean(X.AbstractC111324zv.A00(2328), false) != false) goto L67;
     */
    @Override // X.JIF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r24) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65867TvU.configureActionBar(X.2iU):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r1 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00() {
        /*
            r21 = this;
            r5 = r21
            androidx.fragment.app.FragmentActivity r4 = r5.A0P
            boolean r0 = r4 instanceof com.instagram.base.activity.BaseFragmentActivity
            r3 = 0
            if (r0 == 0) goto Lc4
            r2 = r4
            com.instagram.base.activity.BaseFragmentActivity r2 = (com.instagram.base.activity.BaseFragmentActivity) r2
            if (r2 == 0) goto Lc4
            com.instagram.ui.widget.edittext.AnimatedHintsTextLayout r1 = r2.A03
            if (r1 != 0) goto L2a
            r0 = 2131435219(0x7f0b1ed3, float:1.8492274E38)
            android.view.View r0 = r2.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.widget.edittext.AnimatedHintsTextLayout"
            X.C14360o3.A0C(r1, r0)
            com.instagram.ui.widget.edittext.AnimatedHintsTextLayout r1 = (com.instagram.ui.widget.edittext.AnimatedHintsTextLayout) r1
            r2.A03 = r1
            if (r1 == 0) goto L2e
        L2a:
            r0 = 0
            r1.setVisibility(r0)
        L2e:
            com.instagram.ui.widget.edittext.AnimatedHintsTextLayout r10 = r2.A03
            if (r10 == 0) goto Lc4
            boolean r0 = r5.A0b
            if (r0 == 0) goto Lc5
            X.Tzj r7 = r5.A0U
            X.Jdl r6 = X.C65911TwI.A04
            com.instagram.common.session.UserSession r2 = r7.A09
            r0 = 14
            X.JbX r1 = new X.JbX
            r1.<init>(r7, r0)
            r0 = 2
            r6.A00(r2, r1, r3, r0)
            boolean r8 = r5.A0h
            if (r8 == 0) goto L57
            X.0nS r1 = X.C14120nc.A00()
            X.KLe r0 = new X.KLe
            r0.<init>(r7)
            r1.ATO(r0)
        L57:
            X.WCz r9 = X.WCz.A00
            r7 = 0
            com.instagram.common.session.UserSession r6 = r5.A0R
            boolean r15 = X.AbstractC65702TsY.A1Y(r6)
            r16 = 1
            boolean r17 = X.AbstractC65702TsY.A1Y(r6)
            boolean r11 = X.AbstractC65702TsY.A1Y(r6)
            X.C14360o3.A0B(r6, r7)
            boolean r0 = X.AbstractC65702TsY.A1Y(r6)
            r12 = 0
            if (r0 == 0) goto L75
            r12 = -1
        L75:
            r13 = 1500(0x5dc, double:7.41E-321)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36330462636950394(0x81125d0000437a, double:3.0388690904137775E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            r20 = r0 ^ 1
            r19 = r8
            r18 = r7
            r9.A01(r10, r11, r12, r13, r15, r16, r17, r18, r19, r20)
            android.widget.EditText r0 = r10.getEditText()
            android.text.Editable r0 = r0.getText()
            r0.clear()
            android.view.ViewGroup$MarginLayoutParams r1 = X.AbstractC31177DnL.A0G(r10)
            int r0 = X.AbstractC57322k7.A00(r4)
            r1.bottomMargin = r0
            r10.setLayoutParams(r1)
        La3:
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r5.A0F
            if (r1 == 0) goto Lb0
            r0 = 0
            r1.A0P = r0
            com.instagram.ui.widget.searchedittext.SearchEditText.A02(r1, r0, r0)
            com.instagram.ui.widget.searchedittext.SearchEditText.A01(r1)
        Lb0:
            android.widget.EditText r1 = r10.getEditText()
            boolean r0 = r1 instanceof com.instagram.ui.widget.searchedittext.SearchEditText
            if (r0 == 0) goto Lbb
            r3 = r1
            com.instagram.ui.widget.searchedittext.SearchEditText r3 = (com.instagram.ui.widget.searchedittext.SearchEditText) r3
        Lbb:
            r5.A0F = r3
            if (r3 == 0) goto Lc4
            X.Tzj r0 = r5.A0U
            r0.A01(r3)
        Lc4:
            return
        Lc5:
            android.content.Context r0 = r5.A0N
            X.WCz.A00(r0, r10)
            goto La3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65867TvU.A00():void");
    }

    public static final void A01(C65867TvU c65867TvU) {
        TextView textView = c65867TvU.A08;
        if (textView != null) {
            textView.setVisibility(8);
        }
        View view = c65867TvU.A05;
        if (view != null) {
            view.setVisibility(8);
        }
        RecyclerView recyclerView = c65867TvU.A09;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        SearchEditText searchEditText = c65867TvU.A0F;
        if (searchEditText != null) {
            searchEditText.setVisibility(0);
        }
        View view2 = c65867TvU.A06;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = c65867TvU.A03;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        C56352iT.A0t.A03(c65867TvU.A0P).A0T();
    }

    @Override // X.JIF
    public final void AJK(ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, XAp xAp) {
        C57982lB.A0B.A05(this.A0P, new U09(viewOnTouchListenerC60632pm, xAp, this));
    }

    @Override // X.JIF
    public final String Arb() {
        return this.A0g;
    }

    @Override // X.JPU
    public final float C9q() {
        return this.A01;
    }

    @Override // X.JIF
    public final void EMG() {
        RecyclerView recyclerView = this.A09;
        if (recyclerView != null) {
            recyclerView.A0o(0);
        }
    }

    @Override // X.JIF
    public final void onDestroyView() {
        RecyclerView recyclerView = this.A09;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
            this.A09 = null;
        }
        AbstractC25651Mw.A00(this.A0R).A02(this.A0e, AbstractC70698WfN.class);
    }

    @Override // X.JIF
    public final void onPause() {
        BaseFragmentActivity baseFragmentActivity;
        SearchEditText searchEditText = this.A0U.A01;
        if (searchEditText != null) {
            searchEditText.setOnTouchListener(null);
        }
        FragmentActivity fragmentActivity = this.A0P;
        Parcelable parcelable = null;
        if ((fragmentActivity instanceof BaseFragmentActivity) && (baseFragmentActivity = (BaseFragmentActivity) fragmentActivity) != null) {
            AbstractC167007dF.A0x(baseFragmentActivity.A03);
        }
        RecyclerView recyclerView = this.A09;
        if (recyclerView != null) {
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            if (abstractC70663Fe != null) {
                parcelable = abstractC70663Fe.A1M();
            }
            this.A0J = parcelable;
        }
        AbstractC56402iY.A02(fragmentActivity, AbstractC53242c7.A0F(this.A0N, R.attr.statusBarBackgroundColor));
    }

    @Override // X.JIF
    public final void onResume() {
        RecyclerView recyclerView;
        AbstractC70663Fe abstractC70663Fe;
        ViewOnClickListenerC66108Tzj viewOnClickListenerC66108Tzj = this.A0U;
        if (C37011ny.A00 != null) {
            U04.A00().A00(viewOnClickListenerC66108Tzj.A09);
        }
        if (this.A0i) {
            A00();
        }
        UserSession userSession = this.A0R;
        if (AbstractC153456vF.A02(userSession)) {
            TextView textView = this.A08;
            if (textView != null) {
                textView.setVisibility(8);
            }
            View view = this.A06;
            if (view != null) {
                view.setVisibility(0);
            }
            AbstractC153456vF.A00 = false;
            AbstractC153456vF.A00(userSession);
            this.A0V.A00();
        }
        Parcelable parcelable = this.A0J;
        if (parcelable != null && (recyclerView = this.A09) != null && (abstractC70663Fe = recyclerView.A0D) != null) {
            abstractC70663Fe.A1P(parcelable);
        }
        this.A0S.getItemCount();
        if (!this.A0I && C18U.A06(C06090Tz.A05, userSession, 36318445318445205L)) {
            C38141Gq8 c38141Gq8 = this.A0B;
            if (c38141Gq8 != null) {
                C38135Gq2 c38135Gq2 = c38141Gq8.A01;
                Long l = c38135Gq2.A01;
                if (l != null) {
                    C38P c38p = c38141Gq8.A00;
                    if (c38135Gq2.A04.now() - l.longValue() >= c38p.A0d) {
                        c38141Gq8.A00(true);
                        UserSession session = c38p.getSession();
                        String moduleName = c38p.getModuleName();
                        C14360o3.A0B(session, 0);
                        C18920wW A01 = AbstractC12220kQ.A01(c38p, session);
                        InterfaceC02590Ai A00 = A01.A00(A01.A00, "explore_dsa_experience_expired");
                        A00.AAP("containermodule", moduleName);
                        A00.Cht();
                    }
                }
                RecyclerView recyclerView2 = this.A09;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(8);
                }
                RecyclerView recyclerView3 = this.A09;
                if (recyclerView3 != null) {
                    recyclerView3.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
                }
            }
            this.A0I = true;
        }
        if (this.A0k) {
            AbstractC56402iY.A02(this.A0P, this.A0N.getColor(R.color.fds_transparent));
        }
    }
}
