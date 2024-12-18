package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.IkL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnTouchListenerC42052IkL implements View.OnTouchListener {
    public final /* synthetic */ MUG A00;
    public final /* synthetic */ InterfaceC75453aC A01;

    public ViewOnTouchListenerC42052IkL(MUG mug, InterfaceC75453aC interfaceC75453aC) {
        this.A00 = mug;
        this.A01 = interfaceC75453aC;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View.OnTouchListener DuF;
        C14360o3.A0B(motionEvent, 1);
        C38321qM A00 = ((C76733cL) this.A00.A03).A00();
        User user = (User) AbstractC001800i.A0J(A00.A3Z());
        if (AbstractC166987dD.A1b(A00.A3Z()) && user != null && motionEvent.getAction() == 0 && (DuF = this.A01.DuF(A00, user.getId(), "")) != null) {
            DuF.onTouch(view, motionEvent);
        }
        return false;
    }
}
