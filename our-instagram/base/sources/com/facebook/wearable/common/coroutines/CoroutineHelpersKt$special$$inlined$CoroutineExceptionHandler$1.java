package com.facebook.wearable.common.coroutines;

import X.C12U;
import X.C12W;
import X.C3E9;
import X.C57549PgN;
import X.C9GL;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes4.dex */
public final class CoroutineHelpersKt$special$$inlined$CoroutineExceptionHandler$1 extends C12U implements CoroutineExceptionHandler {
    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C12W c12w, Throwable th) {
        new C9GL(new C57549PgN(th, 32)).start();
    }

    public CoroutineHelpersKt$special$$inlined$CoroutineExceptionHandler$1(C3E9 c3e9) {
        super(c3e9);
    }
}
