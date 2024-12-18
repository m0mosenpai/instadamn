package X;

import android.view.Choreographer;
import com.facebook.react.bridge.queue.MessageQueueThread;

/* renamed from: X.So5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ChoreographerFrameCallbackC63491So5 implements Choreographer.FrameCallback {
    public final /* synthetic */ T08 A00;

    public ChoreographerFrameCallbackC63491So5(T08 t08) {
        this.A00 = t08;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        T08 t08 = this.A00;
        if (t08.A0D.get() && !t08.A0E.get()) {
            return;
        }
        RunnableC64688TPt runnableC64688TPt = t08.A00;
        if (runnableC64688TPt != null) {
            runnableC64688TPt.A01 = true;
        }
        RunnableC64688TPt runnableC64688TPt2 = new RunnableC64688TPt(t08, j);
        t08.A00 = runnableC64688TPt2;
        MessageQueueThread messageQueueThread = t08.A05.A03;
        AbstractC05810Sj.A00(messageQueueThread);
        messageQueueThread.runOnQueue(runnableC64688TPt2);
        t08.A08.A02(this, EnumC61159RgK.A04);
    }
}
