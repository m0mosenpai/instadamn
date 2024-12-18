package X;

import android.os.Handler;
import android.os.Message;
import android.view.Choreographer;

/* loaded from: classes11.dex */
public final class WKn implements Choreographer.FrameCallback {
    public final /* synthetic */ U9K A00;

    public WKn(U9K u9k) {
        this.A00 = u9k;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        U9K u9k = this.A00;
        if (!u9k.A0G && u9k.A02 != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = new C68866VdM(j);
            Handler handler = u9k.A02;
            if (handler != null) {
                handler.sendMessage(obtain);
                return;
            }
            return;
        }
        u9k.A0B.removeFrameCallback(u9k.A0A);
    }
}
