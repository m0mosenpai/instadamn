package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.genai.magicmod.consentflow.MagicModConsentMigrator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CbM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28174CbM {
    public final UserSession A00;
    public final MagicModConsentMigrator A01;
    public final CUe A02;

    public /* synthetic */ C28174CbM(UserSession userSession) {
        CUe cUe = new CUe(AbstractC23021Ah.A00(userSession), userSession);
        MagicModConsentMigrator magicModConsentMigrator = new MagicModConsentMigrator(userSession, cUe);
        this.A00 = userSession;
        this.A02 = cUe;
        this.A01 = magicModConsentMigrator;
    }

    public static /* synthetic */ void A00(C28174CbM c28174CbM, boolean z) {
        C19K A02 = AbstractC24771Iv.A02(282852313, 3);
        List A1Q = AbstractC16960so.A1Q(EnumC193878i8.A09, EnumC193878i8.A0B);
        C14360o3.A0B(A02, 0);
        if (!z) {
            C23031Ai c23031Ai = c28174CbM.A02.A00;
            long A0N = AbstractC166987dD.A0N(c23031Ai.A6T.CES(c23031Ai, C23031Ai.A8c[466]));
            if (A0N >= 0) {
                long currentTimeMillis = System.currentTimeMillis();
                UserSession userSession = c28174CbM.A00;
                if (A0N + TimeUnit.HOURS.toMillis(C18U.A01(AbstractC25225BEi.A0j(userSession, 0), userSession, 36601363407245480L)) >= currentTimeMillis) {
                    return;
                }
            }
        }
        AbstractC166987dD.A1Z(new C57171PZp(A1Q, c28174CbM, (InterfaceC23621Ds) null, 26), A02);
    }
}
