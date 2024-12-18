package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AbstractC167017dG;
import X.C0YY;
import X.C0eB;
import X.C58732Q6f;
import X.InterfaceC16820sZ;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class CredentialProviderBeginSignInController$handleResponse$6 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C58732Q6f $e;
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$6(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C58732Q6f c58732Q6f) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$e = c58732Q6f;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m15invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.this$0;
        final C58732Q6f c58732Q6f = this.$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$handleResponse$6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController$handleResponse$6.invoke$lambda$0(CredentialProviderBeginSignInController.this, c58732Q6f);
            }
        });
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C58732Q6f c58732Q6f) {
        AbstractC167017dG.A1N(credentialProviderBeginSignInController, c58732Q6f);
        credentialProviderBeginSignInController.getCallback().DEG(c58732Q6f);
    }

    @Override // X.InterfaceC16820sZ
    public /* bridge */ /* synthetic */ Object invoke() {
        m15invoke();
        return C0eB.A00;
    }
}
