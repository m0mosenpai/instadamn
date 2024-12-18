package com.instagram.ui.widget.expandingtextview;

import X.AbstractC55922hc;
import X.AbstractC56922jQ;
import X.C57482kN;
import X.EnumC1585079l;
import X.InterfaceC1586279x;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Html;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes3.dex */
public class ExpandingTextView extends TextView {
    public int A00;
    public int A01;
    public CharSequence A02;
    public CharSequence A03;
    public boolean A04;
    public boolean A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public EnumC1585079l A0A;
    public InterfaceC1586279x A0B;
    public CharSequence A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    private void A02(Context context, AttributeSet attributeSet) {
        super.setEllipsize(null);
        setMovementMethod(LinkMovementMethod.getInstance());
        setHighlightColor(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A0Y);
        this.A05 = obtainStyledAttributes.getBoolean(5, true);
        String A00 = AbstractC56922jQ.A00(context, obtainStyledAttributes, 3);
        if (A00 != null) {
            this.A0C = Html.fromHtml(A00);
        } else {
            this.A0C = "…";
        }
        this.A08 = obtainStyledAttributes.getColor(4, getCurrentTextColor());
        A00();
        this.A07 = obtainStyledAttributes.getInteger(2, 10);
        this.A0D = obtainStyledAttributes.getBoolean(0, false);
        this.A06 = obtainStyledAttributes.getInteger(1, 500);
        obtainStyledAttributes.recycle();
        this.A0A = EnumC1585079l.COLLAPSED;
        this.A0B = null;
        int i = this.A01;
        this.A01 = i;
        this.A00 = i;
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }

    private void A00() {
        if (this.A08 != getCurrentTextColor()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A0C);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.A08), 0, this.A0C.length(), 17);
            this.A0C = spannableStringBuilder;
        }
    }

    private void A01(int i) {
        if (this.A0D) {
            setMaxLines(getLineCount());
            if (Math.abs(getLineCount() - i) > 0) {
                ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "maxLines", i);
                ofInt.setDuration(Math.min(this.A07 * r3, this.A06));
                ofInt.start();
                return;
            }
        }
        setMaxLines(i);
    }

    public static void A03(ExpandingTextView expandingTextView) {
        EnumC1585079l enumC1585079l = expandingTextView.A0A;
        EnumC1585079l enumC1585079l2 = EnumC1585079l.EXPANDED;
        if (enumC1585079l == enumC1585079l2) {
            if (expandingTextView.A05) {
                expandingTextView.A01(expandingTextView.A00);
            }
            expandingTextView.A0A = EnumC1585079l.COLLAPSED;
        } else {
            C57482kN textLayoutParams = expandingTextView.getTextLayoutParams();
            CharSequence charSequence = expandingTextView.A03;
            charSequence.getClass();
            expandingTextView.A01(textLayoutParams.A00(charSequence).getLineCount());
            expandingTextView.A0A = enumC1585079l2;
        }
    }

    @Override // android.widget.TextView
    public int getMaxLines() {
        return this.A01;
    }

    public void setEllipsisTextColor(int i) {
        this.A08 = i;
        A00();
        this.A0F = true;
    }

    public void setExpandState(EnumC1585079l enumC1585079l) {
        this.A0A = enumC1585079l;
        this.A0F = true;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        throw new UnsupportedOperationException("Can't override the onClickListener for this view");
    }

    public ExpandingTextView(Context context) {
        super(context);
        this.A04 = true;
        this.A02 = null;
        A02(context, null);
    }

    private C57482kN getTextLayoutParams() {
        return new C57482kN(Layout.Alignment.ALIGN_NORMAL, getPaint(), null, 0.0f, 1.0f, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            r0 = -984091330(0xffffffffc557f53e, float:-3455.3276)
            int r2 = X.C0f9.A06(r0)
            super.onMeasure(r11, r12)
            boolean r0 = r10.A0F
            if (r0 != 0) goto L16
            int r1 = r10.A09
            int r0 = r10.getMeasuredWidth()
            if (r1 == r0) goto L80
        L16:
            r0 = 1
            r10.A0E = r0
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            java.lang.CharSequence r6 = r10.A03
            if (r6 != 0) goto L24
            java.lang.String r6 = ""
        L24:
            java.lang.CharSequence r7 = r10.A0C
            int r8 = r10.A01
            X.2kN r4 = r10.getTextLayoutParams()
            r9 = 0
            java.lang.String r5 = ""
            java.lang.CharSequence r0 = X.AbstractC85253rG.A01(r4, r5, r6, r7, r8, r9)
            r3.append(r0)
            int r1 = r0.length()
            java.lang.CharSequence r0 = r10.A03
            r0.getClass()
            int r0 = r0.length()
            r4 = 33
            if (r1 == r0) goto L87
            int r5 = r3.length()
            java.lang.CharSequence r0 = r10.A0C
        L4d:
            r3.append(r0)
            int r0 = r10.A08
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
            int r0 = r3.length()
            r3.setSpan(r1, r5, r0, r4)
        L5e:
            boolean r0 = r10.A04
            if (r0 == 0) goto L6e
            X.9oA r1 = new X.9oA
            r1.<init>()
            int r0 = r3.length()
            r3.setSpan(r1, r9, r0, r4)
        L6e:
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r10.setText(r3, r0)
            r10.A0E = r9
            r10.A0F = r9
            int r0 = r10.getMeasuredWidth()
            r10.A09 = r0
            super.onMeasure(r11, r12)
        L80:
            r0 = -993703981(0xffffffffc4c547d3, float:-1578.2445)
            X.C0f9.A0D(r0, r2)
            return
        L87:
            int r1 = r10.A00
            int r0 = r10.A01
            if (r1 >= r0) goto L5e
            java.lang.CharSequence r0 = r10.A02
            if (r0 == 0) goto L5e
            int r5 = r3.length()
            java.lang.CharSequence r0 = r10.A02
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.expandingtextview.ExpandingTextView.onMeasure(int, int):void");
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (!this.A0E) {
            this.A03 = charSequence;
            this.A0F = true;
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.A01 = i;
        this.A0F = true;
    }

    public void setEnableClickOverride(boolean z) {
        this.A04 = z;
    }

    public void setExpandedEllipsisText(CharSequence charSequence) {
        this.A02 = charSequence;
    }

    public void setOnExpandedStateChangeListener(InterfaceC1586279x interfaceC1586279x) {
        this.A0B = interfaceC1586279x;
    }

    public ExpandingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A04 = true;
        this.A02 = null;
        A02(context, attributeSet);
    }

    public ExpandingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A04 = true;
        this.A02 = null;
        A02(context, attributeSet);
    }
}
