package X;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.JuL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44907JuL extends C5SZ {
    public final int A00;
    public final Object A01;

    public C44907JuL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.A00) {
            case 1:
                C14360o3.A0B(motionEvent, 0);
                UHC uhc = (UHC) this.A01;
                List list = uhc.A0L;
                ArrayList<UPV> A1E = AbstractC166987dD.A1E();
                for (Object obj : list) {
                    if (((UPV) obj).A0A.A01 != null) {
                        A1E.add(obj);
                    }
                }
                for (UPV upv : A1E) {
                    if (upv.A09.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        RectF rectF = upv.A08;
                        float x = motionEvent.getX();
                        if (rectF != null && x <= rectF.right + (uhc.A07 * 3.0f)) {
                            UHC.A00(upv.A08, uhc);
                            return false;
                        }
                    }
                }
                return false;
            case 2:
                ValueAnimator valueAnimator = ((C45696KKz) this.A01).A08;
                if (valueAnimator.isRunning()) {
                    valueAnimator.pause();
                    return true;
                }
                return true;
            case 3:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C49631LwO c49631LwO;
        switch (this.A00) {
            case 0:
                C49675Lx6 c49675Lx6 = (C49675Lx6) this.A01;
                c49675Lx6.A04 = false;
                C49675Lx6.A03(c49675Lx6);
                C47427KxI c47427KxI = c49675Lx6.A0C;
                if (c49675Lx6.A01 != -1) {
                    c47427KxI.A00.A0C.A00();
                    return true;
                }
                return true;
            case 1:
                UHC.A00(null, (UHC) this.A01);
                return false;
            case 2:
                C14360o3.A0B(motionEvent2, 1);
                c49631LwO = ((C45696KKz) this.A01).A0A;
                break;
            default:
                C14360o3.A0B(motionEvent2, 1);
                c49631LwO = ((L0L) this.A01).A01;
                break;
        }
        if (motionEvent != null) {
            return c49631LwO.A00.A01(motionEvent, motionEvent2, c49631LwO, f, f2, false);
        }
        return false;
    }

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (1 - this.A00 != 0) {
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
        UHC.A00(null, (UHC) this.A01);
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.A00) {
            case 1:
                UHC.A00(null, (UHC) this.A01);
                return true;
            case 2:
                C45696KKz.A00((C45696KKz) this.A01);
                return true;
            case 3:
                return false;
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
