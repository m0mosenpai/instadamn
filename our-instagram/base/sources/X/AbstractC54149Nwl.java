package X;

import java.util.Locale;

/* renamed from: X.Nwl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54149Nwl {
    public static final Integer A00(String str) {
        if (str != null) {
            try {
                Locale locale = Locale.ROOT;
                C14360o3.A08(locale);
                String A10 = AbstractC166997dE.A10(locale, str);
                if (A10.equals("GALLERY")) {
                    return C05F.A00;
                }
                if (A10.equals("LIKED")) {
                    return C05F.A01;
                }
                if (A10.equals("SAVED")) {
                    return C05F.A0C;
                }
                if (A10.equals("SUGGESTED")) {
                    return C05F.A0N;
                }
                if (A10.equals("IGTV")) {
                    return C05F.A0Y;
                }
                if (A10.equals("FACEBOOK_WATCH")) {
                    return C05F.A0j;
                }
                if (A10.equals("REELS")) {
                    return C05F.A0u;
                }
                if (A10.equals("SUGGESTED_CLIPS_SUBPAGE")) {
                    return C05F.A15;
                }
                if (A10.equals("SUGGESTED_CLIPS_CAROUSEL")) {
                    return C05F.A1F;
                }
                throw AbstractC166987dD.A12(A10);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
