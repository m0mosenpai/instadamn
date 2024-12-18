package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.shimmer.placeholder.SimpleShimmerPlaceholderView;
import com.instagram.user.model.User;
import java.util.concurrent.Executor;

/* renamed from: X.Bsy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26836Bsy extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC153526vN {
    public static final String __redex_internal_original_name = "RecipeSheetListFragment";
    public View A00;
    public C66422UGr A01;
    public RecyclerView A02;
    public RecyclerView A03;
    public ShimmerFrameLayout A04;
    public IgTextView A05;
    public IgTextView A06;
    public SimpleShimmerPlaceholderView A07;
    public SimpleShimmerPlaceholderView A08;
    public C153766vl A09;
    public C153766vl A0A;
    public C51139Mii A0B;
    public InterfaceC31049Dkn A0C;
    public C25898Bcz A0D;
    public CU8 A0E;
    public C25671My A0F;
    public Integer A0I;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0M;
    public InterfaceC41501vz A0G = new C29152CtJ(this, 4);
    public C57112jm A0H = C57112jm.A00();
    public final InterfaceC09390do A0J = AbstractC09440dt.A01(C29891DGf.A00(this, 48));
    public final InterfaceC09390do A0L = AbstractC09440dt.A01(new C43203J8a(this, 1));

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
    }

    @Override // X.InterfaceC153536vO
    public final boolean D5U(MotionEvent motionEvent, View view, C120985dq c120985dq, int i) {
        return true;
    }

    @Override // X.InterfaceC153576vS
    public final void D5V(View view) {
    }

    @Override // X.InterfaceC153586vT
    public final /* synthetic */ void Dzr() {
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        Integer num = this.A0I;
        if (num == null) {
            C14360o3.A0F("listType");
            throw C00O.createAndThrow();
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    return "recipe_sheet_cyclic_subtitles";
                }
                throw B4Z.A00();
            }
            return "recipe_sheet_people";
        }
        return "recipe_sheet";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0M);
    }

    public C26836Bsy() {
        C29891DGf A00 = C29891DGf.A00(this, 49);
        C43203J8a c43203J8a = new C43203J8a(this, 0);
        InterfaceC09390do A002 = AbstractC09440dt.A00(EnumC09460dv.A02, new C43203J8a(A00, 2));
        this.A0K = AbstractC25225BEi.A0a(new C43203J8a(A002, 3), c43203J8a, new D8I(26, null, A002), AbstractC25225BEi.A1D(C25844Bbz.class));
        this.A0M = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1845155189);
        super.onCreate(bundle);
        Integer[] A00 = C05F.A00(3);
        InterfaceC09390do interfaceC09390do = this.A0L;
        this.A0I = A00[AbstractC25226BEj.A16(interfaceC09390do).A01];
        this.A0E = new CU8(this, AbstractC166987dD.A0r(this.A0M), AbstractC25226BEj.A0z(this.A0J), (int) AbstractC25226BEj.A16(interfaceC09390do).A02);
        C0f9.A09(-1167314106, A02);
    }

    /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.Object, X.Nnx] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Throwable A0g;
        int i;
        C2GT c2gt;
        C07X viewLifecycleOwner;
        int i2;
        InterfaceC88553xD A01;
        InterfaceC88553xD A012;
        int A02 = C0f9.A02(-822132263);
        C14360o3.A0B(layoutInflater, 0);
        Integer num = this.A0I;
        String str = "listType";
        if (num != null) {
            String str2 = "listFragmentView";
            if (num == C05F.A00 && AbstractC25226BEj.A16(this.A0L).A07) {
                View inflate = layoutInflater.inflate(R.layout.recipe_sheet_list_fragment_inspiration, viewGroup, false);
                this.A00 = inflate;
                if (inflate != null) {
                    View requireViewById = inflate.requireViewById(R.id.use_in_camera_button_scene_root);
                    requireViewById.setVisibility(0);
                    C0fQ.A00(null, requireViewById);
                    View view = this.A00;
                    if (view != null) {
                        TextView A0T = AbstractC166997dE.A0T(view, R.id.use_in_camera_label);
                        A0T.setText(2131971559);
                        AbstractC166997dE.A18(requireContext(), A0T, 2131971560);
                        AbstractC56952jT.A01(A0T);
                        Context requireContext = requireContext();
                        C57112jm c57112jm = this.A0H;
                        InterfaceC09390do interfaceC09390do = this.A0M;
                        C153746vj c153746vj = new C153746vj(AbstractC166987dD.A0r(interfaceC09390do), c57112jm, this, null);
                        InterfaceC09390do interfaceC09390do2 = C28493Chl.A02;
                        InterfaceC09390do interfaceC09390do3 = this.A0J;
                        C38321qM A0z = AbstractC25226BEj.A0z(interfaceC09390do3);
                        C14360o3.A0B(A0z, 0);
                        C3x9 A0u = AbstractC25226BEj.A0u(A0z);
                        if (A0u != null && (A012 = AbstractC117245Sj.A01(A0u)) != null && A012.Ceq()) {
                            View view2 = this.A00;
                            if (view2 != null) {
                                IgTextView igTextView = (IgTextView) view2.requireViewById(R.id.trend_metadata);
                                View view3 = this.A00;
                                if (view3 != null) {
                                    igTextView.setText(AbstractC166997dE.A0r(view3.getResources(), "125k", 2131971566));
                                    this.A06 = igTextView;
                                    View view4 = this.A00;
                                    if (view4 != null) {
                                        SimpleShimmerPlaceholderView simpleShimmerPlaceholderView = (SimpleShimmerPlaceholderView) view4.requireViewById(R.id.trend_ghost_placeholder);
                                        simpleShimmerPlaceholderView.setVisibility(0);
                                        this.A08 = simpleShimmerPlaceholderView;
                                    }
                                }
                            }
                        }
                        View view5 = this.A00;
                        if (view5 != null) {
                            this.A05 = (IgTextView) view5.requireViewById(R.id.inspiration_title);
                            View view6 = this.A00;
                            if (view6 != null) {
                                this.A07 = (SimpleShimmerPlaceholderView) view6.requireViewById(R.id.inspiration_ghost_title);
                                C38321qM A0z2 = AbstractC25226BEj.A0z(interfaceC09390do3);
                                C14360o3.A0B(A0z2, 0);
                                C3x9 A0u2 = AbstractC25226BEj.A0u(A0z2);
                                if (A0u2 != null && (A01 = AbstractC117245Sj.A01(A0u2)) != null && A01.Ceq()) {
                                    int A04 = AbstractC167017dG.A04(requireContext());
                                    SimpleShimmerPlaceholderView simpleShimmerPlaceholderView2 = this.A07;
                                    if (simpleShimmerPlaceholderView2 == null) {
                                        str2 = "inspirationGhostTitle";
                                    } else {
                                        AbstractC13880nE.A0U(simpleShimmerPlaceholderView2, A04);
                                        IgTextView igTextView2 = this.A05;
                                        if (igTextView2 == null) {
                                            str2 = "inspirationTitle";
                                        } else {
                                            AbstractC13880nE.A0Y(igTextView2, A04);
                                        }
                                    }
                                }
                                this.A0B = new C51139Mii(requireContext, new C51090Mhp(6), this, AbstractC166987dD.A0r(interfaceC09390do));
                                C153766vl c153766vl = new C153766vl(requireContext, null, this, c153746vj, this, AbstractC166987dD.A0r(interfaceC09390do), null, new C153736vi(0.5625f, false, false), null, null, null, false, false);
                                c153766vl.A04(6);
                                this.A09 = c153766vl;
                                C153766vl c153766vl2 = new C153766vl(requireContext, null, this, c153746vj, this, AbstractC166987dD.A0r(interfaceC09390do), null, new C153736vi(0.5625f, false, false), null, null, null, false, false);
                                this.A0A = c153766vl2;
                                C153766vl c153766vl3 = this.A09;
                                if (c153766vl3 == null) {
                                    str = "ghostItemsAdapter";
                                } else {
                                    C66362zD c66362zD = c153766vl3.A0I;
                                    C51139Mii c51139Mii = this.A0B;
                                    if (c51139Mii == null) {
                                        str = "clipsItemsAdapter";
                                    } else {
                                        this.A01 = new C66422UGr(c66362zD, c51139Mii, c153766vl2.A0I);
                                        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext, 3);
                                        gridLayoutManager.A01 = new C25890Bcr(this, 3);
                                        View view7 = this.A00;
                                        if (view7 != null) {
                                            RecyclerView recyclerView = (RecyclerView) view7.requireViewById(R.id.clips_recycler_view);
                                            C66422UGr c66422UGr = this.A01;
                                            if (c66422UGr == null) {
                                                str = "concatAdapter";
                                            } else {
                                                recyclerView.setAdapter(c66422UGr);
                                                recyclerView.setLayoutManager(gridLayoutManager);
                                                recyclerView.A10(AbstractC154166wR.A00(requireContext, 0, false));
                                                this.A03 = recyclerView;
                                                InterfaceC09390do interfaceC09390do4 = this.A0K;
                                                C25844Bbz c25844Bbz = (C25844Bbz) interfaceC09390do4.getValue();
                                                C28180CbS c28180CbS = new C28180CbS(c25844Bbz.A09, c25844Bbz, AbstractC141776au.A00(c25844Bbz));
                                                ?? obj = new Object();
                                                C2SW c2sw = C2SW.A00;
                                                Executor executor = C72051XLs.A02;
                                                C14360o3.A07(executor);
                                                C2LF c2lf = new C2LF(executor);
                                                C29623D2y c29623D2y = new C29623D2y(new DH1(25, c2lf, c28180CbS), c2lf);
                                                Executor executor2 = C72051XLs.A03;
                                                C14360o3.A07(executor2);
                                                BY8.A00(getViewLifecycleOwner(), new C50871Me2(obj, c29623D2y, new C2LF(executor2), c2lf, c2sw), C30180DRl.A00(this, 38), 17);
                                                View view8 = this.A00;
                                                if (view8 != null) {
                                                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) view8.requireViewById(R.id.shimmer_container);
                                                    shimmerFrameLayout.A02();
                                                    this.A04 = shimmerFrameLayout;
                                                    BY8.A00(getViewLifecycleOwner(), ((C25844Bbz) interfaceC09390do4.getValue()).A05, C30180DRl.A00(this, 39), 17);
                                                    BY8.A00(getViewLifecycleOwner(), ((C25844Bbz) interfaceC09390do4.getValue()).A04, C30180DRl.A00(this, 40), 17);
                                                    BY8.A00(getViewLifecycleOwner(), ((C25844Bbz) interfaceC09390do4.getValue()).A03, C30180DRl.A00(this, 41), 17);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
            this.A00 = layoutInflater.inflate(R.layout.recipe_sheet_list_fragment, viewGroup, false);
            FragmentActivity requireActivity = requireActivity();
            InterfaceC09390do interfaceC09390do5 = this.A0M;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do5);
            C57112jm c57112jm2 = this.A0H;
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do5);
            C25344BJn c25344BJn = new C25344BJn(this, 52);
            InterfaceC09390do interfaceC09390do6 = this.A0J;
            this.A0D = new C25898Bcz(requireActivity, getViewLifecycleOwner(), this, A0r, c57112jm2, AbstractC25226BEj.A0z(interfaceC09390do6), new C27099BxO(A0r2, AbstractC25226BEj.A0z(interfaceC09390do6), c25344BJn), AbstractC166987dD.A1E(), C30180DRl.A00(this, 42), C30180DRl.A00(this, 34), new C30194DRz(this, 3), AbstractC167007dF.A1P(AbstractC25226BEj.A16(this.A0L).A01, 2));
            View view9 = this.A00;
            if (view9 != null) {
                RecyclerView recyclerView2 = (RecyclerView) view9.requireViewById(R.id.attributes_recycler_view);
                C25898Bcz c25898Bcz = this.A0D;
                if (c25898Bcz == null) {
                    str = "attributesAdapter";
                } else {
                    recyclerView2.setAdapter(c25898Bcz);
                    this.A02 = recyclerView2;
                    C71163Hc A00 = C71163Hc.A00(this);
                    RecyclerView recyclerView3 = this.A02;
                    if (recyclerView3 != null) {
                        c57112jm2.A08(recyclerView3, A00, new InterfaceC57142jp[0]);
                        Integer num2 = this.A0I;
                        if (num2 != null) {
                            int intValue = num2.intValue();
                            if (intValue != 0) {
                                if (intValue != 1) {
                                    if (intValue == 2) {
                                        c2gt = ((C25844Bbz) this.A0K.getValue()).A02;
                                        viewLifecycleOwner = getViewLifecycleOwner();
                                        i2 = 37;
                                    } else {
                                        A0g = B4Z.A00();
                                        i = -969990832;
                                    }
                                } else {
                                    c2gt = ((C25844Bbz) this.A0K.getValue()).A00;
                                    viewLifecycleOwner = getViewLifecycleOwner();
                                    i2 = 36;
                                }
                            } else {
                                c2gt = ((C25844Bbz) this.A0K.getValue()).A01;
                                viewLifecycleOwner = getViewLifecycleOwner();
                                i2 = 35;
                            }
                            BY8.A00(viewLifecycleOwner, c2gt, C30180DRl.A00(this, i2), 17);
                            C25671My A002 = AbstractC25651Mw.A00(AbstractC166987dD.A0o(interfaceC09390do5));
                            this.A0F = A002;
                            if (A002 == null) {
                                str = "igEventBus";
                            } else {
                                A002.A01(this.A0G, C3MC.class);
                                View view10 = this.A00;
                                if (view10 != null) {
                                    C0f9.A09(-806933695, A02);
                                    return view10;
                                }
                            }
                        }
                    } else {
                        A0g = AbstractC166997dE.A0g();
                        i = -1375112666;
                    }
                    C0f9.A09(i, A02);
                    throw A0g;
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-877427824);
        super.onDestroyView();
        C25671My c25671My = this.A0F;
        if (c25671My == null) {
            C14360o3.A0F("igEventBus");
            throw C00O.createAndThrow();
        }
        c25671My.A02(this.A0G, C3MC.class);
        C0f9.A09(-296251659, A02);
    }
}
