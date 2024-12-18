package X;

import android.view.MotionEvent;

/* renamed from: X.MTj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50552MTj extends C5SZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C50552MTj(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (1 - this.A00 != 0) {
            return super.onDown(motionEvent);
        }
        return true;
    }

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.A00 != 0) {
            C14360o3.A0B(motionEvent2, 1);
            if (motionEvent != null) {
                return ((C50546MTb) this.A01).A01(motionEvent, motionEvent2, ((C138376Ot) this.A02).A0d, f, f2, false);
            }
            return false;
        }
        C14360o3.A0B(motionEvent2, 1);
        if (motionEvent != null) {
            ((C50546MTb) this.A02).A01(motionEvent, motionEvent2, (InterfaceC144626fi) this.A01, f, f2, false);
            return false;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (1 - this.A00 != 0) {
            return super.onSingleTapUp(motionEvent);
        }
        C14360o3.A0B(motionEvent, 0);
        ((C138376Ot) this.A02).A0d.DsB(motionEvent.getRawX(), motionEvent.getRawY());
        return true;
    }
}
