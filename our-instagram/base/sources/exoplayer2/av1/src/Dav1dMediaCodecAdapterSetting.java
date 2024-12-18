package exoplayer2.av1.src;

import android.content.Context;
import com.facebook.exoplayer.monitor.VpsEventCallback;

/* loaded from: classes2.dex */
public class Dav1dMediaCodecAdapterSetting {
    public final boolean alignLeft;
    public final long allowedJoiningTimeMs;
    public final Context appContext;
    public final boolean applyGrain;
    public final boolean dav1dThrowExceptionOnPictureError;
    public final boolean enableAV1SRShader;
    public final boolean enableDav1dJniV2;
    public final boolean enableDav1dOpenGLRenderingHandleAspectRatio;
    public final boolean enableDynamicNDK;
    public final boolean enableMmeLogging;
    public final boolean enableOpenGLRendering;
    public final int maxDroppedFramesToNotify;
    public final int maxFrameDelay;
    public final int maxNumRetryLockingCanvas;
    public final int maxWidthForAV1SRShader;
    public final int nThreads;
    public final Dav1dScalingMode scalingMode;
    public final boolean useThreadAffinity;
    public final boolean validateEglSurfaceSize;
    public final String videoId;
    public final VpsEventCallback vpsEventCallback;

    public Dav1dMediaCodecAdapterSetting(Dav1dScalingMode dav1dScalingMode, long j, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, VpsEventCallback vpsEventCallback, boolean z6, boolean z7, int i5, boolean z8, boolean z9, boolean z10, boolean z11, String str, Context context) {
        this.scalingMode = dav1dScalingMode;
        this.allowedJoiningTimeMs = j;
        this.maxDroppedFramesToNotify = i;
        this.nThreads = i2;
        this.maxFrameDelay = i3;
        this.maxNumRetryLockingCanvas = i4;
        this.applyGrain = z;
        this.dav1dThrowExceptionOnPictureError = z2;
        this.useThreadAffinity = z5;
        this.enableOpenGLRendering = z3;
        this.enableMmeLogging = z4;
        this.vpsEventCallback = vpsEventCallback;
        this.alignLeft = z6;
        this.enableAV1SRShader = z7;
        this.maxWidthForAV1SRShader = i5;
        this.enableDav1dOpenGLRenderingHandleAspectRatio = z8;
        this.enableDynamicNDK = z9;
        this.enableDav1dJniV2 = z10;
        this.validateEglSurfaceSize = z11;
        this.videoId = str;
        this.appContext = context;
    }
}
