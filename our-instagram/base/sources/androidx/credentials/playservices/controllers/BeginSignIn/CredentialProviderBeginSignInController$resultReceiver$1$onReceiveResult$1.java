package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AbstractC53410Njz;
import X.C03E;
import X.InterfaceC16620sF;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;

/* loaded from: classes10.dex */
public final /* synthetic */ class CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1 extends C03E implements InterfaceC16620sF {
    public CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0);
    }

    @Override // X.InterfaceC16620sF
    public final AbstractC53410Njz invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).getCredentialExceptionTypeToException$credentials_play_services_auth_release(str, str2);
    }
}
