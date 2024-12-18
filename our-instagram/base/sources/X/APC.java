package X;

import android.graphics.SurfaceTexture;

/* loaded from: classes4.dex */
public final class APC implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ AbstractServiceC201348vN A00;

    public APC(AbstractServiceC201348vN abstractServiceC201348vN) {
        this.A00 = abstractServiceC201348vN;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.A00.A0M = true;
    }
}
