package X;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import java.util.Map;

/* renamed from: X.6Uz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC139956Uz extends GestureDetector.SimpleOnGestureListener implements ScaleGestureDetector.OnScaleGestureListener {
    public PointF A00;
    public View A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C6FG A05;
    public final C102884kP A06;
    public final C102884kP A07;
    public final Map A08 = new C005001p(2);

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        float x = motionEvent2.getX() - motionEvent.getX();
        float y = motionEvent2.getY() - motionEvent.getY();
        boolean z = false;
        if (Math.abs(y) > Math.abs(x)) {
            z = true;
        }
        if (z) {
            i = 42;
            if (y > 0.0f) {
                i = 38;
            }
        } else {
            i = 40;
            if (x > 0.0f) {
                i = 41;
            }
        }
        InterfaceC103384lE A01 = A01(i);
        if (A01 == null) {
            return false;
        }
        C102884kP c102884kP = this.A07;
        C6FX c6fx = new C6FX();
        c6fx.A03(this.A06, 0);
        C6FG c6fg = this.A05;
        c6fx.A03(c6fg, 1);
        C6FP.A03(c6fg, c102884kP, new C6FW(c6fx.A00), A01);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.A02 = true;
        InterfaceC103384lE A01 = A01(35);
        InterfaceC103384lE A012 = A01(61);
        if (A01 != null) {
            C102884kP c102884kP = this.A07;
            C6FX c6fx = new C6FX();
            c6fx.A01(this.A06);
            C6FG c6fg = this.A05;
            c6fx.A03(c6fg, 1);
            C6FP.A03(c6fg, c102884kP, new C6FW(c6fx.A00), A01);
        }
        if (this.A01 != null && A012 != null) {
            C102884kP c102884kP2 = this.A07;
            C6FX c6fx2 = new C6FX();
            c6fx2.A01(this.A06);
            C6FG c6fg2 = this.A05;
            c6fx2.A03(c6fg2, 1);
            c6fx2.A03(c102884kP2, 2);
            c6fx2.A03("detected", 3);
            c6fx2.A03(Float.valueOf(motionEvent.getX() - this.A01.getX()), 4);
            c6fx2.A03(Float.valueOf(motionEvent.getY() - this.A01.getY()), 5);
            C6FP.A03(c6fg2, c102884kP2, new C6FW(c6fx2.A00), A012);
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.A00 = null;
    }

    private boolean A00(MotionEvent motionEvent) {
        boolean z;
        if (this.A01 == null) {
            return false;
        }
        InterfaceC103384lE A01 = A01(43);
        InterfaceC103384lE A012 = A01(54);
        InterfaceC103384lE A013 = A01(62);
        if (A01 != null) {
            C102884kP c102884kP = this.A07;
            C6FX c6fx = new C6FX();
            c6fx.A03(this.A06, 0);
            C6FG c6fg = this.A05;
            c6fx.A03(c6fg, 1);
            C6FP.A03(c6fg, c102884kP, new C6FW(c6fx.A00), A01);
            z = true;
        } else {
            z = false;
        }
        if (A012 != null) {
            C102884kP c102884kP2 = this.A07;
            C6FX c6fx2 = new C6FX();
            c6fx2.A03(this.A06, 0);
            C6FG c6fg2 = this.A05;
            c6fx2.A03(c6fg2, 1);
            c6fx2.A03(Float.valueOf(motionEvent.getX() - this.A01.getX()), 2);
            c6fx2.A03(Float.valueOf(motionEvent.getY() - this.A01.getY()), 3);
            C6FP.A03(c6fg2, c102884kP2, new C6FW(c6fx2.A00), A012);
            z = true;
        }
        if (A013 != null) {
            C102884kP c102884kP3 = this.A07;
            C6FX c6fx3 = new C6FX();
            c6fx3.A03(this.A06, 0);
            C6FG c6fg3 = this.A05;
            c6fx3.A03(c6fg3, 1);
            c6fx3.A03(c102884kP3, 2);
            c6fx3.A03(Float.valueOf(motionEvent.getX() - this.A01.getX()), 3);
            c6fx3.A03(Float.valueOf(motionEvent.getY() - this.A01.getY()), 4);
            C6FP.A03(c6fg3, c102884kP3, new C6FW(c6fx3.A00), A013);
            return true;
        }
        return z;
    }

    public final InterfaceC103384lE A01(int i) {
        Map map = this.A08;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            InterfaceC103384lE A0B = this.A07.A0B(i);
            map.put(valueOf, A0B);
            return A0B;
        }
        return (InterfaceC103384lE) map.get(valueOf);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z;
        if (this.A01 == null) {
            return false;
        }
        InterfaceC103384lE A01 = A01(36);
        InterfaceC103384lE A012 = A01(45);
        InterfaceC103384lE A013 = A01(65);
        PointF A00 = AbstractC70063W0x.A00(new PointF(motionEvent.getX(), motionEvent.getY()), this.A01);
        if (A01 != null) {
            C102884kP c102884kP = this.A07;
            C6FX c6fx = new C6FX();
            c6fx.A03(this.A06, 0);
            C6FG c6fg = this.A05;
            c6fx.A03(c6fg, 1);
            C6FP.A03(c6fg, c102884kP, new C6FW(c6fx.A00), A01);
            z = true;
        } else {
            z = false;
        }
        if (A012 != null) {
            C102884kP c102884kP2 = this.A07;
            C6FX c6fx2 = new C6FX();
            c6fx2.A03(this.A06, 0);
            C6FG c6fg2 = this.A05;
            c6fx2.A03(c6fg2, 1);
            c6fx2.A03(Float.valueOf((A00.x * 100.0f) / this.A01.getWidth()), 2);
            c6fx2.A03(Float.valueOf((A00.y * 100.0f) / this.A01.getHeight()), 3);
            C6FP.A03(c6fg2, c102884kP2, new C6FW(c6fx2.A00), A012);
            z = true;
        }
        if (A013 != null) {
            C102884kP c102884kP3 = this.A07;
            C6FX c6fx3 = new C6FX();
            c6fx3.A03(this.A06, 0);
            C6FG c6fg3 = this.A05;
            c6fx3.A03(c6fg3, 1);
            c6fx3.A03(c102884kP3, 2);
            c6fx3.A03(Float.valueOf(A00.x), 3);
            c6fx3.A03(Float.valueOf(A00.y), 4);
            C6FP.A03(c6fg3, c102884kP3, new C6FW(c6fx3.A00), A013);
            return true;
        }
        return z;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (this.A01 == null) {
            return false;
        }
        InterfaceC103384lE A01 = A01(49);
        if (A01 != null) {
            PointF A00 = AbstractC70063W0x.A00(new PointF(motionEvent.getX(), motionEvent.getY()), this.A01);
            C102884kP c102884kP = this.A07;
            C6FX c6fx = new C6FX();
            c6fx.A03(this.A06, 0);
            C6FG c6fg = this.A05;
            c6fx.A03(c6fg, 1);
            c6fx.A03(Float.valueOf((A00.x * 100.0f) / this.A01.getWidth()), 2);
            c6fx.A03(Float.valueOf((A00.y * 100.0f) / this.A01.getHeight()), 3);
            C6FP.A03(c6fg, c102884kP, new C6FW(c6fx.A00), A01);
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        InterfaceC103384lE A01;
        if (this.A00 == null || this.A01 == null || (A01 = A01(44)) == null) {
            return false;
        }
        C102884kP c102884kP = this.A07;
        C6FX c6fx = new C6FX();
        c6fx.A03(this.A06, 0);
        C6FG c6fg = this.A05;
        c6fx.A03(c6fg, 1);
        c6fx.A03(Float.valueOf(scaleGestureDetector.getScaleFactor()), 2);
        c6fx.A03(Float.valueOf((this.A00.x * 100.0f) / this.A01.getWidth()), 3);
        c6fx.A03(Float.valueOf((this.A00.y * 100.0f) / this.A01.getHeight()), 4);
        C6FP.A03(c6fg, c102884kP, new C6FW(c6fx.A00), A01);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        InterfaceC103384lE A01;
        if (this.A01 != null && (A01 = A01(48)) != null) {
            C102884kP c102884kP = this.A07;
            C6FX c6fx = new C6FX();
            c6fx.A03(this.A06, 0);
            C6FG c6fg = this.A05;
            c6fx.A03(c6fg, 1);
            c6fx.A03(Float.valueOf((f * 100.0f) / this.A01.getWidth()), 2);
            c6fx.A03(Float.valueOf((f2 * 100.0f) / this.A01.getHeight()), 3);
            Object A00 = C131845xK.A00(C6FQ.A01(c6fg, A01, c102884kP.A0A), new C6FW(c6fx.A00), A01);
            if (!(A00 instanceof Boolean)) {
                AbstractC25241Le.A02("BloksFoaExtensionsGestureListener", "onScroll return value should return boolean (true if handled)");
            } else {
                boolean booleanValue = ((Boolean) A00).booleanValue();
                if (booleanValue) {
                    this.A04 = true;
                }
                this.A03 = true;
                return booleanValue;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if ((A01(36) != null || A01(45) != null || A01(65) != null) && A00(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (A01(36) == null && A01(45) == null && A01(65) == null && A00(motionEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.01p, java.util.Map] */
    public ScaleGestureDetectorOnScaleGestureListenerC139956Uz(C6FG c6fg, C102884kP c102884kP, C102884kP c102884kP2) {
        this.A05 = c6fg;
        this.A07 = c102884kP;
        this.A06 = c102884kP2;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        if (this.A01 != null) {
            this.A00 = AbstractC70063W0x.A00(new PointF(focusX, focusY), this.A01);
            return true;
        }
        return true;
    }
}
