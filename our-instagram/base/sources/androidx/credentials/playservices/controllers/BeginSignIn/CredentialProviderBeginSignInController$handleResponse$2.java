package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AbstractC167017dG;
import X.AbstractC53410Njz;
import X.C0YY;
import X.C0eB;
import X.C14360o3;
import X.InterfaceC16660sJ;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class CredentialProviderBeginSignInController$handleResponse$2 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$2(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        super(1);
        this.this$0 = credentialProviderBeginSignInController;
    }

    public final void invoke(final AbstractC53410Njz abstractC53410Njz) {
        C14360o3.A0B(abstractC53410Njz, 0);
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.this$0;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$handleResponse$2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController$handleResponse$2.invoke$lambda$0(CredentialProviderBeginSignInController.this, abstractC53410Njz);
            }
        });
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, AbstractC53410Njz abstractC53410Njz) {
        AbstractC167017dG.A1N(credentialProviderBeginSignInController, abstractC53410Njz);
        credentialProviderBeginSignInController.getCallback().DEG(abstractC53410Njz);
    }

    @Override // X.InterfaceC16660sJ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AbstractC53410Njz) obj);
        return C0eB.A00;
    }
}
