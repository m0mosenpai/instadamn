package X;

import java.util.List;

/* renamed from: X.30G, reason: invalid class name */
/* loaded from: classes2.dex */
public interface C30G {
    void onCompletion();

    void onCues(List list);

    void onDrawnToSurface();

    void onLoop(int i);

    void onPrepare(C4S7 c4s7);

    void onProgressStateChanged(boolean z);

    void onProgressUpdate(int i, int i2, boolean z);

    void onSeeking(long j);

    void onStopVideo(String str, boolean z);

    void onStopped(C4S7 c4s7, int i);

    void onSurfaceTextureDestroyed();

    void onSurfaceTextureUpdated(C4S7 c4s7);

    void onVideoDownloading(C4S7 c4s7);

    void onVideoPlayerError(C4S7 c4s7, String str);

    void onVideoPrepared(C4S7 c4s7, boolean z);

    void onVideoStartedPlaying(C4S7 c4s7);

    void onVideoSwitchToWarmupPlayer(C4S7 c4s7);

    void onVideoViewPrepared(C4S7 c4s7);
}
