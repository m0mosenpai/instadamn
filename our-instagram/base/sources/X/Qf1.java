package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: classes10.dex */
public final class Qf1 extends C2JS implements C2JT {
    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return AbstractC58319PtB.A0U(AbstractC166987dD.A0i(c94754Oe, TraceFieldType.RequestID), AbstractC166987dD.A0i(c94754Oe, "response_id"), AbstractC166987dD.A0i(c94754Oe, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE), AbstractC58318PtA.A0O(Qf0.class, "error", -279505678), AbstractC166987dD.A0i(c94754Oe, "finish_reason"));
    }

    public Qf1(int i) {
        super(i);
    }

    public Qf1() {
        super(333974355);
    }
}
