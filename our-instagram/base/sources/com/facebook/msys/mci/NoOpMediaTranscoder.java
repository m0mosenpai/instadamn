package com.facebook.msys.mci;

import X.USE;
import X.USF;
import java.util.Map;

/* loaded from: classes11.dex */
public class NoOpMediaTranscoder implements MediaTranscoder {
    @Override // com.facebook.msys.mci.MediaTranscoder
    public byte[] transcodeImage(String str, double d, double d2, String str2, Map map) {
        return null;
    }

    @Override // com.facebook.msys.mci.MediaTranscoder
    public void transcodeImageV2(String str, double d, double d2, double d3, double d4, String str2, Map map, TranscodeImageCompletionCallback transcodeImageCompletionCallback) {
        transcodeImageCompletionCallback.success(null, null, null, null);
    }

    @Override // com.facebook.msys.mci.MediaTranscoder
    public void estimateVideoSize(String str, long j, Double d, Double d2, VideoSizeEstimatorCompletionCallback videoSizeEstimatorCompletionCallback) {
        Execution.executeAsync(new USF(this, videoSizeEstimatorCompletionCallback), null, 4);
    }

    @Override // com.facebook.msys.mci.MediaTranscoder
    public void transcodeVideo(String str, VideoEdits videoEdits, long j, long j2, TranscodeVideoCompletionCallback transcodeVideoCompletionCallback) {
        Execution.executeAsync(new USE(this, transcodeVideoCompletionCallback), null, 4);
    }
}
