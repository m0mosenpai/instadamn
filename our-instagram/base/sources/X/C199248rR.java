package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.8rR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199248rR {
    public int A00;
    public final TargetViewSizeProvider A01;

    public C199248rR(TargetViewSizeProvider targetViewSizeProvider) {
        C14360o3.A0B(targetViewSizeProvider, 1);
        this.A01 = targetViewSizeProvider;
    }

    public final void A00(ViewGroup viewGroup, View[] viewArr, int i, int i2, int i3) {
        C14360o3.A0B(viewArr, 4);
        int i4 = 0;
        for (View view : viewArr) {
            if (view != null && view.getVisibility() == 0) {
                i4++;
            }
        }
        int width = ((NineSixteenLayoutConfigImpl) this.A01).A0K.getWidth() - i;
        if (this.A00 != i4 && width > 0) {
            this.A00 = i4;
            if (((i3 * 2) + i2) * i4 > width) {
                i2 = Math.round(i2 - (((r0 - width) + i) / i4));
            }
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = viewGroup.getChildAt(i5);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    ((ViewGroup.LayoutParams) layoutParams2).width = i2;
                    ((ViewGroup.LayoutParams) layoutParams2).height = i2;
                    layoutParams2.gravity = 16;
                    layoutParams2.setMargins(i3, 0, i3, 0);
                    childAt.setLayoutParams(layoutParams2);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
    }
}
