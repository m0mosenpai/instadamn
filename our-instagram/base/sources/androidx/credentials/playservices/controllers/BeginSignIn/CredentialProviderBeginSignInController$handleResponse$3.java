package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AbstractC167017dG;
import X.C0YY;
import X.C0eB;
import X.InterfaceC16820sZ;
import X.SAA;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class CredentialProviderBeginSignInController$handleResponse$3 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ SAA $response;
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$3(CredentialProviderBeginSignInController credentialProviderBeginSignInController, SAA saa) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$response = saa;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m11invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.this$0;
        final SAA saa = this.$response;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$handleResponse$3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController$handleResponse$3.invoke$lambda$0(CredentialProviderBeginSignInController.this, saa);
            }
        });
    }

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, SAA saa) {
        AbstractC167017dG.A1N(credentialProviderBeginSignInController, saa);
        credentialProviderBeginSignInController.getCallback().onResult(saa);
    }

    @Override // X.InterfaceC16820sZ
    public /* bridge */ /* synthetic */ Object invoke() {
        m11invoke();
        return C0eB.A00;
    }
}
