package X;

import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.728, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass728 implements InterfaceC021808p {
    public boolean A00;
    public final /* synthetic */ TabLayout A01;

    public AnonymousClass728(TabLayout tabLayout) {
        this.A01 = tabLayout;
    }

    @Override // X.InterfaceC021808p
    public final void CvH(AbstractC021208i abstractC021208i, AbstractC021208i abstractC021208i2, ViewPager viewPager) {
        TabLayout tabLayout = this.A01;
        if (tabLayout.A0J == viewPager) {
            tabLayout.A0C(abstractC021208i2, this.A00);
        }
    }
}
