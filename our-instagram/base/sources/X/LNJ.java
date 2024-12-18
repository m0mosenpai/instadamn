package X;

import android.os.MessageQueue;

/* loaded from: classes8.dex */
public final class LNJ implements MessageQueue.IdleHandler {
    public final /* synthetic */ boolean A00;

    public LNJ(boolean z) {
        this.A00 = z;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        C41451vu.A01.E4s(new C3KG(A0K.A00(this.A00)));
        return false;
    }
}
