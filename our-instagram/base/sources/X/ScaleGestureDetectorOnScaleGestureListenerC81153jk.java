package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.3jk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class ScaleGestureDetectorOnScaleGestureListenerC81153jk implements ScaleGestureDetector.OnScaleGestureListener {
    public final ScaleGestureDetector A00;
    public final java.util.Set A01;

    public ScaleGestureDetectorOnScaleGestureListenerC81153jk(Context context) {
        C14360o3.A0B(context, 1);
        this.A01 = new HashSet();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this);
        this.A00 = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
    }

    public boolean A01(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return this.A00.onTouchEvent(motionEvent);
    }

    public float A00() {
        return this.A00.getScaleFactor();
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        Iterator it = this.A01.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (((InterfaceC676933j) it.next()).DiJ(this) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        Iterator it = this.A01.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (((InterfaceC676933j) it.next()).DiK(this) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC676933j) it.next()).DiP(this);
        }
    }
}
