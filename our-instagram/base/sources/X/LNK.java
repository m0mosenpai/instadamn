package X;

import android.content.Context;
import android.os.MessageQueue;

/* loaded from: classes8.dex */
public final class LNK implements MessageQueue.IdleHandler {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;

    public LNK(Context context, String str) {
        this.A00 = context;
        this.A01 = str;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        C14120nc.A00().ATO(new RcD(this.A00, this.A01));
        return false;
    }
}
