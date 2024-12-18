package X;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.Sjp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63411Sjp implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ float A04;
    public final /* synthetic */ float A05;
    public final /* synthetic */ float A06;
    public final /* synthetic */ float A07;
    public final /* synthetic */ SX3 A08;
    public final /* synthetic */ C62607SIn A09;

    public C63411Sjp(SX3 sx3, C62607SIn c62607SIn, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.A08 = sx3;
        this.A06 = f;
        this.A02 = f2;
        this.A07 = f3;
        this.A03 = f4;
        this.A09 = c62607SIn;
        this.A04 = f5;
        this.A00 = f6;
        this.A05 = f7;
        this.A01 = f8;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Q3d q3d;
        C14360o3.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        C14360o3.A0C(animatedValue, AbstractC111324zv.A00(4995));
        float A09 = AbstractC166987dD.A09(animatedValue);
        SX3 sx3 = this.A08;
        float f = this.A06;
        float f2 = f + ((this.A02 - f) * A09);
        float f3 = this.A07;
        float f4 = f3 + ((this.A03 - f3) * A09);
        C63962Swn c63962Swn = this.A09.A04;
        float f5 = this.A04;
        float f6 = f5 + ((this.A00 - f5) * A09);
        float f7 = this.A05;
        float f8 = f7 + ((this.A01 - f7) * A09);
        Rect A0U = AbstractC166987dD.A0U();
        C62607SIn c62607SIn = sx3.A05;
        int i = c62607SIn.A03;
        int i2 = c62607SIn.A02;
        SS1.A01(A0U, i, i2);
        int centerX = A0U.centerX();
        int centerY = A0U.centerY();
        int width = A0U.width() / 2;
        int width2 = A0U.width() / 2;
        int i3 = centerX - (width / 2);
        A0U.left = i3;
        int i4 = centerY - (width2 / 2);
        A0U.top = i4;
        A0U.right = i3 + width;
        A0U.bottom = i4 + width2;
        int i5 = c62607SIn.A01;
        int i6 = c62607SIn.A00;
        Matrix A00 = AbstractC63111SdF.A00(i, i2, i5, i6);
        A00.invert(A00);
        A00.postTranslate(f2, f4);
        RectF rectF = new RectF(A0U);
        A00.mapRect(rectF);
        A0U.left = (int) rectF.left;
        A0U.top = (int) rectF.top;
        A0U.right = (int) rectF.right;
        A0U.bottom = (int) rectF.bottom;
        SPE spe = new SPE(A0U, f6, f8, i5, i6);
        if (c63962Swn.A0E && (q3d = c63962Swn.A09) != null) {
            AbstractC166997dE.A1H(q3d, spe, 0);
        }
    }
}
