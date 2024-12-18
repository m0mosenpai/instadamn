package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.facebook.react.modules.location.LocationModule;

/* renamed from: X.SkV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63452SkV implements LocationListener {
    public final /* synthetic */ LocationModule A00;

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    public C63452SkV(LocationModule locationModule) {
        this.A00 = locationModule;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        R3M reactApplicationContextIfActiveOrWarn = this.A00.getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.A0E("geolocationDidChange", LocationModule.locationToMap(location));
        }
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
        LocationModule locationModule;
        int i2;
        StringBuilder A11;
        String str2;
        if (i == 0) {
            locationModule = this.A00;
            i2 = 2;
            A11 = AbstractC166997dE.A11("Provider ");
            A11.append(str);
            str2 = " is out of service.";
        } else {
            if (i != 1) {
                return;
            }
            locationModule = this.A00;
            i2 = 3;
            A11 = AbstractC166997dE.A11("Provider ");
            A11.append(str);
            str2 = " is temporarily unavailable.";
        }
        locationModule.emitError(i2, AbstractC166997dE.A0x(str2, A11));
    }
}
