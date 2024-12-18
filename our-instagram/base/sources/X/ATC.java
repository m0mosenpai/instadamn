package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraPreCaptureUtilityMenu;

/* loaded from: classes4.dex */
public final class ATC implements View.OnTouchListener {
    public final /* synthetic */ CameraPreCaptureUtilityMenu A00;

    public ATC(CameraPreCaptureUtilityMenu cameraPreCaptureUtilityMenu) {
        this.A00 = cameraPreCaptureUtilityMenu;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C172287lx c172287lx = this.A00.A03;
        if (c172287lx != null) {
            c172287lx.A00();
            return false;
        }
        return false;
    }
}
