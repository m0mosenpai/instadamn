package X;

import android.os.MessageQueue;

/* loaded from: classes8.dex */
public final class LNI implements MessageQueue.IdleHandler {
    public final /* synthetic */ InterfaceC16820sZ A00;

    public LNI(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        return AbstractC25231BEo.A1b(this.A00);
    }
}
