package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.react.bridge.CatalystInstanceImpl;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class Q3Z extends Handler {
    public final SBH A00;

    public Q3Z(Looper looper, SBH sbh) {
        super(looper);
        this.A00 = sbh;
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        try {
            super.dispatchMessage(message);
        } catch (Exception e) {
            final CatalystInstanceImpl catalystInstanceImpl = this.A00.A00;
            AtomicInteger atomicInteger = CatalystInstanceImpl.sNextInstanceIdForTrace;
            catalystInstanceImpl.mJSExceptionHandler.handleException(e);
            catalystInstanceImpl.mReactQueueConfiguration.A02.runOnQueue(new Runnable() { // from class: X.TKY
                @Override // java.lang.Runnable
                public final void run() {
                    CatalystInstanceImpl.this.destroy();
                }
            });
        }
    }
}
