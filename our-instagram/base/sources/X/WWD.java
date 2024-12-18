package X;

import com.facebook.pando.PandoGraphQLRequest;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class WWD implements InterfaceC70433Ec {
    public C2JM A00 = new C2JM();
    public C2JM A01 = new C2JM();
    public boolean A02 = false;

    @Override // X.InterfaceC70433Ec
    public final /* bridge */ /* synthetic */ C1Dk build() {
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A02), "NotificationHubQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), C66708UYs.class, false, null, 0, null, "xfb_business_payments_notification_hub", new ArrayList());
    }
}
