package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;

/* renamed from: X.BKa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC25357BKa implements Runnable {
    public final /* synthetic */ C37582Ggd A00;

    public RunnableC25357BKa(C37582Ggd c37582Ggd) {
        this.A00 = c37582Ggd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        ViewPager2 viewPager2;
        float f;
        C37582Ggd c37582Ggd = this.A00;
        FrameLayout frameLayout = c37582Ggd.A03;
        if (frameLayout != null) {
            View view = c37582Ggd.A01;
            if (view == null) {
                view = new View(AbstractC166997dE.A0L(frameLayout));
                view.setBackground(null);
                View view2 = c37582Ggd.A02;
                if (view2 != null) {
                    f = view2.getElevation();
                } else {
                    f = 0.0f;
                }
                view.setElevation(f + 1.0f);
                view.setVisibility(8);
                view.setOnTouchListener(new ViewOnTouchListenerC28679ClR(c37582Ggd, 2));
            }
            c37582Ggd.A01 = view;
            if (view.isLaidOut() && !view.isLayoutRequested()) {
                AbstractC25234BEr.A0s(view, AbstractC166987dD.A0C(AbstractC166997dE.A0L(view), 16), view.getHeight());
            } else {
                view.addOnLayoutChangeListener(new BO9());
            }
            FrameLayout frameLayout2 = c37582Ggd.A03;
            if (frameLayout2 != null) {
                frameLayout2.removeView(c37582Ggd.A01);
            }
            View view3 = c37582Ggd.A01;
            Context A0L = AbstractC166997dE.A0L(frameLayout);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, A0L.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material) + C37582Ggd.A00(A0L, c37582Ggd));
            layoutParams.gravity = 80;
            C37556GgC c37556GgC = ((AbstractC37623GhI) c37582Ggd).A02;
            if (c37556GgC != null && (viewPager2 = c37556GgC.A00) != null) {
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                viewPager2.getLocationOnScreen(iArr);
                frameLayout.getLocationOnScreen(iArr2);
                i = ((frameLayout.getHeight() - (iArr[1] - iArr2[1])) - viewPager2.getHeight()) - C37582Ggd.A00(A0L, c37582Ggd);
            } else {
                i = 0;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i;
            frameLayout.addView(view3, 0, layoutParams);
        }
        C37582Ggd.A01(c37582Ggd);
    }
}
