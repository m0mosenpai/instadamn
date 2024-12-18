package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.ClW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnTouchListenerC28684ClW implements View.OnTouchListener {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ InterfaceC60442pS A01;
    public final /* synthetic */ InterfaceC75453aC A02;

    public ViewOnTouchListenerC28684ClW(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, InterfaceC75453aC interfaceC75453aC) {
        this.A00 = c38321qM;
        this.A02 = interfaceC75453aC;
        this.A01 = interfaceC60442pS;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View.OnTouchListener DuM;
        C38321qM c38321qM = this.A00;
        User user = (User) AbstractC001800i.A0J(c38321qM.A3Z());
        C14360o3.A0A(motionEvent);
        if (!AbstractC167007dF.A1N(motionEvent.getAction()) || user == null || (DuM = this.A02.DuM(c38321qM, user.getId(), this.A01.getModuleName())) == null) {
            return false;
        }
        return DuM.onTouch(view, motionEvent);
    }
}
