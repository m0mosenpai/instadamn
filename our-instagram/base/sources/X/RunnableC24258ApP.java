package X;

import android.view.MotionEvent;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import java.util.Map;

/* renamed from: X.ApP, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24258ApP implements Runnable {
    public final /* synthetic */ AKQ A00;

    public RunnableC24258ApP(AKQ akq) {
        this.A00 = akq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MotionEvent motionEvent;
        long A00;
        AKQ akq = this.A00;
        Boolean A0a = AbstractC166997dE.A0a();
        int i = AKQ.A0K;
        akq.A07 = A0a;
        ABK abk = akq.A0H;
        C2039790k c2039790k = abk.A02;
        boolean z = true;
        c2039790k.A0E = true;
        java.util.Set set = c2039790k.A0Q;
        Gesture.GestureType gestureType = Gesture.GestureType.LONG_PRESS;
        if (!set.contains(gestureType)) {
            if (c2039790k.A00 == 0 && c2039790k.A01 == 0) {
                C2039790k.A01(c2039790k);
            }
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        akq.A06 = valueOf;
        if (valueOf.booleanValue() && (motionEvent = akq.A05) != null) {
            akq.A00 = motionEvent.getX();
            float y = akq.A05.getY();
            akq.A01 = y;
            float f = akq.A00;
            Map map = c2039790k.A0K;
            if (map.containsKey(gestureType)) {
                A00 = AbstractC166987dD.A0N(map.get(gestureType));
                if (C2039790k.A08(c2039790k, A00)) {
                    return;
                }
            } else {
                A00 = C2039790k.A00(c2039790k, gestureType);
                C2039790k.A05(c2039790k, new Gesture(A00, f, y, Gesture.GestureState.BEGAN, true, abk.A00, abk.A01));
            }
            C2039790k.A05(c2039790k, new Gesture(A00, f, y, Gesture.GestureState.CHANGED, true, abk.A00, abk.A01));
        }
    }
}
