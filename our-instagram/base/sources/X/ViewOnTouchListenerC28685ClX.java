package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.ClX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnTouchListenerC28685ClX implements View.OnTouchListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ C41551w4 A02;
    public final /* synthetic */ InterfaceC145486h7 A03;

    public ViewOnTouchListenerC28685ClX(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC145486h7 interfaceC145486h7) {
        this.A03 = interfaceC145486h7;
        this.A02 = c41551w4;
        this.A01 = c41181vS;
        this.A00 = userSession;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.A03.DTq(this.A01, this.A02, motionEvent.getRawX(), motionEvent.getRawY());
        }
        return C18U.A06(C06090Tz.A06, this.A00, 36320850501313478L);
    }
}
