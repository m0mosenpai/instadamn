package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes12.dex */
public final class Y8L implements View.OnTouchListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Y8L(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        UserSession userSession;
        int i = this.A00;
        boolean A1a = AbstractC167017dG.A1a(view, motionEvent);
        switch (i) {
            case 0:
                userSession = ((XVc) this.A02).A00;
                break;
            case 1:
                userSession = ((XVb) this.A02).A01;
                break;
            case 2:
                userSession = ((C99154cc) this.A02).A01;
                break;
            default:
                userSession = ((C107384sj) this.A02).A02;
                break;
        }
        if (AbstractC166997dE.A0c(C06090Tz.A06, userSession, 36321026594382920L).booleanValue() && view.getTouchDelegate() != null && view.getTouchDelegate().onTouchEvent(motionEvent)) {
            return A1a;
        }
        return ((InterfaceC81103jf) this.A01).DGb(motionEvent);
    }
}
