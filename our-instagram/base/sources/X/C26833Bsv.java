package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* renamed from: X.Bsv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26833Bsv extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60122ou, InterfaceC101554hQ, InterfaceC153526vN {
    public static final String __redex_internal_original_name = "RemixPivotPageFragment";
    public View A00;
    public ViewGroup A01;
    public ComposeView A02;
    public C211729Zg A03;
    public AppBarLayout A04;
    public C26912BuF A05;
    public C38321qM A06;
    public C38321qM A07;
    public C25901Bd4 A08;
    public View A09;
    public AnonymousClass308 A0A;
    public C1M1 A0B;
    public C153766vl A0C;
    public final String A0D = AbstractC167017dG.A0j();
    public final InterfaceC09390do A0E = AbstractC09440dt.A01(C29888DGc.A00(this, 17));
    public final InterfaceC09390do A0F = AbstractC25225BEi.A0a(C29888DGc.A00(this, 21), C29888DGc.A00(this, 20), new D8J(12, null, this), AbstractC25225BEi.A1D(C25837Bbs.class));
    public final InterfaceC09390do A0G = AbstractC60492pY.A02(this);

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
        AbstractC37834Gko.A03(requireActivity(), this, AbstractC166987dD.A0r(this.A0G), user.getId(), "remix_pivot_page", null, ModalActivity.A08);
    }

    @Override // X.InterfaceC153536vO
    public final void D5T(C120985dq c120985dq, int i) {
        C14360o3.A0B(c120985dq, 0);
        InterfaceC09390do interfaceC09390do = this.A0G;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            String id = c120985dq.getId();
            C1M1 c1m1 = this.A0B;
            if (c1m1 == null) {
                C14360o3.A0F("pivotPageSessionProvider");
                throw C00O.createAndThrow();
            }
            AbstractC37670Gi3.A0Y(this, A0r, c38321qM, c1m1, id, i);
            C38321qM c38321qM2 = c120985dq.A02;
            if (c38321qM2 != null) {
                if (c38321qM2.A5c()) {
                    IgFragmentFactoryImpl.A00();
                    C38321qM c38321qM3 = c120985dq.A02;
                    if (c38321qM3 != null) {
                        String A38 = c38321qM3.A38();
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
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A28, AbstractC166987dD.A0r(interfaceC09390do));
                c116875Qr.A1D = c120985dq.getId();
                c116875Qr.A1G = this.A0D;
                c116875Qr.A1d = false;
                AbstractC86593tX.A0X(requireActivity(), c116875Qr.A00(), AbstractC166987dD.A0r(interfaceC09390do));
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
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
    public final /* synthetic */ void Dzr() {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        ViewOnClickListenerC28666ClE.A02(interfaceC56362iU, this, 54);
        Context requireContext = requireContext();
        this.A0G.getValue();
        interfaceC56362iU.setTitle(AbstractC166997dE.A0p(requireContext, 2131973321));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_remix_page";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = (ViewGroup) view.requireViewById(R.id.use_in_camera_button_scene_root);
        this.A04 = (AppBarLayout) view.requireViewById(R.id.app_bar_layout);
        View requireViewById = view.requireViewById(R.id.header);
        this.A09 = requireViewById;
        if (requireViewById == null) {
            str = "header";
        } else {
            requireViewById.setVisibility(8);
            View requireViewById2 = view.requireViewById(R.id.ghost_header);
            this.A00 = requireViewById2;
            if (requireViewById2 == null) {
                str = "ghostHeader";
            } else {
                requireViewById2.setVisibility(0);
                view.requireViewById(R.id.use_in_camera_button_scene_root).setVisibility(8);
                ComposeView composeView = (ComposeView) view.requireViewById(R.id.reels_pivot_header_compose_view);
                this.A02 = composeView;
                if (composeView != null) {
                    composeView.setViewCompositionStrategy(C25320BIp.A00);
                }
                ComposeView composeView2 = this.A02;
                if (composeView2 != null) {
                    composeView2.setContent(C5UA.A03(new C30506Dbp(this, 25), -1457628273));
                }
                BY8.A00(getViewLifecycleOwner(), ((C25837Bbs) this.A0F.getValue()).A00, DRR.A00(this, 4), 15);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0G);
    }

    @Override // X.InterfaceC153536vO
    public final boolean D5U(MotionEvent motionEvent, View view, C120985dq c120985dq, int i) {
        AbstractC167027dH.A12(c120985dq, view, motionEvent);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            AnonymousClass308 anonymousClass308 = this.A0A;
            if (anonymousClass308 == null) {
                C14360o3.A0F("peekMediaController");
                throw C00O.createAndThrow();
            }
            return anonymousClass308.DuC(motionEvent, view, c38321qM, i);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [X.BuF, X.JQS, X.6xZ] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(965018071);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("media_id");
        if (string != null) {
            String string2 = requireArguments.getString("media_tap_token");
            if (string2 != null) {
                int i = requireArguments.getInt(AbstractC111324zv.A00(1325));
                String string3 = requireArguments.getString("media_id");
                if (string3 != null) {
                    this.A03 = new C211729Zg(string, string2, string3, i, 1);
                    InterfaceC09390do interfaceC09390do = this.A0G;
                    C1DX A00 = C1DW.A00(AbstractC166987dD.A0r(interfaceC09390do));
                    C211729Zg c211729Zg = this.A03;
                    String str = "arguments";
                    if (c211729Zg != null) {
                        this.A07 = A00.A02(c211729Zg.A04);
                        C57112jm A002 = C57112jm.A00();
                        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                        C14360o3.A0B(A0r, 1);
                        ?? c154846xZ = new C154846xZ(A0r, "remix_pivot_page", 31800132);
                        this.A05 = c154846xZ;
                        c154846xZ.A0Q(requireContext(), C55772hI.A00(AbstractC166987dD.A0o(interfaceC09390do)), this);
                        C26912BuF c26912BuF = this.A05;
                        String str2 = "remixPivotPagePerfLogger";
                        if (c26912BuF != null) {
                            C211729Zg c211729Zg2 = this.A03;
                            if (c211729Zg2 != null) {
                                c26912BuF.A0T(c211729Zg2.A02);
                                Context requireContext = requireContext();
                                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                                C26912BuF c26912BuF2 = this.A05;
                                if (c26912BuF2 != null) {
                                    UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                                    C211729Zg c211729Zg3 = this.A03;
                                    if (c211729Zg3 != null) {
                                        this.A0C = new C153766vl(requireContext, c26912BuF2, this, new C153746vj(A0r3, A002, this, c211729Zg3.A02), this, A0r2, null, new C153736vi(0.5625f, false, false), null, null, null, false, C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36328130469772496L));
                                        ((C62832tM) this.A0E.getValue()).A02(this.A0D);
                                        C60462pV c60462pV = new C60462pV();
                                        InterfaceC09390do interfaceC09390do2 = this.A0F;
                                        C25837Bbs c25837Bbs = (C25837Bbs) interfaceC09390do2.getValue();
                                        C153766vl c153766vl = this.A0C;
                                        str = "clipsGridAdapter";
                                        if (c153766vl != null) {
                                            C25901Bd4 c25901Bd4 = new C25901Bd4(this, A002, c153766vl, c25837Bbs);
                                            c60462pV.A0E(c25901Bd4);
                                            this.A08 = c25901Bd4;
                                            this.A0B = C1M3.A00();
                                            FragmentActivity requireActivity = requireActivity();
                                            AbstractC10360h2 parentFragmentManager = getParentFragmentManager();
                                            UserSession A0r4 = AbstractC166987dD.A0r(interfaceC09390do);
                                            C1M1 c1m1 = this.A0B;
                                            if (c1m1 == null) {
                                                str2 = "pivotPageSessionProvider";
                                            } else {
                                                C153766vl c153766vl2 = this.A0C;
                                                if (c153766vl2 != null) {
                                                    AnonymousClass308 anonymousClass308 = new AnonymousClass308(requireActivity, this, parentFragmentManager, A0r4, null, this, c153766vl2, c1m1, true, true, false);
                                                    anonymousClass308.A0B = this;
                                                    c60462pV.A0E(anonymousClass308);
                                                    this.A0A = anonymousClass308;
                                                    registerLifecycleListenerSet(c60462pV);
                                                    ((C25837Bbs) interfaceC09390do2.getValue()).A03.A01.A04(null, null, C16930sl.A00, false);
                                                    C26912BuF c26912BuF3 = this.A05;
                                                    if (c26912BuF3 != null) {
                                                        ((MTJ) c26912BuF3).A00.A08(null);
                                                        C0f9.A09(196341032, A02);
                                                        return;
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
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                throw AbstractC166987dD.A12("tapped media ID cannot be null");
            }
            throw AbstractC166987dD.A12("Media tap token cannot be null");
        }
        throw AbstractC166987dD.A12("Media ID cannot be null");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1219013444);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_pivot_page_fragment, viewGroup, false);
        C0f9.A09(-454173503, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(788454014);
        super.onDestroy();
        C26912BuF c26912BuF = this.A05;
        if (c26912BuF == null) {
            C14360o3.A0F("remixPivotPagePerfLogger");
            throw C00O.createAndThrow();
        }
        c26912BuF.A0K("has_user_interacted", true);
        c26912BuF.A0J(MSV.A00(53), "exit_pivot_page");
        ((C62832tM) this.A0E.getValue()).A07(this.A0D);
        C0f9.A09(-1871856834, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-587588544);
        super.onDestroyView();
        this.A02 = null;
        C0f9.A09(-1100887909, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1659821969);
        super.onResume();
        if (this.A07 != null) {
            UserSession A0r = AbstractC166987dD.A0r(this.A0G);
            C38321qM c38321qM = this.A07;
            if (c38321qM != null) {
                C211729Zg c211729Zg = this.A03;
                if (c211729Zg == null) {
                    C14360o3.A0F("arguments");
                    throw C00O.createAndThrow();
                }
                String str = c211729Zg.A03;
                int i = c211729Zg.A01;
                String str2 = c211729Zg.A02;
                AbstractC167007dF.A1F(A0r, 1, str);
                C14360o3.A0B(str2, 6);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, A0r), "instagram_organic_clips_remix_page_impression");
                AbstractC25225BEi.A1O(A0f, "clips_remix_page");
                String A38 = c38321qM.A38();
                if (A38 != null) {
                    AbstractC25236BEt.A0r(A0f, A38);
                    AbstractC25225BEi.A1M(null, A0f);
                    A0f.A9K("container_id", AbstractC166997dE.A0j(str2));
                    User A2E = c38321qM.A2E(A0r);
                    if (A2E != null) {
                        A0f.AAK(C4SX.A00(A2E.getId()), "media_author_id");
                        AbstractC25230BEn.A1C(A0f, i);
                        A0f.AAP("media_tap_token", str);
                        AbstractC25234BEr.A10(A0f, c38321qM);
                        AbstractC167017dG.A1C(A0f);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A09(-509288311, A02);
                throw A0g;
            }
        }
        C0f9.A09(1438415607, A02);
    }
}
