package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes10.dex */
public final class Q3Y extends Handler {
    public final /* synthetic */ QDK A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q3Y(Looper looper, QDK qdk) {
        super(looper);
        this.A00 = qdk;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj = message.obj;
        if (obj != null) {
            this.A00.A00((C88023wA) obj);
        }
    }
}
