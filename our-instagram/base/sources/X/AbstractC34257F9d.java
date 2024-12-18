package X;

import java.util.Locale;

/* renamed from: X.F9d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34257F9d {
    public static final Integer A00(String str) {
        C14360o3.A0B(str, 0);
        String A10 = AbstractC166997dE.A10(Locale.ROOT, str);
        if (A10.equals("HEADER")) {
            return C05F.A00;
        }
        if (A10.equals("PARAGRAPH")) {
            return C05F.A01;
        }
        if (A10.equals("BULLETED_LIST")) {
            return C05F.A0C;
        }
        throw AbstractC166987dD.A12(A10);
    }
}
