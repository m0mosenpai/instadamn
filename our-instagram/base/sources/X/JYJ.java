package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes8.dex */
public final class JYJ implements View.OnTouchListener {
    public final GestureDetector A00;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        return this.A00.onTouchEvent(motionEvent);
    }

    public JYJ(EnumC152696tw enumC152696tw, C106144qU c106144qU) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        this.A00 = new GestureDetector(c106144qU.A08.getContext(), new JYK(2, enumC152696tw, c106144qU));
    }
}
