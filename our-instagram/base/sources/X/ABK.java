package X;

import android.view.MotionEvent;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;

/* loaded from: classes4.dex */
public final class ABK {
    public float A00;
    public float A01;
    public final /* synthetic */ C2039790k A02;

    public ABK(C2039790k c2039790k) {
        this.A02 = c2039790k;
    }

    public final boolean A00(MotionEvent motionEvent) {
        C2039790k c2039790k = this.A02;
        java.util.Set set = c2039790k.A0Q;
        Gesture.GestureType gestureType = Gesture.GestureType.TAP;
        if (!set.contains(gestureType)) {
            c2039790k.A0E = true;
            if (c2039790k.A00 == 0 && c2039790k.A01 == 0) {
                C2039790k.A01(c2039790k);
                return false;
            }
            return false;
        }
        C2039790k.A05(c2039790k, new Gesture(C2039790k.A00(c2039790k, gestureType), motionEvent.getX(), motionEvent.getY(), Gesture.GestureState.ENDED, true, this.A00, this.A01));
        return true;
    }
}
