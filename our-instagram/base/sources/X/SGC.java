package X;

import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;

/* loaded from: classes10.dex */
public final class SGC {
    public CharacterStyle A00;
    public final int A01;
    public final int A02;

    public SGC(Integer num, int i, int i2) {
        ForegroundColorSpan foregroundColorSpan;
        this.A01 = i;
        this.A02 = i2;
        if (num != null) {
            foregroundColorSpan = new ForegroundColorSpan(num.intValue());
        } else {
            foregroundColorSpan = null;
        }
        this.A00 = foregroundColorSpan;
    }
}
