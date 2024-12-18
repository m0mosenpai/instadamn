package androidx.credentials.playservices.controllers.BeginSignIn;

import X.C0YY;
import X.C0eB;
import X.C14360o3;
import X.C58732Q6f;
import X.InterfaceC16820sZ;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class CredentialProviderBeginSignInController$invokePlayServices$1 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$invokePlayServices$1(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        C14360o3.A0B(credentialProviderBeginSignInController, 0);
        credentialProviderBeginSignInController.getCallback().DEG(C58732Q6f.A00(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m16invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.this$0;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$invokePlayServices$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController$invokePlayServices$1.invoke$lambda$0(CredentialProviderBeginSignInController.this);
            }
        });
    }

    @Override // X.InterfaceC16820sZ
    public /* bridge */ /* synthetic */ Object invoke() {
        m16invoke();
        return C0eB.A00;
    }
}
