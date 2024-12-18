package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* loaded from: classes7.dex */
public final class HCH extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60122ou, InterfaceC43440JHe {
    public static final String __redex_internal_original_name = "SavedAudioListFragment";
    public Gt4 A00;
    public InterfaceC678133v A01;
    public String A02;
    public final C153756vk A04 = new C153756vk(C8JW.A0U, AbstractC167017dG.A0j());
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (this.A02 == null) {
            interfaceC56362iU.EkS(true);
            interfaceC56362iU.Efu(2131953293);
        }
        if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(this.A03, 0), 36328302268792260L)) {
            C3LO A0B = AbstractC31171DnF.A0B();
            A0B.A06 = R.drawable.instagram_arrow_up_right_pano_outline_24;
            A0B.A05 = 2131975731;
            AbstractC31176DnK.A1B(new ViewOnClickListenerC42033Ik2(this, 6), A0B, interfaceC56362iU);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "saved_audio_list";
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
        Integer num;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A03;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        InterfaceC678133v interfaceC678133v = this.A01;
        if (interfaceC678133v != null) {
            C153756vk c153756vk = this.A04;
            if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36328456887483944L)) {
                num = C05F.A0C;
            } else {
                num = C05F.A00;
            }
            Long l = null;
            C38337GtX c38337GtX = new C38337GtX(requireContext(), c153756vk, this, A0r, interfaceC678133v, this, num, JDW.A00, false, false, false, false);
            EmptyStateView emptyStateView = (EmptyStateView) view.findViewById(R.id.empty);
            AbstractC40788I5q.A00(new ViewOnClickListenerC42033Ik2(c38337GtX, 7), emptyStateView, false, false);
            RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) view.findViewById(R.id.refreshable_container);
            refreshableNestedScrollingParent.A07 = new J1P(c38337GtX, 0);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
            AbstractC31174DnI.A15(requireContext(), recyclerView);
            recyclerView.setAdapter(c38337GtX);
            C07S c07s = C07S.STARTED;
            C07X viewLifecycleOwner = getViewLifecycleOwner();
            AbstractC166987dD.A1Z(new C57170PZo(viewLifecycleOwner, c07s, this, c38337GtX, emptyStateView, recyclerView, refreshableNestedScrollingParent, null, 15), C07Y.A00(viewLifecycleOwner));
            Bundle requireArguments = requireArguments();
            Gt4 gt4 = this.A00;
            Long l2 = null;
            if (gt4 == null) {
                C14360o3.A0F("viewModel");
                throw C00O.createAndThrow();
            }
            C40957ICe c40957ICe = gt4.A02;
            String A01 = AbstractC153636vY.A01(requireArguments, "prior_module");
            String A00 = AbstractC111324zv.A00(3121);
            if (requireArguments.containsKey(A00)) {
                l = Long.valueOf(requireArguments.getLong(A00));
            }
            if (requireArguments.containsKey("source_media_id")) {
                l2 = Long.valueOf(requireArguments.getLong("source_media_id"));
            }
            String string = requireArguments.getString(AbstractC43591JPw.A00(207));
            C14360o3.A0B(A01, 0);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c40957ICe.A00, "instagram_organic_view_saved_audio_list");
            if (A0f.isSampled()) {
                AbstractC25225BEi.A1O(A0f, A01);
                AbstractC37300Gc1.A0j(A0f, l);
                AbstractC37300Gc1.A0h(A0f, l2);
                AbstractC37300Gc1.A0p(A0f, string);
                A0f.Cht();
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC43440JHe
    public final void D1Q(HYM hym) {
        AudioPageMetadata audioPageMetadata = hym.A00;
        InterfaceC09390do interfaceC09390do = this.A03;
        interfaceC09390do.getValue();
        INH A0C = AbstractC86593tX.A0C(C22P.A1Q);
        A0C.A08 = audioPageMetadata.A04;
        A0C.A0G = audioPageMetadata.A09;
        A0C.A0H = audioPageMetadata.A0D;
        A0C.A0I = audioPageMetadata.A0I;
        A0C.A0X = audioPageMetadata.A0F;
        C153756vk c153756vk = this.A04;
        A0C.A00 = c153756vk.A02;
        A0C.A0Z = c153756vk.getSessionId();
        A0C.A01(C128535rM.A00);
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C6XJ A02 = C6XJ.A02(requireActivity(), A0C.A00(), A0o, TransparentModalActivity.class, "clips_camera");
        AbstractC31179DnN.A1S(A02);
        A02.A0D(this, 9587);
    }

    @Override // X.InterfaceC43440JHe
    public final void DNP(HYM hym) {
        Gt4 gt4 = this.A00;
        if (gt4 == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        AbstractC166987dD.A1Z(new PZL(hym, gt4, null, 23), AbstractC141776au.A00(gt4));
    }

    @Override // X.InterfaceC43440JHe
    public final void Di9(HYM hym) {
        throw new C141786av(AnonymousClass001.A0R(AbstractC58317Pt9.A00(32), "Not yet implemented - T150620514"));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1047717315);
        super.onCreate(bundle);
        this.A02 = requireArguments().getString("audio_tab_type");
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A03;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        this.A01 = AbstractC677833s.A00(requireContext, A0r, this, new C677733r(requireContext(), AbstractC166987dD.A0r(interfaceC09390do)), __redex_internal_original_name, AbstractC677833s.A02(A0r));
        Gt4 gt4 = (Gt4) new C52942bb(new HHU(AbstractC25231BEo.A0L(this), AbstractC166987dD.A0r(interfaceC09390do), this.A02), this).A00(Gt4.class);
        this.A00 = gt4;
        if (gt4 == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        UserSession userSession = gt4.A01;
        if (C18U.A06(C06090Tz.A06, userSession, 36328302268530113L)) {
            AbstractC46700KlJ.A00(new C38247Grq(gt4, 4), userSession);
        }
        C0f9.A09(1016353624, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(13103047);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.saved_audio_collection, viewGroup, false);
        C0f9.A09(-1998333522, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-996259913);
        super.onDestroy();
        InterfaceC678133v interfaceC678133v = this.A01;
        if (interfaceC678133v != null) {
            interfaceC678133v.release();
        }
        this.A01 = null;
        C0f9.A09(-82605182, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-478238562);
        super.onPause();
        InterfaceC678133v interfaceC678133v = this.A01;
        if (interfaceC678133v != null) {
            interfaceC678133v.EJa(false);
        }
        C0f9.A09(-2005331185, A02);
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        InterfaceC678133v interfaceC678133v;
        super.onSetUserVisibleHint(z, z2);
        if (!z && (interfaceC678133v = this.A01) != null) {
            interfaceC678133v.EJa(false);
        }
    }
}
