package com.instagram.business.fragment;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC25233BEq;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31179DnN;
import X.AbstractC31581Du9;
import X.AbstractC53242c7;
import X.AbstractC59962oe;
import X.C0f9;
import X.C18C;
import X.C25621Ms;
import X.C31722DwR;
import X.C32548EUy;
import X.C35197Ffp;
import X.C35198Ffq;
import X.ECL;
import X.EQ7;
import X.FTL;
import X.InterfaceC02590Ai;
import X.InterfaceC111194zh;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import X.ViewOnClickListenerC35690FpP;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.text.TitleTextView;

/* loaded from: classes6.dex */
public class SupportProfileDisplayOptionsFragment extends AbstractC59962oe implements InterfaceC60122ou {
    public ActionButton A00;
    public InterfaceC111194zh A01;
    public EQ7 A02;
    public C35198Ffq A03;
    public UserSession A04;
    public String A05;
    public final Handler A06 = AbstractC167007dF.A0J();
    public BusinessNavBar mBusinessNavBar;
    public View mLoadingIndicator;
    public RecyclerView mRecyclerView;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "support_profile_display_options";
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        ?? obj = new Object();
        C35197Ffp.A01(AbstractC166997dE.A0N(this), obj, 2131970123);
        ActionButton A00 = C31722DwR.A00(ViewOnClickListenerC35690FpP.A00(this, 44), interfaceC56362iU, obj);
        this.A00 = A00;
        A00.setEnabled(false);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1251531810);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = AbstractC31176DnK.A0S(this);
        String string = requireArguments.getString("args_session_id");
        C18C.A07(string, "session_id should not be null");
        this.A05 = string;
        this.A03 = new C35198Ffq(this, this.A04, this.A05, requireArguments.getString("args_entry_point"));
        this.A02 = new EQ7(requireContext(), this);
        C0f9.A09(332902542, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1729142557);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.support_profile_display_options_fragment);
        C0f9.A09(-744947297, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        super.onViewCreated(view, bundle);
        this.mRecyclerView = AbstractC31176DnK.A0F(view);
        this.mLoadingIndicator = view.requireViewById(R.id.loading_spinner);
        UserSession userSession = this.A04;
        C32548EUy c32548EUy = new C32548EUy(this, 26);
        C25621Ms A0C = AbstractC31179DnN.A0C(userSession);
        A0C.A0B("business/profile_action_buttons/get_all_cta_categories_info/");
        A0C.A0R(ECL.class, FTL.class);
        AbstractC31175DnJ.A1L(A0C, c32548EUy, this);
        this.mRecyclerView.setAdapter(this.A02);
        InterfaceC111194zh Ayj = AbstractC31174DnI.A0m(this.A04).Ayj();
        this.A01 = Ayj;
        if (Ayj != null) {
            BusinessNavBar businessNavBar = (BusinessNavBar) view.requireViewById(R.id.remove_action_bar);
            this.mBusinessNavBar = businessNavBar;
            businessNavBar.A01.setVisibility(8);
            BusinessNavBar businessNavBar2 = this.mBusinessNavBar;
            String string = getString(2131972174);
            int color = requireContext().getColor(AbstractC53242c7.A03(requireContext()));
            int dimensionPixelSize = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
            TitleTextView titleTextView = businessNavBar2.A03;
            titleTextView.setText(string);
            titleTextView.setIsBold(true);
            titleTextView.setTextColor(color);
            titleTextView.setTextSize(0, dimensionPixelSize);
            this.mBusinessNavBar.setSecondaryButtonOnclickListeners(ViewOnClickListenerC35690FpP.A00(this, 43));
            this.mBusinessNavBar.setVisibility(0);
        }
        InterfaceC111194zh interfaceC111194zh = this.A01;
        String str4 = null;
        if (interfaceC111194zh != null) {
            str4 = interfaceC111194zh.Amd();
            str = this.A01.AcH();
            str2 = this.A01.Bba();
            str3 = this.A01.getUrl();
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        C35198Ffq c35198Ffq = this.A03;
        InterfaceC02590Ai A00 = C35198Ffq.A00(c35198Ffq);
        AbstractC31171DnF.A1A(A00, "edit_action_button");
        AbstractC31171DnF.A1C(A00, "view");
        A00.AAP(AbstractC31581Du9.A00(), c35198Ffq.A03);
        A00.A7v("is_support_partner_enabled", AbstractC166997dE.A0b());
        AbstractC31171DnF.A1G(A00, c35198Ffq.A02);
        A00.AAP("service_type", str4);
        A00.A9K("partner_id", AbstractC25233BEq.A0n(str));
        AbstractC31176DnK.A1L(A00, str2, str3);
        A00.Cht();
    }
}
