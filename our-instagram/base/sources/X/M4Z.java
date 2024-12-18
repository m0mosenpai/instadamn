package X;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes8.dex */
public final class M4Z implements Runnable {
    public final /* synthetic */ KCU A00;
    public final /* synthetic */ C46002KXq A01;

    public M4Z(KCU kcu, C46002KXq c46002KXq) {
        this.A00 = kcu;
        this.A01 = c46002KXq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewPager2 viewPager2 = this.A00.A0B;
        if (viewPager2 == null) {
            C14360o3.A0F("presenceHScrollPager");
            throw C00O.createAndThrow();
        }
        viewPager2.A03(this.A01.A00, true);
    }
}
