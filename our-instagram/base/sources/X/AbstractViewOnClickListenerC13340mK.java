package X;

import android.os.SystemClock;
import android.view.View;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.0mK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnClickListenerC13340mK implements View.OnClickListener {
    public final long A00;
    public final Map A01 = new WeakHashMap();

    public abstract void A00(View view);

    public AbstractViewOnClickListenerC13340mK(long j) {
        this.A00 = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1408268978);
        C14360o3.A0B(view, 0);
        Map map = this.A01;
        Number number = (Number) map.get(view);
        long uptimeMillis = SystemClock.uptimeMillis();
        map.put(view, Long.valueOf(uptimeMillis));
        if (number == null || Math.abs(uptimeMillis - number.longValue()) > this.A00) {
            A00(view);
        }
        C0f9.A0C(203492076, A05);
    }
}
