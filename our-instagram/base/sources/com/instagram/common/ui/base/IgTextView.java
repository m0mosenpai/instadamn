package com.instagram.common.ui.base;

import X.AbstractC111324zv;
import X.AbstractC13620mo;
import X.AbstractC14710oj;
import X.AbstractC55922hc;
import X.AbstractC56862jK;
import X.AbstractC56872jL;
import X.AbstractC56922jQ;
import X.AbstractC56952jT;
import X.AbstractC692839o;
import X.AnonymousClass001;
import X.C05F;
import X.C0fO;
import X.C0s6;
import X.C0w9;
import X.C106424qw;
import X.C13680mu;
import X.C14360o3;
import X.C14640oc;
import X.C2UX;
import X.InterfaceC56852jJ;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.facebook.systrace.Systrace;

/* loaded from: classes2.dex */
public class IgTextView extends TextView implements InterfaceC56852jJ {
    public boolean A00;
    public int A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
        this.A00 = true;
        this.A01 = Integer.MAX_VALUE;
        A00(context, attributeSet, i, i2);
    }

    private final void A00(Context context, AttributeSet attributeSet, int i, int i2) {
        Typeface A02;
        int i3;
        Typeface A022;
        int[] iArr = AbstractC55922hc.A1K;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C14360o3.A07(obtainStyledAttributes);
        int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            setContentDescription(context.getText(resourceId));
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            setHint(context.getText(resourceId2));
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId3 != 0) {
            setImeActionLabel(context.getText(resourceId3), getImeActionId());
        }
        int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId4 != 0) {
            setText(context.getText(resourceId4));
        }
        String A00 = AbstractC56922jQ.A00(context, obtainStyledAttributes, 5);
        boolean z = true;
        if (A00 != null) {
            Typeface typeface = getTypeface();
            if (typeface == null || !typeface.isBold()) {
                z = false;
            }
            if (AbstractC14710oj.A08()) {
                if (Systrace.A0E(1L)) {
                    C0fO.A01(AbstractC111324zv.A00(316), 499709023);
                }
                int intValue = AbstractC14710oj.A05(A00, z).intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        A022 = AbstractC14710oj.A00(context);
                    } else {
                        A022 = AbstractC14710oj.A01(context);
                    }
                } else {
                    A022 = AbstractC14710oj.A02(context);
                }
                setTypeface(A022);
                if (Systrace.A0E(1L)) {
                    i3 = -1260780919;
                    C0fO.A00(i3);
                }
            }
        } else {
            Typeface typeface2 = getTypeface();
            Typeface typeface3 = getTypeface();
            if (typeface3 == null || !typeface3.isBold()) {
                z = false;
            }
            if (AbstractC14710oj.A08()) {
                if (Systrace.A0E(1L)) {
                    C0fO.A01(AbstractC111324zv.A00(316), 2099797886);
                }
                int intValue2 = AbstractC14710oj.A04(typeface2, z).intValue();
                if (intValue2 != 0) {
                    if (intValue2 != 1) {
                        A02 = AbstractC14710oj.A00(context);
                    } else {
                        A02 = AbstractC14710oj.A01(context);
                    }
                } else {
                    A02 = AbstractC14710oj.A02(context);
                }
                setTypeface(A02);
                if (Systrace.A0E(1L)) {
                    i3 = 64468130;
                    C0fO.A00(i3);
                }
            }
        }
        if (!obtainStyledAttributes.hasValue(2) && C14640oc.A0F()) {
            setIncludeFontPadding(false);
        }
        obtainStyledAttributes.recycle();
        if (C2UX.A01) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            C14360o3.A07(obtainStyledAttributes2);
            boolean z2 = false;
            if (obtainStyledAttributes2.hasValue(6)) {
                z2 = obtainStyledAttributes2.getBoolean(6, false);
            }
            this.A00 = z2;
            obtainStyledAttributes2.recycle();
        }
        if (AbstractC13620mo.A01()) {
            if (getTextAlignment() == 0) {
                setTextAlignment(1);
            }
            if (getTextDirection() == 0 || getTextDirection() == 1) {
                setTextDirection(5);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        try {
            super.onDraw(canvas);
        } catch (IndexOutOfBoundsException e) {
            CharSequence text = getText();
            C14360o3.A07(text);
            if (!C13680mu.A06(this, text)) {
                throw e;
            }
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C14360o3.A0B(bufferType, 1);
        if (this.A00) {
            charSequence = AbstractC692839o.A00(this, charSequence);
        }
        if (AbstractC56862jK.A01(getContext(), true) && (charSequence instanceof Spanned)) {
            CharSequence charSequence2 = charSequence;
            C14360o3.A0B(charSequence, 0);
            C106424qw[] c106424qwArr = (C106424qw[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), C106424qw.class);
            if (c106424qwArr.length != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                C0s6 c0s6 = new C0s6(c106424qwArr);
                while (c0s6.hasNext()) {
                    C106424qw c106424qw = (C106424qw) c0s6.next();
                    String str = c106424qw.A00;
                    if (str != null && str.length() != 0) {
                        spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c106424qw), spannableStringBuilder.getSpanEnd(c106424qw), (CharSequence) str);
                    }
                }
                charSequence2 = spannableStringBuilder.toString();
                C14360o3.A07(charSequence2);
            }
            if (!charSequence2.equals(getContentDescription())) {
                setContentDescription(charSequence2.toString());
            }
        }
        if (Build.VERSION.SDK_INT >= 34 && ((Boolean) AbstractC56872jL.A01.getValue()).booleanValue()) {
            setLayerType(1, null);
        }
        super.setText(charSequence, bufferType);
    }

    private final void setAndSanityCheckMaximum(int i) {
        if (i < 0) {
            C0w9.A01.EmN("IgTextView.sanityCheckMaximum", AnonymousClass001.A0O("Invalid maximum: ", i));
        }
        this.A01 = i;
    }

    @Override // android.widget.TextView
    public int getExtendedPaddingTop() {
        try {
            return super.getExtendedPaddingTop();
        } catch (ArrayIndexOutOfBoundsException e) {
            C0w9.A01.EmT("IgTextView.getExtendedPaddingTop", AnonymousClass001.A0O("Debug info: mMaximum=", this.A01), 1, e);
            throw e;
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        super.setLines(i);
        setAndSanityCheckMaximum(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        super.setMaxLines(i);
        setAndSanityCheckMaximum(i);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        Integer num;
        super.setOnClickListener(onClickListener);
        if (AbstractC56862jK.A01(getContext(), true)) {
            Integer A00 = AbstractC56952jT.A00(this);
            if (onClickListener != null) {
                if (A00 == C05F.A00) {
                    num = C05F.A01;
                } else {
                    return;
                }
            } else if (A00 != C05F.A01) {
                return;
            } else {
                num = C05F.A00;
            }
            AbstractC56952jT.A04(this, num);
        }
    }

    @Override // X.InterfaceC56852jJ
    public void setTransformText(boolean z) {
        this.A00 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = true;
        this.A01 = Integer.MAX_VALUE;
        A00(context, attributeSet, i, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A00 = true;
        this.A01 = Integer.MAX_VALUE;
        A00(context, attributeSet, 0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgTextView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A00 = true;
        this.A01 = Integer.MAX_VALUE;
        A00(context, null, 0, 0);
    }
}
