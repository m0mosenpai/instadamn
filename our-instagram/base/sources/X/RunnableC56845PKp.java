package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.facebook.cameracore.mediapipeline.services.video.implementation.VideoPlaybackItem;

/* renamed from: X.PKp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56845PKp implements Runnable {
    public final /* synthetic */ VideoPlaybackItem A00;

    public RunnableC56845PKp(VideoPlaybackItem videoPlaybackItem) {
        this.A00 = videoPlaybackItem;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoPlaybackItem videoPlaybackItem = this.A00;
        if (videoPlaybackItem.mIsPrepared) {
            videoPlaybackItem.mIsPrepared = false;
            try {
                videoPlaybackItem.mMediaPlayer.stop();
            } catch (IllegalStateException unused) {
            }
        }
        videoPlaybackItem.mMediaPlayer.release();
        videoPlaybackItem.mAvailableFrames.set(0);
        Surface surface = videoPlaybackItem.mSurface;
        if (surface != null) {
            surface.release();
            videoPlaybackItem.mSurface = null;
        }
        SurfaceTexture surfaceTexture = videoPlaybackItem.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            videoPlaybackItem.mSurfaceTexture = null;
        }
        AnonymousClass810 anonymousClass810 = videoPlaybackItem.mTexture;
        if (anonymousClass810 != null) {
            anonymousClass810.A01();
            videoPlaybackItem.mTexture = null;
        }
    }
}
