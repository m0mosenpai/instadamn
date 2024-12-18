package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import java.util.ArrayList;

/* renamed from: X.6qc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150796qc implements InterfaceC70433Ec {
    public C2JM A00 = new C2JM();
    public C2JM A01 = new C2JM();

    @Override // X.InterfaceC70433Ec
    public final /* bridge */ /* synthetic */ C1Dk build() {
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        return new PandoGraphQLRequest(AbstractC40511uK.A00(), "AREffectConsentStateQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), C150806qd.class, false, PandoRealtimeInfoJNI.forLiveQuery("flm_ar_effect_consent_state"), 0, null, "viewer", new ArrayList());
    }
}
