package X;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes8.dex */
public final class JZX {
    public C2UU A00;
    public AbstractC65392xb A01;
    public AnonymousClass725 A02;
    public JZW A03;
    public boolean A04;
    public final ViewPager2 A05;
    public final TabLayout A06;
    public final MO4 A07;

    public final void A00() {
        if (!this.A04) {
            ViewPager2 viewPager2 = this.A05;
            C2UU c2uu = viewPager2.A04.A0A;
            this.A00 = c2uu;
            if (c2uu != null) {
                this.A04 = true;
                TabLayout tabLayout = this.A06;
                JZW jzw = new JZW(tabLayout);
                this.A03 = jzw;
                viewPager2.A05(jzw);
                JZY jzy = new JZY(viewPager2);
                this.A02 = jzy;
                tabLayout.A0D(jzy);
                JZZ jzz = new JZZ(this);
                this.A01 = jzz;
                this.A00.registerAdapterDataObserver(jzz);
                A01();
                tabLayout.A0A(0.0f, viewPager2.A00, true, true);
                return;
            }
            throw AbstractC166987dD.A14("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw AbstractC166987dD.A14("TabLayoutMediator is already attached");
    }

    public final void A01() {
        TabLayout tabLayout = this.A06;
        tabLayout.A09();
        C2UU c2uu = this.A00;
        if (c2uu != null) {
            int itemCount = c2uu.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                C154306wf A06 = tabLayout.A06();
                this.A07.D6s(A06, i);
                tabLayout.A0E(A06, false);
            }
            if (itemCount > 0) {
                int min = Math.min(this.A05.A00, tabLayout.A0c.size() - 1);
                if (min != tabLayout.getSelectedTabPosition()) {
                    tabLayout.A0F(tabLayout.A07(min), true);
                }
            }
        }
    }

    public JZX(ViewPager2 viewPager2, TabLayout tabLayout, MO4 mo4) {
        this.A06 = tabLayout;
        this.A05 = viewPager2;
        this.A07 = mo4;
    }
}
