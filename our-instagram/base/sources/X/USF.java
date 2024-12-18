package X;

import com.facebook.msys.mci.NoOpMediaTranscoder;
import com.facebook.msys.mci.VideoSizeEstimatorCompletionCallback;

/* loaded from: classes11.dex */
public final class USF extends AbstractRunnableC94874Os {
    public final /* synthetic */ NoOpMediaTranscoder A00;
    public final /* synthetic */ VideoSizeEstimatorCompletionCallback A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USF(NoOpMediaTranscoder noOpMediaTranscoder, VideoSizeEstimatorCompletionCallback videoSizeEstimatorCompletionCallback) {
        super("estimateVideoSize");
        this.A00 = noOpMediaTranscoder;
        this.A01 = videoSizeEstimatorCompletionCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.success(0L);
    }
}
