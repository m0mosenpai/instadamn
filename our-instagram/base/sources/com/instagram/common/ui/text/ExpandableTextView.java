package com.instagram.common.ui.text;

import X.AbstractC167007dF;
import X.AbstractC31172DnG;
import X.C14360o3;
import X.C17s;
import X.JQ0;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class ExpandableTextView extends IgTextView {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    public final SpannableStringBuilder A00(CharSequence charSequence, String str, int i) {
        int A03;
        C14360o3.A0B(charSequence, 1);
        TextPaint paint = getPaint();
        C14360o3.A07(paint);
        int i2 = this.A00;
        int length = str.length();
        CharSequence charSequence2 = charSequence;
        if (i > 0) {
            StaticLayout build = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), paint, i).build();
            C14360o3.A07(build);
            if (build.getLineCount() > i2 && (A03 = C17s.A03(build.getLineEnd(i2 - 1) - (length + 5), 0, charSequence.length() - 1)) > 0 && A03 < charSequence.length()) {
                this.A03 = true;
                charSequence2 = charSequence.subSequence(0, A03);
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
        if (spannableStringBuilder.length() < charSequence.length()) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ForegroundColorSpan(AbstractC167007dF.A09(getContext(), R.attr.igdsSecondaryText)), 0, length, 17);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        return spannableStringBuilder;
    }

    public final void setCollapsedLines(int i) {
        if (1 <= i && i <= this.A01) {
            this.A00 = i;
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    public final void setExpandedLines(int i) {
        if (i >= this.A01) {
            this.A01 = i;
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    public final void setAnimating(boolean z) {
        this.A02 = z;
    }

    public final void setTruncated(boolean z) {
        this.A03 = z;
    }

    public /* synthetic */ ExpandableTextView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A00 = 3;
        this.A01 = Integer.MAX_VALUE;
    }
}
