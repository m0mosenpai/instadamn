package X;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* loaded from: classes12.dex */
public final class Y84 implements DisplayManager.DisplayListener {
    public final DisplayManager A00;
    public final /* synthetic */ C72797XnK A01;

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    public Y84(DisplayManager displayManager, C72797XnK c72797XnK) {
        this.A01 = c72797XnK;
        this.A00 = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            Display display = this.A00.getDisplay(0);
            if (display != null) {
                display.getRefreshRate();
            } else {
                AbstractC63374Sil.A04("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            }
        }
    }
}
