package com.facebook.payments.dcp.xapp.controller;

import X.C12U;
import X.C12W;
import X.C3E9;
import X.EnumC61185Rgl;
import X.InterfaceC65490TlB;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes10.dex */
public final class InAppPurchaseControllerCoro$createQuoteAndPayment$$inlined$CoroutineExceptionHandler$1 extends C12U implements CoroutineExceptionHandler {
    public final /* synthetic */ InterfaceC65490TlB $purchaseListener$inlined;
    public final /* synthetic */ InAppPurchaseControllerCoro this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppPurchaseControllerCoro$createQuoteAndPayment$$inlined$CoroutineExceptionHandler$1(C3E9 c3e9, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, InterfaceC65490TlB interfaceC65490TlB) {
        super(c3e9);
        this.this$0 = inAppPurchaseControllerCoro;
        this.$purchaseListener$inlined = interfaceC65490TlB;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C12W c12w, Throwable th) {
        InterfaceC65490TlB interfaceC65490TlB = this.$purchaseListener$inlined;
        if (interfaceC65490TlB != null) {
            interfaceC65490TlB.DcW(EnumC61185Rgl.A0O);
        }
    }
}
