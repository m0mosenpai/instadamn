package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.ui.widget.mediapicker.Folder;

/* loaded from: classes8.dex */
public final class LQV implements View.OnTouchListener {
    public final MN5 A00;
    public final Folder A01;

    public LQV(MN5 mn5, Folder folder) {
        C14360o3.A0B(folder, 2);
        this.A00 = mn5;
        this.A01 = folder;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean A1R = AbstractC167007dF.A1R(0, view, motionEvent);
        MN5 mn5 = this.A00;
        Folder folder = this.A01;
        int actionMasked = motionEvent.getActionMasked();
        InterfaceC189618ag interfaceC189618ag = ((ViewOnClickListenerC43832JZv) mn5).A04;
        if (interfaceC189618ag == null || folder.A02 != -5) {
            return false;
        }
        if (actionMasked == A1R) {
            interfaceC189618ag.DYa(folder);
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 != 0) {
            if (actionMasked2 != A1R && actionMasked2 != 3) {
                return A1R;
            }
            view.setPressed(false);
            return A1R;
        }
        view.setPressed(A1R);
        return A1R;
    }
}
