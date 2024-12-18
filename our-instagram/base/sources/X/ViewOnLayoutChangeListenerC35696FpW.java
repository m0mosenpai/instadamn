package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;

/* renamed from: X.FpW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnLayoutChangeListenerC35696FpW implements View.OnLayoutChangeListener {
    public final /* synthetic */ DirectAggregatedMediaViewerController A00;

    public ViewOnLayoutChangeListenerC35696FpW(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        this.A00 = directAggregatedMediaViewerController;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        ReboundViewPager reboundViewPager = this.A00.A0D;
        if (reboundViewPager == null) {
            C14360o3.A0F("viewPager");
            throw C00O.createAndThrow();
        }
        reboundViewPager.A0G(r0.A03);
    }
}
