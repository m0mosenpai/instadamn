package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.recon.ShoppingReconFeedEndpoint;
import java.util.HashMap;

/* renamed from: X.OaB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55056OaB {
    public final UserSession A00;
    public final C41576IaP A01;
    public final HashMap A02;

    public C55056OaB(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C41576IaP c41576IaP = new C41576IaP(userSession);
        this.A00 = userSession;
        this.A01 = c41576IaP;
        this.A02 = AbstractC166987dD.A1G();
    }

    public final Object A02(C38648Gyp c38648Gyp, InterfaceC23621Ds interfaceC23621Ds) {
        return MSX.A0b(AnonymousClass194.A00(interfaceC23621Ds, new C57166PZk((InterfaceC23621Ds) null, this, c38648Gyp, 29)));
    }

    public static final OCI A00(ShoppingReconFeedEndpoint shoppingReconFeedEndpoint, C55056OaB c55056OaB) {
        HashMap hashMap = c55056OaB.A02;
        Object obj = hashMap.get(shoppingReconFeedEndpoint);
        if (obj == null) {
            obj = new OCI(shoppingReconFeedEndpoint);
            hashMap.put(shoppingReconFeedEndpoint, obj);
        }
        return (OCI) obj;
    }

    public static final void A01(ShoppingReconFeedEndpoint shoppingReconFeedEndpoint, C55056OaB c55056OaB, InterfaceC16660sJ interfaceC16660sJ) {
        C05A c05a = A00(shoppingReconFeedEndpoint, c55056OaB).A03;
        Object value = c05a.getValue();
        Object invoke = interfaceC16660sJ.invoke(value);
        if (!C14360o3.A0K(invoke, value)) {
            c05a.Egh(invoke);
        }
    }
}
