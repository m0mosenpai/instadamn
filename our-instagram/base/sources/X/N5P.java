package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.ui.LeadGenFormHeaderView;
import com.instagram.leadgen.core.ui.LeadGenFormHeaderViewWithoutWelcomeMessage;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class N5P extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LeadGenPreviewFragmentV2";
    public IgLinearLayout A00;
    public IgLinearLayout A01;
    public IgTextView A02;
    public IgdsBottomButtonLayout A03;
    public LeadGenFormHeaderViewWithoutWelcomeMessage A04;
    public SpinnerImageView A05;
    public LeadGenFormHeaderView A06;
    public AnonymousClass195 A07;
    public final InterfaceC09390do A08;
    public final Map A09;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "organic_lead_gen_form_preview";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A08;
        C50963MfW c50963MfW = (C50963MfW) interfaceC09390do.getValue();
        boolean z = c50963MfW.A0G;
        P4X p4x = c50963MfW.A08;
        Long l = c50963MfW.A09;
        String str3 = c50963MfW.A0A;
        if (z) {
            C14360o3.A0B(str3, 1);
            str = "lead_gen_review_form";
            str2 = "review_lead_gen_form_impression";
        } else {
            C14360o3.A0B(str3, 1);
            str = "lead_gen_preview_form";
            str2 = "preview_lead_gen_form_impression";
        }
        P4X.A03(p4x, l, str, str2, str3);
        this.A05 = AbstractC31180DnO.A0V(view);
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), ((C50963MfW) interfaceC09390do.getValue()).A04, new C57743PjW(this, 45), 53);
        C57743PjW.A00(getViewLifecycleOwner(), ((C50963MfW) interfaceC09390do.getValue()).A03, this, 46, 53);
        this.A03 = AbstractC31172DnG.A0j(view, R.id.bottom_button_layout);
        C57743PjW.A00(getViewLifecycleOwner(), ((C50963MfW) interfaceC09390do.getValue()).A02, this, 47, 53);
        C57743PjW.A00(getViewLifecycleOwner(), ((C50963MfW) interfaceC09390do.getValue()).A01, this, 48, 53);
        C57743PjW.A00(getViewLifecycleOwner(), ((C50963MfW) interfaceC09390do.getValue()).A00, this, 49, 53);
        LeadGenFormHeaderView leadGenFormHeaderView = (LeadGenFormHeaderView) view.findViewById(R.id.lead_form_header_view);
        this.A06 = leadGenFormHeaderView;
        AbstractC167007dF.A0x(leadGenFormHeaderView);
        this.A04 = (LeadGenFormHeaderViewWithoutWelcomeMessage) view.findViewById(R.id.lead_form_header_view_without_welcome_message);
        this.A00 = (IgLinearLayout) view.findViewById(R.id.custom_questions_container);
        this.A01 = (IgLinearLayout) view.findViewById(R.id.customer_info_questions_container);
        IgTextView A0Y = AbstractC31172DnG.A0Y(view, R.id.inline_legal_text);
        this.A02 = A0Y;
        if (A0Y != null) {
            AbstractC25227BEk.A11(A0Y);
        }
        C50963MfW c50963MfW2 = (C50963MfW) interfaceC09390do.getValue();
        AbstractC25232BEp.A1J(c50963MfW2, new PZM(c50963MfW2, null, 16), new OMD(c50963MfW2.A07).A02(c50963MfW2.A0B, c50963MfW2.A06.A00));
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), ((C50963MfW) interfaceC09390do.getValue()).A05, C57745PjY.A00(this, 0), 53);
        AbstractC166997dE.A0S(view, R.id.preview_warning_banner).setVisibility(0);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return ((C50963MfW) this.A08.getValue()).A07;
    }

    public N5P() {
        C37015GSu c37015GSu = new C37015GSu(this, 4);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37015GSu(new C37015GSu(this, 1), 2));
        this.A08 = AbstractC25225BEi.A0a(new C37015GSu(A00, 3), c37015GSu, C57534Pg8.A00(A00, null, 47), AbstractC25225BEi.A1D(C50963MfW.class));
        this.A09 = AbstractC166987dD.A1I();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X.NO5, X.NNy] */
    public static final void A00(IgLinearLayout igLinearLayout, N5P n5p, List list) {
        AbstractC50822Mcy abstractC50822Mcy;
        igLinearLayout.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LeadGenFormBaseQuestion leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) it.next();
            int ordinal = leadGenFormBaseQuestion.A03.ordinal();
            if (ordinal != 33) {
                if (ordinal != 0) {
                    if (ordinal != 10) {
                        abstractC50822Mcy = new NO5(n5p.requireContext(), null, 0);
                    } else {
                        ?? no5 = new NO5(n5p.requireContext(), null, 0);
                        no5.A00 = null;
                        abstractC50822Mcy = no5;
                    }
                } else {
                    abstractC50822Mcy = AbstractC50822Mcy.A00(n5p, leadGenFormBaseQuestion);
                }
                AbstractC50822Mcy abstractC50822Mcy2 = abstractC50822Mcy;
                if (abstractC50822Mcy2 != null) {
                    n5p.A09.put(leadGenFormBaseQuestion, abstractC50822Mcy2);
                    abstractC50822Mcy2.setEnabled(false);
                    abstractC50822Mcy2.A0G(leadGenFormBaseQuestion, false, false, false);
                    igLinearLayout.addView(abstractC50822Mcy2);
                }
            }
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31180DnO.A1Q(interfaceC56362iU);
        AbstractC31179DnN.A1G(interfaceC56362iU);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1930566239);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_form_preview, viewGroup, false);
        C0f9.A09(249616064, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(107703101);
        super.onDestroyView();
        this.A06 = null;
        this.A04 = null;
        this.A00 = null;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
        this.A05 = null;
        C0f9.A09(-1202460531, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(2008389492);
        super.onStart();
        this.A07 = PZH.A01(this, ((C50963MfW) this.A08.getValue()).A0D, 46);
        C0f9.A09(1759815954, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(776065195);
        super.onStop();
        this.A07 = MSY.A0r(this.A07);
        C0f9.A09(1547695357, A02);
    }
}
