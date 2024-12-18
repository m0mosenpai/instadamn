package X;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SYe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62936SYe {
    public final Context A00;
    public final UserSession A01;
    public final C1VW A02;

    public final String A00(String str) {
        Location location;
        List<Address> fromLocation;
        Address address;
        C1VW c1vw = this.A02;
        if (c1vw != null) {
            location = c1vw.getLastLocation(this.A01, AnonymousClass001.A0R("IgFBPayLocationAPI:", str));
        } else {
            location = null;
        }
        if (location == null || (fromLocation = new Geocoder(this.A00).getFromLocation(location.getLatitude(), location.getLongitude(), 10)) == null) {
            return null;
        }
        Iterator<Address> it = fromLocation.iterator();
        while (true) {
            if (it.hasNext()) {
                address = it.next();
                String postalCode = address.getPostalCode();
                if (postalCode != null && !AbstractC001900j.A0T(postalCode)) {
                    break;
                }
            } else {
                address = null;
                break;
            }
        }
        Address address2 = address;
        if (address2 == null) {
            return null;
        }
        return address2.getPostalCode();
    }

    public C62936SYe(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = C1VW.A00;
    }

    public C62936SYe() {
    }
}
