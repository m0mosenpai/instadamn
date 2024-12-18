package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.Locale;

/* renamed from: X.CIl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27666CIl {
    public static final String A00(DirectShareTarget directShareTarget) {
        C14360o3.A0B(directShareTarget, 0);
        String str = directShareTarget.A0I;
        if (str == null) {
            str = "";
        }
        if (str.length() != 0 && Character.isLetter(str.charAt(0))) {
            String A0w = AbstractC25227BEk.A0w(str, 0, 1);
            Locale locale = Locale.getDefault();
            C14360o3.A07(locale);
            return AbstractC166997dE.A10(locale, A0w);
        }
        return "…";
    }
}
