package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.venue.Venue;
import java.io.StringWriter;

/* renamed from: X.VVg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68553VVg {
    public static final String A00(Venue venue) {
        String A02;
        String str;
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        C14360o3.A0A(A0A);
        A0A.A0d();
        if (venue != null) {
            String name = venue.A00.getName();
            if (name != null) {
                A0A.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, name);
            }
            String address = venue.A00.getAddress();
            if (address != null) {
                A0A.A0S("address", address);
            }
            Double A00 = venue.A00();
            Double A01 = venue.A01();
            if (A00 != null && A01 != null) {
                A0A.A0O("lat", A00.doubleValue());
                A0A.A0O("lng", A01.doubleValue());
            }
            String A03 = venue.A03();
            if (A03 != null) {
                A0A.A0S("external_source", A03);
                switch (A03.hashCode()) {
                    case -1663190862:
                        if (A03.equals("facebook_events")) {
                            A02 = venue.A02();
                            str = "facebook_events_id";
                            A0A.A0S(str, A02);
                            break;
                        }
                        break;
                    case -1357635611:
                        if (A03.equals(AbstractC111324zv.A00(923))) {
                            A02 = venue.A02();
                            str = "facebook_places_id";
                            A0A.A0S(str, A02);
                            break;
                        }
                        break;
                    case 1208154701:
                        if (A03.equals("meta_place")) {
                            A02 = venue.A02();
                            str = "meta_place_id";
                            A0A.A0S(str, A02);
                            break;
                        }
                        break;
                    case 1913352643:
                        if (A03.equals("foursquare")) {
                            A02 = venue.A02();
                            str = "foursquare_v2_id";
                            A0A.A0S(str, A02);
                            break;
                        }
                        break;
                }
            }
        }
        String A0l = AbstractC167017dG.A0l(A0A, stringWriter);
        C14360o3.A07(A0l);
        return A0l;
    }
}
