package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;
import java.util.HashMap;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: X.TZh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64907TZh extends HashMap {
    public final int A00;

    public C64907TZh(int i) {
        this.A00 = i;
        if (i != 0) {
            for (EnumC61172RgY enumC61172RgY : EnumC61172RgY.values()) {
                AbstractC58319PtB.A1H(enumC61172RgY, this, enumC61172RgY.A00);
            }
            return;
        }
        put("birthdate-day", "birthDateDay");
        put("birthdate-full", "birthDateFull");
        put("birthdate-month", "birthDateMonth");
        put("birthdate-year", "birthDateYear");
        put("cc-csc", "creditCardSecurityCode");
        put("cc-exp", "creditCardExpirationDate");
        put("cc-exp-day", "creditCardExpirationDay");
        put("cc-exp-month", "creditCardExpirationMonth");
        put("cc-exp-year", "creditCardExpirationYear");
        put("cc-number", "creditCardNumber");
        put("email", "emailAddress");
        put("gender", "gender");
        put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "personName");
        put("name-family", "personFamilyName");
        put("name-given", "personGivenName");
        put("name-middle", "personMiddleName");
        put("name-middle-initial", "personMiddleInitial");
        put("name-prefix", "personNamePrefix");
        put("name-suffix", "personNameSuffix");
        put("password", "password");
        put("password-new", "newPassword");
        put("postal-address", "postalAddress");
        put("postal-address-country", "addressCountry");
        put("postal-address-extended", "extendedAddress");
        put("postal-address-extended-postal-code", "extendedPostalCode");
        put("postal-address-locality", "addressLocality");
        put("postal-address-region", "addressRegion");
        put("postal-code", "postalCode");
        put("street-address", AbstractC111324zv.A00(5429));
        put("sms-otp", "smsOTPCode");
        put("tel", "phoneNumber");
        put("tel-country-code", "phoneCountryCode");
        put("tel-national", MSV.A00(1491));
        put("tel-device", "phoneNumberDevice");
        byte[] copyOfRange = Arrays.copyOfRange(AbstractC58359Ptz.A00, 0, 8);
        for (int i2 = 0; i2 < copyOfRange.length; i2++) {
            copyOfRange[i2] = (byte) ((copyOfRange[i2] - PublicSuffixDatabase.EXCEPTION_MARKER) - 3);
        }
        String str = new String(copyOfRange);
        put(str, str);
        put("username-new", "newUsername");
    }
}
