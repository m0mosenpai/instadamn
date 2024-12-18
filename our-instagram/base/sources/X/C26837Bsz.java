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
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* renamed from: X.Bsz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26837Bsz extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC101554hQ, InterfaceC153526vN {
    public static final String __redex_internal_original_name = "PivotPageDefaultClipsGridFragment";
    public TextView A00;
    public ShimmerFrameLayout A01;
    public ClipsViewerSource A02;
    public AnonymousClass308 A03;
    public C153766vl A04;
    public C57112jm A05;
    public C1M1 A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;

    public final void A00(C0UO c0uo) {
        C14360o3.A0B(c0uo, 0);
        C25831Bbm c25831Bbm = (C25831Bbm) this.A0D.getValue();
        InterfaceC23621Ds A0s = AbstractC25230BEn.A0s(c25831Bbm.A01);
        c25831Bbm.A01 = AbstractC25226BEj.A1L(new MCK(c0uo, c25831Bbm, A0s, 17), AbstractC141776au.A00(c25831Bbm));
    }

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
    public final void D55(User user) {
        C14360o3.A0B(user, 0);
        ClipsViewerSource clipsViewerSource = this.A02;
        if (clipsViewerSource == null) {
            C14360o3.A0F("clipsViewerSource");
            throw C00O.createAndThrow();
        }
        if (clipsViewerSource.ordinal() == 100) {
            AbstractC37834Gko.A03(requireActivity(), this, AbstractC166987dD.A0r(this.A0C), user.getId(), "clips_template_pivot_page", null, ModalActivity.A08);
        }
    }

    @Override // X.InterfaceC153536vO
    public final void D5T(C120985dq c120985dq, int i) {
        String str;
        C14360o3.A0B(c120985dq, 0);
        InterfaceC09390do interfaceC09390do = this.A0C;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            String id = c120985dq.getId();
            C1M1 c1m1 = this.A06;
            if (c1m1 == null) {
                str = "pivotPageSessionProvider";
            } else {
                AbstractC37670Gi3.A0Y(this, A0r, c38321qM, c1m1, id, i);
                C38321qM c38321qM2 = c120985dq.A02;
                if (c38321qM2 != null) {
                    if (c38321qM2.A5c()) {
                        IgFragmentFactoryImpl.A00();
                        String A38 = c38321qM2.A38();
                        if (A38 != null) {
                            C35028Fc1 c35028Fc1 = new C35028Fc1();
                            c35028Fc1.A0B = A38;
                            C140966Yy A0j = AbstractC25233BEq.A0j(this, interfaceC09390do);
                            A0j.A0D(c35028Fc1.A02());
                            A0j.A04();
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                    ClipsViewerSource clipsViewerSource = this.A02;
                    if (clipsViewerSource == null) {
                        str = "clipsViewerSource";
                    } else {
                        C116875Qr c116875Qr = new C116875Qr(clipsViewerSource, A0r2);
                        c116875Qr.A1D = c120985dq.getId();
                        String str2 = this.A08;
                        if (str2 == null) {
                            str = "gridKey";
                        } else {
                            c116875Qr.A1G = str2;
                            c116875Qr.A1d = false;
                            AbstractC86593tX.A0X(requireActivity(), c116875Qr.A00(), AbstractC166987dD.A0r(interfaceC09390do));
                            return;
                        }
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC153576vS
    public final void D5V(View view) {
    }

    @Override // X.InterfaceC101554hQ
    public final void DXz() {
    }

    @Override // X.InterfaceC101554hQ
    public final void DY1() {
    }

    @Override // X.InterfaceC153586vT
    public final void Dzr() {
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View requireViewById = view.requireViewById(R.id.clips_grid);
        RecyclerView recyclerView = (RecyclerView) requireViewById;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 3);
        C153766vl c153766vl = this.A04;
        String str = "clipsGridAdapter";
        if (c153766vl != null) {
            gridLayoutManager.A01 = (AbstractC154146wP) c153766vl.A0P.getValue();
            recyclerView.setLayoutManager(gridLayoutManager);
            recyclerView.A14(new C153156uj(recyclerView.A0D, new C29277CvY(this, 1), C153146ui.A06, false, false));
            recyclerView.A10(AbstractC154166wR.A00(requireContext(), 0, false));
            C153766vl c153766vl2 = this.A04;
            if (c153766vl2 != null) {
                recyclerView.setAdapter(c153766vl2.A0I);
                C14360o3.A07(requireViewById);
                C57112jm c57112jm = this.A05;
                if (c57112jm == null) {
                    str = "viewpointManager";
                } else {
                    c57112jm.A08(recyclerView, C71163Hc.A00(this), new InterfaceC57142jp[0]);
                    this.A01 = (ShimmerFrameLayout) view.requireViewById(R.id.clips_grid_shimmer_container);
                    this.A00 = AbstractC166997dE.A0T(view, R.id.empty_grid_state_placeholder_text);
                    BY8.A00(getViewLifecycleOwner(), ((C25831Bbm) this.A0D.getValue()).A02, DRR.A00(this, 2), 13);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A07;
        if (str == null) {
            C14360o3.A0F("analyticsModule");
            throw C00O.createAndThrow();
        }
        return str;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    public C26837Bsz() {
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C29888DGc.A00(C29888DGc.A00(this, 5), 6));
        C0YZ A1D = AbstractC25225BEi.A1D(C25831Bbm.class);
        this.A0D = AbstractC25225BEi.A0a(C29888DGc.A00(A00, 7), new D8J(7, A00, this), new D8J(6, null, A00), A1D);
        this.A0B = AbstractC09440dt.A01(C29888DGc.A00(this, 4));
        this.A0C = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC153536vO
    public final boolean D5U(MotionEvent motionEvent, View view, C120985dq c120985dq, int i) {
        AbstractC167027dH.A12(c120985dq, view, motionEvent);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            AnonymousClass308 anonymousClass308 = this.A03;
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
        int A02 = C0f9.A02(-1314249190);
        super.onCreate(bundle);
        this.A09 = AbstractC153636vY.A01(requireArguments(), "media_id");
        this.A08 = AbstractC153636vY.A01(requireArguments(), "grid_key");
        this.A02 = (ClipsViewerSource) AbstractC153636vY.A00(requireArguments(), ClipsViewerSource.class, AbstractC111324zv.A00(805));
        String string = requireArguments().getString(AbstractC111324zv.A00(AbstractC62862SUj.MAX_FACTORIAL));
        if (string == null) {
            string = "pivot_page_default_clips_grid_fragment";
        }
        this.A07 = string;
        this.A0A = requireArguments().getBoolean("should_show_followed_users_profile_pictures", false);
        this.A05 = C57112jm.A00();
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A0C;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C57112jm c57112jm = this.A05;
        if (c57112jm == null) {
            str = "viewpointManager";
        } else {
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            String str2 = this.A09;
            if (str2 == null) {
                str = "mediaId";
            } else {
                this.A04 = new C153766vl(requireContext, null, this, new C153746vj(A0r2, c57112jm, this, str2), this, A0r, null, new C153736vi(0.5625f, false, false), null, null, null, false, this.A0A);
                C62832tM c62832tM = (C62832tM) this.A0B.getValue();
                String str3 = this.A08;
                if (str3 == null) {
                    str = "gridKey";
                } else {
                    c62832tM.A02(str3);
                    this.A06 = C1M3.A00();
                    FragmentActivity requireActivity = requireActivity();
                    AbstractC10360h2 parentFragmentManager = getParentFragmentManager();
                    UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                    C1M1 c1m1 = this.A06;
                    if (c1m1 == null) {
                        str = "pivotPageSessionProvider";
                    } else {
                        C153766vl c153766vl = this.A04;
                        if (c153766vl == null) {
                            str = "clipsGridAdapter";
                        } else {
                            AnonymousClass308 anonymousClass308 = new AnonymousClass308(requireActivity, this, parentFragmentManager, A0r3, null, this, c153766vl, c1m1, true, true, false);
                            anonymousClass308.A0B = this;
                            this.A03 = anonymousClass308;
                            registerLifecycleListener(anonymousClass308);
                            C0f9.A09(-516201960, A02);
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(304171192);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_pivot_page_grid_fragment, viewGroup, false);
        C0f9.A09(426404652, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-146182877);
        super.onDestroy();
        C62832tM c62832tM = (C62832tM) this.A0B.getValue();
        String str = this.A08;
        if (str == null) {
            C14360o3.A0F("gridKey");
            throw C00O.createAndThrow();
        }
        c62832tM.A07(str);
        C0f9.A09(1469383077, A02);
    }
}
