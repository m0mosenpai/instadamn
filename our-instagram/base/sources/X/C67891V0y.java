package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

/* renamed from: X.V0y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67891V0y extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, XA8 {
    public static final String __redex_internal_original_name = "PromoteNonDiscriminationFragment";
    public W65 A00;
    public UserSession A01;
    public boolean A02;
    public W6E A03;
    public PromoteData A04;
    public final InterfaceC09390do A05 = C1XM.A00(new X32(this, 13));

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131970821);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_non_discrimination";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        C70399WUb A0N = AbstractC65702TsY.A0N(this.A05);
        VG4 vg4 = VG4.A14;
        AbstractC65702TsY.A1M(A0N, vg4);
        View requireViewById = view.requireViewById(R.id.about_policy_title_row);
        AbstractC68459VRp.A00(requireViewById, AbstractC31180DnO.A02(this, requireViewById).getString(2131970774), null, true);
        View requireViewById2 = view.requireViewById(R.id.about_policy_content_row_1);
        AbstractC68459VRp.A00(requireViewById2, null, AbstractC31180DnO.A02(this, requireViewById2).getString(2131970772), false);
        View requireViewById3 = view.requireViewById(R.id.about_policy_content_row_2);
        AbstractC68459VRp.A00(requireViewById3, null, AbstractC31180DnO.A02(this, requireViewById3).getString(2131970773), false);
        View requireViewById4 = view.requireViewById(R.id.acceptable_ad_targeting_row);
        AbstractC68459VRp.A00(requireViewById4, AbstractC31180DnO.A02(this, requireViewById4).getString(2131970777), AbstractC166997dE.A0N(this).getString(2131970776), false);
        View requireViewById5 = view.requireViewById(R.id.ad_discrimination_row);
        AbstractC68459VRp.A00(requireViewById5, AbstractC31180DnO.A02(this, requireViewById5).getString(2131970782), AbstractC166997dE.A0N(this).getString(2131970781), false);
        View requireViewById6 = view.requireViewById(R.id.hec_row_with_chevron);
        String A0q = AbstractC166997dE.A0q(AbstractC31180DnO.A02(this, requireViewById6), 2131970820);
        ViewOnClickListenerC35690FpP viewOnClickListenerC35690FpP = new ViewOnClickListenerC35690FpP(this, 55);
        ImageView A0D = AbstractC31176DnK.A0D(requireViewById6, R.id.front_icon);
        A0D.setImageResource(R.drawable.instagram_info_pano_outline_24);
        A0D.setVisibility(0);
        AbstractC31176DnK.A1F(requireViewById6, A0q, R.id.primary_text);
        C0fQ.A00(viewOnClickListenerC35690FpP, requireViewById6);
        View requireViewById7 = view.requireViewById(R.id.full_policy_row_with_chevron);
        String A0q2 = AbstractC166997dE.A0q(AbstractC31180DnO.A02(this, requireViewById7), 2131970801);
        ViewOnClickListenerC35690FpP viewOnClickListenerC35690FpP2 = new ViewOnClickListenerC35690FpP(this, 56);
        ImageView A0D2 = AbstractC31176DnK.A0D(requireViewById7, R.id.front_icon);
        A0D2.setImageResource(R.drawable.instagram_licensing_pano_outline_24);
        A0D2.setVisibility(0);
        AbstractC31176DnK.A1F(requireViewById7, A0q2, R.id.primary_text);
        C0fQ.A00(viewOnClickListenerC35690FpP2, requireViewById7);
        View requireViewById8 = view.requireViewById(R.id.footer_message_row);
        AbstractC68459VRp.A00(requireViewById8, null, AbstractC31180DnO.A02(this, requireViewById8).getString(2131970787), false);
        View requireViewById9 = view.requireViewById(R.id.acceptance_claim_title_row);
        AbstractC68459VRp.A00(requireViewById9, AbstractC31180DnO.A02(this, requireViewById9).getString(2131970780), null, false);
        View requireViewById10 = view.requireViewById(R.id.acceptance_first_claim_check_mark_row);
        A00(requireViewById10, AbstractC166997dE.A0q(AbstractC31180DnO.A02(this, requireViewById10), 2131970778));
        View requireViewById11 = view.requireViewById(R.id.acceptance_second_claim_check_mark_row);
        A00(requireViewById11, AbstractC166997dE.A0q(AbstractC31180DnO.A02(this, requireViewById11), 2131970779));
        W65 w65 = new W65(view, vg4);
        this.A00 = w65;
        w65.A01();
        W65 w652 = this.A00;
        if (w652 == null) {
            C14360o3.A0F("acceptButtonHolder");
            throw C00O.createAndThrow();
        }
        w652.A05(false);
        w652.A03(this);
        w652.A02(2131970775);
        super.onViewCreated(view, bundle);
    }

    @Override // X.XA8
    public final void CuW() {
        W6E w6e = this.A03;
        if (w6e == null) {
            C14360o3.A0F("dataFetcher");
            throw C00O.createAndThrow();
        }
        C66081TzI c66081TzI = new C66081TzI(this, 20);
        PromoteData promoteData = w6e.A03;
        UserSession userSession = promoteData.A0y;
        String str = promoteData.A1A;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A9s("fb_auth_token", str);
        c25621Ms.A05();
        c25621Ms.A0B("ads/promote/accept_non_disc_policy/");
        C1ON A0S = AbstractC31172DnG.A0S(c25621Ms, C67810Uyj.class, C69908VxZ.class);
        A0S.A00 = c66081TzI;
        w6e.A07.schedule(A0S);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        UserSession userSession = this.A01;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A02) {
            C193328hC c193328hC = new C193328hC((Activity) requireActivity());
            c193328hC.A0t(false);
            c193328hC.A0A(2131970786);
            c193328hC.A09(2131970783);
            c193328hC.A0J(null, 2131970785);
            c193328hC.A0H(new WHP(this, 32), 2131970784);
            AbstractC166987dD.A1W(c193328hC);
            return true;
        }
        C70399WUb A0N = AbstractC65702TsY.A0N(this.A05);
        PromoteData promoteData = this.A04;
        if (promoteData == null) {
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        A0N.A0C(VG4.A14, promoteData);
        return false;
    }

    private final void A00(View view, String str) {
        CompoundButton compoundButton = (CompoundButton) AbstractC166997dE.A0R(view, R.id.promote_row_checkbox);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.primary_text);
        View A0S = AbstractC166997dE.A0S(view, R.id.secondary_text);
        compoundButton.setChecked(true);
        A0N.setText(str);
        A0N.setTextSize(0, AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material));
        A0S.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(252716012);
        PromoteData A00 = InterfaceC72021XFj.A00(this);
        this.A04 = A00;
        UserSession userSession = A00.A0y;
        this.A01 = userSession;
        this.A03 = new W6E(requireActivity(), this, userSession);
        this.A02 = true;
        super.onCreate(bundle);
        C0f9.A09(715706506, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(64056957);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.promote_non_discrimination_view, false);
        C0f9.A09(-607454681, A02);
        return A0R;
    }
}
