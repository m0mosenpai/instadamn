package X;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public abstract class STQ {
    public static final Pattern A00 = Pattern.compile("\\{([^{}]*)\\}");

    public static final String A00(String str, Map map) {
        if (str != null && map != null) {
            Matcher matcher = A00.matcher(str);
            StringBuffer stringBuffer = new StringBuffer();
            while (matcher.find()) {
                String group = matcher.group(1);
                if (map.containsKey(group)) {
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(AbstractC166987dD.A1A(group, map));
                }
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        }
        return str;
    }
}
