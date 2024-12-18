package com.facebook.commonavatarliveediting.prefetch;

import X.AbstractC50523MSb;
import X.C0K8;
import X.C12U;
import X.C12W;
import X.C3E9;
import X.InterfaceC24901Jp;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes9.dex */
public final class CommonBloksActionHelper$initPrefetch$lambda$12$$inlined$CoroutineExceptionHandler$1 extends C12U implements CoroutineExceptionHandler {
    public final /* synthetic */ InterfaceC24901Jp $continuation$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonBloksActionHelper$initPrefetch$lambda$12$$inlined$CoroutineExceptionHandler$1(C3E9 c3e9, InterfaceC24901Jp interfaceC24901Jp) {
        super(c3e9);
        this.$continuation$inlined = interfaceC24901Jp;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C12W c12w, Throwable th) {
        C0K8.A0F("CommonBloksActionHelper", "initPrefetch failed", th);
        this.$continuation$inlined.resumeWith(AbstractC50523MSb.A0d(th));
    }
}
