package com.facebook.location.platform.api;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC31171DnF;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC61284Rkv;
import X.AbstractC61285Rkw;
import X.AnonymousClass001;
import X.C00O;
import X.C63472SlD;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

/* loaded from: classes10.dex */
public class Location extends AutoSafeParcelable {
    public static final String ACCURACY = "accuracy";
    public static final String ALTITUDE = "altitude";
    public static final String ALTITUDE_ACCURACY = "altitudeAccuracy";
    public static final String BEARING = "bearing";
    public static final String BEARING_ACCURACY = "bearingAccuracy";
    public static final Parcelable.Creator CREATOR;
    public static final String EXTRAS = "extras";
    public static final Set EXTRAS_SERIALIZATION_KEYS;
    public static final String IS_MOCK_LOCATION = "isMockLocation";
    public static final String LATITUDE = "latitude";
    public static final String LOCATION_ELAPSEDTIME = "locationElapsedTime";
    public static final String LOCATION_TIMESTAMP = "locationTimestamp";
    public static final String LONGITUDE = "longtiude";
    public static final String PROVIDER = "provider";
    public static final String SPEED = "speed";
    public static final String SPEED_ACCURACY = "speedAccuracy";
    public static final String TAG = "Location";
    public static final Map sProviderMap;

    @SafeParcelable.Field(7)
    public final Float mAccuracy;

    @SafeParcelable.Field(4)
    public final Double mAltitude;

    @SafeParcelable.Field(8)
    public final Float mAltitudeAccuracy;

    @SafeParcelable.Field(9)
    public final Float mBearing;

    @SafeParcelable.Field(10)
    public final Float mBearingAccuracy;

    @SafeParcelable.Field(6)
    public final Long mElapsedRealtimeNanos;

    @SafeParcelable.Field(JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    public final Bundle mExtras;

    @SafeParcelable.Field(14)
    public final boolean mIsMockLocation;

    @SafeParcelable.Field(2)
    public final double mLatitude;

    @SafeParcelable.Field(3)
    public final double mLongitude;

    @SafeParcelable.Field(1)
    public final String mProvider;

    @SafeParcelable.Field(11)
    public final Float mSpeed;

    @SafeParcelable.Field(IgReactQEModule.CONFIG_KEY_OFFSET)
    public final Float mSpeedAccuracy;

    @SafeParcelable.Field(5)
    public final Long mTimestamp;

    public Location(Bundle bundle, Double d, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Long l, Long l2, String str, double d2, double d3, boolean z) {
        this.mProvider = str;
        this.mLatitude = d2;
        this.mLongitude = d3;
        this.mAltitude = d;
        this.mTimestamp = l2;
        this.mElapsedRealtimeNanos = l;
        this.mAccuracy = f;
        this.mAltitudeAccuracy = f2;
        this.mBearing = f3;
        this.mBearingAccuracy = f4;
        this.mSpeed = f5;
        this.mSpeedAccuracy = f6;
        this.mExtras = bundle;
        this.mIsMockLocation = z;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x009f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.location.platform.api.Location fromJSON(org.json.JSONObject r23) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.location.platform.api.Location.fromJSON(org.json.JSONObject):com.facebook.location.platform.api.Location");
    }

    public float getDistanceMeters(Location location) {
        float[] fArr = new float[1];
        android.location.Location.distanceBetween(this.mLatitude, this.mLongitude, location.mLatitude, location.mLongitude, fArr);
        return fArr[0];
    }

    private boolean hasAccuracy() {
        return AbstractC167007dF.A1W(this.mAccuracy);
    }

    private String makeString(String str, Number number) {
        if (number == null) {
            return "";
        }
        return AnonymousClass001.A0u(", ", str, InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, number.toString());
    }

    public Float getAccuracy() {
        return this.mAccuracy;
    }

    public Double getAltitude() {
        return this.mAltitude;
    }

    public Float getAltitudeAccuracy() {
        return this.mAltitudeAccuracy;
    }

    public Float getBearing() {
        return this.mBearing;
    }

    public Float getBearingAccuracy() {
        return this.mBearingAccuracy;
    }

    public Long getElapsedRealtimeNanos() {
        return this.mElapsedRealtimeNanos;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public double getLatitude() {
        return this.mLatitude;
    }

    public double getLongitude() {
        return this.mLongitude;
    }

    public String getProvider() {
        return this.mProvider;
    }

    public Float getSpeed() {
        return this.mSpeed;
    }

    public Float getSpeedAccuracy() {
        return this.mSpeedAccuracy;
    }

    public Long getTimestamp() {
        return this.mTimestamp;
    }

    public String getUnderlyingProvider() {
        String string;
        Bundle bundle = this.mExtras;
        if (bundle != null && (string = bundle.getString("UNDERLYING_PROVIDER")) != null) {
            return string;
        }
        return this.mProvider;
    }

    public boolean isComplete() {
        Long l;
        Long l2;
        if (this.mProvider != null && AbstractC167007dF.A1W(this.mAccuracy) && (l = this.mTimestamp) != null && l.longValue() != 0 && (l2 = this.mElapsedRealtimeNanos) != null && l2.longValue() != 0) {
            return true;
        }
        return false;
    }

    public boolean isMockLocation() {
        return this.mIsMockLocation;
    }

    public Float optAccuracy(float f) {
        Float f2 = this.mAccuracy;
        if (f2 != null) {
            f = f2.floatValue();
        }
        return Float.valueOf(f);
    }

    public Double optAltitude(double d) {
        Double d2 = this.mAltitude;
        if (d2 != null) {
            d = d2.doubleValue();
        }
        return Double.valueOf(d);
    }

    public Float optAltitudeAccuracy(float f) {
        Float f2 = this.mAltitudeAccuracy;
        if (f2 != null) {
            f = f2.floatValue();
        }
        return Float.valueOf(f);
    }

    public Float optBearing(float f) {
        Float f2 = this.mBearing;
        if (f2 != null) {
            f = f2.floatValue();
        }
        return Float.valueOf(f);
    }

    public Float optBearingAccuracy(float f) {
        Float f2 = this.mBearingAccuracy;
        if (f2 != null) {
            f = f2.floatValue();
        }
        return Float.valueOf(f);
    }

    public Long optElapsedRealtimeNano(long j) {
        Long l = this.mElapsedRealtimeNanos;
        if (l != null) {
            j = l.longValue();
        }
        return Long.valueOf(j);
    }

    public Bundle optExtras() {
        Bundle bundle = this.mExtras;
        if (bundle == null) {
            return AbstractC166987dD.A0b();
        }
        return bundle;
    }

    public Float optSpeed(float f) {
        Float f2 = this.mSpeed;
        if (f2 != null) {
            f = f2.floatValue();
        }
        return Float.valueOf(f);
    }

    public Float optSpeedAccuracy(float f) {
        Float f2 = this.mSpeedAccuracy;
        if (f2 != null) {
            f = f2.floatValue();
        }
        return Float.valueOf(f);
    }

    public Long optTimestamp(long j) {
        Long l = this.mTimestamp;
        if (l != null) {
            j = l.longValue();
        }
        return Long.valueOf(j);
    }

    public android.location.Location toAndroidLocation(String str) {
        long longValue;
        android.location.Location location = new android.location.Location(str);
        location.setLatitude(this.mLatitude);
        location.setLongitude(this.mLongitude);
        Double d = this.mAltitude;
        if (d != null) {
            location.setAltitude(d.doubleValue());
        }
        Long l = this.mTimestamp;
        long j = 0;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        location.setTime(longValue);
        Float f = this.mAccuracy;
        if (f != null) {
            location.setAccuracy(f.floatValue());
        }
        Float f2 = this.mBearing;
        if (f2 != null) {
            location.setBearing(f2.floatValue());
        }
        Float f3 = this.mSpeed;
        if (f3 != null) {
            location.setSpeed(f3.floatValue());
        }
        Long l2 = this.mElapsedRealtimeNanos;
        if (l2 != null) {
            j = l2.longValue();
        }
        location.setElapsedRealtimeNanos(j);
        Float f4 = this.mSpeedAccuracy;
        if (f4 != null) {
            location.setSpeedAccuracyMetersPerSecond(f4.floatValue());
        }
        Float f5 = this.mBearingAccuracy;
        if (f5 != null) {
            location.setBearingAccuracyDegrees(f5.floatValue());
        }
        Float f6 = this.mAltitudeAccuracy;
        if (f6 != null) {
            location.setVerticalAccuracyMeters(f6.floatValue());
        }
        Bundle bundle = this.mExtras;
        if (bundle != null) {
            location.setExtras(bundle);
        }
        return location;
    }

    static {
        HashMap A1G = AbstractC166987dD.A1G();
        sProviderMap = A1G;
        EXTRAS_SERIALIZATION_KEYS = AbstractC58319PtB.A13(new String[]{"UNDERLYING_PROVIDER", "EXTRA_SUBSCRIPTION_UUID", "LOCATION_UUID", "IS_CACHED"});
        A1G.put("stub", "network");
        A1G.put("wps", "network");
        A1G.put("wps_zero_power", "network");
        CREATOR = C63472SlD.A00(Location.class);
    }

    public /* synthetic */ Location(AbstractC61285Rkw abstractC61285Rkw, AbstractC61284Rkv abstractC61284Rkv) {
        this(abstractC61285Rkw);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.location.platform.api.Location fromLocation(android.content.Context r23, android.location.Location r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.location.platform.api.Location.fromLocation(android.content.Context, android.location.Location, java.lang.String):com.facebook.location.platform.api.Location");
    }

    public JSONObject toJSON() {
        JSONObject A0q = AbstractC31171DnF.A0q();
        A0q.put("provider", this.mProvider);
        double d = this.mLatitude;
        double d2 = 0.0d;
        if (Double.isNaN(d)) {
            d = 0.0d;
        }
        A0q.put(LATITUDE, d);
        double d3 = this.mLongitude;
        if (!Double.isNaN(d3)) {
            d2 = d3;
        }
        A0q.put(LONGITUDE, d2);
        Double d4 = this.mAltitude;
        if (d4 != null && !d4.isNaN()) {
            A0q.put(ALTITUDE, this.mAltitude);
        }
        Float f = this.mAccuracy;
        if (f != null && !f.isNaN()) {
            A0q.put(ACCURACY, this.mAccuracy);
        }
        Float f2 = this.mAltitudeAccuracy;
        if (f2 != null && !f2.isNaN()) {
            A0q.put(ALTITUDE_ACCURACY, this.mAltitudeAccuracy);
        }
        Float f3 = this.mBearing;
        if (f3 != null && !f3.isNaN()) {
            A0q.put(BEARING, this.mBearing);
        }
        Float f4 = this.mBearingAccuracy;
        if (f4 != null && !f4.isNaN()) {
            A0q.put(BEARING_ACCURACY, this.mBearingAccuracy);
        }
        Float f5 = this.mSpeed;
        if (f5 != null && !f5.isNaN()) {
            A0q.put(SPEED, this.mSpeed);
        }
        Float f6 = this.mSpeedAccuracy;
        if (f6 != null && !f6.isNaN()) {
            A0q.put(SPEED_ACCURACY, this.mSpeedAccuracy);
        }
        A0q.put(LOCATION_TIMESTAMP, this.mTimestamp);
        A0q.put(LOCATION_ELAPSEDTIME, this.mElapsedRealtimeNanos);
        A0q.put(IS_MOCK_LOCATION, this.mIsMockLocation);
        Bundle bundle = this.mExtras;
        if (bundle != null) {
            JSONObject A0q2 = AbstractC31171DnF.A0q();
            Iterator it = EXTRAS_SERIALIZATION_KEYS.iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                if (bundle.containsKey(A1B)) {
                    A0q2.put(A1B, bundle.get(A1B));
                }
            }
            A0q.put(EXTRAS, A0q2);
        }
        return A0q;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Location{mProvider=");
        A1C.append(this.mProvider);
        A1C.append(", mTimestamp=");
        A1C.append(this.mTimestamp);
        A1C.append(", mElapsedRealtimeNanos=");
        A1C.append(this.mElapsedRealtimeNanos);
        A1C.append(", mAccuracy=");
        A1C.append(this.mAccuracy);
        A1C.append(makeString("mAltitudeAccuracy", this.mAltitudeAccuracy));
        A1C.append(makeString("mBearing", this.mBearing));
        A1C.append(makeString("mBearingAccuracy", this.mBearingAccuracy));
        A1C.append(makeString("mSpeed", this.mSpeed));
        A1C.append(makeString("mSpeedAccuracy", this.mSpeedAccuracy));
        A1C.append(", mExtras=");
        A1C.append(this.mExtras);
        A1C.append(", mIsMockLocation=");
        A1C.append(this.mIsMockLocation);
        A1C.append(", underlyingProvider=");
        A1C.append(getUnderlyingProvider());
        return AbstractC167027dH.A0R(A1C);
    }

    public Location(AbstractC61285Rkw abstractC61285Rkw) {
        throw AbstractC166987dD.A15("mProvider");
    }

    public static Location fromJSON(String str) {
        try {
            return fromJSON(AbstractC58318PtA.A17(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public Float optAccuracy() {
        return optAccuracy(0.0f);
    }

    public Double optAltitude() {
        return optAltitude(0.0d);
    }

    public Float optAltitudeAccuracy() {
        return optAltitudeAccuracy(0.0f);
    }

    public Float optBearing() {
        return optBearing(0.0f);
    }

    public Float optBearingAccuracy() {
        return optBearingAccuracy(0.0f);
    }

    public Long optElapsedRealtimeNano() {
        return optElapsedRealtimeNano(0L);
    }

    public Float optSpeed() {
        return optSpeed(0.0f);
    }

    public Float optSpeedAccuracy() {
        return optSpeedAccuracy(0.0f);
    }

    public Long optTimestamp() {
        return optTimestamp(0L);
    }

    public android.location.Location toAndroidLocation() {
        String A1A;
        Map map = sProviderMap;
        if (map.get(getUnderlyingProvider()) == null) {
            A1A = getUnderlyingProvider();
        } else {
            A1A = AbstractC166987dD.A1A(getUnderlyingProvider(), map);
        }
        if (A1A == null) {
            A1A = "fused";
        }
        return toAndroidLocation(A1A);
    }

    public Location() {
        this.mProvider = null;
        this.mLatitude = 0.0d;
        this.mLongitude = 0.0d;
        this.mAltitude = null;
        this.mTimestamp = null;
        this.mElapsedRealtimeNanos = null;
        this.mAccuracy = null;
        this.mAltitudeAccuracy = null;
        this.mBearing = null;
        this.mBearingAccuracy = null;
        this.mSpeed = null;
        this.mSpeedAccuracy = null;
        this.mExtras = null;
        this.mIsMockLocation = false;
    }
}
