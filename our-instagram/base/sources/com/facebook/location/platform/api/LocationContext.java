package com.facebook.location.platform.api;

import X.C63472SlD;
import android.os.Parcelable;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

/* loaded from: classes10.dex */
public class LocationContext extends AutoSafeParcelable {
    public static final String ACTIVITY_STATE_BIKING = "ActivityStateBiking";
    public static final String ACTIVITY_STATE_DRIVING = "ActivityStateDriving";
    public static final String ACTIVITY_STATE_RUNNING = "ActivityStateRunning";
    public static final String ACTIVITY_STATE_STILL = "ActivityStateStill";
    public static final String ACTIVITY_STATE_UNKNOWN = "ActivityStateUnknown";
    public static final String ACTIVITY_STATE_WALKING = "ActivityStateWalking";
    public static final String CONTEXT_STATE_AT_HOME = "ContextStateAtHome";
    public static final String CONTEXT_STATE_AT_PLACE = "ContextStateAtPlace";
    public static final String CONTEXT_STATE_AT_WORK = "ContextStateAtWork";
    public static final String CONTEXT_STATE_IN_TRANSIT = "ContextStateInTransit";
    public static final String CONTEXT_STATE_UNKNOWN = "ContextStateUnknown";
    public static final Parcelable.Creator CREATOR = C63472SlD.A00(LocationContext.class);

    @SafeParcelable.Field(4)
    public float mActivityConfidence;

    @SafeParcelable.Field(2)
    public float mContextConfidence;

    @SafeParcelable.Field(5)
    public Place mPlace;

    @SafeParcelable.Field(6)
    public float mPlaceConfidence;

    @SafeParcelable.Field(7)
    public long mStartTime;

    @SafeParcelable.Field(1)
    public String mContextState = CONTEXT_STATE_UNKNOWN;

    @SafeParcelable.Field(3)
    public String mActivityState = ACTIVITY_STATE_UNKNOWN;

    public float getActivityConfidence() {
        return this.mActivityConfidence;
    }

    public String getActivityState() {
        return this.mActivityState;
    }

    public float getContextConfidence() {
        return this.mContextConfidence;
    }

    public String getContextState() {
        return this.mContextState;
    }

    public Place getPlace() {
        return this.mPlace;
    }

    public float getPlaceConfidence() {
        return this.mPlaceConfidence;
    }

    public long getStartTime() {
        return this.mStartTime;
    }

    public void setActivityConfidence(float f) {
        this.mActivityConfidence = f;
    }

    public void setActivityState(String str) {
        this.mActivityState = str;
    }

    public void setContextConfidence(float f) {
        this.mContextConfidence = f;
    }

    public void setContextState(String str) {
        this.mContextState = str;
    }

    public void setPlace(Place place) {
        this.mPlace = place;
    }

    public void setPlaceConfidence(float f) {
        this.mPlaceConfidence = f;
    }

    public void setStartTime(long j) {
        this.mStartTime = j;
    }
}
