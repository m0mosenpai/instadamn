package com.facebook.location.platform.api;

import X.AbstractC167007dF;
import X.AbstractC31171DnF;
import X.C63472SlD;
import X.MSV;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcelable;
import android.util.Log;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

/* loaded from: classes10.dex */
public class LocationSettingsStatus extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63472SlD.A00(LocationSettingsStatus.class);
    public static final String TAG = "LocationSettingsStatus";

    @SafeParcelable.Field(2)
    public PendingIntent mResolutionIntent;

    @SafeParcelable.Field(1)
    public int mStatusCode;

    public PendingIntent getResolutionIntent() {
        return this.mResolutionIntent;
    }

    public int getStatusCode() {
        return this.mStatusCode;
    }

    public boolean isResolvableError() {
        return AbstractC167007dF.A1W(this.mResolutionIntent);
    }

    public void startResolutionIntent(Activity activity, int i) {
        PendingIntent pendingIntent = this.mResolutionIntent;
        if (pendingIntent != null) {
            try {
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, AbstractC31171DnF.A04(), 0, 0, 0);
            } catch (IntentSender.SendIntentException e) {
                Log.e(TAG, MSV.A00(343), e);
            }
        }
    }

    public LocationSettingsStatus(int i, PendingIntent pendingIntent) {
        this.mStatusCode = i;
        this.mResolutionIntent = pendingIntent;
    }

    public LocationSettingsStatus(int i) {
        this(i, null);
    }

    public LocationSettingsStatus() {
    }
}
