package X;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.SUh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62860SUh {
    public static final Pattern A00 = Pattern.compile("\\\\.");
    public static final Pattern A01 = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    public static String A00(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = A01.matcher(str);
            StringBuffer stringBuffer = null;
            while (matcher.find()) {
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                }
                char A002 = AbstractC58318PtA.A00(matcher.group());
                if (A002 != '\f') {
                    if (A002 != '\r') {
                        if (A002 != '\"') {
                            if (A002 != '/') {
                                if (A002 == '\\') {
                                    str2 = "\\\\\\\\";
                                } else {
                                    switch (A002) {
                                        case '\b':
                                            str2 = "\\\\b";
                                            break;
                                        case '\t':
                                            str2 = "\\\\t";
                                            break;
                                        case '\n':
                                            str2 = "\\\\n";
                                            break;
                                    }
                                }
                            } else {
                                str2 = "\\\\/";
                            }
                        } else {
                            str2 = "\\\\\\\"";
                        }
                    } else {
                        str2 = "\\\\r";
                    }
                } else {
                    str2 = "\\\\f";
                }
                matcher.appendReplacement(stringBuffer, str2);
            }
            if (stringBuffer != null) {
                matcher.appendTail(stringBuffer);
                return stringBuffer.toString();
            }
            return str;
        }
        return str;
    }
}
