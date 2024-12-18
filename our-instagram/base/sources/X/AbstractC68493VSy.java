package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import java.io.IOException;

/* renamed from: X.VSy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68493VSy {
    public static LocationPageInformation parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            LocationPageInformation locationPageInformation = new LocationPageInformation();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    locationPageInformation.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("phone".equals(A0s)) {
                    locationPageInformation.A09 = AbstractC167017dG.A0m(c16l);
                } else if ("website".equals(A0s)) {
                    locationPageInformation.A0A = AbstractC167017dG.A0m(c16l);
                } else if ("category".equals(A0s)) {
                    locationPageInformation.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("price_range".equals(A0s)) {
                    locationPageInformation.A03 = AbstractC166997dE.A0h(c16l);
                } else if ("location_address".equals(A0s)) {
                    locationPageInformation.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("location_city".equals(A0s)) {
                    locationPageInformation.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("location_region".equals(A0s)) {
                    locationPageInformation.A04 = AbstractC166997dE.A0h(c16l);
                } else if ("location_zip".equals(A0s)) {
                    locationPageInformation.A0B = AbstractC167017dG.A0m(c16l);
                } else if ("hours".equals(A0s)) {
                    locationPageInformation.A01 = VVJ.parseFromJson(c16l);
                } else if ("ig_business".equals(A0s)) {
                    locationPageInformation.A00 = AbstractC68494VSz.parseFromJson(c16l);
                } else if ("has_menu".equals(A0s)) {
                    locationPageInformation.A0C = c16l.A0d();
                } else if ("num_guides".equals(A0s)) {
                    locationPageInformation.A02 = AbstractC166997dE.A0h(c16l);
                }
                c16l.A0z();
            }
            return locationPageInformation;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
