package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.instagram.discovery.mediamap.fragment.LocationSearchFragment;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;

/* renamed from: X.FpY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnLayoutChangeListenerC35698FpY implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewOnLayoutChangeListenerC35698FpY(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2;
        switch (this.A00) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                ReboundViewPager reboundViewPager = ((DirectAggregatedMediaViewerController) this.A02).A0D;
                if (reboundViewPager == null) {
                    C14360o3.A0F("viewPager");
                    throw C00O.createAndThrow();
                }
                reboundViewPager.A0G(((C15100pQ) this.A01).A00);
                return;
            case 1:
                if (i3 - i == 0 && i4 - i2 == 0) {
                    return;
                }
                ((View) this.A02).removeOnLayoutChangeListener(this);
                LocationSearchFragment locationSearchFragment = (LocationSearchFragment) this.A01;
                Fragment fragment = locationSearchFragment.mParentFragment;
                fragment.getClass();
                ((MediaMapFragment) fragment).A0H(locationSearchFragment);
                locationSearchFragment.A00 = 0.5f;
                return;
            case 2:
                View view3 = (View) this.A02;
                C14360o3.A0A(view3);
                view2 = (View) this.A01;
                AbstractC13880nE.A0Y(view3, view2.getHeight());
                view2.removeOnLayoutChangeListener(this);
                return;
            default:
                View view4 = ((C32345EMr) this.A02).A00;
                if (view4 != null) {
                    AbstractC13880nE.A0Y(view4, ((View) this.A01).getHeight());
                }
                view2 = (View) this.A01;
                view2.removeOnLayoutChangeListener(this);
                return;
        }
    }
}
