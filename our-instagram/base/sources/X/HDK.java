package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableListView;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* loaded from: classes7.dex */
public final class HDK extends C38K implements C1M1, InterfaceC62602sz, InterfaceC60442pS, InterfaceC62612t0, AbsListView.OnScrollListener, InterfaceC60122ou, C38N, InterfaceC153086uc {
    public static final String __redex_internal_original_name = "SaveCollectionPivotsFragment";
    public UserSession A00;
    public C154796xU A01;
    public C155936zN A02;
    public HEJ A03;
    public SavedCollection A04;
    public C3CO A05;
    public AnonymousClass308 A06;
    public EmptyStateView A07;
    public String A08;
    public final C61372qz A09 = new C61372qz();

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        return true;
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        A02(this, false);
    }

    @Override // X.C38N
    public final void DJj(View view, C38321qM c38321qM, int i) {
        String str;
        UserSession userSession = this.A00;
        SavedCollection savedCollection = this.A04;
        AbstractC167017dG.A1P(userSession, savedCollection);
        C14360o3.A0B(c38321qM, 3);
        AbstractC41756IeX.A02(this, userSession, c38321qM, savedCollection, AbstractC111324zv.A00(224), i / 3, i % 3);
        C140966Yy A0r = AbstractC25225BEi.A0r(requireActivity(), this.A00);
        IgFragmentFactoryImpl.A00();
        String id = c38321qM.getId();
        id.getClass();
        C35028Fc1 c35028Fc1 = new C35028Fc1();
        c35028Fc1.A0B = id;
        c35028Fc1.A0O = true;
        c35028Fc1.A0E = "feed_contextual_collection_pivots";
        A0r.A0E(c35028Fc1.A02());
        if (c38321qM.Cff()) {
            str = "video_thumbnail";
        } else {
            str = "photo_thumbnail";
        }
        A0r.A0B = str;
        A0r.A04();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "feed_collection_pivots";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    public static void A01(HDK hdk) {
        RefreshableListView refreshableListView;
        boolean z;
        EmptyStateView emptyStateView = hdk.A07;
        if (emptyStateView != null) {
            ListView A0W = hdk.A0W();
            if (AbstractC37303Gc4.A1a(hdk.A01)) {
                emptyStateView.A0L();
                if (A0W != null) {
                    refreshableListView = (RefreshableListView) A0W;
                    z = true;
                } else {
                    return;
                }
            } else {
                if (AbstractC37303Gc4.A1b(hdk.A01)) {
                    emptyStateView.A0J();
                } else {
                    emptyStateView.A0P(EnumC153216up.A02);
                    emptyStateView.A0I();
                }
                if (A0W == null) {
                    return;
                }
                refreshableListView = (RefreshableListView) A0W;
                z = false;
            }
            refreshableListView.setIsLoading(z);
        }
    }

    public static void A02(HDK hdk, boolean z) {
        String str;
        C38290GsZ c38290GsZ = new C38290GsZ(8, hdk, z);
        C154796xU c154796xU = hdk.A01;
        if (z) {
            str = null;
        } else {
            str = c154796xU.A03.A07;
        }
        String A06 = AbstractC13670mt.A06("collections/%s/related_media/", hdk.A04.A0F);
        C25621Ms A0N = AbstractC31173DnH.A0N(hdk.A00);
        A0N.A0B(A06);
        A0N.A0S(C33136Ejf.class, FXI.class);
        AbstractC2044893h.A06(A0N, str);
        c154796xU.A03(A0N.A0N(), c38290GsZ);
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return this.A00;
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        if (this.A01.A06()) {
            A02(this, false);
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        boolean z = false;
        if (this.A03.A00.A02() == 0) {
            z = true;
        }
        return !z;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        return this.A01.A05();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        return AbstractC37303Gc4.A1b(this.A01);
    }

    @Override // X.C38N
    public final boolean DJk(MotionEvent motionEvent, View view, InterfaceC38411qV interfaceC38411qV, int i) {
        AnonymousClass308 anonymousClass308 = this.A06;
        if (anonymousClass308 != null) {
            return anonymousClass308.DuC(motionEvent, view, interfaceC38411qV, i);
        }
        return false;
    }

    @Override // X.InterfaceC153086uc
    public final void DNW(C38321qM c38321qM, int i, int i2) {
        Long l;
        UserSession userSession = this.A00;
        SavedCollection savedCollection = this.A04;
        C14360o3.A0B(userSession, 1);
        InterfaceC02590Ai A09 = AbstractC37302Gc3.A09(this, userSession);
        User A2E = c38321qM.A2E(userSession);
        if (A09.isSampled()) {
            A09.A8R(c38321qM.BRp().A00(), "m_t");
            AbstractC37302Gc3.A0x(A09, c38321qM);
            A09.AAP("algorithm", c38321qM.A0C.getAlgorithm());
            AbstractC37301Gc2.A0x(A09, i, i2);
            Integer Bdm = c38321qM.A0C.Bdm();
            if (Bdm != null) {
                l = AbstractC25229BEm.A0n(Bdm);
            } else {
                l = null;
            }
            A09.A9K("play_count", l);
            if (savedCollection != null) {
                A09.AAP("collection_id", savedCollection.A0F);
                A09.AAP("collection_name", savedCollection.A0G);
            }
            if (A2E != null) {
                A09.A9K("a_pk", AbstractC25231BEo.A0k(A2E));
            }
            AbstractC25234BEr.A11(A09, "device_aspect_ratio_category", AbstractC37301Gc2.A0g(A09));
            A09.Cht();
        }
    }

    @Override // X.C1M1
    public final String getSessionId() {
        return this.A08;
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        return AbstractC37303Gc4.A1a(this.A01);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.EkS(AbstractC167007dF.A1O(getParentFragmentManager().A0L()));
        interfaceC56362iU.setTitle(AbstractC166997dE.A0r(AbstractC166997dE.A0N(this), this.A04.A0G, 2131972715));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        AbstractC10360h2 parentFragmentManager;
        int A02 = C0f9.A02(-1788645992);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = AbstractC31176DnK.A0S(this);
        Parcelable parcelable = requireArguments.getParcelable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION");
        parcelable.getClass();
        SavedCollection savedCollection = (SavedCollection) parcelable;
        this.A04 = savedCollection;
        savedCollection.A03(this.A00);
        this.A08 = AbstractC31173DnH.A0j(requireArguments, AbstractC111324zv.A00(335));
        C65953Twy c65953Twy = new C65953Twy(this.A00, this, C05F.A01, 6);
        C61372qz c61372qz = this.A09;
        c61372qz.A01(c65953Twy);
        Context requireContext = requireContext();
        C155376yQ c155376yQ = new C155376yQ(this.A00);
        HEJ hej = new HEJ(requireContext, this, this.A00, c155376yQ, this, AnonymousClass341.A0R, C38U.A00, this);
        this.A03 = hej;
        A0U(hej);
        this.A02 = new C155936zN(requireContext(), this, this.A00);
        C3CO c3co = new C3CO(this.A00, this.A03);
        this.A05 = c3co;
        c3co.A01();
        FragmentActivity requireActivity = requireActivity();
        Fragment fragment = this.mParentFragment;
        if (fragment == null) {
            parentFragmentManager = getParentFragmentManager();
        } else {
            parentFragmentManager = fragment.getParentFragmentManager();
        }
        this.A06 = new AnonymousClass308(requireActivity, this, parentFragmentManager, this.A00, this, this.A03, this, false);
        C60462pV c60462pV = new C60462pV();
        c60462pV.A0E(this.A05);
        c60462pV.A0E(new C675132q(this, this.A00, this));
        c60462pV.A0E(this.A06);
        A0a(c60462pV);
        this.A01 = AbstractC37302Gc3.A0L(requireContext(), this, this.A00);
        A02(this, true);
        c61372qz.A01(new C153096ud(this, this, this.A03, AbstractC166987dD.A1H()));
        C0f9.A09(1825592753, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1504550898);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_feed);
        C0f9.A09(-1335011803, A02);
        return A0A;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A03 = C0f9.A03(-486838614);
        this.A09.onScroll(absListView, i, i2, i3);
        C0f9.A0A(-1463607222, A03);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A03 = C0f9.A03(-708527343);
        this.A09.onScrollStateChanged(absListView, i);
        C0f9.A0A(-1301009696, A03);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AbstractC37300Gc1.A02(this).setOnScrollListener(this);
        EmptyStateView A0P = AbstractC37304Gc5.A0P(this);
        A0P.A0R(EnumC153216up.A02, R.drawable.empty_state_save);
        EnumC153216up enumC153216up = EnumC153216up.A04;
        A0P.A0R(enumC153216up, R.drawable.loadmore_icon_refresh_compound);
        A0P.A0N(new ViewOnClickListenerC42033Ik2(this, 5), enumC153216up);
        A0P.A0I();
        this.A07 = A0P;
        A01(this);
    }
}
