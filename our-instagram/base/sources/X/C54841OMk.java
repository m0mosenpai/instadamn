package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.instagram.leadgen.core.model.LeadGenConditionalAnswerInfo;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.model.disqualifyingscreen.LeadGenDisqualifyingScreenData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.OMk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54841OMk {
    public final /* synthetic */ AbstractC52562NNi A00;

    public final void A02(LeadGenFormBaseQuestion leadGenFormBaseQuestion) {
        C14360o3.A0B(leadGenFormBaseQuestion, 0);
        AbstractC52562NNi abstractC52562NNi = this.A00;
        C54976OTi A02 = AbstractC51040Mgq.A02(abstractC52562NNi);
        String A00 = AbstractC52562NNi.A00(abstractC52562NNi);
        String A06 = C55205OeH.A00.A06(leadGenFormBaseQuestion);
        InterfaceC58268PsC.A01(C54976OTi.A00(A02, A00, A06), A02.A00, A02.A01, "lead_gen_multi_step_consumer_questions", "answer_empty");
    }

    public final void A04(LeadGenFormBaseQuestion leadGenFormBaseQuestion, InterfaceC58120Ppj interfaceC58120Ppj, boolean z) {
        C14360o3.A0B(leadGenFormBaseQuestion, 0);
        AbstractC52562NNi abstractC52562NNi = this.A00;
        C54976OTi A02 = AbstractC51040Mgq.A02(abstractC52562NNi);
        C55205OeH c55205OeH = C55205OeH.A00;
        String A07 = c55205OeH.A07(leadGenFormBaseQuestion);
        String A06 = c55205OeH.A06(leadGenFormBaseQuestion);
        C14360o3.A0B(A07, 0);
        InterfaceC58268PsC.A00(C54976OTi.A00(A02, A07, A06), A02.A00, A02.A01, "lead_gen_multi_step_consumer_questions", "open_country_picker_click");
        AbstractC50522MSa.A11(AbstractC50522MSa.A0J(abstractC52562NNi), abstractC52562NNi);
        N42 n42 = new N42();
        AbstractC25227BEk.A1C(n42, AbstractC167007dF.A1b("args_is_form_extension", Boolean.valueOf(MSW.A0d(abstractC52562NNi).A09), MSY.A0n(MSW.A0d(abstractC52562NNi).A0H), AbstractC166987dD.A1L("arg_should_include_country_code", Boolean.valueOf(z))));
        n42.A01 = new C30184DRp(0, leadGenFormBaseQuestion, interfaceC58120Ppj, abstractC52562NNi);
        if (MSW.A0d(abstractC52562NNi).A09) {
            n42.A0B(abstractC52562NNi.getParentFragmentManager(), "lead_gen_multi_step_form");
            return;
        }
        C189458aP c189458aP = new C189458aP(null, null, "", 0, 0);
        c189458aP.A02 = R.drawable.instagram_arrow_back_24;
        c189458aP.A05 = new ViewOnClickListenerC55461OkG(abstractC52562NNi, 29);
        C189468aQ A00 = c189458aP.A00();
        C189448aO A0y = AbstractC25225BEi.A0y(MSW.A0d(abstractC52562NNi).A0H);
        AbstractC31172DnG.A1L(abstractC52562NNi, A0y, 2131964883);
        AbstractC25225BEi.A1Q(A0y, true);
        A0y.A03 = 1.0f;
        A0y.A06(A00);
        A0y.A0T = new PHV(n42, 4);
        AbstractC31177DnL.A14(abstractC52562NNi, n42, A0y);
    }

    public final void A05(LeadGenFormBaseQuestion leadGenFormBaseQuestion, String str, boolean z) {
        LeadGenConditionalAnswerInfo leadGenConditionalAnswerInfo;
        LeadGenFormBaseQuestion leadGenFormBaseQuestion2;
        List list;
        Object obj;
        C14360o3.A0B(str, 1);
        AbstractC52562NNi abstractC52562NNi = this.A00;
        ViewPager2 viewPager2 = abstractC52562NNi.A00;
        if (viewPager2 != null) {
            NOW A0d = MSW.A0d(abstractC52562NNi);
            int i = viewPager2.A00;
            if (!z) {
                A0d.A08 = true;
            }
            String str2 = leadGenFormBaseQuestion.A09;
            C05A c05a = A0d.A0a;
            C51654Mrl A0F = AbstractC50523MSb.A0F(c05a, i);
            if (A0F != null && (list = A0F.A09) != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (C14360o3.A0K(((LeadGenFormBaseQuestion) obj).A09, str2)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                LeadGenFormBaseQuestion leadGenFormBaseQuestion3 = (LeadGenFormBaseQuestion) obj;
                if (leadGenFormBaseQuestion3 != null) {
                    leadGenFormBaseQuestion3.A00 = str;
                }
            }
            Map map = leadGenFormBaseQuestion.A0G;
            if (MSW.A1b(map) && (leadGenConditionalAnswerInfo = (LeadGenConditionalAnswerInfo) map.get(str)) != null) {
                List list2 = leadGenConditionalAnswerInfo.A00;
                if (!list2.isEmpty()) {
                    Map map2 = leadGenConditionalAnswerInfo.A01;
                    if (!map2.isEmpty()) {
                        int i2 = i + 1;
                        C51654Mrl c51654Mrl = (C51654Mrl) AbstractC001800i.A0O(MSW.A1A(c05a), i2);
                        if (c51654Mrl != null && (leadGenFormBaseQuestion2 = (LeadGenFormBaseQuestion) AbstractC001800i.A0O(c51654Mrl.A09, 0)) != null) {
                            LeadGenFormBaseQuestion leadGenFormBaseQuestion4 = new LeadGenFormBaseQuestion(leadGenFormBaseQuestion2.A03, null, leadGenFormBaseQuestion2.A06, leadGenFormBaseQuestion2.A0A, leadGenFormBaseQuestion2.A09, "", leadGenFormBaseQuestion2.A05, leadGenFormBaseQuestion2.A08, null, null, null, list2, null, null, null, map2, 0, false, true, false, false);
                            List subList = MSW.A1A(c05a).subList(0, i2);
                            List A1J = AbstractC166987dD.A1J(leadGenFormBaseQuestion4);
                            EnumC53189Nfl enumC53189Nfl = EnumC53189Nfl.A02;
                            C51761Mtk c51761Mtk = c51654Mrl.A00;
                            boolean z2 = A0d.A09;
                            C16930sl c16930sl = C16930sl.A00;
                            ArrayList A0T = AbstractC001800i.A0T(new C51654Mrl(c51761Mtk, null, null, enumC53189Nfl, null, null, null, null, A1J, c16930sl, c16930sl, false, false, z2, false, false, false, false, false, false, false, false), subList);
                            if (MSW.A1A(c05a).size() > i2) {
                                A0T = AbstractC001800i.A0S(MSW.A1A(c05a).subList(i + 2, MSW.A1A(c05a).size()), A0T);
                            }
                            c05a.Egh(A0T);
                        }
                    }
                }
            }
        }
    }

    public C54841OMk(AbstractC52562NNi abstractC52562NNi) {
        this.A00 = abstractC52562NNi;
    }

    public final void A00() {
        AbstractC52562NNi abstractC52562NNi = this.A00;
        ViewPager2 viewPager2 = abstractC52562NNi.A00;
        if (viewPager2 != null) {
            int i = viewPager2.A00;
            C54976OTi A02 = AbstractC51040Mgq.A02(abstractC52562NNi);
            String A00 = MSW.A0d(abstractC52562NNi).A00(i);
            InterfaceC58268PsC.A00(C54976OTi.A00(A02, A00, null), A02.A00, A02.A01, "lead_gen_multi_step_consumer_questions", "consumer_question_multi_step_page_next_click_error");
        }
    }

    public final void A01() {
        C54976OTi A02 = AbstractC51040Mgq.A02(this.A00);
        InterfaceC58268PsC.A00(AbstractC31178DnM.A06("form_id", A02.A02), A02.A00, A02.A01, "lead_gen_multi_step_consumer_questions", "scroll_to_bottom_for_privacy_view");
    }

    public final void A03(LeadGenFormBaseQuestion leadGenFormBaseQuestion) {
        AbstractC52562NNi abstractC52562NNi = this.A00;
        C54976OTi A02 = AbstractC51040Mgq.A02(abstractC52562NNi);
        String A00 = AbstractC52562NNi.A00(abstractC52562NNi);
        String A06 = C55205OeH.A00.A06(leadGenFormBaseQuestion);
        InterfaceC58268PsC.A01(C54976OTi.A00(A02, A00, A06), A02.A00, A02.A01, "lead_gen_multi_step_consumer_questions", "answer_error");
    }

    public final void A06(boolean z) {
        String str;
        String str2;
        String str3;
        InterfaceC58268PsC interfaceC58268PsC;
        String str4;
        Bundle A00;
        String str5;
        C51116MiL c51116MiL;
        String str6;
        String A0w;
        int i;
        Object obj;
        List list;
        AbstractC52562NNi abstractC52562NNi = this.A00;
        if (z) {
            ViewPager2 viewPager2 = abstractC52562NNi.A00;
            if (viewPager2 != null && (c51116MiL = abstractC52562NNi.A03) != null) {
                if (viewPager2.A00 < c51116MiL.getItemCount() - 1) {
                    C54976OTi A02 = AbstractC51040Mgq.A02(abstractC52562NNi);
                    InterfaceC58268PsC.A00(C54976OTi.A00(A02, MSW.A0d(abstractC52562NNi).A00(viewPager2.A00), null), A02.A00, A02.A01, "lead_gen_multi_step_consumer_questions", "consumer_question_multi_step_page_next_click_success");
                    AbstractC51040Mgq A05 = abstractC52562NNi.A05();
                    C57155PYz.A00(A05, AbstractC141776au.A00(A05), viewPager2.A00, 24);
                    return;
                }
                boolean z2 = MSW.A0d(abstractC52562NNi).A0E;
                C54976OTi A022 = AbstractC51040Mgq.A02(abstractC52562NNi);
                if (z2) {
                    str2 = "lead_gen_multi_step_consumer_questions";
                    InterfaceC58268PsC.A00(AbstractC31178DnM.A06("form_id", A022.A02), A022.A00, A022.A01, "lead_gen_multi_step_consumer_questions", "continue_button_click");
                    AbstractC50522MSa.A11(AbstractC50522MSa.A0J(abstractC52562NNi), abstractC52562NNi);
                    C52111N4j c52111N4j = new C52111N4j();
                    C09530e4 A0n = MSY.A0n(MSW.A0d(abstractC52562NNi).A0H);
                    C09530e4 A1L = AbstractC166987dD.A1L("privacy_policy", MSW.A0d(abstractC52562NNi).A02);
                    C09530e4 A1L2 = AbstractC166987dD.A1L("custom_disclaimer", MSW.A0d(abstractC52562NNi).A00);
                    NOW A0d = MSW.A0d(abstractC52562NNi);
                    if (A0d.A0A) {
                        Iterator it = AbstractC31172DnG.A0w(A0d.A0a).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (((C51654Mrl) obj).A03 == EnumC53189Nfl.A03) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        C51654Mrl c51654Mrl = (C51654Mrl) obj;
                        if (c51654Mrl == null || (list = c51654Mrl.A09) == null) {
                            list = C16930sl.A00;
                        }
                        Object value = A0d.A0J.A0N.getValue();
                        if (value != null) {
                            list = AbstractC001800i.A0T(value, list);
                        }
                        str6 = AbstractC25226BEj.A1H("\n", list, C57644Phu.A00);
                    } else {
                        str6 = "";
                    }
                    c52111N4j.setArguments(AbstractC167027dH.A09("personal_info_to_review", str6, A0n, A1L, A1L2));
                    if (MSW.A0d(abstractC52562NNi).A0A) {
                        i = 2131964899;
                    } else if (MSW.A0d(abstractC52562NNi).A00 != null) {
                        i = 2131964889;
                    } else {
                        A0w = AbstractC31174DnI.A0w(abstractC52562NNi, MSW.A0d(abstractC52562NNi).A03, 2131964901);
                        C14360o3.A0A(A0w);
                        C189448aO A0y = AbstractC25225BEi.A0y(MSW.A0d(abstractC52562NNi).A0H);
                        A0y.A0d = A0w;
                        A0y.A0T = new PHV(c52111N4j, 5);
                        A0y.A0g = abstractC52562NNi.getString(((C52573NNt) abstractC52562NNi).A01);
                        A0y.A0K = ViewOnClickListenerC55465OkK.A00(c52111N4j, abstractC52562NNi, 48);
                        A0y.A1J = true;
                        A0y.A0h = abstractC52562NNi.getString(2131964900);
                        A0y.A0L = new ViewOnClickListenerC55461OkG(abstractC52562NNi, 32);
                        A0y.A1N = true;
                        A0y.A0U = new C56766PHj(abstractC52562NNi, 10);
                        AbstractC31177DnL.A14(abstractC52562NNi, c52111N4j, A0y);
                        C54976OTi A023 = AbstractC51040Mgq.A02(abstractC52562NNi);
                        interfaceC58268PsC = A023.A00;
                        str4 = A023.A01;
                        A00 = AbstractC31178DnM.A06("form_id", A023.A02);
                        str5 = "privacy_policy_bottom_sheet_impression";
                    }
                    A0w = abstractC52562NNi.getString(i);
                    C14360o3.A0A(A0w);
                    C189448aO A0y2 = AbstractC25225BEi.A0y(MSW.A0d(abstractC52562NNi).A0H);
                    A0y2.A0d = A0w;
                    A0y2.A0T = new PHV(c52111N4j, 5);
                    A0y2.A0g = abstractC52562NNi.getString(((C52573NNt) abstractC52562NNi).A01);
                    A0y2.A0K = ViewOnClickListenerC55465OkK.A00(c52111N4j, abstractC52562NNi, 48);
                    A0y2.A1J = true;
                    A0y2.A0h = abstractC52562NNi.getString(2131964900);
                    A0y2.A0L = new ViewOnClickListenerC55461OkG(abstractC52562NNi, 32);
                    A0y2.A1N = true;
                    A0y2.A0U = new C56766PHj(abstractC52562NNi, 10);
                    AbstractC31177DnL.A14(abstractC52562NNi, c52111N4j, A0y2);
                    C54976OTi A0232 = AbstractC51040Mgq.A02(abstractC52562NNi);
                    interfaceC58268PsC = A0232.A00;
                    str4 = A0232.A01;
                    A00 = AbstractC31178DnM.A06("form_id", A0232.A02);
                    str5 = "privacy_policy_bottom_sheet_impression";
                } else {
                    InterfaceC58268PsC.A00(AbstractC31178DnM.A06("form_id", A022.A02), A022.A00, A022.A01, "lead_gen_multi_step_consumer_questions", "submit_button_click");
                    AbstractC52562NNi.A03(abstractC52562NNi, null);
                    return;
                }
            } else {
                return;
            }
        } else {
            LeadGenDisqualifyingScreenData leadGenDisqualifyingScreenData = MSW.A0d(abstractC52562NNi).A01;
            C189448aO A0y3 = AbstractC25225BEi.A0y(MSW.A0d(abstractC52562NNi).A0H);
            LeadGenDisqualifyingScreenData leadGenDisqualifyingScreenData2 = MSW.A0d(abstractC52562NNi).A01;
            String str7 = null;
            if (leadGenDisqualifyingScreenData2 != null) {
                str = leadGenDisqualifyingScreenData2.A02;
            } else {
                str = null;
            }
            A0y3.A0g = str;
            A0y3.A1J = true;
            str2 = "lead_gen_disqualifying_bottom_sheet";
            A0y3.A0K = new ViewOnClickListenerC55461OkG(abstractC52562NNi, 30);
            A0y3.A0h = abstractC52562NNi.getString(2131961124);
            A0y3.A1N = true;
            A0y3.A0L = new ViewOnClickListenerC55461OkG(abstractC52562NNi, 31);
            A0y3.A0U = new C56766PHj(abstractC52562NNi, 9);
            C189478aR A002 = A0y3.A00();
            FragmentActivity requireActivity = abstractC52562NNi.requireActivity();
            if (leadGenDisqualifyingScreenData != null) {
                str3 = leadGenDisqualifyingScreenData.A01;
                str7 = leadGenDisqualifyingScreenData.A00;
            } else {
                str3 = null;
            }
            N4A n4a = new N4A();
            AbstractC25227BEk.A1C(n4a, AbstractC167007dF.A1b("confirmation_description", str7, MSY.A0n(MSW.A0d(abstractC52562NNi).A0H), AbstractC166987dD.A1L("confirmation_title", str3)));
            A002.A02(requireActivity, n4a);
            C54975OTh c54975OTh = MSW.A0d(abstractC52562NNi).A0L;
            String A003 = AbstractC52562NNi.A00(abstractC52562NNi);
            interfaceC58268PsC = c54975OTh.A00;
            str4 = c54975OTh.A01;
            A00 = C54975OTh.A00(c54975OTh, A003);
            str5 = "bottom_sheet_impression";
        }
        InterfaceC58268PsC.A01(A00, interfaceC58268PsC, str4, str2, str5);
    }
}
