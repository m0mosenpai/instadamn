package X;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes11.dex */
public final class U9l extends MetricAffectingSpan implements InterfaceC71843X7b {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final AssetManager A04;

    public U9l(AssetManager assetManager, String str, String str2, int i, int i2) {
        C14360o3.A0B(assetManager, 5);
        this.A00 = i;
        this.A01 = i2;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = assetManager;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        int i = this.A00;
        int i2 = this.A01;
        String str = this.A03;
        Typeface A02 = WF2.A02(this.A04, textPaint.getTypeface(), this.A02, i, i2);
        C14360o3.A07(A02);
        textPaint.setFontFeatureSettings(str);
        textPaint.setTypeface(A02);
        textPaint.setSubpixelText(true);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        int i = this.A00;
        int i2 = this.A01;
        String str = this.A03;
        Typeface A02 = WF2.A02(this.A04, textPaint.getTypeface(), this.A02, i, i2);
        C14360o3.A07(A02);
        textPaint.setFontFeatureSettings(str);
        textPaint.setTypeface(A02);
        textPaint.setSubpixelText(true);
    }
}
