package X;

import android.content.Context;
import android.hardware.GeomagneticField;
import android.location.Geocoder;
import android.location.Location;
import com.facebook.cameracore.mediapipeline.dataproviders.location.implementation.LocationDataProviderImpl;
import com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationData;
import com.facebook.native_bridge.NativeDataPromise;
import com.facebook.proxygen.LigerSamplePolicy;

/* renamed from: X.Sei, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63183Sei {
    public static final C58516Pwk A0B = new C58516Pwk(null, C05F.A01, null, 10000L, 50.0f, 0.6666667f, 120000, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, false, false, false);
    public LocationDataProviderImpl A00;
    public InterfaceC65486Tl6 A01;
    public C58516Pwk A02 = A0B;
    public NativeDataPromise A03;
    public String A04;
    public boolean A05;
    public GeomagneticField A06;
    public final Context A07;
    public final Geocoder A08;
    public final C103774lw A09;
    public final AbstractC128665rZ A0A;

    public static LocationData A00(AbstractC63183Sei abstractC63183Sei, C103804lz c103804lz) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        long longValue;
        Float f;
        double d6 = 0.0d;
        if (c103804lz.A01() != null) {
            d = c103804lz.A01().floatValue();
        } else {
            d = 0.0d;
        }
        if (c103804lz.A00() != null) {
            d2 = c103804lz.A00().doubleValue();
        } else {
            d2 = 0.0d;
        }
        Location location = c103804lz.A00;
        if (location.hasVerticalAccuracy() && Float.valueOf(location.getVerticalAccuracyMeters()) != null) {
            Float f2 = null;
            if (location.hasVerticalAccuracy()) {
                f2 = Float.valueOf(location.getVerticalAccuracyMeters());
            }
            d3 = f2.floatValue();
        } else {
            d3 = 0.0d;
        }
        if (c103804lz.A02() != null) {
            d4 = c103804lz.A02().floatValue();
        } else {
            d4 = 0.0d;
        }
        if (location.hasBearing() && Float.valueOf(location.getBearingAccuracyDegrees()) != null) {
            if (location.hasBearing()) {
                f = Float.valueOf(location.getBearingAccuracyDegrees());
            } else {
                f = null;
            }
            d5 = f.floatValue();
        } else {
            d5 = 0.0d;
        }
        if (c103804lz.A03() == null) {
            longValue = 0;
        } else {
            longValue = c103804lz.A03().longValue();
        }
        GeomagneticField geomagneticField = abstractC63183Sei.A06;
        if (geomagneticField == null) {
            if (d > 0.0d) {
                geomagneticField = new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) d, longValue);
                abstractC63183Sei.A06 = geomagneticField;
            }
            return new LocationData(true, location.getLatitude(), location.getLongitude(), d, d2, d3, d4, d5, 0.0d, 0.0d + d6, 0.0d, d6, longValue / 1000.0d);
        }
        d6 = geomagneticField.getDeclination();
        return new LocationData(true, location.getLatitude(), location.getLongitude(), d, d2, d3, d4, d5, 0.0d, 0.0d + d6, 0.0d, d6, longValue / 1000.0d);
    }

    public final void A01() {
        if (this.A01 != null) {
            this.A0A.A06();
            this.A01 = null;
        }
    }

    public AbstractC63183Sei(Context context, C103774lw c103774lw, AbstractC128665rZ abstractC128665rZ) {
        this.A0A = abstractC128665rZ;
        this.A09 = c103774lw;
        this.A07 = context;
        this.A08 = new Geocoder(context);
    }
}
