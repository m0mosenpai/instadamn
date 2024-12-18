package X;

import com.facebook.msys.mci.NoOpMediaTranscoder;
import com.facebook.msys.mci.TranscodeVideoCompletionCallback;

/* loaded from: classes11.dex */
public final class USE extends AbstractRunnableC94874Os {
    public final /* synthetic */ NoOpMediaTranscoder A00;
    public final /* synthetic */ TranscodeVideoCompletionCallback A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USE(NoOpMediaTranscoder noOpMediaTranscoder, TranscodeVideoCompletionCallback transcodeVideoCompletionCallback) {
        super("transcodeVideo");
        this.A00 = noOpMediaTranscoder;
        this.A01 = transcodeVideoCompletionCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.success(null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, -1.0d);
    }
}
