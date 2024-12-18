package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.M1r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49898M1r implements Runnable {
    public final /* synthetic */ C3W3 A00;

    public RunnableC49898M1r(C3W3 c3w3) {
        this.A00 = c3w3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReboundViewPager reboundViewPager = this.A00.A09;
        int floor = ((int) Math.floor(reboundViewPager.A01)) - 1;
        if (floor >= 0) {
            reboundViewPager.A0G(floor);
            C2UY.A01.A04();
        }
    }
}
