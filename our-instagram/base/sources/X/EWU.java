package X;

import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;

/* loaded from: classes6.dex */
public final class EWU extends AbstractC61132qb {
    public final InterfaceC37222GaX A00;
    public final AbstractC12990ll A01;
    public final String A02;
    public final String A03;

    public EWU(InterfaceC37222GaX interfaceC37222GaX, AbstractC12990ll abstractC12990ll, String str) {
        AbstractC25234BEr.A1P(abstractC12990ll, interfaceC37222GaX, str);
        this.A01 = abstractC12990ll;
        this.A00 = interfaceC37222GaX;
        this.A02 = "switch_to_business_account";
        this.A03 = str;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        AbstractC12990ll abstractC12990ll = this.A01;
        String str = this.A02;
        InterfaceC37222GaX interfaceC37222GaX = this.A00;
        BusinessFlowAnalyticsLogger A01 = AbstractC151606s6.A01(interfaceC37222GaX.B77(), abstractC12990ll, str, (String) AbstractC166987dD.A17(((BusinessConversionActivity) interfaceC37222GaX).A0C));
        C34406FEw c34406FEw = new C34406FEw(abstractC12990ll);
        C14360o3.A0A(A01);
        return new C31825Dyj(A01, c34406FEw, abstractC12990ll, this.A03);
    }
}
