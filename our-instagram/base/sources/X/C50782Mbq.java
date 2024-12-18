package X;

import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Mbq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50782Mbq extends TouchDelegate {
    public final Map A00;

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        Collection values = this.A00.values();
        if (values == null || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                if (((TouchDelegate) it.next()).onTouchEvent(motionEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C50782Mbq(View view) {
        super(AbstractC166987dD.A0U(), view);
        this.A00 = AbstractC166987dD.A1I();
    }
}
