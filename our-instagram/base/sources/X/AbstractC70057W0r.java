package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: X.W0r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70057W0r {
    public static final Layout.Alignment A00 = Layout.Alignment.ALIGN_NORMAL;

    public static StaticLayout A00(Layout.Alignment alignment, TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        CharSequence charSequence2 = charSequence;
        if (i != -1) {
            CharSequence A01 = AbstractC85253rG.A01(new C57482kN(alignment, textPaint, null, 0.0f, 1.0f, i2, false), "", charSequence2, "…", i, false);
            C14360o3.A07(A01);
            if (!A01.equals(charSequence2)) {
                charSequence2 = TextUtils.concat(A01, "…");
            }
        }
        return new StaticLayout(charSequence2, textPaint, i2, alignment, 1.0f, 0.0f, false);
    }
}
