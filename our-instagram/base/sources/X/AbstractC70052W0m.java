package X;

import com.facebook.android.maps.StaticMapView$StaticMapOptions;
import com.instagram.maps.ui.IgStaticMapView;
import com.instagram.model.venue.Venue;

/* renamed from: X.W0m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70052W0m {
    public static final StaticMapView$StaticMapOptions A00 = new StaticMapView$StaticMapOptions("location_map_row");

    public static void A00(C68821Vcc c68821Vcc, C68827Vci c68827Vci, Venue venue) {
        if (venue != null && venue.A00() != null && venue.A01() != null) {
            double doubleValue = venue.A00().doubleValue();
            double doubleValue2 = venue.A01().doubleValue();
            StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = A00;
            staticMapView$StaticMapOptions.A00();
            staticMapView$StaticMapOptions.A03(14);
            if (venue.A00() != null && venue.A01() != null) {
                staticMapView$StaticMapOptions.A02(doubleValue, doubleValue2);
            }
            IgStaticMapView igStaticMapView = c68827Vci.A00;
            igStaticMapView.setEnabled(true);
            igStaticMapView.setMapOptions(staticMapView$StaticMapOptions);
            WNP.A00(igStaticMapView, 52, c68821Vcc, venue);
            return;
        }
        c68827Vci.A00.setEnabled(false);
    }
}
