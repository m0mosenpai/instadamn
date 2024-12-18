package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Bsx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26835Bsx extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60122ou, InterfaceC101554hQ, InterfaceC153526vN {
    public static final String __redex_internal_original_name = "RBSPivotPageFragment";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public C8Z A04;
    public ShimmerFrameLayout A05;
    public C154846xZ A06;
    public IgTextView A07;
    public IgTextView A08;
    public IgTextView A09;
    public IgTextView A0A;
    public RoundedCornerImageView A0B;
    public C153766vl A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public C18920wW A0G;
    public IgTextView A0H;
    public CircularImageView A0I;
    public C57112jm A0J;
    public AnonymousClass308 A0K;
    public C1M1 A0L;
    public final int A0Q = 15;
    public final String A0M = AbstractC167017dG.A0j();
    public final InterfaceC09390do A0N = AbstractC09440dt.A01(C29888DGc.A00(this, 14));
    public final InterfaceC09390do A0P = AbstractC25225BEi.A0a(C29888DGc.A00(this, 15), C29888DGc.A00(this, 16), new D8J(11, null, this), AbstractC25225BEi.A1D(C25800BbH.class));
    public final InterfaceC62612t0 A0R = new C29277CvY(this, 2);
    public final InterfaceC09390do A0O = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC153556vQ
    public final void D1P() {
    }

    @Override // X.InterfaceC153566vR
    public final void D51(View view) {
    }

    @Override // X.InterfaceC153546vP
    public final void D52(View view) {
    }

    @Override // X.InterfaceC153536vO
    public final /* synthetic */ void D55(User user) {
    }

    @Override // X.InterfaceC153536vO
    public final void D5T(C120985dq c120985dq, int i) {
        C140966Yy A0c;
        String id;
        C14360o3.A0B(c120985dq, 0);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            if (c38321qM.A5c()) {
                if (c38321qM.A38() != null) {
                    IgFragmentFactoryImpl.A00();
                    String valueOf = String.valueOf(c38321qM.A38());
                    C35028Fc1 c35028Fc1 = new C35028Fc1();
                    c35028Fc1.A0B = valueOf;
                    A0c = AbstractC25231BEo.A0c(requireActivity(), this.A0O);
                    A0c.A0B(null, c35028Fc1.A02());
                } else {
                    return;
                }
            } else {
                ArrayList A1E = AbstractC166987dD.A1E();
                C153766vl c153766vl = this.A0C;
                if (c153766vl == null) {
                    C14360o3.A0F("clipsGridAdapter");
                    throw C00O.createAndThrow();
                }
                Iterator it = c153766vl.A01().iterator();
                while (it.hasNext()) {
                    C38321qM c38321qM2 = ((C154026wB) it.next()).A03.A02;
                    if (c38321qM2 != null && (id = c38321qM2.getId()) != null) {
                        A1E.add(id);
                    }
                }
                A0c = AbstractC25231BEo.A0c(requireActivity(), this.A0O);
                String string = getString(2131977014);
                String id2 = c38321qM.getId();
                ContextualFeedFragment contextualFeedFragment = new ContextualFeedFragment();
                contextualFeedFragment.setArguments(C31569Dtv.A04(null, "Static", string, id2, "multimedia_pivot_page_fragment", "ray_ban_stories_pivot_page", null, A1E));
                A0c.A0B(null, contextualFeedFragment);
                A0c.A08();
            }
            A0c.A04();
        }
    }

    @Override // X.InterfaceC153576vS
    public final void D5V(View view) {
    }

    @Override // X.InterfaceC101554hQ
    public final void DY1() {
    }

    @Override // X.InterfaceC153586vT
    public final /* synthetic */ void Dzr() {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        ViewOnClickListenerC28666ClE.A02(interfaceC56362iU, this, 53);
        interfaceC56362iU.Efu(2131977014);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ray_ban_stories_pivot_page";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        RoundedCornerImageView roundedCornerImageView;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A0D != null) {
            A00(view, this);
            String string = requireArguments().getString("header_title");
            String string2 = requireArguments().getString("header_description");
            String string3 = requireArguments().getString("header_profile_user_name");
            boolean z = requireArguments().getBoolean("header_profile_is_verified");
            String string4 = requireArguments().getString("image_url");
            IgTextView igTextView = this.A0A;
            if (igTextView == null) {
                str = "headerTitle";
            } else {
                igTextView.setText(string);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) string3);
                if (z) {
                    C85963sQ.A08(requireContext(), spannableStringBuilder, true);
                }
                IgTextView igTextView2 = this.A09;
                if (igTextView2 == null) {
                    str = "headerDescription";
                } else {
                    igTextView2.setText(string2);
                    if (string4 != null && (roundedCornerImageView = this.A0B) != null) {
                        AbstractC25235BEs.A1I(this, roundedCornerImageView, string4);
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        View requireViewById = view.requireViewById(R.id.header);
        this.A02 = requireViewById;
        AbstractC167007dF.A0x(requireViewById);
        View requireViewById2 = view.requireViewById(R.id.ghost_header);
        this.A01 = requireViewById2;
        if (requireViewById2 != null) {
            ((Guideline) AbstractC166997dE.A0R(view, R.id.guideline)).setGuidelineBegin(0);
            ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC166997dE.A0R(view, R.id.ghost_header_container);
            C110964z8 c110964z8 = new C110964z8();
            c110964z8.A0I(constraintLayout);
            c110964z8.A09(R.id.thumbnail_shimmer, 4);
            c110964z8.A0G(constraintLayout);
            requireViewById2.setPadding(requireViewById2.getPaddingLeft(), requireViewById2.getPaddingTop(), requireViewById2.getPaddingRight(), ((int) AbstractC167007dF.A0K(requireContext()).density) * 44);
            requireViewById2.setVisibility(0);
        }
        View requireViewById3 = view.requireViewById(R.id.use_in_camera_button_scene_root);
        this.A00 = requireViewById3;
        if (requireViewById3 == null) {
            str = "floatingButton";
        } else {
            requireViewById3.setVisibility(8);
            IgTextView igTextView3 = (IgTextView) view.requireViewById(R.id.use_in_camera_label);
            this.A07 = igTextView3;
            if (igTextView3 == null) {
                str = "floatingButtonLabel";
            } else {
                igTextView3.setVisibility(8);
                InterfaceC09390do interfaceC09390do = this.A0O;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                C14360o3.A0B(A0r, 0);
                C154846xZ c154846xZ = new C154846xZ(A0r, "rbs_pivot_page", 31799988);
                this.A06 = c154846xZ;
                str = "rbsPivotPagePerfLogger";
                c154846xZ.A0Q(requireContext(), C55772hI.A00(AbstractC166987dD.A0o(interfaceC09390do)), this);
                C154846xZ c154846xZ2 = this.A06;
                if (c154846xZ2 != null) {
                    c154846xZ2.A0T(this.A0D);
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 3);
                    C153766vl c153766vl = this.A0C;
                    if (c153766vl != null) {
                        gridLayoutManager.A01 = (AbstractC154146wP) c153766vl.A0P.getValue();
                        C153156uj c153156uj = new C153156uj(gridLayoutManager, this.A0R, C153146ui.A06, false, false);
                        View requireViewById4 = view.requireViewById(R.id.videos_list);
                        RecyclerView recyclerView = (RecyclerView) requireViewById4;
                        recyclerView.setLayoutManager(gridLayoutManager);
                        recyclerView.A14(c153156uj);
                        recyclerView.A10(AbstractC154166wR.A00(requireContext(), 0, false));
                        C153766vl c153766vl2 = this.A0C;
                        if (c153766vl2 != null) {
                            recyclerView.setAdapter(c153766vl2.A0I);
                            C14360o3.A07(requireViewById4);
                            view.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserverOnScrollChangedListenerC35723Fpx(3, c153156uj, recyclerView));
                            C57112jm c57112jm = this.A0J;
                            if (c57112jm == null) {
                                str = "viewpointManager";
                            } else {
                                c57112jm.A08(recyclerView, C71163Hc.A00(this), new InterfaceC57142jp[0]);
                                C153766vl c153766vl3 = this.A0C;
                                if (c153766vl3 != null) {
                                    c153766vl3.A04(this.A0Q);
                                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) view.requireViewById(R.id.videos_list_shimmer_container);
                                    this.A05 = shimmerFrameLayout;
                                    if (shimmerFrameLayout == null) {
                                        str = "clipsGridShimmerContainer";
                                    } else {
                                        shimmerFrameLayout.A02();
                                        View requireViewById5 = view.requireViewById(R.id.video_count_shimmer);
                                        this.A03 = requireViewById5;
                                        if (requireViewById5 == null) {
                                            str = "videoCountShimmer";
                                        } else {
                                            requireViewById5.setVisibility(0);
                                            InterfaceC09390do interfaceC09390do2 = this.A0P;
                                            BY8.A00(getViewLifecycleOwner(), ((C25800BbH) interfaceC09390do2.getValue()).A00, DRR.A00(this, 3), 14);
                                            ((C25800BbH) interfaceC09390do2.getValue()).A02.A00.A04(null, null, C16930sl.A00, false);
                                            C154846xZ c154846xZ3 = this.A06;
                                            if (c154846xZ3 != null) {
                                                ((MTJ) c154846xZ3).A00.A08(null);
                                                C154846xZ c154846xZ4 = this.A06;
                                                if (c154846xZ4 != null) {
                                                    c154846xZ4.D4p();
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C14360o3.A0F("clipsGridAdapter");
                    throw C00O.createAndThrow();
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC101554hQ
    public final void DXz() {
        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A0O);
        C8i c8i = C8i.ZOOMED_MEDIA_IMPRESSION;
        C8Z c8z = this.A04;
        String str = this.A0D;
        String str2 = this.A0E;
        AnonymousClass308 anonymousClass308 = this.A0K;
        if (anonymousClass308 == null) {
            C14360o3.A0F("peekMediaController");
            throw C00O.createAndThrow();
        }
        String id = anonymousClass308.A07().getId();
        C14360o3.A0B(A0o, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, A0o), "ig_wearables_pivot_page");
        A0f.A8R(c8i, "pivot_page_event_name");
        AbstractC25234BEr.A0y(c8z, A0f, str, str2, id);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0O);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.view.View r3, X.C26835Bsx r4) {
        /*
            r0 = 2131433845(0x7f0b1975, float:1.8489487E38)
            android.view.View r0 = r3.requireViewById(r0)
            r4.A02 = r0
            X.AbstractC167007dF.A0w(r0)
            r0 = 2131442940(0x7f0b3cfc, float:1.8507934E38)
            android.view.View r0 = r3.requireViewById(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r4.A0A = r0
            r0 = 2131443679(0x7f0b3fdf, float:1.8509433E38)
            android.view.View r0 = r3.requireViewById(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r4.A0H = r0
            r0 = 2131443776(0x7f0b4040, float:1.850963E38)
            android.view.View r0 = r3.requireViewById(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r4.A08 = r0
            r0 = 2131431456(0x7f0b1020, float:1.8484642E38)
            android.view.View r0 = r3.requireViewById(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r4.A09 = r0
            r0 = 2131443661(0x7f0b3fcd, float:1.8509396E38)
            android.view.View r0 = r3.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = (com.instagram.common.ui.widget.imageview.CircularImageView) r0
            r4.A0I = r0
            com.instagram.common.ui.base.IgTextView r0 = r4.A0H
            r2 = 0
            if (r0 != 0) goto L52
            java.lang.String r0 = "headerArtist"
        L4a:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L52:
            r1 = 8
            r0.setVisibility(r1)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r4.A0I
            if (r0 != 0) goto L5e
            java.lang.String r0 = "headerProfilePicture"
            goto L4a
        L5e:
            r0.setVisibility(r1)
            r0 = 2131442864(0x7f0b3cb0, float:1.850778E38)
            android.view.View r1 = r3.findViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            if (r1 == 0) goto L84
            r0 = 2131626537(0x7f0e0a29, float:1.8880313E38)
            r1.setLayoutResource(r0)
            android.view.View r1 = r1.inflate()
            boolean r0 = r1 instanceof com.instagram.common.ui.widget.imageview.RoundedCornerImageView
            if (r0 != 0) goto L8b
            r1 = r2
        L7b:
            r4.A0B = r1
            com.instagram.common.ui.base.IgTextView r1 = r4.A08
            if (r1 != 0) goto L8e
            java.lang.String r0 = "headerCount"
            goto L4a
        L84:
            r0 = 2131442831(0x7f0b3c8f, float:1.8507713E38)
            android.view.View r1 = r3.findViewById(r0)
        L8b:
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r1 = (com.instagram.common.ui.widget.imageview.RoundedCornerImageView) r1
            goto L7b
        L8e:
            r0 = 2132018051(0x7f140383, float:1.9674398E38)
            r1.setTextAppearance(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26835Bsx.A00(android.view.View, X.Bsx):void");
    }

    @Override // X.InterfaceC153536vO
    public final boolean D5U(MotionEvent motionEvent, View view, C120985dq c120985dq, int i) {
        AbstractC167027dH.A12(c120985dq, view, motionEvent);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            AnonymousClass308 anonymousClass308 = this.A0K;
            if (anonymousClass308 == null) {
                C14360o3.A0F("peekMediaController");
                throw C00O.createAndThrow();
            }
            return anonymousClass308.DuC(motionEvent, view, c38321qM, i);
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        C38321qM A02;
        C8Z c8z;
        WearablesAppAttributionType AdN;
        int A022 = C0f9.A02(-748907857);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A0O;
        this.A0G = AbstractC12220kQ.A01(this, AbstractC166987dD.A0o(interfaceC09390do));
        this.A0D = requireArguments().getString("source_media_id");
        this.A0E = requireArguments().getString("source_media_surface");
        if (this.A0D != null && (A02 = C1DW.A00(AbstractC166987dD.A0r(interfaceC09390do)).A02(this.A0D)) != null) {
            InterfaceC43580JMo A0t = AbstractC25226BEj.A0t(A02);
            if (A0t != null && (AdN = A0t.AdN()) != null) {
                int ordinal = AdN.ordinal();
                if (ordinal != 2) {
                    if (ordinal == 7) {
                        c8z = C8Z.RAY_BAN_STORIES;
                    }
                } else {
                    c8z = C8Z.RAY_BAN_META;
                }
                this.A04 = c8z;
            }
            c8z = null;
            this.A04 = c8z;
        }
        C57112jm A00 = C57112jm.A00();
        this.A0J = A00;
        this.A0C = new C153766vl(requireContext(), null, this, new C153746vj(AbstractC166987dD.A0r(interfaceC09390do), A00, this, null), this, AbstractC166987dD.A0r(interfaceC09390do), null, new C153736vi(1.0f, true, false), null, null, null, false, false);
        ((C62832tM) this.A0N.getValue()).A02(this.A0M);
        this.A0L = C1M3.A00();
        FragmentActivity requireActivity = requireActivity();
        AbstractC10360h2 parentFragmentManager = getParentFragmentManager();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C1M1 c1m1 = this.A0L;
        if (c1m1 == null) {
            str = "pivotPageSessionProvider";
        } else {
            C153766vl c153766vl = this.A0C;
            if (c153766vl == null) {
                str = "clipsGridAdapter";
            } else {
                AnonymousClass308 anonymousClass308 = new AnonymousClass308(requireActivity, this, parentFragmentManager, A0r, null, this, c153766vl, c1m1, true, true, false);
                anonymousClass308.A0B = this;
                this.A0K = anonymousClass308;
                registerLifecycleListener(anonymousClass308);
                C0f9.A09(1221414843, A022);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1362362805);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_pivot_page_fragment, viewGroup, false);
        C0f9.A09(259001513, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-412415418);
        super.onDestroy();
        ((C62832tM) this.A0N.getValue()).A07(this.A0M);
        C0f9.A09(-258306132, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-805173415);
        super.onPause();
        this.A0F = false;
        C0f9.A09(-43324888, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(178329378);
        super.onResume();
        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A0O);
        C8i c8i = C8i.STORE_LINK_IMPRESSION;
        C8Z c8z = this.A04;
        String str = this.A0D;
        String str2 = this.A0E;
        C14360o3.A0B(A0o, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, A0o), "ig_wearables_pivot_page");
        A0f.A8R(c8i, "pivot_page_event_name");
        AbstractC25234BEr.A0y(c8z, A0f, str, str2, null);
        C0f9.A09(-1210642290, A02);
    }
}
