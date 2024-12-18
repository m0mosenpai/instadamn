package X;

import android.view.View;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;

/* renamed from: X.LRo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48114LRo implements InterfaceC021908q {
    public final /* synthetic */ IgSegmentedTabLayout A00;
    public final /* synthetic */ C44436Jks A01;

    public C48114LRo(IgSegmentedTabLayout igSegmentedTabLayout, C44436Jks c44436Jks) {
        this.A00 = igSegmentedTabLayout;
        this.A01 = c44436Jks;
    }

    @Override // X.InterfaceC021908q
    public final void onPageScrollStateChanged(int i) {
        IgSegmentedTabLayout igSegmentedTabLayout = this.A00;
        igSegmentedTabLayout.A01 = igSegmentedTabLayout.A02;
        igSegmentedTabLayout.A02 = i;
    }

    @Override // X.InterfaceC021908q
    public final void onPageScrolled(int i, float f, int i2) {
        IgSegmentedTabLayout igSegmentedTabLayout = this.A00;
        int i3 = igSegmentedTabLayout.A02;
        if (i3 == 1 || (i3 == 2 && igSegmentedTabLayout.A01 == 1)) {
            int ceil = (int) Math.ceil(i + f);
            C44436Jks c44436Jks = this.A01;
            View childAt = c44436Jks.getChildAt(ceil);
            igSegmentedTabLayout.scrollTo((int) (((childAt.getLeft() - (AbstractC43594JPz.A09(igSegmentedTabLayout, childAt) / 2)) * f) + ((1.0f - f) * (r2.getLeft() - (AbstractC43594JPz.A09(igSegmentedTabLayout, c44436Jks.getChildAt(i)) / 2)))), 0);
            c44436Jks.onPageScrolled(i, f, i2);
        }
    }

    @Override // X.InterfaceC021908q
    public final void onPageSelected(int i) {
    }
}
