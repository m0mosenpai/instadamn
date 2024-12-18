package X;

import java.util.Locale;

/* renamed from: X.F9a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34254F9a {
    public static final Integer A00(String str) {
        String A10 = AbstractC166997dE.A10(Locale.ROOT, str);
        if (A10.equals("REG_FLOW")) {
            return C05F.A00;
        }
        if (A10.equals("NUX_FLOW")) {
            return C05F.A01;
        }
        throw AbstractC166987dD.A12(A10);
    }
}
