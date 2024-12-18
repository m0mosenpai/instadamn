package com.facebook.commonavatarliveediting.prefetch;

import X.C0K8;
import X.C12U;
import X.C12W;
import X.C15370ps;
import X.C3E9;
import X.C55069OaP;
import X.C6FQ;
import X.InterfaceC103384lE;
import X.OMg;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes9.dex */
public final class CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$$inlined$CoroutineExceptionHandler$1 extends C12U implements CoroutineExceptionHandler {
    public final /* synthetic */ C6FQ $environment$inlined;
    public final /* synthetic */ OMg $liveEditingQplLogger$inlined;
    public final /* synthetic */ C15370ps $onEvent$inlined;
    public final /* synthetic */ C55069OaP this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$$inlined$CoroutineExceptionHandler$1(C3E9 c3e9, C55069OaP c55069OaP, C15370ps c15370ps, C6FQ c6fq, OMg oMg) {
        super(c3e9);
        this.this$0 = c55069OaP;
        this.$onEvent$inlined = c15370ps;
        this.$environment$inlined = c6fq;
        this.$liveEditingQplLogger$inlined = oMg;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C12W c12w, Throwable th) {
        C0K8.A0F("CommonBloksActionHelper", "load live editor failed", th);
        C55069OaP.A01(this.this$0, this.$environment$inlined, (InterfaceC103384lE) this.$onEvent$inlined.A00, "unknown_error");
        this.$liveEditingQplLogger$inlined.A05((short) 3);
    }
}
