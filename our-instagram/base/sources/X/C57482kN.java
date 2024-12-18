package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* renamed from: X.2kN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57482kN {
    public int A00;
    public final float A01;
    public final float A02;
    public final Layout.Alignment A03;
    public final TextPaint A04;
    public final String A05;
    public final boolean A06;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.text.StaticLayout] */
    public final StaticLayout A00(CharSequence charSequence) {
        int length = charSequence.length();
        try {
            length = StaticLayout.Builder.obtain(charSequence, 0, length, this.A04, this.A00).setLineSpacing(this.A01, this.A02).setAlignment(this.A03).setIncludePad(this.A06).setUseLineSpacingFromFallbacks(true).build();
            return length;
        } catch (IllegalArgumentException e) {
            C0f5 AEp = C18950wb.A01.AEp("InvalidTextLayoutCreation", 817899586);
            AEp.ERI(new VID(this, e, length));
            AEp.report();
            return new StaticLayout(charSequence, this.A04, this.A00, this.A03, this.A02, this.A01, this.A06);
        }
    }

    public C57482kN(Layout.Alignment alignment, TextPaint textPaint, String str, float f, float f2, int i, boolean z) {
        this.A04 = textPaint;
        this.A00 = i;
        this.A01 = f;
        this.A02 = f2;
        this.A06 = z;
        this.A03 = alignment;
        this.A05 = str;
    }
}
