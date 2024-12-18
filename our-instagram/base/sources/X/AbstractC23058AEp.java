package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.nio.charset.Charset;

/* renamed from: X.AEp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23058AEp {
    public static final Charset A00 = Charset.forName(ReactWebViewManager.HTML_ENCODING);

    public static boolean A00(CharSequence charSequence) {
        if (charSequence.length() < 7) {
            return false;
        }
        int i = 0;
        while (charSequence.charAt(i) == "\ue045\ue0bd\ue166#\ue045\ue0bd\ue166".charAt(i)) {
            i++;
            if (i >= 7) {
                return true;
            }
        }
        return false;
    }
}
