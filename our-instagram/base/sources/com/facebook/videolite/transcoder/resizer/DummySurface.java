package com.facebook.videolite.transcoder.resizer;

import X.AbstractC05810Sj;
import X.U7W;
import X.U9H;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes11.dex */
public final class DummySurface extends Surface {
    public static U7W A02;
    public boolean A00;
    public final U9H A01;

    public DummySurface(SurfaceTexture surfaceTexture, U9H u9h) {
        super(surfaceTexture);
        this.A01 = u9h;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        U9H u9h = this.A01;
        synchronized (u9h) {
            if (!this.A00) {
                AbstractC05810Sj.A00(u9h.A00);
                u9h.A00.sendEmptyMessage(2);
                this.A00 = true;
            }
        }
    }
}
