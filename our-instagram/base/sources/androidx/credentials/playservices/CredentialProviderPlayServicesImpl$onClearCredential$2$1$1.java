package androidx.credentials.playservices;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0YY;
import X.C0eB;
import X.InterfaceC16820sZ;
import X.InterfaceC65463Tkf;
import X.Rk0;
import android.util.Log;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class CredentialProviderPlayServicesImpl$onClearCredential$2$1$1 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ InterfaceC65463Tkf $callback;
    public final /* synthetic */ Exception $e;
    public final /* synthetic */ Executor $executor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(Exception exc, Executor executor, InterfaceC65463Tkf interfaceC65463Tkf) {
        super(0);
        this.$e = exc;
        this.$executor = executor;
        this.$callback = interfaceC65463Tkf;
    }

    public static final void invoke$lambda$0(InterfaceC65463Tkf interfaceC65463Tkf, Exception exc) {
        AbstractC167017dG.A1N(interfaceC65463Tkf, exc);
        interfaceC65463Tkf.DEG(new Rk0(exc.getMessage()));
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6invoke() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("During clear credential sign out failed with ");
        Log.w(CredentialProviderPlayServicesImpl.TAG, AbstractC166997dE.A0v(this.$e, A1C));
        Executor executor = this.$executor;
        final InterfaceC65463Tkf interfaceC65463Tkf = this.$callback;
        final Exception exc = this.$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$2$1$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl$onClearCredential$2$1$1.invoke$lambda$0(InterfaceC65463Tkf.this, exc);
            }
        });
    }

    @Override // X.InterfaceC16820sZ
    public /* bridge */ /* synthetic */ Object invoke() {
        m6invoke();
        return C0eB.A00;
    }
}
