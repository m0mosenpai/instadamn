package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.EIu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32260EIu extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "DiscoverInterestAccountsFragment";
    public E06 A00;
    public FJS A01;
    public C63702ur A02;
    public C57112jm A03;
    public SpinnerImageView A04;
    public C62832tM A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);

    public final void A02(C38321qM c38321qM, String str) {
        C62832tM c62832tM;
        InterfaceC09390do interfaceC09390do = this.A09;
        C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A1g, AbstractC166987dD.A0r(interfaceC09390do));
        ArrayList A1E = AbstractC166987dD.A1E();
        if (this.A05 == null || this.A06 == null) {
            this.A05 = AbstractC62822tL.A00(AbstractC166987dD.A0r(interfaceC09390do));
            this.A06 = AbstractC166997dE.A0n();
        }
        A1E.add(C128085qc.A02(c38321qM));
        String str2 = this.A06;
        if (str2 != null && (c62832tM = this.A05) != null) {
            C125905mf A00 = InterfaceC111084zP.A00.A00(true);
            A00.A00 = null;
            c62832tM.A03(A00.A00(), EnumC125615m7.A03, str2, A1E, true, true);
        }
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        FragmentActivity requireActivity = requireActivity();
        c116875Qr.A1D = c38321qM.getId();
        c116875Qr.A1C = str;
        c116875Qr.A1d = false;
        AbstractC31173DnH.A1J(requireActivity, c116875Qr, A0r);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ip_discover_accounts";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1ON A0e;
        int i;
        C14360o3.A0B(view, 0);
        RecyclerView A0D = AbstractC31178DnM.A0D(view);
        ViewOnLayoutChangeListenerC35699FpZ.A00(A0D, 2, this);
        E06 e06 = this.A00;
        if (e06 == null) {
            C14360o3.A0F("interestAccountsAdapter");
            throw C00O.createAndThrow();
        }
        A0D.setAdapter(e06);
        AbstractC31174DnI.A15(getActivity(), A0D);
        if (!this.A07) {
            if (this.A08) {
                A0e = AbstractC31513Dsx.A01(AbstractC166987dD.A0r(this.A09), null, null, null, true, false);
                i = 28;
            } else {
                C25621Ms A0M = AbstractC31177DnL.A0M(AbstractC25230BEn.A0k(this.A09, 0));
                A0M.A0B("interest_nux/accounts/");
                A0e = AbstractC25227BEk.A0e(A0M, EAP.class, C34750FSp.class);
                i = 29;
            }
            C32539EUp.A00(this, A0e, i);
            this.A07 = true;
        }
        super.onViewCreated(view, bundle);
    }

    public static final C6PG A00(E8F e8f, User user, String str, String str2, int i) {
        if (str2 == null) {
            str2 = "fullscreen";
        }
        C6PG c6pg = new C6PG(str2, user.getId(), "ip_discover_accounts");
        c6pg.A0B = e8f.A04;
        c6pg.A00 = i;
        if (str != null) {
            c6pg.A07 = str;
        }
        String str3 = e8f.A02;
        if (str3 != null) {
            c6pg.A04 = str3;
        }
        return c6pg;
    }

    public static final void A01(C32260EIu c32260EIu, String str) {
        InterfaceC09390do interfaceC09390do = c32260EIu.A09;
        C31368DqX A01 = AbstractC31402Dr6.A01(AbstractC166987dD.A0r(interfaceC09390do), str, "ip_discover_accounts", "ip_discover_accounts");
        C140966Yy A0j = AbstractC25233BEq.A0j(c32260EIu, interfaceC09390do);
        A0j.A0F = true;
        C31368DqX.A02(A0j, AbstractC166987dD.A0r(interfaceC09390do), AbstractC31364DqT.A02(), A01);
    }

    public final void A03(boolean z) {
        SpinnerImageView spinnerImageView = this.A04;
        if (spinnerImageView == null) {
            C14360o3.A0F("loadingSpinner");
            throw C00O.createAndThrow();
        }
        spinnerImageView.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(86679477);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A09;
        this.A01 = new FJS(this, AbstractC166987dD.A0r(interfaceC09390do));
        this.A02 = new C63702ur(this, AbstractC166987dD.A0r(interfaceC09390do));
        this.A03 = AbstractC31180DnO.A0N();
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C57112jm c57112jm = this.A03;
        if (c57112jm == null) {
            C14360o3.A0F("viewpointManager");
            throw C00O.createAndThrow();
        }
        this.A00 = new E06(requireContext, this, A0r, c57112jm, this);
        this.A08 = C18U.A06(C06090Tz.A06, AbstractC166987dD.A0o(interfaceC09390do), 36316083086430157L);
        C0f9.A09(1943889416, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1787444485);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.discover_interest_accounts_fragment, viewGroup, false);
        View A0S = AbstractC166997dE.A0S(inflate, R.id.discover_accounts_headline);
        if (this.A08) {
            A0S.setPadding(A0S.getPaddingLeft(), A0S.getPaddingTop(), A0S.getPaddingRight(), AbstractC31171DnF.A02(AbstractC166997dE.A0N(this), R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
        }
        this.A04 = AbstractC31180DnO.A0V(inflate);
        View A0S2 = AbstractC166997dE.A0S(inflate, R.id.progress_button);
        A0S2.setEnabled(true);
        ViewOnClickListenerC35667Fp2.A00(A0S2, 59, this);
        AppBarLayout appBarLayout = (AppBarLayout) AbstractC166997dE.A0R(inflate, R.id.appbar_layout);
        MaterialToolbar materialToolbar = (MaterialToolbar) AbstractC166997dE.A0R(inflate, R.id.toolbar);
        materialToolbar.setTitle(getString(2131960979));
        appBarLayout.A02(new C35867Fsh(AbstractC166997dE.A0S(inflate, R.id.toolbar_background), materialToolbar, 0));
        C57112jm c57112jm = this.A03;
        if (c57112jm == null) {
            C14360o3.A0F("viewpointManager");
            throw C00O.createAndThrow();
        }
        c57112jm.A08(inflate, C71163Hc.A00(this), new InterfaceC57142jp[0]);
        C0f9.A09(1932117898, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C62832tM c62832tM;
        int A02 = C0f9.A02(1768776183);
        super.onDestroy();
        String str = this.A06;
        if (str != null && (c62832tM = this.A05) != null) {
            c62832tM.A07(str);
        }
        C0f9.A09(507273060, A02);
    }
}
