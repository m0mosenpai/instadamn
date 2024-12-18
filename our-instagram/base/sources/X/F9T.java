package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class F9T {
    public static final String A00(String str) {
        Object next;
        String valueOf;
        String encode = URLEncoder.encode(str, ReactWebViewManager.HTML_ENCODING);
        if (encode != null) {
            int length = encode.length();
            ArrayList A17 = AbstractC25225BEi.A17(length);
            for (int i = 0; i < length; i++) {
                char charAt = encode.charAt(i);
                if (charAt == '~') {
                    valueOf = "%7E";
                } else if (charAt == '-') {
                    valueOf = "%2D";
                } else if (charAt == '.') {
                    valueOf = "%2E";
                } else if (charAt == '_') {
                    valueOf = "%5F";
                } else {
                    valueOf = String.valueOf(charAt);
                }
                A17.add(valueOf);
            }
            Iterator it = A17.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                while (it.hasNext()) {
                    next = AnonymousClass001.A0R((String) next, AbstractC166987dD.A1B(it));
                }
            }
            return (String) next;
        }
        return null;
    }
}
