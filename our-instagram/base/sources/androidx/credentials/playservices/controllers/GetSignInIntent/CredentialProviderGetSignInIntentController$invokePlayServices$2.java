package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.C0YY;
import X.C0eB;
import X.C14360o3;
import X.C58732Q6f;
import X.InterfaceC16820sZ;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class CredentialProviderGetSignInIntentController$invokePlayServices$2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$invokePlayServices$2(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        C14360o3.A0B(credentialProviderGetSignInIntentController, 0);
        credentialProviderGetSignInIntentController.getCallback().DEG(C58732Q6f.A00(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m43invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.this$0;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$invokePlayServices$2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController$invokePlayServices$2.invoke$lambda$0(CredentialProviderGetSignInIntentController.this);
            }
        });
    }

    @Override // X.InterfaceC16820sZ
    public /* bridge */ /* synthetic */ Object invoke() {
        m43invoke();
        return C0eB.A00;
    }
}
