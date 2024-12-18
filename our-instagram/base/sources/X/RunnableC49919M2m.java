package X;

import androidx.viewpager.widget.ViewPager;
import java.util.List;

/* renamed from: X.M2m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49919M2m implements Runnable {
    public final /* synthetic */ ViewPager A00;
    public final /* synthetic */ C25946Bdq A01;

    public RunnableC49919M2m(ViewPager viewPager, C25946Bdq c25946Bdq) {
        this.A00 = viewPager;
        this.A01 = c25946Bdq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewPager viewPager = this.A00;
        C25946Bdq c25946Bdq = this.A01;
        List list = viewPager.A0B;
        if (list != null) {
            list.remove(c25946Bdq);
        }
    }
}
