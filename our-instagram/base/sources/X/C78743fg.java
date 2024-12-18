package X;

import android.content.res.ColorStateList;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;

/* renamed from: X.3fg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78743fg {
    public static final C003701c A07 = new C003701c(100);
    public int A02 = 0;
    public int A03 = 2;
    public int A00 = Integer.MAX_VALUE;
    public int A01 = 2;
    public final C78753fh A06 = new C78753fh();
    public Layout A04 = null;
    public boolean A05 = true;

    public final Layout A00() {
        int i;
        int i2;
        int ceil;
        int i3;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout build;
        Layout layout;
        if (this.A05 && (layout = this.A04) != null) {
            return layout;
        }
        C78753fh c78753fh = this.A06;
        CharSequence charSequence = c78753fh.A0I;
        BoringLayout.Metrics metrics = null;
        if (charSequence == null || (charSequence.length() == 0 && !c78753fh.A0L)) {
            return null;
        }
        boolean z = false;
        if (this.A05) {
            CharSequence charSequence2 = c78753fh.A0I;
            if ((charSequence2 instanceof Spannable) && ((ClickableSpan[]) ((Spanned) charSequence2).getSpans(0, charSequence2.length() - 1, ClickableSpan.class)).length > 0) {
                z = true;
            }
        }
        if (this.A05 && !z) {
            i = c78753fh.hashCode();
            Layout layout2 = (Layout) A07.A02(Integer.valueOf(i));
            if (layout2 != null) {
                return layout2;
            }
        } else {
            i = -1;
        }
        if (c78753fh.A0M) {
            i2 = 1;
        } else {
            i2 = c78753fh.A0A;
        }
        if (i2 == 1) {
            try {
                metrics = BoringLayout.isBoring(c78753fh.A0I, c78753fh.A0F);
            } catch (NullPointerException e) {
                throw e;
            }
        }
        int i4 = c78753fh.A0B;
        if (i4 != 0) {
            if (i4 != 1) {
                ceil = Math.min((int) Math.ceil(Layout.getDesiredWidth(c78753fh.A0I, c78753fh.A0F)), c78753fh.A0C);
            } else {
                ceil = c78753fh.A0C;
            }
        } else {
            ceil = (int) Math.ceil(Layout.getDesiredWidth(c78753fh.A0I, c78753fh.A0F));
        }
        float fontMetricsInt = c78753fh.A0F.getFontMetricsInt(null);
        float f = c78753fh.A05;
        float f2 = c78753fh.A04;
        int round = Math.round((fontMetricsInt * f) + f2);
        int i5 = this.A01;
        int i6 = this.A00;
        if (i5 == 1) {
            i6 *= round;
        }
        int min = Math.min(ceil, i6);
        if (this.A03 == 1) {
            i3 = this.A02 * round;
        } else {
            i3 = this.A02;
        }
        int max = Math.max(min, i3);
        if (metrics != null) {
            build = BoringLayout.make(c78753fh.A0I, c78753fh.A0F, max, c78753fh.A0E, f, f2, metrics, c78753fh.A0J, c78753fh.A0G, max);
        } else {
            while (true) {
                try {
                    CharSequence charSequence3 = c78753fh.A0I;
                    int length = charSequence3.length();
                    TextPaint textPaint = c78753fh.A0F;
                    Layout.Alignment alignment = c78753fh.A0E;
                    float f3 = c78753fh.A05;
                    float f4 = c78753fh.A04;
                    boolean z2 = c78753fh.A0J;
                    TextUtils.TruncateAt truncateAt = c78753fh.A0G;
                    InterfaceC78793fl interfaceC78793fl = c78753fh.A0H;
                    int i7 = c78753fh.A06;
                    int i8 = c78753fh.A07;
                    int i9 = c78753fh.A08;
                    StaticLayout.Builder maxLines = StaticLayout.Builder.obtain(charSequence3, 0, length, textPaint, max).setAlignment(alignment).setLineSpacing(f4, f3).setIncludePad(z2).setEllipsize(truncateAt).setEllipsizedWidth(max).setMaxLines(i2);
                    if (interfaceC78793fl == AbstractC78763fi.A04) {
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    } else if (interfaceC78793fl == AbstractC78763fi.A05) {
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    } else {
                        if (interfaceC78793fl != AbstractC78763fi.A01) {
                            if (interfaceC78793fl == AbstractC78763fi.A02) {
                                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            } else if (interfaceC78793fl == AbstractC78763fi.A00) {
                                textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                            } else if (interfaceC78793fl == AbstractC78763fi.A03) {
                                textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                            }
                        }
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    }
                    StaticLayout.Builder indents = maxLines.setTextDirection(textDirectionHeuristic).setBreakStrategy(i7).setHyphenationFrequency(i8).setIndents(null, null);
                    indents.setJustificationMode(i9);
                    indents.setUseLineSpacingFromFallbacks(true);
                    build = indents.build();
                    break;
                } catch (IndexOutOfBoundsException e2) {
                    if (!(c78753fh.A0I instanceof String)) {
                        android.util.Log.e("TextLayoutBuilder", "Hit bug #35412, retrying with Spannables removed", e2);
                        c78753fh.A0I = c78753fh.A0I.toString();
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (this.A05 && !z) {
            this.A04 = build;
            A07.A05(Integer.valueOf(i), build);
        }
        c78753fh.A0K = true;
        return build;
    }

    public final void A01(float f) {
        C78753fh c78753fh = this.A06;
        if (c78753fh.A00 != f) {
            c78753fh.A00 = f;
            c78753fh.A04 = f - c78753fh.A0F.getFontMetrics(null);
            c78753fh.A05 = 1.0f;
            this.A04 = null;
        }
    }

    public final void A02(int i) {
        C78753fh c78753fh = this.A06;
        c78753fh.A00();
        c78753fh.A0D = null;
        c78753fh.A0F.setColor(i);
        this.A04 = null;
    }

    public final void A03(int i) {
        C78753fh c78753fh = this.A06;
        float f = i;
        if (c78753fh.A0F.getTextSize() != f) {
            c78753fh.A00();
            c78753fh.A0F.setTextSize(f);
            this.A04 = null;
        }
    }

    public final void A04(ColorStateList colorStateList) {
        int i;
        C78753fh c78753fh = this.A06;
        c78753fh.A00();
        c78753fh.A0D = colorStateList;
        TextPaint textPaint = c78753fh.A0F;
        if (colorStateList != null) {
            i = colorStateList.getDefaultColor();
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        this.A04 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r4 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(java.lang.CharSequence r4) {
        /*
            r3 = this;
            X.3fh r1 = r3.A06
            java.lang.CharSequence r0 = r1.A0I
            if (r4 == r0) goto L27
            boolean r0 = r4 instanceof android.text.SpannableStringBuilder
            if (r0 == 0) goto L17
            r4.hashCode()     // Catch: java.lang.NullPointerException -> Le
            goto L19
        Le:
            r2 = move-exception
            java.lang.String r1 = "The given text contains a null span. Due to an Android framework bug, this will cause an exception later down the line."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r2)
            throw r0
        L17:
            if (r4 == 0) goto L22
        L19:
            java.lang.CharSequence r0 = r1.A0I
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L22
            return
        L22:
            r1.A0I = r4
            r0 = 0
            r3.A04 = r0
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78743fg.A05(java.lang.CharSequence):void");
    }
}
