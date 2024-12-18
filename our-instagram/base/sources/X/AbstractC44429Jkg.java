package X;

import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2;

/* renamed from: X.Jkg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44429Jkg extends HorizontalScrollView {
    /* JADX WARN: Multi-variable type inference failed */
    public final void A00(int i, boolean z) {
        C44436Jks c44436Jks;
        int i2;
        int left;
        IgSegmentedTabLayout2 igSegmentedTabLayout2;
        if (this instanceof IgSegmentedTabLayout) {
            IgSegmentedTabLayout igSegmentedTabLayout = (IgSegmentedTabLayout) this;
            c44436Jks = igSegmentedTabLayout.A04;
            if (i < c44436Jks.getChildCount()) {
                View childAt = c44436Jks.getChildAt(i);
                MQA mqa = igSegmentedTabLayout.A03;
                if (mqa == null) {
                    i2 = 0;
                    left = (int) ((childAt.getLeft() - (AbstractC43594JPz.A09(igSegmentedTabLayout, childAt) / 2)) - igSegmentedTabLayout.getScrollX());
                    igSegmentedTabLayout2 = igSegmentedTabLayout;
                    if (!z) {
                        igSegmentedTabLayout.scrollBy(left, 0);
                    }
                    igSegmentedTabLayout2.smoothScrollBy(left, i2);
                } else {
                    mqa.ESe(i, z);
                }
            } else {
                return;
            }
        } else {
            IgSegmentedTabLayout2 igSegmentedTabLayout22 = (IgSegmentedTabLayout2) this;
            z = true;
            c44436Jks = igSegmentedTabLayout22.A04;
            if (i >= c44436Jks.getChildCount()) {
                return;
            }
            View childAt2 = c44436Jks.getChildAt(i);
            ViewPager2 viewPager2 = igSegmentedTabLayout22.A03;
            if (viewPager2 == null) {
                i2 = 0;
                left = (int) ((childAt2.getLeft() - (AbstractC43594JPz.A09(igSegmentedTabLayout22, childAt2) / 2)) - igSegmentedTabLayout22.getScrollX());
                igSegmentedTabLayout2 = igSegmentedTabLayout22;
                igSegmentedTabLayout2.smoothScrollBy(left, i2);
            } else {
                viewPager2.A03(i, true);
            }
        }
        c44436Jks.A02(i, z);
    }

    public final void A01(View.OnClickListener onClickListener, C47673L3g c47673L3g) {
        boolean z = this instanceof IgSegmentedTabLayout;
        C44435Jko c44435Jko = new C44435Jko(AbstractC166997dE.A0L(this), c47673L3g);
        addView(c44435Jko);
        if (onClickListener != null) {
            c44435Jko.setOnClickListener(onClickListener);
        }
    }
}
