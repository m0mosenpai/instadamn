package X;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import com.instagram.common.gallery.Medium;
import java.io.IOException;
import java.util.List;

/* loaded from: classes4.dex */
public final class AjO implements BDS {
    public final ContentResolver A00;
    public final Context A01;
    public final Geocoder A02;

    @Override // X.BDS
    public final String getName() {
        return "LocationFeatureScanner";
    }

    @Override // X.BDS
    public final List AE2() {
        return C16930sl.A00;
    }

    @Override // X.BDS
    public final boolean EM1(Bitmap bitmap, Medium medium, C189328a9 c189328a9) {
        Context context = this.A01;
        C15900qk.A01();
        if (C15900qk.A00(context, false) >= 52428800) {
            double[] A07 = medium.A07(this.A00);
            if (A07 == null) {
                C0K8.A0P("LocationFeatureScanner", "media:%s doesn't have latlng values", Integer.valueOf(medium.A05));
            } else {
                try {
                    List<Address> fromLocation = this.A02.getFromLocation(A07[0], A07[1], 1);
                    if (fromLocation == null || fromLocation.isEmpty()) {
                        return true;
                    }
                    Address address = fromLocation.get(0);
                    c189328a9.A0K = address.getFeatureName();
                    c189328a9.A0M = address.getLocality();
                    c189328a9.A0N = address.getSubAdminArea();
                    c189328a9.A0I = address.getAdminArea();
                    c189328a9.A0J = address.getCountryName();
                    return true;
                } catch (IOException e) {
                    C0K8.A0F("LocationFeatureScanner", "geocoding failed", e);
                    return false;
                } catch (IllegalArgumentException e2) {
                    C0K8.A0F("LocationFeatureScanner", "invalid arguments passed to geocoder latlng.", e2);
                    return true;
                } catch (Exception e3) {
                    C0K8.A0F("LocationFeatureScanner", "geocoding failed", e3);
                    C0w9.A07("LocationFeatureScanner#exception", e3);
                    return true;
                }
            }
        }
        return false;
    }

    public AjO(Context context) {
        this.A01 = context;
        this.A02 = new Geocoder(context);
        ContentResolver contentResolver = context.getContentResolver();
        C14360o3.A07(contentResolver);
        this.A00 = contentResolver;
    }
}
