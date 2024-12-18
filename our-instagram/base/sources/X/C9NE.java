package X;

import android.graphics.SurfaceTexture;
import com.instagram.filterkit.filter.VideoFilter;

/* renamed from: X.9NE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9NE implements SurfaceTexture.OnFrameAvailableListener {
    public boolean A00;
    public final VideoFilter A01;
    public final C9NA A02;

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            if (!this.A00) {
                this.A00 = true;
                notifyAll();
            } else {
                throw new RuntimeException(AbstractC111324zv.A00(232));
            }
        }
    }

    public C9NE(VideoFilter videoFilter, C9NA c9na) {
        this.A02 = c9na;
        this.A01 = videoFilter;
    }
}
