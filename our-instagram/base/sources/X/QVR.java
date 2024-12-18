package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: classes10.dex */
public final class QVR extends C2JS implements C2JT {
    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C4OK A0O = AbstractC58318PtA.A0O(QVJ.class, "error_info", 1698479540);
        C94754Oe c94754Oe = C94754Oe.A00;
        return AbstractC166987dD.A0k(new C4OM[]{A0O, AbstractC166987dD.A0i(c94754Oe, TraceFieldType.RequestID), AbstractC166987dD.A0i(c94754Oe, "response_id"), AbstractC166987dD.A0i(c94754Oe, "tracking"), AbstractC58318PtA.A0O(QVP.class, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, 285556134), AbstractC58318PtA.A0O(QVQ.class, "user_interactions", 556682527)});
    }

    public QVR(int i) {
        super(i);
    }

    public QVR() {
        super(-1629499129);
    }
}
