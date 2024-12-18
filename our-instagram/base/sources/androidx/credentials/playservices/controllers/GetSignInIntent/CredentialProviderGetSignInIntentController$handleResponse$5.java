package androidx.credentials.playservices.controllers.GetSignInIntent;

import X.AbstractC167017dG;
import X.AbstractC53410Njz;
import X.C0YY;
import X.C0eB;
import X.InterfaceC16820sZ;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class CredentialProviderGetSignInIntentController$handleResponse$5 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ AbstractC53410Njz $e;
    public final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$5(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, AbstractC53410Njz abstractC53410Njz) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$e = abstractC53410Njz;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m40invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.this$0;
        final AbstractC53410Njz abstractC53410Njz = this.$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$handleResponse$5$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController$handleResponse$5.invoke$lambda$0(CredentialProviderGetSignInIntentController.this, abstractC53410Njz);
            }
        });
    }

    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, AbstractC53410Njz abstractC53410Njz) {
        AbstractC167017dG.A1N(credentialProviderGetSignInIntentController, abstractC53410Njz);
        credentialProviderGetSignInIntentController.getCallback().DEG(abstractC53410Njz);
    }

    @Override // X.InterfaceC16820sZ
    public /* bridge */ /* synthetic */ Object invoke() {
        m40invoke();
        return C0eB.A00;
    }
}
