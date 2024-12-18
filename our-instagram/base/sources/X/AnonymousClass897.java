package X;

import com.facebook.pando.PandoGraphQLRequest;
import java.util.ArrayList;

/* renamed from: X.897, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass897 implements InterfaceC70433Ec {
    public C2JM A00 = new C2JM();
    public C2JM A01 = new C2JM();
    public boolean A02 = false;

    @Override // X.InterfaceC70433Ec
    public final /* bridge */ /* synthetic */ C1Dk build() {
        C18C.A0E(this.A02);
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        return new PandoGraphQLRequest(AbstractC40511uK.A00(), "NMLMLCapabilityLatestAimVersionQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), AnonymousClass898.class, false, null, 0, null, "aim_model_version_manifest", new ArrayList());
    }
}
