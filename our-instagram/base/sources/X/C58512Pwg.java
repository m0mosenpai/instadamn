package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: X.Pwg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58512Pwg implements LocationListener {
    public final /* synthetic */ C58465Pvq A00;

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        C14360o3.A0B(location, 0);
        C58465Pvq c58465Pvq = this.A00;
        C103804lz A00 = AbstractC128665rZ.A00(location);
        if (A00 != null) {
            c58465Pvq.A0C(A00);
            String str = ((AbstractC128665rZ) c58465Pvq).A04;
            String str2 = c58465Pvq.A01;
            c58465Pvq.A0D.A00(false, Long.valueOf(c58465Pvq.A04(A00)), "AndroidPlatformFbLocationManager", "onLocationChanged", str, str2, "AndroidPlatformLocationProvider");
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public C58512Pwg(C58465Pvq c58465Pvq) {
        this.A00 = c58465Pvq;
    }
}
