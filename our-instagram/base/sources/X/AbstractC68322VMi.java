package X;

import java.text.BreakIterator;

/* renamed from: X.VMi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68322VMi {
    public static String A00(Integer num, String str) {
        if (str == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3) {
                    return str;
                }
                BreakIterator wordInstance = BreakIterator.getWordInstance();
                wordInstance.setText(str);
                StringBuilder sb = new StringBuilder(str.length());
                int first = wordInstance.first();
                while (true) {
                    int next = wordInstance.next();
                    int i = first;
                    first = next;
                    if (next != -1) {
                        String substring = str.substring(i, next);
                        if (Character.isLetterOrDigit(substring.charAt(0))) {
                            sb.append(Character.toUpperCase(substring.charAt(0)));
                            substring = substring.substring(1).toLowerCase();
                        }
                        sb.append(substring);
                    } else {
                        return sb.toString();
                    }
                }
            } else {
                return str.toLowerCase();
            }
        } else {
            return str.toUpperCase();
        }
    }
}
