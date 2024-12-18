package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.Je2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnTouchListenerC44077Je2 implements View.OnTouchListener {
    public int A00 = -1;
    public final int A01;
    public final InterfaceC16820sZ A02;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        boolean A1R = AbstractC167007dF.A1R(0, view, motionEvent);
        TextView textView = (TextView) this.A02.invoke();
        if (this.A00 == -1) {
            this.A00 = textView.getCurrentTextColor();
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != A1R && action != 3) {
                return false;
            }
            i = this.A00;
        } else {
            i = this.A01;
        }
        textView.setTextColor(i);
        return false;
    }

    public ViewOnTouchListenerC44077Je2(InterfaceC16820sZ interfaceC16820sZ, int i) {
        this.A02 = interfaceC16820sZ;
        this.A01 = i;
    }
}
