package com.facebook.cameracore.mediapipeline.services.video.implementation;

import X.AnonymousClass810;
import X.AnonymousClass811;
import X.AnonymousClass812;
import X.MSW;
import X.RunnableC56844PKo;
import X.RunnableC56845PKp;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.opengl.Matrix;
import android.view.Surface;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public class VideoPlaybackItem implements SurfaceTexture.OnFrameAvailableListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {
    public final ExecutorService mBackgroundThread;
    public final Context mContext;
    public boolean mIsLooping;
    public final MediaPlayer mMediaPlayer;
    public final boolean mRedirectAllowed;
    public final float[] mSMatrix;
    public Surface mSurface;
    public SurfaceTexture mSurfaceTexture;
    public AnonymousClass810 mTexture;
    public final String mVideoUri;
    public final VideoFrame mVideoFrame = new Object();
    public volatile boolean mIsPrepared = false;
    public volatile boolean mStartRequested = false;
    public int mLoopedCount = 0;
    public int mCompletedCount = 0;
    public final AtomicInteger mAvailableFrames = MSW.A1C(0);
    public final AtomicBoolean mHasError = new AtomicBoolean(false);

    public void pause() {
        this.mStartRequested = false;
        try {
            this.mMediaPlayer.pause();
        } catch (IllegalStateException unused) {
            this.mHasError.set(true);
        }
    }

    public void resume() {
        this.mStartRequested = true;
        if (this.mIsPrepared) {
            try {
                this.mMediaPlayer.start();
            } catch (IllegalStateException unused) {
                this.mHasError.set(true);
            }
        }
    }

    public int getCompletedCount() {
        return this.mCompletedCount;
    }

    public int getDuration() {
        return this.mMediaPlayer.getDuration();
    }

    public boolean getHasError() {
        return this.mHasError.getAndSet(false);
    }

    public boolean getIsPlaying() {
        return this.mMediaPlayer.isPlaying();
    }

    public int getLoopedCount() {
        return this.mLoopedCount;
    }

    public boolean getLooping() {
        return this.mIsLooping;
    }

    public int getPosition() {
        return this.mMediaPlayer.getCurrentPosition();
    }

    public VideoFrame getVideoFrameIfAvailable() {
        int i = 0;
        int andSet = this.mAvailableFrames.getAndSet(0);
        if (andSet <= 0 || this.mSurface == null || this.mTexture == null || this.mSurfaceTexture == null) {
            return null;
        }
        do {
            this.mSurfaceTexture.updateTexImage();
            i++;
        } while (i < andSet);
        this.mSurfaceTexture.getTransformMatrix(this.mSMatrix);
        VideoFrame videoFrame = this.mVideoFrame;
        AnonymousClass810 anonymousClass810 = this.mTexture;
        int i2 = anonymousClass810.A00;
        int i3 = anonymousClass810.A01;
        float[] fArr = this.mSMatrix;
        AnonymousClass812 anonymousClass812 = anonymousClass810.A02;
        int i4 = anonymousClass812.A01;
        int i5 = anonymousClass812.A00;
        long currentPosition = this.mMediaPlayer.getCurrentPosition();
        videoFrame.textureHandler = i2;
        videoFrame.textureTarget = i3;
        videoFrame.transformationMatrix = fArr;
        videoFrame.width = i4;
        videoFrame.height = i5;
        videoFrame.presentationTimestamp = currentPosition;
        return this.mVideoFrame;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        if (this.mIsLooping) {
            this.mLoopedCount++;
            try {
                mediaPlayer.start();
                return;
            } catch (IllegalStateException unused) {
                this.mHasError.set(true);
                return;
            }
        }
        this.mCompletedCount++;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.mHasError.set(true);
        return false;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.mAvailableFrames.incrementAndGet();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        this.mMediaPlayer.setLooping(false);
        AnonymousClass811 anonymousClass811 = new AnonymousClass811("VideoPlaybackItem");
        anonymousClass811.A03 = 36197;
        anonymousClass811.A04 = this.mMediaPlayer.getVideoWidth();
        anonymousClass811.A02 = this.mMediaPlayer.getVideoHeight();
        AnonymousClass810 anonymousClass810 = new AnonymousClass810(anonymousClass811);
        this.mTexture = anonymousClass810;
        SurfaceTexture surfaceTexture = new SurfaceTexture(anonymousClass810.A00);
        this.mSurfaceTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        Surface surface = new Surface(this.mSurfaceTexture);
        this.mSurface = surface;
        this.mMediaPlayer.setSurface(surface);
        this.mIsPrepared = true;
        if (this.mStartRequested) {
            try {
                this.mMediaPlayer.start();
            } catch (IllegalStateException unused) {
                this.mHasError.set(true);
            }
        }
    }

    public void prepare() {
        this.mBackgroundThread.execute(new RunnableC56844PKo(this));
    }

    public void seek(int i) {
        this.mMediaPlayer.seekTo(i, 3);
    }

    public void setVolume(float f, float f2) {
        this.mMediaPlayer.setVolume(f, f2);
    }

    public void teardown() {
        if (!this.mBackgroundThread.isShutdown()) {
            this.mBackgroundThread.execute(new RunnableC56845PKp(this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.cameracore.mediapipeline.services.video.implementation.VideoFrame, java.lang.Object] */
    public VideoPlaybackItem(Context context, String str, boolean z, ExecutorService executorService) {
        float[] fArr = new float[16];
        this.mSMatrix = fArr;
        this.mContext = context;
        this.mVideoUri = str;
        this.mRedirectAllowed = z;
        this.mBackgroundThread = executorService;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.mMediaPlayer = mediaPlayer;
        mediaPlayer.setOnErrorListener(this);
        Matrix.setIdentityM(fArr, 0);
    }

    public void setLooping(boolean z) {
        this.mIsLooping = z;
    }
}
