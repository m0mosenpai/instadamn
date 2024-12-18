package com.instagram.direct.ui.countertextview;

import X.AbstractC14710oj;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC31173DnH;
import X.AbstractC43592JPx;
import X.AbstractC55922hc;
import X.AbstractC56922jQ;
import X.C0f9;
import X.C14360o3;
import X.C65759TtZ;
import X.C68973VfB;
import X.C69576Vrf;
import X.C69729VuO;
import X.EnumC68122VCg;
import X.EnumC68123VCh;
import X.MSY;
import X.RunnableC71352WsN;
import X.U5Q;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class CounterTextView extends View {
    public Paint A00;
    public Shader A01;
    public String A02;
    public int[] A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public EnumC68123VCh A08;
    public C68973VfB A09;
    public final C69576Vrf A0A;
    public final Runnable A0B;
    public final ValueAnimator A0C;
    public final Paint A0D;
    public final Rect A0E;
    public final ArrayList A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CounterTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        TextPaint textPaint = new TextPaint(1);
        this.A0D = textPaint;
        Paint paint = new Paint(1);
        AbstractC166997dE.A1D(paint, PorterDuff.Mode.SRC_IN);
        this.A00 = paint;
        this.A0A = new C69576Vrf(textPaint);
        this.A0E = new Rect();
        this.A08 = EnumC68123VCh.A02;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f);
        C14360o3.A07(ofFloat);
        this.A0C = ofFloat;
        this.A0B = new RunnableC71352WsN(this);
        this.A0F = new ArrayList();
        A01(context, attributeSet, i);
    }

    private final void A01(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A0O, i, 0);
        C14360o3.A07(obtainStyledAttributes);
        setTextColor(obtainStyledAttributes.getColor(1, AbstractC167007dF.A09(context, R.attr.igds_color_primary_text)));
        setTextSize(obtainStyledAttributes.getDimension(0, context.getResources().getDimension(R.dimen.abc_text_size_menu_header_material)));
        String A00 = AbstractC56922jQ.A00(context, obtainStyledAttributes, 2);
        if (A00 != null) {
            setFontFamily(A00);
        }
        obtainStyledAttributes.recycle();
        ValueAnimator valueAnimator = this.A0C;
        C65759TtZ.A00(valueAnimator, this, 16);
        AbstractC43592JPx.A1B(valueAnimator);
        valueAnimator.setDuration(500L);
        U5Q.A00(valueAnimator, this, 22);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        canvas.save();
        Rect rect = this.A0E;
        int width = rect.width();
        int height = rect.height();
        float currentWidth = rect.left + ((width - getCurrentWidth()) / 2.0f);
        float f = rect.top;
        float f2 = height;
        C69576Vrf c69576Vrf = this.A0A;
        canvas.translate(currentWidth, f + ((f2 - c69576Vrf.A00) / 2.0f));
        canvas.clipRect(0.0f, 0.0f, getCurrentWidth(), c69576Vrf.A00);
        Paint paint = this.A0D;
        canvas.translate(0.0f, -paint.getFontMetrics().top);
        ArrayList arrayList = this.A0F;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C69729VuO c69729VuO = (C69729VuO) AbstractC31173DnH.A0i(arrayList, i);
            char[] cArr = c69729VuO.A0C;
            if (cArr != null) {
                int i2 = c69729VuO.A08;
                float f3 = c69729VuO.A02;
                if (i2 >= 0 && i2 < cArr.length) {
                    canvas.drawText(cArr, i2, 1, 0.0f, f3, paint);
                    i2 = c69729VuO.A08;
                    if (i2 >= 0) {
                        c69729VuO.A00 = cArr[i2];
                    }
                    f3 = c69729VuO.A02;
                    c69729VuO.A03 = f3;
                }
                int i3 = i2 + 1;
                C69576Vrf c69576Vrf2 = c69729VuO.A0D;
                float f4 = f3 - c69576Vrf2.A00;
                if (i3 >= 0 && i3 < cArr.length) {
                    canvas.drawText(cArr, i3, 1, 0.0f, f4, paint);
                }
                int i4 = c69729VuO.A08 - 1;
                float f5 = c69729VuO.A02 + c69576Vrf2.A00;
                if (i4 >= 0 && i4 < cArr.length) {
                    canvas.drawText(cArr, i4, 1, 0.0f, f5, paint);
                }
                c69729VuO.A00();
                canvas.translate(c69729VuO.A04, 0.0f);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        canvas.restore();
        Paint paint2 = this.A00;
        if (paint2.getShader() != null) {
            canvas.drawPaint(paint2);
        }
    }

    public final void setAnimationStyle(EnumC68123VCh enumC68123VCh) {
        C14360o3.A0B(enumC68123VCh, 0);
        this.A08 = enumC68123VCh;
        Iterator A13 = AbstractC166997dE.A13(this.A0F);
        while (A13.hasNext()) {
            ((C69729VuO) AbstractC166997dE.A0l(A13)).A0B = enumC68123VCh;
        }
    }

    public final void setFontFamily(String str) {
        C14360o3.A0B(str, 0);
        Paint paint = this.A0D;
        Context context = getContext();
        Integer A05 = AbstractC14710oj.A05(str, false);
        Typeface create = Typeface.create(str, 0);
        C14360o3.A07(create);
        paint.setTypeface(AbstractC14710oj.A03(context, create, A05));
        A00();
    }

    private final void A00() {
        C69576Vrf c69576Vrf = this.A0A;
        Paint paint = c69576Vrf.A01;
        c69576Vrf.A00 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        c69576Vrf.A02.clear();
        A02(this);
        invalidate();
    }

    public static final void A02(CounterTextView counterTextView) {
        boolean z = true;
        boolean A1S = MSY.A1S(counterTextView.A06, ((int) counterTextView.getCurrentWidth()) + counterTextView.getPaddingLeft() + counterTextView.getPaddingRight());
        if (counterTextView.A05 == ((int) counterTextView.A0A.A00) + counterTextView.getPaddingTop() + counterTextView.getPaddingBottom()) {
            z = false;
        }
        if (A1S || z) {
            counterTextView.requestLayout();
        }
    }

    public static final void A03(CounterTextView counterTextView) {
        C68973VfB c68973VfB = counterTextView.A09;
        if (c68973VfB != null && !C14360o3.A0K(c68973VfB.A01, counterTextView.A02)) {
            counterTextView.setTextInternal(c68973VfB.A01, c68973VfB.A00);
            counterTextView.A0C.start();
        }
    }

    public static final void A04(CounterTextView counterTextView) {
        Iterator A13 = AbstractC166997dE.A13(counterTextView.A0F);
        while (A13.hasNext()) {
            C69729VuO c69729VuO = (C69729VuO) AbstractC166997dE.A0l(A13);
            if (c69729VuO.A00 == 0) {
                A13.remove();
            } else {
                c69729VuO.A00();
            }
        }
    }

    public static final void A05(CounterTextView counterTextView, float f) {
        int i;
        float f2;
        float f3;
        float f4;
        float f5;
        Iterator A13 = AbstractC166997dE.A13(counterTextView.A0F);
        while (A13.hasNext()) {
            C69729VuO c69729VuO = (C69729VuO) AbstractC166997dE.A0l(A13);
            int i2 = 1;
            if (f == 1.0f) {
                c69729VuO.A00 = c69729VuO.A01;
                c69729VuO.A03 = 0.0f;
                c69729VuO.A05 = 0.0f;
            }
            float f6 = c69729VuO.A0D.A00;
            int i3 = c69729VuO.A09;
            int i4 = c69729VuO.A0A;
            float abs = ((Math.abs(i3 - i4) * f6) * f) / f6;
            int i5 = (int) abs;
            float f7 = abs - i5;
            float f8 = c69729VuO.A05 * (1.0f - f);
            if (i3 < i4) {
                i2 = -1;
            }
            c69729VuO.A02 = (f7 * f6 * i2) + f8;
            c69729VuO.A08 = i4 + (i5 * i2);
            float f9 = c69729VuO.A06;
            c69729VuO.A04 = f9 + ((c69729VuO.A07 - f9) * f);
        }
        Paint paint = counterTextView.A00;
        if (f <= 0.2f) {
            f2 = 0.0f;
            f3 = 0.2f;
            f4 = 200.0f;
            f5 = 255.0f;
        } else if (f >= 0.8f) {
            f2 = 0.8f;
            f3 = 1.0f;
            f4 = 255.0f;
            f5 = 200.0f;
        } else {
            i = 255;
            paint.setAlpha(i);
        }
        float f10 = f3 - f2;
        float f11 = f5 - f4;
        float f12 = 0.0f;
        if (f10 != 0.0f) {
            f12 = (f - f2) / f10;
        }
        i = (int) ((f12 * f11) + f4);
        paint.setAlpha(i);
    }

    private final float getCurrentWidth() {
        Iterator A13 = AbstractC166997dE.A13(this.A0F);
        float f = 0.0f;
        while (A13.hasNext()) {
            C69729VuO c69729VuO = (C69729VuO) AbstractC166997dE.A0l(A13);
            c69729VuO.A00();
            f += c69729VuO.A04;
        }
        return f;
    }

    private final void setTextInternal(String str, EnumC68122VCg enumC68122VCg) {
        String str2 = this.A02;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (str != null) {
            str3 = str;
        }
        this.A02 = str;
        int length = str2.length() - 1;
        int length2 = str3.length();
        while (true) {
            length2--;
            while (true) {
                if (length < 0) {
                    if (length2 >= 0) {
                        ArrayList arrayList = this.A0F;
                        arrayList.add(0, new C69729VuO(this.A08, this.A0A));
                        ((C69729VuO) arrayList.get(0)).A01(enumC68122VCg, str3.charAt(length2));
                    } else {
                        setContentDescription(str);
                        return;
                    }
                } else {
                    C69729VuO c69729VuO = (C69729VuO) this.A0F.get(length);
                    if (length2 < 0) {
                        c69729VuO.A01(EnumC68122VCg.A02, (char) 0);
                        length--;
                    } else {
                        c69729VuO.A01(enumC68122VCg, str3.charAt(length2));
                        length--;
                        break;
                    }
                }
            }
        }
    }

    public static /* synthetic */ void setTextInternal$default(CounterTextView counterTextView, String str, EnumC68122VCg enumC68122VCg, int i, Object obj) {
        if ((i & 2) != 0) {
            enumC68122VCg = EnumC68122VCg.A03;
        }
        counterTextView.setTextInternal(str, enumC68122VCg);
    }

    public final void A06(int i, String str, boolean z) {
        EnumC68122VCg enumC68122VCg;
        if (!C14360o3.A0K(this.A02, str)) {
            if (z) {
                if (i > this.A07) {
                    enumC68122VCg = EnumC68122VCg.A03;
                } else {
                    enumC68122VCg = EnumC68122VCg.A02;
                }
                this.A09 = new C68973VfB(str, enumC68122VCg);
                if (!this.A0C.isRunning()) {
                    A03(this);
                }
            } else {
                this.A0C.cancel();
                this.A09 = null;
                setTextInternal(str, EnumC68122VCg.A03);
                A05(this, 1.0f);
                A04(this);
                A02(this);
                invalidate();
            }
            this.A07 = i;
        }
    }

    public final String getText() {
        return this.A02;
    }

    public final void setAnimationDuration(long j) {
        this.A0C.setDuration(j);
    }

    public final void setTextColor(int i) {
        this.A0D.setColor(i);
        invalidate();
    }

    public final void setTextSize(float f) {
        if (this.A04 != f) {
            this.A04 = f;
            this.A0D.setTextSize(f);
            A00();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        this.A06 = ((int) getCurrentWidth()) + getPaddingLeft() + getPaddingRight();
        this.A05 = ((int) this.A0A.A00) + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSize(this.A06, i), View.resolveSize(this.A05, i2));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-128270144);
        super.onSizeChanged(i, i2, i3, i4);
        this.A0E.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        int[] iArr = this.A03;
        if (iArr != null) {
            this.A01 = new LinearGradient(0.0f, 0.0f, r4.width(), 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
        C0f9.A0D(985235836, A06);
    }

    public final void setAnimatingShaderColors(int[] iArr) {
        this.A03 = iArr;
    }

    public final void setText(int i) {
        A06(i, String.valueOf(i), true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CounterTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        TextPaint textPaint = new TextPaint(1);
        this.A0D = textPaint;
        Paint paint = new Paint(1);
        AbstractC166997dE.A1D(paint, PorterDuff.Mode.SRC_IN);
        this.A00 = paint;
        this.A0A = new C69576Vrf(textPaint);
        this.A0E = new Rect();
        this.A08 = EnumC68123VCh.A02;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f);
        C14360o3.A07(ofFloat);
        this.A0C = ofFloat;
        this.A0B = new RunnableC71352WsN(this);
        this.A0F = new ArrayList();
        A01(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CounterTextView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        TextPaint textPaint = new TextPaint(1);
        this.A0D = textPaint;
        Paint paint = new Paint(1);
        AbstractC166997dE.A1D(paint, PorterDuff.Mode.SRC_IN);
        this.A00 = paint;
        this.A0A = new C69576Vrf(textPaint);
        this.A0E = new Rect();
        this.A08 = EnumC68123VCh.A02;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f);
        C14360o3.A07(ofFloat);
        this.A0C = ofFloat;
        this.A0B = new RunnableC71352WsN(this);
        this.A0F = new ArrayList();
        A01(context, null, 0);
    }
}
