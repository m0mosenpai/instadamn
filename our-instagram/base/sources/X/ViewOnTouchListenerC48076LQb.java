package X;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.LQb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnTouchListenerC48076LQb implements View.OnTouchListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public ViewOnTouchListenerC48076LQb(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Drawable drawable;
        if (this.A00 != 0) {
            TextView textView = (TextView) this.A02;
            Object tag = textView.getTag();
            if (!(tag instanceof Boolean)) {
                tag = null;
            }
            if (AbstractC166997dE.A1Z(tag, true)) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1 && action != 3) {
                        return false;
                    }
                    IMM imm = (IMM) this.A03;
                    textView.setTextColor(imm.A01);
                    if (this.A01 + 1 == imm.A07.size()) {
                        return false;
                    }
                    drawable = imm.A04;
                } else {
                    IMM imm2 = (IMM) this.A03;
                    textView.setTextColor(imm2.A02);
                    if (this.A01 + 1 == imm2.A07.size()) {
                        return false;
                    }
                    drawable = imm2.A05;
                }
                textView.setBackground(drawable);
                return false;
            }
            return false;
        }
        C14360o3.A0B(motionEvent, 1);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 3) {
                return false;
            }
            ((LKK) this.A03).A0I.Du5((View) this.A02);
            return false;
        }
        LKK lkk = (LKK) this.A03;
        lkk.A0I.DuH(((C47660L2t) lkk.A0K.get(this.A01)).A00, (View) this.A02);
        return false;
    }
}
