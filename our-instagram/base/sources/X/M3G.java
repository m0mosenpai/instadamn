package X;

/* loaded from: classes8.dex */
public final class M3G implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ GestureDetectorOnGestureListenerC43829JZs A01;

    public M3G(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs, int i) {
        this.A01 = gestureDetectorOnGestureListenerC43829JZs;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.setCurrentFolderByIdAndSelectFirstItem(this.A00);
    }
}
