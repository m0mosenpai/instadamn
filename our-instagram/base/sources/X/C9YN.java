package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: X.9YN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9YN extends C5SZ {
    public String A00;
    public final GestureDetector A01;
    public final Context A02;
    public final Handler A03;
    public final C22959AAd A04;
    public final GestureDetectorOnGestureListenerC72583Nf A05;
    public final InterfaceC08830cm A06;

    public C9YN(Context context, Handler handler, C22959AAd c22959AAd, GestureDetectorOnGestureListenerC72583Nf gestureDetectorOnGestureListenerC72583Nf, InterfaceC08830cm interfaceC08830cm) {
        C14360o3.A0B(interfaceC08830cm, 4);
        this.A02 = context;
        this.A03 = handler;
        this.A04 = c22959AAd;
        this.A06 = interfaceC08830cm;
        this.A05 = gestureDetectorOnGestureListenerC72583Nf;
        this.A01 = new GestureDetector(context, this, handler);
        Object obj = interfaceC08830cm.get();
        C14360o3.A07(obj);
        this.A00 = (String) obj;
    }

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        EnumC129155sc enumC129155sc;
        long j;
        C14360o3.A0B(motionEvent2, 1);
        String str = this.A00;
        C22959AAd c22959AAd = this.A04;
        C14360o3.A0B(c22959AAd, 3);
        if (motionEvent != null && (c22959AAd.A0F || (str != null && c22959AAd.A0E.contains(str)))) {
            z = true;
        } else {
            z = false;
        }
        GestureDetectorOnGestureListenerC72583Nf gestureDetectorOnGestureListenerC72583Nf = this.A05;
        if (Math.abs(f) > Math.abs(f2)) {
            if (f > 0.0f) {
                enumC129155sc = EnumC129155sc.TOUCH_MOVED_RIGHT;
            } else {
                enumC129155sc = EnumC129155sc.TOUCH_MOVED_LEFT;
            }
        } else if (f2 > 0.0f) {
            enumC129155sc = EnumC129155sc.TOUCH_MOVED_DOWN;
        } else {
            enumC129155sc = EnumC129155sc.TOUCH_MOVED_UP;
        }
        MotionEvent motionEvent3 = motionEvent2;
        if (c22959AAd.A0G) {
            motionEvent3 = motionEvent;
        }
        if (motionEvent != null) {
            j = motionEvent2.getEventTime() - motionEvent.getDownTime();
        } else {
            j = 0;
        }
        boolean A01 = gestureDetectorOnGestureListenerC72583Nf.A01(motionEvent3, enumC129155sc, j, z);
        if (!c22959AAd.A07) {
            return false;
        }
        return A01;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        this.A05.A01(motionEvent, EnumC129155sc.LONG_TOUCHED, ViewConfiguration.getLongPressTimeout(), true);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return this.A05.A01(motionEvent, EnumC129155sc.TOUCH_UP, motionEvent.getEventTime() - motionEvent.getDownTime(), true);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.A00 = (String) this.A06.get();
        return false;
    }
}
