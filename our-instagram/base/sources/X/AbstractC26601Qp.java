package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1Qp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC26601Qp {
    public static final Pattern A00 = Pattern.compile("((?:\\?|&|#|^)(?:oh|oh2)=)([^&#]+)", 2);

    public static final String A00(String str) {
        if (str != null) {
            if (AbstractC001900j.A0a(str, "?url=", false) || AbstractC001900j.A0a(str, "&url=", false)) {
                int A08 = AbstractC001900j.A08(str, "&url=", 0, false);
                if (A08 == -1) {
                    A08 = AbstractC001900j.A08(str, "?url=", 0, false);
                }
                if (A08 != -1) {
                    int i = A08 + 5;
                    int A04 = AbstractC001900j.A04(str, '&', i);
                    if (A04 == -1) {
                        A04 = str.length();
                    }
                    try {
                        String substring = str.substring(i, A04);
                        C14360o3.A07(substring);
                        String decode = URLDecoder.decode(substring, ReactWebViewManager.HTML_ENCODING);
                        C14360o3.A0A(decode);
                        String encode = URLEncoder.encode(A01(decode), ReactWebViewManager.HTML_ENCODING);
                        String substring2 = str.substring(0, i);
                        C14360o3.A07(substring2);
                        String substring3 = str.substring(A04);
                        C14360o3.A07(substring3);
                        str = AnonymousClass001.A0g(substring2, encode, substring3);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
            }
            return A01(str);
        }
        return str;
    }

    public static final String A01(String str) {
        int i;
        Matcher matcher = A00.matcher(str);
        if (matcher.find()) {
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            do {
                int start = matcher.start();
                int end = matcher.end();
                String substring = str.substring(i2, start);
                C14360o3.A07(substring);
                sb.append(substring);
                sb.append(matcher.group(1));
                if (matcher.group(2) != null) {
                    String group = matcher.group(2);
                    if (group != null) {
                        i = group.length();
                    } else {
                        i = 0;
                    }
                    sb.append(AbstractC002300n.A0d(new String(new char[i]), "\u0000", "x", false));
                    i2 = end;
                }
            } while (matcher.find());
            String substring2 = str.substring(i2);
            C14360o3.A07(substring2);
            sb.append(substring2);
            String obj = sb.toString();
            C14360o3.A07(obj);
            return obj;
        }
        return str;
    }
}
