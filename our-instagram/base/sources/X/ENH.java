package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class ENH extends C38K implements InterfaceC60122ou, GXk, C38O {
    public static final String __redex_internal_original_name = "SimilarAccountsFragment";
    public C31253Dob A00;
    public C123835ix A01;
    public C1570473j A02;
    public Integer A03;
    public String A04;
    public boolean A05;
    public boolean A07;
    public C32414EPp A08;
    public C161887My A09;
    public HashMap A0A;
    public boolean A06 = true;
    public final InterfaceC09390do A0C = AbstractC60492pY.A02(this);
    public final java.util.Set A0B = AbstractC166987dD.A1H();

    @Override // X.GXk, X.C38O
    public final C193328hC AM3(C193328hC c193328hC) {
        C14360o3.A0B(c193328hC, 0);
        c193328hC.A0m(this, AbstractC166987dD.A0o(this.A0C));
        return c193328hC;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "see_all_suggested_user_fragment";
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        AbstractC05560Rg.A00(this);
        View emptyView = ((AbstractC05560Rg) this).A04.getEmptyView();
        C14360o3.A0C(emptyView, MSV.A00(14));
        EmptyStateView emptyStateView = (EmptyStateView) emptyView;
        EnumC153216up enumC153216up = EnumC153216up.A02;
        emptyStateView.A0R(enumC153216up, R.drawable.recommended_user_empty_icon);
        EnumC153216up enumC153216up2 = EnumC153216up.A04;
        emptyStateView.A0R(enumC153216up2, R.drawable.loadmore_icon_refresh_compound);
        emptyStateView.A0N(ViewOnClickListenerC35682FpH.A00(this, 29), enumC153216up2);
        emptyStateView.A0T(enumC153216up, 2131974093);
        emptyStateView.A0T(enumC153216up2, 2131974094);
        super.onViewCreated(view, bundle);
        A0U(A0b());
        A02(this);
        C161887My c161887My = this.A09;
        if (c161887My == null) {
            C14360o3.A0F("followStatusUpdatedListener");
            throw C00O.createAndThrow();
        }
        c161887My.A00();
    }

    public static final void A02(ENH enh) {
        if (enh.mView != null) {
            AbstractC05560Rg.A00(enh);
            View emptyView = ((AbstractC05560Rg) enh).A04.getEmptyView();
            C14360o3.A0C(emptyView, MSV.A00(14));
            EmptyStateView emptyStateView = (EmptyStateView) emptyView;
            if (enh.A07) {
                emptyStateView.A0L();
            } else if (enh.A05) {
                emptyStateView.A0J();
            } else {
                emptyStateView.A0P(EnumC153216up.A02);
            }
        }
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return AbstractC166987dD.A0o(this.A0C);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, X.GaQ] */
    public final C32414EPp A0b() {
        C32414EPp c32414EPp = this.A08;
        if (c32414EPp == null) {
            Context requireContext = requireContext();
            FragmentActivity requireActivity = requireActivity();
            InterfaceC09390do interfaceC09390do = this.A0C;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            C31363DqS c31363DqS = new C31363DqS();
            C31253Dob c31253Dob = this.A00;
            if (c31253Dob == null) {
                c31253Dob = new Ef1(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), this);
                this.A00 = c31253Dob;
            }
            C14360o3.A0C(c31253Dob, "null cannot be cast to non-null type com.instagram.follow.chaining.DefaultRecommendedUserDelegate");
            ?? obj = new Object();
            String A0p = AbstractC166997dE.A0p(requireContext(), 2131968660);
            C32414EPp c32414EPp2 = new C32414EPp(requireActivity, requireContext, this, A0r, c31363DqS, obj, this, this, c31253Dob, new EVJ(this, this, this, AbstractC166987dD.A0r(interfaceC09390do), null, new C36780GJd(6)), A0p, C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36331063932372115L));
            this.A08 = c32414EPp2;
            return c32414EPp2;
        }
        return c32414EPp;
    }

    public static final String A01(C47P c47p, ENH enh) {
        String id = c47p.getId();
        HashMap hashMap = enh.A0A;
        if (hashMap != null && hashMap.containsKey(id)) {
            return AbstractC31171DnF.A0h(id, hashMap);
        }
        return c47p.getAlgorithm();
    }

    public final void A0c() {
        String str;
        if (requireArguments().containsKey("SimilarAccountsFragment.ARGUMENT_CHAINED_IDS")) {
            AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A0C);
            String str2 = this.A04;
            if (str2 == null) {
                str = "targetId";
            } else {
                ArrayList<String> stringArrayList = requireArguments().getStringArrayList("SimilarAccountsFragment.ARGUMENT_CHAINED_IDS");
                C14360o3.A0B(A0o, 0);
                C25621Ms A0M = AbstractC31177DnL.A0M(A0o);
                A0M.A0B("discover/fetch_suggestion_details/");
                A0M.A0P(null, ECC.class, FY6.class, false);
                if (str2.length() > 0) {
                    A0M.A9s("target_id", str2);
                }
                if (stringArrayList != null && AbstractC25226BEj.A1b(stringArrayList)) {
                    A0M.A9s("chained_ids", C71473Il.A00(',').A02(stringArrayList));
                }
                C1ON A0T = AbstractC31172DnG.A0T(A0M, "include_social_context", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                A0T.A00 = new C32511ETm(this);
                schedule(A0T);
                C1570473j c1570473j = this.A02;
                str = "latencyPerfLogger";
                if (c1570473j != null) {
                    ((MTJ) c1570473j).A00.A08(null);
                    C1570473j c1570473j2 = this.A02;
                    if (c1570473j2 != null) {
                        c1570473j2.A0E("fetch_request_start");
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        Context A05 = AbstractC31176DnK.A05(this, interfaceC56362iU);
        this.A0C.getValue();
        AbstractC31175DnJ.A1I(interfaceC56362iU, AbstractC166997dE.A0p(A05, 2131974884));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        Integer num;
        int A02 = C0f9.A02(-477240240);
        super.onCreate(bundle);
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A0C;
        this.A09 = new C161887My(requireContext, AbstractC166987dD.A0r(interfaceC09390do), A0b());
        Bundle requireArguments = requireArguments();
        String A00 = AbstractC111324zv.A00(3764);
        if (requireArguments.containsKey(A00)) {
            str = requireArguments().getString(A00);
            AbstractC25225BEi.A1S(str);
        } else {
            str = "";
        }
        this.A04 = str;
        HashMap hashMap = null;
        if (requireArguments().containsKey("SimilarAccountsFragment.ARGUMENT_ID_TO_ALGORITHM_MAP")) {
            Serializable serializable = requireArguments().getSerializable("SimilarAccountsFragment.ARGUMENT_ID_TO_ALGORITHM_MAP");
            C14360o3.A0C(serializable, MSV.A00(21));
            hashMap = (HashMap) serializable;
        }
        this.A0A = hashMap;
        if (requireArguments().containsKey("SimilarAccountsFragment.ARGUMENT_ENTRY_POINT")) {
            requireArguments().getString("SimilarAccountsFragment.ARGUMENT_ENTRY_POINT");
        }
        Bundle requireArguments2 = requireArguments();
        String A002 = AbstractC111324zv.A00(3765);
        if (requireArguments2.containsKey(A002) && requireArguments().getBoolean(A002)) {
            num = C05F.A0j;
        } else {
            num = C05F.A0u;
        }
        this.A03 = num;
        this.A01 = new C123835ix(this, AbstractC166987dD.A0r(interfaceC09390do));
        C1570473j c1570473j = new C1570473j(AbstractC166987dD.A0r(interfaceC09390do), "dp_non_self_chaining_see_all", 31796213);
        this.A02 = c1570473j;
        AbstractC31178DnM.A0m(requireContext(), c1570473j, this, interfaceC09390do);
        C0f9.A09(992708384, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(179977418);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_listview_with_empty_state, viewGroup, false);
        C0f9.A09(1837501411, A02);
        return inflate;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-50616090);
        C161887My c161887My = this.A09;
        if (c161887My == null) {
            C14360o3.A0F("followStatusUpdatedListener");
            throw C00O.createAndThrow();
        }
        c161887My.A01();
        super.onDestroyView();
        C0f9.A09(-1346058057, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1189632879);
        this.A0B.clear();
        super.onPause();
        C0f9.A09(2000322239, A02);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(719279800);
        super.onResume();
        if (this.A06) {
            if (requireArguments().containsKey("SimilarAccountsFragment.ARGUMENT_CHAINED_IDS")) {
                A0c();
            } else {
                this.A07 = true;
                A02(this);
                UserSession A0r = AbstractC166987dD.A0r(this.A0C);
                String str = this.A04;
                if (str == null) {
                    C14360o3.A0F("targetId");
                    throw C00O.createAndThrow();
                }
                C1ON A00 = AbstractC31484DsT.A00(A0r, C05F.A0C, str, null, false);
                C31714DwJ.A00(A00, this, 13);
                schedule(A00);
            }
        }
        C0f9.A09(-921223273, A02);
    }
}
