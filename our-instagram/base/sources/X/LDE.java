package X;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public abstract class LDE {
    public static final Pattern A00;

    public static final SpannedString A00(CharSequence charSequence, Locale locale, Object... objArr) {
        int i;
        Object obj;
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(charSequence);
        int i2 = -1;
        int i3 = 0;
        while (i3 < A0H.length()) {
            Matcher matcher = A00.matcher(A0H);
            C14360o3.A07(matcher);
            if (!matcher.find(i3)) {
                break;
            }
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            String group3 = matcher.group(3);
            CharSequence charSequence2 = "%";
            if (!C14360o3.A0K(group3, "%")) {
                if (C14360o3.A0K(group3, "n")) {
                    charSequence2 = "\n";
                } else {
                    if (C14360o3.A0K(group, "")) {
                        i2++;
                    } else if (!C14360o3.A0K(group, "<")) {
                        if (group != null) {
                            i = i2;
                            i2 = Integer.parseInt(AbstractC25227BEk.A0w(group, 0, group.length() - 1)) - 1;
                            obj = objArr[i2];
                            if (C14360o3.A0K(group3, "s") || !(obj instanceof Spanned)) {
                                StringBuilder A1C = AbstractC166987dD.A1C();
                                A1C.append('%');
                                A1C.append(group2);
                                obj = String.format(locale, AbstractC166997dE.A0x(group3, A1C), AbstractC166997dE.A1b(obj, 1));
                                C14360o3.A07(obj);
                            }
                            charSequence2 = (CharSequence) obj;
                            i2 = i;
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    i = i2;
                    obj = objArr[i2];
                    if (C14360o3.A0K(group3, "s")) {
                    }
                    StringBuilder A1C2 = AbstractC166987dD.A1C();
                    A1C2.append('%');
                    A1C2.append(group2);
                    obj = String.format(locale, AbstractC166997dE.A0x(group3, A1C2), AbstractC166997dE.A1b(obj, 1));
                    C14360o3.A07(obj);
                    charSequence2 = (CharSequence) obj;
                    i2 = i;
                }
            }
            A0H.replace(start, end, charSequence2);
            i3 = start + charSequence2.length();
        }
        return new SpannedString(A0H);
    }

    static {
        Pattern compile = Pattern.compile("%([0-9]+\\$|<?)([^a-zA-z%]*)([[a-zA-Z%]&&[^tT]]|[tT][a-zA-Z])");
        C14360o3.A07(compile);
        A00 = compile;
    }
}
