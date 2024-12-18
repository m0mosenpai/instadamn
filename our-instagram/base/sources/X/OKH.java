package X;

import com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder;

/* loaded from: classes9.dex */
public final class OKH {
    public final /* synthetic */ HandlerExecutorAndBuilder A00;

    public OKH(HandlerExecutorAndBuilder handlerExecutorAndBuilder) {
        this.A00 = handlerExecutorAndBuilder;
    }

    public final Object A00() {
        OLh oLh = this.A00.A00;
        if (oLh != null) {
            if (oLh.A01) {
                Object obj = oLh.A00;
                if (obj != null) {
                    return obj;
                }
            } else {
                throw AbstractC166987dD.A14("DeferredActionValue not resolved. Have you called it outside of an action execution block?");
            }
        }
        throw AbstractC166987dD.A14("No action results have been labeled as return type. Have you used construct HandlerConfig.returns{ ... }");
    }

    public final Object A01(InterfaceC16510rw interfaceC16510rw) {
        Object obj = this.A00.A06.get(interfaceC16510rw);
        C14360o3.A0C(obj, "null cannot be cast to non-null type T of com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder.InnerHandlerContext.get");
        return obj;
    }
}
