package X;

import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Oka, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnTouchListenerC55481Oka implements View.OnTouchListener {
    public final List A00;
    public final InterfaceC16620sF A01;

    public ViewOnTouchListenerC55481Oka() {
        C57760Pjn c57760Pjn = C57760Pjn.A00;
        C14360o3.A0B(c57760Pjn, 1);
        this.A01 = c57760Pjn;
        this.A00 = AbstractC166987dD.A1E();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        AbstractC167017dG.A1N(view, motionEvent);
        boolean A1a = AbstractC166987dD.A1a(this.A01.invoke(view, motionEvent));
        Iterator it = this.A00.iterator();
        loop0: while (true) {
            z = false;
            while (it.hasNext()) {
                View A09 = AbstractC43592JPx.A09(it);
                if (z || A09.dispatchTouchEvent(motionEvent)) {
                    z = true;
                }
            }
        }
        if (!A1a && !z) {
            return false;
        }
        return true;
    }
}
