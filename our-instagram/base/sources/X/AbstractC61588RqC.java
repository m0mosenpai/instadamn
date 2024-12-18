package X;

import android.location.Location;
import com.google.android.gms.location.LocationResult;
import com.instagram.direct.locationsharing.service.DirectLiveLocationService;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.RqC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61588RqC {
    public void A00(LocationResult locationResult) {
        List list;
        int size;
        Location location;
        C60728ROm c60728ROm = (C60728ROm) this;
        if (locationResult != null && (size = (list = locationResult.A00).size()) != 0 && (location = (Location) list.get(size - 1)) != null) {
            HashSet A1H = AbstractC166987dD.A1H();
            int i = -1;
            int i2 = Integer.MIN_VALUE;
            long j = -1;
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            if (location.getTime() > 0) {
                j = (int) location.getTime();
            }
            if (location.hasAccuracy()) {
                i = (int) location.getAccuracy();
            }
            if (location.hasAltitude()) {
                i2 = (int) location.getAltitude();
            }
            com.facebook.locationsharing.core.models.Location location2 = new com.facebook.locationsharing.core.models.Location(A1H, latitude, longitude, i, i2, j);
            DirectLiveLocationService directLiveLocationService = c60728ROm.A00;
            SMM smm = directLiveLocationService.A02;
            if (smm == null) {
                C14360o3.A0F("repositoriesManager");
                throw C00O.createAndThrow();
            }
            Iterator A15 = AbstractC166997dE.A15(smm.A01);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                Object key = A1K.getKey();
                C7CY c7cy = (C7CY) A1K.getValue();
                C7CW c7cw = (C7CW) smm.A03.get(key);
                if (c7cw != null) {
                    C62537SFo c62537SFo = new C62537SFo(c7cw, location2, c7cy);
                    c62537SFo.A00.AYt(new C63928Sw3(2, new C63926Sw1(c7cw, c7cy, directLiveLocationService, smm), c62537SFo));
                }
            }
        }
    }
}
