package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.XLv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ViewOnTouchListenerC72054XLv implements View.OnTouchListener {
    public final InterfaceC81103jf A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C75113Zb A02;

    public ViewOnTouchListenerC72054XLv(UserSession userSession, C79723hN c79723hN, C81303k0 c81303k0, C75113Zb c75113Zb, int i) {
        this.A01 = userSession;
        this.A02 = c75113Zb;
        this.A00 = (InterfaceC81103jf) c79723hN.A0A.A0T.invoke(Integer.valueOf(i), c81303k0);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean A1a = AbstractC167017dG.A1a(view, motionEvent);
        if (AbstractC166997dE.A0c(C06090Tz.A06, this.A01, 36321026594382920L).booleanValue() && view.getTouchDelegate() != null && view.getTouchDelegate().onTouchEvent(motionEvent)) {
            return A1a;
        }
        if (this.A02.Ceb()) {
            return false;
        }
        return this.A00.DGb(motionEvent);
    }
}
