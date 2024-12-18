package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.instagram.reels.viewer.common.ReelViewGroup;

/* renamed from: X.MbL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class HandlerC50755MbL extends Handler {
    public O4L A00;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        O4L o4l;
        C141626af orchestratorListener;
        MotionEvent motionEvent;
        C14360o3.A0B(message, 0);
        if (message.what == 1 && (o4l = this.A00) != null) {
            ReelViewGroup reelViewGroup = o4l.A00;
            C141636ag c141636ag = reelViewGroup.A02;
            if (c141636ag != null && (motionEvent = c141636ag.A00) != null) {
                motionEvent.recycle();
                c141636ag.A00 = null;
            }
            orchestratorListener = reelViewGroup.getOrchestratorListener();
            orchestratorListener.DQV(reelViewGroup.A00, reelViewGroup.A01);
            reelViewGroup.A04 = true;
        }
    }

    public HandlerC50755MbL() {
        super(Looper.getMainLooper());
    }
}
