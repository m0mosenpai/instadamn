package X;

import com.facebook.pando.PandoGraphQLRequest;
import java.util.ArrayList;

/* renamed from: X.3Eb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70423Eb implements InterfaceC70433Ec {
    public C2JM A00 = new C2JM();
    public C2JM A01 = new C2JM();
    public boolean A02 = false;

    @Override // X.InterfaceC70433Ec
    /* renamed from: build */
    public final /* bridge */ /* synthetic */ C1Dk A00() {
        C18C.A0E(this.A02);
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        return new PandoGraphQLRequest(AbstractC40511uK.A00(), "DogfoodingEligibilityQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), C59646QjQ.class, false, null, 0, null, "xdt_api__v1__dogfooding__eligibility_status", new ArrayList());
    }
}
