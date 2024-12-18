package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.recon.ShoppingReconFeedEndpoint;

/* renamed from: X.IaP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41576IaP {
    public final UserSession A00;

    public static final MWG A00(C41576IaP c41576IaP, C38648Gyp c38648Gyp, Integer num, Integer num2) {
        boolean z = false;
        C25621Ms A0q = AbstractC25228BEl.A0q(c41576IaP.A00);
        if (c38648Gyp.A01 instanceof ShoppingReconFeedEndpoint.ReconDestinationFeedEndpoint) {
            A0q.A0B("commerce/reconsideration_destination/");
            A0q.A06();
            A0q.A0R(HB1.class, C41361ISo.class);
            A0q.A0A = AbstractC25225BEi.A15(c38648Gyp.A05);
            A0q.A07 = num2;
            ((AbstractC23721Ec) A0q).A01 = c38648Gyp.A00.A00;
            if (c38648Gyp.A0A && c38648Gyp.A02 == C05F.A0C) {
                z = true;
            }
            A0q.A0I("is_ptr", z);
            A0q.A0H("pagination_token", c38648Gyp.A03);
            return JX4.A00(new GSB(27, null), JX4.A01(new C43171J6q(num, (InterfaceC23621Ds) null, 45, 42), A0q.A0N().A03(737)));
        }
        throw B4Z.A00();
    }

    public C41576IaP(UserSession userSession) {
        this.A00 = userSession;
    }
}
