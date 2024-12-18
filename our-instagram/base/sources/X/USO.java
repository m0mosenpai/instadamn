package X;

import android.content.Context;
import android.util.Pair;
import com.facebook.msys.mci.VideoSizeEstimatorCompletionCallback;
import com.facebook.msys.mci.transcoder.DefaultMediaTranscoder;
import java.io.IOException;

/* loaded from: classes11.dex */
public final class USO extends AbstractRunnableC94874Os {
    public final /* synthetic */ long A00;
    public final /* synthetic */ VideoSizeEstimatorCompletionCallback A01;
    public final /* synthetic */ DefaultMediaTranscoder A02;
    public final /* synthetic */ Double A03;
    public final /* synthetic */ Double A04;
    public final /* synthetic */ String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USO(VideoSizeEstimatorCompletionCallback videoSizeEstimatorCompletionCallback, DefaultMediaTranscoder defaultMediaTranscoder, Double d, Double d2, String str, long j) {
        super("estimateVideoSize");
        this.A02 = defaultMediaTranscoder;
        this.A00 = j;
        this.A05 = str;
        this.A04 = d;
        this.A03 = d2;
        this.A01 = videoSizeEstimatorCompletionCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C54584O9l c54584O9l;
        long max;
        try {
            String str = this.A05;
            DefaultMediaTranscoder defaultMediaTranscoder = this.A02;
            C4Mm c4Mm = defaultMediaTranscoder.A03;
            if (c4Mm == null) {
                c54584O9l = null;
            } else {
                c54584O9l = new C54584O9l(c4Mm.A02, c4Mm.A00, c4Mm.A01);
            }
            Context context = defaultMediaTranscoder.A00;
            Double d = this.A04;
            Double d2 = this.A03;
            AbstractC167007dF.A1D(str, 0, context);
            try {
                MYB A01 = AbstractC55147OdA.A01(context, AbstractC55028OXj.A01(str), false);
                if (A01 != null) {
                    Pair A02 = AbstractC55028OXj.A02(A01, c54584O9l);
                    Object obj = A02.first;
                    C14360o3.A06(obj);
                    int intValue = ((Number) obj).intValue();
                    Object obj2 = A02.second;
                    C14360o3.A06(obj2);
                    WDI A022 = WFb.A02(A01, null, new W94(intValue, ((Number) obj2).intValue()), null, true, true, false, false, false);
                    long j = A01.A07;
                    long A00 = AbstractC55028OXj.A00(d);
                    long A002 = AbstractC55028OXj.A00(d2);
                    if (j <= 0) {
                        max = 0;
                    } else {
                        if (A002 != -1) {
                            j = Math.min(j, A002);
                        }
                        if (A00 == -1) {
                            A00 = 0;
                        }
                        max = Math.max(0L, j - A00);
                    }
                    this.A01.success(Math.round((((A022.A01() + 64000) / 8.0f) * ((float) max)) / 1000.0f));
                    return;
                }
                IOException iOException = new IOException("Extract media metadata is null");
                C0K8.A0F("VideoEstimator", "estimateVideoSize: input video file not found", iOException);
            } catch (IOException | IllegalArgumentException | SecurityException e) {
                C0K8.A0F("VideoEstimator", "transcodeVideo: Error with source Uri", e);
                throw e;
            }
        } catch (IOException | IllegalArgumentException | SecurityException e2) {
            this.A01.failure(this.A00, e2);
        }
    }
}
