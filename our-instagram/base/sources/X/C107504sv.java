package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* renamed from: X.4sv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107504sv {
    public static C107504sv A02 = new C107504sv();
    public Choreographer A00;
    public final Handler A01;

    public static C107504sv A00() {
        return A02;
    }

    public final void A01(AbstractC107524sx abstractC107524sx) {
        abstractC107524sx.A02.set(null);
        Choreographer choreographer = this.A00;
        if (choreographer != null) {
            Choreographer.FrameCallback frameCallback = abstractC107524sx.A00;
            if (frameCallback == null) {
                frameCallback = new ChoreographerFrameCallbackC107664tB(abstractC107524sx);
                abstractC107524sx.A00 = frameCallback;
            }
            choreographer.postFrameCallback(frameCallback);
            return;
        }
        Handler handler = this.A01;
        Runnable runnable = abstractC107524sx.A01;
        if (runnable == null) {
            runnable = new RunnableC24262ApT(abstractC107524sx);
            abstractC107524sx.A01 = runnable;
        }
        handler.postDelayed(runnable, 0L);
    }

    public final void A02(AbstractC107524sx abstractC107524sx, long j) {
        abstractC107524sx.A02.set(null);
        Choreographer choreographer = this.A00;
        if (choreographer != null) {
            Choreographer.FrameCallback frameCallback = abstractC107524sx.A00;
            if (frameCallback == null) {
                frameCallback = new ChoreographerFrameCallbackC107664tB(abstractC107524sx);
                abstractC107524sx.A00 = frameCallback;
            }
            choreographer.postFrameCallbackDelayed(frameCallback, j);
            return;
        }
        Handler handler = this.A01;
        Runnable runnable = abstractC107524sx.A01;
        if (runnable == null) {
            runnable = new RunnableC24262ApT(abstractC107524sx);
            abstractC107524sx.A01 = runnable;
        }
        handler.postDelayed(runnable, j + 17);
    }

    public C107504sv() {
        if (AbstractC79383gk.A03()) {
            this.A00 = Choreographer.getInstance();
            return;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        this.A01 = handler;
        handler.post(new YGI(this));
    }
}
