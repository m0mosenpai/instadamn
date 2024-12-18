package X;

import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public abstract class OR8 {
    public static final Pattern A00 = Pattern.compile(AnonymousClass001.A11("[+-]?(?:NaN|Infinity|", "(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?", "|", "0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?", ")").replace("#", "+"));

    public static boolean A00(double value) {
        return Double.NEGATIVE_INFINITY < value && value < Double.POSITIVE_INFINITY;
    }
}
