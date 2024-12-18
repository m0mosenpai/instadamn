package com.facebook.location.platform.api;

import X.AbstractC166987dD;
import X.AbstractC25236BEt;
import X.AbstractC31171DnF;
import X.AbstractC31177DnL;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC61288Rkz;
import X.C63472SlD;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import org.json.JSONObject;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

/* loaded from: classes10.dex */
public class LocationRequest extends AutoSafeParcelable {
    public static final String BATCH_DURATION_SECONDS = "batchDurationSeconds";
    public static final Parcelable.Creator CREATOR = C63472SlD.A00(LocationRequest.class);
    public static final String DESIRED_ACCURACY = "desiredAccuracy";
    public static final String DESIRED_INTERVAL = "desiredInterval";
    public static final String EXTRA_PARAMS = "extraParams";
    public static final String IS_OPPORTUNISTIC = "isOpportunistic";
    public static final String MAX_DURATION = "maximumDuration";
    public static final String MAX_INTERVAL = "maxInterval";
    public static final String MAX_POWER_USE = "maxPowerUse";
    public static final String MIN_DISPLACEMENT = "desiredSmallestDistance";
    public static final String NUM_LOCATIONS = "numberOfLocations";
    public static final int NUM_LOCATIONS_UNLIMITED = Integer.MAX_VALUE;
    public static final String PROVIDER = "provider";

    @SafeParcelable.Field(9)
    public final int mBatchDurationSec;

    @SafeParcelable.Field(1)
    public final int mDesiredAccuracy;

    @SafeParcelable.Field(5)
    public final int mDesiredIntervalSec;

    @SafeParcelable.Field(6)
    public final int mDesiredSmallestDistanceMeters;

    @SafeParcelable.Field(11)
    public final Bundle mExtraParams;

    @SafeParcelable.Field(4)
    public boolean mIsOpportunistic;

    @SafeParcelable.Field(7)
    public final long mMaxDurationSec;

    @SafeParcelable.Field(10)
    public final int mMaxIntervalSec;

    @SafeParcelable.Field(2)
    public final int mMaxPowerUse;

    @SafeParcelable.Field(8)
    public final int mNumLocations;

    @SafeParcelable.Field(3)
    public final String mProvider;

    public LocationRequest(Bundle bundle, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, boolean z) {
        this.mDesiredAccuracy = i2;
        this.mMaxPowerUse = i6;
        this.mProvider = str;
        this.mIsOpportunistic = z;
        this.mDesiredIntervalSec = i3;
        this.mDesiredSmallestDistanceMeters = i4;
        this.mMaxDurationSec = j;
        this.mNumLocations = i7;
        this.mBatchDurationSec = i;
        this.mMaxIntervalSec = i5;
        this.mExtraParams = bundle;
    }

    public void setStartTime() {
    }

    public static LocationRequest fromJSON(JSONObject jSONObject) {
        int optInt = jSONObject.optInt(DESIRED_ACCURACY, 2);
        int optInt2 = jSONObject.optInt(MAX_POWER_USE, 2);
        String optString = jSONObject.optString("provider", "");
        boolean optBoolean = jSONObject.optBoolean(IS_OPPORTUNISTIC, false);
        int optInt3 = jSONObject.optInt(DESIRED_INTERVAL, 0);
        int optInt4 = jSONObject.optInt(MIN_DISPLACEMENT, 0);
        int optInt5 = jSONObject.optInt(MAX_DURATION, 0);
        int optInt6 = jSONObject.optInt(NUM_LOCATIONS, 0);
        int optInt7 = jSONObject.optInt(BATCH_DURATION_SECONDS, 0);
        int optInt8 = jSONObject.optInt(MAX_INTERVAL, 0);
        JSONObject optJSONObject = jSONObject.optJSONObject(EXTRA_PARAMS);
        Bundle bundle = null;
        long j = optInt5;
        if (optJSONObject != null) {
            bundle = AbstractC166987dD.A0b();
            bundle.putString("PROVIDER", optJSONObject.optString("PROVIDER"));
        }
        if (optInt8 < optInt3 && optInt8 != -1) {
            Log.w("Builder", "Max Interval was set to value less than Desired Interval. Setting to default -1.");
            optInt8 = -1;
        }
        if (optString != null && !optString.equals("fused")) {
            if (bundle == null) {
                bundle = AbstractC166987dD.A0b();
            }
            bundle.putString("PROVIDER", optString);
            optString = "fused";
        }
        if (optInt7 < optInt3) {
            optInt7 = optInt3;
        }
        return new LocationRequest(bundle, optString, optInt7, optInt, optInt3, optInt4, optInt8, optInt2, optInt6, j, optBoolean);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        if (r0 != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            if (r6 != r7) goto L4
            r0 = 1
            return r0
        L4:
            r5 = 0
            if (r7 == 0) goto L53
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r0 = r7.getClass()
            if (r1 != r0) goto L53
            com.facebook.location.platform.api.LocationRequest r7 = (com.facebook.location.platform.api.LocationRequest) r7
            boolean r1 = r6.mIsOpportunistic
            boolean r0 = r7.mIsOpportunistic
            if (r1 != r0) goto L53
            int r1 = r6.mDesiredIntervalSec
            int r0 = r7.mDesiredIntervalSec
            if (r1 != r0) goto L53
            int r1 = r6.mDesiredSmallestDistanceMeters
            int r0 = r7.mDesiredSmallestDistanceMeters
            if (r1 != r0) goto L53
            long r3 = r6.mMaxDurationSec
            long r1 = r7.mMaxDurationSec
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L53
            int r1 = r6.mNumLocations
            int r0 = r7.mNumLocations
            if (r1 != r0) goto L53
            int r1 = r6.mDesiredAccuracy
            int r0 = r7.mDesiredAccuracy
            if (r1 != r0) goto L53
            int r1 = r6.mMaxPowerUse
            int r0 = r7.mMaxPowerUse
            if (r1 != r0) goto L53
            int r1 = r6.mMaxIntervalSec
            int r0 = r7.mMaxIntervalSec
            if (r1 != r0) goto L53
            int r1 = r6.mBatchDurationSec
            int r0 = r7.mBatchDurationSec
            if (r1 != r0) goto L53
            android.os.Bundle r1 = r6.mExtraParams
            android.os.Bundle r0 = r7.mExtraParams
            if (r1 != 0) goto L54
            if (r0 == 0) goto L7c
        L53:
            return r5
        L54:
            if (r0 == 0) goto L53
            java.util.Iterator r3 = X.AbstractC58319PtB.A14(r1)
        L5a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7c
            java.lang.String r2 = X.AbstractC166987dD.A1B(r3)
            android.os.Bundle r0 = r6.mExtraParams
            java.lang.Object r1 = r0.get(r2)
            android.os.Bundle r0 = r7.mExtraParams
            java.lang.Object r0 = r0.get(r2)
            if (r1 != 0) goto L75
            if (r0 == 0) goto L5a
            return r5
        L75:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5a
            return r5
        L7c:
            java.lang.String r1 = r6.mProvider
            java.lang.String r0 = r7.mProvider
            boolean r0 = r1.equals(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.location.platform.api.LocationRequest.equals(java.lang.Object):boolean");
    }

    public int getBatchDurationSec() {
        return this.mBatchDurationSec;
    }

    public int getDesiredAccuracy() {
        return this.mDesiredAccuracy;
    }

    public int getDesiredIntervalSec() {
        return this.mDesiredIntervalSec;
    }

    public int getDesiredSmallestDistanceMeters() {
        return this.mDesiredSmallestDistanceMeters;
    }

    public Bundle getExtraParams() {
        return this.mExtraParams;
    }

    public long getMaxDurationSec() {
        return this.mMaxDurationSec;
    }

    public int getMaxIntervalSec() {
        return this.mMaxIntervalSec;
    }

    public int getMaxPowerUse() {
        return this.mMaxPowerUse;
    }

    public int getNumLocations() {
        return this.mNumLocations;
    }

    public String getProvider() {
        return this.mProvider;
    }

    public int hashCode() {
        int i = 0;
        int A01 = (((AbstractC25236BEt.A01(this.mMaxDurationSec, ((((((((((this.mDesiredAccuracy * 331) + this.mMaxPowerUse) * 31) + AbstractC31177DnL.A04(this.mProvider)) * 31) + (this.mIsOpportunistic ? 1 : 0)) * 31) + this.mDesiredIntervalSec) * 31) + this.mDesiredSmallestDistanceMeters) * 31) + this.mNumLocations) * 31) + this.mMaxIntervalSec) * 31;
        Bundle bundle = this.mExtraParams;
        if (bundle != null) {
            i = bundle.hashCode();
        }
        return A01 + i;
    }

    public boolean isOpportunistic() {
        return this.mIsOpportunistic;
    }

    public JSONObject toJSON() {
        JSONObject A0q = AbstractC31171DnF.A0q();
        A0q.put(DESIRED_ACCURACY, this.mDesiredAccuracy);
        A0q.put(MAX_POWER_USE, this.mMaxPowerUse);
        A0q.put("provider", this.mProvider);
        A0q.put(IS_OPPORTUNISTIC, this.mIsOpportunistic);
        A0q.put(DESIRED_INTERVAL, this.mDesiredIntervalSec);
        A0q.put(MIN_DISPLACEMENT, this.mDesiredSmallestDistanceMeters);
        A0q.put(MAX_DURATION, this.mMaxDurationSec);
        A0q.put(NUM_LOCATIONS, this.mNumLocations);
        A0q.put(BATCH_DURATION_SECONDS, this.mBatchDurationSec);
        A0q.put(MAX_INTERVAL, this.mMaxIntervalSec);
        A0q.put(EXTRA_PARAMS, this.mExtraParams);
        return A0q;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LocationRequest{mDesiredAccuracy=");
        A1C.append(this.mDesiredAccuracy);
        A1C.append(", mMaxPowerUse=");
        A1C.append(this.mMaxPowerUse);
        A1C.append(", mProvider='");
        AbstractC58319PtB.A1K(A1C, this.mProvider);
        A1C.append(", mIsOpportunistic=");
        A1C.append(this.mIsOpportunistic);
        A1C.append(", mDesiredIntervalSec=");
        A1C.append(this.mDesiredIntervalSec);
        A1C.append(", mDesiredSmallestDistanceMeters=");
        A1C.append(this.mDesiredSmallestDistanceMeters);
        A1C.append(", mMaxDurationSec=");
        A1C.append(this.mMaxDurationSec);
        A1C.append(", mNumLocations=");
        A1C.append(this.mNumLocations);
        A1C.append(", mBatchDurationSec=");
        A1C.append(this.mBatchDurationSec);
        A1C.append(", mMaxIntervalSec=");
        A1C.append(this.mMaxIntervalSec);
        A1C.append(", mExtraParams=");
        return AbstractC58320PtC.A11(this.mExtraParams, A1C);
    }

    public LocationRequest(AbstractC61288Rkz abstractC61288Rkz) {
        this.mDesiredAccuracy = 1;
        this.mMaxPowerUse = 1;
        this.mProvider = "fused";
        this.mIsOpportunistic = false;
        this.mDesiredIntervalSec = 1;
        this.mDesiredSmallestDistanceMeters = 0;
        this.mMaxDurationSec = 0L;
        this.mNumLocations = 1;
        this.mBatchDurationSec = 0;
        this.mMaxIntervalSec = -1;
        this.mExtraParams = null;
    }

    public LocationRequest() {
        this.mDesiredAccuracy = 2;
        this.mMaxPowerUse = 1;
        this.mProvider = null;
        this.mIsOpportunistic = false;
        this.mDesiredIntervalSec = 0;
        this.mDesiredSmallestDistanceMeters = 0;
        this.mMaxDurationSec = 0L;
        this.mNumLocations = 0;
        this.mBatchDurationSec = 0;
        this.mMaxIntervalSec = -1;
        this.mExtraParams = null;
    }
}
