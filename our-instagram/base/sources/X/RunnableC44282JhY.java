package X;

/* renamed from: X.JhY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC44282JhY implements Runnable {
    public final /* synthetic */ GestureDetectorOnGestureListenerC44266JhD A00;
    public final /* synthetic */ com.instagram.creation.base.ui.mediatabbar.Tab A01;
    public final /* synthetic */ boolean A02;

    public RunnableC44282JhY(GestureDetectorOnGestureListenerC44266JhD gestureDetectorOnGestureListenerC44266JhD, com.instagram.creation.base.ui.mediatabbar.Tab tab, boolean z) {
        this.A00 = gestureDetectorOnGestureListenerC44266JhD;
        this.A01 = tab;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A03(this.A01, this.A02);
    }
}
