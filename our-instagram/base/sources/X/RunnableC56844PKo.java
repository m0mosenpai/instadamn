package X;

import com.facebook.cameracore.mediapipeline.services.video.implementation.VideoPlaybackItem;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.PKo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56844PKo implements Runnable {
    public final /* synthetic */ VideoPlaybackItem A00;

    public RunnableC56844PKo(VideoPlaybackItem videoPlaybackItem) {
        this.A00 = videoPlaybackItem;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            VideoPlaybackItem videoPlaybackItem = this.A00;
            String str = videoPlaybackItem.mVideoUri;
            if (str.startsWith("/")) {
                videoPlaybackItem.mMediaPlayer.setDataSource(str);
            } else {
                HashMap A1G = AbstractC166987dD.A1G();
                if (!videoPlaybackItem.mRedirectAllowed) {
                    A1G.put("android-allow-cross-domain-redirect", "0");
                }
                videoPlaybackItem.mMediaPlayer.setDataSource(videoPlaybackItem.mContext, AbstractC08820cl.A03(videoPlaybackItem.mVideoUri), A1G);
            }
            videoPlaybackItem.mMediaPlayer.setOnPreparedListener(videoPlaybackItem);
            videoPlaybackItem.mMediaPlayer.setOnCompletionListener(videoPlaybackItem);
            videoPlaybackItem.mMediaPlayer.setVolume(0.0f, 0.0f);
            videoPlaybackItem.mMediaPlayer.prepareAsync();
        } catch (IOException | IllegalArgumentException | IllegalStateException | SecurityException unused) {
            this.A00.mHasError.set(true);
        }
    }
}
