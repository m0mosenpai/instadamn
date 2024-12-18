package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class Q3b extends Handler {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q3b(Looper looper, Object obj, int i) {
        super(looper);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = this.A00;
        int i2 = message.what;
        if (i != 0) {
            if (i2 == 1) {
                C64148T0z c64148T0z = (C64148T0z) this.A01;
                C64148T0z.A01(c64148T0z, new RunnableC64581TKs(c64148T0z));
                C64148T0z.A01(c64148T0z, new RunnableC64582TKt(c64148T0z));
                return;
            }
            return;
        }
        if (i2 != 1) {
            return;
        }
        C62952SYu c62952SYu = (C62952SYu) this.A01;
        Executor executor = C62952SYu.A04;
        c62952SYu.A03.set(false);
        C62952SYu.A04.execute(new RunnableC64579TKq(c62952SYu));
    }
}
