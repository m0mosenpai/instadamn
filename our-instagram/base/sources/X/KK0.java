package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes8.dex */
public final class KK0 extends C2AG {
    public final int A00;
    public final Object A01;

    public KK0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.A00) {
            case 0:
            case 1:
                return ((C6VI) this.A01).A00();
            case 2:
                C46105Kb5 c46105Kb5 = (C46105Kb5) this.A01;
                if (!c46105Kb5.isMarkerOn()) {
                    return null;
                }
                c46105Kb5.annotateEndPointReason(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
                c46105Kb5.onEndFlowFail(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
                return null;
            default:
                return null;
        }
    }

    @Override // X.C11R
    public final int getRunnableId() {
        switch (this.A00) {
            case 0:
                return 670942303;
            case 1:
                return 91;
            case 2:
                return 1887904277;
            default:
                return 0;
        }
    }
}
