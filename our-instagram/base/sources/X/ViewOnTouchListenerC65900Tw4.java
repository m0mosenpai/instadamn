package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.Tw4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnTouchListenerC65900Tw4 implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ C3DP A02;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0;
        boolean A1R = AbstractC167007dF.A1R(0, view, motionEvent);
        C3DP c3dp = this.A02;
        if (c3dp.A0D == null) {
            return false;
        }
        if (c3dp.A0P && c3dp.A0O && !c3dp.A0M) {
            this.A00.onTouchEvent(motionEvent);
        }
        if (!C3DP.A07(motionEvent, this.A01, c3dp) || (viewOnTouchListenerC65896Tw0 = c3dp.A0D) == null || viewOnTouchListenerC65896Tw0.onTouch(view, motionEvent) != A1R) {
            return false;
        }
        return true;
    }

    public ViewOnTouchListenerC65900Tw4(GestureDetector gestureDetector, Fragment fragment, C3DP c3dp) {
        this.A02 = c3dp;
        this.A00 = gestureDetector;
        this.A01 = fragment;
    }
}
