package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class LM6 implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public LM6(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A02 = obj4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(valueAnimator, 0);
                float A00 = AbstractC167017dG.A00(valueAnimator);
                C7L9 c7l9 = (C7L9) this.A01;
                c7l9.A00 = A00;
                InterfaceC161697Me interfaceC161697Me = c7l9.A05;
                if (interfaceC161697Me != null) {
                    Iterator it = interfaceC161697Me.CGZ().iterator();
                    while (it.hasNext()) {
                        AbstractC43592JPx.A09(it).setTranslationX(A00);
                    }
                    C7L9.A00(c7l9, interfaceC161697Me, A00);
                }
                List list = (List) this.A04;
                Object obj = this.A03;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    View A09 = AbstractC43592JPx.A09(it2);
                    if (obj == C05F.A01) {
                        f = (-1.0f) * A00;
                    } else {
                        f = A00;
                    }
                    A09.setTranslationX(f);
                }
                ((View) this.A02).invalidate();
                return;
            case 1:
                C14360o3.A0B(valueAnimator, 0);
                if (valueAnimator.getAnimatedFraction() <= 0.5f) {
                    return;
                }
                ((ViewPropertyAnimator) this.A01).setUpdateListener(null);
                AbstractC43592JPx.A1U(this.A02, 0);
                ((L8P) this.A04).A00.A02(((C51688MsJ) this.A03).A00, false, false);
                return;
            case 2:
                C14360o3.A0B(valueAnimator, 0);
                float A002 = AbstractC167017dG.A00(valueAnimator);
                int A003 = (int) AbstractC13880nE.A00((Context) this.A01, 12.0f + (4.0f * (1.0f - A002)));
                TextView textView = (TextView) this.A04;
                textView.setWidth((int) (AbstractC166987dD.A07(textView) * A002));
                textView.setHeight(textView.getHeight());
                textView.setAlpha(A002);
                textView.setScaleX(A002);
                textView.setScaleY(A002);
                Drawable background = ((View) this.A02).getBackground();
                if (background != null) {
                    background.setAlpha((int) (A002 * 255.0f));
                }
                View view = (View) this.A03;
                AbstractC43592JPx.A1G(view, A003);
                AbstractC43592JPx.A1F(view, A003);
                return;
            case 3:
                int A0D = AbstractC25230BEn.A0D(((ValueAnimator) this.A01).getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
                AbstractC43593JPy.A1C((View) this.A03, A0D);
                C65823Tug c65823Tug = ((AbstractC67878V0j) this.A04).A06;
                if (c65823Tug == null) {
                    C14360o3.A0F("grid");
                    throw C00O.createAndThrow();
                }
                C15100pQ c15100pQ = (C15100pQ) this.A02;
                c65823Tug.A04(A0D, c15100pQ.A00);
                c15100pQ.A00 = A0D;
                return;
            default:
                return;
        }
    }
}
