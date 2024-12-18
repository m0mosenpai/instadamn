package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.AZd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23404AZd implements InterfaceC175577rX, SurfaceTexture.OnFrameAvailableListener {
    public volatile SurfaceTexture A00;
    public final /* synthetic */ C180177z7 A01;

    public C23404AZd(C180177z7 c180177z7) {
        this.A01 = c180177z7;
    }

    @Override // X.InterfaceC175577rX
    public final void EGZ(Long l) {
        WIL wil = this.A01.A0K;
        SurfaceTexture surfaceTexture = this.A00;
        if (wil != null && surfaceTexture != null) {
            wil.onFrameAvailable(surfaceTexture);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.A00 = surfaceTexture;
        InterfaceC175597rZ interfaceC175597rZ = this.A01.A0J;
        if (interfaceC175597rZ != null) {
            interfaceC175597rZ.DIE();
        }
    }
}
