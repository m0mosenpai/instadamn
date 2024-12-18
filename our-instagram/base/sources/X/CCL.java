package X;

import android.os.Build;
import android.text.style.SuggestionRangeSpan;

/* loaded from: classes5.dex */
public abstract class CCL {
    public static boolean A00(Object obj) {
        if (Build.VERSION.SDK_INT >= 33) {
            return obj instanceof SuggestionRangeSpan;
        }
        if (obj != null && obj.getClass().getName().equals("android.text.style.SuggestionRangeSpan")) {
            return true;
        }
        return false;
    }
}
