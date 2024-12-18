package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: X.TtY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65758TtY implements InterfaceC155836zD {
    public final /* synthetic */ CollapsingToolbarLayout A00;

    public C65758TtY(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.A00 = collapsingToolbarLayout;
    }

    @Override // X.InterfaceC155846zE
    public final void DWT(AppBarLayout appBarLayout, int i) {
        int i2;
        int height;
        CollapsingToolbarLayout collapsingToolbarLayout = this.A00;
        collapsingToolbarLayout.A00 = i;
        C011504d c011504d = collapsingToolbarLayout.A09;
        if (c011504d != null) {
            i2 = c011504d.A03();
        } else {
            i2 = 0;
        }
        int childCount = collapsingToolbarLayout.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = collapsingToolbarLayout.getChildAt(i3);
            UBM ubm = (UBM) childAt.getLayoutParams();
            C72E A00 = CollapsingToolbarLayout.A00(childAt);
            int i4 = ubm.A01;
            if (i4 != 1) {
                if (i4 == 2) {
                    height = Math.round((-i) * ubm.A00);
                }
            } else {
                int i5 = -i;
                height = ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.A00(childAt).A01) - childAt.getHeight()) - ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (i5 < 0) {
                    height = 0;
                } else if (i5 <= height) {
                    height = i5;
                }
            }
            if (A00.A02 != height) {
                A00.A02 = height;
                A00.A00();
            }
        }
        collapsingToolbarLayout.A05();
        if (collapsingToolbarLayout.A05 != null && i2 > 0) {
            collapsingToolbarLayout.postInvalidateOnAnimation();
        }
        int height2 = collapsingToolbarLayout.getHeight();
        int minimumHeight = (height2 - collapsingToolbarLayout.getMinimumHeight()) - i2;
        int scrimVisibleHeightTrigger = height2 - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
        C65757TtX c65757TtX = collapsingToolbarLayout.A0S;
        float f = minimumHeight;
        float min = Math.min(1.0f, scrimVisibleHeightTrigger / f);
        c65757TtX.A0L = min;
        c65757TtX.A0M = min + ((1.0f - min) * 0.5f);
        c65757TtX.A0Q = collapsingToolbarLayout.A00 + minimumHeight;
        c65757TtX.A07(Math.abs(i) / f);
    }
}
