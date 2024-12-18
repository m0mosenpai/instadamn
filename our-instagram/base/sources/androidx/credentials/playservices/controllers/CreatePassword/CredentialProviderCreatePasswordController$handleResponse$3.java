package androidx.credentials.playservices.controllers.CreatePassword;

import X.AbstractC167017dG;
import X.C00O;
import X.C0YY;
import X.C0eB;
import X.C14360o3;
import X.InterfaceC16820sZ;
import X.InterfaceC65463Tkf;
import X.SA8;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class CredentialProviderCreatePasswordController$handleResponse$3 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ SA8 $response;
    public final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$handleResponse$3(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, SA8 sa8) {
        super(0);
        this.this$0 = credentialProviderCreatePasswordController;
        this.$response = sa8;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m19invoke() {
        final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            C14360o3.A0F("executor");
            throw C00O.createAndThrow();
        }
        final SA8 sa8 = this.$response;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController$handleResponse$3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePasswordController$handleResponse$3.invoke$lambda$0(CredentialProviderCreatePasswordController.this, sa8);
            }
        });
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, SA8 sa8) {
        AbstractC167017dG.A1N(credentialProviderCreatePasswordController, sa8);
        InterfaceC65463Tkf interfaceC65463Tkf = credentialProviderCreatePasswordController.callback;
        if (interfaceC65463Tkf == null) {
            C14360o3.A0F("callback");
            throw C00O.createAndThrow();
        }
        interfaceC65463Tkf.onResult(sa8);
    }

    @Override // X.InterfaceC16820sZ
    public /* bridge */ /* synthetic */ Object invoke() {
        m19invoke();
        return C0eB.A00;
    }
}
