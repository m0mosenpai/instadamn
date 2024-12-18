package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;

/* renamed from: X.Rsh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61726Rsh {
    public static final Map A00(QIp qIp) {
        if (qIp == null) {
            return AbstractC06930Yk.A0E();
        }
        return AbstractC06930Yk.A06(AbstractC166987dD.A1L("email", qIp.A0M), AbstractC166987dD.A1L("given-name", qIp.A04), AbstractC166987dD.A1L("family-name", qIp.A03), AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, qIp.A05), AbstractC166987dD.A1L("address-line1", qIp.A0H), AbstractC166987dD.A1L("address-line2", qIp.A0I), AbstractC166987dD.A1L("address-line3", qIp.A0J), AbstractC166987dD.A1L("address-level1", qIp.A01), AbstractC166987dD.A1L("address-level2", qIp.A02), AbstractC166987dD.A1L("address-level3", qIp.A0D), AbstractC166987dD.A1L("address-level4", qIp.A0G), AbstractC166987dD.A1L("postal-code", qIp.A06), AbstractC166987dD.A1L("street-address", qIp.A07), AbstractC166987dD.A1L("tel", qIp.A08), AbstractC166987dD.A1L("tel-area-code", qIp.A09), AbstractC166987dD.A1L("tel-country-code", qIp.A0A), AbstractC166987dD.A1L("tel-local", qIp.A0B), AbstractC166987dD.A1L("tel-local-prefix", qIp.A0C), AbstractC166987dD.A1L("tel-local-suffix", qIp.A0E), AbstractC166987dD.A1L("tel-national", qIp.A0F), AbstractC166987dD.A1L("country", qIp.A0K), AbstractC166987dD.A1L("country-name", qIp.A0L));
    }
}
