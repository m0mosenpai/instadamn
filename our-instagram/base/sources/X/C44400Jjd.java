package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.Jjd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44400Jjd extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C149216nV A00;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C44400Jjd(C149216nV c149216nV) {
        this.A00 = c149216nV;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A00.A00 = f;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C149216nV c149216nV = this.A00;
        if (c149216nV.A0G) {
            float f3 = c149216nV.A03;
            View view = c149216nV.A09;
            if (view != null) {
                float A07 = f3 + (f / AbstractC166987dD.A07(view));
                c149216nV.A03 = A07;
                C55982hj c55982hj = c149216nV.A0B;
                if (c55982hj != null) {
                    c55982hj.A08(A07, true);
                    return false;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        if (!c149216nV.A0H) {
            return false;
        }
        float f4 = c149216nV.A04;
        View view2 = c149216nV.A09;
        if (view2 != null) {
            c149216nV.A04 = f4 + (f2 / AbstractC166987dD.A08(view2));
            return false;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
