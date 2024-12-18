package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* loaded from: classes8.dex */
public final class LQS implements View.OnTouchListener {
    public final GestureDetector A00;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        this.A00.onTouchEvent(motionEvent);
        return false;
    }

    public LQS(Context context, BottomSheetFragment bottomSheetFragment, C3DN c3dn) {
        this.A00 = new GestureDetector(context, new JYK(3, c3dn, bottomSheetFragment));
    }
}
