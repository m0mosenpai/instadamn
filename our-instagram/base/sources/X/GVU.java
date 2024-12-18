package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.intf.DirectShareSheetAppearance;

/* loaded from: classes6.dex */
public final class GVU extends C0YY implements InterfaceC16660sJ {
    public static final GVU A00 = new GVU();

    public GVU() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AbstractC52972be abstractC52972be = (AbstractC52972be) obj;
        C14360o3.A0B(abstractC52972be, 0);
        C34490FIc c34490FIc = (C34490FIc) abstractC52972be.A00(Fr6.A00);
        if (c34490FIc != null) {
            C32072E6y c32072E6y = (C32072E6y) abstractC52972be.A00(C35769Fr7.A00);
            if (c32072E6y != null) {
                UserSession userSession = (UserSession) c32072E6y.A04;
                DirectShareSheetAppearance directShareSheetAppearance = (DirectShareSheetAppearance) c32072E6y.A01;
                String str = c32072E6y.A05;
                boolean z = c32072E6y.A07;
                boolean z2 = c32072E6y.A08;
                String str2 = c32072E6y.A06;
                FKR fkr = (FKR) c32072E6y.A03;
                return new C31837Dyw(userSession, c34490FIc.A00, c34490FIc.A01, fkr, directShareSheetAppearance, str, str2, z, z2);
            }
            throw AbstractC166987dD.A14("No viewParameters");
        }
        throw AbstractC166987dD.A14("No provider");
    }
}
