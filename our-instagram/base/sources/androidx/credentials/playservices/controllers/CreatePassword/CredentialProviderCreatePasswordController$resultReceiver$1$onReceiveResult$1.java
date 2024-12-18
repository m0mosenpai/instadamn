package androidx.credentials.playservices.controllers.CreatePassword;

import X.AbstractC53409Njy;
import X.C03E;
import X.InterfaceC16620sF;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;

/* loaded from: classes10.dex */
public final /* synthetic */ class CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 extends C03E implements InterfaceC16620sF {
    public CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
    }

    @Override // X.InterfaceC16620sF
    public final AbstractC53409Njy invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).createCredentialExceptionTypeToException$credentials_play_services_auth_release(str, str2);
    }
}
