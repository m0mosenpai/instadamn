package X;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes7.dex */
public final class J3F implements Runnable {
    public final /* synthetic */ HMW A00;

    public J3F(HMW hmw) {
        this.A00 = hmw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HMW hmw = this.A00;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        ViewPager2 viewPager2 = hmw.A04;
        if (viewPager2.A08.A02 == 0) {
            viewPager2.A03((hmw.A00 + 1) % hmw.A06.A00.size(), true);
        }
    }
}
