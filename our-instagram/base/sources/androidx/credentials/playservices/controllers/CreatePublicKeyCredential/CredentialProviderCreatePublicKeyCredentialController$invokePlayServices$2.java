package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AbstractC167017dG;
import X.AbstractC53409Njy;
import X.C00O;
import X.C0YY;
import X.C0eB;
import X.C14360o3;
import X.InterfaceC16820sZ;
import X.InterfaceC65463Tkf;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Throwable $t;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$t = th;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m30invoke() {
        final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            C14360o3.A0F("executor");
            throw C00O.createAndThrow();
        }
        final Throwable th = this.$t;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2.invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController.this, th);
            }
        });
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th) {
        AbstractC167017dG.A1N(credentialProviderCreatePublicKeyCredentialController, th);
        InterfaceC65463Tkf interfaceC65463Tkf = credentialProviderCreatePublicKeyCredentialController.callback;
        if (interfaceC65463Tkf == null) {
            C14360o3.A0F("callback");
            throw C00O.createAndThrow();
        }
        interfaceC65463Tkf.DEG(new AbstractC53409Njy("android.credentials.CreateCredentialException.TYPE_UNKNOWN", th.getMessage()));
    }

    @Override // X.InterfaceC16820sZ
    public /* bridge */ /* synthetic */ Object invoke() {
        m30invoke();
        return C0eB.A00;
    }
}