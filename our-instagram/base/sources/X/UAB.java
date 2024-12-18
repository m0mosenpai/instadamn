package X;

import android.view.Surface;
import android.view.SurfaceView;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public abstract class UAB extends SurfaceView implements X9Q {
    public WeakReference A00;

    public Surface getSurface() {
        Surface surface;
        WeakReference weakReference = this.A00;
        if (weakReference == null || (surface = (Surface) weakReference.get()) == null) {
            return getHolder().getSurface();
        }
        return surface;
    }

    public final WeakReference getSurfaceReference() {
        return this.A00;
    }

    @Override // X.X9Q
    public void setSurface(Surface surface) {
        this.A00 = new WeakReference(surface);
    }

    public final void setSurfaceReference(WeakReference weakReference) {
        this.A00 = weakReference;
    }
}
