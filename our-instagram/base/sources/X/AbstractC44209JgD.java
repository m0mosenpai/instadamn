package X;

import java.util.Locale;

/* renamed from: X.JgD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44209JgD {
    public static final String A00(char c) {
        String valueOf = String.valueOf(c);
        C14360o3.A0C(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String A10 = AbstractC166997dE.A10(locale, valueOf);
        if (A10.length() > 1) {
            if (c != 329) {
                return AnonymousClass001.A0D(AbstractC31172DnG.A16(locale, AbstractC43592JPx.A0z(A10, 1)), A10.charAt(0));
            }
            return A10;
        }
        return String.valueOf(Character.toTitleCase(c));
    }
}
