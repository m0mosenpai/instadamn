package kotlinx.coroutines;

import X.C12U;
import X.C12W;
import X.C3E9;
import X.InterfaceC16620sF;

/* loaded from: classes9.dex */
public final class CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1 extends C12U implements CoroutineExceptionHandler {
    public final /* synthetic */ InterfaceC16620sF $handler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1(InterfaceC16620sF interfaceC16620sF, C3E9 c3e9) {
        super(c3e9);
        this.$handler = interfaceC16620sF;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C12W c12w, Throwable th) {
        this.$handler.invoke(c12w, th);
    }
}
