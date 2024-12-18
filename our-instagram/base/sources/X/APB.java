package X;

import android.graphics.SurfaceTexture;

/* loaded from: classes4.dex */
public final class APB implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ C201378vQ A00;

    public APB(C201378vQ c201378vQ) {
        this.A00 = c201378vQ;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.A00.A08 = true;
    }
}
