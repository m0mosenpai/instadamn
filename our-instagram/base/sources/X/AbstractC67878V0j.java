package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView;
import com.instagram.model.keyword.Keyword;
import com.instagram.search.common.analytics.SearchContext;
import java.util.List;

/* renamed from: X.V0j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC67878V0j extends AbstractC59962oe implements InterfaceC11380iw, C1M1, InterfaceC60682pr, AnonymousClass309, InterfaceC60072op {
    public static final String __redex_internal_original_name = "BaseSerpGridFragment";
    public int A00;
    public int A01;
    public C18920wW A02;
    public JI3 A03;
    public C38085GpE A04;
    public C42951Iz3 A05;
    public C65823Tug A06;
    public JIG A07;
    public JIG A08;
    public C30A A09;
    public C4I7 A0A;
    public C38107Gpa A0B;
    public W99 A0C;
    public W58 A0D;
    public C65921TwS A0E;
    public C68033V7e A0F;
    public C66136U1d A0G;
    public IMO A0H;
    public IMO A0I;
    public String A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public int A0R;
    public C44226JgW A0S;
    public InterfaceC190488c6 A0T;
    public InterfaceC190488c6 A0U;
    public C32S A0V;
    public boolean A0W;
    public final InterfaceC71920XAe A0X;
    public final InterfaceC71978XDn A0Y;
    public final XLN A0Z;
    public final XAq A0a;
    public final XAq A0b;
    public final XAq A0c;
    public final XAq A0d;
    public final XAq A0e;
    public final GZF A0f;
    public final XBD A0g;
    public final C69680VtQ A0h;
    public final C69681VtR A0i;
    public final GYT A0j;
    public final C38U A0k;
    public final InterfaceC41501vz A0m;
    public final InterfaceC41501vz A0n;
    public final InterfaceC41501vz A0o;
    public final InterfaceC101554hQ A0p;
    public final InterfaceC62602sz A0q;
    public final InterfaceC09390do A0s;
    public final String A0l = "android.permission.ACCESS_FINE_LOCATION";
    public final InterfaceC09390do A0r = AbstractC60492pY.A02(this);

    public static final void A00(C69727VuM c69727VuM, AbstractC67878V0j abstractC67878V0j, String str) {
        String A0j = AbstractC167017dG.A0j();
        AnonymousClass729.A00(abstractC67878V0j.getSession()).A00 = new SearchContext(abstractC67878V0j.A06().A04(), abstractC67878V0j.A07().A03(), AbstractC65702TsY.A0d(abstractC67878V0j), null, abstractC67878V0j.A06().A05(), A0j, null, null);
        InterfaceC190488c6 interfaceC190488c6 = abstractC67878V0j.A0U;
        if (interfaceC190488c6 == null) {
            C14360o3.A0F("serpLogger");
            throw C00O.createAndThrow();
        }
        String str2 = (String) c69727VuM.A0A.getValue();
        if (str2 == null) {
            str2 = "";
        }
        interfaceC190488c6.CjS(C70108W4f.A00(null, null, str2, (String) c69727VuM.A0B.getValue(), null, "server"), abstractC67878V0j.A05().E6f(), AbstractC65702TsY.A0d(abstractC67878V0j), abstractC67878V0j.A07().A03(), null, str, A0j, 0);
    }

    public final void A0A(C5qT c5qT, AbstractC127945qN abstractC127945qN, C38321qM c38321qM) {
        C11520jB E6Q = E6Q(c38321qM);
        IS4.A01(E6Q, abstractC127945qN);
        C19280xC A00 = AbstractC40594HzE.A00(this, E6Q.A00(), c38321qM, A06().A05(), c5qT.A01, c5qT.A00);
        A00.A07(AbstractC128995sK.A03, A06().A0E);
        A00.A07(AbstractC128995sK.A04, AbstractC65702TsY.A0d(this));
        A00.A0C("serp_session_id", A06().A05());
        A00.A0C(CacheBehaviorLogger.SOURCE, A06().A0M);
        if (c38321qM.BRp() == EnumC40111tc.A09) {
            Long A07 = AbstractC82633mR.A07(c38321qM, 0);
            if (A07 != null) {
                A00.A0B("carousel_index", A07);
            }
            String A0G = AbstractC82633mR.A0G(c38321qM, 0);
            if (A0G != null) {
                A00.A0C("carousel_media_id", A0G);
            }
            String A0G2 = AbstractC82633mR.A0G(c38321qM, 0);
            String A002 = AbstractC111324zv.A00(789);
            if (A0G2 != null) {
                A00.A0C(A002, A0G2);
            }
            Long A08 = AbstractC82633mR.A08(c38321qM, 0);
            String A003 = AbstractC111324zv.A00(181);
            if (A08 != null) {
                A00.A0B(A003, A08);
            }
            Long A09 = AbstractC82633mR.A09(c38321qM, 0);
            String A004 = AbstractC111324zv.A00(790);
            if (A09 != null) {
                A00.A0B(A004, A09);
            }
        }
        AbstractC31173DnH.A1S(A00, getSession());
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6Q(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        c38321qM.A0C.Ec6(A07().A03());
        return E6P();
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public void onSetUserVisibleHint(boolean z, boolean z2) {
        super.onSetUserVisibleHint(z, z2);
        if (z) {
            InterfaceC190488c6 interfaceC190488c6 = this.A0U;
            if (interfaceC190488c6 == null) {
                C14360o3.A0F("serpLogger");
                throw C00O.createAndThrow();
            }
            interfaceC190488c6.Cle();
            if (A06().A0T) {
                String A04 = A06().A04();
                UserSession session = getSession();
                String str = A06().A0G;
                String str2 = A06().A0H;
                String str3 = A06().A0I;
                C14360o3.A0B(session, 2);
                U20 u20 = new U20(this, session, null, A04, str, str2, str3);
                this.A0T = u20;
                u20.Cle();
            }
            C51042Mgs A07 = A07();
            PZC.A02(A07, AbstractC141776au.A00(A07), 29);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C65823Tug c65823Tug = this.A06;
        String str = "grid";
        if (c65823Tug != null) {
            c65823Tug.A05(view, this.A0q.isLoading());
            c65823Tug.A06(new C42508Irn(this, 3));
            C66136U1d c66136U1d = this.A0G;
            if (c66136U1d == null) {
                str = "viewpointDelegate";
            } else {
                DiscoveryRecyclerView discoveryRecyclerView = c65823Tug.A04;
                U28 u28 = A06().A0C;
                if (u28 != null) {
                    if (discoveryRecyclerView != null) {
                        c66136U1d.A01.A08(discoveryRecyclerView, C71163Hc.A00(this), new U1Y(discoveryRecyclerView, u28));
                    }
                    DiscoveryRecyclerView discoveryRecyclerView2 = c65823Tug.A04;
                    if (discoveryRecyclerView2 != null) {
                        discoveryRecyclerView2.setItemAnimator(null);
                    }
                    C51042Mgs A07 = A07();
                    AbstractC37301Gc2.A0w(getViewLifecycleOwner(), A07.A05, new JEZ(this, 8), 3);
                    AbstractC37301Gc2.A0w(getViewLifecycleOwner(), A07.A03, new JEZ(this, 9), 3);
                    AbstractC37301Gc2.A0w(getViewLifecycleOwner(), A07.A07, X64.A00, 3);
                    AbstractC37301Gc2.A0w(getViewLifecycleOwner(), A07.A06, X65.A00, 3);
                    if (this instanceof VAJ) {
                        PZC.A02(this, AbstractC25235BEs.A0S(this), 27);
                    }
                    PZC.A02(this, AbstractC25235BEs.A0S(this), 28);
                    V0V A06 = A06();
                    C14360o3.A0C(A06, "null cannot be cast to non-null type com.instagram.base.scrollablenavigation.HasScrollableNavigation");
                    if (A06.CcV()) {
                        ViewOnTouchListenerC60632pm A01 = A06().A01();
                        C65823Tug c65823Tug2 = this.A06;
                        if (c65823Tug2 != null) {
                            A01.A06(c65823Tug2.A0B, c65823Tug2.A06, this.A0R);
                        }
                    }
                    C25671My A00 = AbstractC25651Mw.A00(getSession());
                    A00.A01(this.A0n, C42251Inb.class);
                    A00.A01(this.A0o, C70073Cr.class);
                    A00.A01(this.A0m, C70043Co.class);
                    return;
                }
                str = "keyboardHeightDetectorCache";
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.U29, java.lang.Object] */
    public static final void A01(C38657Gyy c38657Gyy, AbstractC67878V0j abstractC67878V0j, String str, boolean z) {
        String str2;
        List list;
        XFN xfn;
        String str3;
        if (C14360o3.A0K(str, "tap_action_talk_to_friend")) {
            C36861nj A00 = AbstractC34103F3f.A00();
            FragmentActivity requireActivity = abstractC67878V0j.requireActivity();
            abstractC67878V0j.getSession();
            A00.A00(requireActivity, null, "all");
            return;
        }
        if (C14360o3.A0K(str, "tap_action_place_voice_call")) {
            if (c38657Gyy != null) {
                if (!z || (list = c38657Gyy.A0B) == null || (xfn = (XFN) AbstractC166987dD.A16(list)) == null || (str3 = ((URD) xfn).A02) == null) {
                    return;
                }
                C0b3.A00().A04().A0G(abstractC67878V0j.requireContext(), new Intent(AbstractC111324zv.A00(727)).setData(AbstractC08820cl.A03(AnonymousClass001.A0R("tel:", str3))));
                return;
            }
            throw new IllegalStateException("inform message must not be null for voice call action");
        }
        if (!C14360o3.A0K(str, "tap_action_contact_helpline") && !C14360o3.A0K(str, "tap_action_contact_helpline_ed") && !C14360o3.A0K(str, "tap_action_ed_resources") && !C14360o3.A0K(str, "tap_action_helpful_resources")) {
            if (str != null && str.length() != 0) {
                C18920wW c18920wW = abstractC67878V0j.A02;
                if (c18920wW == null) {
                    C14360o3.A0F("typedLogger");
                    throw C00O.createAndThrow();
                }
                if (c38657Gyy != null) {
                    C25531Mh A0G = C25531Mh.A0G(c18920wW);
                    if (((AbstractC02600Aj) A0G).A00.isSampled()) {
                        AbstractC65702TsY.A1G(A0G, c38657Gyy, c38657Gyy.A05);
                        AbstractC65703TsZ.A1L(A0G, abstractC67878V0j);
                    }
                    if (AbstractC41776Ies.A0C(abstractC67878V0j.requireActivity(), abstractC67878V0j.getSession(), str, abstractC67878V0j.getModuleName())) {
                        return;
                    }
                    AbstractC35275FhA.A04(abstractC67878V0j.requireActivity(), abstractC67878V0j.getSession(), C2Fb.A3K, str, abstractC67878V0j.getModuleName());
                    return;
                }
                throw new IllegalStateException("informMessage required for non action key values");
            }
            new C140966Yy(abstractC67878V0j.requireActivity(), abstractC67878V0j.getSession()).A06();
            C140966Yy c140966Yy = new C140966Yy(abstractC67878V0j.requireActivity(), abstractC67878V0j.getSession());
            c140966Yy.A0B = "search_result";
            U04.A00();
            ?? obj = new Object();
            abstractC67878V0j.getSession();
            c140966Yy.A0B(null, obj.A03(abstractC67878V0j.A06().A04(), "", abstractC67878V0j.A06().A05()));
            c140966Yy.A04();
            return;
        }
        UserSession session = abstractC67878V0j.getSession();
        FragmentActivity requireActivity2 = abstractC67878V0j.requireActivity();
        Integer num = C05F.A00;
        if (!C14360o3.A0K(str, "tap_action_contact_helpline")) {
            num = C05F.A01;
            if (!C14360o3.A0K(str, "tap_action_contact_helpline_ed")) {
                num = C05F.A0N;
                if (C14360o3.A0K(str, "tap_action_helpful_resources")) {
                    num = C05F.A0C;
                } else if (!C14360o3.A0K(str, "tap_action_ed_resources")) {
                    throw new IllegalStateException("action key must map to a URL");
                }
            }
        }
        switch (num.intValue()) {
            case 0:
                str2 = "instagram://bloks/?app_id=com.bloks.www.xmwb.ssi_ed_contact_helpline&params=%7B%22resource_type%22%3A%22suicide_prevention_actor%22%7D";
                break;
            case 1:
                str2 = "instagram://bloks/?app_id=com.bloks.www.xmwb.ssi_ed_contact_helpline&params=%7B%22resource_type%22%3A%22eating_disorders_actor%22%7D";
                break;
            case 2:
                str2 = "instagram://bloks/?app_id=com.bloks.www.xmwb.ssi_ed_helpful_suggestion_resources";
                break;
            default:
                str2 = "instagram://bloks/?app_id=com.bloks.www.xmwb.ed_resources_controller";
                break;
        }
        AbstractC70160WDy.A01(requireActivity2, AbstractC08820cl.A03(str2), session, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C32098E8w r13, X.AbstractC67878V0j r14, boolean r15) {
        /*
            int r7 = r13.A00
            java.lang.String r0 = "serpMetaAiHcmLogger"
            r8 = 0
            X.W99 r6 = r14.A0C
            if (r7 != 0) goto L7d
            if (r6 == 0) goto Lc6
            X.0wW r2 = r6.A01
            java.lang.String r1 = "ig_search_meta_ai_hcm_donut_tap"
            X.0kM r0 = r2.A00
            X.0Ai r1 = r2.A00(r0, r1)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L28
            java.lang.String r0 = X.W99.A00(r1, r6)
            X.InterfaceC72022XFk.A00(r1, r6, r0)
            X.W99.A01(r1, r6)
            r1.Cht()
        L28:
            java.lang.String r3 = "ig_search:serp_hcm_donut"
        L2a:
            java.lang.String r1 = r14.A0J
            if (r1 == 0) goto L48
            int r0 = r1.length()
            if (r0 == 0) goto L48
            java.lang.String r0 = r13.A06
            int r0 = r0.length()
            if (r0 > 0) goto L48
            X.Bfx r0 = r13.A02
            if (r0 == 0) goto L7b
            java.lang.String r0 = r0.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L7b
        L48:
            r6 = 1
        L49:
            if (r15 == 0) goto L65
            X.V0V r0 = r14.A06()
            X.U1s r7 = r0.A02()
            java.lang.String r10 = r13.A06
            java.lang.String r12 = r13.A04
            r9 = r3
            r11 = r10
            r7.A05(r8, r9, r10, r11, r12)
        L5c:
            X.Bfx r0 = r13.A02
            if (r0 == 0) goto L62
            java.lang.String r8 = r0.A02
        L62:
            r14.A0J = r8
            return
        L65:
            X.Bfx r2 = r13.A02
            if (r2 == 0) goto L5c
            X.V0V r0 = r14.A06()
            X.U1s r0 = r0.A02()
            java.lang.String r4 = r2.A03
            X.GzR r1 = r13.A01
            java.lang.String r5 = r13.A06
            r0.A04(r1, r2, r3, r4, r5, r6)
            goto L5c
        L7b:
            r6 = 0
            goto L49
        L7d:
            if (r6 == 0) goto Lc6
            java.lang.String r5 = r13.A07
            java.lang.String r4 = r13.A05
            java.lang.String r3 = r13.A04
            if (r3 != 0) goto L89
            java.lang.String r3 = ""
        L89:
            X.AbstractC167017dG.A1P(r5, r4)
            X.0wW r2 = r6.A01
            java.lang.String r1 = "ig_search_meta_ai_hcm_prompt_tap"
            X.0kM r0 = r2.A00
            X.0Ai r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto Lc2
            java.lang.String r0 = X.W99.A00(r2, r6)
            X.InterfaceC72022XFk.A00(r2, r6, r0)
            X.W99.A01(r2, r6)
            long r0 = (long) r7
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "prompt_index"
            r2.A9K(r0, r1)
            java.lang.String r0 = "prompt_source"
            r2.AAP(r0, r5)
            java.lang.String r0 = "prompt_text"
            r2.AAP(r0, r4)
            java.lang.String r0 = "prompt_id"
            r2.AAP(r0, r3)
            r2.Cht()
        Lc2:
            java.lang.String r3 = "ig_search:serp_hcm_pill"
            goto L2a
        Lc6:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC67878V0j.A02(X.E8w, X.V0j, boolean):void");
    }

    @Override // X.AbstractC59962oe
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final UserSession getSession() {
        return (UserSession) this.A0r.getValue();
    }

    public final XB9 A05() {
        if (this instanceof VAH) {
            return ((VAH) this).A00;
        }
        if (this instanceof VAL) {
            return ((VAL) this).A02;
        }
        if (this instanceof VAI) {
            return ((VAI) this).A00;
        }
        if (this instanceof VAJ) {
            return ((VAJ) this).A00;
        }
        if (this instanceof VAK) {
            return ((VAK) this).A00;
        }
        if (this instanceof VAG) {
            return ((VAG) this).A00;
        }
        return ((VAF) this).A00;
    }

    public final V0V A06() {
        Fragment fragment = this.mParentFragment;
        C14360o3.A0C(fragment, "null cannot be cast to non-null type com.instagram.search.surface.fragment.CompositeSerpTabbedFragment");
        return (V0V) fragment;
    }

    public final C51042Mgs A07() {
        return (C51042Mgs) this.A0s.getValue();
    }

    public final String A08() {
        if (this instanceof VAH) {
            return "places_serp";
        }
        if (this instanceof VAL) {
            return "clips_serp_page";
        }
        if (this instanceof VAI) {
            return "user_serp";
        }
        if (this instanceof VAJ) {
            return "top_serp";
        }
        if (this instanceof VAK) {
            return "popular_serp";
        }
        if (this instanceof VAG) {
            return "hashtag_serp";
        }
        return "audio_serp_page";
    }

    public final String A09() {
        if (this instanceof VAH) {
            return "PLACE";
        }
        if (this instanceof VAL) {
            return "CLIPS";
        }
        if (this instanceof VAJ) {
            return "TOP";
        }
        if (this instanceof VAI) {
            return "USER";
        }
        if (this instanceof VAK) {
            return "POPULAR";
        }
        if (this instanceof VAG) {
            return "HASHTAG";
        }
        return "AUDIO";
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6P() {
        C11520jB c11520jB = new C11520jB();
        c11520jB.A04(AbstractC37793Gk8.A02, A06().A05());
        c11520jB.A04(AbstractC37793Gk8.A00, A06().A04());
        c11520jB.A04(AbstractC37793Gk8.A01, A06().A05());
        c11520jB.A05(AbstractC129015sM.A01, A07().A03());
        c11520jB.A05(AbstractC129015sM.A00, AbstractC65702TsY.A0d(this));
        c11520jB.A0A("HashtagFeedFragment.ARGUMENT_ENTRY_TRIGGER", requireArguments().getString("HashtagFeedFragment.ARGUMENT_ENTRY_TRIGGER"));
        return c11520jB;
    }

    @Override // X.AbstractC59972of
    public final void beforeOnPause() {
        if (this.A0W && isMenuVisible()) {
            String A09 = A09();
            if (C14360o3.A0K(A09, "TOP") || C14360o3.A0K(A09, "USER")) {
                AnonymousClass746.A00(getSession()).A01(requireActivity());
            }
        }
    }

    @Override // X.InterfaceC60682pr
    public final C3FQ getScrollingViewProxy() {
        C65823Tug c65823Tug = this.A06;
        if (c65823Tug == null) {
            C14360o3.A0F("grid");
            throw C00O.createAndThrow();
        }
        return c65823Tug.A06;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C30A c30a = this.A09;
        if (c30a == null) {
            C14360o3.A0F("previewMediaController");
            throw C00O.createAndThrow();
        }
        return c30a.onBackPressed();
    }

    public AbstractC67878V0j() {
        X2z x2z = new X2z(this, 3);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X2z(new X2z(this, 0), 1));
        this.A0s = new C60842q8(new X2z(A00, 2), x2z, new C57252Pba(12, null, A00), new C0YZ(C51042Mgs.class));
        this.A0k = C38U.A00;
        this.A0q = new PIB(this, 2);
        this.A0Z = new C70889Wji(this, 4);
        this.A0Y = new C70887Wjg(this);
        this.A0X = new C70885Wje(this);
        this.A0g = new C71025Wmg(this);
        this.A0j = new C71062WnJ(this, 3);
        this.A0b = new Wk0(this, 5);
        this.A0a = new Wk0(this, 4);
        this.A0d = new Wk0(this, 7);
        this.A0e = new Wk0(this, 8);
        this.A0c = new Wk0(this, 6);
        this.A0n = new C70723Wfo(this, 24);
        this.A0o = new C70723Wfo(this, 25);
        this.A0m = new C70723Wfo(this, 23);
        this.A0p = new Wk9(this, 3);
        this.A0f = new WlP(this, 0);
        this.A0h = new C69680VtQ(this);
        this.A0i = new C69681VtR(this);
    }

    public static final void A03(Keyword keyword, AbstractC67878V0j abstractC67878V0j) {
        UserSession session = abstractC67878V0j.getSession();
        if (!C18U.A06(AbstractC166997dE.A0U(session), session, 36330939378320472L)) {
            C140966Yy A0P = AbstractC31173DnH.A0P(abstractC67878V0j.requireActivity(), abstractC67878V0j.getSession());
            U04.A00();
            abstractC67878V0j.getSession();
            A0P.A0B(null, U29.A01(keyword, abstractC67878V0j.getModuleName(), abstractC67878V0j.A06().A04(), AbstractC65702TsY.A0d(abstractC67878V0j), null));
            A0P.A04();
        }
    }

    @Override // X.C1M1
    public final String getSessionId() {
        return A06().A05();
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return C18U.A06(C06090Tz.A05, getSession(), 36318750261189071L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0835, code lost:
    
        if (X.C18U.A06(r5, r1, 36312866157626733L) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x084a, code lost:
    
        if (X.C18U.A06(r5, r1, 36312866157626733L) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0755, code lost:
    
        if (X.C18U.A06(r5, r1, 36312866157626733L) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x076a, code lost:
    
        if (X.C18U.A06(r5, r1, 36312866157626733L) == false) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0473  */
    /* JADX WARN: Type inference failed for: r2v32, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r32v3, types: [X.2y7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v44, types: [X.Iz3, X.30m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v21, types: [X.2sP, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r56) {
        /*
            Method dump skipped, instructions count: 2476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC67878V0j.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(769011484);
        C14360o3.A0B(layoutInflater, 0);
        C66136U1d c66136U1d = this.A0G;
        if (c66136U1d == null) {
            str = "viewpointDelegate";
        } else {
            V0V A06 = A06();
            long j = A06.A03;
            A06.A03 = 0L;
            c66136U1d.A00.sendEmptyMessageDelayed(0, j);
            if (this.A06 == null) {
                str = "grid";
            } else {
                View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_grid_recyclerview_wrapper, false);
                C0f9.A09(996291595, A02);
                return A0R;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroy() {
        int A02 = C0f9.A02(-1485039548);
        C25671My A00 = AbstractC25651Mw.A00(getSession());
        A00.A02(this.A0n, C42251Inb.class);
        A00.A02(this.A0o, C70073Cr.class);
        A00.A02(this.A0m, C70043Co.class);
        V0V A06 = A06();
        C14360o3.A0C(A06, "null cannot be cast to non-null type com.instagram.base.scrollablenavigation.HasScrollableNavigation");
        if (A06.CcV()) {
            C65823Tug c65823Tug = this.A06;
            if (c65823Tug != null) {
                C1I4 c1i4 = new C1I4[]{A06().A01()}[0];
                C61372qz c61372qz = c65823Tug.A0G;
                C14360o3.A0B(c1i4, 0);
                c61372qz.A01.remove(c1i4);
                V8L v8l = A06().A0B;
                if (A06().A0S && v8l != null) {
                    this.mLifecycleRegistry.A0A(v8l);
                    C65823Tug c65823Tug2 = this.A06;
                    if (c65823Tug2 != null) {
                        C1I4 c1i42 = new C1I4[]{v8l}[0];
                        C61372qz c61372qz2 = c65823Tug2.A0G;
                        C14360o3.A0B(c1i42, 0);
                        c61372qz2.A01.remove(c1i42);
                    }
                }
            }
            C14360o3.A0F("grid");
            throw C00O.createAndThrow();
        }
        if (C18U.A06(C06090Tz.A05, getSession(), 36314528308660911L)) {
            C42411xV.A00(getSession()).A08(getModuleName());
        }
        super.onDestroy();
        C32S c32s = this.A0V;
        if (c32s != null) {
            c32s.A0B();
        }
        C0f9.A09(1879429727, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-971165737);
        super.onDestroyView();
        A06().A03().A00();
        C65823Tug c65823Tug = this.A06;
        if (c65823Tug == null) {
            C14360o3.A0F("grid");
            throw C00O.createAndThrow();
        }
        c65823Tug.A01();
        C51042Mgs A07 = A07();
        C55168OdW c55168OdW = A07.A0C;
        String str = A07.A0F;
        String str2 = A07.A0G;
        C55168OdW.A03(c55168OdW, str, str2, new JEZ(C55168OdW.A02(c55168OdW, str, str2).getValue(), 13));
        JDX jdx = JDX.A00;
        C05A A01 = C55168OdW.A01(c55168OdW, str, str2);
        A01.Egh(jdx.invoke(A01.getValue()));
        C0f9.A09(86639832, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        W99 w99;
        ViewGroup CFj;
        int A02 = C0f9.A02(1428389637);
        C65823Tug c65823Tug = this.A06;
        String str = "grid";
        if (c65823Tug != null) {
            c65823Tug.A0D.AGc();
            JIG jig = this.A08;
            if (jig == null) {
                str = "videoPlayerManager";
            } else {
                jig.EE9();
                JIG jig2 = this.A07;
                if (jig2 == null) {
                    str = "hcmVideoPlayerManager";
                } else {
                    jig2.EE9();
                    W58 w58 = this.A0D;
                    if (w58 == null) {
                        str = "perfLogger";
                    } else {
                        w58.A01();
                        super.onPause();
                        V0V A06 = A06();
                        C14360o3.A0C(A06, "null cannot be cast to non-null type com.instagram.base.scrollablenavigation.HasScrollableNavigation");
                        if (A06.CcV()) {
                            ViewOnTouchListenerC60632pm A01 = A06().A01();
                            C65823Tug c65823Tug2 = this.A06;
                            if (c65823Tug2 != null) {
                                C3FQ c3fq = c65823Tug2.A06;
                                ViewOnTouchListenerC60632pm.A01(A01, true);
                                if (c3fq != null && (CFj = c3fq.CFj()) != null) {
                                    CFj.requestLayout();
                                }
                            }
                        }
                        A06().A03().A00();
                        if (this instanceof VAJ) {
                            C66136U1d c66136U1d = this.A0G;
                            if (c66136U1d == null) {
                                str = "viewpointDelegate";
                            } else {
                                C66146U1n c66146U1n = c66136U1d.A07;
                                double d = c66146U1n.A00;
                                if (d > 250.0d && c66146U1n.A01 > 0.8999999761581421d && (w99 = c66146U1n.A02) != null) {
                                    C18920wW c18920wW = w99.A01;
                                    InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_search_meta_ai_hcm_text_seen");
                                    if (A00.isSampled()) {
                                        InterfaceC72022XFk.A00(A00, w99, W99.A00(A00, w99));
                                        W99.A01(A00, w99);
                                        A00.A8I(AbstractC111324zv.A00(207), Double.valueOf(d));
                                        A00.Cht();
                                    }
                                }
                                c66146U1n.A01 = 0.0d;
                                c66146U1n.A00 = 0.0d;
                            }
                        }
                        C0f9.A09(369748070, A02);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        ViewGroup viewGroup;
        int A02 = C0f9.A02(-1614778616);
        super.onResume();
        C65823Tug c65823Tug = this.A06;
        if (c65823Tug == null) {
            C14360o3.A0F("grid");
            throw C00O.createAndThrow();
        }
        c65823Tug.A0D.EJ1();
        View view = A06().A04;
        V0V A06 = A06();
        C14360o3.A0C(A06, "null cannot be cast to non-null type com.instagram.base.scrollablenavigation.HasScrollableNavigation");
        if (A06.CcV() && view != null) {
            boolean z = A06().A0S;
            C56352iT A03 = C56352iT.A0t.A03(getActivity());
            if (z) {
                viewGroup = A03.A0O;
            } else {
                viewGroup = A03.A0P;
            }
            A06().A01().A05(new C42139Iln(1), C16930sl.A00, AbstractC16960so.A1Q(viewGroup, view), this.A0R, true);
        }
        AnonymousClass746.A00(getSession()).A00(requireActivity());
        View view2 = this.mView;
        if (view2 != null) {
            view2.post(new RunnableC71376Wsl(this));
        }
        C0f9.A09(1461947541, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1877213517);
        super.onStop();
        A06().A03().A00();
        C0f9.A09(77476725, A02);
    }
}
