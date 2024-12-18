package X;

import java.util.List;

/* renamed from: X.LxH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49686LxH implements C30G {
    public final /* synthetic */ C45495KCk A00;

    @Override // X.C30G
    public final void onCompletion() {
    }

    @Override // X.C30G
    public final void onCues(List list) {
    }

    @Override // X.C30G
    public final void onDrawnToSurface() {
    }

    @Override // X.C30G
    public final void onPrepare(C4S7 c4s7) {
    }

    @Override // X.C30G
    public final void onProgressStateChanged(boolean z) {
    }

    @Override // X.C30G
    public final void onProgressUpdate(int i, int i2, boolean z) {
    }

    @Override // X.C30G
    public final void onSurfaceTextureDestroyed() {
    }

    @Override // X.C30G
    public final void onSurfaceTextureUpdated(C4S7 c4s7) {
    }

    @Override // X.C30G
    public final void onVideoDownloading(C4S7 c4s7) {
    }

    @Override // X.C30G
    public final void onVideoPlayerError(C4S7 c4s7, String str) {
    }

    @Override // X.C30G
    public final void onVideoPrepared(C4S7 c4s7, boolean z) {
    }

    @Override // X.C30G
    public final void onVideoSwitchToWarmupPlayer(C4S7 c4s7) {
    }

    @Override // X.C30G
    public final void onVideoViewPrepared(C4S7 c4s7) {
    }

    public C49686LxH(C45495KCk c45495KCk) {
        this.A00 = c45495KCk;
    }

    @Override // X.C30G
    public final void onLoop(int i) {
        C45495KCk c45495KCk = this.A00;
        c45495KCk.A00().DzD();
        c45495KCk.Eo6();
    }

    @Override // X.C30G
    public final void onSeeking(long j) {
        this.A00.A00().Dzq((int) j);
    }

    @Override // X.C30G
    public final void onStopVideo(String str, boolean z) {
        this.A00.A00().Dp5();
    }

    @Override // X.C30G
    public final void onStopped(C4S7 c4s7, int i) {
        this.A00.A00().E0B();
    }

    @Override // X.C30G
    public final void onVideoStartedPlaying(C4S7 c4s7) {
        this.A00.A00().E03();
    }
}
