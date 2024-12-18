package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.leadads.repository.LeadFormQuestionsRepository;
import com.instagram.leadads.repository.LeadFormRepository;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.model.LeadGenProfileContentInfo;
import com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimer;
import com.instagram.leadgen.core.model.disqualifyingscreen.LeadGenDisqualifyingScreenData;
import com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class NOW extends AbstractC51040Mgq {
    public LeadGenCustomDisclaimer A00;
    public LeadGenDisqualifyingScreenData A01;
    public LeadGenPrivacyPolicy A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final UserSession A0H;
    public final P4V A0I;
    public final LeadFormQuestionsRepository A0J;
    public final LeadFormRepository A0K;
    public final C54975OTh A0L;
    public final C54976OTi A0M;
    public final O3V A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final InterfaceC24731Iq A0X;
    public final InterfaceC19390xP A0Y;
    public final C05A A0Z;
    public final C05A A0a;
    public final C05A A0b;
    public final C05A A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;

    public final void A04(String str) {
        User A2E;
        String fbidV2;
        String str2 = this.A0O;
        if (str2 != null) {
            UserSession userSession = this.A0H;
            C38321qM A02 = C1DW.A00(userSession).A02(this.A0W);
            if (A02 != null && (A2E = A02.A2E(userSession)) != null && (fbidV2 = A2E.A03.getFbidV2()) != null) {
                AbstractC166987dD.A1Z(new D50(this, A02, str2, fbidV2, str, null, 5), C2SW.A00);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x03c6, code lost:
    
        if (r3 != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03cf, code lost:
    
        if (r3 != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0419, code lost:
    
        if (r15 == 0) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x01bd, code lost:
    
        if (r48.A09 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01e5, code lost:
    
        if (X.AbstractC31171DnF.A1b(r5) != true) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0260, code lost:
    
        if (X.AbstractC31177DnL.A1U(X.C06090Tz.A06, r11, 36317882677728914L) != false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b8 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ NOW(X.C152406tQ r49, com.instagram.common.session.UserSession r50, X.P4V r51) {
        /*
            Method dump skipped, instructions count: 1233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NOW.<init>(X.6tQ, com.instagram.common.session.UserSession, X.P4V):void");
    }

    public final String A00(int i) {
        EnumC53189Nfl enumC53189Nfl;
        String obj;
        C51654Mrl A0F = AbstractC50523MSb.A0F(this.A0a, i);
        if (A0F == null || (enumC53189Nfl = A0F.A03) == null || (obj = enumC53189Nfl.toString()) == null) {
            return "Unknown";
        }
        return obj;
    }

    public final List A01() {
        boolean z;
        Iterable A0w = AbstractC31172DnG.A0w(this.A0a);
        ArrayList A0q = AbstractC167017dG.A0q(A0w);
        Iterator it = A0w.iterator();
        while (it.hasNext()) {
            A0q.add(((C51654Mrl) it.next()).A09);
        }
        ArrayList A1F = AbstractC06950Ym.A1F(A0q);
        if (!(A1F instanceof Collection) || !A1F.isEmpty()) {
            Iterator it2 = A1F.iterator();
            while (it2.hasNext()) {
                if (AbstractC16960so.A1Q(VEF.A0U, VEF.A0V).contains(((LeadGenFormBaseQuestion) it2.next()).A03)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        LeadFormQuestionsRepository leadFormQuestionsRepository = this.A0J;
        if (leadFormQuestionsRepository.A07 && !z) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it3 = A1F.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                VEF vef = ((LeadGenFormBaseQuestion) next).A03;
                if (vef != VEF.A0a && vef != VEF.A0Q) {
                    A1E.add(next);
                }
            }
            return A1E;
        }
        Object value = leadFormQuestionsRepository.A0N.getValue();
        if (value != null) {
            return AbstractC001800i.A0T(value, A1F);
        }
        return A1F;
    }

    public final void A02(int i) {
        EnumC53189Nfl enumC53189Nfl;
        String str;
        EnumC53189Nfl enumC53189Nfl2;
        LeadGenTrustSignalsPayload leadGenTrustSignalsPayload;
        Integer num;
        InterfaceC58268PsC interfaceC58268PsC;
        String str2;
        Bundle A06;
        String str3;
        String str4;
        C05A c05a = this.A0a;
        C51654Mrl A0F = AbstractC50523MSb.A0F(c05a, i);
        if (A0F != null) {
            enumC53189Nfl = A0F.A03;
            if (enumC53189Nfl != null) {
                int ordinal = enumC53189Nfl.ordinal();
                if (ordinal != 8) {
                    if (ordinal != 11) {
                        if (ordinal == 9) {
                            C54976OTi c54976OTi = this.A0M;
                            interfaceC58268PsC = c54976OTi.A00;
                            str2 = c54976OTi.A01;
                            A06 = AbstractC31178DnM.A06("form_id", c54976OTi.A02);
                            str3 = "lead_gen_conditional_question_disqualifying_screen";
                            str4 = "disqualifying_screen_impression";
                        }
                    } else {
                        C54976OTi c54976OTi2 = this.A0M;
                        interfaceC58268PsC = c54976OTi2.A00;
                        str2 = c54976OTi2.A01;
                        A06 = AbstractC31178DnM.A06("form_id", c54976OTi2.A02);
                        str3 = "lead_gen_conditional_question_error_screen";
                        str4 = "error_screen_impression";
                    }
                } else {
                    C54976OTi c54976OTi3 = this.A0M;
                    interfaceC58268PsC = c54976OTi3.A00;
                    str2 = c54976OTi3.A01;
                    A06 = AbstractC31178DnM.A06("form_id", c54976OTi3.A02);
                    str3 = "lead_gen_conditional_question_loading_screen";
                    str4 = "loading_screen_impression";
                }
                InterfaceC58268PsC.A01(A06, interfaceC58268PsC, str2, str3, str4);
                return;
            }
        } else {
            enumC53189Nfl = null;
        }
        C54976OTi c54976OTi4 = this.A0M;
        if (enumC53189Nfl == null || (str = enumC53189Nfl.toString()) == null) {
            str = "Unknown";
        }
        InterfaceC58268PsC interfaceC58268PsC2 = c54976OTi4.A00;
        String str5 = c54976OTi4.A01;
        interfaceC58268PsC2.Ci4(C54976OTi.A00(c54976OTi4, str, null), str5, "lead_gen_multi_step_consumer_questions", "consumer_question_multi_step_page_impression", "impression");
        C51654Mrl A0F2 = AbstractC50523MSb.A0F(c05a, i);
        if (A0F2 != null) {
            List<LeadGenFormBaseQuestion> list = A0F2.A09;
            if (list != null) {
                for (LeadGenFormBaseQuestion leadGenFormBaseQuestion : list) {
                    C55205OeH c55205OeH = C55205OeH.A00;
                    String A07 = c55205OeH.A07(leadGenFormBaseQuestion);
                    String A062 = c55205OeH.A06(leadGenFormBaseQuestion);
                    C14360o3.A0B(A07, 0);
                    interfaceC58268PsC2.Ci4(C54976OTi.A00(c54976OTi4, A07, A062), str5, "lead_gen_multi_step_consumer_questions", "question_impression", "impression");
                    if (leadGenFormBaseQuestion.A01) {
                        String A072 = c55205OeH.A07(leadGenFormBaseQuestion);
                        String A063 = c55205OeH.A06(leadGenFormBaseQuestion);
                        C14360o3.A0B(A072, 0);
                        interfaceC58268PsC2.Ci4(C54976OTi.A00(c54976OTi4, A072, A063), str5, "lead_gen_multi_step_consumer_questions", "answer_prefilled", "impression");
                        if (!this.A0C) {
                            A03(leadGenFormBaseQuestion);
                        }
                    }
                }
            }
            enumC53189Nfl2 = A0F2.A03;
        } else {
            enumC53189Nfl2 = null;
        }
        if (enumC53189Nfl2 == EnumC53189Nfl.A03) {
            this.A0C = true;
        }
        LeadGenProfileContentInfo leadGenProfileContentInfo = (LeadGenProfileContentInfo) this.A0b.getValue();
        if (leadGenProfileContentInfo == null || (leadGenTrustSignalsPayload = leadGenProfileContentInfo.A01) == null || (num = leadGenTrustSignalsPayload.A04) == null || num != C05F.A00) {
            return;
        }
        EnumC53274NhC A00 = leadGenTrustSignalsPayload.A00();
        String str6 = A00.A02;
        if (str6 == null) {
            str6 = A00.toString();
        }
        String A002 = A00(i);
        if (AbstractC31174DnI.A1a(EnumC53189Nfl.A07, A002)) {
            return;
        }
        interfaceC58268PsC2.Ci4(C54976OTi.A00(c54976OTi4, A002, str6), str5, "lead_gen_multi_step_consumer_questions", "business_profile_header_impression", "impression");
    }

    public final void A03(LeadGenFormBaseQuestion leadGenFormBaseQuestion) {
        C54976OTi c54976OTi = this.A0M;
        C55205OeH c55205OeH = C55205OeH.A00;
        String A07 = c55205OeH.A07(leadGenFormBaseQuestion);
        String A06 = c55205OeH.A06(leadGenFormBaseQuestion);
        C14360o3.A0B(A07, 0);
        InterfaceC58268PsC.A01(C54976OTi.A00(c54976OTi, A07, A06), c54976OTi.A00, c54976OTi.A01, "lead_gen_multi_step_consumer_questions", "question_filled");
    }

    public final void A05(List list) {
        C05A c05a = this.A0a;
        ArrayList A0w = MSZ.A0w(c05a);
        Iterator it = A0w.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C51654Mrl) it.next()).A03 == EnumC53189Nfl.A0D) {
                if (i >= 0) {
                    C51654Mrl c51654Mrl = (C51654Mrl) A0w.get(i);
                    List list2 = c51654Mrl.A09;
                    EnumC53189Nfl enumC53189Nfl = c51654Mrl.A03;
                    A0w.set(i, new C51654Mrl(c51654Mrl.A00, null, null, enumC53189Nfl, null, null, null, null, list2, C16930sl.A00, list, false, false, this.A09, false, false, false, c51654Mrl.A0C, c51654Mrl.A0B, false, false, false));
                    c05a.Egh(AbstractC001800i.A0a(A0w));
                    return;
                }
                return;
            }
            i++;
        }
    }

    public final boolean A06() {
        boolean z = this.A0h;
        UserSession userSession = this.A0H;
        C14360o3.A0B(userSession, 1);
        if (!z) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36323058113391507L) || C18U.A06(c06090Tz, userSession, 36329169851858991L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public NOW() {
        C24721Ip A0q = MSX.A0q();
        this.A0X = A0q;
        this.A0Y = AbstractC07080Za.A03(A0q);
        this.A0E = true;
        this.A0Z = C10E.A00(null);
        this.A0b = C10E.A00(null);
        this.A0a = AbstractC31171DnF.A0o();
        C008002u A00 = C10E.A00(null);
        this.A0c = A00;
        MSZ.A17(this, new PZH(this, null, 36), C0RV.A01(C57643Pht.A00, new C15430py(A00)));
    }
}
