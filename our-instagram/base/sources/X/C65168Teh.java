package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.net.SocketTimeoutException;

/* renamed from: X.Teh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65168Teh extends C65172Tel {
    public final /* synthetic */ C63029Sb0 A00;

    public C65168Teh(C63029Sb0 c63029Sb0) {
        this.A00 = c63029Sb0;
    }

    public final void A0B() {
        if (!A0A()) {
        } else {
            throw new SocketTimeoutException(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
        }
    }
}
