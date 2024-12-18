package X;

import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.M2n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49920M2n implements Runnable {
    public final /* synthetic */ ViewParent A00;
    public final /* synthetic */ C25946Bdq A01;

    public RunnableC49920M2n(ViewParent viewParent, C25946Bdq c25946Bdq) {
        this.A00 = viewParent;
        this.A01 = c25946Bdq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((ViewPager) this.A00).A0J(this.A01);
    }
}
