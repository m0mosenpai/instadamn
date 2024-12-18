package X;

import com.facebook.pando.PandoGraphQLRequest;
import java.util.ArrayList;

/* renamed from: X.97I, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C97I implements InterfaceC70433Ec {
    public C2JM A00 = new C2JM();
    public C2JM A01 = new C2JM();
    public boolean A02 = false;

    @Override // X.InterfaceC70433Ec
    /* renamed from: build */
    public final /* bridge */ /* synthetic */ C1Dk A00() {
        C18C.A0E(this.A02);
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        return new PandoGraphQLRequest(AbstractC40511uK.A00(), "MobileBuildIOSSelfUpdateQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), C213239ck.class, false, null, 0, null, "xfb_mobile_build_ios_self_update", new ArrayList());
    }
}
