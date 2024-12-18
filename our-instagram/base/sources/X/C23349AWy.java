package X;

import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.PanGesture;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.PinchGesture;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.RawTouchGesture;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.RotationGesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchGesturesListener$HitTestCallback;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.AWy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23349AWy implements InterfaceC25202BDa, BE4 {
    public TouchGesturesListener$HitTestCallback A00;
    public final BlockingQueue A01 = new LinkedBlockingQueue();

    @Override // X.BE4
    public final void FB5(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        if (bundle.containsKey("commandType") && bundle.getInt("commandType") == 3 && bundle.containsKey("consumed") && bundle.containsKey("gestureId")) {
            long j = bundle.getLong("gestureId");
            boolean z = bundle.getBoolean("consumed");
            TouchGesturesListener$HitTestCallback touchGesturesListener$HitTestCallback = this.A00;
            if (touchGesturesListener$HitTestCallback != null) {
                touchGesturesListener$HitTestCallback.hitTestResult(j, z);
            }
        }
    }

    @Override // X.InterfaceC25202BDa
    public final void addGestureEvent(Gesture gesture) {
        C14360o3.A0B(gesture, 0);
        this.A01.add(A00(gesture, 1));
    }

    @Override // X.InterfaceC25202BDa
    public final void enqueueForHitTest(Gesture gesture, TouchGesturesListener$HitTestCallback touchGesturesListener$HitTestCallback) {
        C14360o3.A0B(touchGesturesListener$HitTestCallback, 1);
        if (this.A00 == null) {
            this.A00 = touchGesturesListener$HitTestCallback;
        }
        this.A01.add(A00(gesture, 2));
    }

    @Override // X.BE4
    public final Bundle BHd() {
        return AbstractC167027dH.A08(91);
    }

    @Override // X.BE4
    public final void CO6(AnonymousClass904 anonymousClass904) {
        C2039490h c2039490h;
        AbstractC2039690j abstractC2039690j;
        List list;
        if (anonymousClass904 != null) {
            C203848zt c203848zt = C2039490h.A01;
            if (AnonymousClass904.A01(anonymousClass904, c203848zt) && (c2039490h = (C2039490h) anonymousClass904.A02(c203848zt)) != null && (abstractC2039690j = c2039490h.A00) != null) {
                if (abstractC2039690j instanceof C2039590i) {
                    list = ((C2039590i) abstractC2039690j).A03;
                } else {
                    list = ((C9YK) abstractC2039690j).A01;
                }
                list.add(this);
            }
        }
    }

    @Override // X.InterfaceC25202BDa
    public final void addTouchEvent(TouchEvent touchEvent) {
        Bundle A00 = AbstractC61636Rr0.A00(AbstractC167007dF.A0o("serviceType", 91), AbstractC167027dH.A0Y(C05F.A00), AbstractC166987dD.A1L("touchEventX", Float.valueOf(touchEvent.x)), AbstractC166987dD.A1L("touchEventY", Float.valueOf(touchEvent.y)), AbstractC166987dD.A1L("touchEventType", Integer.valueOf(touchEvent.eventType.ordinal())));
        A00.putLong("touchEventTime", touchEvent.time);
        A00.putLong("touchEventId", touchEvent.id);
        this.A01.add(A00);
    }

    @Override // X.InterfaceC25202BDa
    public final void dispatchUnconsumedGestures() {
        this.A01.add(AbstractC167017dG.A0T("commandType", C05F.A0Y, AbstractC167007dF.A0o("serviceType", 91)));
    }

    public static final Bundle A00(Gesture gesture, int i) {
        float f;
        String str;
        Gesture.GestureType gestureType = gesture.getGestureType();
        C14360o3.A07(gestureType);
        C09530e4 A0o = AbstractC167007dF.A0o("serviceType", 91);
        C09530e4 A0Y = AbstractC167027dH.A0Y(Integer.valueOf(i));
        C09530e4 A1L = AbstractC166987dD.A1L("gestureX", Float.valueOf(gesture.x));
        C09530e4 A1L2 = AbstractC166987dD.A1L("gestureY", Float.valueOf(gesture.y));
        C09530e4 A1L3 = AbstractC166987dD.A1L("gestureState", Integer.valueOf(gesture.gestureState.ordinal()));
        int ordinal = gestureType.ordinal();
        Bundle A00 = AbstractC61636Rr0.A00(A0o, A0Y, A1L, A1L2, A1L3, AbstractC166987dD.A1L("gestureType", Integer.valueOf(ordinal)));
        A00.putLong("gestureId", gesture.id);
        switch (ordinal) {
            case 0:
            case 4:
                return A00;
            case 1:
                PanGesture panGesture = (PanGesture) gesture;
                A00.putFloat("panGestureTranslateX", panGesture.translateX);
                f = panGesture.translateY;
                str = "panGestureTranslateY";
                break;
            case 2:
                f = ((PinchGesture) gesture).scale;
                str = "pinchGestureScale";
                break;
            case 3:
                f = ((RotationGesture) gesture).angle;
                str = "rotationGestureAngle";
                break;
            case 5:
                RawTouchGesture rawTouchGesture = (RawTouchGesture) gesture;
                A00.putFloat("rawTouchGestureTranslateX", rawTouchGesture.translateX);
                f = rawTouchGesture.translateY;
                str = "rawTouchGestureTranslateY";
                break;
            default:
                throw B4Z.A00();
        }
        A00.putFloat(str, f);
        return A00;
    }

    @Override // X.BE4
    public final List Epn() {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A01.drainTo(A1E);
        if (A1E.isEmpty()) {
            A1E.add(AbstractC167027dH.A08(91));
        }
        return A1E;
    }
}
