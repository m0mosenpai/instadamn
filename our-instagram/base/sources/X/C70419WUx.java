package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WUx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70419WUx implements InterfaceGestureDetectorOnGestureListenerC149756oS {
    public float A00;
    public float A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final GestureDetector A05;
    public final List A06;
    public final List A07;
    public final int A08;

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A02 = false;
        this.A04 = false;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14360o3.A0B(motionEvent2, 1);
        int i = 0;
        if (motionEvent != null) {
            float rawY = motionEvent2.getRawY() - motionEvent.getRawY();
            if (this.A04) {
                this.A00 = rawY;
                Iterator it = this.A06.iterator();
                while (it.hasNext()) {
                    ((XDJ) it.next()).DBu(this, rawY);
                }
                return true;
            }
            if (this.A02) {
                if (!this.A03) {
                    float f3 = this.A08;
                    float abs = Math.abs(rawY);
                    if (f3 < abs && rawY > 0.0f) {
                        i = 2;
                    } else if (f3 < abs && rawY < 0.0f) {
                        i = 1;
                    }
                    for (XDJ xdj : this.A07) {
                        if (xdj.DC8(this, rawY, i)) {
                            this.A04 = true;
                            this.A06.add(xdj);
                        }
                    }
                }
                return this.A04;
            }
        }
        this.A02 = true;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A01 = f2;
        return this.A04;
    }

    public C70419WUx(Context context) {
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.A05 = gestureDetector;
        this.A07 = new ArrayList();
        this.A06 = new ArrayList();
        gestureDetector.setIsLongpressEnabled(false);
        this.A08 = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }
}
