package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.PanGesture;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.RawTouchGesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AKQ {
    public static final int A0K = ViewConfiguration.getLongPressTimeout();
    public static final int A0L = ViewConfiguration.getTapTimeout();
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public MotionEvent A05;
    public Boolean A09;
    public Float A0A;
    public Float A0B;
    public Float A0C;
    public Float A0D;
    public boolean A0E;
    public final GestureDetector A0G;
    public final ABK A0H;
    public final Map A0J;
    public final Handler A0F = AbstractC167007dF.A0J();
    public Boolean A06 = false;
    public Boolean A07 = false;
    public Boolean A08 = false;
    public final Runnable A0I = new RunnableC24258ApP(this);

    public static void A00(AKQ akq, float f, float f2, float f3, float f4, long j) {
        ABK abk = akq.A0H;
        TouchEvent touchEvent = new TouchEvent(f3, f4, j, TouchEvent.TouchEventType.UP, System.currentTimeMillis(), true, abk.A00, abk.A01);
        C2039790k c2039790k = abk.A02;
        C2039790k.A06(c2039790k, touchEvent);
        Map map = c2039790k.A0J;
        Number number = (Number) map.remove(Long.valueOf(j));
        if (number != null) {
            if (map.isEmpty() && C2039790k.A08(c2039790k, number.longValue())) {
                c2039790k.A0P.add(number);
            } else {
                C2039790k.A05(c2039790k, new RawTouchGesture(number.longValue(), f3 - f, f4 - f2, f3, f4, Gesture.GestureState.ENDED, true, abk.A00, abk.A01));
            }
        }
    }

    public final void A01(float f, float f2, float f3, float f4) {
        long A00;
        Boolean bool = this.A09;
        if (bool != null && bool.booleanValue()) {
            float f5 = f - this.A02;
            this.A0A = Float.valueOf(f5);
            float f6 = f2 - this.A03;
            this.A0B = Float.valueOf(f6);
            Float f7 = this.A0C;
            if (f7 == null) {
                f7 = Float.valueOf(f3);
                this.A0C = f7;
                this.A0D = Float.valueOf(f4);
            }
            ABK abk = this.A0H;
            float floatValue = f7.floatValue();
            float floatValue2 = this.A0D.floatValue();
            C2039790k c2039790k = abk.A02;
            Map map = c2039790k.A0K;
            Gesture.GestureType gestureType = Gesture.GestureType.PAN;
            if (map.containsKey(gestureType)) {
                A00 = AbstractC166987dD.A0N(map.get(gestureType));
                if (C2039790k.A08(c2039790k, A00)) {
                    return;
                }
            } else {
                A00 = C2039790k.A00(c2039790k, gestureType);
                C2039790k.A05(c2039790k, new PanGesture(A00, f5 - floatValue, f6 - floatValue2, f5, f6, Gesture.GestureState.BEGAN, true, abk.A00, abk.A01));
            }
            C2039790k.A05(c2039790k, new PanGesture(A00, f5 - floatValue, f6 - floatValue2, f5, f6, Gesture.GestureState.CHANGED, true, abk.A00, abk.A01));
        }
    }

    public final void A02(long j, float f, float f2) {
        ABK abk = this.A0H;
        TouchEvent touchEvent = new TouchEvent(f, f2, j, TouchEvent.TouchEventType.DOWN, System.currentTimeMillis(), true, abk.A00, abk.A01);
        C2039790k c2039790k = abk.A02;
        C2039790k.A06(c2039790k, touchEvent);
        Map map = c2039790k.A0J;
        Long valueOf = Long.valueOf(j);
        if (!map.containsKey(valueOf)) {
            long j2 = c2039790k.A03;
            c2039790k.A03 = 1 + j2;
            Long valueOf2 = Long.valueOf(j2);
            map.put(valueOf, valueOf2);
            c2039790k.A0L.put(valueOf2, EnumC222669s7.HIT_TESTING);
            C2039790k.A05(c2039790k, new RawTouchGesture(j2, 0.0f, 0.0f, f, f2, Gesture.GestureState.BEGAN, true, abk.A00, abk.A01));
        }
    }

    public AKQ(Context context, Handler handler, ABK abk) {
        GestureDetector gestureDetector = new GestureDetector(context, new APt(this), handler);
        this.A0G = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.A0H = abk;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.A04 = scaledTouchSlop * scaledTouchSlop;
        this.A0J = AbstractC166987dD.A1G();
    }
}
