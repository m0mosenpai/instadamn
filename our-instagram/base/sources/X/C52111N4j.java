package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimer;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerBody;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerBodyUrlRanges;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerCheckbox;
import com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.N4j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52111N4j extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "LeadGenSubmissionBottomSheetFragment";
    public View A00;
    public NestedScrollView A01;
    public IgLinearLayout A02;
    public IgTextView A03;
    public final Rect A04;
    public final ViewTreeObserver.OnPreDrawListener A05;
    public final InterfaceC09390do A06;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "lead_gen_submission_bottom_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        LeadGenPrivacyPolicy leadGenPrivacyPolicy;
        ViewTreeObserver viewTreeObserver;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = (NestedScrollView) view.requireViewById(R.id.scroll_view);
        InterfaceC09390do interfaceC09390do = this.A06;
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), MSW.A0f(interfaceC09390do).A01, new C57743PjW(this, 28), 45);
        if (AbstractC001900j.A0T(MSW.A0f(interfaceC09390do).A05)) {
            AbstractC166997dE.A0S(view, R.id.personal_info_group).setVisibility(8);
        } else {
            AbstractC166997dE.A0T(view, R.id.personal_info_body).setText(MSW.A0f(interfaceC09390do).A05);
        }
        LeadGenCustomDisclaimer leadGenCustomDisclaimer = MSW.A0f(interfaceC09390do).A03;
        int i = 8;
        if (leadGenCustomDisclaimer == null) {
            AbstractC166997dE.A0S(view, R.id.custom_disclaimer_group).setVisibility(8);
        } else {
            TextView A0N = AbstractC167007dF.A0N(view, R.id.custom_disclaimer_title);
            String str2 = leadGenCustomDisclaimer.A01;
            A0N.setText(str2);
            if (str2 != null && AbstractC25225BEi.A1Y(str2)) {
                i = 0;
            }
            A0N.setVisibility(i);
            TextView A0N2 = AbstractC167007dF.A0N(view, R.id.custom_disclaimer_body);
            AbstractC25227BEk.A11(A0N2);
            LeadGenCustomDisclaimerBody leadGenCustomDisclaimerBody = leadGenCustomDisclaimer.A00;
            Context A0L = AbstractC166997dE.A0L(view);
            String str3 = leadGenCustomDisclaimerBody.A00;
            InterfaceC09390do interfaceC09390do2 = AbstractC13670mt.A09;
            if (str3 == null) {
                str3 = "";
            }
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(str3);
            for (LeadGenCustomDisclaimerBodyUrlRanges leadGenCustomDisclaimerBodyUrlRanges : leadGenCustomDisclaimerBody.A01) {
                int i2 = leadGenCustomDisclaimerBodyUrlRanges.A01;
                int i3 = i2 + leadGenCustomDisclaimerBodyUrlRanges.A00;
                if (i3 < A0H.length() && (str = leadGenCustomDisclaimerBodyUrlRanges.A02) != null) {
                    A0H.setSpan(new C50767MbY(A0L, AbstractC25227BEk.A0B(str), MSW.A0f(interfaceC09390do).A02, false), i2, i3, 33);
                }
            }
            A0N2.setText(A0H);
            this.A02 = (IgLinearLayout) view.requireViewById(R.id.custom_disclaimer_checkbox_container);
            for (LeadGenCustomDisclaimerCheckbox leadGenCustomDisclaimerCheckbox : leadGenCustomDisclaimer.A02) {
                IgLinearLayout igLinearLayout = this.A02;
                if (igLinearLayout != null) {
                    View inflate = getLayoutInflater().inflate(R.layout.lead_gen_view_checkbox_row, (ViewGroup) this.A02, false);
                    inflate.setTag(leadGenCustomDisclaimerCheckbox.A00);
                    TextView A0N3 = AbstractC167007dF.A0N(inflate, R.id.checkbox_title);
                    String str4 = leadGenCustomDisclaimerCheckbox.A01;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String A0v = AbstractC25227BEk.A0v(this, 2131964844);
                    if (!leadGenCustomDisclaimerCheckbox.A03) {
                        str4 = AbstractC43592JPx.A10(str4, A0v);
                    }
                    A0N3.setText(str4);
                    CompoundButton compoundButton = (CompoundButton) AbstractC166997dE.A0R(inflate, R.id.checkbox);
                    C55518OlC.A00(compoundButton, leadGenCustomDisclaimerCheckbox, this, 6);
                    compoundButton.setChecked(leadGenCustomDisclaimerCheckbox.A02);
                    igLinearLayout.addView(inflate);
                }
            }
        }
        int i4 = R.id.privacy_policy_text_view;
        IgTextView A0X = AbstractC31172DnG.A0X(view, R.id.privacy_policy_text_view);
        this.A03 = A0X;
        if (A0X != null && (viewTreeObserver = A0X.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(this.A05);
        }
        IgTextView igTextView = this.A03;
        if (igTextView != null && (leadGenPrivacyPolicy = MSW.A0f(interfaceC09390do).A04) != null) {
            AbstractC54048Nuy.A00(igTextView, MSW.A0f(interfaceC09390do).A02, leadGenPrivacyPolicy, false);
        }
        if (AbstractC25225BEi.A1Y(MSW.A0f(interfaceC09390do).A05)) {
            i4 = R.id.personal_info_title;
        } else if (MSW.A0f(interfaceC09390do).A03 != null) {
            i4 = R.id.custom_disclaimer_title;
        }
        this.A00 = view.requireViewById(i4);
    }

    public final List A00() {
        List list;
        C50998Mg5 A0f = MSW.A0f(this.A06);
        LeadGenCustomDisclaimer leadGenCustomDisclaimer = A0f.A03;
        if (leadGenCustomDisclaimer != null && (list = leadGenCustomDisclaimer.A02) != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object obj = A0f.A06.get(((LeadGenCustomDisclaimerCheckbox) it.next()).A00);
                if (obj != null) {
                    A1E.add(obj);
                }
            }
            return A1E;
        }
        return null;
    }

    public final void A01() {
        InterfaceC09390do interfaceC09390do = this.A06;
        String A14 = MSW.A14(MSW.A1A(MSW.A0f(interfaceC09390do).A07), 0);
        if (A14 != null) {
            AbstractC166997dE.A1Y(MSW.A0f(interfaceC09390do).A08, true);
            IgLinearLayout igLinearLayout = this.A02;
            if (igLinearLayout != null) {
                igLinearLayout.post(new RunnableC57004PQu(this, A14));
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return MSW.A0f(this.A06).A02;
    }

    public C52111N4j() {
        C57554PgS A01 = C57554PgS.A01(this, 48);
        InterfaceC09390do A00 = C57554PgS.A00(C57554PgS.A01(this, 45), EnumC09460dv.A02, 46);
        this.A06 = AbstractC25225BEi.A0a(C57554PgS.A01(A00, 47), A01, C57534Pg8.A00(A00, null, 17), AbstractC25225BEi.A1D(C50998Mg5.class));
        this.A04 = AbstractC166987dD.A0U();
        this.A05 = new ViewTreeObserverOnPreDrawListenerC55503Okw(this, 7);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(768223807);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_lead_gen_submission_bottom_sheet, false);
        C0f9.A09(-1070941881, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ViewTreeObserver viewTreeObserver;
        int A02 = C0f9.A02(1207258141);
        super.onDestroyView();
        IgTextView igTextView = this.A03;
        if (igTextView != null && (viewTreeObserver = igTextView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this.A05);
        }
        this.A03 = null;
        this.A01 = null;
        this.A00 = null;
        this.A02 = null;
        C0f9.A09(2128287868, A02);
    }
}
