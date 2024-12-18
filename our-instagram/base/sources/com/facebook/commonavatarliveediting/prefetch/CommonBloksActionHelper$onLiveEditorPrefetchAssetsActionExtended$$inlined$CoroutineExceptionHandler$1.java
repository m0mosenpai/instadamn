package com.facebook.commonavatarliveediting.prefetch;

import X.C0K8;
import X.C12U;
import X.C12W;
import X.C3E9;
import X.OMg;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes9.dex */
public final class CommonBloksActionHelper$onLiveEditorPrefetchAssetsActionExtended$$inlined$CoroutineExceptionHandler$1 extends C12U implements CoroutineExceptionHandler {
    public final /* synthetic */ OMg $liveEditingQplLogger$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonBloksActionHelper$onLiveEditorPrefetchAssetsActionExtended$$inlined$CoroutineExceptionHandler$1(C3E9 c3e9, OMg oMg) {
        super(c3e9);
        this.$liveEditingQplLogger$inlined = oMg;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C12W c12w, Throwable th) {
        C0K8.A0F("CommonBloksActionHelper", "prefetch failed", th);
        this.$liveEditingQplLogger$inlined.A05((short) 3);
    }
}
