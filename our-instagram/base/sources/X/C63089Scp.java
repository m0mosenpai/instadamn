package X;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.Scp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63089Scp {
    public static final Pattern A00 = Pattern.compile("\\b((?:seg-\\d+(?:_\\d+)?|\\d+)\\.js)");

    public static final String A00(String str, ReadableArray readableArray) {
        String str2;
        int i;
        String string;
        StringBuilder A0s = AbstractC58318PtA.A0s(str);
        A0s.append(", stack:\n");
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ReadableMap map = readableArray.getMap(i2);
            A0s.append(map.getString("methodName"));
            A0s.append("@");
            if (map.hasKey("file") && !map.isNull("file") && map.getType("file") == ReadableType.String && (string = map.getString("file")) != null) {
                Matcher matcher = A00.matcher(string);
                if (matcher.find()) {
                    str2 = AnonymousClass001.A0C(matcher.group(1), ':');
                    A0s.append(str2);
                    if (!map.hasKey("lineNumber") && !map.isNull("lineNumber") && map.getType("lineNumber") == ReadableType.Number) {
                        i = map.getInt("lineNumber");
                    } else {
                        i = -1;
                    }
                    A0s.append(i);
                    if (map.hasKey("column") && !map.isNull("column") && map.getType("column") == ReadableType.Number) {
                        A0s.append(":");
                        A0s.append(map.getInt("column"));
                    }
                    A0s.append("\n");
                }
            }
            str2 = "";
            A0s.append(str2);
            if (!map.hasKey("lineNumber")) {
            }
            i = -1;
            A0s.append(i);
            if (map.hasKey("column")) {
                A0s.append(":");
                A0s.append(map.getInt("column"));
            }
            A0s.append("\n");
        }
        return AbstractC166987dD.A19(A0s);
    }
}
