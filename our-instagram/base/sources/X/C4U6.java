package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* renamed from: X.4U6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4U6 implements Handler.Callback, Choreographer.FrameCallback {
    public static final C4U6 A05 = new C4U6();
    public int A00;
    public Choreographer A01;
    public final Handler A02;
    public final HandlerThread A03;
    public volatile long A04 = -9223372036854775807L;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.A04 = j;
        Choreographer choreographer = this.A01;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                Choreographer choreographer = this.A01;
                if (choreographer == null) {
                    return true;
                }
                int i2 = this.A00 - 1;
                this.A00 = i2;
                if (i2 != 0) {
                    return true;
                }
                choreographer.removeFrameCallback(this);
                this.A04 = -9223372036854775807L;
                return true;
            }
            Choreographer choreographer2 = this.A01;
            if (choreographer2 == null) {
                return true;
            }
            int i3 = this.A00 + 1;
            this.A00 = i3;
            if (i3 != 1) {
                return true;
            }
            choreographer2.postFrameCallback(this);
            return true;
        }
        try {
            this.A01 = Choreographer.getInstance();
            return true;
        } catch (RuntimeException e) {
            AbstractC46512Bo.A06(AbstractC111324zv.A00(3814), AbstractC111324zv.A00(1862), e);
            return true;
        }
    }

    public C4U6() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        AbstractC09770fa.A00(handlerThread);
        this.A03 = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.A02 = handler;
        handler.sendEmptyMessage(0);
    }
}
