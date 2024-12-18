package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes10.dex */
public final class QDL extends AbstractC100374ez implements Runnable, InterfaceC100384f0 {
    public Handler A00;
    public HandlerThread A01;
    public final BlockingQueue A02;

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            C88023wA c88023wA = null;
            try {
                c88023wA = (C88023wA) this.A02.take();
            } catch (InterruptedException unused) {
            }
            if (c88023wA != null) {
                A00(c88023wA);
            }
        }
    }

    @Override // X.InterfaceC100384f0
    public final void E66(C88023wA c88023wA) {
        try {
            this.A02.put(c88023wA);
        } catch (InterruptedException unused) {
        }
    }

    @Override // X.InterfaceC100384f0
    public final void start() {
        this.A00.post(this);
    }

    public QDL(InterfaceC100264eo[] interfaceC100264eoArr) {
        super(interfaceC100264eoArr);
        this.A02 = new LinkedBlockingQueue();
        HandlerThread handlerThread = new HandlerThread("MQD-BlockProcessor", 10);
        AbstractC09770fa.A00(handlerThread);
        this.A01 = handlerThread;
        handlerThread.start();
        this.A00 = MSY.A09(this.A01);
    }
}
