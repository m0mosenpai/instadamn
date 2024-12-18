package androidx.credentials.playservices;

import X.C0YY;
import X.C0eB;
import X.C14360o3;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC65463Tkf;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class CredentialProviderPlayServicesImpl$onClearCredential$1 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ InterfaceC65463Tkf $callback;
    public final /* synthetic */ CancellationSignal $cancellationSignal;
    public final /* synthetic */ Executor $executor;

    /* renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1$1, reason: invalid class name */
    /* loaded from: classes10.dex */
    public final class AnonymousClass1 extends C0YY implements InterfaceC16820sZ {
        public final /* synthetic */ InterfaceC65463Tkf $callback;
        public final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Executor executor, InterfaceC65463Tkf interfaceC65463Tkf) {
            super(0);
            this.$executor = executor;
            this.$callback = interfaceC65463Tkf;
        }

        public static final void invoke$lambda$0(InterfaceC65463Tkf interfaceC65463Tkf) {
            C14360o3.A0B(interfaceC65463Tkf, 0);
            interfaceC65463Tkf.onResult(null);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5invoke() {
            Executor executor = this.$executor;
            final InterfaceC65463Tkf interfaceC65463Tkf = this.$callback;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderPlayServicesImpl$onClearCredential$1.AnonymousClass1.invoke$lambda$0(InterfaceC65463Tkf.this);
                }
            });
        }

        @Override // X.InterfaceC16820sZ
        public /* bridge */ /* synthetic */ Object invoke() {
            m5invoke();
            return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$1(CancellationSignal cancellationSignal, Executor executor, InterfaceC65463Tkf interfaceC65463Tkf) {
        super(1);
        this.$cancellationSignal = cancellationSignal;
        this.$executor = executor;
        this.$callback = interfaceC65463Tkf;
    }

    public final void invoke(Void r6) {
        CredentialProviderPlayServicesImpl.Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(this.$cancellationSignal, new AnonymousClass1(this.$executor, this.$callback));
    }

    @Override // X.InterfaceC16660sJ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Void) null);
        return C0eB.A00;
    }
}
