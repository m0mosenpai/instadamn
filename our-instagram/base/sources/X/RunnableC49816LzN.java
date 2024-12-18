package X;

import android.os.Handler;
import com.facebook.smartcapture.components.RectDetectionVisualizerView;

/* renamed from: X.LzN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49816LzN implements Runnable {
    public final /* synthetic */ RectDetectionVisualizerView A00;

    public RunnableC49816LzN(RectDetectionVisualizerView rectDetectionVisualizerView) {
        this.A00 = rectDetectionVisualizerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = this.A00.A00;
        if (handler != null) {
            handler.postDelayed(this, 33L);
        }
    }
}
