package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.profile.intf.AutoLaunchReelParams;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.N6w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52167N6w extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC62612t0, InterfaceC152836uD, InterfaceC57970PnG {
    public static final String __redex_internal_original_name = "HighlightsInGridTabFragment";
    public RecyclerView A00;
    public UserDetailTabController A01;
    public P2Y A02;
    public AutoLaunchReelParams A03;
    public C38E A04;
    public String A06;
    public Boolean A07;
    public final InterfaceC09390do A0D;
    public final ViewGroup A0E;
    public final ReelViewerConfig A0G;
    public final InterfaceC41501vz A08 = C56034Ou6.A00(this, 23);
    public final InterfaceC41501vz A0A = C56034Ou6.A00(this, 25);
    public final InterfaceC41501vz A09 = C56034Ou6.A00(this, 24);
    public final C57112jm A0F = AbstractC37301Gc2.A0E();
    public final List A0B = AbstractC166987dD.A1E();
    public final InterfaceC09390do A0C = AbstractC60492pY.A02(this);
    public String A05 = "highlights_profile";

    @Override // X.InterfaceC152836uD, X.InterfaceC152846uE
    public final String Bi9() {
        return "profile_highlights";
    }

    @Override // X.InterfaceC152836uD
    public final void DcV(UserDetailTabController userDetailTabController) {
        AbstractC70663Fe abstractC70663Fe;
        C14360o3.A0B(userDetailTabController, 0);
        if (this.A01 == null) {
            this.A01 = userDetailTabController;
            ((C50862Mdt) this.A0D.getValue()).A0F();
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                abstractC70663Fe = recyclerView.A0D;
            } else {
                abstractC70663Fe = null;
            }
            C153156uj A00 = AbstractC68565VVs.A00(abstractC70663Fe, this);
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 != null) {
                recyclerView2.A14(A00);
            }
        }
    }

    @Override // X.InterfaceC152836uD
    public final void Drq(boolean z) {
    }

    @Override // X.InterfaceC152836uD
    public final void Drw() {
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
        AbstractC154146wP abstractC154146wP;
        AbstractC70663Fe abstractC70663Fe;
        C66362zD c66362zD;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        this.A00 = AbstractC31172DnG.A0G(view, R.id.highlights_grid_recyclerview);
        C57112jm c57112jm = this.A0F;
        AbstractC37301Gc2.A0v(view, c57112jm, this);
        P91 p91 = new P91(requireContext, this);
        String str = this.A06;
        if (str == null) {
            C14360o3.A0F("viewedProfileUserId");
            throw C00O.createAndThrow();
        }
        this.A02 = new P2Y(requireActivity(), requireContext, this, AbstractC166987dD.A0r(this.A0C), c57112jm, this, p91, str);
        FastScrollingGridLayoutManager fastScrollingGridLayoutManager = new FastScrollingGridLayoutManager(requireContext, 3);
        P2Y p2y = this.A02;
        if (p2y != null) {
            abstractC154146wP = (AbstractC154146wP) p2y.A0F.getValue();
        } else {
            abstractC154146wP = null;
        }
        ((GridLayoutManager) fastScrollingGridLayoutManager).A01 = abstractC154146wP;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(fastScrollingGridLayoutManager);
        }
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            P2Y p2y2 = this.A02;
            if (p2y2 != null) {
                c66362zD = p2y2.A09;
            } else {
                c66362zD = null;
            }
            recyclerView2.setAdapter(c66362zD);
        }
        RecyclerView recyclerView3 = this.A00;
        if (recyclerView3 != null) {
            recyclerView3.A10(AbstractC154166wR.A00(requireContext, 0, true));
        }
        RecyclerView recyclerView4 = this.A00;
        if (recyclerView4 != null) {
            abstractC70663Fe = recyclerView4.A0D;
        } else {
            abstractC70663Fe = null;
        }
        C153156uj A00 = AbstractC68565VVs.A00(abstractC70663Fe, this);
        RecyclerView recyclerView5 = this.A00;
        if (recyclerView5 != null) {
            recyclerView5.A14(A00);
        }
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57165PZj(c07s, this, viewLifecycleOwner, null, 20), C07Y.A00(viewLifecycleOwner));
    }

    public static final void A00(Reel reel, C52167N6w c52167N6w, int i, boolean z) {
        AbstractC25651Mw.A00(AbstractC166987dD.A0r(c52167N6w.A0C)).E4s(new C155106xz(reel, i, z));
    }

    public static final void A01(C52167N6w c52167N6w, String str) {
        P2Y p2y = c52167N6w.A02;
        if (p2y != null) {
            p2y.A0E.removeIf(new C31424DrU(9, new C50361MLn(str, 45)));
            p2y.A02();
        }
        P2Y p2y2 = c52167N6w.A02;
        if (p2y2 != null) {
            p2y2.A09.notifyDataSetChanged();
        }
    }

    public static final void A02(C52167N6w c52167N6w, String str) {
        String str2;
        C08730cb c08730cb = C17060sy.A01;
        InterfaceC09390do interfaceC09390do = c52167N6w.A0C;
        boolean A2M = c08730cb.A01(AbstractC166987dD.A0r(interfaceC09390do)).A2M();
        C1571673v c1571673v = C1571673v.A00;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        EnumC1571773w enumC1571773w = EnumC1571773w.A05;
        String str3 = AbstractC166987dD.A0r(interfaceC09390do).userId;
        if (A2M) {
            str2 = "forced_migration";
        } else {
            str2 = "opt_in";
        }
        c1571673v.A0D(c52167N6w, A0r, enumC1571773w, str, str3, str2, null);
    }

    public final UserSession A03() {
        return AbstractC166987dD.A0r(this.A0C);
    }

    @Override // X.InterfaceC152836uD
    public final Fragment ACb() {
        return this;
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        ((C50862Mdt) this.A0D.getValue()).A0E();
    }

    @Override // X.InterfaceC57970PnG
    public final void AGS() {
        P2Y p2y = this.A02;
        if (p2y != null) {
            Iterator it = p2y.A0E.iterator();
            while (it.hasNext()) {
                ((C56113OvY) it.next()).A03 = false;
            }
        }
        P2Y p2y2 = this.A02;
        if (p2y2 != null) {
            p2y2.A09.notifyDataSetChanged();
        }
    }

    @Override // X.InterfaceC152836uD
    public final ViewGroup Br5() {
        return this.A0E;
    }

    @Override // X.InterfaceC152836uD
    public final void Drv(boolean z) {
        P2Y p2y;
        if (AbstractC166997dE.A1Z(this.A07, true)) {
            ((C50862Mdt) this.A0D.getValue()).A0F();
            p2y = this.A02;
            if (p2y != null) {
                p2y.A04 = true;
            } else {
                return;
            }
        } else {
            p2y = this.A02;
            if (p2y == null) {
                return;
            }
        }
        p2y.A02();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A0C);
    }

    public C52167N6w() {
        C38H c38h = new C38H();
        c38h.A07 = true;
        this.A0G = new ReelViewerConfig(c38h);
        C57244PbS c57244PbS = new C57244PbS(this, 9);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57244PbS(new C57244PbS(this, 6), 7));
        this.A0D = AbstractC25225BEi.A0a(new C57244PbS(A00, 8), c57244PbS, new C57257Pbf(11, null, A00), AbstractC25225BEi.A1D(C50862Mdt.class));
        this.A0E = this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-606054119);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A06 = AbstractC31173DnH.A0k(bundle2, "viewed_user_id");
            this.A07 = AbstractC31174DnI.A0n(bundle2, "has_highlights");
            this.A03 = (AutoLaunchReelParams) bundle2.getParcelable("ARGS_AUTO_LAUNCH_REEL_PARAMS");
            InterfaceC09390do interfaceC09390do = this.A0C;
            String str2 = AbstractC166987dD.A0r(interfaceC09390do).userId;
            String str3 = this.A06;
            if (str3 == null) {
                C14360o3.A0F("viewedProfileUserId");
                throw C00O.createAndThrow();
            }
            if (C14360o3.A0K(str2, str3)) {
                str = "self_highlights_profile";
            } else {
                str = "highlights_profile";
            }
            this.A05 = str;
            C38E c38e = new C38E(this, AbstractC166987dD.A0r(interfaceC09390do), new C38C(this));
            c38e.A0C = AbstractC166997dE.A0n();
            setModuleNameV2(this.A05);
            c38e.A0F = true;
            c38e.A03 = this.A0G;
            c38e.A06 = new C56536P8i(this, 2);
            c38e.A05 = new NS4(1);
            this.A04 = c38e;
            C25671My A00 = AbstractC25651Mw.A00(AbstractC166987dD.A0r(interfaceC09390do));
            A00.A01(this.A0A, C55998OtV.class);
            A00.A01(this.A09, C3DH.class);
            A00.A01(this.A08, C155116y0.class);
            C0f9.A09(-530309044, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(-897704211, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1752037248);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_highlights_in_grid_fragment, viewGroup, false);
        C0f9.A09(-2108486240, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1272428978);
        super.onDestroy();
        this.A0B.clear();
        C25671My A00 = AbstractC25651Mw.A00(AbstractC166987dD.A0r(this.A0C));
        A00.A02(this.A0A, C55998OtV.class);
        A00.A02(this.A09, C3DH.class);
        A00.A02(this.A08, C155116y0.class);
        C0f9.A09(912412231, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1045237055);
        super.onDestroyView();
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.A0a();
        }
        C0f9.A09(-824711970, A02);
    }
}
