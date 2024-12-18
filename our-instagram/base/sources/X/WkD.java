package X;

import android.widget.Adapter;
import androidx.fragment.app.Fragment;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* loaded from: classes11.dex */
public final class WkD implements C3A8 {
    public final Fragment A00;
    public final ReboundViewPager A01;

    @Override // X.C3A8
    public final void FDq(C3AB c3ab, C3A9 c3a9) {
        ReboundViewPager reboundViewPager;
        Adapter adapter;
        if (this.A00.isResumed() && (adapter = (reboundViewPager = this.A01).getAdapter()) != null && adapter.getCount() != 0) {
            int i = reboundViewPager.A0A;
            for (int i2 = reboundViewPager.A09; i2 <= i; i2++) {
                c3a9.A02(c3ab, i2);
            }
        }
    }

    public WkD(Fragment fragment, ReboundViewPager reboundViewPager) {
        this.A00 = fragment;
        this.A01 = reboundViewPager;
    }
}
