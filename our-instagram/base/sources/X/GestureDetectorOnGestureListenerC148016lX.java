package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.6lX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class GestureDetectorOnGestureListenerC148016lX implements InterfaceC149626oF, GestureDetector.OnGestureListener, InterfaceC148026lY {
    public boolean A00;
    public float A01;
    public float A02;
    public boolean A03;
    public boolean A04;
    public final GestureDetector A05;
    public final C55982hj A06;
    public final C55982hj A07;
    public final C55952hg A08;
    public final InterfaceC1119253e A09;

    private void A00() {
        this.A09.DBv(this, (float) this.A06.A09.A00, (float) this.A07.A09.A00, (float) Math.sqrt((r4 * r4) + (r5 * r5)), this.A00);
    }

    public final void A02(C55942hf c55942hf, float f, float f2, float f3, float f4) {
        C55982hj c55982hj = this.A06;
        c55982hj.A07(f3);
        c55982hj.A09(c55942hf);
        c55982hj.A06 = true;
        c55982hj.A06(f);
        C55982hj c55982hj2 = this.A07;
        c55982hj2.A07(f4);
        c55982hj2.A09(c55942hf);
        c55982hj2.A06 = true;
        c55982hj2.A06(f2);
    }

    @Override // X.InterfaceC148026lY
    public final void CzD(C55952hg c55952hg) {
    }

    @Override // X.InterfaceC149626oF
    public boolean Du7(MotionEvent motionEvent) {
        this.A03 = true;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
        this.A05.onTouchEvent(obtain);
        obtain.recycle();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        boolean z = this.A00;
        this.A00 = false;
        float f = (float) this.A06.A09.A00;
        float f2 = (float) this.A07.A09.A00;
        if (!this.A04 && z) {
            this.A09.DC2(this, f, f2, (float) Math.sqrt((f * f) + (f2 * f2)), this.A01, this.A02);
        }
        this.A09.Dwn(this);
        return true;
    }

    @Override // X.InterfaceC149626oF
    public final void destroy() {
        this.A04 = true;
        this.A06.A00();
        this.A07.A00();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.A01 = 0.0f;
        this.A02 = 0.0f;
        this.A03 = false;
        this.A00 = false;
        return this.A09.DBd(this, motionEvent.getRawX(), motionEvent.getRawY());
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z = this.A00;
        if (z) {
            C55982hj c55982hj = this.A06;
            c55982hj.A05(c55982hj.A09.A00 - f);
            C55982hj c55982hj2 = this.A07;
            c55982hj2.A05(c55982hj2.A09.A00 - f2);
            return true;
        }
        if (this.A03) {
            if (!this.A04 && motionEvent != null && motionEvent2 != null) {
                float rawX = motionEvent.getRawX() - motionEvent2.getRawX();
                float rawY = motionEvent.getRawY() - motionEvent2.getRawY();
                boolean z2 = false;
                if (motionEvent2.getPointerCount() > 1) {
                    z2 = true;
                }
                float sqrt = (float) Math.sqrt((rawX * rawX) + (rawY * rawY));
                boolean DC9 = this.A09.DC9(this, rawX, rawY, sqrt, sqrt / ((float) (motionEvent2.getEventTime() - motionEvent.getEventTime())), z2);
                this.A00 = DC9;
                return DC9;
            }
            return z;
        }
        this.A03 = true;
        return A04();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final void A01(float f, float f2) {
        this.A06.A05(f);
        this.A07.A05(f2);
        A00();
    }

    public boolean A03() {
        return this.A00;
    }

    public final boolean A04() {
        C55982hj c55982hj = this.A06;
        if (c55982hj.A0C() && c55982hj.A0E(0.0d)) {
            C55982hj c55982hj2 = this.A07;
            if (c55982hj2.A0C() && c55982hj2.A0E(0.0d)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC148026lY
    public final void Cw4(C55952hg c55952hg) {
        if (!this.A04) {
            A00();
        }
    }

    @Override // X.InterfaceC149626oF
    public final void EJW(float f, float f2) {
        this.A06.A05(f);
        this.A07.A05(f2);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A01 = f;
        this.A02 = f2;
        if (!this.A00 && !A04()) {
            return false;
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (!this.A04) {
            return this.A09.Dmo(this, motionEvent.getX(), motionEvent.getY());
        }
        return false;
    }

    public GestureDetectorOnGestureListenerC148016lX(Context context, InterfaceC1119253e interfaceC1119253e) {
        this.A09 = interfaceC1119253e;
        C55952hg A00 = AbstractC13560mi.A00();
        this.A08 = A00;
        A00.A04.add(this);
        this.A06 = A00.A02();
        this.A07 = A00.A02();
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.A05 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    @Override // X.InterfaceC149626oF
    public boolean DMc(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
        boolean onTouchEvent = this.A05.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent;
    }
}
