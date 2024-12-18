package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.Dto, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnTouchListenerC31563Dto implements View.OnTouchListener {
    public final /* synthetic */ C72q A00;
    public final /* synthetic */ User A01;

    public ViewOnTouchListenerC31563Dto(C72q c72q, User user) {
        this.A00 = c72q;
        this.A01 = user;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C72q c72q = this.A00;
        EnumC31556Dtg enumC31556Dtg = EnumC31556Dtg.A04;
        C14360o3.A0A(motionEvent);
        return c72q.A07(motionEvent, enumC31556Dtg);
    }
}
