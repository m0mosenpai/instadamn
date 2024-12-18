package com.instagram.leadads.repository;

import X.AbstractC06930Yk;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC31171DnF;
import X.BQO;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C0UO;
import X.C10E;
import X.C10Q;
import X.C14360o3;
import X.C16910sj;
import X.C16930sl;
import X.C51654Mrl;
import X.C51757Mtg;
import X.C54976OTi;
import X.C57184PaK;
import X.C5QE;
import X.EnumC53189Nfl;
import X.InterfaceC19390xP;
import X.MSW;
import X.MSX;
import X.MUW;
import X.OLJ;
import X.VEF;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes9.dex */
public final class LeadFormQuestionsRepository {
    public MUW A00;
    public OLJ A01;
    public C54976OTi A02;
    public String A03;
    public List A04;
    public Set A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public String A0D = "";
    public final UserSession A0E;
    public final InterfaceC19390xP A0F;
    public final C05A A0G;
    public final C05A A0H;
    public final C05A A0I;
    public final C05A A0J;
    public final C05A A0K;
    public final C05A A0L;
    public final C0UO A0M;
    public final C0UO A0N;

    public static final C5QE A00(OLJ olj, boolean z, boolean z2) {
        int i;
        String str;
        if (z) {
            i = 2131964842;
        } else {
            if (!z2 && (str = olj.A01().A01) != null) {
                return new BQO(str);
            }
            i = 2131970591;
        }
        return MSX.A0G(i);
    }

    public static final LeadGenFormBaseQuestion A01(String str) {
        return new LeadGenFormBaseQuestion(VEF.A06, null, str, "", "", "", null, null, null, null, null, C16930sl.A00, null, null, null, AbstractC06930Yk.A0E(), 0, false, false, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0259  */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.leadads.repository.LeadFormQuestionsRepository r16, com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r17, java.lang.String r18, java.lang.String r19, java.util.List r20, X.InterfaceC23621Ds r21) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadads.repository.LeadFormQuestionsRepository.A02(com.instagram.leadads.repository.LeadFormQuestionsRepository, com.instagram.leadgen.core.model.LeadGenFormBaseQuestion, java.lang.String, java.lang.String, java.util.List, X.1Ds):java.lang.Object");
    }

    private final void A04() {
        ArrayList arrayList;
        C05A c05a = this.A0I;
        List A1A = MSW.A1A(c05a);
        if (A1A != null) {
            arrayList = AbstractC166987dD.A1E();
            for (Object obj : A1A) {
                if (((C51757Mtg) obj).A00 != C05F.A0Y) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        c05a.Egh(arrayList);
    }

    private final void A05(String str) {
        ArrayList arrayList;
        C54976OTi c54976OTi = this.A02;
        if (c54976OTi != null) {
            C14360o3.A0B(str, 0);
            c54976OTi.A00.Ci4(C54976OTi.A00(c54976OTi, str, null), c54976OTi.A01, "lead_gen_conditional_question_loading_screen", "lead_gen_conditional_question_mutation", RealtimeConstants.SEND_FAIL);
        }
        C05A c05a = this.A0I;
        List A1A = MSW.A1A(c05a);
        if (A1A != null) {
            arrayList = AbstractC167017dG.A0q(A1A);
            Iterator it = A1A.iterator();
            while (it.hasNext()) {
                C51757Mtg A0J = MSW.A0J(it);
                if (A0J.A00 == C05F.A0Y) {
                    A0J = new C51757Mtg(C05F.A0j, "error", C16930sl.A00, 19);
                }
                arrayList.add(A0J);
            }
        } else {
            arrayList = null;
        }
        c05a.Egh(arrayList);
    }

    public static final boolean A06(LeadFormQuestionsRepository leadFormQuestionsRepository, C51654Mrl c51654Mrl, EnumC53189Nfl enumC53189Nfl) {
        if (!(!c51654Mrl.A09.isEmpty())) {
            if (c51654Mrl.A0I) {
                return true;
            }
            if (!AbstractC31171DnF.A1b(leadFormQuestionsRepository.A05)) {
                boolean A1X = AbstractC167007dF.A1X(enumC53189Nfl, EnumC53189Nfl.A0A);
                boolean A1X2 = AbstractC167007dF.A1X(enumC53189Nfl, EnumC53189Nfl.A04);
                boolean A1Z = AbstractC25229BEm.A1Z(c51654Mrl.A06);
                if (A1X || A1X2 || A1Z) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public LeadFormQuestionsRepository(UserSession userSession) {
        this.A0E = userSession;
        C16930sl c16930sl = C16930sl.A00;
        this.A04 = c16930sl;
        C008002u A00 = C10E.A00(null);
        this.A0K = A00;
        this.A0L = C10E.A00(null);
        C008002u A002 = C10E.A00(null);
        this.A0J = A002;
        this.A05 = C16910sj.A00;
        C008002u A003 = C10E.A00(null);
        this.A0I = A003;
        this.A0F = C10Q.A00(new C57184PaK(this, null, 2), A00, A002, A003);
        C008002u A004 = C10E.A00(c16930sl);
        this.A0G = A004;
        this.A0M = A004;
        C008002u A005 = C10E.A00(null);
        this.A0H = A005;
        this.A0N = A005;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
    
        if (r2 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(com.instagram.leadads.repository.LeadFormQuestionsRepository r12, com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r13, java.lang.String r14, java.lang.String r15, java.util.List r16, X.InterfaceC23621Ds r17) {
        /*
            java.util.ArrayList r11 = X.AbstractC166987dD.A1E()
            java.util.Iterator r6 = r16.iterator()
        L8:
            boolean r0 = r6.hasNext()
            r5 = 0
            r7 = r12
            if (r0 == 0) goto L45
            X.Mtg r5 = X.MSW.A0J(r6)
            X.05A r0 = r12.A0J
            java.util.List r0 = X.MSW.A1A(r0)
            if (r0 == 0) goto L8
            java.util.Iterator r4 = r0.iterator()
        L20:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L8
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r2 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r2
            java.lang.String r1 = r2.A06
            java.lang.String r0 = r5.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L20
            java.lang.String r0 = r2.A00
            boolean r0 = X.AbstractC25225BEi.A1Y(r0)
            if (r0 == 0) goto L20
            if (r3 == 0) goto L8
            r11.add(r3)
            goto L8
        L45:
            X.05A r6 = r12.A0I
            java.util.List r0 = X.MSW.A1A(r6)
            r8 = r13
            if (r0 == 0) goto L74
            java.util.Iterator r3 = r0.iterator()
        L52:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.Mtg r0 = (X.C51757Mtg) r0
            java.lang.Object r1 = r0.A00
            java.lang.Integer r0 = X.C05F.A0Y
            if (r1 != r0) goto L52
            if (r2 == 0) goto L74
        L67:
            r9 = r14
            r10 = r15
            r12 = r17
            java.lang.Object r0 = A02(r7, r8, r9, r10, r11, r12)
            java.lang.Object r0 = X.MSX.A0b(r0)
            return r0
        L74:
            java.util.List r0 = X.MSW.A1A(r6)
            r4 = -1
            if (r0 == 0) goto L97
            java.util.Iterator r3 = r0.iterator()
            r2 = 0
        L80:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L97
            X.Mtg r0 = X.MSW.A0J(r3)
            java.lang.String r1 = r0.A02
            if (r13 == 0) goto Lc6
            java.lang.String r0 = r13.A06
        L90:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto Lc3
            r4 = r2
        L97:
            java.util.List r5 = X.MSW.A1A(r6)
            if (r5 != 0) goto L9f
            X.0sl r5 = X.C16930sl.A00
        L9f:
            if (r4 < 0) goto Lae
            int r0 = X.AbstractC25226BEj.A05(r5)
            if (r4 == r0) goto Lae
            r1 = 0
            int r0 = r4 + 1
            java.util.List r5 = r5.subList(r1, r0)
        Lae:
            java.lang.Integer r4 = X.C05F.A0Y
            X.0sl r3 = X.C16930sl.A00
            java.lang.String r2 = "loading"
            r1 = 19
            X.Mtg r0 = new X.Mtg
            r0.<init>(r4, r2, r3, r1)
            java.util.ArrayList r0 = X.AbstractC001800i.A0T(r0, r5)
            r6.Egh(r0)
            goto L67
        Lc3:
            int r2 = r2 + 1
            goto L80
        Lc6:
            r0 = r5
            goto L90
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadads.repository.LeadFormQuestionsRepository.A03(com.instagram.leadads.repository.LeadFormQuestionsRepository, com.instagram.leadgen.core.model.LeadGenFormBaseQuestion, java.lang.String, java.lang.String, java.util.List, X.1Ds):java.lang.Object");
    }
}
