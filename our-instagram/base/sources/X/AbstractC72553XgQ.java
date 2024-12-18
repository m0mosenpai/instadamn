package X;

import com.facebook.location.platform.api.Location;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.XgQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72553XgQ {
    public static void A00(C72810XnY c72810XnY, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        anonymousClass182.A0Q("base_station_id", c72810XnY.A00);
        if (c72810XnY.A08 != null) {
            anonymousClass182.A0r("base_station_coordinates");
            C72721Xlt c72721Xlt = c72810XnY.A08;
            anonymousClass182.A0d();
            anonymousClass182.A0O(Location.LATITUDE, c72721Xlt.A00);
            anonymousClass182.A0O("longitude", c72721Xlt.A01);
            anonymousClass182.A0a();
        }
        anonymousClass182.A0Q(TraceFieldType.NetworkID, c72810XnY.A06);
        anonymousClass182.A0Q("system_id", c72810XnY.A07);
        anonymousClass182.A0Q("cdma_rssi_dbm", c72810XnY.A02);
        anonymousClass182.A0Q("cdma_ecio_db10", c72810XnY.A01);
        anonymousClass182.A0Q("evdo_rssi_dbm", c72810XnY.A04);
        anonymousClass182.A0Q("evdo_ecio_db10", c72810XnY.A03);
        anonymousClass182.A0Q("evdo_signal_to_noise", c72810XnY.A05);
        anonymousClass182.A0a();
    }
}
