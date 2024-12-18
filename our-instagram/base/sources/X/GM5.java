package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: classes6.dex */
public final class GM5 implements Runnable {
    public final /* synthetic */ C35229FgM A00;

    public GM5(C35229FgM c35229FgM) {
        this.A00 = c35229FgM;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C35229FgM c35229FgM = this.A00;
        c35229FgM.A0F.set(true);
        c35229FgM.A0C.A00();
        if (AbstractC167007dF.A1Z(c35229FgM.A0G)) {
            C35229FgM.A02(c35229FgM, PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
            return;
        }
        C006802i c006802i = c35229FgM.A04;
        if (c006802i == null) {
            C14360o3.A0F("qpl");
            throw C00O.createAndThrow();
        }
        c006802i.markerAnnotate(896612552, TraceFieldType.FailureReason, PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
        C35229FgM.A01(c35229FgM);
    }
}
