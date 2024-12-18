package X;

import android.database.DataSetObserver;
import com.facebook.systrace.Systrace;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.3VX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3VX extends DataSetObserver {
    public final /* synthetic */ ReboundViewPager A00;

    public C3VX(ReboundViewPager reboundViewPager) {
        this.A00 = reboundViewPager;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        ReboundViewPager reboundViewPager = this.A00;
        if (Systrace.A0E(1L)) {
            C0fO.A01("ReboundViewPagerDataSetObserver.onChanged", -334719782);
        }
        try {
            ReboundViewPager.A06(reboundViewPager, true, false);
            reboundViewPager.A0D = reboundViewPager.A08;
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1176841178);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1164592996);
            }
            throw th;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        ReboundViewPager reboundViewPager = this.A00;
        if (Systrace.A0E(1L)) {
            C0fO.A01("ReboundViewPagerDataSetObserver.onInvalidated", -447724086);
        }
        try {
            ReboundViewPager.A06(reboundViewPager, true, false);
            reboundViewPager.A0D = reboundViewPager.A08;
            if (Systrace.A0E(1L)) {
                C0fO.A00(-469961472);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(38888443);
            }
            throw th;
        }
    }

    public C3VX() {
    }
}
