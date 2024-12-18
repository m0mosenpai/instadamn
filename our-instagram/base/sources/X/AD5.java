package X;

import android.graphics.Paint;
import android.icu.text.BreakIterator;

/* loaded from: classes4.dex */
public abstract class AD5 {
    public static final int A00(Paint paint) {
        return paint.getShadowLayerColor();
    }

    public static final int A01(CharSequence charSequence, int i) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence);
        return characterInstance.preceding(i);
    }
}
