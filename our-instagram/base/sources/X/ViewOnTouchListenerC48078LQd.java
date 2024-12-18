package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.LQd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnTouchListenerC48078LQd implements View.OnTouchListener {
    public boolean A00;
    public Rect A01 = AbstractC166987dD.A0U();
    public final GestureDetector.OnGestureListener A02;
    public final InterfaceC09390do A03;
    public final InterfaceC16660sJ A04;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean A1R = AbstractC167007dF.A1R(0, view, motionEvent);
        if (motionEvent.getAction() == 0) {
            Rect rect = this.A01;
            view.getHitRect(rect);
            rect.offsetTo(0, 0);
        }
        if (this.A00) {
            if (motionEvent.getAction() == A1R) {
                this.A00 = false;
                this.A04.invoke(motionEvent);
                return A1R;
            }
            if (motionEvent.getAction() == 2 && !AbstractC43594JPz.A1V(this.A01, motionEvent)) {
                this.A00 = false;
                return false;
            }
        }
        return ((GestureDetector) this.A03.getValue()).onTouchEvent(motionEvent);
    }

    public ViewOnTouchListenerC48078LQd(Context context, View view, View view2, UserSession userSession, C141596ac c141596ac, InterfaceC16660sJ interfaceC16660sJ) {
        this.A04 = interfaceC16660sJ;
        this.A03 = AbstractC09440dt.A01(new C57536PgA(16, context, this));
        this.A02 = new C44405Jji(2, view, view2, userSession, c141596ac, this);
    }
}
