package X;

import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public final class AT7 implements View.OnTouchListener {
    public final java.util.Set A00 = new LinkedHashSet();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Iterator it = this.A00.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (((View.OnTouchListener) it.next()).onTouch(view, motionEvent)) {
                z = true;
            }
        }
        return z;
    }
}
