package X;

import androidx.viewpager.widget.ViewPager;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Kac, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46080Kac extends AbstractC44094JeJ implements MPJ {
    public final ViewPager A00;
    public final FixedTabBar A01;
    public final InterfaceC50521MRz A02;
    public final List A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46080Kac(AbstractC10360h2 abstractC10360h2, ViewPager viewPager, FixedTabBar fixedTabBar, InterfaceC50521MRz interfaceC50521MRz, List list, boolean z, boolean z2) {
        super(abstractC10360h2, interfaceC50521MRz, list);
        AbstractC25233BEq.A0x(3, viewPager, fixedTabBar, list);
        AbstractC13620mo.A02(viewPager.getContext());
        this.A02 = interfaceC50521MRz;
        this.A00 = viewPager;
        this.A01 = fixedTabBar;
        this.A03 = list;
        int i = 0;
        if (z2 && list.size() == 1) {
            i = 8;
        }
        fixedTabBar.setVisibility(i);
        fixedTabBar.A0A = z;
        fixedTabBar.A06 = this;
        List list2 = this.A03;
        ArrayList A0q = AbstractC167017dG.A0q(list2);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            A0q.add(this.A02.ANJ(it.next()));
        }
        fixedTabBar.setTabs(A0q);
        ViewPager A04 = A04();
        this.mContainer = A04;
        A04.setAdapter(this);
        A04.A0J(new C48113LRn(this, 3));
        viewPager.A0J(fixedTabBar);
    }

    @Override // X.AbstractC44094JeJ, X.MPJ
    public final void setMode(int i) {
        super.setMode(i);
        this.A01.A02(i);
    }
}
