package X;

import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.supervisionupsells.constants.IGSupervisionUpsellEligibilityStatus;
import java.util.HashMap;

/* renamed from: X.Ezq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34011Ezq {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        boolean A01 = C6DZ.A01(c6fw.A01());
        Object A02 = c6fw.A02();
        AbstractC25225BEi.A1S(A02);
        String str = (String) A02;
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        try {
            EnumC33331EoQ.valueOf(str);
            HashMap A0F = AbstractC23021Ah.A00(A0W).A0F();
            A0F.put(str, new IGSupervisionUpsellEligibilityStatus(A01));
            AbstractC23021Ah.A00(A0W).A17(A0F);
            return null;
        } catch (IllegalArgumentException unused) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Invalid eligibilityType - must be one of ");
            C0w9.A03("IGBloksActionWellbeingSetSupervisionUpsellEligibilityImpl", AbstractC166997dE.A0v(EnumC33331EoQ.values(), A1C));
            return null;
        }
    }
}
