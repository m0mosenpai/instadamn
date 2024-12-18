package androidx.credentials.playservices.controllers.CreatePassword;

import X.AbstractC167017dG;
import X.AbstractC53409Njy;
import X.C00O;
import X.C0YY;
import X.C0eB;
import X.C14360o3;
import X.InterfaceC16660sJ;
import X.InterfaceC65463Tkf;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class CredentialProviderCreatePasswordController$handleResponse$2 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$handleResponse$2(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        super(1);
        this.this$0 = credentialProviderCreatePasswordController;
    }

    public final void invoke(final AbstractC53409Njy abstractC53409Njy) {
        C14360o3.A0B(abstractC53409Njy, 0);
        final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            C14360o3.A0F("executor");
            throw C00O.createAndThrow();
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$handleResponse$2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePasswordController$handleResponse$2.invoke$lambda$0(CredentialProviderCreatePasswordController.this, abstractC53409Njy);
            }
        });
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, AbstractC53409Njy abstractC53409Njy) {
        AbstractC167017dG.A1N(credentialProviderCreatePasswordController, abstractC53409Njy);
        InterfaceC65463Tkf interfaceC65463Tkf = credentialProviderCreatePasswordController.callback;
        if (interfaceC65463Tkf == null) {
            C14360o3.A0F("callback");
            throw C00O.createAndThrow();
        }
        interfaceC65463Tkf.DEG(abstractC53409Njy);
    }

    @Override // X.InterfaceC16660sJ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AbstractC53409Njy) obj);
        return C0eB.A00;
    }
}
