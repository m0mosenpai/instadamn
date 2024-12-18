package X;

import android.os.Message;

/* loaded from: classes11.dex */
public final class V6R extends AbstractRunnableC14200nk {
    public final /* synthetic */ Message A00;
    public final /* synthetic */ HandlerC57442kJ A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6R(Message message, HandlerC57442kJ handlerC57442kJ, int i) {
        super(i, 1, false, true);
        this.A01 = handlerC57442kJ;
        this.A00 = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HandlerC57442kJ handlerC57442kJ = this.A01;
        Message message = this.A00;
        handlerC57442kJ.handleMessage(message);
        message.recycle();
    }
}
