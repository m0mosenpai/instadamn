package X;

import com.facebook.pando.PandoGraphQLRequest;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class WWH implements InterfaceC70433Ec {
    public C2JM A00 = new C2JM();
    public C2JM A01 = new C2JM();
    public boolean A02 = false;
    public boolean A03 = false;

    @Override // X.InterfaceC70433Ec
    /* renamed from: build */
    public final /* bridge */ /* synthetic */ C1Dk A00() {
        C18C.A0E(this.A02);
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A03), "PayoutSettingsQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), C67531UnV.class, false, null, 0, null, "pay_financial_entity", new ArrayList());
    }
}