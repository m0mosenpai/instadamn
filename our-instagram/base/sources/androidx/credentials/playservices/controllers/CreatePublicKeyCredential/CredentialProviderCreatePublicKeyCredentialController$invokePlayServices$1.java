package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AbstractC167017dG;
import X.C00O;
import X.C0YY;
import X.C0eB;
import X.C14360o3;
import X.InterfaceC16820sZ;
import X.InterfaceC65463Tkf;
import X.Q79;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes10.dex */
public final class CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ JSONException $e;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$e = jSONException;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m28invoke() {
        final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            C14360o3.A0F("executor");
            throw C00O.createAndThrow();
        }
        final JSONException jSONException = this.$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1.invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController.this, jSONException);
            }
        });
    }

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        Q79 JSONExceptionToPKCError;
        AbstractC167017dG.A1N(credentialProviderCreatePublicKeyCredentialController, jSONException);
        InterfaceC65463Tkf interfaceC65463Tkf = credentialProviderCreatePublicKeyCredentialController.callback;
        if (interfaceC65463Tkf != null) {
            JSONExceptionToPKCError = credentialProviderCreatePublicKeyCredentialController.JSONExceptionToPKCError(jSONException);
            interfaceC65463Tkf.DEG(JSONExceptionToPKCError);
        } else {
            C14360o3.A0F("callback");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC16820sZ
    public /* bridge */ /* synthetic */ Object invoke() {
        m28invoke();
        return C0eB.A00;
    }
}
