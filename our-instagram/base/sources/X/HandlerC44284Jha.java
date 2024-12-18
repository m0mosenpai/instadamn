package X;

import android.hardware.Sensor;
import android.os.Handler;
import android.os.Message;
import com.instagram.creation.capture.MediaCaptureFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.Jha, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class HandlerC44284Jha extends Handler {
    public final WeakReference A00;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        MediaCaptureFragment mediaCaptureFragment;
        if (message.what == 1 && (mediaCaptureFragment = (MediaCaptureFragment) this.A00.get()) != null) {
            C44265JhC c44265JhC = mediaCaptureFragment.A03;
            Sensor sensor = c44265JhC.A06;
            if (sensor == null) {
                C0K8.A0D("PreciseOrientationEventListener", "Cannot detect sensors. Not enabled");
            } else {
                if (c44265JhC.A05) {
                    return;
                }
                C0fX.A01(sensor, c44265JhC.A04, c44265JhC.A07, 3);
                c44265JhC.A05 = true;
            }
        }
    }

    public HandlerC44284Jha(MediaCaptureFragment mediaCaptureFragment) {
        this.A00 = AbstractC25225BEi.A16(mediaCaptureFragment);
    }
}
