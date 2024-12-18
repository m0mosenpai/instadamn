package X;

import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;

/* renamed from: X.VsY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69631VsY {
    public float A00;
    public final DynamicLayout A01;
    public final SpannableStringBuilder A02;
    public final TextPaint A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final float A06;

    public final void A00(float f) {
        if (this.A00 != f) {
            this.A03.setTextSize(this.A06 * f);
            SpannableStringBuilder spannableStringBuilder = this.A02;
            spannableStringBuilder.replace(0, 0, spannableStringBuilder.subSequence(0, 0));
            this.A00 = f;
        }
    }

    public C69631VsY(Layout.Alignment alignment, SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, C57482kN c57482kN) {
        this.A02 = spannableStringBuilder;
        this.A03 = textPaint;
        this.A01 = new DynamicLayout(spannableStringBuilder, textPaint, c57482kN.A00, alignment, c57482kN.A02, c57482kN.A01, false);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new B5y(this, 19));
        this.A06 = textPaint.getTextSize();
        this.A00 = 1.0f;
        this.A04 = AbstractC09440dt.A00(enumC09460dv, X4Y.A00);
    }
}
