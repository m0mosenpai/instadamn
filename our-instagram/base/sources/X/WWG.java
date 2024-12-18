package X;

import com.facebook.pando.PandoGraphQLRequest;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class WWG implements InterfaceC70433Ec {
    public C2JM A00 = new C2JM();
    public C2JM A01 = new C2JM();
    public boolean A02 = false;
    public boolean A03 = false;

    @Override // X.InterfaceC70433Ec
    /* renamed from: build */
    public final /* bridge */ /* synthetic */ C1Dk A00() {
        C18C.A0E(this.A02);
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A03), "FBPayMerchantServicesEarningsQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), C66687UXx.class, false, null, 0, null, "xfb_business_payments_hub", new ArrayList());
    }
}
