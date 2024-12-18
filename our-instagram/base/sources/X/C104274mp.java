package X;

import com.instagram.api.schemas.CanUseCreatorMonetizationProduct;
import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.monetization.repository.MonetizationRepository;

/* renamed from: X.4mp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C104274mp extends C1P1 {
    public final /* synthetic */ C454527f A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    public C104274mp(C454527f c454527f, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = c454527f;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        MonetizationEligibilityDecision monetizationEligibilityDecision;
        int A03 = C0f9.A03(1853429629);
        C3DC c3dc = (C3DC) obj;
        int A032 = C0f9.A03(-2096981652);
        C14360o3.A0B(c3dc, 0);
        MonetizationRepository A00 = AbstractC63302u8.A00(this.A00.A00);
        for (C104384n4 c104384n4 : ((C104394n5) c3dc.F7f()).A00) {
            A00.A01(c104384n4);
            InterfaceC16660sJ interfaceC16660sJ = this.A01;
            if (c104384n4.A02 == CanUseCreatorMonetizationProduct.A05) {
                monetizationEligibilityDecision = MonetizationEligibilityDecision.A05;
            } else {
                monetizationEligibilityDecision = MonetizationEligibilityDecision.A07;
            }
            interfaceC16660sJ.invoke(monetizationEligibilityDecision);
        }
        C0f9.A0A(-11831373, A032);
        C0f9.A0A(-89168814, A03);
    }
}
