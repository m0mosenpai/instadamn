package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AbstractC167017dG;
import X.C0YY;
import X.C0eB;
import X.C15370ps;
import X.InterfaceC16820sZ;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class CredentialProviderBeginSignInController$handleResponse$4 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C15370ps $exception;
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$4(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C15370ps c15370ps) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$exception = c15370ps;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m13invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.this$0;
        final C15370ps c15370ps = this.$exception;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$handleResponse$4$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController$handleResponse$4.invoke$lambda$0(CredentialProviderBeginSignInController.this, c15370ps);
            }
        });
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, C15370ps c15370ps) {
        AbstractC167017dG.A1N(credentialProviderBeginSignInController, c15370ps);
        credentialProviderBeginSignInController.getCallback().DEG(c15370ps.A00);
    }

    @Override // X.InterfaceC16820sZ
    public /* bridge */ /* synthetic */ Object invoke() {
        m13invoke();
        return C0eB.A00;
    }
}
