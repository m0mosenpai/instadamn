package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AbstractC53409Njy;
import X.C00O;
import X.C0YY;
import X.C0eB;
import X.C14360o3;
import X.InterfaceC16820sZ;
import X.InterfaceC65463Tkf;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$4 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ AbstractC53409Njy $exception;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$handleResponse$4(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, AbstractC53409Njy abstractC53409Njy) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$exception = abstractC53409Njy;
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, AbstractC53409Njy abstractC53409Njy) {
        C14360o3.A0B(credentialProviderCreatePublicKeyCredentialController, 0);
        InterfaceC65463Tkf interfaceC65463Tkf = credentialProviderCreatePublicKeyCredentialController.callback;
        if (interfaceC65463Tkf == null) {
            C14360o3.A0F("callback");
            throw C00O.createAndThrow();
        }
        interfaceC65463Tkf.DEG(abstractC53409Njy);
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m22invoke() {
        final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            C14360o3.A0F("executor");
            throw C00O.createAndThrow();
        }
        final AbstractC53409Njy abstractC53409Njy = this.$exception;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$handleResponse$4$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$4.invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController.this, abstractC53409Njy);
            }
        });
    }

    @Override // X.InterfaceC16820sZ
    public /* bridge */ /* synthetic */ Object invoke() {
        m22invoke();
        return C0eB.A00;
    }
}
