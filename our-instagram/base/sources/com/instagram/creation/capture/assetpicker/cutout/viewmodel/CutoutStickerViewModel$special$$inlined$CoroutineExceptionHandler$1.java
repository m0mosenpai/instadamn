package com.instagram.creation.capture.assetpicker.cutout.viewmodel;

import X.C12U;
import X.C12W;
import X.C217599js;
import X.C3E9;
import X.C8OP;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes4.dex */
public final class CutoutStickerViewModel$special$$inlined$CoroutineExceptionHandler$1 extends C12U implements CoroutineExceptionHandler {
    public final /* synthetic */ C8OP this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutoutStickerViewModel$special$$inlined$CoroutineExceptionHandler$1(C3E9 c3e9, C8OP c8op) {
        super(c3e9);
        this.this$0 = c8op;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C12W c12w, Throwable th) {
        this.this$0.A0A.Egh(new C217599js(null, null, th));
    }
}
