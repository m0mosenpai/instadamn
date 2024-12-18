package X;

import android.animation.ValueAnimator;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.76c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1576876c implements C7GU {
    public final IgImageView A00;

    @Override // X.C7GU
    public final void Cy4(int i, int i2, boolean z) {
        float f = i / i2;
        LKJ A00 = LKJ.A0C.A00(this.A00);
        if (z) {
            A00.A02();
            return;
        }
        A00.A04();
        ValueAnimator valueAnimator = A00.A01;
        valueAnimator.cancel();
        valueAnimator.setFloatValues(A00.A00, f);
        valueAnimator.start();
    }

    @Override // X.C7GU
    public final void Cy3() {
        LKJ.A0C.A00(this.A00).A03();
    }

    public AbstractC1576876c(IgImageView igImageView) {
        this.A00 = igImageView;
    }
}
