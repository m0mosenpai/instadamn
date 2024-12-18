package X;

import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;

/* renamed from: X.Aqq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24347Aqq implements Runnable {
    public final /* synthetic */ CameraToolMenuItem A00;

    public RunnableC24347Aqq(CameraToolMenuItem cameraToolMenuItem) {
        this.A00 = cameraToolMenuItem;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CameraToolMenuItem cameraToolMenuItem = this.A00;
        cameraToolMenuItem.A0B = false;
        cameraToolMenuItem.A06 = null;
        cameraToolMenuItem.postInvalidate();
    }
}
