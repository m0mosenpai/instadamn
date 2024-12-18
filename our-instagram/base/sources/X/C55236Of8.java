package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserCategoriesViewController;

/* renamed from: X.Of8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55236Of8 implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C55236Of8(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        Number number2;
        int i = this.A00;
        Object A0s = AbstractC43593JPy.A0s(valueAnimator);
        boolean z = A0s instanceof Float;
        if (i != 0) {
            if (z && (number2 = (Number) A0s) != null) {
                GiphyClipsBrowserCategoriesViewController giphyClipsBrowserCategoriesViewController = (GiphyClipsBrowserCategoriesViewController) this.A01;
                boolean z2 = this.A02;
                float floatValue = number2.floatValue();
                RecyclerView recyclerView = giphyClipsBrowserCategoriesViewController.categoryRecyclerView;
                if (recyclerView != null) {
                    recyclerView.setAlpha(floatValue);
                }
                float f = ((floatValue - 1.0f) * 0.2f) + 1.0f;
                RecyclerView recyclerView2 = giphyClipsBrowserCategoriesViewController.categoryRecyclerView;
                if (recyclerView2 != null) {
                    recyclerView2.setScaleY(f);
                }
                if (floatValue == 0.0f && !z2) {
                    AbstractC167007dF.A0x(giphyClipsBrowserCategoriesViewController.categoryRecyclerView);
                    return;
                }
                return;
            }
            return;
        }
        if (!z || (number = (Number) A0s) == null) {
            return;
        }
        C211029Uz c211029Uz = (C211029Uz) this.A01;
        boolean z3 = this.A02;
        float floatValue2 = number.floatValue();
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        RoundedCornerImageView roundedCornerImageView = c211029Uz.A06;
        roundedCornerImageView.setAlpha(floatValue2);
        float f2 = ((floatValue2 - 1.0f) * 0.2f) + 1.0f;
        roundedCornerImageView.setScaleX(f2);
        roundedCornerImageView.setScaleY(f2);
        if (floatValue2 != 0.0f || z3) {
            return;
        }
        c211029Uz.itemView.setVisibility(8);
    }
}
