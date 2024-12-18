package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import java.util.List;

/* loaded from: classes8.dex */
public final class LQD implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public LQD(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj3;
        this.A03 = obj2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(view, 0);
                C011504d A00 = AbstractC009003e.A00(view);
                if (A00 == null || !A00.A00.A0I(8)) {
                    return;
                }
                view.removeOnLayoutChangeListener(this);
                View view2 = (View) this.A03;
                C168127f7 c168127f7 = (C168127f7) this.A02;
                InterfaceC166277bw interfaceC166277bw = (InterfaceC166277bw) this.A01;
                view2.postDelayed(new M36(c168127f7, interfaceC166277bw), ((C167827ec) interfaceC166277bw).A00);
                return;
            case 1:
                C44773Jru c44773Jru = (C44773Jru) this.A03;
                c44773Jru.A04.removeOnLayoutChangeListener(this);
                c44773Jru.A00 = null;
                c44773Jru.A00((Bitmap) this.A01, (Medium) this.A02);
                return;
            case 2:
                view.removeOnLayoutChangeListener(this);
                DirectAggregatedMediaViewerController directAggregatedMediaViewerController = (DirectAggregatedMediaViewerController) this.A03;
                KL4 kl4 = directAggregatedMediaViewerController.A0I;
                String str = "pagerAdapter";
                if (kl4 != null) {
                    C15100pQ c15100pQ = (C15100pQ) this.A01;
                    kl4.A00 = c15100pQ.A00;
                    kl4.A05 = true;
                    kl4.A00((List) this.A02, false);
                    ReboundViewPager reboundViewPager = directAggregatedMediaViewerController.A0D;
                    if (reboundViewPager == null) {
                        str = "viewPager";
                    } else {
                        float f = c15100pQ.A00;
                        reboundViewPager.A02 = reboundViewPager.A01;
                        reboundViewPager.A0J(f, true, false);
                        reboundViewPager.A02 = -1.0f;
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 3:
                Resources resources = (Resources) this.A02;
                int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.account_recs_header_image_margin);
                int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.menu_popup_panel_shadow_offset);
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) this.A01;
                autoCompleteTextView.setDropDownWidth(((View) this.A03).getWidth() + (dimensionPixelOffset2 * (-2)) + (dimensionPixelOffset * 2));
                autoCompleteTextView.setDropDownHorizontalOffset(dimensionPixelOffset2 - dimensionPixelOffset);
                return;
            default:
                View view3 = (View) this.A01;
                if (view3.getMeasuredWidth() != 0) {
                    int measuredWidth = view3.getMeasuredWidth();
                    C50563MTu c50563MTu = (C50563MTu) this.A02;
                    if (measuredWidth != c50563MTu.A00) {
                        C50561MTs.A00((C50561MTs) this.A03);
                        c50563MTu.A00 = view3.getMeasuredWidth();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
