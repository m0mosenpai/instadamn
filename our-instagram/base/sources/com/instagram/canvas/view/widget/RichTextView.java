package com.instagram.canvas.view.widget;

import X.A3P;
import X.AbstractC13880nE;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AnonymousClass010;
import X.C14360o3;
import X.C69098Vho;
import X.C70667Wen;
import X.C70668Weo;
import X.EnumC72372Xc8;
import X.X8B;
import X.X8C;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.Map;

/* loaded from: classes11.dex */
public final class RichTextView extends TextView {
    public final void setText(X8B x8b) {
        EnumC72372Xc8 enumC72372Xc8;
        Object styleSpan;
        C14360o3.A0B(x8b, 0);
        C70667Wen c70667Wen = (C70667Wen) x8b;
        SpannableString spannableString = new SpannableString(c70667Wen.A00);
        for (C69098Vho c69098Vho : c70667Wen.A01) {
            if (c69098Vho != null && (enumC72372Xc8 = c69098Vho.A02) != null) {
                int ordinal = enumC72372Xc8.ordinal();
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                styleSpan = new StrikethroughSpan();
                            }
                        } else {
                            styleSpan = new UnderlineSpan();
                        }
                    } else {
                        styleSpan = new StyleSpan(2);
                    }
                } else {
                    styleSpan = new StyleSpan(1);
                }
                int i = c69098Vho.A01;
                spannableString.setSpan(styleSpan, i, c69098Vho.A00 + i, 0);
            }
        }
        setText(spannableString);
    }

    public final void setTextDescriptor(X8C x8c) {
        float lineHeight;
        Float A0n;
        Typeface typeface;
        C14360o3.A0B(x8c, 0);
        C70668Weo c70668Weo = (C70668Weo) x8c;
        setTextColor(c70668Weo.A01);
        String str = c70668Weo.A02;
        if (str != null) {
            Map map = A3P.A00;
            if (!map.containsKey(str) || (typeface = (Typeface) map.get(str)) == null) {
                typeface = Typeface.DEFAULT;
            }
            C14360o3.A0A(typeface);
            setTypeface(typeface);
        }
        String str2 = c70668Weo.A03;
        if (str2 != null && (A0n = AnonymousClass010.A0n(str2)) != null) {
            setTextSize(2, A0n.floatValue());
        }
        int i = c70668Weo.A00;
        if (i <= 0) {
            setMaxLines(Integer.MAX_VALUE);
            setSingleLine(false);
        } else {
            if (i == 1) {
                setSingleLine(true);
            } else {
                setMaxLines(i);
            }
            setEllipsize(TextUtils.TruncateAt.END);
        }
        String str3 = c70668Weo.A04;
        if (str3 != null) {
            Context A0L = AbstractC166997dE.A0L(this);
            int parseInt = Integer.parseInt(str3);
            RectF rectF = AbstractC13880nE.A01;
            int i2 = (int) ((parseInt * AbstractC167007dF.A0K(A0L).scaledDensity) + 0.5f);
            if (i2 <= 0) {
                lineHeight = 0.0f;
            } else {
                lineHeight = i2 - (getLineHeight() - ((int) getLineSpacingExtra()));
            }
            setLineSpacing(lineHeight, 1.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC167017dG.A1P(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC167017dG.A1P(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichTextView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }
}
