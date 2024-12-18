package com.instagram.pendingmedia.service.impl;

import X.C0K8;
import X.C12U;
import X.C12W;
import X.C3E9;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class ConcurrentUploadQueueProcessor$special$$inlined$CoroutineExceptionHandler$1 extends C12U implements CoroutineExceptionHandler {
    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C12W c12w, Throwable th) {
        C0K8.A0F("PendingMediaCoroutineUploader", "CoroutineExceptionHandler", th);
    }

    public ConcurrentUploadQueueProcessor$special$$inlined$CoroutineExceptionHandler$1(C3E9 c3e9) {
        super(c3e9);
    }
}
