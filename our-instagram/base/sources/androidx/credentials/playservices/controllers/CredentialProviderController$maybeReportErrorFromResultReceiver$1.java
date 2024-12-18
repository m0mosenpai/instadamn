package androidx.credentials.playservices.controllers;

import X.AbstractC167017dG;
import X.C0YY;
import X.C0eB;
import X.InterfaceC16820sZ;
import X.InterfaceC65463Tkf;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class CredentialProviderController$maybeReportErrorFromResultReceiver$1 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ InterfaceC65463Tkf $callback;
    public final /* synthetic */ Object $exception;
    public final /* synthetic */ Executor $executor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderController$maybeReportErrorFromResultReceiver$1(Executor executor, InterfaceC65463Tkf interfaceC65463Tkf, Object obj) {
        super(0);
        this.$executor = executor;
        this.$callback = interfaceC65463Tkf;
        this.$exception = obj;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m35invoke() {
        Executor executor = this.$executor;
        final InterfaceC65463Tkf interfaceC65463Tkf = this.$callback;
        final Object obj = this.$exception;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CredentialProviderController$maybeReportErrorFromResultReceiver$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderController$maybeReportErrorFromResultReceiver$1.invoke$lambda$0(InterfaceC65463Tkf.this, obj);
            }
        });
    }

    public static final void invoke$lambda$0(InterfaceC65463Tkf interfaceC65463Tkf, Object obj) {
        AbstractC167017dG.A1N(interfaceC65463Tkf, obj);
        interfaceC65463Tkf.DEG(obj);
    }

    @Override // X.InterfaceC16820sZ
    public /* bridge */ /* synthetic */ Object invoke() {
        m35invoke();
        return C0eB.A00;
    }
}
