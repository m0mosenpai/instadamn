package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.IkK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnTouchListenerC42051IkK implements View.OnTouchListener {
    public final C42614ItX A00;
    public final /* synthetic */ UserSession A01;

    public ViewOnTouchListenerC42051IkK(UserSession userSession, C38658Gyz c38658Gyz, C81473kH c81473kH) {
        this.A01 = userSession;
        this.A00 = (C42614ItX) ((InterfaceC16660sJ) c38658Gyz.A05.A00).invoke(c81473kH);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean A1a = AbstractC167017dG.A1a(view, motionEvent);
        if (C18U.A06(C06090Tz.A06, this.A01, 36321026594382920L) && view.getTouchDelegate() != null && view.getTouchDelegate().onTouchEvent(motionEvent)) {
            return A1a;
        }
        return this.A00.DGb(motionEvent);
    }
}
