package X;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.lang.ref.Reference;
import java.util.Iterator;

/* renamed from: X.4ZF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4ZF {
    public ValueAnimator.AnimatorUpdateListener A00;
    public ValueAnimator.AnimatorUpdateListener A01;
    public ValueAnimator A02;
    public ValueAnimator A03;
    public ValueAnimator A04;
    public AbstractC87373uv A06;
    public EnumC92614Cv A05 = EnumC92614Cv.STOPPED;
    public final java.util.Set A07 = new C012504o(1);

    private void A00(EnumC92614Cv enumC92614Cv) {
        RectF rectF;
        float height;
        Iterator it = this.A07.iterator();
        while (it.hasNext()) {
            C3WC c3wc = (C3WC) ((Reference) it.next()).get();
            if (c3wc != null) {
                SlideInAndOutIconView slideInAndOutIconView = (SlideInAndOutIconView) c3wc;
                slideInAndOutIconView.setVisibility(0);
                String str = slideInAndOutIconView.A04;
                if (str != null && !str.isEmpty() && enumC92614Cv == EnumC92614Cv.FULLTEXT) {
                    slideInAndOutIconView.A0C.setVisibility(0);
                    rectF = slideInAndOutIconView.A0A;
                    height = rectF.height() + r0.getMeasuredWidth();
                } else {
                    slideInAndOutIconView.A0C.setVisibility(8);
                    rectF = slideInAndOutIconView.A0A;
                    height = rectF.height();
                }
                SlideInAndOutIconView.A00(slideInAndOutIconView, 0.0f, height, rectF.height());
            }
        }
    }

    public final void A01() {
        EnumC92614Cv enumC92614Cv = this.A05;
        EnumC92614Cv enumC92614Cv2 = EnumC92614Cv.STOPPED;
        if (enumC92614Cv != enumC92614Cv2) {
            ValueAnimator valueAnimator = this.A02;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator2 = this.A04;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                valueAnimator2.removeAllUpdateListeners();
                valueAnimator2.removeAllListeners();
            }
            ValueAnimator valueAnimator3 = this.A03;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                valueAnimator3.removeAllUpdateListeners();
                valueAnimator3.removeAllListeners();
            }
            this.A05 = enumC92614Cv2;
        }
    }

    public final void A02(C30R c30r) {
        EnumC92614Cv enumC92614Cv;
        ValueAnimator valueAnimator;
        int i;
        if (c30r.A03) {
            A00(EnumC92614Cv.ICON);
            if (this.A02 == null) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                this.A02 = duration;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.A00;
                if (animatorUpdateListener == null) {
                    animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: X.4ZG
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            Iterator it = C4ZF.this.A07.iterator();
                            while (it.hasNext()) {
                                Object obj = (C3WC) ((Reference) it.next()).get();
                                if (obj != null) {
                                    ((View) obj).setAlpha(((Number) valueAnimator2.getAnimatedValue()).floatValue());
                                }
                            }
                        }
                    };
                    this.A00 = animatorUpdateListener;
                }
                duration.addUpdateListener(animatorUpdateListener);
                valueAnimator = this.A02;
            } else {
                return;
            }
        } else {
            C30Q c30q = c30r.A02;
            C30Q c30q2 = C30Q.SLIDE_IN;
            if (c30q == c30q2) {
                A00(EnumC92614Cv.FULLTEXT);
                ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                this.A04 = duration2;
                duration2.addUpdateListener(new C130425un(this));
                this.A04.addListener(new C130435uo(c30q2, this));
                valueAnimator = this.A04;
            } else {
                boolean z = false;
                if (this.A05 != EnumC92614Cv.STOPPED) {
                    z = true;
                    A01();
                }
                int i2 = c30r.A00;
                if (i2 <= 0 && i2 != -1) {
                    enumC92614Cv = EnumC92614Cv.ICON;
                } else {
                    enumC92614Cv = EnumC92614Cv.FULLTEXT;
                }
                this.A05 = enumC92614Cv;
                A00(enumC92614Cv);
                if (!z) {
                    ValueAnimator duration3 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    this.A02 = duration3;
                    ValueAnimator.AnimatorUpdateListener animatorUpdateListener2 = this.A00;
                    if (animatorUpdateListener2 == null) {
                        animatorUpdateListener2 = new ValueAnimator.AnimatorUpdateListener() { // from class: X.4ZG
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                Iterator it = C4ZF.this.A07.iterator();
                                while (it.hasNext()) {
                                    Object obj = (C3WC) ((Reference) it.next()).get();
                                    if (obj != null) {
                                        ((View) obj).setAlpha(((Number) valueAnimator2.getAnimatedValue()).floatValue());
                                    }
                                }
                            }
                        };
                        this.A00 = animatorUpdateListener2;
                    }
                    duration3.addUpdateListener(animatorUpdateListener2);
                    this.A02.start();
                }
                if (i2 > 0 && (i2 < (i = c30r.A01) || i == -1)) {
                    ValueAnimator duration4 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
                    this.A04 = duration4;
                    duration4.setStartDelay(i2);
                    ValueAnimator valueAnimator2 = this.A04;
                    C30Q c30q3 = C30Q.SLIDE_OUT;
                    valueAnimator2.addUpdateListener(new C130425un(this));
                    this.A04.addListener(new C130435uo(c30q3, this));
                    this.A04.start();
                }
                int i3 = c30r.A01;
                if (i3 <= 0) {
                    return;
                }
                ValueAnimator duration5 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
                this.A03 = duration5;
                duration5.setStartDelay(i3);
                ValueAnimator valueAnimator3 = this.A03;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener3 = this.A01;
                if (animatorUpdateListener3 == null) {
                    animatorUpdateListener3 = new C48002LLx(this);
                    this.A01 = animatorUpdateListener3;
                }
                valueAnimator3.addUpdateListener(animatorUpdateListener3);
                ValueAnimator valueAnimator4 = this.A03;
                AbstractC87373uv abstractC87373uv = this.A06;
                if (abstractC87373uv == null) {
                    abstractC87373uv = new C46070KaR(this);
                    this.A06 = abstractC87373uv;
                }
                valueAnimator4.addListener(abstractC87373uv);
                valueAnimator = this.A03;
            }
        }
        valueAnimator.start();
    }
}
