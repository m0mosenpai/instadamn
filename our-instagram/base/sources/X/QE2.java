package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.util.Map;

/* loaded from: classes10.dex */
public final class QE2 extends AbstractC63008SaW {
    public final C5G6 A00;
    public final SKL A01;

    public final void A05(Context context, Bundle bundle, InterfaceC58016Po0 interfaceC58016Po0, InterfaceC30921DiY interfaceC30921DiY, SO2 so2, C63021Sam c63021Sam, AutofillData autofillData, Integer num, Map map) {
        AbstractC25229BEm.A1I(context, 0, c63021Sam);
        String A0p = AbstractC25231BEo.A0p();
        C5G6 c5g6 = this.A00;
        C63024Sau c63024Sau = c5g6.A01;
        Integer num2 = C05F.A00;
        c63024Sau.A03(bundle, num2, "CONTACT_SAVE", A0p);
        C62762SPv c62762SPv = new C62762SPv(c5g6);
        c62762SPv.A01(C05F.A01, num2, A0p);
        c62762SPv.A00();
        long j = SandboxRepository.CACHE_TTL;
        java.util.Set A02 = A02();
        c62762SPv.A03(A02);
        UserSession userSession = c5g6.A04.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36322800418957934L) && AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800419416693L) && A02.isEmpty()) {
            c62762SPv.A02(AbstractC167007dF.A0n("no_prompt_reason", "bloks_prompt_not_cached"));
            c62762SPv.A04(false);
            return;
        }
        if (!C18U.A06(c06090Tz, userSession, 36322800418957934L) && AbstractC31177DnL.A1U(c06090Tz, userSession, 36322800419285619L)) {
            j = 0;
        }
        C1W2.A00().execute(new RunnableC71408WtW(context, new C64961Tak(c63021Sam, num, this, so2, C63285Sgk.A02(autofillData), map, context, interfaceC30921DiY, c62762SPv, c63024Sau, S6F.A00.A03(autofillData), A02, bundle, interfaceC58016Po0, A0p, 0, j)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QE2(C5G6 c5g6, SKL skl) {
        super(skl);
        AbstractC167017dG.A1P(c5g6, skl);
        this.A00 = c5g6;
        this.A01 = skl;
    }
}
