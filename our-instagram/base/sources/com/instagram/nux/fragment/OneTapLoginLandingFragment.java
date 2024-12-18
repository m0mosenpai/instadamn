package com.instagram.nux.fragment;

import X.AbstractC018607g;
import X.AbstractC08820cl;
import X.AbstractC12220kQ;
import X.AbstractC126965oa;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC25228BEl;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31178DnM;
import X.AbstractC31179DnN;
import X.AbstractC31180DnO;
import X.AbstractC31189DnY;
import X.AbstractC35081Fcs;
import X.AbstractC35102FdD;
import X.AbstractC35259Fgt;
import X.AbstractC35274Fh9;
import X.AbstractC35276FhB;
import X.AbstractC43591JPw;
import X.AbstractC52232aO;
import X.AbstractC56952jT;
import X.AbstractC59962oe;
import X.C023409i;
import X.C07270a1;
import X.C0f9;
import X.C14360o3;
import X.C16030qx;
import X.C193328hC;
import X.C1ON;
import X.C1P1;
import X.C31650DvG;
import X.C32196ECr;
import X.C32399EPa;
import X.C32531EUh;
import X.C34691FQc;
import X.C35020Fbt;
import X.C35031Fc4;
import X.C35203Ffv;
import X.C36036FvY;
import X.C41451vu;
import X.C61972ry;
import X.C6WQ;
import X.C83743oJ;
import X.C83803oP;
import X.DialogInterfaceOnClickListenerC35446Fk3;
import X.E6N;
import X.EVI;
import X.Eg0;
import X.EnumC31713DwI;
import X.FQD;
import X.FRB;
import X.FRE;
import X.G9Q;
import X.InterfaceC02590Ai;
import X.InterfaceC11380iw;
import X.InterfaceC37227Gac;
import X.InterfaceC41501vz;
import X.QJ0;
import X.ViewOnClickListenerC31724DwT;
import X.ViewOnClickListenerC35687FpM;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.fx.access.constants.FxcalAccountType;
import com.instagram.nux.ui.NetzDgTermsTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class OneTapLoginLandingFragment extends AbstractC59962oe implements InterfaceC11380iw, InterfaceC37227Gac {
    public C07270a1 A00;
    public C35020Fbt A01;
    public C32399EPa A02;
    public FRE A03;
    public G9Q A05;
    public FRB A06;
    public ViewGroup mRootView;
    public boolean A04 = false;
    public final InterfaceC41501vz A07 = C31650DvG.A00(this, 66);

    @Override // X.InterfaceC37227Gac
    public final void Cut(String str, String str2) {
        Iterator it = C83743oJ.A01(this.A00).A06(this.A00).iterator();
        while (it.hasNext()) {
            C83803oP c83803oP = (C83803oP) it.next();
            if (c83803oP.A07.equals(str)) {
                C1ON A05 = AbstractC35276FhB.A05(requireContext(), this.A00, c83803oP.A05, c83803oP.A06, str2);
                A05.A00 = new Eg0(this, this, this.A00, this, this, c83803oP, EnumC31713DwI.A18, c83803oP.A07, c83803oP.A06);
                schedule(A05);
                return;
            }
        }
    }

    @Override // X.InterfaceC37227Gac
    public final void DQP() {
    }

    @Override // X.InterfaceC37227Gac
    public final /* synthetic */ void DRA(FQD fqd) {
        fqd.A00(false);
    }

    @Override // X.InterfaceC37227Gac
    public final void DV5() {
    }

    @Override // X.InterfaceC37227Gac
    public final void Dkh() {
    }

    @Override // X.InterfaceC37227Gac
    public final void Dki() {
    }

    @Override // X.InterfaceC37227Gac
    public final void Dkj() {
    }

    @Override // X.InterfaceC37227Gac
    public final /* synthetic */ void DoC() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "one_tap";
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.3oP, java.lang.Object] */
    public static ArrayList A00(OneTapLoginLandingFragment oneTapLoginLandingFragment) {
        ImageUrl imageUrl;
        String str;
        ArrayList A06 = C83743oJ.A01(oneTapLoginLandingFragment.A00).A06(oneTapLoginLandingFragment.A00);
        C35020Fbt c35020Fbt = oneTapLoginLandingFragment.A01;
        if (c35020Fbt != null && !c35020Fbt.A01(oneTapLoginLandingFragment.mArguments).isEmpty()) {
            Iterator it = oneTapLoginLandingFragment.A01.A01(oneTapLoginLandingFragment.mArguments).iterator();
            while (it.hasNext()) {
                E6N e6n = (E6N) it.next();
                Iterator it2 = A06.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((C83803oP) it2.next()).A06.equals(e6n.A04)) {
                            break;
                        }
                    } else {
                        String str2 = e6n.A03;
                        if (str2 != null && (imageUrl = e6n.A00) != null) {
                            QJ0 qj0 = (QJ0) e6n.A02;
                            if (qj0.A03 != null && (str = qj0.A01) != null) {
                                String str3 = qj0.A04;
                                ?? obj = new Object();
                                obj.A01 = -1L;
                                obj.A00 = -1L;
                                obj.A04 = "APP_LEVEL_SPI_NO";
                                obj.A06 = str3;
                                obj.A07 = str2;
                                obj.A02 = imageUrl;
                                obj.A05 = str;
                                obj.A08 = true;
                                obj.A09 = true;
                                A06.add(obj);
                            }
                        }
                    }
                }
            }
        }
        if (A06.size() > 1) {
            return A06;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        if (!A06.isEmpty()) {
            A1E.add(AbstractC166997dE.A0k(A06));
        }
        return A1E;
    }

    public static void A01(OneTapLoginLandingFragment oneTapLoginLandingFragment, List list) {
        oneTapLoginLandingFragment.mRootView.removeAllViews();
        if (list.size() == 1) {
            C83803oP c83803oP = (C83803oP) list.get(0);
            AbstractC25228BEl.A0P(oneTapLoginLandingFragment.mRootView).inflate(R.layout.one_tap_login_landing_single_user, oneTapLoginLandingFragment.mRootView);
            IgImageView A0Z = AbstractC31172DnG.A0Z(oneTapLoginLandingFragment.mRootView, R.id.avatar_image_view);
            ImageUrl imageUrl = c83803oP.A02;
            if (imageUrl != null) {
                A0Z.setUrl(imageUrl, oneTapLoginLandingFragment);
            } else {
                AbstractC166997dE.A19(oneTapLoginLandingFragment.getContext(), A0Z, R.drawable.profile_anonymous_user);
            }
            ViewGroup A0F = AbstractC31173DnH.A0F(oneTapLoginLandingFragment.mRootView, R.id.avatar_login_button_container);
            AbstractC25228BEl.A0P(A0F).inflate(R.layout.ig_one_tap_log_in_button, A0F);
            ViewOnClickListenerC35687FpM.A00(A0Z, 0, oneTapLoginLandingFragment, c83803oP);
            TextView A0T = AbstractC166997dE.A0T(oneTapLoginLandingFragment.mRootView, R.id.one_tap_log_in_button);
            ViewOnClickListenerC35687FpM.A00(A0T, 1, oneTapLoginLandingFragment, c83803oP);
            View requireViewById = oneTapLoginLandingFragment.mRootView.requireViewById(R.id.remove_text_link);
            ViewOnClickListenerC35687FpM.A00(requireViewById, 2, oneTapLoginLandingFragment, c83803oP);
            AbstractC35081Fcs.A01((TextView) requireViewById);
            View requireViewById2 = oneTapLoginLandingFragment.mRootView.requireViewById(R.id.login_landing_logo);
            ((ViewGroup.MarginLayoutParams) requireViewById2.getLayoutParams()).bottomMargin = AbstractC166997dE.A0N(oneTapLoginLandingFragment).getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
            requireViewById2.requestLayout();
            ((ViewGroup.MarginLayoutParams) A0Z.getLayoutParams()).bottomMargin = 0;
            A0Z.requestLayout();
            TextView A0T2 = AbstractC166997dE.A0T(oneTapLoginLandingFragment.mRootView, R.id.username);
            A0T2.setText(c83803oP.A07);
            A0T2.setVisibility(0);
            ViewOnClickListenerC35687FpM.A00(oneTapLoginLandingFragment.mRootView.requireViewById(R.id.avatar_login_button_container), 3, oneTapLoginLandingFragment, c83803oP);
            View requireViewById3 = oneTapLoginLandingFragment.mRootView.requireViewById(R.id.remove_text_container);
            ((ViewGroup.MarginLayoutParams) requireViewById3.getLayoutParams()).topMargin = AbstractC166997dE.A0N(oneTapLoginLandingFragment).getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
            requireViewById3.requestLayout();
            A0T.setText(2131965706);
        } else {
            AbstractC25228BEl.A0P(oneTapLoginLandingFragment.mRootView).inflate(R.layout.one_tap_login_landing_multiple_users, oneTapLoginLandingFragment.mRootView);
            C32399EPa c32399EPa = new C32399EPa(oneTapLoginLandingFragment, oneTapLoginLandingFragment);
            oneTapLoginLandingFragment.A02 = c32399EPa;
            c32399EPa.A0C(list);
            ((AbsListView) oneTapLoginLandingFragment.mRootView.requireViewById(android.R.id.list)).setAdapter((ListAdapter) oneTapLoginLandingFragment.A02);
        }
        ((NetzDgTermsTextView) oneTapLoginLandingFragment.mRootView.requireViewById(R.id.netz_dg_terms_text_view)).A00(oneTapLoginLandingFragment.A00);
        TextView A0T3 = AbstractC166997dE.A0T(oneTapLoginLandingFragment.mRootView, R.id.left_button);
        AbstractC25227BEk.A12(A0T3, oneTapLoginLandingFragment, 2131975048);
        AbstractC56952jT.A01(A0T3);
        ViewOnClickListenerC31724DwT.A00(A0T3, 13, oneTapLoginLandingFragment);
        TextView A0T4 = AbstractC166997dE.A0T(oneTapLoginLandingFragment.mRootView, R.id.right_button);
        AbstractC25227BEk.A12(A0T4, oneTapLoginLandingFragment, 2131968888);
        AbstractC56952jT.A01(A0T4);
        ViewOnClickListenerC31724DwT.A00(A0T4, 14, oneTapLoginLandingFragment);
        AbstractC35081Fcs.A01(A0T3, A0T4);
        AbstractC31180DnO.A10(oneTapLoginLandingFragment.getContext(), AbstractC31171DnF.A08(oneTapLoginLandingFragment.mRootView, R.id.login_landing_logo));
    }

    public final void A02(C83803oP c83803oP) {
        C1ON A04;
        C1P1 eg0;
        String str;
        C35031Fc4 c35031Fc4 = C35031Fc4.A00;
        C07270a1 c07270a1 = this.A00;
        EnumC31713DwI enumC31713DwI = EnumC31713DwI.A18;
        String str2 = c83803oP.A06;
        C14360o3.A0B(c07270a1, 0);
        c35031Fc4.A01(c07270a1, null, false, null, null, "sso", str2);
        double A01 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, this.A00), "one_tap_login_account_clicked");
        AbstractC31177DnL.A1B(A0f, A01, A00);
        AbstractC31178DnM.A19(A0f, "sso");
        AbstractC31171DnF.A1D(A0f, "one_tap");
        AbstractC31176DnK.A1K(A0f, A01);
        AbstractC31176DnK.A1J(A0f, A00);
        A0f.A9K(AbstractC43591JPw.A00(1216), AbstractC31171DnF.A0V(C83743oJ.A01(this.A00).A06(this.A00).size()));
        AbstractC35274Fh9.A05(A0f);
        A0f.AAP("instagram_id", c83803oP.A06);
        AbstractC35274Fh9.A0B(A0f, this.A00);
        if (c83803oP.A09) {
            Context requireContext = requireContext();
            C07270a1 c07270a12 = this.A00;
            String str3 = c83803oP.A06;
            FxcalAccountType fxcalAccountType = FxcalAccountType.A05;
            String str4 = c83803oP.A05;
            Bundle bundle = this.mArguments;
            if (bundle != null) {
                str = bundle.getString("current_user_id");
            } else {
                str = null;
            }
            A04 = AbstractC35276FhB.A0B(c07270a12, AbstractC35276FhB.A0H(fxcalAccountType, str4, str), null, str3, C16030qx.A00(requireContext), AbstractC31172DnG.A10(requireContext), "account_switcher", null);
            String str5 = c83803oP.A07;
            C6WQ A0T = AbstractC31180DnO.A0T(this);
            A0T.A00(getString(2131965724));
            eg0 = new C32531EUh(this, A0T, str5, 11);
        } else {
            A04 = AbstractC35276FhB.A04(getContext(), this.A00, c83803oP.A05, c83803oP.A06, c83803oP.A02());
            eg0 = new Eg0(this, this, this.A00, this, this, c83803oP, enumC31713DwI, c83803oP.A07, c83803oP.A06);
        }
        A04.A00 = eg0;
        schedule(A04);
    }

    public final void A03(C83803oP c83803oP) {
        C193328hC A0P;
        String str;
        String string;
        AbstractC35102FdD.A02(this.A00, EnumC31713DwI.A18, c83803oP.A06);
        if (c83803oP.A09) {
            Bundle bundle = this.mArguments;
            if (bundle != null) {
                str = bundle.getString("current_username");
            } else {
                str = null;
            }
            A0P = AbstractC31176DnK.A0b(this);
            if (!AbstractC126965oa.A03(str)) {
                string = AbstractC31174DnI.A0w(this, str, 2131963012);
            } else {
                string = getString(2131963011);
            }
            A0P.A05 = string;
            AbstractC31179DnN.A11(this, A0P, 2131963029);
            A0P.A0d(null, getString(2131968948));
        } else {
            String str2 = c83803oP.A06;
            A0P = AbstractC31180DnO.A0P(this);
            A0P.A0A(2131972172);
            AbstractC31179DnN.A11(this, A0P, 2131972173);
            A0P.A0J(new DialogInterfaceOnClickListenerC35446Fk3(str2, this, 11), 2131972171);
            A0P.A0D(new DialogInterfaceOnClickListenerC35446Fk3(str2, this, 10));
        }
        AbstractC166987dD.A1W(A0P);
    }

    @Override // X.InterfaceC37227Gac
    public final void DoB(C07270a1 c07270a1, C32196ECr c32196ECr) {
        this.A05.DoB(c07270a1, c32196ECr);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-958745445);
        super.onCreate(bundle);
        C07270a1 A022 = C023409i.A0A.A02(this.mArguments);
        this.A00 = A022;
        registerLifecycleListener(new EVI(getActivity(), this, A022, EnumC31713DwI.A18));
        FRB frb = new FRB(this, this.A00);
        this.A06 = frb;
        frb.A00();
        this.A05 = new G9Q(getActivity());
        Context requireContext = requireContext();
        FRE fre = FRE.A04;
        if (fre == null) {
            AbstractC52232aO.A00(requireContext);
            fre = new FRE();
            FRE.A04 = fre;
        }
        this.A03 = fre;
        fre.A00(getContext(), this, this.A00, new C61972ry(getContext(), AbstractC018607g.A00(this)), null);
        FragmentActivity requireActivity = requireActivity();
        C07270a1 c07270a1 = this.A00;
        C14360o3.A0B(c07270a1, 2);
        this.A01 = new C35020Fbt(requireActivity, c07270a1, false);
        C0f9.A09(-2130233287, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        int i;
        String A0a;
        String queryParameter;
        int A02 = C0f9.A02(821342675);
        this.mRootView = (ViewGroup) AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.one_tap_login_landing_fragment);
        ArrayList A00 = A00(this);
        if (!A00.isEmpty()) {
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null && (A0a = AbstractC31171DnF.A0a(bundle2)) != null && (queryParameter = AbstractC08820cl.A03(A0a).getQueryParameter(AbstractC31189DnY.A01())) != null) {
                Iterator it = A00.iterator();
                while (it.hasNext()) {
                    if (((C83803oP) it.next()).A07.equals(queryParameter)) {
                    }
                }
            }
            C07270a1 c07270a1 = this.A00;
            AbstractC167017dG.A1N(c07270a1, "sso");
            C35203Ffv.A01(c07270a1, "sso");
            A01(this, A00);
            viewGroup2 = this.mRootView;
            i = -673345754;
            C0f9.A09(i, A02);
            return viewGroup2;
        }
        AbstractC35259Fgt.A04(this.mArguments, this.mFragmentManager);
        viewGroup2 = null;
        i = -367497839;
        C0f9.A09(i, A02);
        return viewGroup2;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1615538625);
        super.onDestroyView();
        C41451vu.A01.A03(this.A07, C36036FvY.class);
        C0f9.A09(329104545, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-961620385);
        this.A04 = true;
        super.onPause();
        C0f9.A09(805243369, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1426368350);
        this.A04 = false;
        super.onResume();
        C0f9.A09(1550725863, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C41451vu.A01.A02(this.A07, C36036FvY.class);
    }

    @Override // X.InterfaceC37227Gac
    public final void Do2(C34691FQc c34691FQc) {
    }
}
