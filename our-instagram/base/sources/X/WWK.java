package X;

import com.facebook.pando.PandoGraphQLRequest;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class WWK implements InterfaceC70433Ec {
    public C2JM A00 = new C2JM();
    public C2JM A01 = new C2JM();
    public boolean A04 = false;
    public boolean A02 = false;
    public boolean A05 = false;
    public boolean A03 = false;

    @Override // X.InterfaceC70433Ec
    public final /* bridge */ /* synthetic */ C1Dk build() {
        C18C.A0E(this.A04);
        C18C.A0E(this.A02);
        C18C.A0E(this.A05);
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A03), "PayoutReleaseDetailsViewQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), UZS.class, false, null, 0, null, "xfb_business_payments_hub", new ArrayList());
    }
}
