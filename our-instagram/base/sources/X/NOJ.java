package X;

import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimer;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerCheckbox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class NOJ extends AbstractC51367MmS {
    public static final java.util.Set A01(C51654Mrl c51654Mrl) {
        List list;
        LeadGenCustomDisclaimer leadGenCustomDisclaimer = c51654Mrl.A04;
        if (leadGenCustomDisclaimer != null && (list = leadGenCustomDisclaimer.A02) != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                if (((LeadGenCustomDisclaimerCheckbox) obj).A03) {
                    A1E.add(obj);
                }
            }
            ArrayList A0q = AbstractC167017dG.A0q(A1E);
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                A0q.add(((LeadGenCustomDisclaimerCheckbox) it.next()).A00);
            }
            return AbstractC001800i.A0k(A0q);
        }
        return C16910sj.A00;
    }
}
