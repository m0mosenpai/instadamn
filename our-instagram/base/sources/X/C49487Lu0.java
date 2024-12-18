package X;

import androidx.viewpager.widget.ViewPager;

/* renamed from: X.Lu0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49487Lu0 implements MQA {
    public final ViewPager A00;

    @Override // X.MQA
    public final int AuT() {
        return this.A00.getCurrentItem();
    }

    @Override // X.MQA
    public final void ESe(int i, boolean z) {
        this.A00.setCurrentItem(i);
    }

    public C49487Lu0(ViewPager viewPager) {
        this.A00 = viewPager;
    }
}
