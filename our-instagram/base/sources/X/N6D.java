package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* loaded from: classes9.dex */
public final class N6D extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LeadGenManageFormsFragment";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public IgdsBottomButtonLayout A04;
    public IgRadioGroup A05;
    public C55089Oav A06;
    public AnonymousClass195 A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;

    public static final void A01(N6D n6d, boolean z, boolean z2) {
        C6WQ A0i = AbstractC31174DnI.A0i(n6d.requireContext());
        MSX.A0w(n6d.requireContext(), A0i, 2131969964);
        A0i.setCancelable(false);
        NP7 A02 = n6d.A02();
        A02.A04.A06(A02.A06, AbstractC50523MSb.A0V(A02.A03), A02.A07, z, z2);
        AbstractC31174DnI.A1E(n6d.getViewLifecycleOwner(), ((C50876Me7) n6d.A08.getValue()).A00, new C37487Gf5(n6d, A0i, 2, z2, z), 50);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r1.A00 == null) goto L13;
     */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r4) {
        /*
            r3 = this;
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            X.NP7 r0 = r3.A02()
            X.Ngp r1 = r0.A05
            X.Ngp r0 = X.EnumC53251Ngp.A04
            if (r1 != r0) goto L48
            java.lang.String r0 = ""
        L10:
            r4.setTitle(r0)
            X.AbstractC50523MSb.A1E(r4)
            X.NP7 r0 = r3.A02()
            boolean r0 = r0.A09
            if (r0 != 0) goto L47
            X.Oav r2 = X.C55089Oav.A00(r3, r4)
            r3.A06 = r2
            r1 = 24
            X.OkG r0 = new X.OkG
            r0.<init>(r3, r1)
            r2.A02(r0)
            X.Oav r2 = r3.A06
            if (r2 == 0) goto L47
            X.NP7 r0 = r3.A02()
            com.instagram.leadgen.core.model.LeadGenBaseFormList r1 = r0.A02()
            com.instagram.leadgen.core.api.LeadForm r0 = r1.A01
            if (r0 == 0) goto L43
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r1.A00
            r0 = 1
            if (r1 != 0) goto L44
        L43:
            r0 = 0
        L44:
            r2.A03(r0)
        L47:
            return
        L48:
            r0 = 2131964997(0x7f133445, float:1.9566791E38)
            java.lang.String r0 = r3.getString(r0)
            X.C14360o3.A0A(r0)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6D.configureActionBar(X.2iU):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "lead_gen_manage_forms_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = view.requireViewById(R.id.lead_form_list_loading_spinner);
        this.A00 = view.requireViewById(R.id.lead_gen_fragment_content);
        this.A05 = (IgRadioGroup) view.requireViewById(R.id.lead_form_radio_group);
        this.A03 = view.requireViewById(R.id.see_all_row);
        this.A04 = AbstractC31172DnG.A0j(view, R.id.bottom_button_layout);
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), ((AbstractC51028Mgb) A02()).A03, new C57743PjW(this, 25), 43);
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), ((AbstractC51028Mgb) A02()).A04, new C50362MLo(22, view, this), 43);
    }

    public final NP7 A02() {
        return (NP7) this.A09.getValue();
    }

    public N6D() {
        C57552PgQ A01 = C57552PgQ.A01(this, 26);
        C57552PgQ A012 = C57552PgQ.A01(this, 19);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = C57552PgQ.A00(A012, enumC09460dv, 20);
        this.A09 = AbstractC25225BEi.A0a(C57552PgQ.A01(A00, 21), A01, C57534Pg8.A00(A00, null, 39), AbstractC25225BEi.A1D(NP7.class));
        C57552PgQ A013 = C57552PgQ.A01(this, 25);
        InterfaceC09390do A002 = C57552PgQ.A00(C57552PgQ.A01(this, 22), enumC09460dv, 23);
        this.A08 = AbstractC25225BEi.A0a(C57552PgQ.A01(A002, 24), A013, C57534Pg8.A00(A002, null, 40), AbstractC25225BEi.A1D(C50876Me7.class));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (r1.A00 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r1.A00 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.N6D r3) {
        /*
            X.NP7 r0 = r3.A02()
            boolean r0 = r0.A09
            if (r0 == 0) goto L22
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r3.A04
            if (r2 == 0) goto L21
            X.NP7 r0 = r3.A02()
            com.instagram.leadgen.core.model.LeadGenBaseFormList r1 = r0.A02()
            com.instagram.leadgen.core.api.LeadForm r0 = r1.A01
            if (r0 == 0) goto L1d
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r1.A00
            r0 = 1
            if (r1 != 0) goto L1e
        L1d:
            r0 = 0
        L1e:
            r2.setPrimaryButtonEnabled(r0)
        L21:
            return
        L22:
            X.Oav r2 = r3.A06
            if (r2 == 0) goto L21
            X.NP7 r0 = r3.A02()
            com.instagram.leadgen.core.model.LeadGenBaseFormList r1 = r0.A02()
            com.instagram.leadgen.core.api.LeadForm r0 = r1.A01
            if (r0 == 0) goto L37
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r1.A00
            r0 = 1
            if (r1 != 0) goto L38
        L37:
            r0 = 0
        L38:
            r2.A03(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N6D.A00(X.N6D):void");
    }

    public final void A03() {
        String str;
        int i;
        int i2;
        LeadForm leadForm = A02().A03.A01;
        String str2 = null;
        if (leadForm != null) {
            str = leadForm.A03;
        } else {
            str = null;
        }
        LeadForm leadForm2 = ((AbstractC51028Mgb) A02()).A01;
        if (leadForm2 != null) {
            str2 = leadForm2.A03;
        }
        boolean z = !C14360o3.A0K(str, str2);
        boolean z2 = false;
        boolean A1a = AbstractC25229BEm.A1a(A02().A03.A00, ((AbstractC51028Mgb) A02()).A00);
        if (((AbstractC51028Mgb) A02()).A00 == null) {
            z2 = true;
        }
        if (!z && !A1a) {
            AbstractC86593tX.A0Z(requireActivity(), A02().A02);
            return;
        }
        if (z2) {
            A01(this, true, true);
            return;
        }
        C193328hC A0b = AbstractC31176DnK.A0b(this);
        A0b.A0t(true);
        if (z) {
            i = 2131965043;
            if (A1a) {
                i = 2131965045;
            }
        } else {
            i = 0;
            if (A1a) {
                i = 2131965044;
            }
        }
        A0b.A0A(i);
        if (z) {
            i2 = 2131965041;
            if (A1a) {
                i2 = 2131965040;
            }
        } else {
            i2 = 0;
            if (A1a) {
                i2 = 2131965039;
            }
        }
        A0b.A09(i2);
        A0b.A0J(new DialogInterfaceOnClickListenerC55286Og1(this, 1, z, A1a), 2131965042);
        A0b.A0I(new DialogInterfaceOnClickListenerC55286Og1(this, 2, z, A1a), 2131965038);
        A0b.A0C(new DialogInterfaceOnCancelListenerC55248OfM(this, 0, z, A1a));
        A0b.A0h(new DialogInterfaceOnShowListenerC55327Ogp(this, 0, z, A1a));
        AbstractC166987dD.A1W(A0b);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return A02().A01();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        NP7 A02 = A02();
        C55017OWq c55017OWq = ((AbstractC51028Mgb) A02).A05;
        String A03 = A02.A03();
        InterfaceC58268PsC.A02(C55017OWq.A00(c55017OWq, A03), A03, "lead_gen_manage_lead_forms_and_cta", "cancel");
        return ((AbstractC51028Mgb) A02()).A02;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1071905143);
        super.onCreate(bundle);
        NP7 A022 = A02();
        ((AbstractC51028Mgb) A022).A00 = A022.A03.A00;
        NP7 A023 = A02();
        FragmentActivity requireActivity = requireActivity();
        String str = A023.A00;
        if (str != null) {
            AbstractC51028Mgb.A00(A023, str);
        } else {
            C70187WFq.A02(requireActivity, AbstractC018607g.A00(requireActivity), new C55871OrL(A023, 0), A023.A01(), false);
        }
        C0f9.A09(-481085528, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1689995325);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_manage_forms_fragment, viewGroup, false);
        C0f9.A09(-768294279, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-594585239);
        super.onDestroyView();
        this.A02 = null;
        this.A00 = null;
        this.A05 = null;
        this.A03 = null;
        this.A01 = null;
        this.A04 = null;
        this.A06 = null;
        C0f9.A09(-1632203289, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1068257244);
        super.onStart();
        this.A07 = PZH.A01(this, ((AbstractC51028Mgb) A02()).A07, 30);
        C0f9.A09(7621792, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(941528203);
        super.onStop();
        this.A07 = MSY.A0r(this.A07);
        C0f9.A09(-678752561, A02);
    }
}
