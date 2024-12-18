package X;

import android.view.SurfaceHolder;

/* loaded from: classes11.dex */
public final class V6Q extends AbstractRunnableC14200nk {
    public final /* synthetic */ SurfaceHolder.Callback A00;
    public final /* synthetic */ SurfaceHolder A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6Q(SurfaceHolder.Callback callback, SurfaceHolder surfaceHolder) {
        super(1738297443, 2, false, false);
        this.A00 = callback;
        this.A01 = surfaceHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.surfaceCreated(this.A01);
    }
}
