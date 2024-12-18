package X;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes11.dex */
public final class UKA extends UKB {
    @Override // X.VKI
    public final float A00(View view) {
        return view.getTransitionAlpha();
    }

    @Override // X.VKI
    public final void A01(Matrix matrix, View view) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // X.VKI
    public final void A02(Matrix matrix, View view) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // X.VKI
    public final void A03(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // X.UKB, X.VKI
    public final void A04(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // X.VKI
    public final void A05(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }
}
