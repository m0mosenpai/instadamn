package X;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Hag, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39396Hag extends AbstractC44098JeN {
    public final ViewPager A00;
    public final IgSegmentedTabLayout A01;
    public final List A02;
    public final JHA A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39396Hag(AbstractC10360h2 abstractC10360h2, ViewPager viewPager, JHA jha, IgSegmentedTabLayout igSegmentedTabLayout) {
        super(abstractC10360h2);
        C14360o3.A0B(viewPager, 3);
        this.A03 = jha;
        this.A00 = viewPager;
        this.A01 = igSegmentedTabLayout;
        this.A02 = AbstractC166987dD.A1E();
        igSegmentedTabLayout.setViewPager(viewPager);
        this.mContainer = viewPager;
        viewPager.setAdapter(this);
    }

    public final void A00(List list, int i) {
        List list2 = this.A02;
        list2.clear();
        list2.addAll(list);
        IgSegmentedTabLayout igSegmentedTabLayout = this.A01;
        C44436Jks c44436Jks = igSegmentedTabLayout.A04;
        c44436Jks.removeAllViews();
        c44436Jks.A02 = -1;
        c44436Jks.A00 = -1;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C47673L3g C4s = this.A03.C4s(it.next());
            C14360o3.A0B(C4s, 0);
            igSegmentedTabLayout.A01(null, C4s);
        }
        notifyDataSetChanged();
        if (!list2.isEmpty()) {
            if (i >= 0 && i < list2.size()) {
                igSegmentedTabLayout.A00(i, true);
                this.A00.setCurrentItem(i);
                return;
            }
            throw AbstractC25230BEn.A0n("Cannot set tab position to invalid position = ", i);
        }
    }

    @Override // X.AbstractC44098JeN
    public final Fragment createItem(int i) {
        return this.A03.ALl(this.A02.get(i));
    }

    @Override // X.AbstractC021208i
    public final int getCount() {
        return this.A02.size();
    }
}
