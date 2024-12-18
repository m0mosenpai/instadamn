package com.instagram.ui.layoutmanager;

import X.AbstractC06930Yk;
import X.AbstractC12120kG;
import X.AbstractC70663Fe;
import X.C14360o3;
import X.C3F5;
import X.C70593Ew;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AutoMeasureLinearLayoutManager;
import kotlin.Deprecated;

@Deprecated(message = "use [LinearLayoutManager] instead, and call\n      [LinearLayoutManager#setAutoMeasureEnabled(boolean)] with {@code true} to enable this\n      wrap_content behavior (this behavior will be enabled by default once t15165061 is closed).")
/* loaded from: classes2.dex */
public final class BetterLinearLayoutManager extends AutoMeasureLinearLayoutManager {
    @Override // X.AbstractC70663Fe
    public final void A0y(C70593Ew c70593Ew, C3F5 c3f5, int i, int i2) {
        int i3;
        C14360o3.A0B(c70593Ew, 0);
        C14360o3.A0B(c3f5, 1);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = 0;
        if (c3f5.A00() > 0) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int[] iArr = {0, 0};
            try {
                View A04 = c70593Ew.A04(0);
                if (A04 != null) {
                    ViewGroup.LayoutParams layoutParams = A04.getLayoutParams();
                    if (layoutParams != null) {
                        A04.measure(ViewGroup.getChildMeasureSpec(makeMeasureSpec, Bau() + Baw(), layoutParams.width), ViewGroup.getChildMeasureSpec(makeMeasureSpec2, Bax() + Bat(), layoutParams.height));
                        iArr[0] = A04.getMeasuredWidth();
                        iArr[1] = A04.getMeasuredHeight();
                        c70593Ew.A0A(A04);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                AbstractC12120kG.A0J("IndexOutOfBoundsException in BetterLinearLayoutManager:measureScrapChild while trying getting item view at position 0", e, AbstractC06930Yk.A0E(), 817899586);
            }
            i4 = iArr[0];
            i3 = iArr[1];
        } else {
            i3 = 0;
        }
        if (mode != 1073741824) {
            size = i4;
        }
        if (mode2 != 1073741824) {
            size2 = i3;
        }
        ((AbstractC70663Fe) this).A07.setMeasuredDimension(size, size2);
    }
}
