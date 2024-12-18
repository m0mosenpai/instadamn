package X;

import android.widget.Adapter;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.M1q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49897M1q implements Runnable {
    public final /* synthetic */ C3W3 A00;

    public RunnableC49897M1q(C3W3 c3w3) {
        this.A00 = c3w3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReboundViewPager reboundViewPager = this.A00.A09;
        Adapter adapter = reboundViewPager.getAdapter();
        if (adapter != null) {
            int count = adapter.getCount();
            int floor = ((int) Math.floor(reboundViewPager.A01)) + 1;
            if (floor < count) {
                reboundViewPager.A0G(floor);
                C2UY.A01.A04();
                return;
            }
            return;
        }
        throw AbstractC25227BEk.A0n();
    }
}
