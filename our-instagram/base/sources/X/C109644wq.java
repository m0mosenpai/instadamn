package X;

import com.facebook.pando.PandoGraphQLRequest;
import java.util.ArrayList;

/* renamed from: X.4wq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109644wq implements InterfaceC70433Ec {
    public C2JM A00 = new C2JM();
    public C2JM A03 = new C2JM();
    public boolean A01 = false;
    public boolean A02 = false;

    @Override // X.InterfaceC70433Ec
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final PandoGraphQLRequest build() {
        C18C.A0E(this.A01);
        C18C.A0E(this.A02);
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        return new PandoGraphQLRequest(AbstractC40511uK.A00(), "InitiatePushabilityHealthcheck", this.A00.getParamsCopy(), this.A03.getParamsCopy(), C109654wr.class, true, null, 0, null, "xfb_init_push_healthcheck", new ArrayList());
    }
}
