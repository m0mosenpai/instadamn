package X;

import android.os.Build;
import android.text.TextPaint;

/* renamed from: X.Rqm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61622Rqm {
    public static final AbstractC63584Spr A00(TextPaint textPaint, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new Q69(charSequence, textPaint);
        }
        return new Q68(charSequence);
    }
}
