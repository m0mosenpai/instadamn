package androidx.credentials.playservices.controllers;

import X.C0YY;
import X.C0eB;
import X.C15370ps;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;

/* loaded from: classes10.dex */
public final class CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C15370ps $exception;
    public final /* synthetic */ InterfaceC16660sJ $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1(InterfaceC16660sJ interfaceC16660sJ, C15370ps c15370ps) {
        super(0);
        this.$onError = interfaceC16660sJ;
        this.$exception = c15370ps;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m33invoke() {
        this.$onError.invoke(this.$exception.A00);
    }

    @Override // X.InterfaceC16820sZ
    public /* bridge */ /* synthetic */ Object invoke() {
        m33invoke();
        return C0eB.A00;
    }
}
