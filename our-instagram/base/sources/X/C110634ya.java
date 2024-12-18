package X;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* renamed from: X.4ya, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110634ya implements Spannable {
    public Spannable A00;
    public boolean A01;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.A00.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.A00.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.A00.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.A00.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.A00.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.A00.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.A00.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.A00.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.A00.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        Spannable spannable = this.A00;
        if (!this.A01 && (spannable instanceof PrecomputedText)) {
            SpannableString spannableString = new SpannableString(spannable);
            this.A00 = spannableString;
            spannable = spannableString;
        }
        this.A01 = true;
        spannable.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        Spannable spannable = this.A00;
        if (!this.A01 && (spannable instanceof PrecomputedText)) {
            SpannableString spannableString = new SpannableString(spannable);
            this.A00 = spannableString;
            spannable = spannableString;
        }
        this.A01 = true;
        spannable.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.A00.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.A00.toString();
    }
}
