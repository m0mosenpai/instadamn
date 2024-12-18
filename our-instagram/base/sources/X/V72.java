package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.List;

/* loaded from: classes11.dex */
public final class V72 extends C5RU {
    public C66646URk A00;
    public int A01;
    public W5A A02;
    public C66303U8b A03;
    public C6S5 A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final int A08;
    public final Context A09;
    public final Typeface A0A;
    public final Interpolator A0B = new DecelerateInterpolator(2.0f);
    public final C70076W1t A0C;
    public final Integer A0D;
    public final Integer A0E;

    @Override // X.C5RU
    public final void A08(C66646URk c66646URk) {
        C14360o3.A0B(c66646URk, 0);
        if (!C14360o3.A0K(this.A00, c66646URk)) {
            this.A00 = c66646URk;
            A01(c66646URk.A07);
        }
    }

    @Override // X.C5RU
    public final void A09(C6S5 c6s5) {
        C14360o3.A0B(c6s5, 0);
        this.A04 = c6s5;
        A00();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        C14360o3.A0B(canvas, 0);
        W5A w5a = this.A02;
        String str = "phraseProgressCalculator";
        if (w5a != null) {
            int i = w5a.A01;
            if (i != -1) {
                Integer num = w5a.A02;
                if (num != null) {
                    if (num == C05F.A01) {
                        f = 0.0f;
                    } else {
                        f = w5a.A00;
                    }
                    float interpolation = this.A0B.getInterpolation(f);
                    C66303U8b c66303U8b = this.A03;
                    str = "scrollableLyricsDrawable";
                    if (c66303U8b != null) {
                        int A03 = c66303U8b.A03(i);
                        if (this.A03 != null) {
                            int A02 = (int) AbstractC13600mm.A02(interpolation, 0.0f, 1.0f, A03, r1.A03(i + 1));
                            C66303U8b c66303U8b2 = this.A03;
                            if (c66303U8b2 != null) {
                                c66303U8b2.A04(A02);
                                C66303U8b c66303U8b3 = this.A03;
                                if (c66303U8b3 != null) {
                                    c66303U8b3.draw(canvas);
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        C66303U8b c66303U8b = this.A03;
        if (c66303U8b == null) {
            C14360o3.A0F("scrollableLyricsDrawable");
            throw C00O.createAndThrow();
        }
        c66303U8b.setBounds(rect);
    }

    private final void A00() {
        Paint paint;
        C66303U8b c66303U8b = this.A03;
        if (c66303U8b != null) {
            c66303U8b.A05(WF8.A01(this.A04, this.A01));
            C66303U8b c66303U8b2 = this.A03;
            if (c66303U8b2 != null) {
                Integer A03 = WF8.A03(this.A04, this.A01);
                if (A03 != null) {
                    paint = new Paint();
                    paint.setColor(A03.intValue());
                } else {
                    paint = null;
                }
                c66303U8b2.A0D = paint;
                c66303U8b2.invalidateSelf();
                return;
            }
        }
        C14360o3.A0F("scrollableLyricsDrawable");
        throw C00O.createAndThrow();
    }

    private final void A01(List list) {
        int A01;
        Paint paint;
        C70076W1t c70076W1t = this.A0C;
        AbstractC167017dG.A1N(list, c70076W1t);
        C70992Wm8 c70992Wm8 = new C70992Wm8(c70076W1t, list);
        W5A w5a = new W5A(c70992Wm8, 0, 0, 750);
        this.A02 = w5a;
        w5a.A02(0);
        C66303U8b c66303U8b = this.A03;
        Rect rect = null;
        if (c66303U8b != null) {
            rect = c66303U8b.getBounds();
        }
        float f = this.A05;
        C66303U8b c66303U8b2 = new C66303U8b(c70992Wm8, f, (int) (0.25f * f), false);
        this.A03 = c66303U8b2;
        if (c66303U8b2.A08 != 3) {
            c66303U8b2.A08 = 3;
            C66303U8b.A01(c66303U8b2);
        }
        C66303U8b c66303U8b3 = this.A03;
        if (c66303U8b3 != null) {
            Typeface typeface = this.A0A;
            TextPaint textPaint = c66303U8b3.A0I;
            textPaint.setTypeface(typeface);
            textPaint.setFakeBoldText(false);
            c66303U8b3.A06 = VW9.A00(textPaint);
            c66303U8b3.invalidateSelf();
            C66303U8b c66303U8b4 = this.A03;
            if (c66303U8b4 != null) {
                TextPaint textPaint2 = c66303U8b4.A0I;
                textPaint2.setTextSize(f);
                c66303U8b4.A06 = VW9.A00(textPaint2);
                c66303U8b4.invalidateSelf();
                C66303U8b c66303U8b5 = this.A03;
                if (c66303U8b5 != null) {
                    Integer num = this.A0E;
                    if (num != null) {
                        A01 = num.intValue();
                    } else {
                        A01 = WF8.A01(this.A04, this.A01);
                    }
                    c66303U8b5.A05(A01);
                    C66303U8b c66303U8b6 = this.A03;
                    if (c66303U8b6 != null) {
                        Integer num2 = this.A0D;
                        if (num2 == null && (num2 = WF8.A03(this.A04, this.A01)) == null) {
                            paint = null;
                        } else {
                            paint = new Paint();
                            paint.setColor(num2.intValue());
                        }
                        c66303U8b6.A0D = paint;
                        c66303U8b6.invalidateSelf();
                        C66303U8b c66303U8b7 = this.A03;
                        if (c66303U8b7 != null) {
                            int i = (int) this.A06;
                            int i2 = (int) this.A07;
                            c66303U8b7.A05 = i;
                            c66303U8b7.A0C = i2;
                            c66303U8b7.invalidateSelf();
                            C66303U8b c66303U8b8 = this.A03;
                            if (c66303U8b8 != null) {
                                c66303U8b8.A02 = 0.5f;
                                c66303U8b8.invalidateSelf();
                                C66303U8b c66303U8b9 = this.A03;
                                if (c66303U8b9 != null) {
                                    c66303U8b9.A03 = 0.85f;
                                    c66303U8b9.invalidateSelf();
                                    if (rect != null) {
                                        C66303U8b c66303U8b10 = this.A03;
                                        if (c66303U8b10 != null) {
                                            c66303U8b10.setBounds(rect);
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F("scrollableLyricsDrawable");
        throw C00O.createAndThrow();
    }

    @Override // X.C5RU
    public final int A04() {
        return this.A01;
    }

    @Override // X.C5RU
    public final C66646URk A05() {
        return this.A00;
    }

    @Override // X.C5RU
    public final C6S5 A06() {
        return this.A04;
    }

    @Override // X.C5RU
    public final void A07(int i) {
        this.A01 = i;
        A00();
    }

    @Override // X.C5RR
    public final /* bridge */ /* synthetic */ C5NL C0T() {
        return this.A00;
    }

    @Override // X.C5RQ
    public final void EUp(int i, int i2) {
        W5A w5a = this.A02;
        if (w5a == null) {
            C14360o3.A0F("phraseProgressCalculator");
            throw C00O.createAndThrow();
        }
        w5a.A02(i);
        invalidateSelf();
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return this.A00.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C66303U8b c66303U8b = this.A03;
        if (c66303U8b == null) {
            C14360o3.A0F("scrollableLyricsDrawable");
            throw C00O.createAndThrow();
        }
        return (c66303U8b.A06 * 9) + (c66303U8b.A0G * 2) + (((int) this.A07) * 2 * 3);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A08 + ((int) (this.A06 * 2.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C66303U8b c66303U8b = this.A03;
        if (c66303U8b == null) {
            C14360o3.A0F("scrollableLyricsDrawable");
            throw C00O.createAndThrow();
        }
        c66303U8b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C66303U8b c66303U8b = this.A03;
        if (c66303U8b == null) {
            C14360o3.A0F("scrollableLyricsDrawable");
            throw C00O.createAndThrow();
        }
        c66303U8b.setColorFilter(colorFilter);
    }

    public V72(Context context, C66646URk c66646URk, C70076W1t c70076W1t) {
        int A00;
        int A002;
        this.A09 = context;
        int A003 = (int) AbstractC13880nE.A00(context, 300.0f);
        this.A08 = A003;
        float A004 = AbstractC13880nE.A00(context, 29.0f);
        this.A05 = A004;
        this.A07 = AbstractC13880nE.A00(context, 4.0f);
        this.A06 = AbstractC13880nE.A00(context, 16.0f);
        Typeface A02 = AbstractC15960qq.A00(context).A02(EnumC15950qp.A0z);
        this.A0A = A02;
        this.A04 = c66646URk.A03;
        this.A01 = c66646URk.A00;
        this.A0E = c66646URk.A05;
        this.A0D = c66646URk.A04;
        if (c70076W1t != null) {
            A00 = c70076W1t.A00;
            A002 = c70076W1t.A01;
        } else {
            A00 = WF8.A00(A02, A004, A003, 3);
            A002 = WF8.A00(A02, A004, A003, 3);
        }
        this.A0C = new C70076W1t(A002, A00);
        A01(c66646URk.A07);
        this.A00 = c66646URk;
    }
}
