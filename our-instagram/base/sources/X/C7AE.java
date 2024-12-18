package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7AE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7AE extends Drawable {
    public float A01;
    public int A02;
    public int A04;
    public StaticLayout A05;
    public CharSequence A06;
    public CharSequence A07;
    public final ValueAnimator A0A;
    public final Context A0B;
    public final TextPaint A0C;
    public final TextPaint A0D;
    public final InterfaceC16820sZ A0J;
    public final boolean A0K;
    public final float A0L;
    public final float A0M;
    public final int A0N;
    public final UserSession A0O;
    public final boolean A0P;
    public final HashMap A0F = new HashMap();
    public List A08 = C16930sl.A00;
    public Map A09 = AbstractC06930Yk.A0E();
    public final HashMap A0G = new HashMap();
    public final HashMap A0H = new HashMap();
    public final String A0E = " • ";
    public final InterfaceC09390do A0I = C1XM.A00(new C206949Dz(this, 41));
    public int A03 = -1;
    public float A00 = 1.0f;

    public C7AE(Context context, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        this.A0B = context;
        this.A0J = interfaceC16820sZ;
        this.A0O = userSession;
        this.A0L = AbstractC13880nE.A04(context, 12);
        this.A0M = AbstractC13880nE.A04(context, 3);
        this.A0P = AbstractC13620mo.A02(context);
        this.A0N = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text));
        this.A0K = C18U.A06(C06090Tz.A05, userSession, 36328959398526876L);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(2900L);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.7AF
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float A02;
                C7AE c7ae = C7AE.this;
                if (c7ae.A04 == 0) {
                    A02 = 1.0f;
                } else {
                    ValueAnimator valueAnimator2 = c7ae.A0A;
                    float duration = 400.0f / ((float) valueAnimator2.getDuration());
                    Object animatedValue = valueAnimator2.getAnimatedValue();
                    C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    A02 = AbstractC13600mm.A02(((Number) animatedValue).floatValue(), 0.0f, duration, 0.0f, 1.0f);
                }
                if (A02 != c7ae.A00) {
                    c7ae.A00 = A02;
                    c7ae.invalidateSelf();
                }
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: X.7AG
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
                C7AE c7ae = C7AE.this;
                int i = c7ae.A04 + 1;
                c7ae.A04 = i;
                if (i == c7ae.A0A.getRepeatCount()) {
                    c7ae.A0J.invoke();
                }
                c7ae.A03 = (c7ae.A03 + 1) % c7ae.A08.size();
            }
        });
        this.A0A = ofFloat;
        TextPaint textPaint = new TextPaint();
        A02(textPaint, false);
        this.A0D = textPaint;
        TextPaint textPaint2 = new TextPaint();
        A02(textPaint2, true);
        this.A0C = textPaint2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        C14360o3.A0B(canvas, 0);
        int height = getBounds().height();
        float width = getBounds().width();
        float f2 = height - this.A0M;
        CharSequence charSequence = this.A07;
        float f3 = 0.0f;
        if (charSequence != null) {
            boolean z = this.A0P;
            if (z) {
                f = width - 0.0f;
            } else {
                f = 0.0f;
            }
            if (this.A0K) {
                StaticLayout staticLayout = this.A05;
                if (staticLayout == null) {
                    staticLayout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.A0C, this.A02).setEllipsize(TextUtils.TruncateAt.END).setMaxLines(1).build();
                    C14360o3.A07(staticLayout);
                    this.A05 = staticLayout;
                }
                canvas.save();
                canvas.translate(f, 0.0f);
                staticLayout.draw(canvas);
                canvas.restore();
            } else {
                CharSequence charSequence2 = this.A06;
                if (charSequence2 == null) {
                    charSequence2 = TextUtils.ellipsize(charSequence, this.A0C, this.A02, TextUtils.TruncateAt.END);
                    this.A06 = charSequence2;
                    C14360o3.A0A(charSequence2);
                }
                canvas.drawText(charSequence2, 0, charSequence2.length(), f, f2, this.A0C);
            }
            f3 = 0.0f + this.A01;
            if (!this.A08.isEmpty()) {
                TextPaint textPaint = this.A0D;
                textPaint.setAlpha(255);
                textPaint.setColor(this.A0N);
                float floatValue = this.A01 - ((Number) this.A0I.getValue()).floatValue();
                String str = this.A0E;
                if (z) {
                    floatValue = width - floatValue;
                }
                canvas.drawText(str, floatValue, f2, textPaint);
            }
        }
        if (!this.A08.isEmpty()) {
            if (this.A0P) {
                f3 = width - f3;
            }
            if (this.A08.size() > 1) {
                float f4 = this.A00;
                if (f4 > 0.0f && f4 < 1.0f) {
                    TextPaint textPaint2 = this.A0D;
                    textPaint2.setAlpha((int) ((1.0f - f4) * 255.0f));
                    int i = this.A03;
                    if (i == 0) {
                        i = this.A08.size();
                    }
                    int A00 = A00(i - 1);
                    List list = this.A08;
                    int i2 = this.A03;
                    if (i2 == 0) {
                        i2 = list.size();
                    }
                    CharSequence charSequence3 = (CharSequence) list.get(i2 - 1);
                    textPaint2.setColor(A00);
                    A01(canvas, charSequence3, f3, f2, (-f2) * this.A00);
                }
            }
            TextPaint textPaint3 = this.A0D;
            textPaint3.setAlpha((int) (this.A00 * 255.0f));
            textPaint3.setColor(A00(this.A03));
            A01(canvas, (CharSequence) this.A08.get(this.A03), f3, f2, f2 * (1.0f - this.A00));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        if (rect.width() != this.A02) {
            this.A0F.clear();
            this.A0H.clear();
            this.A06 = null;
            this.A05 = null;
            this.A02 = rect.width();
        }
    }

    private final int A00(int i) {
        Number number = (Number) this.A09.get(Integer.valueOf(i));
        if (number != null) {
            HashMap hashMap = this.A0G;
            Object obj = hashMap.get(number);
            if (obj == null) {
                Context context = this.A0B;
                obj = Integer.valueOf(context.getColor(AbstractC53242c7.A0H(context, number.intValue())));
                hashMap.put(number, obj);
            }
            return ((Number) obj).intValue();
        }
        return this.A0N;
    }

    private final void A01(Canvas canvas, CharSequence charSequence, float f, float f2, float f3) {
        if (this.A0K) {
            if (this.A01 < this.A02) {
                HashMap hashMap = this.A0H;
                Object obj = hashMap.get(charSequence);
                if (obj == null) {
                    obj = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.A0D, (int) (this.A02 - this.A01)).setEllipsize(TextUtils.TruncateAt.END).setMaxLines(1).build();
                    C14360o3.A07(obj);
                    hashMap.put(charSequence, obj);
                }
                Layout layout = (Layout) obj;
                if (layout != null) {
                    canvas.save();
                    canvas.translate(f, f3);
                    layout.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            }
            return;
        }
        HashMap hashMap2 = this.A0F;
        CharSequence charSequence2 = (CharSequence) hashMap2.get(charSequence);
        if (charSequence2 == null) {
            charSequence2 = TextUtils.ellipsize(charSequence, this.A0D, this.A02 - this.A01, TextUtils.TruncateAt.END);
            hashMap2.put(charSequence, charSequence2);
            C14360o3.A0A(charSequence2);
        }
        canvas.drawText(charSequence2, 0, charSequence2.length(), f, f2 + f3, this.A0D);
    }

    private final void A02(TextPaint textPaint, boolean z) {
        Paint.Align align;
        textPaint.setColor(this.A0N);
        textPaint.setTextSize(this.A0L);
        textPaint.setAntiAlias(true);
        textPaint.setFakeBoldText(z);
        textPaint.setStyle(Paint.Style.FILL);
        if (this.A0P) {
            align = Paint.Align.RIGHT;
        } else {
            align = Paint.Align.LEFT;
        }
        textPaint.setTextAlign(align);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0D.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0D.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (visible) {
            this.A03 = 0;
            this.A04 = 0;
            if (isVisible()) {
                if (this.A08.size() > 1) {
                    ValueAnimator valueAnimator = this.A0A;
                    if (!valueAnimator.isRunning()) {
                        valueAnimator.start();
                    }
                }
            } else if (!isVisible()) {
                this.A0A.cancel();
                this.A04 = 0;
                return visible;
            }
        }
        return visible;
    }
}
