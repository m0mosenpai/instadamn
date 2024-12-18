package X;

import android.text.Editable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.STf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62833STf {
    public static final Pattern A00 = Pattern.compile("(^ *)([*-] ?|[1-9][0-9]?\\. ?)(.*?$)", 8);

    public static final int A00(Editable editable, int i, int i2) {
        String group;
        Matcher matcher = A00.matcher(editable.subSequence(i, i2));
        matcher.find();
        if (!matcher.matches() || (group = matcher.group(1)) == null) {
            return 0;
        }
        return Math.min(3, group.length() / 4);
    }
}
