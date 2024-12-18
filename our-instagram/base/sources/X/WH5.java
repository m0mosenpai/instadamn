package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView;

/* loaded from: classes11.dex */
public final class WH5 implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WH5(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        VaZ vaZ;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(valueAnimator, 0);
                ((C70099W2z) this.A01).A00 = AbstractC167017dG.A00(valueAnimator);
                ((Drawable) this.A02).invalidateSelf();
                return;
            case 1:
                C14360o3.A0B(valueAnimator, 0);
                float A00 = AbstractC167017dG.A00(valueAnimator);
                C66340UAd c66340UAd = (C66340UAd) this.A02;
                C69465Vno c69465Vno = (C69465Vno) this.A01;
                C66340UAd.A02(c69465Vno, c66340UAd, A00);
                if (A00 <= 0.95f || (vaZ = c69465Vno.A09) == null || c66340UAd.A03.hasMessages(1, c69465Vno)) {
                    return;
                }
                C66340UAd.A04(c69465Vno, c66340UAd, vaZ);
                return;
            case 2:
                C66304U8c c66304U8c = (C66304U8c) this.A02;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (c66304U8c.A02 == animatedFraction) {
                    return;
                }
                C66304U8c.A03(c66304U8c, animatedFraction);
                return;
            case 3:
                C14360o3.A0B(valueAnimator, 0);
                int A0D = AbstractC25230BEn.A0D(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
                View view = (View) this.A02;
                float f = 100.0f - A0D;
                view.setTranslationY(f);
                ((View) this.A01).setTranslationY(f);
                view.setAlpha((float) (A0D * 0.01d));
                return;
            case 4:
                C70164WEe c70164WEe = (C70164WEe) this.A01;
                c70164WEe.A00 = ((Number) valueAnimator.getAnimatedValue()).floatValue();
                C70164WEe.A00((Context) this.A02, c70164WEe);
                return;
            default:
                int A0D2 = AbstractC25230BEn.A0D(((ValueAnimator) this.A01).getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
                AbstractC67878V0j abstractC67878V0j = (AbstractC67878V0j) this.A02;
                C65823Tug c65823Tug = abstractC67878V0j.A06;
                if (c65823Tug != null) {
                    c65823Tug.A04(A0D2, abstractC67878V0j.A00);
                    C65823Tug c65823Tug2 = abstractC67878V0j.A06;
                    if (c65823Tug2 != null) {
                        DiscoveryRecyclerView discoveryRecyclerView = c65823Tug2.A04;
                        if (discoveryRecyclerView != null) {
                            discoveryRecyclerView.postOnAnimation(new RunnableC71375Wsk(abstractC67878V0j));
                        }
                        abstractC67878V0j.A00 = A0D2;
                        return;
                    }
                }
                C14360o3.A0F("grid");
                throw C00O.createAndThrow();
        }
    }
}
