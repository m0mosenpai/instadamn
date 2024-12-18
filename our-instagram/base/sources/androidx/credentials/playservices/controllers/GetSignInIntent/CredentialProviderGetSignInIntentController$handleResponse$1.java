package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.C0YY;
import X.C0eB;
import X.C14360o3;
import X.InterfaceC16620sF;
import X.InterfaceC16820sZ;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CredentialProviderController;

/* loaded from: classes10.dex */
public final class CredentialProviderGetSignInIntentController$handleResponse$1 extends C0YY implements InterfaceC16620sF {
    public static final CredentialProviderGetSignInIntentController$handleResponse$1 INSTANCE = new CredentialProviderGetSignInIntentController$handleResponse$1();

    public CredentialProviderGetSignInIntentController$handleResponse$1() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((CancellationSignal) obj, (InterfaceC16820sZ) obj2);
        return C0eB.A00;
    }

    public final void invoke(CancellationSignal cancellationSignal, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 1);
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, interfaceC16820sZ);
    }
}
