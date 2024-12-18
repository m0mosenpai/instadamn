package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HCZ extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC37211GaM, InterfaceC60122ou, InterfaceC153516vM, InterfaceC153526vN {
    public static final String __redex_internal_original_name = "SavedClipsFragment";
    public int A00;
    public ShimmerFrameLayout A01;
    public C153806vp A02;
    public C3FR A03;
    public C153766vl A04;
    public C38968HDw A05;
    public C57112jm A06;
    public AnonymousClass308 A07;
    public EnumC39551HdN A08;
    public SavedCollection A09;
    public C62832tM A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public final InterfaceC09390do A0E = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC153516vM
    public final List AoI() {
        return AbstractC166987dD.A1J(new C37856GlA(this, 2));
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
    public final /* synthetic */ void D55(User user) {
    }

    @Override // X.InterfaceC153536vO
    public final void D5T(C120985dq c120985dq, int i) {
        C154026wB c154026wB;
        EM6 em6;
        C14360o3.A0B(c120985dq, 0);
        C153806vp c153806vp = this.A02;
        String str = "selectStateProvider";
        if (c153806vp != null) {
            if (c153806vp.A01) {
                C153766vl c153766vl = this.A04;
                if (c153766vl == null) {
                    str = "clipsGridAdapter";
                } else {
                    InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) AbstractC001800i.A0O(AbstractC001800i.A0a(C153766vl.A00(c153766vl)), i);
                    if (interfaceC66482zP != null) {
                        C153806vp c153806vp2 = this.A02;
                        if (c153806vp2 != null) {
                            if ((interfaceC66482zP instanceof C154026wB) && (c154026wB = (C154026wB) interfaceC66482zP) != null) {
                                C120985dq c120985dq2 = c154026wB.A03;
                                c153806vp2.A02(c154026wB, c120985dq2, c120985dq2.getId());
                                Fragment fragment = this.mParentFragment;
                                if ((fragment instanceof EM6) && (em6 = (EM6) fragment) != null) {
                                    em6.A0B();
                                }
                                FragmentActivity activity = getActivity();
                                if ((activity instanceof BaseFragmentActivity) && activity != null) {
                                    AbstractC31175DnJ.A0i(activity);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                C38321qM c38321qM = c120985dq.A02;
                if (c38321qM != null) {
                    FragmentActivity requireActivity = requireActivity();
                    UserSession A0r = AbstractC166987dD.A0r(this.A0E);
                    ClipsViewerSource clipsViewerSource = ClipsViewerSource.A0e;
                    String str2 = this.A0B;
                    if (str2 == null) {
                        str = "collectionId";
                    } else {
                        String str3 = this.A0C;
                        if (str3 == null) {
                            str = "gridKey";
                        } else {
                            AbstractC41751IeQ.A00(requireActivity, new C116875Qr(clipsViewerSource, A0r), A0r, c38321qM, this, null, str2, str3, null, i, false, false, false, false);
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC153536vO
    public final boolean D5U(MotionEvent motionEvent, View view, C120985dq c120985dq, int i) {
        C38321qM c38321qM;
        String str;
        C14360o3.A0B(c120985dq, 0);
        AbstractC167017dG.A1P(view, motionEvent);
        C153806vp c153806vp = this.A02;
        if (c153806vp == null) {
            str = "selectStateProvider";
        } else {
            if (c153806vp.A01) {
                return false;
            }
            EnumC39551HdN enumC39551HdN = this.A08;
            if (enumC39551HdN == null) {
                str = "savedFeedMode";
            } else {
                if (enumC39551HdN == EnumC39551HdN.A08 || (c38321qM = c120985dq.A02) == null) {
                    return false;
                }
                AnonymousClass308 anonymousClass308 = this.A07;
                if (anonymousClass308 == null) {
                    str = "peekMediaController";
                } else {
                    return anonymousClass308.DuC(motionEvent, view, c38321qM, i);
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC153576vS
    public final void D5V(View view) {
    }

    @Override // X.InterfaceC153586vT
    public final /* synthetic */ void Dzr() {
    }

    @Override // X.InterfaceC37211GaM
    public final void EFj(List list) {
        String str;
        C153766vl c153766vl = this.A04;
        if (c153766vl == null) {
            str = "clipsGridAdapter";
        } else {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = c153766vl.A01().iterator();
            while (it.hasNext()) {
                C120985dq c120985dq = ((C154026wB) it.next()).A03;
                if (!AbstractC001800i.A0u(list, c120985dq.A02)) {
                    A1E.add(c120985dq);
                }
            }
            C62832tM c62832tM = this.A0A;
            if (c62832tM == null) {
                str = "gridItemStore";
            } else {
                String str2 = this.A0C;
                if (str2 == null) {
                    str = "gridKey";
                } else {
                    c62832tM.A08(str2, A1E, true, false);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String str;
        C14360o3.A0B(interfaceC56362iU, 0);
        EnumC39551HdN enumC39551HdN = this.A08;
        if (enumC39551HdN == null) {
            str = "savedFeedMode";
        } else if (enumC39551HdN == EnumC39551HdN.A05) {
            interfaceC56362iU.EkS(true);
            Resources A0N = AbstractC166997dE.A0N(this);
            C153806vp c153806vp = this.A02;
            str = "selectStateProvider";
            if (c153806vp != null) {
                interfaceC56362iU.setTitle(A0N.getQuantityString(R.plurals.save_home_collection_feed_x_selected, c153806vp.A02.size(), AbstractC25228BEl.A1Y(c153806vp.A02.size())));
                C3LO A0B = AbstractC31171DnF.A0B();
                A0B.A0K = getString(2131968535);
                AbstractC31176DnK.A1B(new ViewOnClickListenerC35678FpD(this, 18), A0B, interfaceC56362iU);
                return;
            }
        } else {
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "feed_saved_collections_clips";
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
        C3FR c3fr;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        FastScrollingGridLayoutManager fastScrollingGridLayoutManager = new FastScrollingGridLayoutManager(requireContext, 3);
        C153766vl c153766vl = this.A04;
        if (c153766vl != null) {
            ((GridLayoutManager) fastScrollingGridLayoutManager).A01 = (AbstractC154146wP) c153766vl.A0P.getValue();
            AbstractC167007dF.A0x(view.findViewById(R.id.empty_state));
            this.A01 = (ShimmerFrameLayout) view.requireViewById(R.id.clips_tab_grid_shimmer_container);
            View requireViewById = view.requireViewById(R.id.clips_tab_grid_recyclerview);
            RecyclerView recyclerView = (RecyclerView) requireViewById;
            C153766vl c153766vl2 = this.A04;
            if (c153766vl2 != null) {
                recyclerView.setAdapter(c153766vl2.A0I);
                recyclerView.setLayoutManager(fastScrollingGridLayoutManager);
                recyclerView.A10(AbstractC154166wR.A00(requireContext, 0, true));
                C38968HDw c38968HDw = this.A05;
                String str = "clipsSavedTabFetcher";
                if (c38968HDw != null) {
                    recyclerView.A14(new C153156uj(recyclerView.A0D, c38968HDw, C153146ui.A06, true, false));
                    C14360o3.A07(requireViewById);
                    C3FQ A00 = C3FN.A00(recyclerView);
                    if (A00 instanceof C3FR) {
                        c3fr = (C3FR) A00;
                    } else {
                        c3fr = null;
                    }
                    this.A03 = c3fr;
                    if (c3fr != null) {
                        c3fr.Ehc(new J47(this));
                    }
                    C38968HDw c38968HDw2 = this.A05;
                    if (c38968HDw2 != null) {
                        c38968HDw2.A03(new C37781Gjw(this, 3));
                        C153766vl c153766vl3 = this.A04;
                        if (c153766vl3 != null) {
                            if (C153766vl.A00(c153766vl3).size() == 0) {
                                C153766vl c153766vl4 = this.A04;
                                if (c153766vl4 != null) {
                                    c153766vl4.A04(9);
                                    ShimmerFrameLayout shimmerFrameLayout = this.A01;
                                    if (shimmerFrameLayout != null) {
                                        shimmerFrameLayout.A02();
                                    }
                                }
                            } else {
                                ShimmerFrameLayout shimmerFrameLayout2 = this.A01;
                                if (shimmerFrameLayout2 != null) {
                                    shimmerFrameLayout2.A05();
                                }
                            }
                            C57112jm c57112jm = this.A06;
                            if (c57112jm == null) {
                                str = "viewpointManager";
                            } else {
                                AbstractC37301Gc2.A0v(recyclerView, c57112jm, this);
                                if (!C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(this.A0E), 36326038820632144L)) {
                                    C38968HDw c38968HDw3 = this.A05;
                                    if (c38968HDw3 != null) {
                                        c38968HDw3.A04(null, null, C16930sl.A00, false);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F("clipsGridAdapter");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37211GaM
    public final void ASr() {
        C153806vp c153806vp = this.A02;
        if (c153806vp == null) {
            C14360o3.A0F("selectStateProvider");
            throw C00O.createAndThrow();
        }
        c153806vp.A03(true);
    }

    @Override // X.InterfaceC37211GaM
    public final void ATl() {
        C153806vp c153806vp = this.A02;
        if (c153806vp == null) {
            C14360o3.A0F("selectStateProvider");
            throw C00O.createAndThrow();
        }
        c153806vp.A03(false);
    }

    @Override // X.InterfaceC153516vM
    public final AbstractC153666vb AoO() {
        C38968HDw c38968HDw = this.A05;
        if (c38968HDw == null) {
            C14360o3.A0F("clipsSavedTabFetcher");
            throw C00O.createAndThrow();
        }
        return c38968HDw;
    }

    @Override // X.InterfaceC153516vM
    public final String BAK() {
        String str = this.A0C;
        if (str == null) {
            C14360o3.A0F("gridKey");
            throw C00O.createAndThrow();
        }
        return str;
    }

    @Override // X.InterfaceC37211GaM
    public final List Bse() {
        C153806vp c153806vp = this.A02;
        if (c153806vp == null) {
            C14360o3.A0F("selectStateProvider");
            throw C00O.createAndThrow();
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator A0k = AbstractC167007dF.A0k(c153806vp.A02);
        while (A0k.hasNext()) {
            C38321qM c38321qM = ((C154026wB) AbstractC166997dE.A0l(A0k)).A03.A02;
            if (c38321qM != null) {
                A1E.add(c38321qM);
            }
        }
        return A1E;
    }

    @Override // X.InterfaceC37211GaM
    public final boolean CL7() {
        C153766vl c153766vl = this.A04;
        if (c153766vl == null) {
            C14360o3.A0F("clipsGridAdapter");
            throw C00O.createAndThrow();
        }
        return AbstractC166987dD.A1b(C153766vl.A00(c153766vl));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0E);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [X.6vb, X.HDw] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        EnumC39551HdN enumC39551HdN;
        int A02 = C0f9.A02(-979839251);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        SavedCollection savedCollection = (SavedCollection) requireArguments.getParcelable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION");
        if (savedCollection == null) {
            EnumC33416Epn enumC33416Epn = EnumC33416Epn.A05;
            savedCollection = new SavedCollection(enumC33416Epn, enumC33416Epn.A01, "");
        }
        this.A09 = savedCollection;
        String str = "collection";
        this.A0B = savedCollection.A0F;
        requireArguments.getString("prior_module");
        this.A0C = AbstractC166997dE.A0n();
        Serializable serializable = requireArguments.getSerializable(AbstractC111324zv.A00(687));
        if (!(serializable instanceof EnumC39551HdN) || (enumC39551HdN = (EnumC39551HdN) serializable) == null) {
            enumC39551HdN = EnumC39551HdN.A06;
        }
        this.A08 = enumC39551HdN;
        this.A00 = requireArguments.getInt(AbstractC111324zv.A00(1485));
        C08790ch A00 = AbstractC018607g.A00(this);
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A0E;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        SavedCollection savedCollection2 = this.A09;
        if (savedCollection2 != null) {
            C14360o3.A0B(A0r, 2);
            this.A05 = new AbstractC153666vb(requireContext, A00, new C42176ImO(savedCollection2.A0F), this, A0r);
            C57112jm A002 = C57112jm.A00();
            this.A06 = A002;
            C153766vl c153766vl = new C153766vl(requireContext(), null, this, new C153746vj(AbstractC166987dD.A0r(interfaceC09390do), A002, this, null), this, AbstractC166987dD.A0r(interfaceC09390do), null, new C153736vi(0.5625f, false, false), null, null, null, false, false);
            this.A04 = c153766vl;
            this.A02 = c153766vl.A0G;
            EnumC39551HdN enumC39551HdN2 = this.A08;
            if (enumC39551HdN2 == null) {
                str = "savedFeedMode";
            } else {
                if (enumC39551HdN2 == EnumC39551HdN.A05) {
                    ASr();
                }
                C60462pV c60462pV = new C60462pV();
                c60462pV.A0E(new C154066wG(EnumC125615m7.A03, AbstractC166987dD.A0r(interfaceC09390do), this, "feed_saved_collections_clips"));
                c60462pV.A0E(new C3CO(AbstractC166987dD.A0r(interfaceC09390do), new C38287GsW(this, 11), false, false));
                registerLifecycleListenerSet(c60462pV);
                this.A0A = AbstractC62822tL.A00(AbstractC166987dD.A0r(interfaceC09390do));
                FragmentActivity requireActivity = requireActivity();
                AbstractC10360h2 parentFragmentManager = getParentFragmentManager();
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                C153766vl c153766vl2 = this.A04;
                if (c153766vl2 == null) {
                    str = "clipsGridAdapter";
                } else {
                    this.A07 = new AnonymousClass308(requireActivity, this, parentFragmentManager, A0r2, null, this, c153766vl2, null, false, true, false);
                    C0f9.A09(323705995, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1386322488);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_save_collection_clips_tab, viewGroup, false);
        C0f9.A09(89558739, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1432703370);
        super.onDestroyView();
        this.A0D = false;
        C3FR c3fr = this.A03;
        if (c3fr != null) {
            c3fr.AI0();
        }
        C153766vl c153766vl = this.A04;
        if (c153766vl == null) {
            C14360o3.A0F("clipsGridAdapter");
            throw C00O.createAndThrow();
        }
        c153766vl.A02();
        this.A01 = null;
        this.A03 = null;
        C0f9.A09(-689261411, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1815923985);
        super.onResume();
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(this.A0E), 36326038820632144L) && !this.A0D) {
            C38968HDw c38968HDw = this.A05;
            if (c38968HDw == null) {
                C14360o3.A0F("clipsSavedTabFetcher");
                throw C00O.createAndThrow();
            }
            AbstractC37302Gc3.A1N(c38968HDw);
            this.A0D = true;
        }
        C0f9.A09(-1253298950, A02);
    }
}
