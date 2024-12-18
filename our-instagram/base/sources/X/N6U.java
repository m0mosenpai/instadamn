package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.instagram.common.session.UserSession;
import com.instagram.mediakit.analytics.MediaKitEntryPoint;
import com.instagram.mediakit.config.MediaKitConfig;

/* loaded from: classes9.dex */
public final class N6U extends AbstractC59962oe implements InterfaceC60072op, InterfaceC58279PsX {
    public static final String __redex_internal_original_name = "MediaKitFragment";
    public View A00;
    public View A01;
    public RecyclerView A02;
    public C66362zD A03;
    public InterfaceC56392iX A04;
    public InterfaceC56392iX A05;
    public C57112jm A06;
    public MZA A07;
    public C189478aR A08;
    public C5SW A09;
    public C56455P4r A0A;
    public C52157N6j A0B;
    public C55123Obk A0C;
    public C47785L8p A0D;
    public C6WQ A0E;
    public boolean A0G;
    public MediaKitConfig A0H;
    public boolean A0I;
    public final InterfaceC09390do A0Q = C57546PgK.A01(this, 13);
    public InterfaceC16820sZ A0F = new C57546PgK(this, 15);
    public final InterfaceC09390do A0O = AbstractC25225BEi.A0a(new C57546PgK(this, 19), new C57546PgK(this, 20), C57535Pg9.A00(null, this, 30), AbstractC25225BEi.A1D(C51053Mh7.class));
    public final O8C A0L = new Object();
    public final InterfaceC09390do A0N = AbstractC60492pY.A02(this);
    public final C51198Mji A0J = new C51198Mji(this, 9);
    public final InterfaceC60442pS A0K = AbstractC60952qJ.A01(__redex_internal_original_name, false, false);
    public final InterfaceC09390do A0M = C57546PgK.A01(this, 12);
    public final OH8 A0P = new OH8(this);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.2zJ, java.lang.Object] */
    public static final void A02(EnumC53120NeX enumC53120NeX, N6U n6u) {
        C14360o3.A0B(enumC53120NeX, 0);
        boolean A1X = AbstractC167007dF.A1X(enumC53120NeX, EnumC53120NeX.A02);
        C66392zG A0R = AbstractC31174DnI.A0R(n6u);
        InterfaceC09390do interfaceC09390do = n6u.A0N;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C66392zG A0R2 = AbstractC31174DnI.A0R(n6u);
        C47785L8p c47785L8p = n6u.A0D;
        if (c47785L8p != null) {
            A0R2.A01(new KIL(c47785L8p, A1X));
            A0R.A01(new NPX(A0R2, A0r, n6u, A1X));
            A0R.A01(new NPV(AbstractC166987dD.A0r(interfaceC09390do), n6u, A1X));
            A0R.A01(new C52349NEn(n6u.requireContext(), AbstractC166987dD.A0r(interfaceC09390do), n6u, A1X));
            A0R.A01(new C39165HLt(AbstractC166987dD.A0r(interfaceC09390do), n6u, A1X));
            A0R.A01(new NPW(n6u, AbstractC166987dD.A0r(interfaceC09390do), n6u, A1X));
            A0R.A01(new Object());
            n6u.A03 = AbstractC31173DnH.A0R(A0R, new Object());
            return;
        }
        C14360o3.A0F("mediaKitViewPointHelper");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (!this.A0I) {
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A0O);
            MediaKitConfig mediaKitConfig = this.A0H;
            str2 = "mediaKitConfig";
            if (mediaKitConfig != null) {
                AbstractC166987dD.A1Z(new MBX(A0Z, mediaKitConfig.A01, mediaKitConfig.A02, (InterfaceC23621Ds) null, 18), AbstractC141776au.A00(A0Z));
                this.A0I = true;
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A0N;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        InterfaceC60442pS interfaceC60442pS = this.A0K;
        String A0n = AbstractC166997dE.A0n();
        int A07 = AbstractC25230BEn.A07(2, A0r, interfaceC60442pS);
        MZA mza = new MZA(requireContext, A0r, interfaceC60442pS, A0n, -1L);
        this.A07 = mza;
        O8C o8c = this.A0L;
        C55123Obk c55123Obk = new C55123Obk(this, mza, o8c);
        this.A0C = c55123Obk;
        C57112jm c57112jm = this.A06;
        if (c57112jm == null) {
            str = "mediaKitViewPointManager";
        } else {
            this.A0D = new C47785L8p(c57112jm, c55123Obk);
            C56455P4r c56455P4r = this.A0A;
            if (c56455P4r == null) {
                str2 = "mediaKitActionBarHolder";
            } else {
                c56455P4r.A02 = AbstractC56402iY.A01(requireActivity());
                c56455P4r.A09 = (AppBarLayout) view.requireViewById(R.id.mk_app_bar);
                c56455P4r.A0A = (CollapsingToolbarLayout) view.requireViewById(R.id.mk_collapsing_toolbar);
                c56455P4r.A06 = AbstractC31173DnH.A0F(view, R.id.mk_action_bar);
                view.post(new PNJ(c56455P4r));
                AppBarLayout appBarLayout = c56455P4r.A09;
                if (appBarLayout == null) {
                    str = "appBarLayout";
                } else {
                    appBarLayout.A02(new MaW(c56455P4r, 4));
                    ViewGroup viewGroup = c56455P4r.A06;
                    if (viewGroup != null) {
                        c56455P4r.A0B = new C56352iT(ViewOnClickListenerC55450Ojz.A00, viewGroup);
                        ViewGroup viewGroup2 = c56455P4r.A06;
                        if (viewGroup2 != null) {
                            c56455P4r.A0B = new C56352iT(new ViewOnClickListenerC55456OkA(c56455P4r, A07), viewGroup2);
                            View requireViewById = view.requireViewById(R.id.mk_status_bar_background);
                            c56455P4r.A05 = requireViewById;
                            str = "statusBarBackground";
                            if (requireViewById != null) {
                                requireViewById.setBackgroundColor(c56455P4r.A0G);
                                View view2 = c56455P4r.A05;
                                if (view2 != null) {
                                    AbstractC43592JPx.A1H(view2, -1, c56455P4r.A02);
                                    c56455P4r.A03 = view.requireViewById(R.id.mk_action_bar_dimmer);
                                    ValueAnimator valueAnimator = c56455P4r.A0I;
                                    C55241OfD.A01(valueAnimator, c56455P4r, 9);
                                    valueAnimator.setDuration(200L);
                                    C56352iT c56352iT = c56455P4r.A0B;
                                    if (c56352iT != null) {
                                        c56352iT.A0X(c56455P4r.A0L);
                                    }
                                    int A072 = (int) (AbstractC13880nE.A07(r8) / 0.75f);
                                    AppBarLayout appBarLayout2 = c56455P4r.A09;
                                    str = "appBarLayout";
                                    if (appBarLayout2 != null) {
                                        ViewGroup.LayoutParams layoutParams = appBarLayout2.getLayoutParams();
                                        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                                        layoutParams.height = A072;
                                        appBarLayout2.setLayoutParams(layoutParams);
                                        this.A01 = view.requireViewById(R.id.mk_toolbar_fragment_container);
                                        UserSession A0K = AbstractC31175DnJ.A0K(interfaceC09390do, 0);
                                        C52157N6j c52157N6j = new C52157N6j();
                                        AbstractC25233BEq.A15(c52157N6j, "IgSessionManager.SESSION_TOKEN_KEY", A0K.token);
                                        this.A0B = c52157N6j;
                                        o8c.A01 = c52157N6j;
                                        C14240no A0F = AbstractC43593JPy.A0F(this);
                                        A0F.A0A(c52157N6j, R.id.mk_toolbar_fragment_container);
                                        A0F.A00();
                                        InterfaceC09390do interfaceC09390do2 = this.A0O;
                                        A02((EnumC53120NeX) MSW.A0l(interfaceC09390do2).A0H.getValue(), this);
                                        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.mk_recycler_view);
                                        C66362zD c66362zD = this.A03;
                                        if (c66362zD == null) {
                                            str = "recyclerAdapter";
                                        } else {
                                            A0G.setAdapter(c66362zD);
                                            A0G.setItemAnimator(null);
                                            OY0.A02(A0G, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                                            A0G.requestFocus();
                                            A0G.A14(this.A0J);
                                            MZA mza2 = this.A07;
                                            if (mza2 == null) {
                                                str = "discoveryVideoPlayer";
                                            } else {
                                                A0G.setOnKeyListener(mza2);
                                                o8c.A00 = A0G;
                                                this.A02 = A0G;
                                                this.A00 = view.requireViewById(R.id.mk_bottom_actions_view);
                                                this.A05 = AbstractC31173DnH.A0U(requireView(), R.id.mk_brand_actions_view_stub);
                                                this.A04 = AbstractC31173DnH.A0U(requireView(), R.id.mk_add_section_view_stub);
                                                A04(this);
                                                Object value = interfaceC09390do2.getValue();
                                                C07S c07s = C07S.STARTED;
                                                C07X viewLifecycleOwner = getViewLifecycleOwner();
                                                AbstractC166987dD.A1Z(new C57169PZn(viewLifecycleOwner, value, c07s, this, null, 0), C07Y.A00(viewLifecycleOwner));
                                                C57112jm c57112jm2 = this.A06;
                                                if (c57112jm2 == null) {
                                                    str2 = "mediaKitViewPointManager";
                                                } else {
                                                    AbstractC37301Gc2.A0v(view, c57112jm2, this);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    str = "actionBar";
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final C189448aO A00(N6U n6u) {
        C189448aO A0g = AbstractC25231BEo.A0g(n6u.A0N);
        A0g.A0B = R.color.fds_transparent;
        C56766PHj.A00(A0g, new C57546PgK(n6u, 16), 11);
        return A0g;
    }

    public static final void A01(OJU oju) {
        C41451vu c41451vu = C41451vu.A01;
        int i = oju.A04;
        int i2 = oju.A05;
        c41451vu.E4s(new C3KG(new OEQ(oju.A01, null, oju.A00, AbstractC166997dE.A0a(), null, i2, i)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r3.A05.A01 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.N6U r8) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6U.A04(X.N6U):void");
    }

    @Override // X.InterfaceC58279PsX
    public final C54780OIu BOh() {
        return (C54780OIu) this.A0Q.getValue();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0N);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:
    
        if (X.AbstractC25225BEi.A1a(r4, r2) != false) goto L25;
     */
    @Override // X.InterfaceC60072op
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onBackPressed() {
        /*
            r6 = this;
            X.0do r0 = r6.A0O
            X.Mh7 r2 = X.MSW.A0l(r0)
            X.05A r0 = r2.A0H
            java.lang.Object r1 = r0.getValue()
            X.NeX r1 = (X.EnumC53120NeX) r1
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            X.NeX r0 = X.EnumC53120NeX.A02
            boolean r0 = X.AbstractC167007dF.A1X(r1, r0)
            if (r0 == 0) goto Lc2
            com.instagram.mediakit.repository.MediaKitRepository r0 = r2.A07
            X.OLz r5 = r0.A02
            X.Mvp r0 = r5.A00
            if (r0 == 0) goto Lc2
            r1 = 0
            X.Mvt r2 = r0.A00
            X.Mvt r0 = r5.A01
            boolean r0 = X.C14360o3.A0K(r2, r0)
            if (r0 == 0) goto L6c
            X.Mvp r0 = r5.A00
            if (r0 == 0) goto L33
            java.util.List r1 = r0.A02
        L33:
            java.util.ArrayList r0 = r5.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L6c
            X.Mvp r0 = r5.A00
            if (r0 == 0) goto L6c
            X.Mvt r0 = r0.A00
            if (r0 == 0) goto L6c
            java.util.List r4 = r0.A06
            int r1 = r4.size()
            java.util.List r0 = r5.A02
            int r0 = r0.size()
            if (r1 != r0) goto L6c
            java.util.List r0 = r5.A02
            java.util.Iterator r3 = r0.iterator()
        L57:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L9d
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.Mxj r0 = (X.C51961Mxj) r0
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L57
            if (r2 == 0) goto L9d
        L6c:
            r1 = 2131966780(0x7f133b3c, float:1.9570408E38)
            r0 = 2131966779(0x7f133b3b, float:1.9570406E38)
            X.OJU r4 = new X.OJU
            r4.<init>(r1, r0)
            r0 = 17
            X.PgK r2 = new X.PgK
            r2.<init>(r6, r0)
            r1 = 2131960921(0x7f132459, float:1.9558524E38)
            X.8hE r0 = X.EnumC193348hE.A06
            r4.A00(r0, r2, r1)
            X.8hE r3 = X.EnumC193348hE.A04
            r2 = 2131966778(0x7f133b3a, float:1.9570404E38)
            r0 = 3
            X.OfQ r1 = new X.OfQ
            r1.<init>(r0)
            X.OAI r0 = new X.OAI
            r0.<init>(r1, r3, r2)
            r4.A00 = r0
            A01(r4)
            r0 = 1
            return r0
        L9d:
            java.util.List r0 = r5.A02
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            java.util.Iterator r1 = r0.iterator()
        La7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lbb
            java.lang.Object r0 = r1.next()
            X.Mxj r0 = (X.C51961Mxj) r0
            X.1qM r0 = r0.A02
            if (r0 == 0) goto La7
            r2.add(r0)
            goto La7
        Lbb:
            boolean r0 = X.AbstractC25225BEi.A1a(r4, r2)
            if (r0 == 0) goto Lc2
            goto L6c
        Lc2:
            X.AbstractC25227BEk.A1B(r6)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6U.onBackPressed():boolean");
    }

    public static final void A03(N6U n6u) {
        View currentFocus;
        Activity rootActivity = n6u.getRootActivity();
        if (rootActivity != null && (currentFocus = rootActivity.getCurrentFocus()) != null) {
            AbstractC13880nE.A0O(currentFocus);
            currentFocus.clearFocus();
        }
    }

    public static final void A05(N6U n6u, boolean z) {
        Window A0H = AbstractC31174DnI.A0H(n6u);
        C14360o3.A07(A0H);
        AbstractC56402iY.A08(A0H, z);
        AbstractC56402iY.A02(n6u.requireActivity(), 0);
        AbstractC56402iY.A06(n6u.requireActivity(), false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-295193155);
        super.onCreate(bundle);
        A05(this, true);
        MediaKitConfig mediaKitConfig = (MediaKitConfig) requireArguments().getParcelable(AbstractC111324zv.A00(4887));
        if (mediaKitConfig == null) {
            mediaKitConfig = new MediaKitConfig(MediaKitEntryPoint.A0A, null, null);
        }
        this.A0H = mediaKitConfig;
        AbstractC31174DnI.A0H(this).setSoftInputMode(32);
        this.A06 = AbstractC31180DnO.A0N();
        Context requireContext = requireContext();
        int A00 = AbstractC56402iY.A00(getActivity());
        OH8 oh8 = this.A0P;
        this.A0A = new C56455P4r(requireContext, this, BOh(), MSW.A0l(this.A0O).A05, oh8, A00);
        C0f9.A09(568224484, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1843140482);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.media_kit_fragment, false);
        C0f9.A09(-967603292, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(2021759318);
        C56455P4r c56455P4r = this.A0A;
        if (c56455P4r == null) {
            C14360o3.A0F("mediaKitActionBarHolder");
            throw C00O.createAndThrow();
        }
        c56455P4r.A0D = null;
        c56455P4r.A0B = null;
        c56455P4r.A0I.removeAllUpdateListeners();
        this.A0B = null;
        super.onDestroy();
        C0f9.A09(-734432086, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1828142452);
        super.onPause();
        C55123Obk c55123Obk = this.A0C;
        if (c55123Obk == null) {
            C14360o3.A0F("mediaKitAutoPlayManager");
            throw C00O.createAndThrow();
        }
        c55123Obk.A03.A0A();
        A05(this, false);
        C0f9.A09(995675907, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1719101832);
        super.onResume();
        A05(this, true);
        MSW.A0l(this.A0O).A02();
        C0f9.A09(553767685, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1795925712);
        super.onStart();
        AbstractC31176DnK.A0Q(this.A0N).A01((InterfaceC41501vz) this.A0M.getValue(), C56022Ott.class);
        C0f9.A09(1584125467, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1498074739);
        super.onStop();
        C47785L8p c47785L8p = this.A0D;
        if (c47785L8p != null) {
            c47785L8p.A00();
            AbstractC31176DnK.A0Q(this.A0N).A02((InterfaceC41501vz) this.A0M.getValue(), C56022Ott.class);
            C0f9.A09(641830608, A02);
            return;
        }
        C14360o3.A0F("mediaKitViewPointHelper");
        throw C00O.createAndThrow();
    }
}
