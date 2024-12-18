package X;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.Mjk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51200Mjk extends C1I4 implements ValueAnimator.AnimatorUpdateListener {
    public int A00;
    public final float A01;
    public final int A02;
    public final ValueAnimator A03;
    public final View A04;

    public C51200Mjk(View view) {
        this.A04 = view;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.A03 = valueAnimator;
        Resources resources = view.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.album_preview_add_item_margin) + (AbstractC166997dE.A07(resources) * 2);
        this.A02 = dimensionPixelSize;
        float A04 = AbstractC166987dD.A04(resources, R.dimen.account_discovery_bottom_gap) / 2.0f;
        this.A01 = A04;
        view.setTranslationX((dimensionPixelSize / 2.0f) - A04);
        view.setVisibility(0);
        valueAnimator.addUpdateListener(this);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        Object A0s = AbstractC43593JPy.A0s(valueAnimator);
        if ((A0s instanceof Float) && (number = (Number) A0s) != null) {
            this.A04.setTranslationX(number.floatValue() - this.A00);
        }
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = C0f9.A03(1182168302);
        this.A00 = Math.max(0, this.A00 + i);
        if (!this.A03.isRunning()) {
            View view = this.A04;
            view.setTranslationX(view.getTranslationX() - i);
        }
        C0f9.A0A(1621040581, A03);
    }
}
