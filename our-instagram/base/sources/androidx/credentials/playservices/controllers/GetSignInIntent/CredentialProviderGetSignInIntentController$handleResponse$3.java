package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.AbstractC167017dG;
import X.C0YY;
import X.C0eB;
import X.InterfaceC16820sZ;
import X.SAA;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class CredentialProviderGetSignInIntentController$handleResponse$3 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ SAA $response;
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$3(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, SAA saa) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$response = saa;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m38invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.this$0;
        final SAA saa = this.$response;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$handleResponse$3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController$handleResponse$3.invoke$lambda$0(CredentialProviderGetSignInIntentController.this, saa);
            }
        });
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, SAA saa) {
        AbstractC167017dG.A1N(credentialProviderGetSignInIntentController, saa);
        credentialProviderGetSignInIntentController.getCallback().onResult(saa);
    }

    @Override // X.InterfaceC16820sZ
    public /* bridge */ /* synthetic */ Object invoke() {
        m38invoke();
        return C0eB.A00;
    }
}
