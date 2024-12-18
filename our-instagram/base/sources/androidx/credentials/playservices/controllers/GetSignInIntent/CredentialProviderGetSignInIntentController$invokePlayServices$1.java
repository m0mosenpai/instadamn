package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.AbstractC167017dG;
import X.C0YY;
import X.C0eB;
import X.InterfaceC16820sZ;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class CredentialProviderGetSignInIntentController$invokePlayServices$1 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Exception $e;
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$invokePlayServices$1(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, Exception exc) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$e = exc;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m42invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.this$0;
        final Exception exc = this.$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$invokePlayServices$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController$invokePlayServices$1.invoke$lambda$0(CredentialProviderGetSignInIntentController.this, exc);
            }
        });
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, Exception exc) {
        AbstractC167017dG.A1N(credentialProviderGetSignInIntentController, exc);
        credentialProviderGetSignInIntentController.getCallback().DEG(exc);
    }

    @Override // X.InterfaceC16820sZ
    public /* bridge */ /* synthetic */ Object invoke() {
        m42invoke();
        return C0eB.A00;
    }
}
