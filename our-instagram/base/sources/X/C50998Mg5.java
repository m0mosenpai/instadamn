package X;

import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimer;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerCheckbox;
import com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Mg5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50998Mg5 extends AbstractC52922bZ {
    public boolean A00;
    public final C2GT A01;
    public final UserSession A02;
    public final LeadGenCustomDisclaimer A03;
    public final LeadGenPrivacyPolicy A04;
    public final String A05;
    public final Map A06;
    public final C05A A07;
    public final C05A A08;

    public C50998Mg5(C152406tQ c152406tQ, UserSession userSession) {
        Map A0E;
        List<LeadGenCustomDisclaimerCheckbox> list;
        this.A02 = userSession;
        LeadGenCustomDisclaimer leadGenCustomDisclaimer = (LeadGenCustomDisclaimer) c152406tQ.A00("custom_disclaimer");
        this.A03 = leadGenCustomDisclaimer;
        if (leadGenCustomDisclaimer != null && (list = leadGenCustomDisclaimer.A02) != null) {
            int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(list, 10));
            A0E = AbstractC25225BEi.A18(A0L < 16 ? 16 : A0L);
            for (LeadGenCustomDisclaimerCheckbox leadGenCustomDisclaimerCheckbox : list) {
                String str = leadGenCustomDisclaimerCheckbox.A00;
                A0E.put(str, new C51740MtP(str, leadGenCustomDisclaimerCheckbox.A02, 16));
            }
        } else {
            A0E = AbstractC06930Yk.A0E();
        }
        this.A06 = A0E;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A07 = A0o;
        C008002u A0y = MSZ.A0y();
        this.A08 = A0y;
        this.A01 = AbstractC31172DnG.A0E(C10Q.A03(new C57176PZz(1, null), A0o, A0y));
        this.A04 = (LeadGenPrivacyPolicy) c152406tQ.A00("privacy_policy");
        String A0h = AbstractC50522MSa.A0h(c152406tQ, "personal_info_to_review");
        this.A05 = A0h == null ? "" : A0h;
        A00(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final void A00(C50998Mg5 c50998Mg5) {
        Object obj;
        List list;
        C51740MtP c51740MtP;
        C05A c05a = c50998Mg5.A07;
        LeadGenCustomDisclaimer leadGenCustomDisclaimer = c50998Mg5.A03;
        if (leadGenCustomDisclaimer != null && (list = leadGenCustomDisclaimer.A02) != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj2 : list) {
                LeadGenCustomDisclaimerCheckbox leadGenCustomDisclaimerCheckbox = (LeadGenCustomDisclaimerCheckbox) obj2;
                if (leadGenCustomDisclaimerCheckbox.A03 && (c51740MtP = (C51740MtP) c50998Mg5.A06.get(leadGenCustomDisclaimerCheckbox.A00)) != null && !c51740MtP.A01) {
                    A1E.add(obj2);
                }
            }
            obj = AbstractC167017dG.A0q(A1E);
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                obj.add(((LeadGenCustomDisclaimerCheckbox) it.next()).A00);
            }
        } else {
            obj = C16930sl.A00;
        }
        c05a.Egh(obj);
    }
}
