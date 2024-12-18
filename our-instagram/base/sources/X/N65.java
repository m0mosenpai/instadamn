package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.leadgen.core.api.LeadGenInfoFieldTypes;
import com.instagram.leadgen.organic.model.LeadFormCustomQuestion;
import com.instagram.leadgen.organic.model.LeadGenFormData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class N65 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LeadGenCreateFormFragmentV2";
    public IgdsBottomButtonLayout A00;
    public C55089Oav A01;
    public AnonymousClass195 A02;
    public final List A03;
    public final InterfaceC09390do A04;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.setTitle(getString(2131964945));
        AbstractC50523MSb.A1E(interfaceC56362iU);
        C55089Oav A00 = C55089Oav.A00(this, interfaceC56362iU);
        this.A01 = A00;
        A00.A04(true);
        String A0v = AbstractC25227BEk.A0v(this, 2131964952);
        ViewOnClickListenerC55461OkG viewOnClickListenerC55461OkG = new ViewOnClickListenerC55461OkG(this, 48);
        InterfaceC56362iU interfaceC56362iU2 = A00.A01;
        interfaceC56362iU2.Ect(A0v, viewOnClickListenerC55461OkG);
        interfaceC56362iU2.ARk(0, false);
        C55089Oav c55089Oav = this.A01;
        if (c55089Oav != null) {
            c55089Oav.A01.ARk(0, true);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "lead_gen_create_form_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A04;
        C51038Mgo A0h = MSW.A0h(interfaceC09390do);
        P4X p4x = A0h.A04;
        Long l = A0h.A07;
        String str2 = A0h.A08;
        C14360o3.A0B(str2, 1);
        P4X.A03(p4x, l, "lead_gen_create_form", "create_form_screen_impression", str2);
        C51038Mgo A0h2 = MSW.A0h(interfaceC09390do);
        C50634MWv c50634MWv = A0h2.A01;
        LeadGenFormData leadGenFormData = A0h2.A06;
        c50634MWv.A01 = leadGenFormData.A09;
        c50634MWv.A00 = leadGenFormData.A07;
        c50634MWv.A02 = leadGenFormData.A0A;
        View A0S = AbstractC166997dE.A0S(view, R.id.add_custom_question_row);
        boolean z = false;
        float f = 0.4f;
        if (C51038Mgo.A00(interfaceC09390do).A06.size() < 3) {
            z = true;
            f = 1.0f;
        }
        A0S.setAlpha(f);
        C0fQ.A00(new Ok5(10, this, z), A0S);
        AbstractC166997dE.A0S(view, R.id.name_subtitle).setVisibility(8);
        IgdsCheckBox igdsCheckBox = (IgdsCheckBox) AbstractC166997dE.A0R(view, R.id.phone_checkbox);
        LeadGenInfoFieldTypes leadGenInfoFieldTypes = LeadGenInfoFieldTypes.A0P;
        igdsCheckBox.post(new RunnableC57005PQv(igdsCheckBox, MSW.A0h(interfaceC09390do).A01.A01));
        C55518OlC.A00(igdsCheckBox, leadGenInfoFieldTypes, this, 7);
        IgdsCheckBox igdsCheckBox2 = (IgdsCheckBox) AbstractC166997dE.A0R(view, R.id.email_checkbox);
        LeadGenInfoFieldTypes leadGenInfoFieldTypes2 = LeadGenInfoFieldTypes.A0A;
        igdsCheckBox2.post(new RunnableC57005PQv(igdsCheckBox2, MSW.A0h(interfaceC09390do).A01.A00));
        C55518OlC.A00(igdsCheckBox2, leadGenInfoFieldTypes2, this, 7);
        IgdsCheckBox igdsCheckBox3 = (IgdsCheckBox) AbstractC166997dE.A0R(view, R.id.zip_checkbox);
        LeadGenInfoFieldTypes leadGenInfoFieldTypes3 = LeadGenInfoFieldTypes.A0a;
        igdsCheckBox3.post(new RunnableC57005PQv(igdsCheckBox3, MSW.A0h(interfaceC09390do).A01.A02));
        C55518OlC.A00(igdsCheckBox3, leadGenInfoFieldTypes3, this, 7);
        AbstractC166997dE.A0S(view, R.id.zip_checkbox_container).setVisibility(0);
        View A0S2 = AbstractC166997dE.A0S(view, R.id.see_all_row);
        A0S2.setVisibility(8);
        AbstractC25227BEk.A12(AbstractC167007dF.A0N(A0S2, R.id.primary_text), this, 2131970592);
        List list = this.A03;
        List A1Q = AbstractC16960so.A1Q(Integer.valueOf(R.id.question_1), Integer.valueOf(R.id.question_2), Integer.valueOf(R.id.question_3));
        ArrayList A0i = AbstractC167007dF.A0i(A1Q);
        Iterator it = A1Q.iterator();
        while (it.hasNext()) {
            A0i.add(view.requireViewById(AbstractC167007dF.A0B(it)));
        }
        Iterator it2 = A0i.iterator();
        while (it2.hasNext()) {
            View A09 = AbstractC43592JPx.A09(it2);
            C14360o3.A0A(A09);
            A09.setVisibility(8);
        }
        list.addAll(A0i);
        int size = C51038Mgo.A00(interfaceC09390do).A06.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) AbstractC001800i.A0O(list, i);
            if (view2 != null) {
                view2.setVisibility(0);
                ViewOnClickListenerC55458OkC.A01(view2, this, i, 9);
                TextView A0N = AbstractC167007dF.A0N(view2, R.id.primary_text);
                LeadFormCustomQuestion leadFormCustomQuestion = (LeadFormCustomQuestion) AbstractC001800i.A0O(C51038Mgo.A00(interfaceC09390do).A06, i);
                if (leadFormCustomQuestion != null) {
                    str = leadFormCustomQuestion.A01;
                } else {
                    str = null;
                }
                A0N.setText(str);
            }
        }
        Drawable drawable = requireContext().getDrawable(R.drawable.instagram_chevron_right_pano_outline_8);
        if (drawable != null) {
            AbstractC25231BEo.A0x(requireContext(), drawable, AbstractC53242c7.A0B(getContext()));
        } else {
            drawable = null;
        }
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.advanced_settings_text_view);
        A0N2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        ViewOnClickListenerC55461OkG.A00(A0N2, 45, this);
        IgdsBottomButtonLayout A0j = AbstractC31172DnG.A0j(view, R.id.bottom_button_layout);
        this.A00 = A0j;
        if (A0j != null) {
            A0j.setFooterText(O0E.A00.A09(getActivity(), requireContext(), MSW.A0h(interfaceC09390do).A02));
            A0j.setPrimaryAction(getString(2131964957), new ViewOnClickListenerC55461OkG(this, 46));
        }
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), MSW.A0h(interfaceC09390do).A00, new C57743PjW(this, 37), 48);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return MSW.A0h(this.A04).A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (r2 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r1.A02 != false) goto L10;
     */
    @Override // X.InterfaceC60072op
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onBackPressed() {
        /*
            r7 = this;
            X.0do r6 = r7.A04
            X.Mgo r0 = X.MSW.A0h(r6)
            X.2GT r0 = r0.A00
            java.lang.Object r0 = r0.A02()
            r5 = 1
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r5)
            if (r0 != 0) goto L8c
            android.view.View r0 = X.AbstractC50522MSa.A0J(r7)
            X.AbstractC13880nE.A0O(r0)
            X.Mgo r0 = X.MSW.A0h(r6)
            X.MWv r1 = r0.A01
            boolean r0 = r1.A00
            if (r0 != 0) goto L2d
            boolean r0 = r1.A01
            if (r0 != 0) goto L2d
            boolean r0 = r1.A02
            r2 = 0
            if (r0 == 0) goto L2e
        L2d:
            r2 = 1
        L2e:
            com.instagram.leadgen.organic.model.LeadGenFormData r0 = X.C51038Mgo.A00(r6)
            java.util.ArrayList r0 = r0.A06
            boolean r0 = X.AbstractC25226BEj.A1b(r0)
            if (r0 != 0) goto L3d
            r1 = 0
            if (r2 == 0) goto L3e
        L3d:
            r1 = 1
        L3e:
            X.Mgo r0 = X.MSW.A0h(r6)
            if (r1 == 0) goto L8d
            X.P4X r4 = r0.A04
            java.lang.Long r3 = r0.A07
            java.lang.String r2 = r0.A08
            X.C14360o3.A0B(r2, r5)
            java.lang.String r1 = "lead_gen_create_form"
            java.lang.String r0 = "discard_form_confirmation_action_sheet_impression"
            X.P4X.A02(r4, r3, r1, r0, r2)
            android.content.Context r1 = r7.requireContext()
            X.Mgo r0 = X.MSW.A0h(r6)
            com.instagram.common.session.UserSession r0 = r0.A02
            X.MYs r3 = new X.MYs
            r3.<init>(r1, r0)
            android.content.Context r1 = r7.requireContext()
            r0 = 2131964942(0x7f13340e, float:1.956668E38)
            java.lang.String r2 = r1.getString(r0)
            android.content.Context r1 = r7.requireContext()
            r0 = 2131964941(0x7f13340d, float:1.9566678E38)
            java.lang.String r0 = r1.getString(r0)
            r3.A0C(r2, r0)
            r2 = 2131964940(0x7f13340c, float:1.9566676E38)
            r1 = 47
            X.OkG r0 = new X.OkG
            r0.<init>(r7, r1)
            r3.A01(r0, r2)
            X.C31727DwY.A02(r7, r3)
        L8c:
            return r5
        L8d:
            r0.A02()
            X.Mgo r0 = X.MSW.A0h(r6)
            X.P4X r4 = r0.A04
            java.lang.Long r3 = r0.A07
            java.lang.String r2 = r0.A08
            X.C14360o3.A0B(r2, r5)
            java.lang.String r1 = "lead_gen_create_form"
            java.lang.String r0 = "cancel"
            X.P4X.A02(r4, r3, r1, r0, r2)
            A00(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N65.onBackPressed():boolean");
    }

    public N65() {
        C57544PgI A01 = C57544PgI.A01(this, 40);
        InterfaceC09390do A00 = C57544PgI.A00(C57544PgI.A01(this, 37), EnumC09460dv.A02, 38);
        this.A04 = AbstractC25225BEi.A0a(C57544PgI.A01(A00, 39), A01, C57534Pg8.A00(A00, null, 31), AbstractC25225BEi.A1D(C51038Mgo.class));
        this.A03 = AbstractC166987dD.A1E();
    }

    public static final void A00(N65 n65) {
        AbstractC25225BEi.A0r(n65.requireActivity(), MSW.A0h(n65.A04).A02).A06();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2060144653);
        super.onCreate(bundle);
        C51038Mgo A0h = MSW.A0h(this.A04);
        Context requireContext = requireContext();
        LeadGenFormData leadGenFormData = A0h.A06;
        if (leadGenFormData.A04.length() == 0) {
            String A022 = C55205OeH.A02(requireContext);
            C14360o3.A0B(A022, 0);
            leadGenFormData.A04 = A022;
        }
        C0f9.A09(-1780625040, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1933020551);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_lead_gen_create_form, viewGroup, false);
        C0f9.A09(-256843372, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-685860793);
        super.onDestroyView();
        this.A00 = null;
        this.A03.clear();
        C0f9.A09(647858112, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1091322285);
        super.onStart();
        this.A02 = PZH.A01(this, MSW.A0h(this.A04).A0A, 40);
        C0f9.A09(-746303718, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-915431612);
        super.onStop();
        this.A02 = MSY.A0r(this.A02);
        C0f9.A09(1886569171, A02);
    }
}
