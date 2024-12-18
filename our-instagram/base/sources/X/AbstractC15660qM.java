package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Locale;

/* renamed from: X.0qM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15660qM {
    public static volatile String A00;

    public static final String A00() {
        String str = A00;
        if (str == null) {
            Locale locale = Locale.getDefault();
            StringBuilder sb = new StringBuilder();
            C14360o3.A0A(locale);
            String language = locale.getLanguage();
            if (language != null) {
                int hashCode = language.hashCode();
                if (hashCode != 3365) {
                    if (hashCode != 3374) {
                        if (hashCode == 3391 && language.equals("ji")) {
                            language = "yi";
                        }
                    } else if (language.equals("iw")) {
                        language = "he";
                    }
                } else if (language.equals("in")) {
                    language = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                }
                sb.append(language);
                String country = locale.getCountry();
                if (country != null) {
                    sb.append("-");
                    sb.append(country);
                }
            }
            if (!C14360o3.A0K(Locale.US, locale)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("en-US");
            }
            String obj = sb.toString();
            C14360o3.A07(obj);
            A00 = obj;
            return obj;
        }
        return str;
    }
}
