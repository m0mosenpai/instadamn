package com.instagram.ui.widget.expandingtextview;

import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC43594JPz;
import X.AbstractC55922hc;
import X.AbstractC56922jQ;
import X.C0f9;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Html;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.instagram.common.ui.base.IgTextView;
import java.text.BreakIterator;

/* loaded from: classes8.dex */
public class EllipsizingTextView extends IgTextView {
    public int A00;
    public CharSequence A01;
    public CharSequence A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public int A06;
    public boolean A07;
    public boolean A08;

    private void A01(Context context, AttributeSet attributeSet) {
        CharSequence charSequence;
        super.setEllipsize(null);
        AbstractC25227BEk.A11(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A0U);
        this.A03 = obtainStyledAttributes.getBoolean(2, true);
        if (this.A00 == 0) {
            this.A00 = Integer.MAX_VALUE;
        }
        this.A04 = obtainStyledAttributes.getBoolean(3, false);
        this.A05 = obtainStyledAttributes.getBoolean(4, false);
        if (obtainStyledAttributes.getString(0) != null) {
            String A00 = AbstractC56922jQ.A00(context, obtainStyledAttributes, 0);
            if (A00 == null) {
                A00 = "";
            }
            charSequence = Html.fromHtml(A00);
        } else {
            charSequence = "…";
        }
        this.A01 = charSequence;
        int color = obtainStyledAttributes.getColor(1, getCurrentTextColor());
        if (color != getCurrentTextColor()) {
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(this.A01);
            A0H.setSpan(new ForegroundColorSpan(color), 0, this.A01.length(), 17);
            this.A01 = A0H;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }

    public CharSequence getFullText() {
        return this.A02;
    }

    @Override // android.widget.TextView
    public int getMaxLines() {
        return this.A00;
    }

    public EllipsizingTextView(Context context) {
        super(context);
        this.A02 = "";
        A01(context, null);
    }

    private StaticLayout A00(CharSequence charSequence) {
        return new StaticLayout(charSequence, getPaint(), AbstractC43594JPz.A08(this, getMeasuredWidth()), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int lastIndexOf;
        int previous;
        CharSequence charSequence;
        int i3;
        int A06 = C0f9.A06(1573248470);
        super.onMeasure(i, i2);
        if (this.A08 || this.A06 != getMeasuredWidth()) {
            this.A07 = true;
            CharSequence charSequence2 = this.A02;
            StaticLayout A00 = A00(charSequence2);
            int lineCount = A00.getLineCount();
            int i4 = this.A00;
            if (lineCount > i4) {
                charSequence2 = this.A02.subSequence(0, A00.getLineEnd(i4 - 1));
                if (this.A03 || charSequence2.charAt(charSequence2.length() - 1) != '\n') {
                    while (!TextUtils.isEmpty(charSequence2) && Character.isWhitespace(charSequence2.charAt(charSequence2.length() - 1))) {
                        charSequence2 = charSequence2.subSequence(0, charSequence2.length() - 1);
                    }
                    if (this.A05) {
                        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(charSequence2);
                        loop1: while (true) {
                            charSequence2 = AbstractC25225BEi.A0H(A0H).append(this.A01);
                            while (A00(charSequence2).getLineCount() > this.A00) {
                                if (A0H.length() > 1) {
                                    break;
                                }
                            }
                            A0H.delete(A0H.length() - 1, A0H.length());
                        }
                    } else {
                        if (this.A04) {
                            CharSequence charSequence3 = charSequence2;
                            if (charSequence2 == null) {
                                charSequence3 = "";
                            }
                            BreakIterator wordInstance = BreakIterator.getWordInstance();
                            wordInstance.setText(charSequence3.toString());
                            wordInstance.last();
                            while (A00(TextUtils.concat(charSequence2, this.A01)).getLineCount() > this.A00) {
                                while (true) {
                                    previous = wordInstance.previous();
                                    if (previous != -1) {
                                        if (!(!Character.isLetterOrDigit(charSequence3.charAt(previous))) || (previous - 1 != -1 && (!Character.isLetterOrDigit(charSequence3.charAt(i3))))) {
                                        }
                                    } else {
                                        charSequence = "";
                                        break;
                                    }
                                }
                                charSequence = charSequence3.subSequence(0, previous);
                                if (TextUtils.isEmpty(charSequence)) {
                                    break;
                                } else {
                                    charSequence2 = charSequence;
                                }
                            }
                        } else {
                            while (A00(TextUtils.concat(charSequence2, this.A01)).getLineCount() > this.A00 && (lastIndexOf = charSequence2.toString().lastIndexOf(32)) != -1) {
                                charSequence2 = charSequence2.subSequence(0, lastIndexOf);
                                while (!TextUtils.isEmpty(charSequence2) && Character.isWhitespace(charSequence2.charAt(charSequence2.length() - 1))) {
                                    charSequence2 = charSequence2.subSequence(0, charSequence2.length() - 1);
                                }
                            }
                        }
                        charSequence2 = TextUtils.concat(charSequence2, this.A01);
                    }
                }
            }
            setText(charSequence2, TextView.BufferType.SPANNABLE);
            this.A07 = false;
            this.A08 = false;
            this.A06 = getMeasuredWidth();
            super.onMeasure(i, i2);
        }
        C0f9.A0D(751669498, A06);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (!this.A07) {
            this.A02 = charSequence;
            this.A08 = true;
            requestLayout();
        }
    }

    @Override // com.instagram.common.ui.base.IgTextView, android.widget.TextView
    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.A00 = i;
        this.A08 = true;
        requestLayout();
    }

    public EllipsizingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = "";
        A01(context, attributeSet);
    }

    public EllipsizingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = "";
        A01(context, attributeSet);
    }
}
