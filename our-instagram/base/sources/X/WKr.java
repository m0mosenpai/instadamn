package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes11.dex */
public final class WKr implements GestureDetector.OnGestureListener {
    public final /* synthetic */ C69731VuQ A00;

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Integer num;
        boolean z;
        boolean z2;
        if (f > f2) {
            if (f > 0.0f) {
                num = C05F.A0N;
            } else {
                num = C05F.A0C;
            }
        } else if (f2 > 0.0f) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        C69731VuQ c69731VuQ = this.A00;
        int i = c69731VuQ.A05;
        if ((AbstractC167007dF.A1P(i & 4, 4) && num == C05F.A0C) || ((i & 8) == 8 && num == C05F.A0N)) {
            z = true;
        } else {
            z = false;
        }
        if (((i & 2) == 2 && num == C05F.A01) || ((i & 1) == 1 && num == C05F.A00)) {
            z2 = true;
        } else {
            z2 = false;
        }
        X7O x7o = c69731VuQ.A0C;
        if (x7o == null || (!z && !z2)) {
            return false;
        }
        motionEvent2.getX();
        motionEvent2.getY();
        Integer num2 = C05F.A00;
        AbstractC66357UBy abstractC66357UBy = (AbstractC66357UBy) x7o;
        AbstractC65703TsZ.A1J(abstractC66357UBy, false);
        XDS xds = abstractC66357UBy.A04;
        if (xds != null) {
            xds.DC5();
        }
        c69731VuQ.A0F = num2;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public WKr(C69731VuQ c69731VuQ) {
        this.A00 = c69731VuQ;
    }
}
