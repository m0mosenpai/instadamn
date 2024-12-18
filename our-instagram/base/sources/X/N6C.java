package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.ui.LeadGenFormHeaderView;
import com.instagram.leadgen.core.ui.LeadGenFormHeaderViewWithoutWelcomeMessage;
import com.instagram.leadgen.organic.model.LeadGenConsumerFormData;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class N6C extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LeadGenConsumerFragmentV2";
    public View A00;
    public NestedScrollView A01;
    public IgLinearLayout A02;
    public IgLinearLayout A03;
    public IgTextView A04;
    public IgdsBottomButtonLayout A05;
    public LeadGenFormHeaderView A06;
    public LeadGenFormHeaderViewWithoutWelcomeMessage A07;
    public SpinnerImageView A08;
    public C3I9 A09;
    public AnonymousClass195 A0A;
    public final Rect A0B;
    public final ViewTreeObserver.OnPreDrawListener A0C;
    public final Map A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC60152ox A0H;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "organic_lead_gen_consumer";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = view.requireViewById(R.id.main_container);
        C3I8 A01 = C3I7.A01(this, false, false);
        this.A09 = A01;
        A01.A9e(this.A0H);
        InterfaceC09390do interfaceC09390do = this.A0G;
        C50964MfX A0g = MSW.A0g(interfaceC09390do);
        LeadGenConsumerFormData leadGenConsumerFormData = A0g.A0D;
        if (leadGenConsumerFormData != null) {
            A0g.A00 = leadGenConsumerFormData.A09;
            A0g.A03 = leadGenConsumerFormData.A0D;
            C05A c05a = A0g.A0J;
            AbstractC166997dE.A1Y(c05a, leadGenConsumerFormData.A0C);
            if (!AbstractC31176DnK.A1b(c05a)) {
                P4W p4w = A0g.A0C;
                String str = A0g.A00;
                boolean z = A0g.A03;
                C14360o3.A0B(str, 0);
                P4W.A01(p4w, "consumer_question_screen_impression", "impression", str, z);
            }
            List list = leadGenConsumerFormData.A0B;
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC50523MSb.A1P(A1E, it);
            }
            C05A c05a2 = A0g.A0H;
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AbstractC50523MSb.A1O(A1E2, it2);
            }
            c05a2.Egh(A1E2);
            A0g.A0G.Egh(A1E);
            C05A c05a3 = A0g.A0K;
            String str2 = leadGenConsumerFormData.A07;
            ImageUrl imageUrl = leadGenConsumerFormData.A03;
            int i = leadGenConsumerFormData.A01;
            int size = A1E.size();
            c05a3.Egh(new C51633MrQ(C55205OeH.A01(leadGenConsumerFormData.A0A), imageUrl, leadGenConsumerFormData.A04, C05F.A00, str2, C16930sl.A00, i, size, true));
            A0g.A0L.Egh(leadGenConsumerFormData.A05);
            A0g.A0I.Egh(new C51761Mtk((C5QE) null, (Integer) null, 2));
        }
        this.A08 = AbstractC31180DnO.A0V(view);
        this.A01 = (NestedScrollView) view.requireViewById(R.id.form_scrolling_area);
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), MSW.A0g(interfaceC09390do).A09, new C57743PjW(this, 30), 47);
        C57743PjW.A00(getViewLifecycleOwner(), MSW.A0g(interfaceC09390do).A08, this, 31, 47);
        this.A05 = AbstractC31172DnG.A0j(view, R.id.bottom_button_layout);
        C57743PjW.A00(getViewLifecycleOwner(), MSW.A0g(interfaceC09390do).A06, this, 32, 47);
        C57743PjW.A00(getViewLifecycleOwner(), MSW.A0g(interfaceC09390do).A05, this, 33, 47);
        C57743PjW.A00(getViewLifecycleOwner(), MSW.A0g(interfaceC09390do).A04, this, 34, 47);
        LeadGenFormHeaderView leadGenFormHeaderView = (LeadGenFormHeaderView) view.findViewById(R.id.lead_form_header_view);
        this.A06 = leadGenFormHeaderView;
        int A02 = MSY.A02(leadGenFormHeaderView);
        this.A07 = (LeadGenFormHeaderViewWithoutWelcomeMessage) view.findViewById(R.id.lead_form_header_view_without_welcome_message);
        this.A02 = (IgLinearLayout) view.findViewById(R.id.custom_questions_container);
        this.A03 = (IgLinearLayout) view.findViewById(R.id.customer_info_questions_container);
        IgTextView A0Y = AbstractC31172DnG.A0Y(view, R.id.inline_legal_text);
        this.A04 = A0Y;
        if (A0Y != null) {
            AbstractC25227BEk.A11(A0Y);
        }
        C57743PjW.A00(getViewLifecycleOwner(), MSW.A0g(interfaceC09390do).A0A, this, 35, 47);
        C57743PjW.A00(getViewLifecycleOwner(), MSW.A0g(interfaceC09390do).A07, this, 36, 47);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new PZP(viewLifecycleOwner, c07s, this, null, 23), C07Y.A00(viewLifecycleOwner));
        AbstractC166997dE.A0S(view, R.id.preview_warning_banner).setVisibility(A02);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return MSW.A0g(this.A0G).A0B;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC09390do interfaceC09390do = this.A0G;
        C50964MfX A0g = MSW.A0g(interfaceC09390do);
        P4W p4w = A0g.A0C;
        String str = A0g.A00;
        boolean z = A0g.A03;
        C14360o3.A0B(str, 0);
        P4W.A01(p4w, "cancel", "click", str, z);
        Iterator A16 = AbstractC166997dE.A16(this.A0D);
        while (A16.hasNext()) {
            if (((AbstractC50822Mcy) A16.next()).A05) {
                C50674MYs c50674MYs = new C50674MYs(requireContext(), MSW.A0g(interfaceC09390do).A0B);
                C15370ps A1F = AbstractC25225BEi.A1F();
                c50674MYs.A07(requireContext().getString(2131964890));
                ViewOnClickListenerC55461OkG.A01(c50674MYs, this, 41, 2131964892);
                c50674MYs.A03(ViewOnClickListenerC55465OkK.A00(A1F, this, 59), 2131964893);
                C31727DwY c31727DwY = new C31727DwY(c50674MYs);
                A1F.A00 = c31727DwY;
                c31727DwY.A05(requireActivity());
                C50964MfX A0g2 = MSW.A0g(interfaceC09390do);
                P4W p4w2 = A0g2.A0C;
                String str2 = A0g2.A00;
                boolean z2 = A0g2.A03;
                C14360o3.A0B(str2, 0);
                P4W.A01(p4w2, "discard_confirmation_dialog_impression", "impression", str2, z2);
                return true;
            }
        }
        A01(this);
        return true;
    }

    public N6C() {
        C57544PgI A01 = C57544PgI.A01(this, 24);
        C57544PgI A012 = C57544PgI.A01(this, 16);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = C57544PgI.A00(A012, enumC09460dv, 17);
        this.A0G = AbstractC25225BEi.A0a(C57544PgI.A01(A00, 18), A01, C57534Pg8.A00(A00, null, 26), AbstractC25225BEi.A1D(C50964MfX.class));
        C57544PgI A013 = C57544PgI.A01(this, 22);
        InterfaceC09390do A002 = C57544PgI.A00(C57544PgI.A01(this, 19), enumC09460dv, 20);
        this.A0E = AbstractC25225BEi.A0a(C57544PgI.A01(A002, 21), A013, C57534Pg8.A00(A002, null, 27), AbstractC25225BEi.A1D(C50921Meq.class));
        C57544PgI A014 = C57544PgI.A01(this, 23);
        InterfaceC09390do A003 = C57544PgI.A00(C57544PgI.A01(this, 13), enumC09460dv, 14);
        this.A0F = AbstractC25225BEi.A0a(C57544PgI.A01(A003, 15), A014, C57534Pg8.A00(A003, null, 25), AbstractC25225BEi.A1D(C50992Mfz.class));
        this.A0D = AbstractC166987dD.A1I();
        this.A0H = new C56177Owk(this, 8);
        this.A0B = AbstractC166987dD.A0U();
        this.A0C = new ViewTreeObserverOnPreDrawListenerC55503Okw(this, 9);
    }

    public static final void A00(IgLinearLayout igLinearLayout, N6C n6c, List list) {
        AbstractC50822Mcy abstractC50822Mcy;
        igLinearLayout.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LeadGenFormBaseQuestion leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) it.next();
            int ordinal = leadGenFormBaseQuestion.A03.ordinal();
            if (ordinal != 33) {
                if (ordinal != 0) {
                    abstractC50822Mcy = new NO5(n6c.requireContext(), null, 0);
                } else {
                    abstractC50822Mcy = AbstractC50822Mcy.A00(n6c, leadGenFormBaseQuestion);
                }
            } else {
                abstractC50822Mcy = null;
            }
            C55205OeH c55205OeH = C55205OeH.A00;
            String A07 = c55205OeH.A07(leadGenFormBaseQuestion);
            c55205OeH.A06(leadGenFormBaseQuestion);
            if (abstractC50822Mcy != null) {
                n6c.A0D.put(leadGenFormBaseQuestion, abstractC50822Mcy);
                abstractC50822Mcy.setEnabled(true);
                abstractC50822Mcy.A0G(leadGenFormBaseQuestion, true, false, false);
                if (AbstractC31174DnI.A1a(EnumC53203Nfz.A03, A07)) {
                    abstractC50822Mcy.A01 = C56443P4e.A00;
                } else {
                    abstractC50822Mcy.A02 = C56447P4i.A00;
                }
                igLinearLayout.addView(abstractC50822Mcy);
            }
            InterfaceC09390do interfaceC09390do = n6c.A0G;
            if (!AbstractC166997dE.A1Z(MSW.A0g(interfaceC09390do).A07.A02(), true)) {
                C50964MfX A0g = MSW.A0g(interfaceC09390do);
                C14360o3.A0B(A07, 0);
                P4W p4w = A0g.A0C;
                String str = A0g.A00;
                boolean z = A0g.A03;
                C14360o3.A0B(str, 0);
                P4W.A02(p4w, "question_impression", str, A07, z);
                if (leadGenFormBaseQuestion.A01) {
                    C50964MfX A0g2 = MSW.A0g(interfaceC09390do);
                    P4W p4w2 = A0g2.A0C;
                    String str2 = A0g2.A00;
                    boolean z2 = A0g2.A03;
                    C14360o3.A0B(str2, 0);
                    P4W.A02(p4w2, "answer_prefilled", str2, A07, z2);
                }
            }
        }
    }

    public static final void A01(N6C n6c) {
        int i;
        String str = "lead_gen_consumer_initialization";
        Fragment A0Q = n6c.getParentFragmentManager().A0Q("lead_gen_consumer_initialization");
        C140966Yy A0r = AbstractC25225BEi.A0r(n6c.requireActivity(), MSW.A0g(n6c.A0G).A0B);
        if (A0Q != null) {
            i = 1;
        } else {
            str = null;
            i = 0;
        }
        A0r.A0G(str, i);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31180DnO.A1Q(interfaceC56362iU);
        AbstractC31179DnN.A1G(interfaceC56362iU);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1273144434);
        C14360o3.A0B(layoutInflater, 0);
        EVO.A01(this);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_form_preview, viewGroup, false);
        C0f9.A09(24726589, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-650821951);
        super.onDestroy();
        C3I9 c3i9 = this.A09;
        if (c3i9 != null) {
            c3i9.onDestroy();
        }
        C0f9.A09(-357699665, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ViewTreeObserver viewTreeObserver;
        int A02 = C0f9.A02(-1794234003);
        super.onDestroyView();
        this.A00 = null;
        C3I9 c3i9 = this.A09;
        if (c3i9 != null) {
            c3i9.EFx(this.A0H);
        }
        IgTextView igTextView = this.A04;
        if (igTextView != null && (viewTreeObserver = igTextView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this.A0C);
        }
        this.A06 = null;
        this.A07 = null;
        this.A02 = null;
        this.A03 = null;
        this.A05 = null;
        this.A04 = null;
        this.A01 = null;
        C0f9.A09(-610647817, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1738309947);
        super.onPause();
        AbstractC13880nE.A0O(this.mView);
        C0f9.A09(-375985968, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1874794372);
        super.onStart();
        C3I9 c3i9 = this.A09;
        if (c3i9 != null) {
            MSX.A16(this, c3i9);
        }
        this.A0A = PZH.A01(this, ((C50921Meq) this.A0E.getValue()).A03, 37);
        C0f9.A09(313971834, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1009467491);
        super.onStop();
        C3I9 c3i9 = this.A09;
        if (c3i9 != null) {
            c3i9.onStop();
        }
        this.A0A = MSY.A0r(this.A0A);
        C0f9.A09(1913486340, A02);
    }
}
